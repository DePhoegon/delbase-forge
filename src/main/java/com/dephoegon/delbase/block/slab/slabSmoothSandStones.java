package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.smoothSandStoneSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class slabSmoothSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB = register("blood_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB = register("white_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB = register("orange_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB = register("magenta_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB = register("light_blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB = register("yellow_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB = register("lime_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIME_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB = register("pink_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PINK_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB = register("gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB = register("light_gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB = register("cyan_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB = register("purple_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB = register("blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB = register("green_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB = register("brown_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB = register("black_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLACK_SAND_STONE.get()));

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