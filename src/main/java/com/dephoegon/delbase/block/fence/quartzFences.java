package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.quartzFence;
import com.dephoegon.delbase.aid.block.alt.quartzGateBlock;
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

public class quartzFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> QUARTZ_BRICKS_FENCE = register("quartz_bricks_fence",
            () -> new quartzFence(BlockBehaviour.Properties.copy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final RegistryObject<FenceGateBlock> QUARTZ_BRICKS_FENCE_GATE = register("quartz_bricks_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.copy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final RegistryObject<FenceBlock> QUARTZ_BLOCK_FENCE = register("quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.copy(QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<FenceGateBlock> QUARTZ_BLOCK_FENCE_GATE = register("quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.copy(QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<FenceBlock> SMOOTH_QUARTZ_FENCE = register("smooth_quartz_fence",
            () -> new quartzFence(BlockBehaviour.Properties.copy(SMOOTH_QUARTZ).sound(SoundType.STONE)));
    public static final RegistryObject<FenceGateBlock> SMOOTH_QUARTZ_FENCE_GATE = register("smooth_quartz_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.copy(SMOOTH_QUARTZ).sound(SoundType.STONE)));
    public static final RegistryObject<FenceBlock> CHISELED_QUARTZ_BLOCK_FENCE = register("chiseled_quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.copy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<FenceGateBlock> CHISELED_QUARTZ_BLOCK_FENCE_GATE = register("chiseled_quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.copy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<FenceBlock> QUARTZ_PILLAR_FENCE = register("quartz_pillar_fence",
            () -> new quartzFence(BlockBehaviour.Properties.copy(QUARTZ_PILLAR).sound(SoundType.STONE)));
    public static final RegistryObject<FenceGateBlock> QUARTZ_PILLAR_FENCE_GATE = register("quartz_pillar_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.copy(QUARTZ_PILLAR).sound(SoundType.STONE)));

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
