package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.concreteSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabConcrete {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = register("red_concrete_slab",
            () -> new concreteSlab(RED_CONCRETE));
    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = register("white_concrete_slab",
            () -> new concreteSlab(WHITE_CONCRETE));
    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab",
            () -> new concreteSlab(ORANGE_CONCRETE));
    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab",
            () -> new concreteSlab(MAGENTA_CONCRETE));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab",
            () -> new concreteSlab(LIGHT_BLUE_CONCRETE));
    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab",
            () -> new concreteSlab(YELLOW_CONCRETE));
    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = register("lime_concrete_slab",
            () -> new concreteSlab(LIME_CONCRETE));
    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = register("pink_concrete_slab",
            () -> new concreteSlab(PINK_CONCRETE));
    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = register("gray_concrete_slab",
            () -> new concreteSlab(GRAY_CONCRETE));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab",
            () -> new concreteSlab(LIGHT_GRAY_CONCRETE));
    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab",
            () -> new concreteSlab(CYAN_CONCRETE));
    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab",
            () -> new concreteSlab(PURPLE_CONCRETE));
    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = register("blue_concrete_slab",
            () -> new concreteSlab(BLUE_CONCRETE));
    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = register("green_concrete_slab",
            () -> new concreteSlab(GREEN_CONCRETE));
    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = register("brown_concrete_slab",
            () -> new concreteSlab(BROWN_CONCRETE));
    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = register("black_concrete_slab",
            () -> new concreteSlab(BLACK_CONCRETE));
    

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
