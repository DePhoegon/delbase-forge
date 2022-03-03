package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.chiseledSandStone;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;

public class genChiseledSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Block> BLOOD_CHISELED_SAND_STONE = register("blood_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> WHITE_CHISELED_SAND_STONE = register("white_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> ORANGE_CHISELED_SAND_STONE = register("orange_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> MAGENTA_CHISELED_SAND_STONE = register("magenta_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_BLUE_CHISELED_SAND_STONE = register("light_blue_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> YELLOW_CHISELED_SAND_STONE = register("yellow_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIME_CHISELED_SAND_STONE = register("lime_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PINK_CHISELED_SAND_STONE = register("pink_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GRAY_CHISELED_SAND_STONE = register("gray_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_GRAY_CHISELED_SAND_STONE = register("light_gray_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> CYAN_CHISELED_SAND_STONE = register("cyan_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PURPLE_CHISELED_SAND_STONE = register("purple_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLUE_CHISELED_SAND_STONE = register("blue_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GREEN_CHISELED_SAND_STONE = register("green_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BROWN_CHISELED_SAND_STONE = register("brown_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLACK_CHISELED_SAND_STONE = register("black_chiseled_sand_stone",
            () -> new chiseledSandStone(BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE),"","",""));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
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
