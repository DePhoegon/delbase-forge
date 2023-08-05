package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class smoothSandStoneFenceGate extends fenceGateBlock {
    public smoothSandStoneFenceGate(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public smoothSandStoneFenceGate(Block block) {
        super(BlockBehaviour.Properties.copy(block), "", "", "", false, 0, 0, null);
    }
}
