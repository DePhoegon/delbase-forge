package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class leafSlab extends slabBlock {
    public leafSlab(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames,30,60, strippedState);
    }
}
