package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.terracottaSlab;
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

public class slabTerracotta {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab",
            ()-> new terracottaSlab(WHITE_TERRACOTTA));
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab",
            ()-> new terracottaSlab(ORANGE_TERRACOTTA));
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab",
            ()-> new terracottaSlab(MAGENTA_TERRACOTTA));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_BLUE_TERRACOTTA));
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab",
            ()-> new terracottaSlab(YELLOW_TERRACOTTA));
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab",
            ()-> new terracottaSlab(LIME_TERRACOTTA));
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab",
            ()-> new terracottaSlab(PINK_TERRACOTTA));
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab",
            ()-> new terracottaSlab(GRAY_TERRACOTTA));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_GRAY_TERRACOTTA));
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab",
            ()-> new terracottaSlab(CYAN_TERRACOTTA));
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab",
            ()-> new terracottaSlab(PURPLE_TERRACOTTA));
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab",
            ()-> new terracottaSlab(BLUE_TERRACOTTA));
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab",
            ()-> new terracottaSlab(BROWN_TERRACOTTA));
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab",
            ()-> new terracottaSlab(GREEN_TERRACOTTA));
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = register("red_terracotta_slab",
            ()-> new terracottaSlab(RED_TERRACOTTA));
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab",
            ()-> new terracottaSlab(BLACK_TERRACOTTA));
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab",
            ()-> new terracottaSlab(TERRACOTTA));

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