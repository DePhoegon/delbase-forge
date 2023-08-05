package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.leafStair;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
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

public class stairMisc {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> END_STONE_STAIR = register("end_stone_stair",
            ()-> new stairBlock(END_STONE, BlockBehaviour.Properties.copy(END_STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> BONE_BLOCK_STAIR = register("bone_block_stair",
            ()-> new stairBlock(BONE_BLOCK, BlockBehaviour.Properties.copy(BONE_BLOCK).sound(SoundType.BONE_BLOCK), false, 0, 0, null));
    public static final RegistryObject<StairBlock> DRIED_KELP_STAIR = register("dried_kelp_stair",
            ()-> new leafStair(DRIED_KELP_BLOCK, DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final RegistryObject<StairBlock> GLOWSTONE_STAIR = register("glowstone_stair",
            ()-> new stairBlock(GLOWSTONE, BlockBehaviour.Properties.copy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15), false, 0, 0, null));
    public static final RegistryObject<StairBlock> BASALT_STAIR = register("basalt_stair",
            ()-> new stairBlock(BASALT, BlockBehaviour.Properties.copy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> POLISHED_BASALT_STAIR = register("polished_basalt_stair",
            ()-> new stairBlock(POLISHED_BASALT, BlockBehaviour.Properties.copy(POLISHED_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> SMOOTH_BASALT_STAIR = register("smooth_basalt_stair",
            ()-> new stairBlock(SMOOTH_BASALT, BlockBehaviour.Properties.copy(SMOOTH_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> COBBLED_BASALT_STAIR = register("cobbled_basalt_stair",
            ()-> new stairBlock(BASALT, BlockBehaviour.Properties.copy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> RAW_GOLD_STAIR = register("raw_gold_stair",
            ()-> new stairBlock(RAW_GOLD_BLOCK, BlockBehaviour.Properties.copy(RAW_GOLD_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<StairBlock> RAW_COPPER_STAIR = register("raw_copper_stair",
            ()-> new stairBlock(RAW_COPPER_BLOCK, BlockBehaviour.Properties.copy(RAW_COPPER_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<StairBlock> RAW_IRON_STAIR = register("raw_iron_stair",
            ()-> new stairBlock(RAW_IRON_BLOCK, BlockBehaviour.Properties.copy(RAW_IRON_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final RegistryObject<StairBlock> COAL_BLOCK_STAIR = register("coal_block_stair",
            ()-> new stairBlock(COAL_BLOCK, BlockBehaviour.Properties.copy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null),16000);
    public static final RegistryObject<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIR = register("cracked_polished_blackstone_brick_stair",
            ()-> new stairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS, BlockBehaviour.Properties.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> CHISELED_POLISHED_BLACKSTONE_STAIR = register("chiseled_polished_blackstone_stair",
            ()-> new stairBlock(CHISELED_POLISHED_BLACKSTONE, BlockBehaviour.Properties.copy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> DRIPSTONE_STAIR = register("dripstone_stair",
            ()-> new stairBlock(DRIPSTONE_BLOCK, BlockBehaviour.Properties.copy(DRIPSTONE_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final RegistryObject<StairBlock> NETHERRACK_STAIR = register("netherrack_stair",
            ()-> new stairBlock(NETHERRACK, BlockBehaviour.Properties.copy(NETHERRACK).sound(SoundType.NETHERRACK), false, 0, 0, null));
    public static final RegistryObject<StairBlock> SHROOMLIGHT_STAIR = register("shroomlight_stair",
            ()-> new stairBlock(SHROOMLIGHT, BlockBehaviour.Properties.copy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final RegistryObject<StairBlock> MAGMA_BLOCK_STAIR = register("magma_block_stair",
            ()-> new stairBlock(MAGMA_BLOCK, BlockBehaviour.Properties.copy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3), false, 0, 0, null));
    public static final RegistryObject<StairBlock> PACKED_MUD_STAIR = register("packed_mud_stair",
            ()-> new stairBlock(PACKED_MUD, BlockBehaviour.Properties.copy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final RegistryObject<StairBlock> SCULK_STAIR = register("sculk_stair",
            ()-> new stairBlock(SCULK, BlockBehaviour.Properties.copy(SCULK).sound(SoundType.SCULK), false, 0, 0, null));
    public static final RegistryObject<StairBlock> MUD_STAIR = register("mud_stair",
            ()-> new stairBlock(MUD, BlockBehaviour.Properties.copy(MUD).sound(SoundType.MUD), false, 0, 0, null));
    public static final RegistryObject<StairBlock> MUDDY_MANGROVE_ROOT_STAIR = register("muddy_mangrove_root_stair",
            ()-> new leafStair(MANGROVE_PLANKS, MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final RegistryObject<StairBlock> MANGROVE_ROOT_STAIR = register("mangrove_root_stair",
            ()-> new leafStair(MANGROVE_PLANKS, MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, true, null));
    public static final RegistryObject<StairBlock> OCHRE_FROGLIGHT_STAIR = register("ochre_froglight_stair",
            ()-> new stairBlock(OCHRE_FROGLIGHT, BlockBehaviour.Properties.copy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final RegistryObject<StairBlock> VERDANT_FROGLIGHT_STAIR = register("verdant_froglight_stair",
            ()-> new stairBlock(VERDANT_FROGLIGHT, BlockBehaviour.Properties.copy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final RegistryObject<StairBlock> PEARLESCENT_FROGLIGHT_STAIR = register("pearlescent_froglight_stair",
            ()-> new stairBlock(PEARLESCENT_FROGLIGHT, BlockBehaviour.Properties.copy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));

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
