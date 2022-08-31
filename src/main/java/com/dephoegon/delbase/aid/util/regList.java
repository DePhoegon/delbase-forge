package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.recipe.modRecipes;
import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.slab.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;
import com.dephoegon.delbase.item.blockCutterPlans;
import com.dephoegon.delbase.item.shiftingDyes;

public class regList {
    public static void listOrder() {
        //aid
        blockArrayList.setBlockArrays();

        //Items
        shiftingDyes.register();
        blockCutterPlans.register();

        //Standard Blocks
        genChiseledSandStones.register();
        genSandStones.register();
        genSmoothSandStones.register();

        //Gravity Blocks
        gravColorSands.register();

        //Slabs
        slabChiseledSandStones.register();
        slabChiseledSandStonesEnergy.register();
        slabCutSandStones.register();
        slabCutSandStonesEnergy.register();
        slabSands.register();
        slabSandsEnergy.register();
        slabSandStones.register();
        slabSandStonesEnergy.register();
        slabSmoothSandStones.register();
        slabSmoothSandStonesEnergy.register();
        slabQuartz.register();
        slabConcrete.register();
        slabWood.register();
        slabTerracotta.register();
        slabMisc.register();


        //Stairs
        stairSands.register();
        stairSmoothSandStones.register();
        stairChiseledSandStones.register();
        stairCutSandStones.register();
        stairSandStones.register();
        stairQuartz.register();
        stairConcrete.register();
        stairWood.register();
        stairTerracotta.register();
        stairMisc.register();

        //Pillars
        axiCutSandStones.register();

        //Walls
        wallChiseledSandStones.register();
        wallCutSandStones.register();
        wallSands.register();
        wallSandStone.register();
        wallSmoothSandStones.register();
        wallQuartz.register();
        wallConcrete.register();
        wallWood.register();
        wallTerracotta.register();
        wallMisc.register();

        //Fences
        woodenFences.register();
        quartzFences.register();
        sandFences.register();
        concreteFences.register();
        terracottaFences.register();
        smoothSandStoneFences.register();
        sandStoneFences.register();
        fenceMisc.register();
        cutSandStoneFences.register();
        chiseledSandStoneFences.register();

        //Special block
        ashBlocks.register();
        machineBlocks.register();
        blockEntities.register();

        //Overrides
        //overrideHook.register();

        //Special
        menuTypes.register();
        modRecipes.register();
        miscSpecialCases.register();
    }
}
