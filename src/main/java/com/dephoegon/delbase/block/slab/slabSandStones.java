package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandStoneSlab;
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

public class slabSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> BLOOD_SAND_STONE_SLAB = register("blood_sand_stone_slab",
            () -> new sandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> WHITE_SAND_STONE_SLAB = register("white_sand_stone_slab",
            () -> new sandStoneSlab(WHITE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> ORANGE_SAND_STONE_SLAB = register("orange_sand_stone_slab",
            () -> new sandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> MAGENTA_SAND_STONE_SLAB = register("magenta_sand_stone_slab",
            () -> new sandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_SAND_STONE_SLAB = register("light_blue_sand_stone_slab",
            () -> new sandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> YELLOW_SAND_STONE_SLAB = register("yellow_sand_stone_slab",
            () -> new sandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIME_SAND_STONE_SLAB = register("lime_sand_stone_slab",
            () -> new sandStoneSlab(LIME_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PINK_SAND_STONE_SLAB = register("pink_sand_stone_slab",
            () -> new sandStoneSlab(PINK_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GRAY_SAND_STONE_SLAB = register("gray_sand_stone_slab",
            () -> new sandStoneSlab(GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_SAND_STONE_SLAB = register("light_gray_sand_stone_slab",
            () -> new sandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> CYAN_SAND_STONE_SLAB = register("cyan_sand_stone_slab",
            () -> new sandStoneSlab(CYAN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PURPLE_SAND_STONE_SLAB = register("purple_sand_stone_slab",
            () -> new sandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLUE_SAND_STONE_SLAB = register("blue_sand_stone_slab",
            () -> new sandStoneSlab(BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GREEN_SAND_STONE_SLAB = register("green_sand_stone_slab",
            () -> new sandStoneSlab(GREEN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BROWN_SAND_STONE_SLAB = register("brown_sand_stone_slab",
            () -> new sandStoneSlab(BROWN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLACK_SAND_STONE_SLAB = register("black_sand_stone_slab",
            () -> new sandStoneSlab(BLACK_SAND_STONE.get()));

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