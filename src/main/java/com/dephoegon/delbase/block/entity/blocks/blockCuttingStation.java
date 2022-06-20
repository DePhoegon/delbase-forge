package com.dephoegon.delbase.block.entity.blocks;

import com.dephoegon.delbase.aid.config.commonConfig;
import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static com.dephoegon.delbase.aid.recipe.TierRandomDropAid.*;
import static com.dephoegon.delbase.aid.recipe.countAid.armorScrapAid;
import static com.dephoegon.delbase.aid.recipe.countAid.bonusScrapAid;
import static com.dephoegon.delbase.item.blockCutterPlans.*;
import static net.minecraft.world.item.Items.*;

public class blockCuttingStation extends BlockEntity implements MenuProvider {
    public static final int outputSlot = 0;
    public static final int inputSlot = 2;
    public static final int planSlot = 1;
    public static final int blockCuttingStationSlotCount = 3;
    public static ItemStackHandler iHandler = null;
    private final ItemStackHandler itemHandler = new ItemStackHandler(blockCuttingStationSlotCount) {
        @Override
        protected void onContentsChanged(int slot) {
            iHandler = itemHandler;
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = commonConfig.BLOCK_CUTTING_STATION_CRAFT_TIME.get();
    public blockCuttingStation(BlockPos pWorldPosition, BlockState pBlockState) {
        super(blockEntities.BLOCK_CUTTING_STATION_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> blockCuttingStation.this.progress;
                    case 1 -> blockCuttingStation.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> blockCuttingStation.this.progress = pValue;
                    case 1 -> blockCuttingStation.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }
    @Override
    public @NotNull Component getDisplayName() {
        return new TextComponent("Block Cutting Station");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pInventory, @NotNull Player pPlayer) {
        return new blockCuttingStationMenu(pContainerId, pInventory,this, this.data);
    }

    @SuppressWarnings("NullableProblems")
    @Nullable
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);

    }
    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }
    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }
    @Override
    protected void saveAdditional(CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("block_cutting_station.progress", progress);
        super.saveAdditional(tag);
    }
    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("block_cutting_station.progress");
    }

    public void drops(){
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i =0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        assert this.level != null;
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, blockCuttingStation pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }
    private static boolean hasRecipe(@NotNull blockCuttingStation entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i =0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }
        assert level != null;
        Optional<blockCuttingStationRecipes> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);
        if (match.isPresent()){
            Item planSlotItem;
            if (entity.itemHandler.getStackInSlot(planSlot).isEmpty()) { return false; } else { planSlotItem = entity.itemHandler.getStackInSlot(planSlot).getItem(); }
            int count = 0;
            ItemStack resultItem = match.get().getResultItem();
            Item inputItem = entity.itemHandler.getStackInSlot(inputSlot).getItem();
            if (resultItem.getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) {
                    count = 1;
                    if (planSlotItem != SLAB_PLANS.get().asItem()) { return false; }
                }
                if (tOutput.getBlock() instanceof WallBlock && planSlotItem != WALL_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof StairBlock && planSlotItem != STAIR_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceBlock && planSlotItem != FENCE_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceGateBlock && planSlotItem != FENCE_GATE_PLANS.get().asItem()) {
                    return false;
                }
            } // Just because I like to enforce plan usage.
            if (inputItem instanceof ArmorItem counter) { count = armorScrapAid(counter)-1; }
            if (inputItem instanceof HorseArmorItem) { count = 4; }
            // Counting Aids
            return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
        } else return false;
    }
    // hasRecipe for checking for if an item is in a slot or not.

    private static void craftItem(@NotNull blockCuttingStation entity) {
        Level level = entity.level;
        BlockPos worldPosition = entity.worldPosition;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        assert level != null;
        Optional<blockCuttingStationRecipes> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            String keyString = "none";
            boolean skipOutputSlot = false;
            int count = 1;
            if (entity.itemHandler.getStackInSlot(planSlot).getItem() == ARMOR_COMPOUND.get().asItem()) {
                boolean skipCompoundEat = false;
                if (entity.itemHandler.getStackInSlot(inputSlot).getItem() instanceof ArmorItem recycle) {
                    count = armorScrapAid(recycle);
                    if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                        int bonusCount = bonusScrapAid(recycle);
                        SimpleContainer bonus = new SimpleContainer(bonusCount);
                        for (int i = 0; i < bonusCount; i++) {
                            bonus.setItem(i, DIAMOND.getDefaultInstance());
                        }
                        Containers.dropContents(level, worldPosition, bonus);
                    }
                }
                if (entity.itemHandler.getStackInSlot(inputSlot).getItem() instanceof HorseArmorItem) { count = 5; }
                if (entity.itemHandler.getStackInSlot(inputSlot).getItem() instanceof TieredItem tieredItem) {
                    if (tieredItem.getTier() == Tiers.STONE) {
                        skipOutputSlot = true;
                        skipCompoundEat = true;
                        keyString = "stone";
                    }
                    if (tieredItem.getTier() == Tiers.WOOD) {
                        skipOutputSlot = true;
                        skipCompoundEat = true;
                        keyString = "wood";
                    }
                    if (tieredItem.getTier() == Tiers.NETHERITE && !(entity.itemHandler.getStackInSlot(inputSlot).getItem() instanceof ArmorItem)) {
                        skipOutputSlot = true;
                        skipCompoundEat = false;
                        keyString = "netherite";
                    }
                    //Special Behaviors for the Tiers of items
                }
                if (!(skipCompoundEat)){
                    entity.itemHandler.extractItem(planSlot, 1, false);
                }
            }
            entity.itemHandler.extractItem(inputSlot, 1, false);
            if (match.get().getResultItem().getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) { count = 2; }
            }
            if (skipOutputSlot) {
                int returnSize = 2;
                SimpleContainer stone = null;
                if (keyString.equals("stone")) {
                    stone = stoneContainer(returnSize);
                    //stone confetti
                }
                if (keyString.equals("wood")){
                    stone = woodContainer(returnSize);
                    //wooden confetti
                }
                if (keyString.equals("netherite")) {
                    stone = netheriteToolsBonus();
                    entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(match.get().getResultItem().getItem(),
                            entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
                    //put into the slot, as Netherite is a high tier. diamond still allowed pop out like confetti.
                }
                Containers.dropContents(level, worldPosition, stone);
            } else {
                entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(match.get().getResultItem().getItem(),
                        entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
            }
            entity.resetProgress();
        }
    }
    private void resetProgress() {
        this.progress = 0;
    }
    private static boolean canInsertItemIntoOutputSlot(@NotNull SimpleContainer inventory, @NotNull ItemStack output) {
        return inventory.getItem(blockCuttingStation.outputSlot).getItem() == output.getItem() || inventory.getItem(blockCuttingStation.outputSlot).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(@NotNull SimpleContainer inventory, int variableOut) {
        return inventory.getItem(blockCuttingStation.outputSlot).getMaxStackSize() > inventory.getItem(blockCuttingStation.outputSlot).getCount()+variableOut;
    }
}
