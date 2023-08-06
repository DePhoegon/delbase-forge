package com.dephoegon.delbase.aid.block.colorshift.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class sandStoneWall extends wallBlock {
    public sandStoneWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStoneWall(Block block) {
        super(BlockBehaviour.Properties.copy(block), "", "", "", false, 0, 0, null);
    }
}