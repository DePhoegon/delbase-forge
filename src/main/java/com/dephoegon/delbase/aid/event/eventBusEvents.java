package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, blockCuttingStationRecipes.Type.ID, blockCuttingStationRecipes.Type.INSTANCE);
    }
}
