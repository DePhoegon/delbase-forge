package com.dephoegon.delbase.aid.recipe;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.HorseArmorItem;
import org.jetbrains.annotations.NotNull;

public class countAid {
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public static int armorScrapAid(@NotNull ArmorItem recycle) {
        int count = 1;
        if (recycle.getMaterial() != ArmorMaterials.NETHERITE) {
            if (recycle.getSlot() == EquipmentSlot.CHEST) { count = 5; }
            if (recycle.getSlot() == EquipmentSlot.FEET) { count = 2; }
            if (recycle.getSlot() == EquipmentSlot.HEAD) { count = 3; }
            if (recycle.getSlot() == EquipmentSlot.LEGS) { count = 4; }
            if (recycle.getMaterial() == ArmorMaterials.CHAIN) { count = (int) (count + Math.floor(count/2)); }
        }
        return count;
    }
    public static int bonusScrapAid(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlot() == EquipmentSlot.CHEST) { count = 5; }
            if (recycle.getSlot() == EquipmentSlot.FEET) { count = 2; }
            if (recycle.getSlot() == EquipmentSlot.HEAD) { count = 3; }
            if (recycle.getSlot() == EquipmentSlot.LEGS) { count = 4; }
        return count-1;
    }
}
