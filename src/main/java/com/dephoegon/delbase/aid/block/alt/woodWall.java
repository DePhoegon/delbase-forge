package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class woodWall extends wallBlock {
    public woodWall(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flame, strippedState);
    }
}
