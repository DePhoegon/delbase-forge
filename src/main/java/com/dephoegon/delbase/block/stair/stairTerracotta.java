package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.terracottaStair;
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
import static net.minecraft.world.level.block.Blocks.*;

public class stairTerracotta {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> WHITE_TERRACOTTA_STAIR = register("white_terracotta_stair",
            ()-> new terracottaStair(WHITE_TERRACOTTA));
    public static final RegistryObject<StairBlock> ORANGE_TERRACOTTA_STAIR = register("orange_terracotta_stair",
            ()-> new terracottaStair(ORANGE_TERRACOTTA));
    public static final RegistryObject<StairBlock> MAGENTA_TERRACOTTA_STAIR = register("magenta_terracotta_stair",
            ()-> new terracottaStair(MAGENTA_TERRACOTTA));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIR = register("light_blue_terracotta_stair",
            ()-> new terracottaStair(LIGHT_BLUE_TERRACOTTA));
    public static final RegistryObject<StairBlock> YELLOW_TERRACOTTA_STAIR = register("yellow_terracotta_stair",
            ()-> new terracottaStair(YELLOW_TERRACOTTA));
    public static final RegistryObject<StairBlock> LIME_TERRACOTTA_STAIR = register("lime_terracotta_stair",
            ()-> new terracottaStair(LIME_TERRACOTTA));
    public static final RegistryObject<StairBlock> PINK_TERRACOTTA_STAIR = register("pink_terracotta_stair",
            ()-> new terracottaStair(PINK_TERRACOTTA));
    public static final RegistryObject<StairBlock> GRAY_TERRACOTTA_STAIR = register("gray_terracotta_stair",
            ()-> new terracottaStair(GRAY_TERRACOTTA));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIR = register("light_gray_terracotta_stair",
            ()-> new terracottaStair(LIGHT_GRAY_TERRACOTTA));
    public static final RegistryObject<StairBlock> CYAN_TERRACOTTA_STAIR = register("cyan_terracotta_stair",
            ()-> new terracottaStair(CYAN_TERRACOTTA));
    public static final RegistryObject<StairBlock> PURPLE_TERRACOTTA_STAIR = register("purple_terracotta_stair",
            ()-> new terracottaStair(PURPLE_TERRACOTTA));
    public static final RegistryObject<StairBlock> BLUE_TERRACOTTA_STAIR = register("blue_terracotta_stair",
            ()-> new terracottaStair(BLUE_TERRACOTTA));
    public static final RegistryObject<StairBlock> BROWN_TERRACOTTA_STAIR = register("brown_terracotta_stair",
            ()-> new terracottaStair(BROWN_TERRACOTTA));
    public static final RegistryObject<StairBlock> GREEN_TERRACOTTA_STAIR = register("green_terracotta_stair",
            ()-> new terracottaStair(GREEN_TERRACOTTA));
    public static final RegistryObject<StairBlock> RED_TERRACOTTA_STAIR = register("red_terracotta_stair",
            ()-> new terracottaStair(RED_TERRACOTTA));
    public static final RegistryObject<StairBlock> BLACK_TERRACOTTA_STAIR = register("black_terracotta_stair",
            ()-> new terracottaStair(BLACK_TERRACOTTA));
    public static final RegistryObject<StairBlock> TERRACOTTA_STAIR = register("terracotta_stair",
            ()-> new terracottaStair(TERRACOTTA));

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
