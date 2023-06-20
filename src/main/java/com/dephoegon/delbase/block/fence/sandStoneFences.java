package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_SAND_STONE_FENCE = register("white_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(WHITE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> WHITE_SAND_STONE_FENCE_GATE = register("white_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(WHITE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> ORANGE_SAND_STONE_FENCE = register("orange_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(ORANGE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_SAND_STONE_FENCE_GATE = register("orange_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(ORANGE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> MAGENTA_SAND_STONE_FENCE = register("magenta_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(MAGENTA_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> MAGENTA_SAND_STONE_FENCE_GATE = register("magenta_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(MAGENTA_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_SAND_STONE_FENCE = register("light_blue_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(LIGHT_BLUE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_SAND_STONE_FENCE_GATE = register("light_blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_BLUE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> YELLOW_SAND_STONE_FENCE = register("yellow_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(YELLOW_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> YELLOW_SAND_STONE_FENCE_GATE = register("yellow_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(YELLOW_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIME_SAND_STONE_FENCE = register("lime_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(LIME_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIME_SAND_STONE_FENCE_GATE = register("lime_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(LIME_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PINK_SAND_STONE_FENCE = register("pink_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(PINK_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PINK_SAND_STONE_FENCE_GATE = register("pink_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(PINK_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GRAY_SAND_STONE_FENCE = register("gray_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(GRAY_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GRAY_SAND_STONE_FENCE_GATE = register("gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(GRAY_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_SAND_STONE_FENCE = register("light_gray_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(LIGHT_GRAY_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_SAND_STONE_FENCE_GATE = register("light_gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_GRAY_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> CYAN_SAND_STONE_FENCE = register("cyan_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(CYAN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CYAN_SAND_STONE_FENCE_GATE = register("cyan_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(CYAN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PURPLE_SAND_STONE_FENCE = register("purple_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(PURPLE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PURPLE_SAND_STONE_FENCE_GATE = register("purple_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(PURPLE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLUE_SAND_STONE_FENCE = register("blue_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(BLUE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLUE_SAND_STONE_FENCE_GATE = register("blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(BLUE_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BROWN_SAND_STONE_FENCE = register("brown_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(BROWN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BROWN_SAND_STONE_FENCE_GATE = register("brown_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(BROWN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GREEN_SAND_STONE_FENCE = register("green_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(GREEN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GREEN_SAND_STONE_FENCE_GATE = register("green_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(GREEN_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> RED_SAND_STONE_FENCE = register("red_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> RED_SAND_STONE_FENCE_GATE = register("red_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLACK_SAND_STONE_FENCE = register("black_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(BLACK_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_SAND_STONE_FENCE_GATE = register("black_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(BLACK_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> SAND_STONE_FENCE = register("sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> SAND_STONE_FENCE_GATE = register("sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLOOD_SAND_STONE_FENCE = register("blood_sand_stone_fence",
            () -> new sandStoneFence(BlockBehaviour.Properties.copy(BLOOD_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLOOD_SAND_STONE_FENCE_GATE = register("blood_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BlockBehaviour.Properties.copy(BLOOD_SAND_STONE.get()),
                    "","",""));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
