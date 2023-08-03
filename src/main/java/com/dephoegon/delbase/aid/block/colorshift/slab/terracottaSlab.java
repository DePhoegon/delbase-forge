package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class terracottaSlab extends slabBlock {
    public terracottaSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaSlab(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}
