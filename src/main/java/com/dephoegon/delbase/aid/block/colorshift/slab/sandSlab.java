package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public class sandSlab extends slabBlock {
    public sandSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandSlab(Block block) {
        super(BlockBehaviour.Properties.copy(block).sound(SoundType.SAND), "", "", "", false, 0, 0, null);
    }
    @Override
    public boolean canSustainPlant(BlockState state, @NotNull BlockGetter world, BlockPos pos, @NotNull Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        SlabType s_type = state.getValue(TYPE);
        boolean w_logged = state.getValue(SlabBlock.WATERLOGGED);
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (s_type != SlabType.BOTTOM) {
            if (plant.getBlock() == Blocks.CACTUS) {
                return true;
            }
            if (plant.getBlock() == Blocks.SUGAR_CANE) {
                for (Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockState = world.getBlockState(pos.relative(direction));
                    FluidState fluidState = world.getFluidState(pos.relative(direction));
                    if (w_logged || fluidState.is(FluidTags.WATER) || blockState.is(Blocks.FROSTED_ICE)) {
                        return true;
                    }
                }
            }
            return net.minecraftforge.common.PlantType.DESERT.equals(type);
        }
        return false;
    }
}
