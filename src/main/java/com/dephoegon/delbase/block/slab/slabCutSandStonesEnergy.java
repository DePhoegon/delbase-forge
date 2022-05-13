package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;

public class slabCutSandStonesEnergy {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OVERRIDE_CUT_SAND_STONE_SLAB_ENERGY = register("cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> OVERRIDE_RED_CUT_SAND_STONE_SLAB_ENERGY = register("red_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB_ENERGY = register("blood_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> WHITE_CUT_SAND_STONE_SLAB_ENERGY = register("white_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB_ENERGY = register("orange_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB_ENERGY = register("magenta_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY = register("light_blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB_ENERGY = register("yellow_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> LIME_CUT_SAND_STONE_SLAB_ENERGY = register("lime_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> PINK_CUT_SAND_STONE_SLAB_ENERGY = register("pink_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> GRAY_CUT_SAND_STONE_SLAB_ENERGY = register("gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY = register("light_gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> CYAN_CUT_SAND_STONE_SLAB_ENERGY = register("cyan_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB_ENERGY = register("purple_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> BLUE_CUT_SAND_STONE_SLAB_ENERGY = register("blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> GREEN_CUT_SAND_STONE_SLAB_ENERGY = register("green_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> BROWN_CUT_SAND_STONE_SLAB_ENERGY = register("brown_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_CUT_SAND_STONE_SLAB_ENERGY = register("black_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE).lightLevel((blockState)-> 5),"","",""));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
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
