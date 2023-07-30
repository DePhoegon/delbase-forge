package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static com.dephoegon.delbase.block.general.ashBlocks.ASH_WALL;
import static net.minecraftforge.common.ToolActions.AXE_STRIP;

public class wallBlock extends WallBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final int spread;
    private final int flammability;
    private final BlockState stripped;
    public wallBlock(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
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
        if (flame && !state.getValue(WATERLOGGED) && state.getBlock().defaultBlockState() != ASH_WALL.get().defaultBlockState()) {
            rngBurn(world, state, ASH_WALL.get().defaultBlockState(), pos, 40, 60);
            return true;
        }
        return false;
    }
    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        if (flame) { return flammability; }
        return 0;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        if (flame) { return spread; }
        return 0;
    }
    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, @NotNull UseOnContext context, ToolAction toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) { safeCheck = stripped.getBlock() instanceof WallBlock; } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            WallSide east = world.getBlockState(blockPos).getValue(EAST_WALL);
            WallSide west = world.getBlockState(blockPos).getValue(WEST_WALL);
            WallSide north = world.getBlockState(blockPos).getValue(NORTH_WALL);
            WallSide south = world.getBlockState(blockPos).getValue(SOUTH_WALL);
            boolean up = world.getBlockState(blockPos).getValue(UP);
            boolean waterLogged = world.getBlockState(blockPos).getValue(WallBlock.WATERLOGGED);
            return stripped.setValue(EAST_WALL, east).setValue(WATERLOGGED, waterLogged).setValue(UP, up).setValue(WEST_WALL, west).setValue(NORTH_WALL, north).setValue(SOUTH_WALL, south);
        } else { return null; }
    }
}
