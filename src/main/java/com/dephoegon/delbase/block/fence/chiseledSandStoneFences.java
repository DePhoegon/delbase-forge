package com.dephoegon.delbase.block.fence;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class chiseledSandStoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_CHISELED_SAND_STONE_FENCE = register("white_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(WHITE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> WHITE_CHISELED_SAND_STONE_FENCE_GATE = register("white_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(WHITE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> ORANGE_CHISELED_SAND_STONE_FENCE = register("orange_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(ORANGE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_CHISELED_SAND_STONE_FENCE_GATE = register("orange_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(ORANGE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> MAGENTA_CHISELED_SAND_STONE_FENCE = register("magenta_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(MAGENTA_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> MAGENTA_CHISELED_SAND_STONE_FENCE_GATE = register("magenta_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(MAGENTA_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE = register("light_blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(LIGHT_BLUE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE = register("light_blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_BLUE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> YELLOW_CHISELED_SAND_STONE_FENCE = register("yellow_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(YELLOW_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> YELLOW_CHISELED_SAND_STONE_FENCE_GATE = register("yellow_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(YELLOW_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIME_CHISELED_SAND_STONE_FENCE = register("lime_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(LIME_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIME_CHISELED_SAND_STONE_FENCE_GATE = register("lime_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(LIME_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PINK_CHISELED_SAND_STONE_FENCE = register("pink_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(PINK_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PINK_CHISELED_SAND_STONE_FENCE_GATE = register("pink_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(PINK_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GRAY_CHISELED_SAND_STONE_FENCE = register("gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(GRAY_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GRAY_CHISELED_SAND_STONE_FENCE_GATE = register("gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(GRAY_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE = register("light_gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(LIGHT_GRAY_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE = register("light_gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(LIGHT_GRAY_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> CYAN_CHISELED_SAND_STONE_FENCE = register("cyan_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(CYAN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CYAN_CHISELED_SAND_STONE_FENCE_GATE = register("cyan_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(CYAN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> PURPLE_CHISELED_SAND_STONE_FENCE = register("purple_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(PURPLE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PURPLE_CHISELED_SAND_STONE_FENCE_GATE = register("purple_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(PURPLE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLUE_CHISELED_SAND_STONE_FENCE = register("blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(BLUE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLUE_CHISELED_SAND_STONE_FENCE_GATE = register("blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(BLUE_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> BROWN_CHISELED_SAND_STONE_FENCE = register("brown_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(BROWN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BROWN_CHISELED_SAND_STONE_FENCE_GATE = register("brown_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(BROWN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> GREEN_CHISELED_SAND_STONE_FENCE = register("green_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(GREEN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GREEN_CHISELED_SAND_STONE_FENCE_GATE = register("green_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(GREEN_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> RED_CHISELED_SAND_STONE_FENCE = register("red_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> RED_CHISELED_SAND_STONE_FENCE_GATE = register("red_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(RED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLACK_CHISELED_SAND_STONE_FENCE = register("black_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(BLACK_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_CHISELED_SAND_STONE_FENCE_GATE = register("black_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(BLACK_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceBlock> CHISELED_SAND_STONE_FENCE = register("chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CHISELED_SAND_STONE_FENCE_GATE = register("chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLOOD_CHISELED_SAND_STONE_FENCE = register("blood_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BlockBehaviour.Properties.copy(BLOOD_CHISELED_SAND_STONE.get()),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLOOD_CHISELED_SAND_STONE_FENCE_GATE = register("blood_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BlockBehaviour.Properties.copy(BLOOD_CHISELED_SAND_STONE.get()),
                    "","",""));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
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
