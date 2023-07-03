package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFenceGate;
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

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class concreteFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> WHITE_CONCRETE_FENCE = register("white_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(WHITE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> WHITE_CONCRETE_FENCE_GATE = register("white_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(WHITE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> ORANGE_CONCRETE_FENCE = register("orange_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(ORANGE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> ORANGE_CONCRETE_FENCE_GATE = register("orange_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(ORANGE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> MAGENTA_CONCRETE_FENCE = register("magenta_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(MAGENTA_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> MAGENTA_CONCRETE_FENCE_GATE = register("magenta_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(MAGENTA_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_BLUE_CONCRETE_FENCE = register("light_blue_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(LIGHT_BLUE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_BLUE_CONCRETE_FENCE_GATE = register("light_blue_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(LIGHT_BLUE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> YELLOW_CONCRETE_FENCE = register("yellow_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(YELLOW_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> YELLOW_CONCRETE_FENCE_GATE = register("yellow_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(YELLOW_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIME_CONCRETE_FENCE = register("lime_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(LIME_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIME_CONCRETE_FENCE_GATE = register("lime_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(LIME_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> PINK_CONCRETE_FENCE = register("pink_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(PINK_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PINK_CONCRETE_FENCE_GATE = register("pink_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(PINK_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> GRAY_CONCRETE_FENCE = register("gray_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(GRAY_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GRAY_CONCRETE_FENCE_GATE = register("gray_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(GRAY_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> LIGHT_GRAY_CONCRETE_FENCE = register("light_gray_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(LIGHT_GRAY_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> LIGHT_GRAY_CONCRETE_FENCE_GATE = register("light_gray_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(LIGHT_GRAY_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> CYAN_CONCRETE_FENCE = register("cyan_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(CYAN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> CYAN_CONCRETE_FENCE_GATE = register("cyan_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(CYAN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> PURPLE_CONCRETE_FENCE = register("purple_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(PURPLE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> PURPLE_CONCRETE_FENCE_GATE = register("purple_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(PURPLE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLUE_CONCRETE_FENCE = register("blue_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(BLUE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLUE_CONCRETE_FENCE_GATE = register("blue_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(BLUE_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BROWN_CONCRETE_FENCE = register("brown_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(BROWN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BROWN_CONCRETE_FENCE_GATE = register("brown_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(BROWN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> GREEN_CONCRETE_FENCE = register("green_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(GREEN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> GREEN_CONCRETE_FENCE_GATE = register("green_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(GREEN_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> RED_CONCRETE_FENCE = register("red_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(RED_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> RED_CONCRETE_FENCE_GATE = register("red_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(RED_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceBlock> BLACK_CONCRETE_FENCE = register("black_concrete_fence",
            () -> new concreteFence(BlockBehaviour.Properties.copy(BLACK_CONCRETE),
                    "","",""));
    public static final RegistryObject<FenceGateBlock> BLACK_CONCRETE_FENCE_GATE = register("black_concrete_fence_gate",
            () -> new concreteFenceGate(BlockBehaviour.Properties.copy(BLACK_CONCRETE),
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
