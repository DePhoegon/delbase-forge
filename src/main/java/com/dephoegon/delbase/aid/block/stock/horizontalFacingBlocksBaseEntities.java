package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static com.dephoegon.delbase.block.general.ashBlocks.ASH_BLOCK;

public class horizontalFacingBlocksBaseEntities extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    public horizontalFacingBlocksBaseEntities(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames) {
        super(properties);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
    }
    @Override
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }
    @Override
    public @NotNull BlockState rotate(@NotNull BlockState pState, @NotNull Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }
    @Override
    public @NotNull BlockState mirror(@NotNull BlockState pState, @NotNull Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!kb.HShift() && !kb.HCtrl() && tip0 != null) toolTip.add(new TranslatableComponent(tip0)); //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) toolTip.add(new TranslatableComponent(tip2)); //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) //noinspection GrazieInspection
            toolTip.add(new TranslatableComponent(tip1)); //if shift, show tip1 (if not empty)
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face)
    {
        if (flame) {
            rngBurn(world, state, ASH_BLOCK.get().defaultBlockState(), pos, 40, 60);
            return true;
        }
        return false;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }
    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof blockCuttingStation) {
                ((blockCuttingStation) blockEntity).drops();
            }
        }super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof blockCuttingStation) {
                NetworkHooks.openGui(((ServerPlayer) pPlayer), (blockCuttingStation)entity, pPos);
            } else {
                throw new IllegalStateException("Delbase Block Cutting Station, Container Provider missing");
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
