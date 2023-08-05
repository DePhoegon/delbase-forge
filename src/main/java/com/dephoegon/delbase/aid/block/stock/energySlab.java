package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.world.level.block.state.BlockState;

public class energySlab extends slabBlock {
    public energySlab(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flame, fireChance, fireSpread, strippedState);
    }
    public energySlab(Properties properties, boolean flame, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, flame, fireChance, fireSpread, strippedState);
    }
}