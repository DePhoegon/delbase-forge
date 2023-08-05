package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class sandFence extends fenceBlock {
    public sandFence(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandFence(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.SAND), "", "", "", false, 0, 0, null);
    }
}