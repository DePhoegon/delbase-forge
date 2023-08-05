package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

public class woodFenceGate extends fenceGateBlock {
    public woodFenceGate(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, 5, 20, strippedState);
    }
    public woodFenceGate(Properties properties, boolean flames, BlockState strippedState) {
        super(properties, "", "", "", flames, 5, 20, strippedState);
    }
}