package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;

@SuppressWarnings("unused")
public class gravColorSands {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    private static final DeferredRegister<Block> OVERRIDE_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    private static final DeferredRegister<Item> OVERRIDE_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<SandBlock> BLOOD_SAND = register("blood_sand",
            () -> new sandBlock(0xff0000, MapColor.TERRACOTTA_RED,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> WHITE_SAND = register("white_sand",
            () -> new sandBlock(0xffffff, MapColor.TERRACOTTA_WHITE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> ORANGE_SAND = register("orange_sand",
            () -> new sandBlock(0xffa500, MapColor.TERRACOTTA_ORANGE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> MAGENTA_SAND = register("magenta_sand",
            () -> new sandBlock(0xff00ff, MapColor.TERRACOTTA_MAGENTA,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIGHT_BLUE_SAND = register("light_blue_sand",
            () -> new sandBlock(0xadd8e6, MapColor.TERRACOTTA_LIGHT_BLUE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> YELLOW_SAND = register("yellow_sand",
            () -> new sandBlock(0xffff00, MapColor.TERRACOTTA_YELLOW,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIME_SAND = register("lime_sand",
            () -> new sandBlock(0x00ff00, MapColor.TERRACOTTA_LIGHT_GREEN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> PINK_SAND = register("pink_sand",
            () -> new sandBlock(0xffc0cb, MapColor.TERRACOTTA_PINK,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> GRAY_SAND = register("gray_sand",
            () -> new sandBlock(0x808080, MapColor.TERRACOTTA_GRAY,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> LIGHT_GRAY_SAND = register("light_gray_sand",
            () -> new sandBlock(0xd3d3d3, MapColor.TERRACOTTA_LIGHT_GRAY,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> CYAN_SAND = register("cyan_sand",
            () -> new sandBlock(0x00ffff, MapColor.TERRACOTTA_CYAN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> PURPLE_SAND = register("purple_sand",
            () -> new sandBlock(0x800080, MapColor.TERRACOTTA_PURPLE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BLUE_SAND = register("blue_sand",
            () -> new sandBlock(0x0000ff, MapColor.TERRACOTTA_BLUE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> GREEN_SAND = register("green_sand",
            () -> new sandBlock(0x008000, MapColor.TERRACOTTA_GREEN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BROWN_SAND = register("brown_sand",
            () -> new sandBlock(0x714e32, MapColor.TERRACOTTA_BROWN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final RegistryObject<SandBlock> BLACK_SAND = register("black_sand",
            () -> new sandBlock(0x000000, MapColor.TERRACOTTA_BLACK,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));

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