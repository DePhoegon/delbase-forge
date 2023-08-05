package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.alt.*;
import com.dephoegon.delbase.aid.block.stock.axisBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.miscSpecialCases.ASH_BLOCK;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class ashBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> ASH_SLAB = register("ash_slab",
            () -> new woodSlab(ASH_BLOCK.get(), false, null),8000);
    public static final RegistryObject<StairBlock> ASH_STAIR = register("ash_stair",
            ()-> new woodStair(ASH_BLOCK.get(), false, null),12000);
    public static final RegistryObject<RotatedPillarBlock> ASH_LOG = register("ash_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(ASH_BLOCK.get()).sound(SoundType.WOOD), false, 0 ,0),16000);
    public static final RegistryObject<WallBlock> ASH_WALL = register("ash_wall",
            ()-> new woodWall(ASH_BLOCK.get(), false, null),10000);
    public static final RegistryObject<FenceBlock> ASH_FENCE = register("ash_fence",
            () -> new woodFence(BlockBehaviour.Properties.copy(ASH_BLOCK.get()).sound(SoundType.WOOD), false, null), 5000);
    public static final RegistryObject<FenceGateBlock> ASH_FENCE_GATE = register("ash_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.copy(ASH_BLOCK.get()).sound(SoundType.WOOD), false, null), 5000);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
}
