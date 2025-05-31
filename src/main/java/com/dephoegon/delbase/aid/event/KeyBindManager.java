package com.dephoegon.delbase.aid.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraftforge.api.distmarker.Dist.CLIENT;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Mod_ID, value = CLIENT)
public class KeyBindManager {
    public static final Lazy<KeyMapping> R_Shift = Lazy.of(() -> new KeyMapping("tooltip.key.shift", GLFW.GLFW_KEY_RIGHT_SHIFT, "tooltip.key.category"));
    public static final Lazy<KeyMapping> R_Ctrl = Lazy.of(() -> new KeyMapping("tooltip.key.ctrl", GLFW.GLFW_KEY_RIGHT_CONTROL, "tooltip.key.category"));

    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        event.register(R_Ctrl.get());
        event.register(R_Shift.get());
    }
}