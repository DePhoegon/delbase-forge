package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.normSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class genSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    public static final RegistryObject<Block> BLOOD_SAND_STONE = register("blood_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> WHITE_SAND_STONE = register("white_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> ORANGE_SAND_STONE = register("orange_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> MAGENTA_SAND_STONE = register("magenta_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_BLUE_SAND_STONE = register("light_blue_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> YELLOW_SAND_STONE = register("yellow_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIME_SAND_STONE = register("lime_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PINK_SAND_STONE = register("pink_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GRAY_SAND_STONE = register("gray_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_GRAY_SAND_STONE = register("light_gray_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> CYAN_SAND_STONE = register("cyan_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PURPLE_SAND_STONE = register("purple_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLUE_SAND_STONE = register("blue_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GREEN_SAND_STONE = register("green_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BROWN_SAND_STONE = register("brown_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLACK_SAND_STONE = register("black_sand_stone",
            () -> new normSandStone(BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE),"","",""));
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
