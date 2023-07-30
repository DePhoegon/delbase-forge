package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.state.BlockState;

public class leafWall extends wallBlock {
    public leafWall(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
}
