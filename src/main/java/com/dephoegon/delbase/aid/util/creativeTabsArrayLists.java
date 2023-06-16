package com.dephoegon.delbase.aid.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.axis.axiCutSandStones.*;
import static com.dephoegon.delbase.block.fence.chiseledSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.concreteFences.*;
import static com.dephoegon.delbase.block.fence.cutSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.fenceMisc.*;
import static com.dephoegon.delbase.block.fence.quartzFences.*;
import static com.dephoegon.delbase.block.fence.sandFences.*;
import static com.dephoegon.delbase.block.fence.sandStoneFences.*;
import static com.dephoegon.delbase.block.fence.smoothSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.stoneFences.*;
import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.block.fence.terracottaFences.*;
import static com.dephoegon.delbase.block.fence.woodenFences.*;
import static com.dephoegon.delbase.block.general.ashBlocks.*;
import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStones.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabConcrete.*;
import static com.dephoegon.delbase.block.slab.slabCutSandStones.*;
import static com.dephoegon.delbase.block.slab.slabCutSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabMisc.*;
import static com.dephoegon.delbase.block.slab.slabQuartz.*;
import static com.dephoegon.delbase.block.slab.slabSandStones.*;
import static com.dephoegon.delbase.block.slab.slabSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabSands.*;
import static com.dephoegon.delbase.block.slab.slabSandsEnergy.*;
import static com.dephoegon.delbase.block.slab.slabSmoothSandStones.*;
import static com.dephoegon.delbase.block.slab.slabSmoothSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabStones.DEEPSLATE_SLAB;
import static com.dephoegon.delbase.block.slab.slabStrippedWood.*;
import static com.dephoegon.delbase.block.slab.slabTerracotta.*;
import static com.dephoegon.delbase.block.slab.slabWood.*;
import static com.dephoegon.delbase.block.stair.stairChiseledSandStones.*;
import static com.dephoegon.delbase.block.stair.stairConcrete.*;
import static com.dephoegon.delbase.block.stair.stairCutSandStones.*;
import static com.dephoegon.delbase.block.stair.stairMisc.*;
import static com.dephoegon.delbase.block.stair.stairQuartz.*;
import static com.dephoegon.delbase.block.stair.stairSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSands.*;
import static com.dephoegon.delbase.block.stair.stairSmoothSandStones.*;
import static com.dephoegon.delbase.block.stair.stairStones.DEEPSLATE_STAIR;
import static com.dephoegon.delbase.block.stair.stairStrippedWood.*;
import static com.dephoegon.delbase.block.stair.stairTerracotta.*;
import static com.dephoegon.delbase.block.stair.stairWood.*;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;
import static com.dephoegon.delbase.block.wall.wallChiseledSandStones.*;
import static com.dephoegon.delbase.block.wall.wallConcrete.*;
import static com.dephoegon.delbase.block.wall.wallCutSandStones.*;
import static com.dephoegon.delbase.block.wall.wallMisc.*;
import static com.dephoegon.delbase.block.wall.wallQuartz.*;
import static com.dephoegon.delbase.block.wall.wallSandStone.*;
import static com.dephoegon.delbase.block.wall.wallSands.*;
import static com.dephoegon.delbase.block.wall.wallSmoothSandStones.*;
import static com.dephoegon.delbase.block.wall.wallStones.DEEPSLATE_WALL;
import static com.dephoegon.delbase.block.wall.wallStones.STONE_WALL;
import static com.dephoegon.delbase.block.wall.wallStrippedWood.*;
import static com.dephoegon.delbase.block.wall.wallTerracotta.*;
import static com.dephoegon.delbase.block.wall.wallWood.*;
import static com.dephoegon.delbase.item.blockCutterPlans.*;
import static com.dephoegon.delbase.item.shiftingDyes.*;

