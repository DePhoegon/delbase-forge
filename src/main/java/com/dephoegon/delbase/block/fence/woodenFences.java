package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.woodFence;
import com.dephoegon.delbase.aid.block.alt.woodFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class woodenFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    public static final RegistryObject<woodFence> ACACIA_WOOD_FENCE = register("acacia_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_ACACIA_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_ACACIA_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> ACACIA_LOG_FENCE = register("acacia_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_ACACIA_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> ACACIA_LOG_FENCE_GATE = register("acacia_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_ACACIA_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> BIRCH_WOOD_FENCE = register("birch_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_BIRCH_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_BIRCH_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> BIRCH_LOG_FENCE = register("birch_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_BIRCH_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> BIRCH_LOG_FENCE_GATE = register("birch_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_BIRCH_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_CRIMSON_HYPHAE_FENCE.get().defaultBlockState()));
    public static final RegistryObject<woodFenceGate> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<woodFence> CRIMSON_STEM_FENCE = register("crimson_stem_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_CRIMSON_STEM_FENCE.get().defaultBlockState()));
    public static final RegistryObject<woodFenceGate> CRIMSON_STEM_FENCE_GATE = register("crimson_stem_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_CRIMSON_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<woodFence> DARK_OAK_WOOD_FENCE = register("dark_oak_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_DARK_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> DARK_OAK_WOOD_FENCE_GATE = register("dark_oak_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> DARK_OAK_LOG_FENCE = register("dark_oak_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_DARK_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> DARK_OAK_LOG_FENCE_GATE = register("dark_oak_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_DARK_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> JUNGLE_WOOD_FENCE = register("jungle_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_JUNGLE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> JUNGLE_WOOD_FENCE_GATE = register("jungle_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_JUNGLE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> JUNGLE_LOG_FENCE = register("jungle_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_JUNGLE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> JUNGLE_LOG_FENCE_GATE = register("jungle_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_JUNGLE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> OAK_WOOD_FENCE = register("oak_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> OAK_WOOD_FENCE_GATE = register("oak_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> OAK_LOG_FENCE = register("oak_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> OAK_LOG_FENCE_GATE = register("oak_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> SPRUCE_WOOD_FENCE = register("spruce_wood_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_SPRUCE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> SPRUCE_WOOD_FENCE_GATE = register("spruce_wood_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_SPRUCE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> SPRUCE_LOG_FENCE = register("spruce_log_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_SPRUCE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFenceGate> SPRUCE_LOG_FENCE_GATE = register("spruce_log_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F, 3.0F).sound(SoundType.WOOD), true, STRIPPED_SPRUCE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final RegistryObject<woodFence> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_WARPED_HYPHAE_FENCE.get().defaultBlockState()));
    public static final RegistryObject<woodFenceGate> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final RegistryObject<woodFence> WARPED_STEM_FENCE = register("warped_stem_fence",
            () -> new woodFence(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_WARPED_STEM_FENCE.get().defaultBlockState()));
    public static final RegistryObject<woodFenceGate> WARPED_STEM_FENCE_GATE = register("warped_stem_fence_gate",
            () -> new woodFenceGate(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F, 3.0F).sound(SoundType.WOOD), false, STRIPPED_WARPED_STEM_FENCE_GATE.get().defaultBlockState()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
