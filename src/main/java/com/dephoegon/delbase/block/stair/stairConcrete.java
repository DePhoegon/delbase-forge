package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.concreteStair;
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

public class stairConcrete {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> RED_CONCRETE_STAIR = register("red_concrete_stair",
            () -> new concreteStair(RED_CONCRETE));
    public static final RegistryObject<StairBlock> WHITE_CONCRETE_STAIR = register("white_concrete_stair",
            () -> new concreteStair(WHITE_CONCRETE));
    public static final RegistryObject<StairBlock> ORANGE_CONCRETE_STAIR = register("orange_concrete_stair",
            () -> new concreteStair(ORANGE_CONCRETE));
    public static final RegistryObject<StairBlock> MAGENTA_CONCRETE_STAIR = register("magenta_concrete_stair",
            () -> new concreteStair(MAGENTA_CONCRETE));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CONCRETE_STAIR = register("light_blue_concrete_stair",
            () -> new concreteStair(LIGHT_BLUE_CONCRETE));
    public static final RegistryObject<StairBlock> YELLOW_CONCRETE_STAIR = register("yellow_concrete_stair",
            () -> new concreteStair(YELLOW_CONCRETE));
    public static final RegistryObject<StairBlock> LIME_CONCRETE_STAIR = register("lime_concrete_stair",
            () -> new concreteStair(LIME_CONCRETE));
    public static final RegistryObject<StairBlock> PINK_CONCRETE_STAIR = register("pink_concrete_stair",
            () -> new concreteStair(PINK_CONCRETE));
    public static final RegistryObject<StairBlock> GRAY_CONCRETE_STAIR = register("gray_concrete_stair",
            () -> new concreteStair(GRAY_CONCRETE));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CONCRETE_STAIR = register("light_gray_concrete_stair",
            () -> new concreteStair(LIGHT_GRAY_CONCRETE));
    public static final RegistryObject<StairBlock> CYAN_CONCRETE_STAIR = register("cyan_concrete_stair",
            () -> new concreteStair(CYAN_CONCRETE));
    public static final RegistryObject<StairBlock> PURPLE_CONCRETE_STAIR = register("purple_concrete_stair",
            () -> new concreteStair(PURPLE_CONCRETE));
    public static final RegistryObject<StairBlock> BLUE_CONCRETE_STAIR = register("blue_concrete_stair",
            () -> new concreteStair(BLUE_CONCRETE));
    public static final RegistryObject<StairBlock> GREEN_CONCRETE_STAIR = register("green_concrete_stair",
            () -> new concreteStair(GREEN_CONCRETE));
    public static final RegistryObject<StairBlock> BROWN_CONCRETE_STAIR = register("brown_concrete_stair",
            () -> new concreteStair(BROWN_CONCRETE));
    public static final RegistryObject<StairBlock> BLACK_CONCRETE_STAIR = register("black_concrete_stair",
            () -> new concreteStair(BLACK_CONCRETE));
    
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
