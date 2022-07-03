package com.dephoegon.delbase.integration;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.ModIds;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.delbase.Mod_ID;

@JeiPlugin
public class jeiDelbaseModPlugin implements IModPlugin {
    public static final RecipeType<blockCuttingStationRecipes> BLOCK_CUTTING_STATION_RECIPE =
            RecipeType.create(Mod_ID, "block_cutting", blockCuttingStationRecipes.class);
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(Mod_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                blockCuttingStationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(BLOCK_CUTTING_STATION.get()), BLOCK_CUTTING_STATION_RECIPE);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<blockCuttingStationRecipes> recipesList = rm.getAllRecipesFor(blockCuttingStationRecipes.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(blockCuttingStationRecipeCategory.UID, blockCuttingStationRecipes.class), recipesList);
    }
}
