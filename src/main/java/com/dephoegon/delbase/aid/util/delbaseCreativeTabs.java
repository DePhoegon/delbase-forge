package com.dephoegon.delbase.aid.util;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.general.miscSpecialCases.HARDENED_OAK_PLANKS;
import static com.dephoegon.delbase.delbase.Mod_ID;

@Mod.EventBusSubscriber(modid = Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class delbaseCreativeTabs {
    public static CreativeModeTab DELBASE_BLOCK;
    public static CreativeModeTab DELBASE_ITEM;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.@NotNull Register event){
        DELBASE_BLOCK = event.registerCreativeModeTab(new ResourceLocation(Mod_ID, "dephoegon_blocks"),
                builder -> builder.icon(() -> new ItemStack(Items.REDSTONE_BLOCK))
                        .title(Component.translatable("creativemodetab.dephoegon_blocks")));
        DELBASE_ITEM = event.registerCreativeModeTab(new ResourceLocation(Mod_ID, "dephoegon_items"),
                builder -> builder.icon(() -> new ItemStack(Items.RED_DYE))
                        .title(Component.translatable("creativemodetab.dephoegon_items")));
    }

    public static @NotNull ArrayList<RegistryObject<Item>> getDelItemList() {
        ArrayList<RegistryObject<Item>> out = new ArrayList<>();
        out.addAll(setBlockCutterPlansList());
        out.addAll(setShiftingDyesList());
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
        out.addAll(setTerracottaFences());
        out.addAll(setWoodenFences());
        out.addAll(setAshBlocks());
        out.addAll(setChiseledSandStones());
        out.addAll(setSandStones());
        out.addAll(setSmoothSandStones());
        out.add(HARDENED_OAK_PLANKS);
        out.addAll(setSands());
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
        out.addAll(setStrippedWoodStairs());
        out.addAll(setTerracottaStairs());
        out.addAll(setWoodStairs());
        out.addAll(setChiseledSandStoneWalls());
        out.addAll(setConcreteWalls());
        out.addAll(setCutSandStoneWalls());
        out.addAll(setMiscWalls());
        out.addAll(setQuartzWalls());
        out.addAll(setSandWalls());
        out.addAll(setSandStoneWalls());
        out.addAll(setSmoothSandStoneWalls());
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
        out.addAll(setStrippedWoodenFenceGates());
        out.addAll(setTerracottaFenceGates());
        out.addAll(setWoodenFenceGates());
        return out;
    }
    public static @NotNull ArrayList<RegistryObject<? extends ItemLike>> getDelFullBlockList() {
        ArrayList<RegistryObject<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(getDelBlockList());
        out.addAll(getDelFunctionalBlockList());
        out.add(BLOCK_CUTTING_STATION);
        return out;
    }
}