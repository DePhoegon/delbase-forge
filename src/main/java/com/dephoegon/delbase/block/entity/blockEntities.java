package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.entity.BlockEntityType.Builder;

public class blockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Mod_ID);

    @SuppressWarnings("ConstantConditions")
    public static final RegistryObject<BlockEntityType<blockCuttingStation>> BLOCK_CUTTING_STATION_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("block_cutting_station_block_entity", () ->
                    Builder.of(blockCuttingStation::new, machineBlocks.BLOCK_CUTTING_STATION.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
