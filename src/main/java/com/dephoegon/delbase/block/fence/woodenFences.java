package com.dephoegon.delbase.block.fence;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
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
import static net.minecraft.world.level.block.Blocks.OAK_FENCE;
import static net.minecraft.world.level.block.Blocks.OAK_FENCE_GATE;

public class woodenFences {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<FenceBlock> ACACIA_WOOD_FENCE = register("acacia_wood_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> ACACIA_LOG_FENCE = register("acacia_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> ACACIA_LOG_FENCE_GATE = register("acacia_log_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = register("stripped_acacia_wood_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = register("stripped_acacia_wood_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> STRIPPED_ACACIA_LOG_FENCE = register("stripped_acacia_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_ACACIA_LOG_FENCE_GATE = register("stripped_acacia_log_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> BIRCH_WOOD_FENCE = register("birch_wood_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> BIRCH_LOG_FENCE = register("birch_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> BIRCH_LOG_FENCE_GATE = register("birch_log_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = register("stripped_birch_wood_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = register("stripped_birch_wood_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceBlock> STRIPPED_BIRCH_LOG_FENCE = register("stripped_birch_log_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).sound(SoundType.WOOD),
                    "","","", true), 5000);
    public static final RegistryObject<FenceGateBlock> STRIPPED_BIRCH_LOG_FENCE_GATE = register("stripped_birch_log_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).sound(SoundType.WOOD),
                    "","","", true), 5000);

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
}
