package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.chiseledSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class stairChiseledSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> CHISELED_SAND_STONE_STAIR = register("chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> RED_CHISELED_SAND_STONE_STAIR = register("red_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLOOD_CHISELED_SAND_STONE_STAIR = register("blood_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> WHITE_CHISELED_SAND_STONE_STAIR = register("white_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> ORANGE_CHISELED_SAND_STONE_STAIR = register("orange_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> MAGENTA_CHISELED_SAND_STONE_STAIR = register("magenta_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CHISELED_SAND_STONE_STAIR = register("light_blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> YELLOW_CHISELED_SAND_STONE_STAIR = register("yellow_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIME_CHISELED_SAND_STONE_STAIR = register("lime_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> PINK_CHISELED_SAND_STONE_STAIR = register("pink_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> GRAY_CHISELED_SAND_STONE_STAIR = register("gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CHISELED_SAND_STONE_STAIR = register("light_gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> CYAN_CHISELED_SAND_STONE_STAIR = register("cyan_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> PURPLE_CHISELED_SAND_STONE_STAIR = register("purple_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLUE_CHISELED_SAND_STONE_STAIR = register("blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> GREEN_CHISELED_SAND_STONE_STAIR = register("green_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BROWN_CHISELED_SAND_STONE_STAIR = register("brown_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    public static final RegistryObject<StairBlock> BLACK_CHISELED_SAND_STONE_STAIR = register("black_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair("","",""));
    
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
