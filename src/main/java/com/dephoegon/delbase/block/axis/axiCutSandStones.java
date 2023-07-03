package com.dephoegon.delbase.block.axis;

import com.dephoegon.delbase.aid.block.colorshift.axis.cutSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;

public class axiCutSandStones {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<RotatedPillarBlock> BLOOD_CUT_SAND_STONE = register("blood_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> WHITE_CUT_SAND_STONE = register("white_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> ORANGE_CUT_SAND_STONE = register("orange_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> MAGENTA_CUT_SAND_STONE = register("magenta_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> LIGHT_BLUE_CUT_SAND_STONE = register("light_blue_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> YELLOW_CUT_SAND_STONE = register("yellow_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> LIME_CUT_SAND_STONE = register("lime_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> PINK_CUT_SAND_STONE = register("pink_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> GRAY_CUT_SAND_STONE = register("gray_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> LIGHT_GRAY_CUT_SAND_STONE = register("light_gray_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> CYAN_CUT_SAND_STONE = register("cyan_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> PURPLE_CUT_SAND_STONE = register("purple_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> BLUE_CUT_SAND_STONE = register("blue_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> GREEN_CUT_SAND_STONE = register("green_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> BROWN_CUT_SAND_STONE = register("brown_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));
    public static final RegistryObject<RotatedPillarBlock> BLACK_CUT_SAND_STONE = register("black_cut_sand_stone",
            () -> new cutSandStone(BlockBehaviour.Properties.copy(CUT_SANDSTONE).sound(SoundType.STONE),"","",""));

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
