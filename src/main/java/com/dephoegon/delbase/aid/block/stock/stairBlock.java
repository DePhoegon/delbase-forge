package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import com.dephoegon.delbase.delbase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static com.dephoegon.delbase.block.general.ashBlocks.ASH_STAIR;
import static net.minecraftforge.common.ToolActions.AXE_STRIP;

public class stairBlock extends StairBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final BlockState stripped;
    public stairBlock(Supplier<BlockState> state, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(state, properties);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        stripped = strippedState;
    }
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!kb.HShift() && !kb.HCtrl() && tip0 != null) { toolTip.add(new TranslatableComponent(tip0)); }//if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) { toolTip.add(new TranslatableComponent(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) { toolTip.add(new TranslatableComponent(tip1)); } //if shift, show tip1 (if not empty)
    }
    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face)
    {
        if (flame && !state.getValue(WATERLOGGED)) {
            rngBurn(world, state, ASH_STAIR.get().defaultBlockState(), pos, 40 ,60);
            return state.getValue(StairBlock.HALF) == Half.TOP;
        }
        return false;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, @NotNull UseOnContext context, ToolAction toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) { safeCheck = stripped.getBlock() instanceof StairBlock; } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            Direction facing = world.getBlockState(blockPos).getValue(FACING);
            Half half = world.getBlockState(blockPos).getValue(HALF);
            StairsShape shape = world.getBlockState(blockPos).getValue(SHAPE);
            Boolean waterlogged = world.getBlockState(blockPos).getValue(StairBlock.WATERLOGGED);
            return stripped.setValue(FACING, facing).setValue(WATERLOGGED, waterlogged).setValue(HALF, half).setValue(SHAPE, shape);
        } else { return null; }
    }
}
