package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.BIRCH_HEDGE;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.SPRUCE_HEDGE;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer;
import static net.minecraft.client.renderer.RenderType.translucent;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void clientSetup(final FMLCommonSetupEvent event) {
        getTranslucentBlocks().forEach((block) -> setRenderLayer(block.get(), translucent()));
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    public static final BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
    public static final BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
    public static final BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();


    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        setDefaultColorHedgeLeaves().forEach((block) -> event.getBlockColors().register(DEFAULT_LEAVES, block.get()));
        event.getBlockColors().register(SPRUCE_LEAVES, SPRUCE_HEDGE.get());
        event.getBlockColors().register(BIRCH_LEAVES, BIRCH_HEDGE.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        getAllLeaves().forEach((block) -> event.getItemColors().register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                block.get()));
    }
}