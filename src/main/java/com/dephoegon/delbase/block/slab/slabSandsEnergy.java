package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
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

public class slabSandsEnergy {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OVERRIDE_SAND_SLAB_ENERGY = register("sand_slab_energy",
            () -> new sandSlabEnergy(SAND));
    public static final RegistryObject<SlabBlock> OVERRIDE_RED_SAND_SLAB_ENERGY = register("red_sand_slab_energy",
            () -> new sandSlabEnergy(RED_SAND));
    public static final RegistryObject<SlabBlock> BLOOD_SAND_SLAB_ENERGY = register("blood_sand_slab_energy",
            () -> new sandSlabEnergy(BLOOD_SAND.get()));
    public static final RegistryObject<SlabBlock> WHITE_SAND_SLAB_ENERGY = register("white_sand_slab_energy",
            () -> new sandSlabEnergy(WHITE_SAND.get()));
    public static final RegistryObject<SlabBlock> ORANGE_SAND_SLAB_ENERGY = register("orange_sand_slab_energy",
            () -> new sandSlabEnergy(ORANGE_SAND.get()));
    public static final RegistryObject<SlabBlock> MAGENTA_SAND_SLAB_ENERGY = register("magenta_sand_slab_energy",
            () -> new sandSlabEnergy(MAGENTA_SAND.get()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_SAND_SLAB_ENERGY = register("light_blue_sand_slab_energy",
            () -> new sandSlabEnergy(LIGHT_BLUE_SAND.get()));
    public static final RegistryObject<SlabBlock> YELLOW_SAND_SLAB_ENERGY = register("yellow_sand_slab_energy",
            () -> new sandSlabEnergy(YELLOW_SAND.get()));
    public static final RegistryObject<SlabBlock> LIME_SAND_SLAB_ENERGY = register("lime_sand_slab_energy",
            () -> new sandSlabEnergy(LIME_SAND.get()));
    public static final RegistryObject<SlabBlock> PINK_SAND_SLAB_ENERGY = register("pink_sand_slab_energy",
            () -> new sandSlabEnergy(PINK_SAND.get()));
    public static final RegistryObject<SlabBlock> GRAY_SAND_SLAB_ENERGY = register("gray_sand_slab_energy",
            () -> new sandSlabEnergy(GRAY_SAND.get()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_SAND_SLAB_ENERGY = register("light_gray_sand_slab_energy",
            () -> new sandSlabEnergy(LIGHT_GRAY_SAND.get()));
    public static final RegistryObject<SlabBlock> CYAN_SAND_SLAB_ENERGY = register("cyan_sand_slab_energy",
            () -> new sandSlabEnergy(CYAN_SAND.get()));
    public static final RegistryObject<SlabBlock> PURPLE_SAND_SLAB_ENERGY = register("purple_sand_slab_energy",
            () -> new sandSlabEnergy(PURPLE_SAND.get()));
    public static final RegistryObject<SlabBlock> BLUE_SAND_SLAB_ENERGY = register("blue_sand_slab_energy",
            () -> new sandSlabEnergy(BLUE_SAND.get()));
    public static final RegistryObject<SlabBlock> GREEN_SAND_SLAB_ENERGY = register("green_sand_slab_energy",
            () -> new sandSlabEnergy(GREEN_SAND.get()));
    public static final RegistryObject<SlabBlock> BROWN_SAND_SLAB_ENERGY = register("brown_sand_slab_energy",
            () -> new sandSlabEnergy(BROWN_SAND.get()));
    public static final RegistryObject<SlabBlock> BLACK_SAND_SLAB_ENERGY = register("black_sand_slab_energy",
            () -> new sandSlabEnergy(BLACK_SAND.get()));

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