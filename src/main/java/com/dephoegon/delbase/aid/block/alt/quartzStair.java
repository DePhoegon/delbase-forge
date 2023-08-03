package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class quartzStair extends stairBlock {
    public quartzStair(Block state, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(state, BlockBehaviour.Properties.copy(state).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzStair(Block state) {
        super(state, BlockBehaviour.Properties.copy(state).sound(SoundType.STONE), "", "", "", false, 0, 0, null);
    }
}
