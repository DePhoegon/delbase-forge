package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.SMOOTH_SANDSTONE;

public class genSmoothSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Block> BLOOD_SMOOTH_SAND_STONE = register("blood_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> WHITE_SMOOTH_SAND_STONE = register("white_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SAND_STONE = register("orange_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_SAND_STONE = register("magenta_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_SAND_STONE = register("light_blue_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SAND_STONE = register("yellow_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIME_SMOOTH_SAND_STONE = register("lime_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PINK_SMOOTH_SAND_STONE = register("pink_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GRAY_SMOOTH_SAND_STONE = register("gray_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_SAND_STONE = register("light_gray_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> CYAN_SMOOTH_SAND_STONE = register("cyan_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> PURPLE_SMOOTH_SAND_STONE = register("purple_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLUE_SMOOTH_SAND_STONE = register("blue_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> GREEN_SMOOTH_SAND_STONE = register("green_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BROWN_SMOOTH_SAND_STONE = register("brown_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<Block> BLACK_SMOOTH_SAND_STONE = register("black_smooth_sand_stone",
            () -> new smoothSandStone(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));

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
