package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class concreteWall extends wallBlock {
    public concreteWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteWall(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), "", "", "", false, 0,0, null);
    }
}
