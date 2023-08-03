package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.quartzStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.BASE_BLOCK;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairQuartz {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_ID);

    public static final RegistryObject<StairBlock> CHISELED_QUARTZ_STAIR = register("chiseled_quartz_stair",
            () -> new quartzStair(CHISELED_QUARTZ_BLOCK));
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIR = register("quartz_brick_stair",
            () -> new quartzStair(QUARTZ_BRICKS));
    public static final RegistryObject<StairBlock> QUARTZ_PILLAR_STAIR = register("quartz_pillar_stair",
            () -> new quartzStair(QUARTZ_PILLAR));

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
