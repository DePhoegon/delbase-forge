package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.smoothSandStoneSlabEnergy;
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
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabSmoothSandStonesEnergy {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OVERRIDE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(SANDSTONE));
    public static final RegistryObject<SlabBlock> OVERRIDE_RED_SMOOTH_SAND_STONE_SLAB_ENERGY = register("red_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(RED_SANDSTONE));
    public static final RegistryObject<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY = register("blood_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("white_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("orange_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY = register("magenta_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("light_blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB_ENERGY = register("yellow_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB_ENERGY = register("lime_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB_ENERGY = register("pink_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = register("gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = register("light_gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("cyan_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("purple_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("green_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("brown_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final RegistryObject<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY = register("black_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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