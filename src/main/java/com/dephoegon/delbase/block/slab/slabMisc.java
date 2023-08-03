package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.leafSlab;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabMisc {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> END_STONE_SLAB = register("end_stone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(END_STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> BONE_BLOCK_SLAB = register("bone_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(BONE_BLOCK).sound(SoundType.BONE_BLOCK), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> DRIED_KELP_SLAB = register("dried_kelp_slab",
            ()-> new leafSlab(DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final RegistryObject<SlabBlock> GLOWSTONE_SLAB = register("glowstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> BASALT_SLAB = register("basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(POLISHED_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(SMOOTH_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> RAW_GOLD_SLAB = register("raw_gold_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(RAW_GOLD_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> RAW_COPPER_SLAB = register("raw_copper_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(RAW_COPPER_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> RAW_IRON_SLAB = register("raw_iron_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(RAW_IRON_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> COAL_BLOCK_SLAB = register("coal_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null),16000);
    public static final RegistryObject<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> CHISELED_POLISHED_BLACKSTONE_SLAB = register("chiseled_polished_blackstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> DRIPSTONE_SLAB = register("dripstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(DRIPSTONE_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(NETHERRACK).sound(SoundType.NETHERRACK), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> SHROOMLIGHT_SLAB = register("shroomlight_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final RegistryObject<SlabBlock> MAGMA_BLOCK_SLAB = register("magma_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3), false, 0, 0, null));

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
