package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class leafFence extends fenceBlock {
    public leafFence(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, true, 30, 60, strippedState);
    }
}
