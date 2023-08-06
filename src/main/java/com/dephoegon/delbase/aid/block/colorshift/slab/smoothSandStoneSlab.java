package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class smoothSandStoneSlab extends slabBlock {
    public smoothSandStoneSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public smoothSandStoneSlab(Block block) {
        super(BlockBehaviour.Properties.copy(block), "", "", "", false, 0, 0, null);
    }
}