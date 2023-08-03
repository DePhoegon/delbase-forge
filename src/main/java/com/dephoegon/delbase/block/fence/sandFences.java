package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.sandFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandFenceGate;
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

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class sandFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_SAND_FENCE = register("white_sand_fence",
            () -> new sandFence(WHITE_SAND.get()));
    public static final RegistryObject<FenceGateBlock> WHITE_SAND_FENCE_GATE = register("white_sand_fence_gate",
            () -> new sandFenceGate(WHITE_SAND.get()));
    public static final RegistryObject<FenceBlock> ORANGE_SAND_FENCE = register("orange_sand_fence",
            () -> new sandFence(ORANGE_SAND.get()));
    public static final RegistryObject<FenceGateBlock> ORANGE_SAND_FENCE_GATE = register("orange_sand_fence_gate",
            () -> new sandFenceGate(ORANGE_SAND.get()));
    public static final RegistryObject<FenceBlock> MAGENTA_SAND_FENCE = register("magenta_sand_fence",
            () -> new sandFence(MAGENTA_SAND.get()));
    public static final RegistryObject<FenceGateBlock> MAGENTA_SAND_FENCE_GATE = register("magenta_sand_fence_gate",
            () -> new sandFenceGate(MAGENTA_SAND.get()));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_SAND_FENCE = register("light_blue_sand_fence",
            () -> new sandFence(LIGHT_BLUE_SAND.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_SAND_FENCE_GATE = register("light_blue_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_BLUE_SAND.get()));
    public static final RegistryObject<FenceBlock> YELLOW_SAND_FENCE = register("yellow_sand_fence",
            () -> new sandFence(YELLOW_SAND.get()));
    public static final RegistryObject<FenceGateBlock> YELLOW_SAND_FENCE_GATE = register("yellow_sand_fence_gate",
            () -> new sandFenceGate(YELLOW_SAND.get()));
    public static final RegistryObject<FenceBlock> LIME_SAND_FENCE = register("lime_sand_fence",
            () -> new sandFence(LIME_SAND.get()));
    public static final RegistryObject<FenceGateBlock> LIME_SAND_FENCE_GATE = register("lime_sand_fence_gate",
            () -> new sandFenceGate(LIME_SAND.get()));
    public static final RegistryObject<FenceBlock> PINK_SAND_FENCE = register("pink_sand_fence",
            () -> new sandFence(PINK_SAND.get()));
    public static final RegistryObject<FenceGateBlock> PINK_SAND_FENCE_GATE = register("pink_sand_fence_gate",
            () -> new sandFenceGate(PINK_SAND.get()));
    public static final RegistryObject<FenceBlock> GRAY_SAND_FENCE = register("gray_sand_fence",
            () -> new sandFence(GRAY_SAND.get()));
    public static final RegistryObject<FenceGateBlock> GRAY_SAND_FENCE_GATE = register("gray_sand_fence_gate",
            () -> new sandFenceGate(GRAY_SAND.get()));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_SAND_FENCE = register("light_gray_sand_fence",
            () -> new sandFence(LIGHT_GRAY_SAND.get()));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_SAND_FENCE_GATE = register("light_gray_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_GRAY_SAND.get()));
    public static final RegistryObject<FenceBlock> CYAN_SAND_FENCE = register("cyan_sand_fence",
            () -> new sandFence(CYAN_SAND.get()));
    public static final RegistryObject<FenceGateBlock> CYAN_SAND_FENCE_GATE = register("cyan_sand_fence_gate",
            () -> new sandFenceGate(CYAN_SAND.get()));
    public static final RegistryObject<FenceBlock> PURPLE_SAND_FENCE = register("purple_sand_fence",
            () -> new sandFence(PURPLE_SAND.get()));
    public static final RegistryObject<FenceGateBlock> PURPLE_SAND_FENCE_GATE = register("purple_sand_fence_gate",
            () -> new sandFenceGate(PURPLE_SAND.get()));
    public static final RegistryObject<FenceBlock> BLUE_SAND_FENCE = register("blue_sand_fence",
            () -> new sandFence(BLUE_SAND.get()));
    public static final RegistryObject<FenceGateBlock> BLUE_SAND_FENCE_GATE = register("blue_sand_fence_gate",
            () -> new sandFenceGate(BLUE_SAND.get()));
    public static final RegistryObject<FenceBlock> BROWN_SAND_FENCE = register("brown_sand_fence",
            () -> new sandFence(BROWN_SAND.get()));
    public static final RegistryObject<FenceGateBlock> BROWN_SAND_FENCE_GATE = register("brown_sand_fence_gate",
            () -> new sandFenceGate(BROWN_SAND.get()));
    public static final RegistryObject<FenceBlock> GREEN_SAND_FENCE = register("green_sand_fence",
            () -> new sandFence(GREEN_SAND.get()));
    public static final RegistryObject<FenceGateBlock> GREEN_SAND_FENCE_GATE = register("green_sand_fence_gate",
            () -> new sandFenceGate(GREEN_SAND.get()));
    public static final RegistryObject<FenceBlock> RED_SAND_FENCE = register("red_sand_fence",
            () -> new sandFence(RED_SAND));
    public static final RegistryObject<FenceGateBlock> RED_SAND_FENCE_GATE = register("red_sand_fence_gate",
            () -> new sandFenceGate(RED_SAND));
    public static final RegistryObject<FenceBlock> BLACK_SAND_FENCE = register("black_sand_fence",
            () -> new sandFence(BLACK_SAND.get()));
    public static final RegistryObject<FenceGateBlock> BLACK_SAND_FENCE_GATE = register("black_sand_fence_gate",
            () -> new sandFenceGate(BLACK_SAND.get()));
    public static final RegistryObject<FenceBlock> SAND_FENCE = register("sand_fence",
            () -> new sandFence(SAND));
    public static final RegistryObject<FenceGateBlock> SAND_FENCE_GATE = register("sand_fence_gate",
            () -> new sandFenceGate(SAND));
    public static final RegistryObject<FenceBlock> BLOOD_SAND_FENCE = register("blood_sand_fence",
            () -> new sandFence(BLOOD_SAND.get()));
    public static final RegistryObject<FenceGateBlock> BLOOD_SAND_FENCE_GATE = register("blood_sand_fence_gate",
            () -> new sandFenceGate(BLOOD_SAND.get()));


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
