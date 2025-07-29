package com.dephoegon.delbase.item;

import com.dephoegon.delbase.aid.block.item.blockDye;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dephoegon.delbase.delbase.Mod_ID;

@SuppressWarnings("SameParameterValue")
public class shiftingDyes {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);
    public static final RegistryObject<Item> CLEANSE_SHIFT_DYE = ITEMS.register("cleanse_shift_dye",
            () -> blockDyeAid(DyeColor.WHITE, 64, "tooltip.delbase.info.shift.more", "tooltip.delbase.color.suction", ""));
    public static final RegistryObject<Item> RED_SHIFT_DYE = ITEMS.register("red_shift_dye",
            () -> blockDyeAid(DyeColor.RED, 64, ""));
    public static final RegistryObject<Item> BLOOD_SHIFT_DYE = ITEMS.register("blood_shift_dye",
            () -> blockDyeAid(DyeColor.RED, 64, ""));
    public static final RegistryObject<Item> WHITE_SHIFT_DYE = ITEMS.register("white_shift_dye",
            () -> blockDyeAid(DyeColor.WHITE, 64, ""));
    public static final RegistryObject<Item> ORANGE_SHIFT_DYE = ITEMS.register("orange_shift_dye",
            () -> blockDyeAid(DyeColor.ORANGE, 64, ""));
    public static final RegistryObject<Item> MAGENTA_SHIFT_DYE = ITEMS.register("magenta_shift_dye",
            () -> blockDyeAid(DyeColor.MAGENTA, 64, ""));
    public static final RegistryObject<Item> LIGHT_BLUE_SHIFT_DYE = ITEMS.register("light_blue_shift_dye",
            () -> blockDyeAid(DyeColor.LIGHT_BLUE, 64, ""));
    public static final RegistryObject<Item> YELLOW_SHIFT_DYE = ITEMS.register("yellow_shift_dye",
            () -> blockDyeAid(DyeColor.YELLOW, 64, ""));
    public static final RegistryObject<Item> LIME_SHIFT_DYE = ITEMS.register("lime_shift_dye",
            () -> blockDyeAid(DyeColor.LIME, 64, ""));
    public static final RegistryObject<Item> PINK_SHIFT_DYE = ITEMS.register("pink_shift_dye",
            () -> blockDyeAid(DyeColor.PINK, 64, ""));
    public static final RegistryObject<Item> GRAY_SHIFT_DYE = ITEMS.register("gray_shift_dye",
            () -> blockDyeAid(DyeColor.GRAY, 64, ""));
    public static final RegistryObject<Item> LIGHT_GRAY_SHIFT_DYE = ITEMS.register("light_gray_shift_dye",
            () -> blockDyeAid(DyeColor.LIGHT_GRAY, 64, ""));
    public static final RegistryObject<Item> CYAN_SHIFT_DYE = ITEMS.register("cyan_shift_dye",
            () -> blockDyeAid(DyeColor.CYAN, 64, ""));
    public static final RegistryObject<Item> PURPLE_SHIFT_DYE = ITEMS.register("purple_shift_dye",
            () -> blockDyeAid(DyeColor.PURPLE, 64, ""));
    public static final RegistryObject<Item> BLUE_SHIFT_DYE = ITEMS.register("blue_shift_dye",
            () -> blockDyeAid(DyeColor.BLUE, 64, ""));
    public static final RegistryObject<Item> GREEN_SHIFT_DYE = ITEMS.register("green_shift_dye",
            () -> blockDyeAid(DyeColor.GREEN, 64, ""));
    public static final RegistryObject<Item> BROWN_SHIFT_DYE = ITEMS.register("brown_shift_dye",
            () -> blockDyeAid(DyeColor.BROWN, 64, ""));
    public static final RegistryObject<Item> BLACK_SHIFT_DYE = ITEMS.register("black_shift_dye",
            () -> blockDyeAid(DyeColor.BLACK, 64, ""));

    private static blockDye blockDyeAid(DyeColor color, int stack_size, String ctrl) {
        return blockDyeAid(color, stack_size, "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter", ctrl);
    }
    private static blockDye blockDyeAid(DyeColor color, int stack_size, String norm, String shift, String ctrl) {
        return new blockDye(color, new Item.Properties().stacksTo(stack_size), norm, shift, ctrl);
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
