package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.commonConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

public class countAid {
    private static final int nether_chest = commonConfig.NETHERRITE_CHEST_DIAMOND_BONUS.get();
    private static final int nether_helmet = commonConfig.NETHERRITE_HELMET_DIAMOND_BONUS.get();
    private static final int nether_legs = commonConfig.NETHERRITE_LEGGINGS_DIAMOND_BONUS.get();
    private static final int nether_boot = commonConfig.NETHERRITE_BOOTS_DIAMOND_BONUS.get();
    public static int netheriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlot() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getSlot() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getSlot() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getSlot() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}
