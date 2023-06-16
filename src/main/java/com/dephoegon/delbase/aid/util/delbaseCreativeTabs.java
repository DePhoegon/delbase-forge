package com.dephoegon.delbase.aid.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.general.miscSpecialCases.HARDENED_OAK_PLANKS;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static com.dephoegon.delbase.item.blockCutterPlans.WALL_PLANS;

public class delbaseCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mod_ID);
    public static final RegistryObject<CreativeModeTab> DELBASE_BLOCK = CREATIVE_MODE_TABS.register("dephoegon_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BLOCK_CUTTING_STATION.get()))
            .title(Component.translatable("itemGroup.dephoegon_blocks"))
            .build());
    public static final RegistryObject<CreativeModeTab> DELBASE_ITEM = CREATIVE_MODE_TABS.register("dephoegon_items", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(WALL_PLANS.get()))
            .title(Component.translatable("itemGroup.dephoegon_items"))
            .build());

    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelItemList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.add(BLOCK_CUTTING_STATION);
        out.addAll(setBlockCutterPlansList());
        out.addAll(setShiftingDyesList());
        return out;
    }

    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelNaturalBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>(setSands());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(setAxisCutSandStone());
        out.addAll(setChiseledSandStoneFences());
        out.addAll(setConcreteFences());
        out.addAll(setCutSandStoneFences());
        out.addAll(setFenceMisc());
        out.addAll(setQuartzFences());
        out.addAll(setSandFences());
        out.addAll(setSandStoneFences());
        out.addAll(setSmoothSandStoneFences());
        out.addAll(setStrippedWoodenFences());
        out.addAll(setStoneFences());
        out.addAll(setTerracottaFences());
        out.addAll(setWoodenFences());
        out.addAll(setAshBlocks());
        out.addAll(setChiseledSandStones());
        out.addAll(setSandStones());
        out.addAll(setSmoothSandStones());
        out.add(HARDENED_OAK_PLANKS);
        out.addAll(setChiseledSandStoneSlabs());
        out.addAll(setChiseledSandStoneEnergySlabs());
        out.addAll(setConcreteSlabs());
        out.addAll(setCutSandStoneSlabs());
        out.addAll(setCutSandStoneEnergySlabs());
        out.addAll(setMiscSlabs());
        out.addAll(setQuartzSlabs());
        out.addAll(setSandSlabs());
        out.addAll(setSandEnergySlabs());
        out.addAll(setSandStoneSlabs());
        out.addAll(setSandStoneEnergySlabs());
        out.addAll(setSmoothSandStoneSlabs());
        out.addAll(setSmoothSandStoneEnergySlabs());
        out.addAll(setStonesSlabs());
        out.addAll(setStrippedWoodSlabs());
        out.addAll(setTerracottaSlabs());
        out.addAll(setWoodSlabs());
        out.addAll(setChiseledSandStoneStairs());
        out.addAll(setConcreteStairs());
        out.addAll(setCutSandStoneStairs());
        out.addAll(setMiscStairs());
        out.addAll(setQuartzStairs());
        out.addAll(setSandStairs());
        out.addAll(setSandStoneStairs());
        out.addAll(setSmoothSandStoneStairs());
        out.addAll(setStoneStairs());
        out.addAll(setStrippedWoodStairs());
        out.addAll(setTerracottaStairs());
        out.addAll(setWoodStairs());
        out.addAll(getColoredLeaves());
        out.addAll(getAltLeaves());
        out.addAll(setChiseledSandStoneWalls());
        out.addAll(setConcreteWalls());
        out.addAll(setCutSandStoneWalls());
        out.addAll(setMiscWalls());
        out.addAll(setQuartzWalls());
        out.addAll(setSandWalls());
        out.addAll(setSandStoneWalls());
        out.addAll(setSmoothSandStoneWalls());
        out.addAll(setStoneWalls());
        out.addAll(setStrippedWoodWalls());
        out.addAll(setTerracottaWalls());
        out.addAll(setWoodWalls());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelFunctionalBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(setChiseledSandStoneFencesGates());
        out.addAll(setConcreteFenceGates());
        out.addAll(setCutSandStoneFenceGates());
        out.addAll(setFenceGateMisc());
        out.addAll(setQuartzFenceGates());
        out.addAll(setSandFenceGates());
        out.addAll(setSandStoneFenceGates());
        out.addAll(setSmoothSandStoneFenceGates());
        out.addAll(setStoneFenceGate());
        out.addAll(setStrippedWoodenFenceGates());
        out.addAll(setTerracottaFenceGates());
        out.addAll(setWoodenFenceGates());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelFullBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(getDelBlockList());
        out.addAll(getDelNaturalBlockList());
        out.addAll(getDelFunctionalBlockList());
        return out;
    }
}