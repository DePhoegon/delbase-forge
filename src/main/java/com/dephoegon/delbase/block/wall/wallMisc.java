package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.leafWall;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
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

public class wallMisc {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> END_STONE_WALL = register("end_stone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(END_STONE).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> BONE_BLOCK_WALL = register("bone_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> DRIED_KELP_WALL = register("dried_kelp_wall",
            () -> new leafWall(DRIED_KELP_BLOCK, SoundType.GRASS,
                    true, null),4001);
    public static final RegistryObject<WallBlock> GLOWSTONE_WALL = register("glowstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> BASALT_WALL = register("basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> COBBLED_BASALT_WALL = register("cobbled_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BASALT).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(POLISHED_BASALT).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(SMOOTH_BASALT).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> RAW_GOLD_WALL = register("raw_gold_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> RAW_COPPER_WALL = register("raw_copper_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(RAW_COPPER_BLOCK).sound(SoundType.METAL),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> RAW_IRON_WALL = register("raw_iron_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> COAL_BLOCK_WALL = register("coal_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(COAL_BLOCK).sound(SoundType.WOOD),
                    "","","",true, 15, 30, null),16000);
    public static final RegistryObject<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> CHISELED_POLISHED_BLACKSTONE_WALL = register("chiseled_polished_blackstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> DRIPSTONE_WALL = register("dripstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(DRIPSTONE_BLOCK).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> PURPUR_BLOCK_WALL = register("purpur_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(PURPUR_BLOCK).sound(SoundType.STONE),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> NETHERRACK_WALL = register("netherrack_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> SHROOMLIGHT_WALL = register("shroomlight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> MAGMA_BLOCK_WALL = register("magma_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> PACKED_MUD_WALL = register("packed_mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(PACKED_MUD).sound(SoundType.PACKED_MUD),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> SCULK_WALL = register("sculk_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(SCULK).sound(SoundType.SCULK),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> MUD_WALL = register("mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(MUD).sound(SoundType.MUD),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> MUDDY_MANGROVE_ROOT_WALL = register("muddy_mangrove_root_wall",
            () -> new leafWall(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final RegistryObject<WallBlock> MANGROVE_ROOT_WALL = register("mangrove_root_wall",
            () -> new leafWall(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, true, null));
    public static final RegistryObject<WallBlock> OCHRE_FROGLIGHT_WALL = register("ochre_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> VERDANT_FROGLIGHT_WALL = register("verdant_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15),
                    "","","",false, 0, 0, null));
    public static final RegistryObject<WallBlock> PEARLESCENT_FROGLIGHT_WALL = register("pearlescent_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15),
                    "","","",false, 0, 0, null));

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