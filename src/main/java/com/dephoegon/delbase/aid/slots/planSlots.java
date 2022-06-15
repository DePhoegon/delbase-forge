package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class planSlots extends SlotItemHandler {

    public planSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    private static ArrayList<Item> setPlanArray(){
        ArrayList<Item> tempArray = new ArrayList<>();
        tempArray.add(WALL_PLANS.get().asItem());
        tempArray.add(FENCE_PLANS.get().asItem());
        tempArray.add(FENCE_GATE_PLANS.get().asItem());
        tempArray.add(SLAB_PLANS.get().asItem());
        tempArray.add(STAIR_PLANS.get().asItem());
        tempArray.add(ARMOR_COMPOUND.get().asItem());
        return tempArray;
    }

    public static ArrayList<Item> getPlansArray() {
        return setPlanArray();
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack itemStack) {
        ArrayList<Item> planArray = getPlansArray();
        return planArray.contains(itemStack.getItem());
    }
    @Override
    public int getMaxStackSize() {
        return 64;
    }
}
