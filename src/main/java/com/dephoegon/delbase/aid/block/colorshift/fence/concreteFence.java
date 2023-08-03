package com.dephoegon.delbase.aid.block.colorshift.fence;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;

public class concreteFence extends fenceBlock {
    public concreteFence(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteFence(Properties properties) {
        super(properties, "", "", "", false, 0, 0, null);
    }
}
