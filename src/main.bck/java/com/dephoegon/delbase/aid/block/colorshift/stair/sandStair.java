package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.RED_SAND;

public class sandStair extends stairBlock {
    public sandStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(RED_SAND::defaultBlockState, BlockBehaviour.Properties.copy(RED_SAND).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip);
    }
}
