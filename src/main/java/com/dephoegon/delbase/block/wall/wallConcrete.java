package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.concreteWall;
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

public class wallConcrete {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> RED_CONCRETE_WALL = register("red_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(RED_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> WHITE_CONCRETE_WALL = register("white_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(WHITE_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> ORANGE_CONCRETE_WALL = register("orange_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(ORANGE_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(MAGENTA_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(LIGHT_BLUE_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> YELLOW_CONCRETE_WALL = register("yellow_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(YELLOW_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIME_CONCRETE_WALL = register("lime_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(LIME_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PINK_CONCRETE_WALL = register("pink_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(PINK_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GRAY_CONCRETE_WALL = register("gray_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(GRAY_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(LIGHT_GRAY_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> CYAN_CONCRETE_WALL = register("cyan_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(CYAN_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PURPLE_CONCRETE_WALL = register("purple_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(PURPLE_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLUE_CONCRETE_WALL = register("blue_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(BLUE_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GREEN_CONCRETE_WALL = register("green_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(GREEN_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BROWN_CONCRETE_WALL = register("brown_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(BROWN_CONCRETE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLACK_CONCRETE_WALL = register("black_concrete_wall",
            () -> new concreteWall(BlockBehaviour.Properties.copy(BLACK_CONCRETE).sound(SoundType.STONE),"","",""));


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
