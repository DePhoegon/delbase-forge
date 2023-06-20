package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.woodSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabStrippedWood {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = register("stripped_spruce_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = register("stripped_spruce_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_WOOD_SLAB = register("stripped_oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_LOG_SLAB = register("stripped_oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false, null));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","",false, null));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false, null));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false, null));
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = register("stripped_dark_oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = register("stripped_dark_oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = register("stripped_acacia_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = register("stripped_acacia_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = register("stripped_jungle_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = register("stripped_jungle_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = register("stripped_birch_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = register("stripped_birch_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","",true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = register("stripped_mangrove_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(MANGROVE_WOOD).sound(SoundType.WOOD), "","","", true, null), 3001);
    public static final RegistryObject<SlabBlock> STRIPPED_MANGROVE_LOG_SLAB = register("stripped_mangrove_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(MANGROVE_WOOD).sound(SoundType.WOOD), "","","", true, null), 3001);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burn) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK).tab(CreativeModeTab.TAB_DECORATIONS)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK).tab(CreativeModeTab.TAB_DECORATIONS)));
        return exit;
    }
}
