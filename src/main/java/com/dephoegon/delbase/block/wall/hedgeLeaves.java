package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.leafWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class hedgeLeaves {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> OAK_HEDGE = register("oak_hedge",
            () -> new leafWall(OAK_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> SPRUCE_HEDGE = register("spruce_hedge",
            () -> new leafWall(SPRUCE_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> BIRCH_HEDGE = register("birch_hedge",
            () -> new leafWall(BIRCH_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> JUNGLE_HEDGE = register("jungle_hedge",
            () -> new leafWall(JUNGLE_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> ACACIA_HEDGE = register("acacia_hedge",
            () -> new leafWall(ACACIA_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> DARK_OAK_HEDGE = register("dark_oak_hedge",
            () -> new leafWall(DARK_OAK_LEAVES, SoundType.GRASS,true, null));
    public static final RegistryObject<WallBlock> AZALEA_HEDGE = register("azalea_hedge",
            () -> new leafWall(AZALEA_LEAVES, SoundType.AZALEA,true, null));
    public static final RegistryObject<WallBlock> FLOWERING_AZALEA_HEDGE = register("flowering_azalea_hedge",
            () -> new leafWall(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA,true, null));

    public static void register(IEventBus eventBus) {
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
