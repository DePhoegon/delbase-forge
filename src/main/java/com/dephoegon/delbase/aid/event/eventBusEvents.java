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

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.getColoredLeaves;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setDefaultColorHedgeLeaves;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.BIRCH_HEDGE;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.SPRUCE_HEDGE;
import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SubscribeEvent
    public static void clientSetup(final FMLCommonSetupEvent event) {
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    public static final BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
    public static final BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
    public static final BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.@NotNull Block event) {
        setDefaultColorHedgeLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
        event.register(SPRUCE_LEAVES, SPRUCE_HEDGE.get());
        event.register(BIRCH_LEAVES, BIRCH_HEDGE.get());
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        getColoredLeaves().forEach((block) -> event.register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color),
                block.get()));
    }
    public static void onServerStartAddCompostItems(ServerStartedEvent ignoredEvent) { composable.addToList(); }
}