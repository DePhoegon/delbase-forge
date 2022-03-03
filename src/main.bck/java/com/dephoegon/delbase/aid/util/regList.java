package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.general.genChiseledSandStones;
import com.dephoegon.delbase.block.general.genSandStones;
import com.dephoegon.delbase.block.general.genSmoothSandStones;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.slab.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;

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

        //Stairs
        stairSands.register();
        stairSmoothSandStones.register();
        stairChiseledSandStones.register();
        stairCutSandStones.register();
        stairSandStones.register();

        //Pillars
        axiCutSandStones.register();

        //Walls
        wallChiseledSandStones.register();
        wallCutSandStones.register();
        wallSands.register();
        wallSandStone.register();
        wallSmoothSandStones.register();

        //Fences
    }
}
