package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.chiseledSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class genChiseledSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Block> BLOOD_CHISELED_SAND_STONE = register("blood_chiseled_sand_stone",
            () -> new chiseledSandStone(BLOOD_SAND_STONE.get()));
    public static final RegistryObject<Block> WHITE_CHISELED_SAND_STONE = register("white_chiseled_sand_stone",
            () -> new chiseledSandStone(WHITE_SAND_STONE.get()));
    public static final RegistryObject<Block> ORANGE_CHISELED_SAND_STONE = register("orange_chiseled_sand_stone",
            () -> new chiseledSandStone(ORANGE_SAND_STONE.get()));
    public static final RegistryObject<Block> MAGENTA_CHISELED_SAND_STONE = register("magenta_chiseled_sand_stone",
            () -> new chiseledSandStone(MAGENTA_SAND_STONE.get()));
    public static final RegistryObject<Block> LIGHT_BLUE_CHISELED_SAND_STONE = register("light_blue_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final RegistryObject<Block> YELLOW_CHISELED_SAND_STONE = register("yellow_chiseled_sand_stone",
            () -> new chiseledSandStone(YELLOW_SAND_STONE.get()));
    public static final RegistryObject<Block> LIME_CHISELED_SAND_STONE = register("lime_chiseled_sand_stone",
            () -> new chiseledSandStone(LIME_SAND_STONE.get()));
    public static final RegistryObject<Block> PINK_CHISELED_SAND_STONE = register("pink_chiseled_sand_stone",
            () -> new chiseledSandStone(PINK_SAND_STONE.get()));
    public static final RegistryObject<Block> GRAY_CHISELED_SAND_STONE = register("gray_chiseled_sand_stone",
            () -> new chiseledSandStone(GRAY_SAND_STONE.get()));
    public static final RegistryObject<Block> LIGHT_GRAY_CHISELED_SAND_STONE = register("light_gray_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final RegistryObject<Block> CYAN_CHISELED_SAND_STONE = register("cyan_chiseled_sand_stone",
            () -> new chiseledSandStone(CYAN_SAND_STONE.get()));
    public static final RegistryObject<Block> PURPLE_CHISELED_SAND_STONE = register("purple_chiseled_sand_stone",
            () -> new chiseledSandStone(PURPLE_SAND_STONE.get()));
    public static final RegistryObject<Block> BLUE_CHISELED_SAND_STONE = register("blue_chiseled_sand_stone",
            () -> new chiseledSandStone(BLUE_SAND_STONE.get()));
    public static final RegistryObject<Block> GREEN_CHISELED_SAND_STONE = register("green_chiseled_sand_stone",
            () -> new chiseledSandStone(GREEN_SAND_STONE.get()));
    public static final RegistryObject<Block> BROWN_CHISELED_SAND_STONE = register("brown_chiseled_sand_stone",
            () -> new chiseledSandStone(BROWN_SAND_STONE.get()));
    public static final RegistryObject<Block> BLACK_CHISELED_SAND_STONE = register("black_chiseled_sand_stone",
            () -> new chiseledSandStone(BLACK_SAND_STONE.get()));

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
