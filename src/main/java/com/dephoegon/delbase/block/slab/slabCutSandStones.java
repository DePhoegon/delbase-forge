package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;

public class slabCutSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB = register("blood_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_CUT_SAND_STONE_SLAB = register("white_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB = register("orange_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB = register("magenta_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB = register("light_blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB = register("yellow_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIME_CUT_SAND_STONE_SLAB = register("lime_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> PINK_CUT_SAND_STONE_SLAB = register("pink_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> GRAY_CUT_SAND_STONE_SLAB = register("gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB = register("light_gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> CYAN_CUT_SAND_STONE_SLAB = register("cyan_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB = register("purple_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLUE_CUT_SAND_STONE_SLAB = register("blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> GREEN_CUT_SAND_STONE_SLAB = register("green_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BROWN_CUT_SAND_STONE_SLAB = register("brown_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_CUT_SAND_STONE_SLAB = register("black_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));

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
