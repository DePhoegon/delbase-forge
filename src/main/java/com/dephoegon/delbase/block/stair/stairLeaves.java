package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.leafStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairLeaves {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> OAK_LEAF_STAIR = register("oak_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> SPRUCE_LEAF_STAIR = register("spruce_leaf_stair",
            ()-> new leafStair(SPRUCE_STAIRS, SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> JUNGLE_LEAF_STAIR = register("jungle_leaf_stair",
            ()-> new leafStair(JUNGLE_STAIRS, JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> BIRCH_LEAF_STAIR = register("birch_leaf_stair",
            ()-> new leafStair(BIRCH_STAIRS, BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> ACACIA_LEAF_STAIR = register("acacia_leaf_stair",
            ()-> new leafStair(ACACIA_STAIRS, ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> DARK_OAK_LEAF_STAIR = register("dark_oak_leaf_stair",
            ()-> new leafStair(DARK_OAK_STAIRS, DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> MANGROVE_LEAF_STAIR = register("mangrove_leaf_stair",
            ()-> new leafStair(MANGROVE_STAIRS, MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final RegistryObject<StairBlock> CHERRY_LEAF_STAIR = register("cherry_leaf_stair",
            ()-> new leafStair(CHERRY_STAIRS, CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final RegistryObject<StairBlock> AZALEA_LEAF_STAIR = register("azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final RegistryObject<StairBlock> FLOWERING_AZALEA_LEAF_STAIR = register("flowering_azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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