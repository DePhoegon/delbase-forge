package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class concreteStair extends stairBlock {
    public concreteStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0 ,0, null);
    }
    public concreteStair(Block block) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), "", "", "", false, 0 ,0, null);
    }
}
