package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import com.dephoegon.delbase.aid.util.composable;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static com.dephoegon.delbase.aid.util.arrayListsTransparencyColoration.*;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer;
import static net.minecraft.client.renderer.RenderType.cutout;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, blockCuttingStationRecipes.Type.ID, blockCuttingStationRecipes.Type.INSTANCE);
    }
    @SubscribeEvent
    public static void clientSetup(final FMLCommonSetupEvent event) {
        getCutoutBlocks().forEach((block)-> setRenderLayer(block.get(), cutout()));
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    public static final BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
    public static final BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
    public static final BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        getDefaultColorLeaves().forEach((block) -> event.getBlockColors().register(DEFAULT_LEAVES, block.get()));
        setSpruceLeaves().forEach((block) -> event.getBlockColors().register(SPRUCE_LEAVES, block.get()));
        setBirchHedge().forEach((block) -> event.getBlockColors().register(BIRCH_LEAVES, block.get()));
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ColoredLeaves().forEach((block) -> event.getItemColors().register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                block.get()));
    }
    public static void onServerStartAddCompostItems(ServerStartedEvent ignoredEvent) { composable.addToList(); }
}
