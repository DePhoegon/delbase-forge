package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class concreteFence extends fenceBlock {
    public concreteFence(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteFence(Block block) {
        super(BlockBehaviour.Properties.copy(block), "", "", "", false, 0, 0, null);
    }
}