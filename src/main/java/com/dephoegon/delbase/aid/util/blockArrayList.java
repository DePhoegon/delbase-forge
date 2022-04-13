package com.dephoegon.delbase.aid.util;

import java.util.ArrayList;

import static net.minecraft.world.level.block.Blocks.*;

public abstract class blockArrayList {
    private static ArrayList<Object> terracotta_list = new ArrayList<>();
    private static ArrayList<Object> concrete_list = new ArrayList<>();
    private static ArrayList<Object> slab_list = new ArrayList<>();
    private static ArrayList<Object> stair_list = new ArrayList<>();
    private static ArrayList<Object> general_list = new ArrayList<>();
    private static ArrayList<Object> gravity_list = new ArrayList<>();
    private static ArrayList<Object> wall_list = new ArrayList<>();
    private static ArrayList<Object> axis_list = new ArrayList<>();

    // Color swapping matching list
    private static void setTerracotta_list() {
        ArrayList<Object> terracotta_set = new ArrayList<>();
        terracotta_set.add(WHITE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(TERRACOTTA.defaultBlockState());
        terracotta_set.add(RED_TERRACOTTA.defaultBlockState());
        terracotta_set.add(ORANGE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(MAGENTA_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIGHT_BLUE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(YELLOW_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIME_TERRACOTTA.defaultBlockState());
        terracotta_set.add(PINK_TERRACOTTA.defaultBlockState());
        terracotta_set.add(GRAY_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIGHT_GRAY_TERRACOTTA.defaultBlockState());
        terracotta_set.add(CYAN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(PURPLE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BLUE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(GREEN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BROWN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BLACK_TERRACOTTA.defaultBlockState());
        terracotta_list = terracotta_set;
    }
    public static ArrayList<Object> getTerracotta_list() { return terracotta_list; }

    private static void setConcrete_list() {
        ArrayList<Object> concrete_set = new ArrayList<>();
        concrete_set.add(RED_CONCRETE.defaultBlockState());
        concrete_set.add(WHITE_CONCRETE.defaultBlockState());
        concrete_set.add(ORANGE_CONCRETE.defaultBlockState());
        concrete_set.add(MAGENTA_CONCRETE.defaultBlockState());
        concrete_set.add(LIGHT_BLUE_CONCRETE.defaultBlockState());
        concrete_set.add(YELLOW_CONCRETE.defaultBlockState());
        concrete_set.add(LIME_CONCRETE.defaultBlockState());
        concrete_set.add(PINK_CONCRETE.defaultBlockState());
        concrete_set.add(GRAY_CONCRETE.defaultBlockState());
        concrete_set.add(LIGHT_GRAY_CONCRETE.defaultBlockState());
        concrete_set.add(CYAN_CONCRETE.defaultBlockState());
        concrete_set.add(PURPLE_CONCRETE.defaultBlockState());
        concrete_set.add(BLUE_CONCRETE.defaultBlockState());
        concrete_set.add(GREEN_CONCRETE.defaultBlockState());
        concrete_set.add(BROWN_CONCRETE.defaultBlockState());
        concrete_set.add(BLACK_CONCRETE.defaultBlockState());
        concrete_list = concrete_set;
    }
    public static ArrayList<Object> getConcrete_list() { return concrete_list; }

    private static void setSlab_list() {
        ArrayList<Object> slab_set = new ArrayList<>();
        slab_set.add(CUT_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(CUT_RED_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SMOOTH_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SMOOTH_RED_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(RED_SANDSTONE_SLAB.defaultBlockState());
        slab_list = slab_set;
    }
    public static ArrayList<Object> getSlab_list() { return slab_list; }

    private static void setStair_list() {
        ArrayList<Object> stair_set = new ArrayList<>();
        stair_set.add(SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(RED_SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(SMOOTH_SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(SMOOTH_RED_SANDSTONE_STAIRS.defaultBlockState());
        stair_list = stair_set;
    }
    public static ArrayList<Object> getStair_list() { return stair_list; }

    private static void setAxis_list() {
        ArrayList<Object> axis_set = new ArrayList<>();
        axis_set.add(CUT_RED_SANDSTONE.defaultBlockState());
        axis_set.add(CUT_SANDSTONE.defaultBlockState());
        axis_list = axis_set;
    }
    public static ArrayList<Object> getAxis_list() { return axis_list; }

    private static void setGeneral_list() {
        setTerracotta_list();
        setConcrete_list();
        ArrayList<Object> general_set = new ArrayList<>();
        general_set.addAll(terracotta_list);
        general_set.addAll(concrete_list);
        general_set.add(CHISELED_SANDSTONE.defaultBlockState());
        general_set.add(CHISELED_RED_SANDSTONE.defaultBlockState());
        general_set.add(SANDSTONE.defaultBlockState());
        general_set.add(RED_SANDSTONE.defaultBlockState());
        general_list = general_set;
    }
    public static ArrayList<Object> getGeneral_list() { return general_list; }

    private static void setGravity_list() {
        ArrayList<Object> gravity_set = new ArrayList<>();
        gravity_set.add(SAND.defaultBlockState());
        gravity_set.add(RED_SAND.defaultBlockState());
        gravity_list = gravity_set;
    }
    public static ArrayList<Object> getGravity_list() { return gravity_list; }

    private static void setWall_list() {
        ArrayList<Object> wall_set = new ArrayList<>();
        wall_set.add(SANDSTONE_WALL.defaultBlockState());
        wall_set.add(RED_SANDSTONE_WALL.defaultBlockState());
        wall_list = wall_set;
    }
    public static ArrayList<Object> getWall_list() { return wall_list; }

    // call methods to set private lists
    public static void setBlockArrays() {
        setGeneral_list();
        setSlab_list();
        setStair_list();
        setGravity_list();
        setWall_list();
        setAxis_list();
    }
}
