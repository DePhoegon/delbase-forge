package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.smoothSandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
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

public class wallSmoothSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> SMOOTH_SAND_STONE_WALL = register("smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> RED_SMOOTH_SAND_STONE_WALL = register("red_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLOOD_SMOOTH_SAND_STONE_WALL = register("blood_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> WHITE_SMOOTH_SAND_STONE_WALL = register("white_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> ORANGE_SMOOTH_SAND_STONE_WALL = register("orange_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> MAGENTA_SMOOTH_SAND_STONE_WALL = register("magenta_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_WALL = register("light_blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> YELLOW_SMOOTH_SAND_STONE_WALL = register("yellow_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIME_SMOOTH_SAND_STONE_WALL = register("lime_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PINK_SMOOTH_SAND_STONE_WALL = register("pink_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GRAY_SMOOTH_SAND_STONE_WALL = register("gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_WALL = register("light_gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> CYAN_SMOOTH_SAND_STONE_WALL = register("cyan_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> PURPLE_SMOOTH_SAND_STONE_WALL = register("purple_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLUE_SMOOTH_SAND_STONE_WALL = register("blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> GREEN_SMOOTH_SAND_STONE_WALL = register("green_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BROWN_SMOOTH_SAND_STONE_WALL = register("brown_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<WallBlock> BLACK_SMOOTH_SAND_STONE_WALL = register("black_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE),"","",""));

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
