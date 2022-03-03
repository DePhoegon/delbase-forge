package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.colorshift.sandBlock;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import org.jetbrains.annotations.Contract;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class sandStair extends stairBlock {
    public sandStair(String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(SAND).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, false);
    }
}
