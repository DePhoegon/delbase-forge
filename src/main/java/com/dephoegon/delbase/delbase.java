package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.Mod_ID;

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
        regList.listOrder();
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
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
