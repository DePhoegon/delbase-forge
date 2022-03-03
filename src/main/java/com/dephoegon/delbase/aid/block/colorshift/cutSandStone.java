package com.dephoegon.delbase.aid.block.colorshift;

import com.dephoegon.delbase.aid.block.stock.axisBlock;
import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class cutSandStone extends axisBlock {
    public cutSandStone(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false);
    }
}
