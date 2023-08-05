package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class leafStair extends stairBlock {
    public leafStair(@NotNull Block block, SoundType type, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(block, BlockBehaviour.Properties.copy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
    public leafStair(@NotNull Block block, SoundType type, boolean flames, BlockState strippedState) {
        super(block, BlockBehaviour.Properties.copy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), "", "", "", flames, 30, 60, strippedState);
    }
}