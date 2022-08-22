package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStoneStair extends stairBlock {
    public sandStoneStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(SANDSTONE).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, null);
    }
}
