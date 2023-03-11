package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.config.commonConfig;
import com.dephoegon.delbase.aid.util.regList;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.delbaseCreativeTabs.*;
import static com.dephoegon.delbase.delbase.Mod_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mod_ID)
public class delbase
{
    public static final String Mod_ID = "delbase";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    private void addCreative(CreativeModeTabEvent.@NotNull BuildContents event) {
        if(event.getTab() == DELBASE_ITEM || event.getTab() == CreativeModeTabs.INGREDIENTS) { getDelItemList().forEach(event::accept); }
        if(event.getTab() == DELBASE_BLOCK) { getDelFullBlockList().forEach(event::accept); }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) { getDelBlockList().forEach(event::accept); }
        if(event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) { getDelFunctionalBlockList().forEach(event::accept); }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) { getDelNaturalBlockList().forEach(event::accept); }
    }
    public delbase() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        regList.firstList(eventBus);
        regList.listOrder(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, commonConfig.SPEC, "delbase-common.toml");
    }
}
