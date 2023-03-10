package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.sandWall;
import net.minecraft.world.item.BlockItem;
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

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.SAND;

public class wallSands {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> OVERRIDE_SAND_WALL = register("sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> OVERRIDE_RED_SAND_WALL = register("red_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> BLOOD_SAND_WALL = register("blood_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> WHITE_SAND_WALL = register("white_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> ORANGE_SAND_WALL = register("orange_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> MAGENTA_SAND_WALL = register("magenta_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_SAND_WALL = register("light_blue_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> YELLOW_SAND_WALL = register("yellow_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> LIME_SAND_WALL = register("lime_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> PINK_SAND_WALL = register("pink_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> GRAY_SAND_WALL = register("gray_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_SAND_WALL = register("light_gray_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> CYAN_SAND_WALL = register("cyan_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> PURPLE_SAND_WALL = register("purple_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> BLUE_SAND_WALL = register("blue_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> GREEN_SAND_WALL = register("green_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> BROWN_SAND_WALL = register("brown_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));
    public static final RegistryObject<WallBlock> BLACK_SAND_WALL = register("black_sand_wall",
            () -> new sandWall(BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"","",""));

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
