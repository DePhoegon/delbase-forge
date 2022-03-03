package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.woodWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
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

public class wallWood {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> SPRUCE_WOOD_WALL = register("spruce_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> SPRUCE_LOG_WALL = register("spruce_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> OAK_WOOD_WALL = register("oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> OAK_LOG_WALL = register("oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> WARPED_STEM_WALL = register("warped_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> CRIMSON_STEM_WALL = register("crimson_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> DARK_OAK_WOOD_WALL = register("dark_oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> DARK_OAK_LOG_WALL = register("dark_oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> ACACIA_WOOD_WALL = register("acacia_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> ACACIA_LOG_WALL = register("acacia_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> JUNGLE_WOOD_WALL = register("jungle_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> JUNGLE_LOG_WALL = register("jungle_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> BIRCH_WOOD_WALL = register("birch_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> BIRCH_LOG_WALL = register("birch_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = register("stripped_spruce_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_LOG_WALL = register("stripped_spruce_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_OAK_WOOD_WALL = register("stripped_oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_OAK_LOG_WALL = register("stripped_oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> STRIPPED_WARPED_STEM_WALL = register("stripped_warped_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> STRIPPED_CRIMSON_STEM_WALL = register("stripped_crimson_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = register("stripped_dark_oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_LOG_WALL = register("stripped_dark_oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_WOOD_WALL = register("stripped_acacia_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_LOG_WALL = register("stripped_acacia_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = register("stripped_jungle_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_LOG_WALL = register("stripped_jungle_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_WOOD_WALL = register("stripped_birch_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_LOG_WALL = register("stripped_birch_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","", true));

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
