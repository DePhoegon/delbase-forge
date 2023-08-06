package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.smoothSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class stairSmoothSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> BLOOD_SMOOTH_SAND_STONE_STAIR = register("blood_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> WHITE_SMOOTH_SAND_STONE_STAIR = register("white_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(WHITE_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> ORANGE_SMOOTH_SAND_STONE_STAIR = register("orange_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> MAGENTA_SMOOTH_SAND_STONE_STAIR = register("magenta_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR = register("light_blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> YELLOW_SMOOTH_SAND_STONE_STAIR = register("yellow_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> LIME_SMOOTH_SAND_STONE_STAIR = register("lime_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIME_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> PINK_SMOOTH_SAND_STONE_STAIR = register("pink_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PINK_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> GRAY_SMOOTH_SAND_STONE_STAIR = register("gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GRAY_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR = register("light_gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> CYAN_SMOOTH_SAND_STONE_STAIR = register("cyan_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(CYAN_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> PURPLE_SMOOTH_SAND_STONE_STAIR = register("purple_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> BLUE_SMOOTH_SAND_STONE_STAIR = register("blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLUE_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> GREEN_SMOOTH_SAND_STONE_STAIR = register("green_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GREEN_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> BROWN_SMOOTH_SAND_STONE_STAIR = register("brown_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BROWN_SAND_STONE.get()));
    public static final RegistryObject<StairBlock> BLACK_SMOOTH_SAND_STONE_STAIR = register("black_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLACK_SAND_STONE.get()));

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