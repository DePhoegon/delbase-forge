package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class woodFence extends fenceBlock {
    public woodFence(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, 5, 20, strippedState);
    }
    public woodFence(Properties properties, boolean flames, BlockState strippedState) {
        super(properties, "", "", "", flames, 5, 20, strippedState);
    }
}
