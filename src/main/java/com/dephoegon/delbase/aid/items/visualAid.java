package com.dephoegon.delbase.aid.items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;

public class visualAid {
    public static @NotNull ArrayList<RegistryObject<WallBlock>> setDefaultColorHedgeLeaves() {
        ArrayList<RegistryObject<WallBlock>> out = new ArrayList<>();
        out.add(OAK_HEDGE);
        out.add(JUNGLE_HEDGE);
        out.add(ACACIA_HEDGE);
        out.add(DARK_OAK_HEDGE);
        out.add(AZALEA_HEDGE);
        out.add(FLOWERING_AZALEA_HEDGE);
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends Block>> getTranslucentBlocks() {
        ArrayList<RegistryObject<? extends Block>> out = new ArrayList<>(getAllLeaves());
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
