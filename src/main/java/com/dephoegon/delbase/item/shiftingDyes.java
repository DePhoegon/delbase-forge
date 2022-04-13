package com.dephoegon.delbase.item;

import com.dephoegon.delbase.aid.block.item.blockDye;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import static com.dephoegon.delbase.delbase.*;

public class shiftingDyes {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Item> CLEANSE_SHIFT_DYE = ITEMS.register("cleanse_shift_dye",
            () -> new blockDye(DyeColor.WHITE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> RED_SHIFT_DYE = ITEMS.register("red_shift_dye",
            () -> new blockDye(DyeColor.RED, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS)
                    ,"","",""));
    public static final RegistryObject<Item> BLOOD_SHIFT_DYE = ITEMS.register("blood_shift_dye",
            () -> new blockDye(DyeColor.RED, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> WHITE_SHIFT_DYE = ITEMS.register("white_shift_dye",
            () -> new blockDye(DyeColor.WHITE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> ORANGE_SHIFT_DYE = ITEMS.register("orange_shift_dye",
            () -> new blockDye(DyeColor.ORANGE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> MAGENTA_SHIFT_DYE = ITEMS.register("magenta_shift_dye",
            () -> new blockDye(DyeColor.MAGENTA, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> LIGHT_BLUE_SHIFT_DYE = ITEMS.register("light_blue_shift_dye",
            () -> new blockDye(DyeColor.LIGHT_BLUE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> YELLOW_SHIFT_DYE = ITEMS.register("yellow_shift_dye",
            () -> new blockDye(DyeColor.YELLOW, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> LIME_SHIFT_DYE = ITEMS.register("lime_shift_dye",
            () -> new blockDye(DyeColor.LIME, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> PINK_SHIFT_DYE = ITEMS.register("pink_shift_dye",
            () -> new blockDye(DyeColor.PINK, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> GRAY_SHIFT_DYE = ITEMS.register("gray_shift_dye",
            () -> new blockDye(DyeColor.GRAY, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> LIGHT_GRAY_SHIFT_DYE = ITEMS.register("light_gray_shift_dye",
            () -> new blockDye(DyeColor.LIGHT_GRAY, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> CYAN_SHIFT_DYE = ITEMS.register("cyan_shift_dye",
            () -> new blockDye(DyeColor.CYAN, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> PURPLE_SHIFT_DYE = ITEMS.register("purple_shift_dye",
            () -> new blockDye(DyeColor.PURPLE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> BLUE_SHIFT_DYE = ITEMS.register("blue_shift_dye",
            () -> new blockDye(DyeColor.BLUE, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> GREEN_SHIFT_DYE = ITEMS.register("green_shift_dye",
            () -> new blockDye(DyeColor.GREEN, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> BROWN_SHIFT_DYE = ITEMS.register("brown_shift_dye",
            () -> new blockDye(DyeColor.BROWN, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));
    public static final RegistryObject<Item> BLACK_SHIFT_DYE = ITEMS.register("black_shift_dye",
            () -> new blockDye(DyeColor.BLACK, new Item.Properties().stacksTo(64).tab(DELBASE_ITEMS),
                    "","",""));


    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(eventBus);
    }
}
