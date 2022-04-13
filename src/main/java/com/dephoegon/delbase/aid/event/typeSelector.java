package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.block.colorshift.cutSandStone;
import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlab;
import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlabEnergy;
import com.dephoegon.delbase.aid.util.colorMixInteraction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import static com.dephoegon.delbase.block.axis.axiCutSandStones.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStones.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStonesEnergy.*;
import static net.minecraft.world.level.block.Blocks.CUT_RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;

public class typeSelector {
    public static InteractionResult axis_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        if (state == CUT_SANDSTONE.defaultBlockState() ||
                state == CUT_RED_SANDSTONE.defaultBlockState() ||
                block instanceof cutSandStone)
        { return colorMixInteraction.ColorLogic(world, blockPos, state, CUT_SANDSTONE.defaultBlockState(), CUT_RED_SANDSTONE.defaultBlockState(), BLOOD_CUT_SAND_STONE.get().defaultBlockState(), WHITE_CUT_SAND_STONE.get().defaultBlockState(), ORANGE_CUT_SAND_STONE.get().defaultBlockState(), MAGENTA_CUT_SAND_STONE.get().defaultBlockState(), LIGHT_BLUE_CUT_SAND_STONE.get().defaultBlockState(), YELLOW_CUT_SAND_STONE.get().defaultBlockState(), LIME_CUT_SAND_STONE.get().defaultBlockState(), PINK_CUT_SAND_STONE.get().defaultBlockState(), GRAY_CUT_SAND_STONE.get().defaultBlockState(), LIGHT_GRAY_CUT_SAND_STONE.get().defaultBlockState(), CYAN_CUT_SAND_STONE.get().defaultBlockState(), PURPLE_CUT_SAND_STONE.get().defaultBlockState(), BLUE_CUT_SAND_STONE.get().defaultBlockState(), GREEN_CUT_SAND_STONE.get().defaultBlockState(), BROWN_CUT_SAND_STONE.get().defaultBlockState(), BLACK_CUT_SAND_STONE.get().defaultBlockState(), 4, inHand, playerEntity); }
        return InteractionResult.FAIL;
    }
    public static InteractionResult slab_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        if (block instanceof chiseledSandStoneSlab) {
            return colorMixInteraction.ColorLogic(world, blockPos, state, OVERRIDE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), OVERRIDE_RED_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), BLOOD_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), WHITE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), ORANGE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), MAGENTA_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), LIGHT_BLUE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), YELLOW_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), LIME_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), PINK_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), GRAY_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), LIGHT_GRAY_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), CYAN_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), PURPLE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), BLUE_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), GREEN_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), BROWN_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), BLACK_CHISELED_SAND_STONE_SLAB.get().defaultBlockState(), 3, inHand, playerEntity);
        }
        if (block instanceof chiseledSandStoneSlabEnergy) {
            return colorMixInteraction.ColorLogic(world, blockPos, state, OVERRIDE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), OVERRIDE_RED_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), BLOOD_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), WHITE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), ORANGE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), MAGENTA_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), LIGHT_BLUE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), YELLOW_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), LIME_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), PINK_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), GRAY_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), LIGHT_GRAY_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), CYAN_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), PURPLE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), BLUE_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), GREEN_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), BROWN_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), BLACK_CHISELED_SAND_STONE_SLAB_ENERGY.get().defaultBlockState(), 3, inHand,playerEntity);
        }
        return InteractionResult.FAIL;
    }
}
