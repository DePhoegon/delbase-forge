package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class slabSands {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OVERRIDE_SAND_SLAB = register("sand_slab",
            () -> new sandSlab(SAND));
    public static final RegistryObject<SlabBlock> OVERRIDE_RED_SAND_SLAB = register("red_sand_slab",
            () -> new sandSlab(RED_SAND));
    public static final RegistryObject<SlabBlock> BLOOD_SAND_SLAB = register("blood_sand_slab",
            () -> new sandSlab(BLOOD_SAND.get()));
    public static final RegistryObject<SlabBlock> WHITE_SAND_SLAB = register("white_sand_slab",
            () -> new sandSlab(WHITE_SAND.get()));
    public static final RegistryObject<SlabBlock> ORANGE_SAND_SLAB = register("orange_sand_slab",
            () -> new sandSlab(ORANGE_SAND.get()));
    public static final RegistryObject<SlabBlock> MAGENTA_SAND_SLAB = register("magenta_sand_slab",
            () -> new sandSlab(MAGENTA_SAND.get()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_SAND_SLAB = register("light_blue_sand_slab",
            () -> new sandSlab(LIGHT_BLUE_SAND.get()));
    public static final RegistryObject<SlabBlock> YELLOW_SAND_SLAB = register("yellow_sand_slab",
            () -> new sandSlab(YELLOW_SAND.get()));
    public static final RegistryObject<SlabBlock> LIME_SAND_SLAB = register("lime_sand_slab",
            () -> new sandSlab(LIME_SAND.get()));
    public static final RegistryObject<SlabBlock> PINK_SAND_SLAB = register("pink_sand_slab",
            () -> new sandSlab(PINK_SAND.get()));
    public static final RegistryObject<SlabBlock> GRAY_SAND_SLAB = register("gray_sand_slab",
            () -> new sandSlab(GRAY_SAND.get()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_SAND_SLAB = register("light_gray_sand_slab",
            () -> new sandSlab(LIGHT_GRAY_SAND.get()));
    public static final RegistryObject<SlabBlock> CYAN_SAND_SLAB = register("cyan_sand_slab",
            () -> new sandSlab(CYAN_SAND.get()));
    public static final RegistryObject<SlabBlock> PURPLE_SAND_SLAB = register("purple_sand_slab",
            () -> new sandSlab(PURPLE_SAND.get()));
    public static final RegistryObject<SlabBlock> BLUE_SAND_SLAB = register("blue_sand_slab",
            () -> new sandSlab(BLUE_SAND.get()));
    public static final RegistryObject<SlabBlock> GREEN_SAND_SLAB = register("green_sand_slab",
            () -> new sandSlab(GREEN_SAND.get()));
    public static final RegistryObject<SlabBlock> BROWN_SAND_SLAB = register("brown_sand_slab",
            () -> new sandSlab(BROWN_SAND.get()));
    public static final RegistryObject<SlabBlock> BLACK_SAND_SLAB = register("black_sand_slab",
            () -> new sandSlab(BLACK_SAND.get()));

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