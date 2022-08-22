package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class quartzStair extends stairBlock {
    public quartzStair(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, false, null);
    }
}
