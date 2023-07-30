package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;

public class chiseledSandStoneStair extends stairBlock {
    public chiseledSandStoneStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(CHISELED_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0 ,0, null);
    }
}
