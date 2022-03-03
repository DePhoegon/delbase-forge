package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
public class gravBlock extends SandBlock {
    private String tip0;
    private String tip1;
    private String tip2;
    private final boolean fall;
    public gravBlock(int dustColorIn, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, @Nonnull boolean falls) {
        super(dustColorIn, properties);
        if (normToolTip.equals("")) { tip0 = null; } else { tip0 = "\u00A77\u00A7o"+normToolTip; }
        if (shiftToolTip.equals("")) { tip1 = null; } else { tip1 = "\u00A78\u00A7o"+shiftToolTip; }
        if (ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = "\u00A78\u00A7o"+ctrlToolTip; }
        fall = falls;
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!kb.HShift() && !kb.HCtrl() && tip0 != null) toolTip.add(new TextComponent(tip0)); //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) toolTip.add(new TextComponent(tip2)); //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) //noinspection GrazieInspection
            toolTip.add(new TextComponent(tip1)); //if shift, show tip1 (if not empty)
    }
    @Override
    public void tick(@Nonnull BlockState state, @Nonnull ServerLevel worldIn, @Nonnull BlockPos pos, @Nonnull Random rand) {
        if (gravity(worldIn, pos) && pos.getY() >= -64) {
            FallingBlockEntity fallingblockentity = new FallingBlockEntity(worldIn, (double) pos.getX() + 0.5D, pos.getY(), (double) pos.getZ() + 0.5D, worldIn.getBlockState(pos));
            this.falling(fallingblockentity);
            worldIn.addFreshEntity(fallingblockentity);
        }
    }
    private boolean gravity(ServerLevel worldIn, BlockPos pos) {
        boolean t_fall;
        boolean airOrFallthrough;
        boolean hld;
        if (fall) {
            hld = spider(pos.above(), worldIn, 0);
            airOrFallthrough = worldIn.getBlockState(pos.below()).isAir() || isFree(worldIn.getBlockState(pos.below()));
            if (hld) { t_fall = false; } else { t_fall = airOrFallthrough; }
        } else { t_fall = false; }
        return t_fall;
    }
    private boolean spider(BlockPos pos, @NotNull ServerLevel worldIn, int count) {
        boolean last;
        int l_count = count+1;
        Block bob = worldIn.getBlockState(pos).getBlock();
        if (bob instanceof slabBlock) { last = true; }
        else if (bob instanceof gravBlock && l_count < 7) { last = spider(pos.above(), worldIn, l_count); }
        else { last = false; }
        return last;
    }
}