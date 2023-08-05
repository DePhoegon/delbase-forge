package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class woodStair extends stairBlock {
    public woodStair(Block block, SoundType type, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(block, BlockBehaviour.Properties.copy(block).sound(type), normToolTip, shiftToolTip, ctrlToolTip, flames, 5, 20, strippedState);
    }
    public woodStair(Block block, SoundType type, boolean flames, BlockState strippedState) {
        super(block, BlockBehaviour.Properties.copy(block).sound(type), "", "", "", flames, 5, 20, strippedState);
    }
}