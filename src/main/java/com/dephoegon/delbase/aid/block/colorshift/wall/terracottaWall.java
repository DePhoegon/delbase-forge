package com.dephoegon.delbase.aid.block.colorshift.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class terracottaWall extends wallBlock {
    public terracottaWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false,0,0, null);
    }
    public terracottaWall(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), "", "", "", false, 0,0, null);
    }
}
