package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.leafFence;
import com.dephoegon.delbase.aid.block.alt.leafFenceGate;
import com.dephoegon.delbase.aid.block.alt.woodFence;
import com.dephoegon.delbase.aid.block.alt.woodFenceGate;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class fenceMisc {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> GLOWSTONE_FENCE = register("glowstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> GLOWSTONE_FENCE_GATE = register("glowstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> COBBLED_BASALT_FENCE = register("cobbled_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> COBBLED_BASALT_FENCE_GATE = register("cobbled_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> BASALT_FENCE = register("basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> BASALT_FENCE_GATE = register("basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> SMOOTH_BASALT_FENCE = register("smooth_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> SMOOTH_BASALT_FENCE_GATE = register("smooth_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> END_STONE_FENCE = register("end_stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> END_STONE_FENCE_GATE = register("end_stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> DRIPSTONE_FENCE = register("dripstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> DRIPSTONE_FENCE_GATE = register("dripstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = register("cracked_polished_blackstone_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = register("cracked_polished_blackstone_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> RAW_GOLD_FENCE = register("raw_gold_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> RAW_GOLD_FENCE_GATE = register("raw_gold_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> RAW_COPPER_FENCE = register("raw_copper_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(RAW_COPPER_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> RAW_COPPER_FENCE_GATE = register("raw_copper_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(RAW_COPPER_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> RAW_IRON_FENCE = register("raw_iron_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> RAW_IRON_FENCE_GATE = register("raw_iron_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> PURPUR_BLOCK_FENCE = register("purpur_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> PURPUR_BLOCK_FENCE_GATE = register("purpur_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> COAL_BLOCK_FENCE = register("coal_block_fence",
            () -> new woodFence(COAL_BLOCK, SoundType.TUFF, true, null),5001);
    public static final RegistryObject<FenceGateBlock> COAL_BLOCK_FENCE_GATE = register("coal_block_fence_gate",
            () -> new woodFenceGate(COAL_BLOCK, SoundType.TUFF, true, null),5000);
    public static final RegistryObject<FenceBlock> CHISELED_POLISHED_BLACKSTONE_FENCE = register("chiseled_polished_blackstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = register("chiseled_polished_blackstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> POLISHED_BASALT_FENCE = register("polished_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> POLISHED_BASALT_FENCE_GATE = register("polished_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> BONE_BLOCK_FENCE = register("bone_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> BONE_BLOCK_FENCE_GATE = register("bone_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> DRIED_KELP_FENCE = register("dried_kelp_fence",
            () -> new leafFence(DRIED_KELP_BLOCK, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceGateBlock> DRIED_KELP_FENCE_GATE = register("dried_kelp_fence_gate",
            () -> new leafFenceGate(DRIED_KELP_BLOCK, SoundType.GRASS, true, null));
    public static final RegistryObject<FenceBlock> NETHERRACK_FENCE = register("netherrack_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> NETHERRACK_FENCE_GATE = register("netherrack_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> SHROOMLIGHT_FENCE = register("shroomlight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> SHROOMLIGHT_FENCE_GATE = register("shroomlight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> MAGMA_BLOCK_FENCE = register("magma_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> MAGMA_BLOCK_FENCE_GATE = register("magma_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_netherbrick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> SCULK_FENCE = register("sculk_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> SCULK_FENCE_GATE = register("sculk_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> PACKED_MUD_FENCE = register("packed_mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(PACKED_MUD).sound(SoundType.PACKED_MUD),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> PACKED_MUD_FENCE_GATE = register("packed_mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(PACKED_MUD).sound(SoundType.PACKED_MUD),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> MUD_FENCE = register("mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> MUD_FENCE_GATE = register("mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> MUDDY_MANGROVE_ROOT_FENCE = register("muddy_mangrove_root_fence",
            () -> new leafFence(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final RegistryObject<FenceGateBlock> MUDDY_MANGROVE_ROOT_FENCE_GATE = register("muddy_mangrove_root_fence_gate",
            () -> new leafFenceGate(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final RegistryObject<FenceBlock> MANGROVE_ROOT_FENCE = register("mangrove_root_fence",
            () -> new leafFence(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, true, null));
    public static final RegistryObject<FenceGateBlock> MANGROVE_ROOT_FENCE_GATE = register("mangrove_root_fence_gate",
            () -> new leafFenceGate(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, true, null));
    public static final RegistryObject<FenceBlock> OCHRE_FROGLIGHT_FENCE = register("ochre_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> OCHRE_FROGLIGHT_FENCE_GATE = register("ochre_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> VERDANT_FROGLIGHT_FENCE = register("verdant_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> VERDANT_FROGLIGHT_FENCE_GATE = register("verdant_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> PEARLESCENT_FROGLIGHT_FENCE = register("pearlescent_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> PEARLESCENT_FROGLIGHT_FENCE_GATE = register("pearlescent_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));


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
