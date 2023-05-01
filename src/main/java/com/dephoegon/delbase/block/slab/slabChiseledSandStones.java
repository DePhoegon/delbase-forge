package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlab;
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
import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;

public class slabChiseledSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OVERRIDE_CHISELED_SAND_STONE_SLAB = register("chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> OVERRIDE_RED_CHISELED_SAND_STONE_SLAB = register("red_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLOOD_CHISELED_SAND_STONE_SLAB = register("blood_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_CHISELED_SAND_STONE_SLAB = register("white_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_CHISELED_SAND_STONE_SLAB = register("orange_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> MAGENTA_CHISELED_SAND_STONE_SLAB = register("magenta_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CHISELED_SAND_STONE_SLAB = register("light_blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> YELLOW_CHISELED_SAND_STONE_SLAB = register("yellow_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIME_CHISELED_SAND_STONE_SLAB = register("lime_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> PINK_CHISELED_SAND_STONE_SLAB = register("pink_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> GRAY_CHISELED_SAND_STONE_SLAB = register("gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CHISELED_SAND_STONE_SLAB = register("light_gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> CYAN_CHISELED_SAND_STONE_SLAB = register("cyan_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> PURPLE_CHISELED_SAND_STONE_SLAB = register("purple_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLUE_CHISELED_SAND_STONE_SLAB = register("blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> GREEN_CHISELED_SAND_STONE_SLAB = register("green_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BROWN_CHISELED_SAND_STONE_SLAB = register("brown_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_CHISELED_SAND_STONE_SLAB = register("black_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));

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
