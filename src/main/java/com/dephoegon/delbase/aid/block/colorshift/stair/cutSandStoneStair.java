package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.*;

public class cutSandStoneStair extends stairBlock{
    public cutSandStoneStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(CUT_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(CHISELED_SANDSTONE).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip,false);
    }
}