public class creativeTabsArrayLists {
    public static @NotNull ArrayList<RegistryObject<Item>> setBlockCutterPlansList() {
        ArrayList<RegistryObject<Item>> out = new ArrayList<>();
        out.add(WALL_PLANS);
        out.add(SLAB_PLANS);
        out.add(FENCE_PLANS);
        out.add(FENCE_GATE_PLANS);
        out.add(STAIR_PLANS);
        out.add(ARMOR_COMPOUND);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<Item>> setShiftingDyesList() {
        ArrayList<RegistryObject<Item>> out = new ArrayList<>();
        out.add(CLEANSE_SHIFT_DYE);
        out.add(RED_SHIFT_DYE);
        out.add(BLOOD_SHIFT_DYE);
        out.add(WHITE_SHIFT_DYE);
        out.add(ORANGE_SHIFT_DYE);
        out.add(MAGENTA_SHIFT_DYE);
        out.add(LIGHT_BLUE_SHIFT_DYE);
        out.add(YELLOW_SHIFT_DYE);
        out.add(LIME_SHIFT_DYE);
        out.add(PINK_SHIFT_DYE);
        out.add(GRAY_SHIFT_DYE);
        out.add(LIGHT_GRAY_SHIFT_DYE);
        out.add(CYAN_SHIFT_DYE);
        out.add(PURPLE_SHIFT_DYE);
        out.add(BLUE_SHIFT_DYE);
        out.add(GREEN_SHIFT_DYE);
        out.add(BROWN_SHIFT_DYE);
        out.add(BLACK_SHIFT_DYE);
        return out;
    }
    
    public static @NotNull ArrayList<RegistryObject<RotatedPillarBlock>> setAxisCutSandStone() {
        ArrayList<RegistryObject<RotatedPillarBlock>> out = new ArrayList<>();
        out.add(BLOOD_CUT_SAND_STONE);
        out.add(WHITE_CUT_SAND_STONE);
        out.add(ORANGE_CUT_SAND_STONE);
        out.add(MAGENTA_CUT_SAND_STONE);
        out.add(LIGHT_BLUE_CUT_SAND_STONE);
        out.add(YELLOW_CUT_SAND_STONE);
        out.add(LIME_CUT_SAND_STONE);
        out.add(PINK_CUT_SAND_STONE);
        out.add(GRAY_CUT_SAND_STONE);
        out.add(LIGHT_GRAY_CUT_SAND_STONE);
        out.add(CYAN_CUT_SAND_STONE);
        out.add(PURPLE_CUT_SAND_STONE);
        out.add(BLUE_CUT_SAND_STONE);
        out.add(BROWN_CUT_SAND_STONE);
        out.add(BLACK_CUT_SAND_STONE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setChiseledSandStoneFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_CHISELED_SAND_STONE_FENCE);
        out.add(ORANGE_CHISELED_SAND_STONE_FENCE);
        out.add(MAGENTA_CHISELED_SAND_STONE_FENCE);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_FENCE);
        out.add(YELLOW_CHISELED_SAND_STONE_FENCE);
        out.add(LIME_CHISELED_SAND_STONE_FENCE);
        out.add(PINK_CHISELED_SAND_STONE_FENCE);
        out.add(GRAY_CHISELED_SAND_STONE_FENCE);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_FENCE);
        out.add(CYAN_CHISELED_SAND_STONE_FENCE);
        out.add(PURPLE_CHISELED_SAND_STONE_FENCE);
        out.add(BLACK_CHISELED_SAND_STONE_FENCE);
        out.add(BLUE_CHISELED_SAND_STONE_FENCE);
        out.add(BROWN_CHISELED_SAND_STONE_FENCE);
        out.add(GREEN_CHISELED_SAND_STONE_FENCE);
        out.add(RED_CHISELED_SAND_STONE_FENCE);
        out.add(CHISELED_SAND_STONE_FENCE);
        out.add(BLOOD_CHISELED_SAND_STONE_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setChiseledSandStoneFencesGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(ORANGE_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(MAGENTA_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(YELLOW_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(LIME_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(PINK_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(GRAY_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(CYAN_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(PURPLE_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(BLACK_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(BLUE_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(BROWN_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(GREEN_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(RED_CHISELED_SAND_STONE_FENCE_GATE);
        out.add(CHISELED_SAND_STONE_FENCE_GATE);
        out.add(BLOOD_CHISELED_SAND_STONE_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setConcreteFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_CONCRETE_FENCE);
        out.add(ORANGE_CONCRETE_FENCE);
        out.add(MAGENTA_CONCRETE_FENCE);
        out.add(LIGHT_BLUE_CONCRETE_FENCE);
        out.add(YELLOW_CONCRETE_FENCE);
        out.add(LIME_CONCRETE_FENCE);
        out.add(PINK_CONCRETE_FENCE);
        out.add(GRAY_CONCRETE_FENCE);
        out.add(LIGHT_GRAY_CONCRETE_FENCE);
        out.add(CYAN_CONCRETE_FENCE);
        out.add(PURPLE_CONCRETE_FENCE);
        out.add(BLUE_CONCRETE_FENCE);
        out.add(BROWN_CONCRETE_FENCE);
        out.add(GREEN_CONCRETE_FENCE);
        out.add(RED_CONCRETE_FENCE);
        out.add(BLACK_CONCRETE_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setConcreteFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_CONCRETE_FENCE_GATE);
        out.add(ORANGE_CONCRETE_FENCE_GATE);
        out.add(MAGENTA_CONCRETE_FENCE_GATE);
        out.add(LIGHT_BLUE_CONCRETE_FENCE_GATE);
        out.add(YELLOW_CONCRETE_FENCE_GATE);
        out.add(LIME_CONCRETE_FENCE_GATE);
        out.add(PINK_CONCRETE_FENCE_GATE);
        out.add(GRAY_CONCRETE_FENCE_GATE);
        out.add(LIGHT_GRAY_CONCRETE_FENCE_GATE);
        out.add(CYAN_CONCRETE_FENCE_GATE);
        out.add(PURPLE_CONCRETE_FENCE_GATE);
        out.add(BLUE_CONCRETE_FENCE_GATE);
        out.add(BROWN_CONCRETE_FENCE_GATE);
        out.add(GREEN_CONCRETE_FENCE_GATE);
        out.add(RED_CONCRETE_FENCE_GATE);
        out.add(BLACK_CONCRETE_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setCutSandStoneFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_CUT_SAND_STONE_FENCE);
        out.add(ORANGE_CUT_SAND_STONE_FENCE);
        out.add(MAGENTA_CUT_SAND_STONE_FENCE);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_FENCE);
        out.add(YELLOW_CUT_SAND_STONE_FENCE);
        out.add(LIME_CUT_SAND_STONE_FENCE);
        out.add(PINK_CUT_SAND_STONE_FENCE);
        out.add(GRAY_CUT_SAND_STONE_FENCE);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_FENCE);
        out.add(CYAN_CUT_SAND_STONE_FENCE);
        out.add(PURPLE_CUT_SAND_STONE_FENCE);
        out.add(BLUE_CUT_SAND_STONE_FENCE);
        out.add(BROWN_CUT_SAND_STONE_FENCE);
        out.add(GREEN_CUT_SAND_STONE_FENCE);
        out.add(RED_CUT_SAND_STONE_FENCE);
        out.add(BLACK_CUT_SAND_STONE_FENCE);
        out.add(CUT_SAND_STONE_FENCE);
        out.add(BLOOD_CUT_SAND_STONE_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setCutSandStoneFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_CUT_SAND_STONE_FENCE_GATE);
        out.add(ORANGE_CUT_SAND_STONE_FENCE_GATE);
        out.add(MAGENTA_CUT_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE);
        out.add(YELLOW_CUT_SAND_STONE_FENCE_GATE);
        out.add(LIME_CUT_SAND_STONE_FENCE_GATE);
        out.add(PINK_CUT_SAND_STONE_FENCE_GATE);
        out.add(GRAY_CUT_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE);
        out.add(CYAN_CUT_SAND_STONE_FENCE_GATE);
        out.add(PURPLE_CUT_SAND_STONE_FENCE_GATE);
        out.add(BLUE_CUT_SAND_STONE_FENCE_GATE);
        out.add(BROWN_CUT_SAND_STONE_FENCE_GATE);
        out.add(GREEN_CUT_SAND_STONE_FENCE_GATE);
        out.add(RED_CUT_SAND_STONE_FENCE_GATE);
        out.add(BLACK_CUT_SAND_STONE_FENCE_GATE);
        out.add(CUT_SAND_STONE_FENCE_GATE);
        out.add(BLOOD_CUT_SAND_STONE_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setFenceMisc() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(GLOWSTONE_FENCE);
        out.add(COBBLED_BASALT_FENCE);
        out.add(BASALT_FENCE);
        out.add(SMOOTH_BASALT_FENCE);
        out.add(END_STONE_FENCE);
        out.add(DRIPSTONE_FENCE);
        out.add(CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE);
        out.add(RAW_GOLD_FENCE);
        out.add(RAW_COPPER_FENCE);
        out.add(RAW_IRON_FENCE);
        out.add(PURPUR_BLOCK_FENCE);
        out.add(COAL_BLOCK_FENCE);
        out.add(CHISELED_POLISHED_BLACKSTONE_FENCE);
        out.add(POLISHED_BASALT_FENCE);
        out.add(BONE_BLOCK_FENCE);
        out.add(DRIED_KELP_FENCE);
        out.add(NETHERRACK_FENCE);
        out.add(SHROOMLIGHT_FENCE);
        out.add(MAGMA_BLOCK_FENCE);
        out.add(RED_NETHER_BRICK_FENCE);
        out.add(ASH_FENCE); // added into Misc for classification
        out.add(SCULK_FENCE);
        out.add(MUD_FENCE);
        out.add(MUDDY_MANGROVE_ROOT_FENCE);
        out.add(MANGROVE_ROOT_FENCE);
        out.add(OCHRE_FROGLIGHT_FENCE);
        out.add(VERDANT_FROGLIGHT_FENCE);
        out.add(PEARLESCENT_FROGLIGHT_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setFenceGateMisc() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(GLOWSTONE_FENCE_GATE);
        out.add(COBBLED_BASALT_FENCE_GATE);
        out.add(BASALT_FENCE_GATE);
        out.add(SMOOTH_BASALT_FENCE_GATE);
        out.add(END_STONE_FENCE_GATE);
        out.add(DRIPSTONE_FENCE_GATE);
        out.add(CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
        out.add(RAW_GOLD_FENCE_GATE);
        out.add(RAW_COPPER_FENCE_GATE);
        out.add(RAW_IRON_FENCE_GATE);
        out.add(PURPUR_BLOCK_FENCE_GATE);
        out.add(COAL_BLOCK_FENCE_GATE);
        out.add(CHISELED_POLISHED_BLACKSTONE_FENCE_GATE);
        out.add(POLISHED_BASALT_FENCE_GATE);
        out.add(BONE_BLOCK_FENCE_GATE);
        out.add(DRIED_KELP_FENCE_GATE);
        out.add(NETHERRACK_FENCE_GATE);
        out.add(SHROOMLIGHT_FENCE_GATE);
        out.add(MAGMA_BLOCK_FENCE_GATE);
        out.add(NETHER_BRICK_FENCE_GATE);
        out.add(RED_NETHER_BRICK_FENCE_GATE);
        out.add(ASH_FENCE_GATE); // added into Misc for classification
        out.add(SCULK_FENCE_GATE);
        out.add(MUD_FENCE_GATE);
        out.add(MUDDY_MANGROVE_ROOT_FENCE_GATE);
        out.add(MANGROVE_ROOT_FENCE_GATE);
        out.add(OCHRE_FROGLIGHT_FENCE_GATE);
        out.add(VERDANT_FROGLIGHT_FENCE_GATE);
        out.add(PEARLESCENT_FROGLIGHT_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setQuartzFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(QUARTZ_BRICKS_FENCE);
        out.add(QUARTZ_BLOCK_FENCE);
        out.add(SMOOTH_QUARTZ_FENCE);
        out.add(CHISELED_QUARTZ_BLOCK_FENCE);
        out.add(QUARTZ_PILLAR_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setQuartzFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(QUARTZ_BLOCK_FENCE_GATE);
        out.add(QUARTZ_BRICKS_FENCE_GATE);
        out.add(SMOOTH_QUARTZ_FENCE_GATE);
        out.add(CHISELED_QUARTZ_BLOCK_FENCE_GATE);
        out.add(QUARTZ_PILLAR_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setSandFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_SAND_FENCE);
        out.add(ORANGE_SAND_FENCE);
        out.add(MAGENTA_SAND_FENCE);
        out.add(LIGHT_BLUE_SAND_FENCE);
        out.add(YELLOW_SAND_FENCE);
        out.add(LIME_SAND_FENCE);
        out.add(PINK_SAND_FENCE);
        out.add(GRAY_SAND_FENCE);
        out.add(LIGHT_GRAY_SAND_FENCE);
        out.add(CYAN_SAND_FENCE);
        out.add(PURPLE_SAND_FENCE);
        out.add(BLUE_SAND_FENCE);
        out.add(BROWN_SAND_FENCE);
        out.add(BROWN_SAND_FENCE);
        out.add(GREEN_SAND_FENCE);
        out.add(RED_SAND_FENCE);
        out.add(BLACK_SAND_FENCE);
        out.add(SAND_FENCE);
        out.add(BLOOD_SAND_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setSandFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_SAND_FENCE_GATE);
        out.add(ORANGE_SAND_FENCE_GATE);
        out.add(MAGENTA_SAND_FENCE_GATE);
        out.add(LIGHT_BLUE_SAND_FENCE_GATE);
        out.add(YELLOW_SAND_FENCE_GATE);
        out.add(LIME_SAND_FENCE_GATE);
        out.add(PINK_SAND_FENCE_GATE);
        out.add(GRAY_SAND_FENCE_GATE);
        out.add(LIGHT_GRAY_SAND_FENCE_GATE);
        out.add(CYAN_SAND_FENCE_GATE);
        out.add(PURPLE_SAND_FENCE_GATE);
        out.add(BLUE_SAND_FENCE_GATE);
        out.add(BROWN_SAND_FENCE_GATE);
        out.add(BROWN_SAND_FENCE_GATE);
        out.add(GREEN_SAND_FENCE_GATE);
        out.add(RED_SAND_FENCE_GATE);
        out.add(BLACK_SAND_FENCE_GATE);
        out.add(SAND_FENCE_GATE);
        out.add(BLOOD_SAND_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setSandStoneFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_SAND_STONE_FENCE);
        out.add(ORANGE_SAND_STONE_FENCE);
        out.add(MAGENTA_SAND_STONE_FENCE);
        out.add(LIGHT_BLUE_SAND_STONE_FENCE);
        out.add(YELLOW_SAND_STONE_FENCE);
        out.add(LIME_SAND_STONE_FENCE);
        out.add(PINK_SAND_STONE_FENCE);
        out.add(GRAY_SAND_STONE_FENCE);
        out.add(LIGHT_GRAY_SAND_STONE_FENCE);
        out.add(CYAN_SAND_STONE_FENCE);
        out.add(PURPLE_SAND_STONE_FENCE);
        out.add(BLUE_SAND_STONE_FENCE);
        out.add(BROWN_SAND_STONE_FENCE);
        out.add(GREEN_SAND_STONE_FENCE);
        out.add(RED_SAND_STONE_FENCE);
        out.add(BLACK_SAND_STONE_FENCE);
        out.add(SAND_STONE_FENCE);
        out.add(BLOOD_SAND_STONE_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setSandStoneFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_SAND_STONE_FENCE_GATE);
        out.add(ORANGE_SAND_STONE_FENCE_GATE);
        out.add(MAGENTA_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_BLUE_SAND_STONE_FENCE_GATE);
        out.add(YELLOW_SAND_STONE_FENCE_GATE);
        out.add(LIME_SAND_STONE_FENCE_GATE);
        out.add(PINK_SAND_STONE_FENCE_GATE);
        out.add(GRAY_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_GRAY_SAND_STONE_FENCE_GATE);
        out.add(CYAN_SAND_STONE_FENCE_GATE);
        out.add(PURPLE_SAND_STONE_FENCE_GATE);
        out.add(BLUE_SAND_STONE_FENCE_GATE);
        out.add(BROWN_SAND_STONE_FENCE_GATE);
        out.add(GREEN_SAND_STONE_FENCE_GATE);
        out.add(RED_SAND_STONE_FENCE_GATE);
        out.add(BLACK_SAND_STONE_FENCE_GATE);
        out.add(SAND_STONE_FENCE_GATE);
        out.add(BLOOD_SAND_STONE_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setSmoothSandStoneFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_SMOOTH_SAND_STONE_FENCE);
        out.add(ORANGE_SAND_STONE_FENCE);
        out.add(MAGENTA_SMOOTH_SAND_STONE_FENCE);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE);
        out.add(YELLOW_SMOOTH_SAND_STONE_FENCE);
        out.add(LIME_SMOOTH_SAND_STONE_FENCE);
        out.add(PINK_SMOOTH_SAND_STONE_FENCE);
        out.add(GRAY_SMOOTH_SAND_STONE_FENCE);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE);
        out.add(CYAN_SMOOTH_SAND_STONE_FENCE);
        out.add(PURPLE_SMOOTH_SAND_STONE_FENCE);
        out.add(BLUE_SMOOTH_SAND_STONE_FENCE);
        out.add(BROWN_SMOOTH_SAND_STONE_FENCE);
        out.add(GREEN_SMOOTH_SAND_STONE_FENCE);
        out.add(RED_SMOOTH_SAND_STONE_FENCE);
        out.add(BLACK_SMOOTH_SAND_STONE_FENCE);
        out.add(SMOOTH_SAND_STONE_FENCE);
        out.add(BLOOD_SMOOTH_SAND_STONE_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setSmoothSandStoneFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(ORANGE_SAND_STONE_FENCE_GATE);
        out.add(MAGENTA_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(YELLOW_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(LIME_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(PINK_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(GRAY_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(CYAN_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(PURPLE_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(BLUE_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(BROWN_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(GREEN_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(RED_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(BLACK_SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(SMOOTH_SAND_STONE_FENCE_GATE);
        out.add(BLOOD_SMOOTH_SAND_STONE_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setStoneFenceGate() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(STONE_FENCE_GATE);
        out.add(COBBLESTONE_FENCE_GATE);
        out.add(DEEPSLATE_FENCE_GATE);
        out.add(COBBLED_DEEPSLATE_FENCE_GATE);
        out.add(DEEPSLATE_TILE_FENCE_GATE);
        out.add(POLISHED_DEEPSLATE_FENCE_GATE);
        out.add(DEEPSLATE_BRICK_FENCE_GATE);
        out.add(MUD_BRICK_FENCE_GATE);
        out.add(PACKED_MUD_FENCE_GATE);
        out.add(BRICK_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setStoneFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(STONE_FENCE);
        out.add(COBBLESTONE_FENCE);
        out.add(DEEPSLATE_FENCE);
        out.add(COBBLED_DEEPSLATE_FENCE);
        out.add(DEEPSLATE_TILE_FENCE);
        out.add(POLISHED_DEEPSLATE_FENCE);
        out.add(DEEPSLATE_BRICK_FENCE);
        out.add(MUD_BRICK_FENCE);
        out.add(PACKED_MUD_FENCE);
        out.add(BRICK_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setStrippedWoodenFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(STRIPPED_ACACIA_WOOD_FENCE);
        out.add(STRIPPED_ACACIA_LOG_FENCE);
        out.add(STRIPPED_BIRCH_WOOD_FENCE);
        out.add(STRIPPED_BIRCH_LOG_FENCE);
        out.add(STRIPPED_CRIMSON_HYPHAE_FENCE);
        out.add(STRIPPED_CRIMSON_STEM_FENCE);
        out.add(STRIPPED_DARK_OAK_WOOD_FENCE);
        out.add(STRIPPED_JUNGLE_WOOD_FENCE);
        out.add(STRIPPED_JUNGLE_LOG_FENCE);
        out.add(STRIPPED_OAK_WOOD_FENCE);
        out.add(STRIPPED_OAK_LOG_FENCE);
        out.add(STRIPPED_SPRUCE_WOOD_FENCE);
        out.add(STRIPPED_SPRUCE_LOG_FENCE);
        out.add(STRIPPED_WARPED_HYPHAE_FENCE);
        out.add(STRIPPED_WARPED_STEM_FENCE);
        out.add(STRIPPED_MANGROVE_LOG_FENCE);
        out.add(STRIPPED_MANGROVE_WOOD_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setStrippedWoodenFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(STRIPPED_ACACIA_WOOD_FENCE_GATE);
        out.add(STRIPPED_ACACIA_LOG_FENCE_GATE);
        out.add(STRIPPED_BIRCH_WOOD_FENCE_GATE);
        out.add(STRIPPED_BIRCH_LOG_FENCE_GATE);
        out.add(STRIPPED_CRIMSON_HYPHAE_FENCE_GATE);
        out.add(STRIPPED_CRIMSON_STEM_FENCE_GATE);
        out.add(STRIPPED_DARK_OAK_WOOD_FENCE_GATE);
        out.add(STRIPPED_JUNGLE_WOOD_FENCE_GATE);
        out.add(STRIPPED_JUNGLE_LOG_FENCE_GATE);
        out.add(STRIPPED_OAK_WOOD_FENCE_GATE);
        out.add(STRIPPED_OAK_LOG_FENCE_GATE);
        out.add(STRIPPED_SPRUCE_WOOD_FENCE_GATE);
        out.add(STRIPPED_SPRUCE_LOG_FENCE_GATE);
        out.add(STRIPPED_WARPED_HYPHAE_FENCE_GATE);
        out.add(STRIPPED_WARPED_STEM_FENCE_GATE);
        out.add(STRIPPED_MANGROVE_WOOD_FENCE_GATE);
        out.add(STRIPPED_MANGROVE_LOG_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setTerracottaFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(WHITE_TERRACOTTA_FENCE);
        out.add(ORANGE_TERRACOTTA_FENCE);
        out.add(MAGENTA_TERRACOTTA_FENCE);
        out.add(LIGHT_BLUE_TERRACOTTA_FENCE);
        out.add(YELLOW_TERRACOTTA_FENCE);
        out.add(LIME_TERRACOTTA_FENCE);
        out.add(PINK_TERRACOTTA_FENCE);
        out.add(GRAY_TERRACOTTA_FENCE);
        out.add(LIGHT_GRAY_TERRACOTTA_FENCE);
        out.add(CYAN_TERRACOTTA_FENCE);
        out.add(PURPLE_TERRACOTTA_FENCE);
        out.add(BLUE_TERRACOTTA_FENCE);
        out.add(BROWN_TERRACOTTA_FENCE);
        out.add(GREEN_TERRACOTTA_FENCE);
        out.add(RED_TERRACOTTA_FENCE);
        out.add(BLACK_TERRACOTTA_FENCE);
        out.add(TERRACOTTA_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setTerracottaFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(WHITE_TERRACOTTA_FENCE_GATE);
        out.add(ORANGE_TERRACOTTA_FENCE_GATE);
        out.add(MAGENTA_TERRACOTTA_FENCE_GATE);
        out.add(LIGHT_BLUE_TERRACOTTA_FENCE_GATE);
        out.add(YELLOW_TERRACOTTA_FENCE_GATE);
        out.add(LIME_TERRACOTTA_FENCE_GATE);
        out.add(PINK_TERRACOTTA_FENCE_GATE);
        out.add(GRAY_TERRACOTTA_FENCE_GATE);
        out.add(LIGHT_GRAY_TERRACOTTA_FENCE_GATE);
        out.add(CYAN_TERRACOTTA_FENCE_GATE);
        out.add(PURPLE_TERRACOTTA_FENCE_GATE);
        out.add(BLUE_TERRACOTTA_FENCE_GATE);
        out.add(BROWN_TERRACOTTA_FENCE_GATE);
        out.add(GREEN_TERRACOTTA_FENCE_GATE);
        out.add(RED_TERRACOTTA_FENCE_GATE);
        out.add(BLACK_TERRACOTTA_FENCE_GATE);
        out.add(TERRACOTTA_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceBlock>> setWoodenFences() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(ACACIA_WOOD_FENCE);
        out.add(ACACIA_LOG_FENCE);
        out.add(BIRCH_WOOD_FENCE);
        out.add(BIRCH_LOG_FENCE);
        out.add(CRIMSON_HYPHAE_FENCE);
        out.add(CRIMSON_STEM_FENCE);
        out.add(DARK_OAK_WOOD_FENCE);
        out.add(DARK_OAK_LOG_FENCE);
        out.add(JUNGLE_WOOD_FENCE);
        out.add(JUNGLE_LOG_FENCE);
        out.add(OAK_WOOD_FENCE);
        out.add(OAK_LOG_FENCE);
        out.add(SPRUCE_WOOD_FENCE);
        out.add(SPRUCE_LOG_FENCE);
        out.add(WARPED_HYPHAE_FENCE);
        out.add(WARPED_STEM_FENCE);
        out.add(MANGROVE_WOOD_FENCE);
        out.add(MANGROVE_LOG_FENCE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<FenceGateBlock>> setWoodenFenceGates() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(ACACIA_WOOD_FENCE_GATE);
        out.add(ACACIA_LOG_FENCE_GATE);
        out.add(BIRCH_WOOD_FENCE_GATE);
        out.add(BIRCH_LOG_FENCE_GATE);
        out.add(CRIMSON_HYPHAE_FENCE_GATE);
        out.add(CRIMSON_STEM_FENCE_GATE);
        out.add(DARK_OAK_WOOD_FENCE_GATE);
        out.add(DARK_OAK_LOG_FENCE_GATE);
        out.add(JUNGLE_WOOD_FENCE_GATE);
        out.add(JUNGLE_LOG_FENCE_GATE);
        out.add(OAK_WOOD_FENCE_GATE);
        out.add(OAK_LOG_FENCE_GATE);
        out.add(SPRUCE_WOOD_FENCE_GATE);
        out.add(SPRUCE_LOG_FENCE_GATE);
        out.add(WARPED_HYPHAE_FENCE_GATE);
        out.add(WARPED_STEM_FENCE_GATE);
        out.add(MANGROVE_WOOD_FENCE_GATE);
        out.add(MANGROVE_LOG_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> setAshBlocks() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.add(ASH_SLAB);
        out.add(ASH_STAIR);
        out.add(ASH_LOG);
        out.add(ASH_BLOCK);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<Block>> setChiseledSandStones() {
        ArrayList<RegistryObject<Block>> out = new ArrayList<>();
        out.add(BLOOD_CHISELED_SAND_STONE);
        out.add(WHITE_CHISELED_SAND_STONE);
        out.add(ORANGE_CHISELED_SAND_STONE);
        out.add(MAGENTA_CHISELED_SAND_STONE);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE);
        out.add(YELLOW_CHISELED_SAND_STONE);
        out.add(LIME_CHISELED_SAND_STONE);
        out.add(PINK_CHISELED_SAND_STONE);
        out.add(GRAY_CHISELED_SAND_STONE);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE);
        out.add(CYAN_CHISELED_SAND_STONE);
        out.add(PURPLE_CHISELED_SAND_STONE);
        out.add(BLUE_CHISELED_SAND_STONE);
        out.add(GREEN_CHISELED_SAND_STONE);
        out.add(BROWN_CHISELED_SAND_STONE);
        out.add(BLACK_CHISELED_SAND_STONE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<Block>> setSandStones() {
        ArrayList<RegistryObject<Block>> out = new ArrayList<>();
        out.add(BLOOD_SAND_STONE);
        out.add(WHITE_SAND_STONE);
        out.add(ORANGE_SAND_STONE);
        out.add(MAGENTA_SAND_STONE);
        out.add(YELLOW_SAND_STONE);
        out.add(LIGHT_BLUE_SAND_STONE);
        out.add(LIME_SAND_STONE);
        out.add(PINK_SAND_STONE);
        out.add(GRAY_SAND_STONE);
        out.add(LIGHT_GRAY_SAND_STONE);
        out.add(CYAN_SAND_STONE);
        out.add(PURPLE_SAND_STONE);
        out.add(BLUE_SAND_STONE);
        out.add(GREEN_SAND_STONE);
        out.add(BROWN_SAND_STONE);
        out.add(BLACK_SAND_STONE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<Block>> setSmoothSandStones() {
        ArrayList<RegistryObject<Block>> out = new ArrayList<>();
        out.add(BLOOD_SMOOTH_SAND_STONE);
        out.add(WHITE_SMOOTH_SAND_STONE);
        out.add(ORANGE_SMOOTH_SAND_STONE);
        out.add(MAGENTA_SMOOTH_SAND_STONE);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE);
        out.add(YELLOW_SMOOTH_SAND_STONE);
        out.add(LIME_SMOOTH_SAND_STONE);
        out.add(PINK_SMOOTH_SAND_STONE);
        out.add(GRAY_SMOOTH_SAND_STONE);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE);
        out.add(CYAN_SMOOTH_SAND_STONE);
        out.add(PURPLE_SMOOTH_SAND_STONE);
        out.add(BLUE_SMOOTH_SAND_STONE);
        out.add(GREEN_SMOOTH_SAND_STONE);
        out.add(BLACK_SMOOTH_SAND_STONE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SandBlock>> setSands() {
        ArrayList<RegistryObject<SandBlock>> out = new ArrayList<>();
        out.add(BLOOD_SAND);
        out.add(WHITE_SAND);
        out.add(ORANGE_SAND);
        out.add(MAGENTA_SAND);
        out.add(LIGHT_BLUE_SAND);
        out.add(YELLOW_SAND);
        out.add(LIME_SAND);
        out.add(PINK_SAND);
        out.add(GRAY_SAND);
        out.add(PURPLE_SAND);
        out.add(BLUE_SAND);
        out.add(LIGHT_GRAY_SAND);
        out.add(CYAN_SAND);
        out.add(GREEN_SAND);
        out.add(BROWN_SAND);
        out.add(BLACK_SAND);
        out.add(OVERRIDE_RED_SOLID_SAND);
        out.add(OVERRIDE_SOLID_SAND);
        out.add(BLOOD_SOLID_SAND);
        out.add(WHITE_SOLID_SAND);
        out.add(ORANGE_SOLID_SAND);
        out.add(MAGENTA_SOLID_SAND);
        out.add(LIGHT_BLUE_SOLID_SAND);
        out.add(YELLOW_SOLID_SAND);
        out.add(LIME_SOLID_SAND);
        out.add(PINK_SOLID_SAND);
        out.add(GRAY_SOLID_SAND);
        out.add(LIGHT_GRAY_SOLID_SAND);
        out.add(CYAN_SOLID_SAND);
        out.add(PURPLE_SOLID_SAND);
        out.add(BLUE_SOLID_SAND);
        out.add(GREEN_SOLID_SAND);
        out.add(BROWN_SOLID_SAND);
        out.add(BLACK_SOLID_SAND);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setChiseledSandStoneSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_CHISELED_SAND_STONE_SLAB);
        out.add(OVERRIDE_RED_CHISELED_SAND_STONE_SLAB);
        out.add(BLOOD_CHISELED_SAND_STONE_SLAB);
        out.add(WHITE_CHISELED_SAND_STONE_SLAB);
        out.add(ORANGE_CHISELED_SAND_STONE_SLAB);
        out.add(MAGENTA_CHISELED_SAND_STONE_SLAB);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_SLAB);
        out.add(YELLOW_CHISELED_SAND_STONE_SLAB);
        out.add(LIME_CHISELED_SAND_STONE_SLAB);
        out.add(PINK_CHISELED_SAND_STONE_SLAB);
        out.add(GRAY_CHISELED_SAND_STONE_SLAB);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_SLAB);
        out.add(CYAN_CHISELED_SAND_STONE_SLAB);
        out.add(PURPLE_CHISELED_SAND_STONE_SLAB);
        out.add(BLUE_CHISELED_SAND_STONE_SLAB);
        out.add(GREEN_CHISELED_SAND_STONE_SLAB);
        out.add(BROWN_CHISELED_SAND_STONE_SLAB);
        out.add(BLACK_CHISELED_SAND_STONE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setChiseledSandStoneEnergySlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(OVERRIDE_RED_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(BLOOD_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(WHITE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(ORANGE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(MAGENTA_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(YELLOW_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(LIME_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(PINK_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(GRAY_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(CYAN_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(PURPLE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(BLUE_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(GREEN_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(BROWN_CHISELED_SAND_STONE_SLAB_ENERGY);
        out.add(BLACK_CHISELED_SAND_STONE_SLAB_ENERGY);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setConcreteSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(RED_CONCRETE_SLAB);
        out.add(WHITE_CONCRETE_SLAB);
        out.add(ORANGE_CONCRETE_SLAB);
        out.add(MAGENTA_CONCRETE_SLAB);
        out.add(LIGHT_BLUE_CONCRETE_SLAB);
        out.add(YELLOW_CONCRETE_SLAB);
        out.add(LIME_CONCRETE_SLAB);
        out.add(PINK_CONCRETE_SLAB);
        out.add(GRAY_CONCRETE_SLAB);
        out.add(LIGHT_GRAY_CONCRETE_SLAB);
        out.add(CYAN_CONCRETE_SLAB);
        out.add(PURPLE_CONCRETE_SLAB);
        out.add(BLUE_CONCRETE_SLAB);
        out.add(GREEN_CONCRETE_SLAB);
        out.add(BROWN_CONCRETE_SLAB);
        out.add(BLACK_CONCRETE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setCutSandStoneSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLOOD_CUT_SAND_STONE_SLAB);
        out.add(WHITE_CUT_SAND_STONE_SLAB);
        out.add(ORANGE_CUT_SAND_STONE_SLAB);
        out.add(MAGENTA_CUT_SAND_STONE_SLAB);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_SLAB);
        out.add(YELLOW_CUT_SAND_STONE_SLAB);
        out.add(LIME_CUT_SAND_STONE_SLAB);
        out.add(PINK_CUT_SAND_STONE_SLAB);
        out.add(GRAY_CUT_SAND_STONE_SLAB);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_SLAB);
        out.add(CYAN_CUT_SAND_STONE_SLAB);
        out.add(PURPLE_CUT_SAND_STONE_SLAB);
        out.add(BLUE_CUT_SAND_STONE_SLAB);
        out.add(GREEN_CUT_SAND_STONE_SLAB);
        out.add(BROWN_CUT_SAND_STONE_SLAB);
        out.add(BLACK_CUT_SAND_STONE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setCutSandStoneEnergySlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(OVERRIDE_RED_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(BLOOD_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(WHITE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(ORANGE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(MAGENTA_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(YELLOW_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(LIME_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(PINK_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(GRAY_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(CYAN_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(PURPLE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(BLUE_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(GREEN_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(BROWN_CUT_SAND_STONE_SLAB_ENERGY);
        out.add(BLACK_CUT_SAND_STONE_SLAB_ENERGY);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setMiscSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(END_STONE_SLAB);
        out.add(BONE_BLOCK_SLAB);
        out.add(DRIED_KELP_SLAB);
        out.add(GLOWSTONE_SLAB);
        out.add(BASALT_SLAB);
        out.add(POLISHED_BASALT_SLAB);
        out.add(SMOOTH_BASALT_SLAB);
        out.add(RAW_GOLD_SLAB);
        out.add(RAW_COPPER_SLAB);
        out.add(RAW_IRON_SLAB);
        out.add(COAL_BLOCK_SLAB);
        out.add(CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        out.add(CHISELED_POLISHED_BLACKSTONE_SLAB);
        out.add(DRIPSTONE_SLAB);
        out.add(NETHERRACK_SLAB);
        out.add(SHROOMLIGHT_SLAB);
        out.add(MAGMA_BLOCK_SLAB);
        out.add(PACKED_MUD_SLAB);
        out.add(SCULK_SLAB);
        out.add(MUD_SLAB);
        out.add(MUDDY_MANGROVE_ROOT_SLAB);
        out.add(MANGROVE_ROOT_SLAB);
        out.add(OCHRE_FROGLIGHT_SLAB);
        out.add(VERDANT_FROGLIGHT_SLAB);
        out.add(PEARLESCENT_FROGLIGHT_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setQuartzSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(CHISELED_QUARTZ_SLAB);
        out.add(QUARTZ_BRICK_SLAB);
        out.add(QUARTZ_PILLAR_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSandSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_SAND_SLAB);
        out.add(OVERRIDE_RED_SAND_SLAB);
        out.add(BLOOD_SAND_SLAB);
        out.add(WHITE_SAND_SLAB);
        out.add(ORANGE_SAND_SLAB);
        out.add(MAGENTA_SAND_SLAB);
        out.add(LIGHT_BLUE_SAND_SLAB);
        out.add(YELLOW_SAND_SLAB);
        out.add(LIME_SAND_SLAB);
        out.add(PINK_SAND_SLAB);
        out.add(GRAY_SAND_SLAB);
        out.add(LIGHT_GRAY_SAND_SLAB);
        out.add(CYAN_SAND_SLAB);
        out.add(PURPLE_SAND_SLAB);
        out.add(BLUE_SAND_SLAB);
        out.add(GREEN_SAND_SLAB);
        out.add(BROWN_SAND_SLAB);
        out.add(BLACK_SAND_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSandEnergySlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_SAND_SLAB_ENERGY);
        out.add(OVERRIDE_RED_SAND_SLAB_ENERGY);
        out.add(BLOOD_SAND_SLAB_ENERGY);
        out.add(WHITE_SAND_SLAB_ENERGY);
        out.add(ORANGE_SAND_SLAB_ENERGY);
        out.add(MAGENTA_SAND_SLAB_ENERGY);
        out.add(LIGHT_BLUE_SAND_SLAB_ENERGY);
        out.add(YELLOW_SAND_SLAB_ENERGY);
        out.add(LIME_SAND_SLAB_ENERGY);
        out.add(PINK_SAND_SLAB_ENERGY);
        out.add(GRAY_SAND_SLAB_ENERGY);
        out.add(LIGHT_GRAY_SAND_SLAB_ENERGY);
        out.add(CYAN_SAND_SLAB_ENERGY);
        out.add(PURPLE_SAND_SLAB_ENERGY);
        out.add(BLUE_SAND_SLAB_ENERGY);
        out.add(GREEN_SAND_SLAB_ENERGY);
        out.add(BROWN_SAND_SLAB_ENERGY);
        out.add(BLACK_SAND_SLAB_ENERGY);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSandStoneSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLOOD_SAND_STONE_SLAB);
        out.add(WHITE_SAND_STONE_SLAB);
        out.add(ORANGE_SAND_STONE_SLAB);
        out.add(MAGENTA_SAND_STONE_SLAB);
        out.add(LIGHT_BLUE_SAND_STONE_SLAB);
        out.add(YELLOW_SAND_STONE_SLAB);
        out.add(LIME_SAND_STONE_SLAB);
        out.add(PINK_SAND_STONE_SLAB);
        out.add(GRAY_SAND_STONE_SLAB);
        out.add(LIGHT_GRAY_SAND_STONE_SLAB);
        out.add(PURPLE_SAND_STONE_SLAB);
        out.add(BLUE_SAND_STONE_SLAB);
        out.add(GREEN_SAND_STONE_SLAB);
        out.add(BROWN_SAND_STONE_SLAB);
        out.add(BLACK_SAND_STONE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSandStoneEnergySlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLOOD_SAND_STONE_SLAB_ENERGY);
        out.add(WHITE_SAND_STONE_SLAB_ENERGY);
        out.add(ORANGE_SAND_STONE_SLAB_ENERGY);
        out.add(MAGENTA_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_BLUE_SAND_STONE_SLAB_ENERGY);
        out.add(YELLOW_SAND_STONE_SLAB_ENERGY);
        out.add(LIME_SAND_STONE_SLAB_ENERGY);
        out.add(PINK_SAND_STONE_SLAB_ENERGY);
        out.add(GRAY_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_GRAY_SAND_STONE_SLAB_ENERGY);
        out.add(PURPLE_SAND_STONE_SLAB_ENERGY);
        out.add(BLUE_SAND_STONE_SLAB_ENERGY);
        out.add(GREEN_SAND_STONE_SLAB_ENERGY);
        out.add(BROWN_SAND_STONE_SLAB_ENERGY);
        out.add(BLACK_SAND_STONE_SLAB_ENERGY);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSmoothSandStoneSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLOOD_SMOOTH_SAND_STONE_SLAB);
        out.add(WHITE_SMOOTH_SAND_STONE_SLAB);
        out.add(ORANGE_SMOOTH_SAND_STONE_SLAB);
        out.add(MAGENTA_SMOOTH_SAND_STONE_SLAB);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB);
        out.add(LIME_SMOOTH_SAND_STONE_SLAB);
        out.add(PINK_SMOOTH_SAND_STONE_SLAB);
        out.add(GRAY_SMOOTH_SAND_STONE_SLAB);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB);
        out.add(CYAN_SMOOTH_SAND_STONE_SLAB);
        out.add(PURPLE_SMOOTH_SAND_STONE_SLAB);
        out.add(BLUE_SMOOTH_SAND_STONE_SLAB);
        out.add(GREEN_SMOOTH_SAND_STONE_SLAB);
        out.add(BROWN_SMOOTH_SAND_STONE_SLAB);
        out.add(BLACK_SMOOTH_SAND_STONE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setSmoothSandStoneEnergySlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(LIME_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(PINK_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY);
        out.add(BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setStonesSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(DEEPSLATE_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setStrippedWoodSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(STRIPPED_SPRUCE_WOOD_SLAB);
        out.add(STRIPPED_SPRUCE_LOG_SLAB);
        out.add(STRIPPED_OAK_WOOD_SLAB);
        out.add(STRIPPED_OAK_LOG_SLAB);
        out.add(STRIPPED_WARPED_HYPHAE_SLAB);
        out.add(STRIPPED_WARPED_STEM_SLAB);
        out.add(STRIPPED_CRIMSON_HYPHAE_SLAB);
        out.add(STRIPPED_CRIMSON_STEM_SLAB);
        out.add(STRIPPED_DARK_OAK_WOOD_SLAB);
        out.add(STRIPPED_DARK_OAK_LOG_SLAB);
        out.add(STRIPPED_ACACIA_WOOD_SLAB);
        out.add(STRIPPED_ACACIA_LOG_SLAB);
        out.add(STRIPPED_JUNGLE_WOOD_SLAB);
        out.add(STRIPPED_JUNGLE_LOG_SLAB);
        out.add(STRIPPED_BIRCH_WOOD_SLAB);
        out.add(STRIPPED_BIRCH_LOG_SLAB);
        out.add(STRIPPED_MANGROVE_WOOD_SLAB);
        out.add(STRIPPED_MANGROVE_LOG_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setTerracottaSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(WHITE_TERRACOTTA_SLAB);
        out.add(ORANGE_TERRACOTTA_SLAB);
        out.add(LIGHT_BLUE_TERRACOTTA_SLAB);
        out.add(YELLOW_TERRACOTTA_SLAB);
        out.add(LIME_TERRACOTTA_SLAB);
        out.add(PINK_TERRACOTTA_SLAB);
        out.add(GRAY_TERRACOTTA_SLAB);
        out.add(LIGHT_GRAY_TERRACOTTA_SLAB);
        out.add(CYAN_TERRACOTTA_SLAB);
        out.add(PURPLE_TERRACOTTA_SLAB);
        out.add(BLUE_TERRACOTTA_SLAB);
        out.add(BROWN_TERRACOTTA_SLAB);
        out.add(GREEN_TERRACOTTA_SLAB);
        out.add(RED_TERRACOTTA_SLAB);
        out.add(BLACK_TERRACOTTA_SLAB);
        out.add(TERRACOTTA_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<SlabBlock>> setWoodSlabs() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(SPRUCE_WOOD_SLAB);
        out.add(SPRUCE_LOG_SLAB);
        out.add(OAK_WOOD_SLAB);
        out.add(OAK_LOG_SLAB);
        out.add(WARPED_HYPHAE_SLAB);
        out.add(WARPED_STEM_SLAB);
        out.add(CRIMSON_HYPHAE_SLAB);
        out.add(CRIMSON_STEM_SLAB);
        out.add(DARK_OAK_WOOD_SLAB);
        out.add(DARK_OAK_LOG_SLAB);
        out.add(ACACIA_WOOD_SLAB);
        out.add(ACACIA_LOG_SLAB);
        out.add(JUNGLE_WOOD_SLAB);
        out.add(JUNGLE_LOG_SLAB);
        out.add(BIRCH_WOOD_SLAB);
        out.add(BIRCH_LOG_SLAB);
        out.add(MANGROVE_WOOD_SLAB);
        out.add(MANGROVE_LOG_SLAB);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setChiseledSandStoneStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(CHISELED_SAND_STONE_STAIR);
        out.add(RED_CHISELED_SAND_STONE_STAIR);
        out.add(BLOOD_CHISELED_SAND_STONE_STAIR);
        out.add(WHITE_CHISELED_SAND_STONE_STAIR);
        out.add(ORANGE_CHISELED_SAND_STONE_STAIR);
        out.add(MAGENTA_CHISELED_SAND_STONE_STAIR);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_STAIR);
        out.add(YELLOW_CHISELED_SAND_STONE_STAIR);
        out.add(LIME_CHISELED_SAND_STONE_STAIR);
        out.add(PINK_CHISELED_SAND_STONE_STAIR);
        out.add(GRAY_CHISELED_SAND_STONE_STAIR);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_STAIR);
        out.add(CYAN_CHISELED_SAND_STONE_STAIR);
        out.add(PURPLE_CHISELED_SAND_STONE_STAIR);
        out.add(GREEN_CHISELED_SAND_STONE_STAIR);
        out.add(BROWN_CHISELED_SAND_STONE_STAIR);
        out.add(BLACK_CHISELED_SAND_STONE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setConcreteStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(RED_CONCRETE_STAIR);
        out.add(WHITE_CONCRETE_STAIR);
        out.add(ORANGE_CONCRETE_STAIR);
        out.add(MAGENTA_CONCRETE_STAIR);
        out.add(LIGHT_BLUE_CONCRETE_STAIR);
        out.add(YELLOW_CONCRETE_STAIR);
        out.add(LIME_CONCRETE_STAIR);
        out.add(PINK_CONCRETE_STAIR);
        out.add(GRAY_CONCRETE_STAIR);
        out.add(LIGHT_GRAY_CONCRETE_STAIR);
        out.add(CYAN_CONCRETE_STAIR);
        out.add(PURPLE_CONCRETE_STAIR);
        out.add(BLUE_CONCRETE_STAIR);
        out.add(GREEN_CONCRETE_STAIR);
        out.add(BROWN_CONCRETE_STAIR);
        out.add(BLACK_CONCRETE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setCutSandStoneStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(CUT_SAND_STONE_STAIR);
        out.add(RED_CUT_SAND_STONE_STAIR);
        out.add(BLOOD_CUT_SAND_STONE_STAIR);
        out.add(WHITE_CUT_SAND_STONE_STAIR);
        out.add(ORANGE_CUT_SAND_STONE_STAIR);
        out.add(MAGENTA_CUT_SAND_STONE_STAIR);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_STAIR);
        out.add(YELLOW_CUT_SAND_STONE_STAIR);
        out.add(LIME_CUT_SAND_STONE_STAIR);
        out.add(PINK_CUT_SAND_STONE_STAIR);
        out.add(GRAY_CUT_SAND_STONE_STAIR);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_STAIR);
        out.add(CYAN_CUT_SAND_STONE_STAIR);
        out.add(PURPLE_CUT_SAND_STONE_STAIR);
        out.add(BLUE_CUT_SAND_STONE_STAIR);
        out.add(GREEN_CUT_SAND_STONE_STAIR);
        out.add(BROWN_CUT_SAND_STONE_STAIR);
        out.add(BLACK_CUT_SAND_STONE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setMiscStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(END_STONE_STAIR);
        out.add(BONE_BLOCK_STAIR);
        out.add(DRIED_KELP_STAIR);
        out.add(GLOWSTONE_STAIR);
        out.add(BASALT_STAIR);
        out.add(POLISHED_BASALT_STAIR);
        out.add(SMOOTH_BASALT_STAIR);
        out.add(COBBLED_BASALT_STAIR);
        out.add(RAW_GOLD_STAIR);
        out.add(RAW_COPPER_STAIR);
        out.add(RAW_IRON_STAIR);
        out.add(COAL_BLOCK_STAIR);
        out.add(CRACKED_POLISHED_BLACKSTONE_BRICK_STAIR);
        out.add(CHISELED_POLISHED_BLACKSTONE_STAIR);
        out.add(DRIPSTONE_STAIR);
        out.add(NETHERRACK_STAIR);
        out.add(SHROOMLIGHT_STAIR);
        out.add(MAGMA_BLOCK_STAIR);
        out.add(PACKED_MUD_STAIR);
        out.add(SCULK_STAIR);
        out.add(MUD_STAIR);
        out.add(MUDDY_MANGROVE_ROOT_STAIR);
        out.add(MANGROVE_ROOT_STAIR);
        out.add(OCHRE_FROGLIGHT_STAIR);
        out.add(VERDANT_FROGLIGHT_STAIR);
        out.add(PEARLESCENT_FROGLIGHT_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setQuartzStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(CHISELED_QUARTZ_STAIR);
        out.add(QUARTZ_BRICK_STAIR);
        out.add(QUARTZ_PILLAR_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setSandStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(SAND_STAIR);
        out.add(RED_SAND_STAIR);
        out.add(BLOOD_SAND_STAIR);
        out.add(WHITE_SAND_STAIR);
        out.add(ORANGE_SAND_STAIR);
        out.add(MAGENTA_SAND_STAIR);
        out.add(LIGHT_BLUE_SAND_STAIR);
        out.add(YELLOW_SAND_STAIR);
        out.add(LIME_SAND_STAIR);
        out.add(PINK_SAND_STAIR);
        out.add(GREEN_SAND_STAIR);
        out.add(GRAY_SAND_STAIR);
        out.add(LIGHT_GRAY_SAND_STAIR);
        out.add(CYAN_SAND_STAIR);
        out.add(PURPLE_SAND_STAIR);
        out.add(BLUE_SAND_STAIR);
        out.add(BROWN_SAND_STAIR);
        out.add(BLACK_SAND_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setSandStoneStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(BLOOD_SAND_STONE_STAIR);
        out.add(WHITE_SAND_STONE_STAIR);
        out.add(ORANGE_SAND_STONE_STAIR);
        out.add(MAGENTA_SAND_STONE_STAIR);
        out.add(LIGHT_BLUE_SAND_STONE_STAIR);
        out.add(YELLOW_SAND_STONE_STAIR);
        out.add(LIME_SAND_STONE_STAIR);
        out.add(PINK_SAND_STONE_STAIR);
        out.add(GRAY_SAND_STONE_STAIR);
        out.add(LIGHT_GRAY_SAND_STONE_STAIR);
        out.add(CYAN_SAND_STONE_STAIR);
        out.add(PURPLE_SAND_STONE_STAIR);
        out.add(BLUE_SAND_STONE_STAIR);
        out.add(GREEN_SAND_STONE_STAIR);
        out.add(BROWN_SAND_STONE_STAIR);
        out.add(BLACK_SAND_STONE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setSmoothSandStoneStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(BLOOD_SMOOTH_SAND_STONE_STAIR);
        out.add(WHITE_SMOOTH_SAND_STONE_STAIR);
        out.add(ORANGE_SMOOTH_SAND_STONE_STAIR);
        out.add(MAGENTA_SMOOTH_SAND_STONE_STAIR);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR);
        out.add(YELLOW_SMOOTH_SAND_STONE_STAIR);
        out.add(LIME_SMOOTH_SAND_STONE_STAIR);
        out.add(PINK_SMOOTH_SAND_STONE_STAIR);
        out.add(GRAY_SMOOTH_SAND_STONE_STAIR);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR);
        out.add(CYAN_SMOOTH_SAND_STONE_STAIR);
        out.add(PURPLE_SMOOTH_SAND_STONE_STAIR);
        out.add(BLUE_SMOOTH_SAND_STONE_STAIR);
        out.add(GREEN_SMOOTH_SAND_STONE_STAIR);
        out.add(BROWN_SMOOTH_SAND_STONE_STAIR);
        out.add(BLACK_SMOOTH_SAND_STONE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setStoneStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(DEEPSLATE_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setStrippedWoodStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(STRIPPED_SPRUCE_WOOD_STAIR);
        out.add(STRIPPED_ACACIA_WOOD_STAIR);
        out.add(STRIPPED_OAK_WOOD_STAIR);
        out.add(STRIPPED_DARK_OAK_WOOD_STAIR);
        out.add(STRIPPED_JUNGLE_WOOD_STAIR);
        out.add(STRIPPED_BIRCH_WOOD_STAIR);
        out.add(STRIPPED_WARPED_HYPHAE_STAIR);
        out.add(STRIPPED_CRIMSON_HYPHAE_STAIR);
        out.add(STRIPPED_SPRUCE_LOG_STAIR);
        out.add(STRIPPED_ACACIA_LOG_STAIR);
        out.add(STRIPPED_OAK_LOG_STAIR);
        out.add(STRIPPED_DARK_OAK_LOG_STAIR);
        out.add(STRIPPED_JUNGLE_LOG_STAIR);
        out.add(STRIPPED_BIRCH_LOG_STAIR);
        out.add(STRIPPED_WARPED_STEM_STAIR);
        out.add(STRIPPED_CRIMSON_STEM_STAIR);
        out.add(STRIPPED_MANGROVE_WOOD_STAIR); // Mangrove Stair
        out.add(STRIPPED_MANGROVE_LOG_STAIR); // Mangrove Stair
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setTerracottaStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(WHITE_TERRACOTTA_STAIR);
        out.add(ORANGE_TERRACOTTA_STAIR);
        out.add(MAGENTA_TERRACOTTA_STAIR);
        out.add(LIGHT_BLUE_TERRACOTTA_STAIR);
        out.add(YELLOW_TERRACOTTA_STAIR);
        out.add(LIME_TERRACOTTA_STAIR);
        out.add(PINK_TERRACOTTA_STAIR);
        out.add(GRAY_TERRACOTTA_STAIR);
        out.add(LIGHT_GRAY_SAND_STONE_STAIR);
        out.add(CYAN_TERRACOTTA_STAIR);
        out.add(PURPLE_TERRACOTTA_STAIR);
        out.add(BLUE_TERRACOTTA_STAIR);
        out.add(BROWN_TERRACOTTA_STAIR);
        out.add(GREEN_TERRACOTTA_STAIR);
        out.add(RED_TERRACOTTA_STAIR);
        out.add(BLACK_TERRACOTTA_STAIR);
        out.add(TERRACOTTA_STAIR);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<StairBlock>> setWoodStairs() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(SPRUCE_WOOD_STAIR);
        out.add(ACACIA_WOOD_STAIR);
        out.add(OAK_WOOD_STAIR);
        out.add(DARK_OAK_WOOD_STAIR);
        out.add(JUNGLE_WOOD_STAIR);
        out.add(BIRCH_WOOD_STAIR);
        out.add(WARPED_HYPHAE_STAIR);
        out.add(CRIMSON_HYPHAE_STAIR);
        out.add(SPRUCE_LOG_STAIR);
        out.add(ACACIA_LOG_STAIR);
        out.add(OAK_LOG_STAIR);
        out.add(DARK_OAK_LOG_STAIR);
        out.add(JUNGLE_LOG_STAIR);
        out.add(BIRCH_LOG_STAIR);
        out.add(WARPED_STEM_STAIR);
        out.add(CRIMSON_STEM_STAIR);
        out.add(MANGROVE_WOOD_STAIR); // Mangrove Stair
        out.add(MANGROVE_LOG_STAIR); // Mangrove Stair
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setDefaultColorHedgeLeaves() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OAK_HEDGE);
        out.add(JUNGLE_HEDGE);
        out.add(ACACIA_HEDGE);
        out.add(DARK_OAK_HEDGE);
        out.add(MANGROVE_HEDGE);
        out.add(AZALEA_HEDGE);
        out.add(FLOWERING_AZALEA_HEDGE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setOffColorHedge() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(SPRUCE_HEDGE);
        out.add(BIRCH_HEDGE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setChiseledSandStoneWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_CHISELED_SAND_STONE_WALL);
        out.add(OVERRIDE_RED_CHISELED_SAND_STONE_WALL);
        out.add(BLOOD_CHISELED_SAND_STONE_WALL);
        out.add(WHITE_CHISELED_SAND_STONE_WALL);
        out.add(ORANGE_CHISELED_SAND_STONE_WALL);
        out.add(MAGENTA_CHISELED_SAND_STONE_WALL);
        out.add(LIGHT_BLUE_CHISELED_SAND_STONE_WALL);
        out.add(YELLOW_CHISELED_SAND_STONE_WALL);
        out.add(LIME_CHISELED_SAND_STONE_WALL);
        out.add(PINK_CHISELED_SAND_STONE_WALL);
        out.add(GRAY_CHISELED_SAND_STONE_WALL);
        out.add(LIGHT_GRAY_CHISELED_SAND_STONE_WALL);
        out.add(CYAN_CHISELED_SAND_STONE_WALL);
        out.add(PURPLE_CHISELED_SAND_STONE_WALL);
        out.add(BLUE_CHISELED_SAND_STONE_WALL);
        out.add(GREEN_CHISELED_SAND_STONE_WALL);
        out.add(BROWN_CHISELED_SAND_STONE_WALL);
        out.add(BLACK_CHISELED_SAND_STONE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setConcreteWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(RED_CONCRETE_WALL);
        out.add(WHITE_CONCRETE_WALL);
        out.add(ORANGE_CONCRETE_WALL);
        out.add(MAGENTA_CONCRETE_WALL);
        out.add(LIGHT_BLUE_CONCRETE_WALL);
        out.add(YELLOW_CONCRETE_WALL);
        out.add(LIME_CONCRETE_WALL);
        out.add(PINK_CONCRETE_WALL);
        out.add(GRAY_CONCRETE_WALL);
        out.add(LIGHT_GRAY_CONCRETE_WALL);
        out.add(CYAN_CONCRETE_WALL);
        out.add(PURPLE_CONCRETE_WALL);
        out.add(BLUE_CONCRETE_WALL);
        out.add(GREEN_CONCRETE_WALL);
        out.add(BROWN_CONCRETE_WALL);
        out.add(BLACK_CONCRETE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setCutSandStoneWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_CUT_SAND_STONE_WALL);
        out.add(OVERRIDE_RED_CUT_SAND_STONE_WALL);
        out.add(BLOOD_CUT_SAND_STONE_WALL);
        out.add(WHITE_CUT_SAND_STONE_WALL);
        out.add(ORANGE_CUT_SAND_STONE_WALL);
        out.add(MAGENTA_CUT_SAND_STONE_WALL);
        out.add(LIGHT_BLUE_CUT_SAND_STONE_WALL);
        out.add(YELLOW_CUT_SAND_STONE_WALL);
        out.add(LIME_CUT_SAND_STONE_WALL);
        out.add(PINK_CUT_SAND_STONE_WALL);
        out.add(GRAY_CUT_SAND_STONE_WALL);
        out.add(LIGHT_GRAY_CUT_SAND_STONE_WALL);
        out.add(CYAN_CUT_SAND_STONE_WALL);
        out.add(PURPLE_CUT_SAND_STONE_WALL);
        out.add(BLUE_CUT_SAND_STONE_WALL);
        out.add(GREEN_CUT_SAND_STONE_WALL);
        out.add(BROWN_CUT_SAND_STONE_WALL);
        out.add(BLACK_CUT_SAND_STONE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setMiscWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(END_STONE_WALL);
        out.add(BONE_BLOCK_WALL);
        out.add(DRIED_KELP_WALL);
        out.add(GLOWSTONE_WALL);
        out.add(BASALT_WALL);
        out.add(COBBLED_BASALT_WALL);
        out.add(POLISHED_BASALT_WALL);
        out.add(SMOOTH_BASALT_WALL);
        out.add(RAW_GOLD_WALL);
        out.add(RAW_COPPER_WALL);
        out.add(RAW_IRON_WALL);
        out.add(COAL_BLOCK_WALL);
        out.add(CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        out.add(CHISELED_POLISHED_BLACKSTONE_WALL);
        out.add(DRIPSTONE_WALL);
        out.add(PURPUR_BLOCK_WALL);
        out.add(NETHERRACK_WALL);
        out.add(SHROOMLIGHT_WALL);
        out.add(MAGMA_BLOCK_WALL);
        out.add(PACKED_MUD_WALL);
        out.add(SCULK_WALL);
        out.add(MUD_WALL);
        out.add(MUDDY_MANGROVE_ROOT_WALL);
        out.add(MANGROVE_ROOT_WALL);
        out.add(OCHRE_FROGLIGHT_WALL);
        out.add(VERDANT_FROGLIGHT_WALL);
        out.add(PEARLESCENT_FROGLIGHT_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setQuartzWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(QUARTZ_WALL);
        out.add(SMOOTH_QUARTZ_WALL);
        out.add(CHISELED_QUARTZ_WALL);
        out.add(QUARTZ_BRICK_WALL);
        out.add(QUARTZ_PILLAR_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setSandWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OVERRIDE_SAND_WALL);
        out.add(OVERRIDE_RED_SAND_WALL);
        out.add(BLOOD_SAND_WALL);
        out.add(WHITE_SAND_WALL);
        out.add(ORANGE_SAND_WALL);
        out.add(MAGENTA_SAND_WALL);
        out.add(LIGHT_BLUE_SAND_WALL);
        out.add(YELLOW_SAND_WALL);
        out.add(LIME_SAND_WALL);
        out.add(PINK_SAND_WALL);
        out.add(GRAY_SAND_WALL);
        out.add(LIGHT_GRAY_SAND_WALL);
        out.add(CYAN_SAND_WALL);
        out.add(PURPLE_SAND_WALL);
        out.add(BLUE_SAND_WALL);
        out.add(GREEN_SAND_WALL);
        out.add(GREEN_SAND_WALL);
        out.add(BROWN_SAND_WALL);
        out.add(BLACK_SAND_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setSandStoneWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(BLOOD_SAND_STONE_WALL);
        out.add(WHITE_SAND_STONE_WALL);
        out.add(ORANGE_SAND_STONE_WALL);
        out.add(MAGENTA_SAND_STONE_WALL);
        out.add(LIGHT_BLUE_SAND_STONE_WALL);
        out.add(YELLOW_SAND_STONE_WALL);
        out.add(LIME_SAND_STONE_WALL);
        out.add(PINK_SAND_STONE_WALL);
        out.add(GRAY_SAND_STONE_WALL);
        out.add(LIGHT_GRAY_SAND_STONE_WALL);
        out.add(CYAN_SAND_STONE_WALL);
        out.add(PURPLE_SAND_STONE_WALL);
        out.add(BLUE_SAND_STONE_WALL);
        out.add(GREEN_SAND_STONE_WALL);
        out.add(BROWN_SAND_STONE_WALL);
        out.add(BLACK_SAND_STONE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setSmoothSandStoneWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(SMOOTH_SAND_STONE_WALL);
        out.add(RED_SMOOTH_SAND_STONE_WALL);
        out.add(BLOOD_SMOOTH_SAND_STONE_WALL);
        out.add(WHITE_SMOOTH_SAND_STONE_WALL);
        out.add(ORANGE_SMOOTH_SAND_STONE_WALL);
        out.add(MAGENTA_SMOOTH_SAND_STONE_WALL);
        out.add(LIGHT_BLUE_SMOOTH_SAND_STONE_WALL);
        out.add(YELLOW_SMOOTH_SAND_STONE_WALL);
        out.add(LIME_SMOOTH_SAND_STONE_WALL);
        out.add(PINK_SMOOTH_SAND_STONE_WALL);
        out.add(GRAY_SMOOTH_SAND_STONE_WALL);
        out.add(LIGHT_GRAY_SMOOTH_SAND_STONE_WALL);
        out.add(CYAN_SMOOTH_SAND_STONE_WALL);
        out.add(PURPLE_SMOOTH_SAND_STONE_WALL);
        out.add(BLUE_SMOOTH_SAND_STONE_WALL);
        out.add(GREEN_SMOOTH_SAND_STONE_WALL);
        out.add(BROWN_SMOOTH_SAND_STONE_WALL);
        out.add(BLACK_SMOOTH_SAND_STONE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setStoneWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(STONE_WALL);
        out.add(DEEPSLATE_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setStrippedWoodWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(STRIPPED_SPRUCE_WOOD_WALL);
        out.add(STRIPPED_SPRUCE_LOG_WALL);
        out.add(STRIPPED_OAK_WOOD_WALL);
        out.add(STRIPPED_OAK_LOG_WALL);
        out.add(STRIPPED_WARPED_HYPHAE_WALL);
        out.add(STRIPPED_WARPED_STEM_WALL);
        out.add(STRIPPED_CRIMSON_HYPHAE_WALL);
        out.add(STRIPPED_CRIMSON_STEM_WALL);
        out.add(STRIPPED_DARK_OAK_WOOD_WALL);
        out.add(STRIPPED_DARK_OAK_LOG_WALL);
        out.add(STRIPPED_ACACIA_WOOD_WALL);
        out.add(STRIPPED_ACACIA_LOG_WALL);
        out.add(STRIPPED_JUNGLE_WOOD_WALL);
        out.add(STRIPPED_JUNGLE_LOG_WALL);
        out.add(STRIPPED_BIRCH_WOOD_WALL);
        out.add(STRIPPED_BIRCH_LOG_WALL);
        out.add(STRIPPED_MANGROVE_WOOD_WALL);
        out.add(STRIPPED_MANGROVE_LOG_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setTerracottaWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(WHITE_TERRACOTTA_WALL);
        out.add(ORANGE_TERRACOTTA_WALL);
        out.add(MAGENTA_TERRACOTTA_WALL);
        out.add(LIGHT_BLUE_TERRACOTTA_WALL);
        out.add(YELLOW_TERRACOTTA_WALL);
        out.add(LIME_TERRACOTTA_WALL);
        out.add(PINK_TERRACOTTA_WALL);
        out.add(GRAY_TERRACOTTA_WALL);
        out.add(LIGHT_GRAY_TERRACOTTA_WALL);
        out.add(CYAN_TERRACOTTA_WALL);
        out.add(PURPLE_TERRACOTTA_WALL);
        out.add(BLUE_TERRACOTTA_WALL);
        out.add(BROWN_TERRACOTTA_WALL);
        out.add(GREEN_TERRACOTTA_WALL);
        out.add(RED_TERRACOTTA_WALL);
        out.add(BLACK_TERRACOTTA_WALL);
        out.add(TERRACOTTA_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setWoodWalls() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(SPRUCE_WOOD_WALL);
        out.add(SPRUCE_LOG_WALL);
        out.add(OAK_WOOD_WALL);
        out.add(OAK_LOG_WALL);
        out.add(WARPED_HYPHAE_WALL);
        out.add(WARPED_STEM_WALL);
        out.add(CRIMSON_HYPHAE_WALL);
        out.add(CRIMSON_STEM_WALL);
        out.add(DARK_OAK_WOOD_WALL);
        out.add(DARK_OAK_LOG_WALL);
        out.add(ACACIA_WOOD_WALL);
        out.add(ACACIA_LOG_WALL);
        out.add(JUNGLE_WOOD_WALL);
        out.add(JUNGLE_LOG_WALL);
        out.add(BIRCH_WOOD_WALL);
        out.add(BIRCH_LOG_WALL);
        out.add(MANGROVE_WOOD_WALL);
        out.add(MANGROVE_LOG_WALL);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getTranslucentBlocks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>(getColoredLeaves());
        out.add(MANGROVE_ROOT_WALL);
        out.add(MANGROVE_ROOT_FENCE_GATE);
        out.add(MANGROVE_ROOT_FENCE);
        out.add(MANGROVE_ROOT_STAIR);
        out.add(MANGROVE_ROOT_SLAB);
        out.add(BLOCK_CUTTING_STATION);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getColoredLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>(setDefaultColorHedgeLeaves());
        out.add(SPRUCE_HEDGE);
        out.add(BIRCH_HEDGE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getAltLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.add(CHERRY_HEDGE);
        return out;
    }
}