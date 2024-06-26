package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.sandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class wallSandStone {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> BLOOD_SAND_STONE_WALL = register("blood_sand_stone_wall",
            () -> new sandStoneWall(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> WHITE_SAND_STONE_WALL = register("white_sand_stone_wall",
            () -> new sandStoneWall(WHITE_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> ORANGE_SAND_STONE_WALL = register("orange_sand_stone_wall",
            () -> new sandStoneWall(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> MAGENTA_SAND_STONE_WALL = register("magenta_sand_stone_wall",
            () -> new sandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_SAND_STONE_WALL = register("light_blue_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> YELLOW_SAND_STONE_WALL = register("yellow_sand_stone_wall",
            () -> new sandStoneWall(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> LIME_SAND_STONE_WALL = register("lime_sand_stone_wall",
            () -> new sandStoneWall(LIME_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> PINK_SAND_STONE_WALL = register("pink_sand_stone_wall",
            () -> new sandStoneWall(PINK_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> GRAY_SAND_STONE_WALL = register("gray_sand_stone_wall",
            () -> new sandStoneWall(GRAY_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_SAND_STONE_WALL = register("light_gray_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> CYAN_SAND_STONE_WALL = register("cyan_sand_stone_wall",
            () -> new sandStoneWall(CYAN_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> PURPLE_SAND_STONE_WALL = register("purple_sand_stone_wall",
            () -> new sandStoneWall(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> BLUE_SAND_STONE_WALL = register("blue_sand_stone_wall",
            () -> new sandStoneWall(BLUE_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> GREEN_SAND_STONE_WALL = register("green_sand_stone_wall",
            () -> new sandStoneWall(GREEN_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> BROWN_SAND_STONE_WALL = register("brown_sand_stone_wall",
            () -> new sandStoneWall(BROWN_SAND_STONE.get()));
    public static final RegistryObject<WallBlock> BLACK_SAND_STONE_WALL = register("black_sand_stone_wall",
            () -> new sandStoneWall(BLACK_SAND_STONE.get()));

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