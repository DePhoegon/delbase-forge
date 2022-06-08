package com.dephoegon.delbase.block.entity.screen;
import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.Nullable;

import static com.dephoegon.delbase.block.general.machineBlocks.*;

public class blockCuttingStationScreen extends AbstractContainerMenu {
    private final blockCuttingStation blockEntity;
    private final Level level;
    public blockCuttingStationScreen(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()));
    }
    public blockCuttingStationScreen(int pContainerId, Inventory inv, BlockEntity entity) {
        super(BLOCK_CUTTING_STATION.get(), pContainerId);
        checkContainerSize(inv, 3);
        blockEntity = ((blockCuttingStation) entity);
        this.level = inv.player.level;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            this.addSlot(new SlotItemHandler(handler,0, 57, 18));
            this.addSlot(new SlotItemHandler(handler,1, 103, 18));
            this.addSlot(new SlotItemHandler(handler, 2, 80, 60));

        });
    }
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_ROW_COUNT =3;
    private static final int PLAYER_COLUMN_COUNT =HOTBAR_SLOT_COUNT;
    private static final int PLAYER_SLOT_COUNT = PLAYER_ROW_COUNT*PLAYER_COLUMN_COUNT;
    private static final int VANILLA_SLOT_COUNT = PLAYER_SLOT_COUNT+HOTBAR_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 3;

    @Override
    public boolean stillValid(Player pPlayer) {
        return false;
    }
    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }
    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i =0; i<9;++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }
}
