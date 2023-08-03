package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.cutSandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;

public class wallCutSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> OVERRIDE_CUT_SAND_STONE_WALL = register("cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> OVERRIDE_RED_CUT_SAND_STONE_WALL = register("red_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> BLOOD_CUT_SAND_STONE_WALL = register("blood_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> WHITE_CUT_SAND_STONE_WALL = register("white_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> ORANGE_CUT_SAND_STONE_WALL = register("orange_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> MAGENTA_CUT_SAND_STONE_WALL = register("magenta_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CUT_SAND_STONE_WALL = register("light_blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> YELLOW_CUT_SAND_STONE_WALL = register("yellow_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> LIME_CUT_SAND_STONE_WALL = register("lime_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> PINK_CUT_SAND_STONE_WALL = register("pink_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> GRAY_CUT_SAND_STONE_WALL = register("gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CUT_SAND_STONE_WALL = register("light_gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> CYAN_CUT_SAND_STONE_WALL = register("cyan_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> PURPLE_CUT_SAND_STONE_WALL = register("purple_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> BLUE_CUT_SAND_STONE_WALL = register("blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> GREEN_CUT_SAND_STONE_WALL = register("green_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> BROWN_CUT_SAND_STONE_WALL = register("brown_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> BLACK_CUT_SAND_STONE_WALL = register("black_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CUT_SANDSTONE));

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
