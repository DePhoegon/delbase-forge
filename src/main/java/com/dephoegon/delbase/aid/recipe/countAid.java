package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.commonConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.HorseArmorItem;
import org.jetbrains.annotations.NotNull;

public class countAid {
    private static final int chest = commonConfig.ARMOR_CHEST_MATERIAL_RETURN.get();
    private static final int helmet = commonConfig.ARMOR_HELMET_MATERIAL_RETURN.get();
    private static final int legs = commonConfig.ARMOR_LEGGINGS_MATERIAL_RETURN.get();
    private static final int boot = commonConfig.ARMOR_BOOTS_MATERIAL_RETURN.get();
    private static final int nether_chest = commonConfig.NETHERRITE_CHEST_DIAMOND_BONUS.get();
    private static final int nether_helmet = commonConfig.NETHERRITE_HELMET_DIAMOND_BONUS.get();
    private static final int nether_legs = commonConfig.NETHERRITE_LEGGINGS_DIAMOND_BONUS.get();
    private static final int nether_boot = commonConfig.NETHERRITE_BOOTS_DIAMOND_BONUS.get();
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public static int armorScrapAid(@NotNull ArmorItem recycle) {
        int count = 6;
        if (recycle.getMaterial() != ArmorMaterials.NETHERITE) {
            if (recycle.getSlot() == EquipmentSlot.CHEST) { count = chest; }
            if (recycle.getSlot() == EquipmentSlot.FEET) { count = boot; }
            if (recycle.getSlot() == EquipmentSlot.HEAD) { count = helmet; }
            if (recycle.getSlot() == EquipmentSlot.LEGS) { count = legs; }
            if (recycle.getMaterial() == ArmorMaterials.CHAIN) { count = (int) (count + Math.floor(count/2)); }
        }
        return count;
    }
    public static int bonusScrapAid(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlot() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getSlot() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getSlot() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getSlot() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}
