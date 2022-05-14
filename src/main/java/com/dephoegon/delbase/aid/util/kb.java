package com.dephoegon.delbase.aid.util;

import net.minecraft.client.gui.screens.Screen;

public class kb {
    private static final boolean Shift = Screen.hasShiftDown();
    private static final boolean Control = Screen.hasControlDown();
    public static boolean HShift() { return Shift; }
    public static boolean HCtrl() { return Control; }
}
