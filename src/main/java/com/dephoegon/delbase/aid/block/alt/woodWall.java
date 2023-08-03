package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class woodWall extends wallBlock {
    public woodWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.WOOD), normToolTip, shiftToolTip, ctrlToolTip, flame, 5, 20, strippedState);
    }
    public woodWall(Block block, boolean flame, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.WOOD), "", "", "", flame, 5, 20, strippedState);
    }
}
