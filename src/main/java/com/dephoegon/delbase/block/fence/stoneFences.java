package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
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

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stoneFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> STONE_FENCE = register("stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> STONE_FENCE_GATE = register("stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> COBBLESTONE_FENCE = register("cobblestone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(COBBLESTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> COBBLESTONE_FENCE_GATE = register("cobblestone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(COBBLESTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> DEEPSLATE_FENCE = register("deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DEEPSLATE).sound(SoundType.DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> DEEPSLATE_FENCE_GATE = register("deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(DEEPSLATE).sound(SoundType.DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> COBBLED_DEEPSLATE_FENCE = register("cobbled_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> COBBLED_DEEPSLATE_FENCE_GATE = register("cobbled_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> DEEPSLATE_TILE_FENCE = register("deepslate_tile_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> DEEPSLATE_TILE_FENCE_GATE = register("deepslate_tile_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> POLISHED_DEEPSLATE_FENCE = register("polished_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> POLISHED_DEEPSLATE_FENCE_GATE = register("polished_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> DEEPSLATE_BRICK_FENCE = register("deepslate_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> DEEPSLATE_BRICK_FENCE_GATE = register("deepslate_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> MUD_BRICK_FENCE = register("mud_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(MUD_BRICKS).sound(SoundType.MUD_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> MUD_BRICK_FENCE_GATE = register("mud_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(MUD_BRICKS).sound(SoundType.MUD_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceBlock> BRICK_FENCE = register("brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final RegistryObject<FenceGateBlock> BRICK_FENCE_GATE = register("brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));

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