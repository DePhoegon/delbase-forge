package com.dephoegon.delbase.aid.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraftforge.api.distmarker.Dist.CLIENT;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Mod_ID, value = CLIENT)
public class KeyBindManager {
    public static final Lazy<KeyMapping> tooltipShift = Lazy.of(() -> new KeyMapping("tooltip.key.shift", InputConstants.KEY_LSHIFT, "tooltip.key.category"));
    public static final Lazy<KeyMapping> tooltipCtrl = Lazy.of(() -> new KeyMapping("tooltip.key.ctrl", InputConstants.KEY_LCONTROL, "tooltip.key.category"));

    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        event.register(tooltipCtrl.get());
        event.register(tooltipShift.get());
    }
}