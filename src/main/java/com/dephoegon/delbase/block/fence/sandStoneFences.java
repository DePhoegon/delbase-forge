package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_SAND_STONE_FENCE = register("white_sand_stone_fence",
            () -> new sandStoneFence(WHITE_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> WHITE_SAND_STONE_FENCE_GATE = register("white_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(WHITE_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> ORANGE_SAND_STONE_FENCE = register("orange_sand_stone_fence",
            () -> new sandStoneFence(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> ORANGE_SAND_STONE_FENCE_GATE = register("orange_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> MAGENTA_SAND_STONE_FENCE = register("magenta_sand_stone_fence",
            () -> new sandStoneFence(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> MAGENTA_SAND_STONE_FENCE_GATE = register("magenta_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_SAND_STONE_FENCE = register("light_blue_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_SAND_STONE_FENCE_GATE = register("light_blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> YELLOW_SAND_STONE_FENCE = register("yellow_sand_stone_fence",
            () -> new sandStoneFence(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> YELLOW_SAND_STONE_FENCE_GATE = register("yellow_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIME_SAND_STONE_FENCE = register("lime_sand_stone_fence",
            () -> new sandStoneFence(LIME_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIME_SAND_STONE_FENCE_GATE = register("lime_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIME_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> PINK_SAND_STONE_FENCE = register("pink_sand_stone_fence",
            () -> new sandStoneFence(PINK_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> PINK_SAND_STONE_FENCE_GATE = register("pink_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PINK_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> GRAY_SAND_STONE_FENCE = register("gray_sand_stone_fence",
            () -> new sandStoneFence(GRAY_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> GRAY_SAND_STONE_FENCE_GATE = register("gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GRAY_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_SAND_STONE_FENCE = register("light_gray_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_SAND_STONE_FENCE_GATE = register("light_gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> CYAN_SAND_STONE_FENCE = register("cyan_sand_stone_fence",
            () -> new sandStoneFence(CYAN_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> CYAN_SAND_STONE_FENCE_GATE = register("cyan_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(CYAN_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> PURPLE_SAND_STONE_FENCE = register("purple_sand_stone_fence",
            () -> new sandStoneFence(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> PURPLE_SAND_STONE_FENCE_GATE = register("purple_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> BLUE_SAND_STONE_FENCE = register("blue_sand_stone_fence",
            () -> new sandStoneFence(BLUE_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLUE_SAND_STONE_FENCE_GATE = register("blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLUE_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> BROWN_SAND_STONE_FENCE = register("brown_sand_stone_fence",
            () -> new sandStoneFence(BROWN_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BROWN_SAND_STONE_FENCE_GATE = register("brown_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BROWN_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> GREEN_SAND_STONE_FENCE = register("green_sand_stone_fence",
            () -> new sandStoneFence(GREEN_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> GREEN_SAND_STONE_FENCE_GATE = register("green_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GREEN_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> RED_SAND_STONE_FENCE = register("red_sand_stone_fence",
            () -> new sandStoneFence(RED_SANDSTONE));
    public static final RegistryObject<FenceGateBlock> RED_SAND_STONE_FENCE_GATE = register("red_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(RED_SANDSTONE));
    public static final RegistryObject<FenceBlock> BLACK_SAND_STONE_FENCE = register("black_sand_stone_fence",
            () -> new sandStoneFence(BLACK_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLACK_SAND_STONE_FENCE_GATE = register("black_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLACK_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> SAND_STONE_FENCE = register("sand_stone_fence",
            () -> new sandStoneFence(SANDSTONE));
    public static final RegistryObject<FenceGateBlock> SAND_STONE_FENCE_GATE = register("sand_stone_fence_gate",
            () -> new sandStoneFenceGate(SANDSTONE));
    public static final RegistryObject<FenceBlock> BLOOD_SAND_STONE_FENCE = register("blood_sand_stone_fence",
            () -> new sandStoneFence(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLOOD_SAND_STONE_FENCE_GATE = register("blood_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLOOD_SAND_STONE.get()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}