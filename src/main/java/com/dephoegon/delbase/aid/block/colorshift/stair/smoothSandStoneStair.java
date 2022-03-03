package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.SMOOTH_SANDSTONE;

public class smoothSandStoneStair extends stairBlock {
    public smoothSandStoneStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(SMOOTH_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(SMOOTH_SANDSTONE).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip,false);
    }
}
