package com.dephoegon.delbase.aid.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.util.Lazy;

import static com.dephoegon.delbase.aid.event.KeyBindManager.*;
import static com.mojang.blaze3d.platform.InputConstants.isKeyDown;

public class kb {
    private static boolean RShift() { return isKB_KeyBindDown(R_Shift); }
    private static boolean RCtrl() { return isKB_KeyBindDown(R_Ctrl); }
    public static boolean HShift() { return RShift(); }
    public static boolean HCtrl() { return RCtrl(); }

    public static boolean isKB_KeyBindDown(Lazy<KeyMapping> mapping) {
        if (mapping == null) { return false; }
        InputConstants.Key key = mapping.get().getKey();
        int Keycode = key.getValue();
        return keyCheck(key.getType(), Keycode);
    }
    private static boolean keyCheck(int Keycode) { return keyCheck(InputConstants.Type.KEYSYM, Keycode); }
    public static boolean keyCheck(InputConstants.Type type, int Keycode) {
        if (type != InputConstants.Type.KEYSYM) { return false; }
        return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), Keycode);
    }
    public static boolean isKeyBindDefault(Lazy<KeyMapping> mapping) {
        if (mapping != null) { return mapping.get().isDefault(); }
        return false;
    }
}