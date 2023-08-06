package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.woodFence;
import com.dephoegon.delbase.aid.block.alt.woodFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class woodenFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    public static final RegistryObject<FenceBlock> ACACIA_WOOD_FENCE = register("acacia_wood_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> ACACIA_LOG_FENCE = register("acacia_log_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> ACACIA_LOG_FENCE_GATE = register("acacia_log_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> BIRCH_WOOD_FENCE = register("birch_wood_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> BIRCH_LOG_FENCE = register("birch_log_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> BIRCH_LOG_FENCE_GATE = register("birch_log_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE.get().defaultBlockState()));
    public static final RegistryObject<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<FenceBlock> CRIMSON_STEM_FENCE = register("crimson_stem_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE.get().defaultBlockState()));
    public static final RegistryObject<FenceGateBlock> CRIMSON_STEM_FENCE_GATE = register("crimson_stem_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<FenceBlock> DARK_OAK_WOOD_FENCE = register("dark_oak_wood_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = register("dark_oak_wood_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> DARK_OAK_LOG_FENCE = register("dark_oak_log_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> DARK_OAK_LOG_FENCE_GATE = register("dark_oak_log_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> JUNGLE_WOOD_FENCE = register("jungle_wood_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = register("jungle_wood_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> JUNGLE_LOG_FENCE = register("jungle_log_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> JUNGLE_LOG_FENCE_GATE = register("jungle_log_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> OAK_WOOD_FENCE = register("oak_wood_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> OAK_WOOD_FENCE_GATE = register("oak_wood_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> OAK_LOG_FENCE = register("oak_log_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> OAK_LOG_FENCE_GATE = register("oak_log_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> SPRUCE_WOOD_FENCE = register("spruce_wood_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = register("spruce_wood_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> SPRUCE_LOG_FENCE = register("spruce_log_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> SPRUCE_LOG_FENCE_GATE = register("spruce_log_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE.get().defaultBlockState()));
    public static final RegistryObject<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<FenceBlock> WARPED_STEM_FENCE = register("warped_stem_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE.get().defaultBlockState()));
    public static final RegistryObject<FenceGateBlock> WARPED_STEM_FENCE_GATE = register("warped_stem_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<FenceBlock> MANGROVE_WOOD_FENCE = register("mangrove_wood_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = register("mangrove_wood_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> MANGROVE_LOG_FENCE = register("mangrove_log_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> MANGROVE_LOG_FENCE_GATE = register("mangrove_log_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> CHERRY_WOOD_FENCE = register("cherry_wood_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = register("cherry_wood_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceBlock> CHERRY_LOG_FENCE = register("cherry_log_fence",
            () -> new woodFence(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<FenceGateBlock> CHERRY_LOG_FENCE_GATE = register("cherry_log_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE_GATE.get().defaultBlockState()), 1000);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}