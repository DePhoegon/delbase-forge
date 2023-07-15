package com.dephoegon.delbase.aid.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import org.jetbrains.annotations.NotNull;

public class KeyBindManager {
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
