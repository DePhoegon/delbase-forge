package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.SAND;

public class gravColorSands {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    private static final DeferredRegister<Block> OVERRIDE_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    private static final DeferredRegister<Item> OVERRIDE_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    @SuppressWarnings("unused")
    public static final RegistryObject<SandBlock> OVERRIDE_SAND = overrideRegister("sand",
            () -> new sandBlock(14406560, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND), "tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> OVERRIDE_RED_SAND = overrideRegister("red_sand",
            () -> new sandBlock(11098145, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BLOOD_SAND = register("blood_sand",
            () -> new sandBlock(0xff0000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> WHITE_SAND = register("white_sand",
            () -> new sandBlock(0xffffff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> ORANGE_SAND = register("orange_sand",
            () -> new sandBlock(0xffa500, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> MAGENTA_SAND = register("magenta_sand",
            () -> new sandBlock(0xff00ff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIGHT_BLUE_SAND = register("light_blue_sand",
            () -> new sandBlock(0xadd8e6, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> YELLOW_SAND = register("yellow_sand",
            () -> new sandBlock(0xffff00, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIME_SAND = register("lime_sand",
            () -> new sandBlock(0x00ff00, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> PINK_SAND = register("pink_sand",
            () -> new sandBlock(0xffc0cb, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> GRAY_SAND = register("gray_sand",
            () -> new sandBlock(0x808080, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIGHT_GRAY_SAND = register("light_gray_sand",
            () -> new sandBlock(0xd3d3d3, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> CYAN_SAND = register("cyan_sand",
            () -> new sandBlock(0x00ffff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> PURPLE_SAND = register("purple_sand",
            () -> new sandBlock(0x800080, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BLUE_SAND = register("blue_sand",
            () -> new sandBlock(0x0000ff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> GREEN_SAND = register("green_sand",
            () -> new sandBlock(0x008000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BROWN_SAND = register("brown_sand",
            () -> new sandBlock(0x714e32, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BLACK_SAND = register("black_sand",
            () -> new sandBlock(0x000000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> OVERRIDE_SOLID_SAND = register("solid_sand",
            () -> new solidSandBlock(14406560, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> OVERRIDE_RED_SOLID_SAND = register("red_solid_sand",
            () -> new solidSandBlock(11098145, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> BLOOD_SOLID_SAND = register("blood_solid_sand",
            () -> new solidSandBlock(0xff0000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> WHITE_SOLID_SAND = register("white_solid_sand",
            () -> new solidSandBlock(0xffffff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> ORANGE_SOLID_SAND = register("orange_solid_sand",
            () -> new solidSandBlock(0xffa500, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> MAGENTA_SOLID_SAND = register("magenta_solid_sand",
            () -> new solidSandBlock(0xff00ff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> LIGHT_BLUE_SOLID_SAND = register("light_blue_solid_sand",
            () -> new solidSandBlock(0xadd8e6, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> YELLOW_SOLID_SAND = register("yellow_solid_sand",
            () -> new solidSandBlock(0xffff00, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> LIME_SOLID_SAND = register("lime_solid_sand",
            () -> new solidSandBlock(0x00ff00, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> PINK_SOLID_SAND = register("pink_solid_sand",
            () -> new solidSandBlock(0xffc0cb, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> GRAY_SOLID_SAND = register("gray_solid_sand",
            () -> new solidSandBlock(0x808080, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> LIGHT_GRAY_SOLID_SAND = register("light_gray_solid_sand",
            () -> new solidSandBlock(0xd3d3d3, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> CYAN_SOLID_SAND = register("cyan_solid_sand",
            () -> new solidSandBlock(0x00ffff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> PURPLE_SOLID_SAND = register("purple_solid_sand",
            () -> new solidSandBlock(0x800080, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> BLUE_SOLID_SAND = register("blue_solid_sand",
            () -> new solidSandBlock(0x0000ff, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> GREEN_SOLID_SAND = register("green_solid_sand",
            () -> new solidSandBlock(0x008000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> BROWN_SOLID_SAND = register("brown_solid_sand",
            () -> new solidSandBlock(0x714e32, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final RegistryObject<SandBlock> BLACK_SOLID_SAND = register("black_solid_sand",
            () -> new solidSandBlock(0x000000, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND),"tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        OVERRIDE_BLOCK.register(eventBus);
        OVERRIDE_ITEM.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
    private static <T extends Block> RegistryObject<T> overrideRegister(String name, Supplier<T> block) {
        RegistryObject<T> exit = OVERRIDE_BLOCK.register(name, block);
        OVERRIDE_ITEM.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}
