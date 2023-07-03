package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.quartzWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallQuartz {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> QUARTZ_WALL = register("quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.copy(QUARTZ_BLOCK).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.copy(SMOOTH_QUARTZ).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.copy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall",
            () -> new quartzWall(BlockBehaviour.Properties.copy(QUARTZ_BRICKS).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> QUARTZ_PILLAR_WALL = register("quartz_pillar_wall",
            () -> new quartzWall(BlockBehaviour.Properties.copy(QUARTZ_PILLAR).sound(SoundType.STONE),"","",""));

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
