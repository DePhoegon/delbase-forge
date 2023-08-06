package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class woodFence extends fenceBlock {
    public woodFence(Block block, SoundType type, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(type), normToolTip, shiftToolTip, ctrlToolTip, flames, 5, 20, strippedState);
    }
    public woodFence(Block block, SoundType type, boolean flames, BlockState strippedState) {
        super(BlockBehaviour.Properties.copy(block).sound(type), "", "", "", flames, 5, 20, strippedState);
    }
}