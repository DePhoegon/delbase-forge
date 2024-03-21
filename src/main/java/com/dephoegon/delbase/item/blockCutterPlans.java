package com.dephoegon.delbase.item;

import com.dephoegon.delbase.aid.block.item.compoundPlans;
import com.dephoegon.delbase.aid.block.item.cutterPlans;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.Mod_ID;

public class blockCutterPlans {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<Item> WALL_PLANS = regPlans("wall_plans", 1);
    public static final RegistryObject<Item> SLAB_PLANS = regPlans("slab_plans", 1);
    public static final RegistryObject<Item> FENCE_PLANS = regPlans("fence_plans", 1);
    public static final RegistryObject<Item> FENCE_GATE_PLANS = regPlans("fence_gate_plans", 1);
    public static final RegistryObject<Item> STAIR_PLANS = regPlans("stair_plans", 1);
    public static final RegistryObject<Item> ARMOR_COMPOUND = regCompound("armor_compound", 64);

    private static @NotNull RegistryObject<Item> regPlans(String name, int stack) { return ITEMS.register(name, () -> new cutterPlans(new Item.Properties().stacksTo(stack))); }
    private static @NotNull RegistryObject<Item> regCompound(String name, int stack) { return ITEMS.register(name, () -> new compoundPlans(new Item.Properties().stacksTo(stack))); }

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
