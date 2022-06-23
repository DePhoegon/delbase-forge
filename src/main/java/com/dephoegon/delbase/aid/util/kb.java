package com.dephoegon.delbase.aid.util;

import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

import static com.mojang.blaze3d.platform.InputConstants.isKeyDown;

public class kb {
    private static boolean LShift() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT); }
    private static boolean RShift() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT); }
    private static boolean LCtrl() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_CONTROL); }
    private static boolean RCtrl() { return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL); }
    public static boolean HShift() { return LShift() || RShift(); }
    public static boolean HCtrl() { return LCtrl() || RCtrl(); }
}
