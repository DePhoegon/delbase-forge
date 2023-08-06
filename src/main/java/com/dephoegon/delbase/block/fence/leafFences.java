package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.leafFence;
import com.dephoegon.delbase.aid.block.alt.leafFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class leafFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> OAK_LEAF_FENCE = register("oak_leaf_fence",
            () -> new leafFence(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> OAK_LEAF_FENCE_GATE = register("oak_leaf_fence_gate",
            () -> new leafFenceGate(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> SPRUCE_LEAF_FENCE = register("spruce_leaf_fence",
            () -> new leafFence(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> SPRUCE_LEAF_FENCE_GATE = register("spruce_leaf_fence_gate",
            () -> new leafFenceGate(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> BIRCH_LEAF_FENCE = register("birch_leaf_fence",
            () -> new leafFence(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> BIRCH_LEAF_FENCE_GATE = register("birch_leaf_fence_gate",
            () -> new leafFenceGate(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> ACACIA_LEAF_FENCE = register("acacia_leaf_fence",
            () -> new leafFence(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> ACACIA_LEAF_FENCE_GATE = register("acacia_leaf_fence_gate",
            () -> new leafFenceGate(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> JUNGLE_LEAF_FENCE = register("jungle_leaf_fence",
            () -> new leafFence(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> JUNGLE_LEAF_FENCE_GATE = register("jungle_leaf_fence_gate",
            () -> new leafFenceGate(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> DARK_OAK_LEAF_FENCE = register("dark_oak_leaf_fence",
            () -> new leafFence(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> DARK_OAK_LEAF_FENCE_GATE = register("dark_oak_leaf_fence_gate",
            () -> new leafFenceGate(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> MANGROVE_LEAF_FENCE = register("mangrove_leaf_fence",
            () -> new leafFence(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> MANGROVE_LEAF_FENCE_GATE = register("mangrove_leaf_fence_gate",
            () -> new leafFenceGate(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> AZALEA_LEAF_FENCE = register("azalea_leaf_fence",
            () -> new leafFence(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final RegistryObject<FenceGateBlock> AZALEA_LEAF_FENCE_GATE = register("azalea_leaf_fence_gate",
            () -> new leafFenceGate(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final RegistryObject<FenceBlock> FLOWERING_AZALEA_LEAF_FENCE = register("flowering_azalea_leaf_fence",
            () -> new leafFence(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final RegistryObject<FenceGateBlock> FLOWERING_AZALEA_LEAF_FENCE_GATE = register("flowering_azalea_leaf_fence_gate",
            () -> new leafFenceGate(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final RegistryObject<FenceBlock> CHERRY_LEAF_FENCE = register("cherry_leaf_fence",
            () -> new leafFence(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final RegistryObject<FenceGateBlock> CHERRY_LEAF_FENCE_GATE = register("cherry_leaf_fence_gate",
            () -> new leafFenceGate(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));

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