package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.util.composable;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.BIRCH_HEDGE;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.SPRUCE_HEDGE;
import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void clientSetup(final FMLCommonSetupEvent event) {
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.@NotNull Block event) {
        BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
        BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
        BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();
        getDefaultColorLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
        setSpruceLeaves().forEach((block) -> event.register(SPRUCE_LEAVES, block.get()));
        setBirchHedge().forEach((block) -> event.register(BIRCH_LEAVES, block.get()));
        setMangroveLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        ColoredLeaves().forEach((block) -> event.register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                block.get()));
        setMangroveLeaves().forEach((block) -> event.register((itemColor, itemLike) -> FoliageColor.getMangroveColor(), block.get().asItem()));
    }
    public static void onServerStartAddCompostItems(ServerStartedEvent ignoredEvent) { composable.addToList(); }
}