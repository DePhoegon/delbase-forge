package com.dephoegon.delbase.integration;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

import static com.dephoegon.delbase.delbase.Mod_ID;

@JeiPlugin
public class jeiDelbaseModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Mod_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                blockCuttingStationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<blockCuttingStationRecipes> recipesList = rm.getAllRecipesFor(blockCuttingStationRecipes.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(blockCuttingStationRecipeCategory.UID, blockCuttingStationRecipes.class), recipesList);
    }
}
