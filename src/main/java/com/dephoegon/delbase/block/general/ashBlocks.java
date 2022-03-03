package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class ashBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> ASH_SLAB = register("ash_slab",
            () -> new slabBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD),
                    "","","",false));
    public static final RegistryObject<StairBlock> ASH_STAIR = register("ash_stair",
            ()-> new stairBlock(OAK_STAIRS::defaultBlockState, BlockBehaviour.Properties.copy(OAK_STAIRS).sound(SoundType.WOOD),
                    "","","", false));
    public static final RegistryObject<RotatedPillarBlock> ASH_LOG = register("ash_log",
            ()-> new axisBlock(BlockBehaviour.Properties.copy(OAK_LOG).sound(SoundType.WOOD),
                    "","","",false));
    public static final RegistryObject<WallBlock> ASH_WALL = register("ash_wall",
            ()-> new wallBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", false));
    public static final RegistryObject<Block> ASH_BLOCK = register("ash_block",
            ()-> new genBlock(BlockBehaviour.Properties.copy(OAK_PLANKS).sound(SoundType.WOOD),
                    "","","", false));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
