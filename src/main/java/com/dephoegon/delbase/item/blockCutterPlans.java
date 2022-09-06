package com.dephoegon.delbase.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dephoegon.delbase.delbase.DELBASE_ITEMS;
import static com.dephoegon.delbase.delbase.Mod_ID;

public class blockCutterPlans {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Item> WALL_PLANS = ITEMS.register("wall_plans",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> SLAB_PLANS = ITEMS.register("slab_plans",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> FENCE_PLANS = ITEMS.register("fence_plans",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> FENCE_GATE_PLANS = ITEMS.register("fence_gate_plans",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> STAIR_PLANS = ITEMS.register("stair_plans",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ARMOR_COMPOUND = ITEMS.register("armor_compound",
            () -> new Item(new Item.Properties().tab(DELBASE_ITEMS).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
