package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regList;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.client.gui.screens.MenuScreens.register;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mod_ID)
public class delbase
{
    public static final String Mod_ID = "delbase";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab BASE_BLOCK = new CreativeModeTab("dephoegon_blocks") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.REDSTONE_BLOCK);
        }
    };
    public static final CreativeModeTab DELBASE_ITEMS = new CreativeModeTab("dephoegon_items") {
        @Override
        public @NotNull ItemStack makeIcon() { return new ItemStack(Items.RED_DYE); }
    };
    public delbase() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        regList.listOrder();
        // Register the setup method for modloading
        eventBus.addListener(this::clientSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    // ClientSetup In the aid/event/eventBusEvent
    private void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(machineBlocks.BLOCK_CUTTING_STATION.get(), RenderType.translucent());
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        /*
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
         */
    }
}
