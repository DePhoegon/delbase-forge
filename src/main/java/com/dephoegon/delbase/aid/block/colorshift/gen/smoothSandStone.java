package com.dephoegon.delbase.aid.block.colorshift.gen;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class smoothSandStone extends genBlock {
    public smoothSandStone(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public smoothSandStone(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE), "", "", "", false, 0, 0);
    }
}