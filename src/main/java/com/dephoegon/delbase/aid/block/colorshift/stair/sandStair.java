package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.SAND;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStair extends stairBlock {
    public sandStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, false, 0 ,0, null);
    }
}
