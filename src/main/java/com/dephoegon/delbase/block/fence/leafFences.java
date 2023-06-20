package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
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

public class leafFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> OAK_LEAF_FENCE = register("oak_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> OAK_LEAF_FENCE_GATE = register("oak_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> SPRUCE_LEAF_FENCE = register("spruce_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(SPRUCE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> SPRUCE_LEAF_FENCE_GATE = register("spruce_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(SPRUCE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> BIRCH_LEAF_FENCE = register("birch_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(BIRCH_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> BIRCH_LEAF_FENCE_GATE = register("birch_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(BIRCH_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> ACACIA_LEAF_FENCE = register("acacia_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(ACACIA_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> ACACIA_LEAF_FENCE_GATE = register("acacia_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(ACACIA_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> JUNGLE_LEAF_FENCE = register("jungle_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(JUNGLE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> JUNGLE_LEAF_FENCE_GATE = register("jungle_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(JUNGLE_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> DARK_OAK_LEAF_FENCE = register("dark_oak_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DARK_OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> DARK_OAK_LEAF_FENCE_GATE = register("dark_oak_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(DARK_OAK_LEAVES).sound(SoundType.GRASS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> AZALEA_LEAF_FENCE = register("azalea_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(AZALEA_LEAVES).sound(SoundType.AZALEA_LEAVES).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> AZALEA_LEAF_FENCE_GATE = register("azalea_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(AZALEA_LEAVES).sound(SoundType.AZALEA_LEAVES).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceBlock> FLOWERING_AZALEA_LEAF_FENCE = register("flowering_azalea_leaf_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(FLOWERING_AZALEA_LEAVES).sound(SoundType.FLOWERING_AZALEA).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));
    public static final RegistryObject<FenceGateBlock> FLOWERING_AZALEA_LEAF_FENCE_GATE = register("flowering_azalea_leaf_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(FLOWERING_AZALEA_LEAVES).sound(SoundType.FLOWERING_AZALEA).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", true, null));

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
