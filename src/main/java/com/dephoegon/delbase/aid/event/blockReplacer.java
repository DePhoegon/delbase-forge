package com.dephoegon.delbase.aid.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.block.state.properties.WallSide;

import static net.minecraft.world.level.block.RotatedPillarBlock.AXIS;
import static net.minecraft.world.level.block.SlabBlock.*;
import static net.minecraft.world.level.block.StairBlock.*;
import static net.minecraft.world.level.block.WallBlock.*;

public class blockReplacer {
    public static void wallPlacement(Level world, BlockPos blockPos, BlockState defaultBlockState) {
        WallSide east = world.getBlockState(blockPos).getValue(EAST_WALL);
        WallSide west = world.getBlockState(blockPos).getValue(WEST_WALL);
        WallSide north = world.getBlockState(blockPos).getValue(NORTH_WALL);
        WallSide south = world.getBlockState(blockPos).getValue(SOUTH_WALL);
        boolean up = world.getBlockState(blockPos).getValue(UP);
        boolean waterLogged = world.getBlockState(blockPos).getValue(WallBlock.WATERLOGGED);

        world.setBlock(blockPos,defaultBlockState.setValue(WallBlock.WATERLOGGED, waterLogged).setValue(WallBlock.UP, up).setValue(SOUTH_WALL, south).setValue(NORTH_WALL, north).setValue(WEST_WALL, west).setValue(EAST_WALL, east),1);
    }
    public static void stairPlacement(Level world, BlockPos blockPos, BlockState defaultBlockState) {
        Direction facing = world.getBlockState(blockPos).getValue(FACING);
        Half half = world.getBlockState(blockPos).getValue(HALF);
        StairsShape shape = world.getBlockState(blockPos).getValue(SHAPE);
        Boolean waterlogged = world.getBlockState(blockPos).getValue(StairBlock.WATERLOGGED);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(FACING, facing).setValue(HALF, half).setValue(StairBlock.WATERLOGGED, waterlogged).setValue(SHAPE, shape));
    }
    public static void slabPlacement(Level world, BlockPos blockPos, BlockState defaultBlockState) {
        SlabType type = world.getBlockState(blockPos).getValue(TYPE);
        Boolean waterlogged = world.getBlockState(blockPos).getValue(SlabBlock.WATERLOGGED);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(TYPE, type).setValue(SlabBlock.WATERLOGGED, waterlogged));
    }
    public static void axisPlacement(Level world, BlockPos blockPos, BlockState defaultBlockState, boolean cut_lock) {
        if(cut_lock) { world.setBlockAndUpdate(blockPos, defaultBlockState); } else {
            Direction.Axis axis = world.getBlockState(blockPos).getValue(AXIS);
            world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(AXIS, axis));
        }
    }
}
