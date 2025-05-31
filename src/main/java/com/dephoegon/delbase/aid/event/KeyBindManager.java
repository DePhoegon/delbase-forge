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
    public static KeyMapping R_Shift;
    public static KeyMapping R_Ctrl;
    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        R_Shift = new KeyMapping("tooltip.key.shift", GLFW.GLFW_KEY_RIGHT_SHIFT, "tooltip.key.category");
        R_Ctrl = new KeyMapping("tooltip.key.ctrl", GLFW.GLFW_KEY_RIGHT_CONTROL, "tooltip.key.category");

        event.register(R_Shift);
        event.register(R_Ctrl);
    }
}