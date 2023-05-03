package com.dephoegon.delbase.aid.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.fence.fenceMisc.MANGROVE_ROOT_FENCE;
import static com.dephoegon.delbase.block.fence.fenceMisc.MANGROVE_ROOT_FENCE_GATE;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.slab.slabMisc.MANGROVE_ROOT_SLAB;
import static com.dephoegon.delbase.block.stair.stairMisc.MANGROVE_ROOT_STAIR;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;
import static com.dephoegon.delbase.block.wall.wallMisc.MANGROVE_ROOT_WALL;

public class creativeTabsArrayLists {
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
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getTranslucentBlocks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>(getAllLeaves());
        out.add(MANGROVE_ROOT_WALL);
        out.add(MANGROVE_ROOT_FENCE_GATE);
        out.add(MANGROVE_ROOT_FENCE);
        out.add(MANGROVE_ROOT_STAIR);
        out.add(MANGROVE_ROOT_SLAB);
        out.add(BLOCK_CUTTING_STATION);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getAllLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>(setDefaultColorHedgeLeaves());
        out.add(SPRUCE_HEDGE);
        out.add(BIRCH_HEDGE);
        return out;
    }
}