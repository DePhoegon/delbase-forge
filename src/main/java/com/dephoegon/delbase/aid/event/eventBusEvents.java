package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, blockCuttingStationRecipes.Type.ID, blockCuttingStationRecipes.Type.INSTANCE);
    }
    @SubscribeEvent
    public void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(machineBlocks.BLOCK_CUTTING_STATION.get(), RenderType.translucent());
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
}
