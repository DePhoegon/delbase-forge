package com.dephoegon.delbase.aid.recipe;

import net.minecraft.world.SimpleContainer;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.Items.COBBLESTONE;

public class TierRandomDropAid {
    public static @NotNull SimpleContainer stoneContainer(int size) {
        SimpleContainer stone = new SimpleContainer(size);
        for (int i = 0; i < size; i++) {
            int RNGs = (int) Math.floor(Math.random() * 4);
            switch (RNGs) {
                case 0 -> stone.setItem(i, STICK.getDefaultInstance());
                case 2 -> stone.setItem(i, BLACKSTONE.getDefaultInstance());
                case 3 -> stone.setItem(i, COBBLED_DEEPSLATE.getDefaultInstance());
                default -> stone.setItem(i, COBBLESTONE.getDefaultInstance());
            }
        }
        return stone;
    }
    public static @NotNull SimpleContainer woodContainer(int size) {
        SimpleContainer stone = new SimpleContainer(size);
        for (int i = 0; i < size; i++) {
            int RNGs = (int) Math.floor(Math.random()*10);
            switch (RNGs) {
                case 0 -> stone.setItem(i, STICK.getDefaultInstance());
                case 1 -> stone.setItem(i, ACACIA_PLANKS.getDefaultInstance());
                case 2 -> stone.setItem(i, DARK_OAK_PLANKS.getDefaultInstance());
                case 4 -> stone.setItem(i, JUNGLE_PLANKS.getDefaultInstance());
                case 5 -> stone.setItem(i, BIRCH_PLANKS.getDefaultInstance());
                case 6 -> stone.setItem(i, SPRUCE_PLANKS.getDefaultInstance());
                case 8 -> stone.setItem(i, CRIMSON_PLANKS.getDefaultInstance());
                case 9 -> stone.setItem(i, WARPED_PLANKS.getDefaultInstance());
                default -> stone.setItem(i, OAK_PLANKS.getDefaultInstance());
            }
        }
        return stone;
    }
    public static @NotNull SimpleContainer netheriteToolsBonus() {
        SimpleContainer stone = new SimpleContainer(2);
        stone.setItem(0, DIAMOND.getDefaultInstance());
        int RNGs = (int) Math.floor(Math.random()*4);
        if (RNGs > 2) { stone.setItem(1, STICK.getDefaultInstance()); }
        return stone;
    }
}
