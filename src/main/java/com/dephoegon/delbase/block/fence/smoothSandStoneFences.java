package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.smoothSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.smoothSandStoneFenceGate;
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

import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class smoothSandStoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_SMOOTH_SAND_STONE_FENCE = register("white_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(WHITE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> WHITE_SMOOTH_SAND_STONE_FENCE_GATE = register("white_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(WHITE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> ORANGE_SMOOTH_SAND_STONE_FENCE = register("orange_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(ORANGE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> ORANGE_SMOOTH_SAND_STONE_FENCE_GATE = register("orange_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(ORANGE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> MAGENTA_SMOOTH_SAND_STONE_FENCE = register("magenta_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(MAGENTA_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> MAGENTA_SMOOTH_SAND_STONE_FENCE_GATE = register("magenta_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(MAGENTA_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE = register("light_blue_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIGHT_BLUE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE_GATE = register("light_blue_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIGHT_BLUE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> YELLOW_SMOOTH_SAND_STONE_FENCE = register("yellow_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(YELLOW_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> YELLOW_SMOOTH_SAND_STONE_FENCE_GATE = register("yellow_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(YELLOW_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIME_SMOOTH_SAND_STONE_FENCE = register("lime_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIME_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIME_SMOOTH_SAND_STONE_FENCE_GATE = register("lime_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIME_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> PINK_SMOOTH_SAND_STONE_FENCE = register("pink_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(PINK_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> PINK_SMOOTH_SAND_STONE_FENCE_GATE = register("pink_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(PINK_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> GRAY_SMOOTH_SAND_STONE_FENCE = register("gray_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(GRAY_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> GRAY_SMOOTH_SAND_STONE_FENCE_GATE = register("gray_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(GRAY_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE = register("light_gray_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIGHT_GRAY_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE_GATE = register("light_gray_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIGHT_GRAY_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> CYAN_SMOOTH_SAND_STONE_FENCE = register("cyan_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(CYAN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> CYAN_SMOOTH_SAND_STONE_FENCE_GATE = register("cyan_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(CYAN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> PURPLE_SMOOTH_SAND_STONE_FENCE = register("purple_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(PURPLE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> PURPLE_SMOOTH_SAND_STONE_FENCE_GATE = register("purple_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(PURPLE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> BLUE_SMOOTH_SAND_STONE_FENCE = register("blue_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLUE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLUE_SMOOTH_SAND_STONE_FENCE_GATE = register("blue_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLUE_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> BROWN_SMOOTH_SAND_STONE_FENCE = register("brown_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BROWN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BROWN_SMOOTH_SAND_STONE_FENCE_GATE = register("brown_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BROWN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> GREEN_SMOOTH_SAND_STONE_FENCE = register("green_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(GREEN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> GREEN_SMOOTH_SAND_STONE_FENCE_GATE = register("green_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(GREEN_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> RED_SMOOTH_SAND_STONE_FENCE = register("red_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(RED_SANDSTONE));
    public static final RegistryObject<FenceGateBlock> RED_SMOOTH_SAND_STONE_FENCE_GATE = register("red_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(RED_SANDSTONE));
    public static final RegistryObject<FenceBlock> BLACK_SMOOTH_SAND_STONE_FENCE = register("black_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLACK_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLACK_SMOOTH_SAND_STONE_FENCE_GATE = register("black_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLACK_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceBlock> SMOOTH_SAND_STONE_FENCE = register("smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(SANDSTONE));
    public static final RegistryObject<FenceGateBlock> SMOOTH_SAND_STONE_FENCE_GATE = register("smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(SANDSTONE));
    public static final RegistryObject<FenceBlock> BLOOD_SMOOTH_SAND_STONE_FENCE = register("blood_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLOOD_SMOOTH_SAND_STONE.get()));
    public static final RegistryObject<FenceGateBlock> BLOOD_SMOOTH_SAND_STONE_FENCE_GATE = register("blood_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLOOD_SMOOTH_SAND_STONE.get()));
    
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