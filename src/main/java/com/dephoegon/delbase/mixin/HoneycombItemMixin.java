package com.dephoegon.delbase.mixin;

import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

import static com.dephoegon.delbase.block.fence.stoneFences.STONE_FENCE;

@Mixin(HoneycombItem.class)
public abstract class HoneycombItemMixin {

    @Inject(method = "getWaxed", at = @At("HEAD"), cancellable = true)
    private static void onGetWaxed(@NotNull BlockState p_150879_, CallbackInfoReturnable<Optional<BlockState>> cir) {
        if (p_150879_.getBlock() instanceof FallingBlock) {
            cir.setReturnValue(Optional.of(STONE_FENCE.get().defaultBlockState()));
            cir.cancel();
        }
    }
}
