package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.woodSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
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

public class slabWood {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<SlabBlock> SPRUCE_WOOD_SLAB = register("spruce_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> SPRUCE_LOG_SLAB = register("spruce_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> OAK_WOOD_SLAB = register("oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> OAK_LOG_SLAB = register("oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> WARPED_STEM_SLAB = register("warped_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(WARPED_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> CRIMSON_STEM_SLAB = register("crimson_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> DARK_OAK_WOOD_SLAB = register("dark_oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> DARK_OAK_LOG_SLAB = register("dark_oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> ACACIA_WOOD_SLAB = register("acacia_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> ACACIA_LOG_SLAB = register("acacia_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(ACACIA_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> JUNGLE_WOOD_SLAB = register("jungle_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> JUNGLE_LOG_SLAB = register("jungle_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> BIRCH_WOOD_SLAB = register("birch_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> BIRCH_LOG_SLAB = register("birch_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(BIRCH_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = register("stripped_spruce_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = register("stripped_spruce_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_SPRUCE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_WOOD_SLAB = register("stripped_oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_LOG_SLAB = register("stripped_oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","", false));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_WARPED_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_CRIMSON_HYPHAE).sound(SoundType.WOOD),"","","",false));
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = register("stripped_dark_oak_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = register("stripped_dark_oak_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_DARK_OAK_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = register("stripped_acacia_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = register("stripped_acacia_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_ACACIA_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = register("stripped_jungle_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = register("stripped_jungle_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_JUNGLE_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = register("stripped_birch_wood_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","",true));
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = register("stripped_birch_log_slab",
            () -> new woodSlab(BlockBehaviour.Properties.copy(STRIPPED_BIRCH_WOOD).sound(SoundType.WOOD),"","","",true));

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64).tab(BASE_BLOCK)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return 3001;
            }
        });
        return exit;
    }
}
