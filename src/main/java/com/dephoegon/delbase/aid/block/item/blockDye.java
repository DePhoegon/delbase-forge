package com.dephoegon.delbase.aid.block.item;

import com.dephoegon.delbase.aid.block.stock.*;
import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static com.dephoegon.delbase.aid.event.typeSelector.*;
import static com.dephoegon.delbase.aid.util.blockArrayList.*;

public class blockDye extends DyeItem {
    private String tip0;
    private String tip1;
    private String tip2;

    public blockDye(DyeColor dyeColor, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(dyeColor, properties);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = "\u00A77\u00A7o"+normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = "\u00A77\u00A7o"+shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = "\u00A77\u00A7o"+ctrlToolTip; }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> toolTip, TooltipFlag flag) {
        super.appendHoverText(stack, level, toolTip, flag);
        if(!kb.HShift() && !kb.HCtrl() && tip0 != null) toolTip.add(new TextComponent(tip0)); //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) toolTip.add(new TextComponent(tip2)); //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) //noinspection GrazieInspection
            toolTip.add(new TextComponent(tip1)); //if shift, show tip1 (if not empty)
    }


    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState defaultBlockState = world.getBlockState(blockpos).getBlock().defaultBlockState();
        Player player = context.getPlayer();
        assert player != null;
        Item dye_hand = player.getItemInHand(context.getHand()).getItem();
        Block block = world.getBlockState(blockpos).getBlock();
        String dye = "null";

        if (block instanceof axisBlock || getAxis_list().contains(defaultBlockState)) { return axis_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        if (block instanceof slabBlock  || getSlab_list().contains(defaultBlockState)) { return slab_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        if (block instanceof genBlock || getGeneral_list().contains(defaultBlockState)) { return gen_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        if (block instanceof gravBlock || getGravity_list().contains(defaultBlockState)) { return grav_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        if (block instanceof stairBlock || getStair_list().contains(defaultBlockState)) { return stair_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        if (block instanceof wallBlock || getWall_list().contains(defaultBlockState)) { return wall_select(world, blockpos, defaultBlockState, block, player, dye_hand); }
        return InteractionResult.FAIL;
    }
}
