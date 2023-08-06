package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class sandStair extends stairBlock {
    public sandStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStair(Block block) {
        super(block, BlockBehaviour.Properties.copy(block), "", "", "", false, 0, 0, null);
    }
}