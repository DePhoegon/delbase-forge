package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.sandStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class stairSands {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> SAND_STAIR = register("sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> RED_SAND_STAIR = register("red_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> BLOOD_SAND_STAIR = register("blood_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> WHITE_SAND_STAIR = register("white_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> ORANGE_SAND_STAIR = register("orange_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> MAGENTA_SAND_STAIR = register("magenta_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_SAND_STAIR = register("light_blue_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> YELLOW_SAND_STAIR = register("yellow_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> LIME_SAND_STAIR = register("lime_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> PINK_SAND_STAIR = register("pink_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> GREEN_SAND_STAIR = register("green_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> GRAY_SAND_STAIR = register("gray_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_SAND_STAIR = register("light_gray_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> CYAN_SAND_STAIR = register("cyan_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> PURPLE_SAND_STAIR = register("purple_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> BLUE_SAND_STAIR = register("blue_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> BROWN_SAND_STAIR = register("brown_sand_stair",
            ()-> new sandStair("","",""));
    public static final RegistryObject<StairBlock> BLACK_SAND_STAIR = register("black_sand_stair",
            ()-> new sandStair("","",""));

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
