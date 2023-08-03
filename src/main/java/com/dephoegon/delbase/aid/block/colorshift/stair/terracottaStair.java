package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class terracottaStair extends stairBlock {
    public terracottaStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaStair(Block block) {
        super(block, BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}
