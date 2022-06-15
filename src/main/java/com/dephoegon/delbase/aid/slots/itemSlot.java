package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class itemSlot extends SlotItemHandler {
    public itemSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack itemStack) {
        ArrayList<Item> plansList = planSlots.getPlansArray();
        return !plansList.contains(itemStack.getItem());
    }
}
