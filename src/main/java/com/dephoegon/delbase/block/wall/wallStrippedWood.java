package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.woodWall;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallStrippedWood {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = register("stripped_spruce_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_LOG_WALL = register("stripped_spruce_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_OAK_WOOD_WALL = register("stripped_oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_OAK_LOG_WALL = register("stripped_oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<WallBlock> STRIPPED_WARPED_STEM_WALL = register("stripped_warped_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<WallBlock> STRIPPED_CRIMSON_STEM_WALL = register("stripped_crimson_stem_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = register("stripped_dark_oak_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_LOG_WALL = register("stripped_dark_oak_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_WOOD_WALL = register("stripped_acacia_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_LOG_WALL = register("stripped_acacia_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = register("stripped_jungle_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_LOG_WALL = register("stripped_jungle_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_WOOD_WALL = register("stripped_birch_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_LOG_WALL = register("stripped_birch_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_MANGROVE_WOOD_WALL = register("stripped_mangrove_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(MANGROVE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_MANGROVE_LOG_WALL = register("stripped_mangrove_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(MANGROVE_WOOD).sound(SoundType.WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_BAMBOO_WALL = register("stripped_bamboo_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD),
                    "","","",true, null));
    public static final RegistryObject<WallBlock> STRIPPED_BAMBOO_PLANK_WALL = register("stripped_bamboo_plank_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD),
                    "","","",true, null));
    public static final RegistryObject<WallBlock> STRIPPED_BAMBOO_MOSAIC_WALL = register("stripped_bamboo_mosaic_wall",
            () -> new wallBlock(BlockBehaviour.Properties.copy(BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD),
                    "","","",true, null));
    public static final RegistryObject<WallBlock> STRIPPED_CHERRY_WOOD_WALL = register("stripped_cherry_wood_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.CHERRY_WOOD),"","","", true, null), 5001);
    public static final RegistryObject<WallBlock> STRIPPED_CHERRY_LOG_WALL = register("stripped_cherry_log_wall",
            () -> new woodWall(BlockBehaviour.Properties.copy(CHERRY_WOOD).sound(SoundType.CHERRY_WOOD),"","","", true, null), 5001);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}
