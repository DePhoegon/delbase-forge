package com.dephoegon.delbase.block.miscBlock;

import com.dephoegon.delbase.aid.block.stock.axisBlock;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class overrideHook {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_SPRUCE_LOG = register("spruce_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(SPRUCE_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_SPRUCE_WOOD = register("spruce_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_OAK_LOG = register("oak_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(OAK_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_OAK_WOOD = register("oak_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_DARK_OAK_LOG = register("dark_oak_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(DARK_OAK_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_DARK_OAK_WOOD = register("dark_oak_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_ACACIA_LOG = register("acacia_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(ACACIA_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_ACACIA_WOOD = register("acacia_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_JUNGLE_LOG = register("jungle_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(JUNGLE_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_JUNGLE_WOOD = register("jungle_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_BIRCH_LOG = register("birch_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(BIRCH_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_BIRCH_WOOD = register("birch_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_SPRUCE_LOG = register("stripped_spruce_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_SPRUCE_WOOD = register("stripped_spruce_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_OAK_LOG = register("stripped_oak_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_OAK_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_OAK_WOOD = register("stripped_oak_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_DARK_OAK_LOG = register("stripped_dark_oak_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_DARK_OAK_WOOD = register("stripped_dark_oak_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_ACACIA_LOG = register("stripped_acacia_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_ACACIA_WOOD = register("stripped_acacia_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_JUNGLE_LOG = register("stripped_jungle_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_JUNGLE_WOOD = register("stripped_jungle_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_BIRCH_LOG = register("stripped_birch_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_LOG).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<RotatedPillarBlock> OVERRIDE_STRIPPED_BIRCH_WOOD = register("stripped_birch_wood",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_SPRUCE_PLANKS = register("spruce_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(SPRUCE_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_OAK_PLANKS = register("oak_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_DARK_OAK_PLANKS = register("dark_oak_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(DARK_OAK_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_ACACIA_PLANKS = register("acacia_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(ACACIA_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_JUNGLE_PLANKS = register("jungle_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(JUNGLE_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<Block> OVERRIDE_BIRCH_PLANKS = register("birch_planks",
            ()-> new genBlock(BlockBehaviour.Properties.copy(BIRCH_PLANKS).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<SlabBlock> OVERRIDE_SPRUCE_SLAB = register("spruce_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(SPRUCE_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<SlabBlock> OVERRIDE_OAK_SLAB = register("oak_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(OAK_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<SlabBlock> OVERRIDE_DARK_OAK_SLAB = register("dark_oak_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(DARK_OAK_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<SlabBlock> OVERRIDE_ACACIA_SLAB = register("acacia_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(ACACIA_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<SlabBlock> OVERRIDE_JUNGLE_SLAB = register("jungle_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(JUNGLE_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<SlabBlock> OVERRIDE_BIRCH_SLAB = register("birch_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(BIRCH_SLAB).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_SPRUCE_STAIRS = register("spruce_stairs",
            ()-> new stairBlock(SPRUCE_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_STAIRS).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_OAK_STAIRS = register("oak_stairs",
            ()-> new stairBlock(OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(OAK_STAIRS).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_DARK_OAK_STAIRS = register("dark_oak_stairs",
            ()-> new stairBlock(DARK_OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(DARK_OAK_STAIRS).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_ACACIA_STAIRS = register("acacia_stairs",
            ()-> new stairBlock(ACACIA_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(ACACIA_STAIRS).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_JUNGLE_STAIRS = register("jungle_stairs",
            ()-> new stairBlock(JUNGLE_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(JUNGLE_STAIRS).sound(SoundType.WOOD),"","","", true, null));
    public static final RegistryObject<StairBlock> OVERRIDE_BIRCH_STAIRS = register("birch_stairs",
            ()-> new stairBlock(BIRCH_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(BIRCH_STAIRS).sound(SoundType.WOOD),"","","", true, null));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
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
