package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.slab.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;
import com.dephoegon.delbase.block.blockOverride.overrideHook;

public class regList {
    public static void listOrder() {
        //aid

        //Items

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

        //Fences

        //Special block
        ashBlocks.register();

        //Overrides
        overrideHook.register();
    }
}
