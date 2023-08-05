package com.dephoegon.delbase.aid.block.colorshift.fence;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class concreteFenceGate extends fenceGateBlock {
    public concreteFenceGate(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 5, 20, null);
    }
    public concreteFenceGate(Block block) {
        super(BlockBehaviour.Properties.copy(block), "", "", "", false, 5, 20, null);
    }
}