package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class terracottaStair extends stairBlock {
    public terracottaStair(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(state, properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0 ,0, null);
    }
}
