package com.dephoegon.delbase.aid.util;

import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.fence.leafFences.*;
import static com.dephoegon.delbase.block.slab.slabLeaves.*;
import static com.dephoegon.delbase.block.stair.stairLeaves.*;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;

public class creativeTabsArrayLists {
    public static @NotNull ArrayList<RegistryObject<? extends Block>> setNonColoredLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.add(AZALEA_HEDGE);
        out.add(FLOWERING_AZALEA_HEDGE);
        out.add(AZALEA_LEAF_STAIR);
        out.add(FLOWERING_AZALEA_LEAF_STAIR);
        out.add(AZALEA_LEAF_SLAB);
        out.add(FLOWERING_AZALEA_LEAF_SLAB);
        out.add(AZALEA_LEAF_FENCE);
        out.add(FLOWERING_AZALEA_LEAF_FENCE);
        out.add(AZALEA_LEAF_FENCE_GATE);
        out.add(FLOWERING_AZALEA_LEAF_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> setBirchHedge() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.add(BIRCH_HEDGE);
        out.add(BIRCH_LEAF_STAIR);
        out.add(BIRCH_LEAF_SLAB);
        out.add(BIRCH_LEAF_FENCE);
        out.add(BIRCH_LEAF_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> setSpruceLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.add(SPRUCE_HEDGE);
        out.add(SPRUCE_LEAF_STAIR);
        out.add(SPRUCE_LEAF_SLAB);
        out.add(SPRUCE_LEAF_FENCE);
        out.add(SPRUCE_LEAF_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> setMangroveLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.add(MANGROVE_HEDGE);
        out.add(MANGROVE_LEAF_STAIR);
        out.add(MANGROVE_LEAF_SLAB);
        out.add(MANGROVE_LEAF_FENCE);
        out.add(MANGROVE_LEAF_FENCE_GATE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<WallBlock>> DefaultColorHedgeLeaves() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OAK_HEDGE);
        out.add(JUNGLE_HEDGE);
        out.add(ACACIA_HEDGE);
        out.add(DARK_OAK_HEDGE);
        return out;
    }
    private static @NotNull ArrayList<RegistryObject<StairBlock>> DefaultColorStairLeaves() {
        ArrayList<RegistryObject<StairBlock>> out = new ArrayList<>();
        out.add(OAK_LEAF_STAIR);
        out.add(JUNGLE_LEAF_STAIR);
        out.add(ACACIA_LEAF_STAIR);
        out.add(DARK_OAK_LEAF_STAIR);
        return out;
    }
    private static @NotNull ArrayList<RegistryObject<SlabBlock>> DefaultColorSlabLeaves() {
        ArrayList<RegistryObject<SlabBlock>> out = new ArrayList<>();
        out.add(OAK_LEAF_SLAB);
        out.add(JUNGLE_LEAF_SLAB);
        out.add(ACACIA_LEAF_SLAB);
        out.add(DARK_OAK_LEAF_SLAB);
        return out;
    }
    private static @NotNull ArrayList<RegistryObject<FenceBlock>> DefaultColorFenceLeaves() {
        ArrayList<RegistryObject<FenceBlock>> out = new ArrayList<>();
        out.add(OAK_LEAF_FENCE);
        out.add(JUNGLE_LEAF_FENCE);
        out.add(ACACIA_LEAF_FENCE);
        out.add(DARK_OAK_LEAF_FENCE);
        return out;
    }
    private static @NotNull ArrayList<RegistryObject<FenceGateBlock>> DefaultColorFenceGateLeaves() {
        ArrayList<RegistryObject<FenceGateBlock>> out = new ArrayList<>();
        out.add(OAK_LEAF_FENCE_GATE);
        out.add(JUNGLE_LEAF_FENCE_GATE);
        out.add(ACACIA_LEAF_FENCE_GATE);
        out.add(DARK_OAK_LEAF_FENCE_GATE);
        return out;
    }

    public static @NotNull ArrayList<RegistryObject<? extends Block>> getDefaultColorLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.addAll(DefaultColorHedgeLeaves());
        out.addAll(DefaultColorStairLeaves());
        out.addAll(DefaultColorSlabLeaves());
        out.addAll(DefaultColorFenceLeaves());
        out.addAll(DefaultColorFenceGateLeaves());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> ColoredLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.addAll(getDefaultColorLeaves());
        out.addAll(setSpruceLeaves());
        out.addAll(setBirchHedge());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getAllLeaves() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>();
        out.addAll(ColoredLeaves());
        out.addAll(setMangroveLeaves());
        out.addAll(setNonColoredLeaves());
        return out;
    }
}