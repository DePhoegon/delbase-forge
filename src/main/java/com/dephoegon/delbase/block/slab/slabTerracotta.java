package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.terracottaSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabTerracotta {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(WHITE_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(ORANGE_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(MAGENTA_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(LIGHT_BLUE_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(YELLOW_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(LIME_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(PINK_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(GRAY_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(LIGHT_GRAY_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(CYAN_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(PURPLE_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(BLUE_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(BROWN_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(GREEN_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = register("red_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(RED_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(BLACK_TERRACOTTA).sound(SoundType.CALCITE),"","",""));
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab",
            ()-> new terracottaSlab(BlockBehaviour.Properties.copy(TERRACOTTA).sound(SoundType.CALCITE),"","",""));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK).tab(CreativeModeTab.TAB_DECORATIONS)));
        return exit;
    }
}
