package com.dephoegon.delbase.aid.event;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeyBindManager {
    public static KeyMapping tooltipShift;
    public static KeyMapping tooltipCtrl;
    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        tooltipShift = new KeyMapping("tooltip.key.shift", GLFW.GLFW_KEY_LEFT_SHIFT, "tooltip.key.category");
        tooltipCtrl = new KeyMapping("tooltip.key.ctrl", GLFW.GLFW_KEY_LEFT_CONTROL, "tooltip.key.category");

        event.register(tooltipShift);
        event.register(tooltipCtrl);
    }
}