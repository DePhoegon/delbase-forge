package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
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
import static net.minecraft.world.level.block.Blocks.*;

public class slabLeaves {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> OAK_LEAF_SLAB = register("oak_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> SPRUCE_LEAF_SLAB = register("spruce_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(SPRUCE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> JUNGLE_LEAF_SLAB = register("jungle_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(JUNGLE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> BIRCH_LEAF_SLAB = register("birch_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(BIRCH_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> ACACIA_LEAF_SLAB = register("acacia_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(ACACIA_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> DARK_OAK_LEAF_SLAB = register("dark_oak_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(DARK_OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> MANGROVE_LEAF_SLAB = register("mangrove_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(MANGROVE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> AZALEA_LEAF_SLAB = register("azalea_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(AZALEA_LEAVES).sound(SoundType.AZALEA_LEAVES).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<SlabBlock> FLOWERING_AZALEA_LEAF_SLAB = register("flowering_azalea_leaf_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.copy(FLOWERING_AZALEA_LEAVES).sound(SoundType.FLOWERING_AZALEA).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));

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
