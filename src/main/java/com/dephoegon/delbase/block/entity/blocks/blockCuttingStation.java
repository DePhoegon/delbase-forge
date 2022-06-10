package com.dephoegon.delbase.block.entity.blocks;

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
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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

import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class blockCuttingStation extends BlockEntity implements MenuProvider {
    public static final int blockCuttingStationSlotCount = 3;
    private final ItemStackHandler itemHandler = new ItemStackHandler(blockCuttingStationSlotCount) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;
    public blockCuttingStation(BlockPos pWorldPosition, BlockState pBlockState) {
        super(blockEntities.BLOCK_CUTTING_STATION_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                switch (index) {
                    case 0: return blockCuttingStation.this.progress;
                    case 1: return blockCuttingStation.this.maxProgress;
                    default: return 0;
                }
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0: blockCuttingStation.this.progress = pValue; break;
                    case 1: blockCuttingStation.this.maxProgress = pValue; break;
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
    private static boolean hasRecipe(blockCuttingStation entity) {
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
            if (entity.itemHandler.getStackInSlot(1).isEmpty()) { return false; } else { planSlotItem = entity.itemHandler.getStackInSlot(1).getItem(); }
            int count = 0;
            ItemStack resultItem = match.get().getResultItem();
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
            }
            return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
        } else return false;
    }
    // hasRecipe for checking for if an item is in a slot or not.

    private static void craftItem(blockCuttingStation entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        assert level != null;
        Optional<blockCuttingStationRecipes> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            int count = 1;
            entity.itemHandler.extractItem(0,1, false);
            if (match.get().getResultItem().getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) { count = 2; }
            }
            entity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(2).getCount() + count));
            entity.resetProgress();
        }
    }
    private void resetProgress() {
        this.progress = 0;
    }
    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(2).getItem() == output.getItem() || inventory.getItem(2).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory, int variableOut) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount()+variableOut;
    }
}
