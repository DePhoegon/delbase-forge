package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

public class leafFenceGate extends fenceGateBlock {
    public leafFenceGate(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
}
