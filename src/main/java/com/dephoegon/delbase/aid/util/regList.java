package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.recipe.modRecipes;
import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.gravity.solidSands;
import com.dephoegon.delbase.block.slab.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;
import com.dephoegon.delbase.item.blockCutterPlans;
import com.dephoegon.delbase.item.shiftingDyes;
import net.minecraftforge.eventbus.api.IEventBus;

public class regList {
    public static void RegisterFirst(IEventBus eventBus) {
        //aid
        blockArrayList.setBlockArrays();
        // Sand
        gravColorSands.register(eventBus);
        // Sandstones
        genSandStones.register(eventBus);
        // Stripped Woods
        slabStrippedWood.register(eventBus);
        stairStrippedWood.register(eventBus);
        wallStrippedWood.register(eventBus);
        //Special
        miscSpecialCases.register(eventBus);
    }
    public static void listOrder(IEventBus eventBus) {
        //Items
        shiftingDyes.register(eventBus);
        blockCutterPlans.register(eventBus);

        //Standard Blocks
        genChiseledSandStones.register(eventBus);
        genSmoothSandStones.register(eventBus);

        //Gravity Blocks
        solidSands.register(eventBus);

        //Slabs
        slabChiseledSandStones.register(eventBus);
        slabChiseledSandStonesEnergy.register(eventBus);
        slabCutSandStones.register(eventBus);
        slabCutSandStonesEnergy.register(eventBus);
        slabSands.register(eventBus);
        slabSandsEnergy.register(eventBus);
        slabSandStones.register(eventBus);
        slabSandStonesEnergy.register(eventBus);
        slabSmoothSandStones.register(eventBus);
        slabSmoothSandStonesEnergy.register(eventBus);
        slabQuartz.register(eventBus);
        slabConcrete.register(eventBus);
        slabWood.register(eventBus);
        slabTerracotta.register(eventBus);
        slabMisc.register(eventBus);
        slabLeaves.register(eventBus);
        slabStones.register(eventBus);

        //Stairs
        stairSands.register(eventBus);
        stairSmoothSandStones.register(eventBus);
        stairChiseledSandStones.register(eventBus);
        stairCutSandStones.register(eventBus);
        stairSandStones.register(eventBus);
        stairQuartz.register(eventBus);
        stairConcrete.register(eventBus);
        stairWood.register(eventBus);
        stairTerracotta.register(eventBus);
        stairMisc.register(eventBus);
        stairLeaves.register(eventBus);
        stairStones.register(eventBus);

        //Pillars
        axiCutSandStones.register(eventBus);

        //Walls
        wallChiseledSandStones.register(eventBus);
        wallCutSandStones.register(eventBus);
        wallSands.register(eventBus);
        wallSandStone.register(eventBus);
        wallSmoothSandStones.register(eventBus);
        wallQuartz.register(eventBus);
        wallConcrete.register(eventBus);
        wallStone.register(eventBus);
        wallWood.register(eventBus);
        wallTerracotta.register(eventBus);
        wallMisc.register(eventBus);

        //Hedges
        hedgeLeaves.register(eventBus);

        //Fences
        strippedWoodenFences.register(eventBus);
        woodenFences.register(eventBus);
        quartzFences.register(eventBus);
        sandFences.register(eventBus);
        concreteFences.register(eventBus);
        terracottaFences.register(eventBus);
        smoothSandStoneFences.register(eventBus);
        stoneFences.register(eventBus);
        sandStoneFences.register(eventBus);
        fenceMisc.register(eventBus);
        cutSandStoneFences.register(eventBus);
        chiseledSandStoneFences.register(eventBus);
        leafFences.register(eventBus);

        //Special block
        ashBlocks.register(eventBus);
        machineBlocks.register(eventBus);
        blockEntities.register(eventBus);

        //Special
        menuTypes.register(eventBus);
        modRecipes.register(eventBus);
    }
}