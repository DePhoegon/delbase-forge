package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class planSlots extends SlotItemHandler {
    private ArrayList<Item> planArray = new ArrayList<>();

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
        return tempArray;
    }

    public static ArrayList<Item> getPlansArray(ArrayList<Item> arrayList) {
        arrayList = setPlanArray();
        return arrayList;
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack itemStack) {
        planArray = getPlansArray(planArray);
        return planArray.contains(itemStack.getItem());
    }
    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
