package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.cutSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.cutSandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
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

import static com.dephoegon.delbase.block.axis.axiCutSandStones.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;

public class cutSandStoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_CUT_SAND_STONE_FENCE = register("white_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(WHITE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> WHITE_CUT_SAND_STONE_FENCE_GATE = register("white_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(WHITE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> ORANGE_CUT_SAND_STONE_FENCE = register("orange_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(ORANGE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_CUT_SAND_STONE_FENCE_GATE = register("orange_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(ORANGE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> MAGENTA_CUT_SAND_STONE_FENCE = register("magenta_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(MAGENTA_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> MAGENTA_CUT_SAND_STONE_FENCE_GATE = register("magenta_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(MAGENTA_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE = register("light_blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(LIGHT_BLUE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE = register("light_blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_BLUE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> YELLOW_CUT_SAND_STONE_FENCE = register("yellow_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(YELLOW_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> YELLOW_CUT_SAND_STONE_FENCE_GATE = register("yellow_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(YELLOW_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIME_CUT_SAND_STONE_FENCE = register("lime_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(LIME_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIME_CUT_SAND_STONE_FENCE_GATE = register("lime_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(LIME_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PINK_CUT_SAND_STONE_FENCE = register("pink_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(PINK_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PINK_CUT_SAND_STONE_FENCE_GATE = register("pink_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(PINK_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GRAY_CUT_SAND_STONE_FENCE = register("gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(GRAY_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GRAY_CUT_SAND_STONE_FENCE_GATE = register("gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(GRAY_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE = register("light_gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(LIGHT_GRAY_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE = register("light_gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_GRAY_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> CYAN_CUT_SAND_STONE_FENCE = register("cyan_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(CYAN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CYAN_CUT_SAND_STONE_FENCE_GATE = register("cyan_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(CYAN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PURPLE_CUT_SAND_STONE_FENCE = register("purple_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(PURPLE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PURPLE_CUT_SAND_STONE_FENCE_GATE = register("purple_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(PURPLE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLUE_CUT_SAND_STONE_FENCE = register("blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(BLUE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLUE_CUT_SAND_STONE_FENCE_GATE = register("blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(BLUE_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BROWN_CUT_SAND_STONE_FENCE = register("brown_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(BROWN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BROWN_CUT_SAND_STONE_FENCE_GATE = register("brown_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(BROWN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GREEN_CUT_SAND_STONE_FENCE = register("green_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(GREEN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GREEN_CUT_SAND_STONE_FENCE_GATE = register("green_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(GREEN_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> RED_CUT_SAND_STONE_FENCE = register("red_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> RED_CUT_SAND_STONE_FENCE_GATE = register("red_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLACK_CUT_SAND_STONE_FENCE = register("black_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(BLACK_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_CUT_SAND_STONE_FENCE_GATE = register("black_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(BLACK_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> CUT_SAND_STONE_FENCE = register("cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(CUT_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CUT_SAND_STONE_FENCE_GATE = register("cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(CUT_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLOOD_CUT_SAND_STONE_FENCE = register("blood_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BlockBehaviour.Properties.copy(BLOOD_CUT_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLOOD_CUT_SAND_STONE_FENCE_GATE = register("blood_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BlockBehaviour.Properties.copy(BLOOD_CUT_SAND_STONE.get()),
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
