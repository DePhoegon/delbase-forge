package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class sandStoneSlab extends slabBlock {
    public sandStoneSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStoneSlab(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), "", "", "", false, 0, 0, null);
    }
}
