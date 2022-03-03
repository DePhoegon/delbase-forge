package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Properties;
import java.util.function.Supplier;

public class stairBlock extends StairBlock {
    private String tip0;
    private String tip1;
    private String tip2;

    public stairBlock(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(state, properties);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = "\u00A77\u00A7o"+normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = "\u00A77\u00A7o"+shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = "\u00A77\u00A7o"+ctrlToolTip; }
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> toolTip, TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!kb.HShift() && !kb.HCtrl() && tip0 != null) toolTip.add(new TextComponent(tip0)); //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) toolTip.add(new TextComponent(tip2)); //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) //noinspection GrazieInspection
            toolTip.add(new TextComponent(tip1)); //if shift, show tip1 (if not empty)
    }
}
