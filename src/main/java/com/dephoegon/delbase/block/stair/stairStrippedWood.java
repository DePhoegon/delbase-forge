package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.woodStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.Blocks.BIRCH_WOOD;

public class stairStrippedWood {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> STRIPPED_SPRUCE_WOOD_STAIR = register("stripped_spruce_wood_stair",
            () -> new woodStair(SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_ACACIA_WOOD_STAIR = register("stripped_acacia_wood_stair",
            () -> new woodStair(ACACIA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_OAK_WOOD_STAIR = register("stripped_oak_wood_stair",
            () -> new woodStair(OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIR = register("stripped_dark_oak_wood_stair",
            () -> new woodStair(DARK_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(DARK_OAK_BUTTON).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_JUNGLE_WOOD_STAIR = register("stripped_jungle_wood_stair",
            () -> new woodStair(JUNGLE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_BIRCH_WOOD_STAIR = register("stripped_birch_wood_stair",
            () -> new woodStair(BIRCH_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_WARPED_HYPHAE_STAIR = register("stripped_warped_hyphae_stair",
            () -> new woodStair(WARPED_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD)
                    , "","","", false, null));
    public static final RegistryObject<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIR = register("stripped_crimson_hyphae_stair",
            () -> new woodStair(SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD)
                    , "","","", false, null));
    public static final RegistryObject<StairBlock> STRIPPED_SPRUCE_LOG_STAIR = register("stripped_spruce_log_stair",
            () -> new woodStair(SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_ACACIA_LOG_STAIR = register("stripped_acacia_log_stair",
            () -> new woodStair(ACACIA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_OAK_LOG_STAIR = register("stripped_oak_log_stair",
            () -> new woodStair(OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_DARK_OAK_LOG_STAIR = register("stripped_dark_oak_log_stair",
            () -> new woodStair(DARK_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(DARK_OAK_BUTTON).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_JUNGLE_LOG_STAIR = register("stripped_jungle_log_stair",
            () -> new woodStair(JUNGLE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_BIRCH_LOG_STAIR = register("stripped_birch_log_stair",
            () -> new woodStair(BIRCH_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD)
                    , "","","", true, null), 5001);
    public static final RegistryObject<StairBlock> STRIPPED_WARPED_STEM_STAIR = register("stripped_warped_stem_stair",
            () -> new woodStair(WARPED_HYPHAE::defaultBlockState, BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD)
                    , "","","", false, null));
    public static final RegistryObject<StairBlock> STRIPPED_CRIMSON_STEM_STAIR = register("stripped_crimson_stem_stair",
            () -> new woodStair(SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD)
                    , "","","", false, null));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)));
        return exit;
    }
}
