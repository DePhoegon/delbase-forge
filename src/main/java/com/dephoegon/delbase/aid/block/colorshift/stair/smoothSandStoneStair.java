package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class smoothSandStoneStair extends stairBlock {
    public smoothSandStoneStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip,false, 0, 0, null);
    }
    public smoothSandStoneStair(Block block) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), "", "", "",false, 0, 0, null);
    }
}
