package com.dephoegon.delbase.aid.block.colorshift;

import com.dephoegon.delbase.aid.block.stock.gravBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class sandBlock extends gravBlock {
    public sandBlock(int dustColorIn, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip, @NotNull boolean falls) {
        super(dustColorIn, properties, normToolTip, shiftToolTip, ctrlToolTip, falls);
    }
    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (plant.getBlock() == Blocks.CACTUS)
            return true;
        if (plant.getBlock() == Blocks.SUGAR_CANE) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                BlockState blockstate1 = world.getBlockState(pos.relative(direction));
                FluidState fluidstate = world.getFluidState(pos.relative(direction));
                if (fluidstate.is(FluidTags.WATER) || blockstate1.is(Blocks.FROSTED_ICE)) {
                    return true;
                }
            }
        }
        return net.minecraftforge.common.PlantType.DESERT.equals(type);
    }
}
