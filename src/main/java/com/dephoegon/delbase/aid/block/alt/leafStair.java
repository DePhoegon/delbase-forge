package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class leafStair extends stairBlock {
    public leafStair(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
}
