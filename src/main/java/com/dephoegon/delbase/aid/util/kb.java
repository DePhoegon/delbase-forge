package com.dephoegon.delbase.aid.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientRegistry;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import static com.mojang.blaze3d.platform.InputConstants.isKeyDown;

public class kb {
    private kb() { }
    private static boolean RShift() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT); }
    private static boolean RCtrl() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_CONTROL); }
    public static boolean HShift() { return tooltipShift.isDefault() ? tooltipShift.isDown() || RShift() : tooltipShift.isDown(); }
    public static boolean HCtrl() { return tooltipCtrl.isDefault() ? tooltipCtrl.isDown() || RCtrl() : tooltipCtrl.isDown(); }
    public static KeyMapping tooltipShift;
    public static KeyMapping tooltipCtrl;
    public static void mapKeys() {
        tooltipShift = registerKey("tooltip.key.shift", InputConstants.KEY_LSHIFT);
        tooltipCtrl = registerKey("tooltip.key.ctrl", InputConstants.KEY_LCONTROL);
    }

    private static @NotNull KeyMapping registerKey(String name, int keyCode) {
        final var key = new KeyMapping(name, keyCode, "tooltip.key.category");
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
