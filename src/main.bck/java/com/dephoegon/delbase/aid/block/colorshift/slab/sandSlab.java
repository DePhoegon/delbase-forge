package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sandSlab extends slabBlock {
    private static final Logger log = LogManager.getLogger();
    public sandSlab(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip);
    }
    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        SlabType stype = state.getValue(TYPE);
        boolean wlogged = state.getValue(SlabBlock.WATERLOGGED);
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (stype != SlabType.BOTTOM) {
            if (plant.getBlock() == Blocks.CACTUS) {
                return true;
            }
            if (plant.getBlock() == Blocks.SUGAR_CANE) {
                for (Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockstate1 = world.getBlockState(pos.relative(direction));
                    FluidState fluidstate = world.getFluidState(pos.relative(direction));
                    if (wlogged || fluidstate.is(FluidTags.WATER) || blockstate1.is(Blocks.FROSTED_ICE)) {
                        return true;
                    }
                }
            }
            return net.minecraftforge.common.PlantType.DESERT.equals(type);
        }
        return false;
    }
}
