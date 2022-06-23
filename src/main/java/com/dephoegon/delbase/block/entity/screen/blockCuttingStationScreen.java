package com.dephoegon.delbase.block.entity.screen;

import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.slots.planSlots.getFullPlanSlotArray;
import static com.dephoegon.delbase.aid.slots.planSlots.getPlanOnlyArray;
import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.planSlot;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class blockCuttingStationScreen extends AbstractContainerScreen<blockCuttingStationMenu> {
    private static final ResourceLocation EMPTY_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_empty.png");
    private static final ResourceLocation COMPOUND_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_compound.png");
    private static final ResourceLocation PLANS_WALL_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_wall.png");
    private static final ResourceLocation PLANS_SLAB_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_slab.png");
    private static final ResourceLocation PLANS_STAIR_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_stair.png");
    private static final ResourceLocation PLANS_FENCE_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_fence.png");
    private static final ResourceLocation PLANS_FENCE_GATE_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_fence_gate.png");
    public blockCuttingStationScreen(blockCuttingStationMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(@NotNull PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        Item item = blockCuttingStation.iHandler.getStackInSlot(planSlot).getItem();
        if (getFullPlanSlotArray().contains(item)) {
            // Contains one of the valid items
            if (getPlanOnlyArray().contains(item)) {
                if (item == WALL_PLANS.get().asItem()) { RenderSystem.setShaderTexture(0, PLANS_WALL_TEXTURE); }
                if (item == FENCE_GATE_PLANS.get().asItem()) { RenderSystem.setShaderTexture(0, PLANS_FENCE_GATE_TEXTURE); }
                if (item == FENCE_PLANS.get().asItem()) { RenderSystem.setShaderTexture(0, PLANS_FENCE_TEXTURE); }
                if (item == SLAB_PLANS.get().asItem()) { RenderSystem.setShaderTexture(0, PLANS_SLAB_TEXTURE); }
                if (item == STAIR_PLANS.get().asItem()) { RenderSystem.setShaderTexture(0, PLANS_STAIR_TEXTURE); }
                // No other valid items it could be
            } else { RenderSystem.setShaderTexture(0, COMPOUND_TEXTURE); }
        } else { RenderSystem.setShaderTexture(0, EMPTY_TEXTURE); }
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
        if (menu.isCrafting()) {
            blit(pPoseStack, x+102, y+41, 176, 0,8, menu.getScaledProgress());
        }
    }
    @Override
    public void render(@NotNull PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
