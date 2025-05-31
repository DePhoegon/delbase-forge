package com.dephoegon.delbase.aid.event;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public class KeyBindManager {
    public static KeyMapping R_Shift;
    public static KeyMapping R_Ctrl;

    public static void mapKeys() {
        R_Shift = registerKey("tooltip.key.shift", GLFW.GLFW_KEY_RIGHT_SHIFT);
        R_Ctrl = registerKey("tooltip.key.ctrl", GLFW.GLFW_KEY_RIGHT_CONTROL);
    }

    private static @NotNull KeyMapping registerKey(String name, int keyCode) {
        final var key = new KeyMapping(name, keyCode, "tooltip.key.category");
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
