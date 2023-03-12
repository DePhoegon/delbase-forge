package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class terracottaFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_TERRACOTTA_FENCE = register("white_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(WHITE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> WHITE_TERRACOTTA_FENCE_GATE = register("white_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(WHITE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> ORANGE_TERRACOTTA_FENCE = register("orange_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(ORANGE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_TERRACOTTA_FENCE_GATE = register("orange_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(ORANGE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> MAGENTA_TERRACOTTA_FENCE = register("magenta_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(MAGENTA_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> MAGENTA_TERRACOTTA_FENCE_GATE = register("magenta_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(MAGENTA_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_TERRACOTTA_FENCE = register("light_blue_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(LIGHT_BLUE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_TERRACOTTA_FENCE_GATE = register("light_blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(LIGHT_BLUE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> YELLOW_TERRACOTTA_FENCE = register("yellow_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(YELLOW_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> YELLOW_TERRACOTTA_FENCE_GATE = register("yellow_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(YELLOW_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIME_TERRACOTTA_FENCE = register("lime_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(LIME_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIME_TERRACOTTA_FENCE_GATE = register("lime_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(LIME_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> PINK_TERRACOTTA_FENCE = register("pink_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(PINK_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PINK_TERRACOTTA_FENCE_GATE = register("pink_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(PINK_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> GRAY_TERRACOTTA_FENCE = register("gray_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(GRAY_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GRAY_TERRACOTTA_FENCE_GATE = register("gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(GRAY_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_TERRACOTTA_FENCE = register("light_gray_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(LIGHT_GRAY_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_TERRACOTTA_FENCE_GATE = register("light_gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(LIGHT_GRAY_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> CYAN_TERRACOTTA_FENCE = register("cyan_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(CYAN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CYAN_TERRACOTTA_FENCE_GATE = register("cyan_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(CYAN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> PURPLE_TERRACOTTA_FENCE = register("purple_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(PURPLE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PURPLE_TERRACOTTA_FENCE_GATE = register("purple_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(PURPLE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLUE_TERRACOTTA_FENCE = register("blue_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(BLUE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLUE_TERRACOTTA_FENCE_GATE = register("blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(BLUE_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BROWN_TERRACOTTA_FENCE = register("brown_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(BROWN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BROWN_TERRACOTTA_FENCE_GATE = register("brown_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(BROWN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> GREEN_TERRACOTTA_FENCE = register("green_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(GREEN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GREEN_TERRACOTTA_FENCE_GATE = register("green_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(GREEN_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> RED_TERRACOTTA_FENCE = register("red_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(RED_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> RED_TERRACOTTA_FENCE_GATE = register("red_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(RED_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLACK_TERRACOTTA_FENCE = register("black_terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(BLACK_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_TERRACOTTA_FENCE_GATE = register("black_terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(BLACK_TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceBlock> TERRACOTTA_FENCE = register("terracotta_fence",
            () -> new terracottaFence(BlockBehaviour.Properties.copy(TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> TERRACOTTA_FENCE_GATE = register("terracotta_fence_gate",
            () -> new terracottaFenceGate(BlockBehaviour.Properties.copy(TERRACOTTA).sound(SoundType.CALCITE),
                    "","",""));
    
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
