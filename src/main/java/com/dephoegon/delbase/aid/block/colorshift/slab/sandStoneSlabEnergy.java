package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.energySlab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class sandStoneSlabEnergy extends energySlab {
    public sandStoneSlabEnergy(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE).lightLevel((blockState)-> 5), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStoneSlabEnergy(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.STONE).lightLevel((blockState)-> 5), "", "", "", false, 0, 0, null);
    }
}