package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class woodSlab extends slabBlock {
    public woodSlab(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flame, 5, 20, strippedState);
    }
}
