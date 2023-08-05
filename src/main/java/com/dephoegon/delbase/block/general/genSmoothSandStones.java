package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class genSmoothSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Block> BLOOD_SMOOTH_SAND_STONE = register("blood_smooth_sand_stone",
            () -> new smoothSandStone(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<Block> WHITE_SMOOTH_SAND_STONE = register("white_smooth_sand_stone",
            () -> new smoothSandStone(WHITE_SAND_STONE.get()));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SAND_STONE = register("orange_smooth_sand_stone",
            () -> new smoothSandStone(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_SAND_STONE = register("magenta_smooth_sand_stone",
            () -> new smoothSandStone(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_SAND_STONE = register("light_blue_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SAND_STONE = register("yellow_smooth_sand_stone",
            () -> new smoothSandStone(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<Block> LIME_SMOOTH_SAND_STONE = register("lime_smooth_sand_stone",
            () -> new smoothSandStone(LIME_SAND_STONE.get()));
    public static final RegistryObject<Block> PINK_SMOOTH_SAND_STONE = register("pink_smooth_sand_stone",
            () -> new smoothSandStone(PINK_SAND_STONE.get()));
    public static final RegistryObject<Block> GRAY_SMOOTH_SAND_STONE = register("gray_smooth_sand_stone",
            () -> new smoothSandStone(GRAY_SAND_STONE.get()));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_SAND_STONE = register("light_gray_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<Block> CYAN_SMOOTH_SAND_STONE = register("cyan_smooth_sand_stone",
            () -> new smoothSandStone(CYAN_SAND_STONE.get()));
    public static final RegistryObject<Block> PURPLE_SMOOTH_SAND_STONE = register("purple_smooth_sand_stone",
            () -> new smoothSandStone(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<Block> BLUE_SMOOTH_SAND_STONE = register("blue_smooth_sand_stone",
            () -> new smoothSandStone(BLUE_SAND_STONE.get()));
    public static final RegistryObject<Block> GREEN_SMOOTH_SAND_STONE = register("green_smooth_sand_stone",
            () -> new smoothSandStone(GREEN_SAND_STONE.get()));
    public static final RegistryObject<Block> BROWN_SMOOTH_SAND_STONE = register("brown_smooth_sand_stone",
            () -> new smoothSandStone(BROWN_SAND_STONE.get()));
    public static final RegistryObject<Block> BLACK_SMOOTH_SAND_STONE = register("black_smooth_sand_stone",
            () -> new smoothSandStone(BLACK_SAND_STONE.get()));

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