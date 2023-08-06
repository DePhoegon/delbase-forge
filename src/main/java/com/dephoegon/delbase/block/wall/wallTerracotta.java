package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.terracottaWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallTerracotta {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> WHITE_TERRACOTTA_WALL = register("white_terracotta_wall",
            () -> new terracottaWall(WHITE_TERRACOTTA));
    public static final RegistryObject<WallBlock> ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall",
            () -> new terracottaWall(ORANGE_TERRACOTTA));
    public static final RegistryObject<WallBlock> MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall",
            () -> new terracottaWall(MAGENTA_TERRACOTTA));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall",
            () -> new terracottaWall(LIGHT_BLUE_TERRACOTTA));
    public static final RegistryObject<WallBlock> YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall",
            () -> new terracottaWall(YELLOW_TERRACOTTA));
    public static final RegistryObject<WallBlock> LIME_TERRACOTTA_WALL = register("lime_terracotta_wall",
            () -> new terracottaWall(LIME_TERRACOTTA));
    public static final RegistryObject<WallBlock> PINK_TERRACOTTA_WALL = register("pink_terracotta_wall",
            () -> new terracottaWall(PINK_TERRACOTTA));
    public static final RegistryObject<WallBlock> GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall",
            () -> new terracottaWall(GRAY_TERRACOTTA));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall",
            () -> new terracottaWall(LIGHT_GRAY_TERRACOTTA));
    public static final RegistryObject<WallBlock> CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall",
            () -> new terracottaWall(CYAN_TERRACOTTA));
    public static final RegistryObject<WallBlock> PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall",
            () -> new terracottaWall(PURPLE_TERRACOTTA));
    public static final RegistryObject<WallBlock> BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall",
            () -> new terracottaWall(BLUE_TERRACOTTA));
    public static final RegistryObject<WallBlock> BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall",
            () -> new terracottaWall(BROWN_TERRACOTTA));
    public static final RegistryObject<WallBlock> GREEN_TERRACOTTA_WALL = register("green_terracotta_wall",
            () -> new terracottaWall(GREEN_TERRACOTTA));
    public static final RegistryObject<WallBlock> RED_TERRACOTTA_WALL = register("red_terracotta_wall",
            () -> new terracottaWall(RED_TERRACOTTA));
    public static final RegistryObject<WallBlock> BLACK_TERRACOTTA_WALL = register("black_terracotta_wall",
            () -> new terracottaWall(BLACK_TERRACOTTA));
    public static final RegistryObject<WallBlock> TERRACOTTA_WALL = register("terracotta_wall",
            () -> new terracottaWall(TERRACOTTA));

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