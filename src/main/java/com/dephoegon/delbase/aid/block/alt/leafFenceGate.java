package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class leafFenceGate extends fenceGateBlock {
    public leafFenceGate(Block block, SoundType type, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
    public leafFenceGate(Block block, SoundType type, boolean flames, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), "", "", "", flames, 30, 60, strippedState);
    }
}