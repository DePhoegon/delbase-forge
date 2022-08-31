package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class woodStair extends stairBlock {
    public woodStair(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, flame);
    }
}
