package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairLeaves {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> OAK_LEAF_STAIR = register("oak_leaf_stair",
            ()-> new stairBlock(OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> SPRUCE_LEAF_STAIR = register("spruce_leaf_stair",
            ()-> new stairBlock(SPRUCE_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> JUNGLE_LEAF_STAIR = register("jungle_leaf_stair",
            ()-> new stairBlock(JUNGLE_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(JUNGLE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> BIRCH_LEAF_STAIR = register("birch_leaf_stair",
            ()-> new stairBlock(BIRCH_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(BIRCH_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> ACACIA_LEAF_STAIR = register("acacia_leaf_stair",
            ()-> new stairBlock(ACACIA_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(ACACIA_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> DARK_OAK_LEAF_STAIR = register("dark_oak_leaf_stair",
            ()-> new stairBlock(DARK_OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(DARK_OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> MANGROVE_LEAF_STAIR = register("mangrove_leaf_stair",
            ()-> new stairBlock(MANGROVE_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(MANGROVE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> AZALEA_LEAF_STAIR = register("azalea_leaf_stair",
            ()-> new stairBlock(OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(AZALEA_LEAVES).sound(SoundType.AZALEA_LEAVES).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
                    ,"","","", true, null));
    public static final RegistryObject<StairBlock> FLOWERING_AZALEA_LEAF_STAIR = register("flowering_azalea_leaf_stair",
            ()-> new stairBlock(OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(FLOWERING_AZALEA_LEAVES).sound(SoundType.FLOWERING_AZALEA).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion()
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
