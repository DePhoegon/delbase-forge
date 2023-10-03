package com.dephoegon.delbase.aid.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.inputSlot;
import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.planSlot;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.core.NonNullList.withSize;

public class blockCuttingStationRecipes implements Recipe<SimpleContainer> {
    private static final int jsonIngredientItem = 1;
    private static final int jsonPlanItem = 0;
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public blockCuttingStationRecipes(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }
    public boolean matches(@NotNull SimpleContainer pContainer, @NotNull Level pLevel) {
        if (recipeItems == null) { return false; } else {
            return (recipeItems.get(jsonIngredientItem).test(pContainer.getItem(inputSlot)) && recipeItems.get(jsonPlanItem).test(pContainer.getItem(planSlot)));
        }
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack assemble(@NotNull SimpleContainer p_44001_, @NotNull RegistryAccess p_267165_) { return null; }

    public @NotNull NonNullList<Ingredient> getIngredients() { return recipeItems; }
    public boolean isSpecial() { return true; }
    public @NotNull ItemStack assemble(@NotNull SimpleContainer pContainer) { return output; }
    public boolean canCraftInDimensions(int pWidth, int pHeight) { return true; }

    @Override
    public @NotNull ItemStack getResultItem(@NotNull RegistryAccess p_267052_) { return this.output; }

    public @NotNull ItemStack getResultItem() { return output.copy(); }
    public @NotNull ResourceLocation getId() { return id; }
    public @NotNull RecipeSerializer<?> getSerializer() { return Serializer.INSTANCE; }
    public @NotNull RecipeType<?> getType() { return Type.INSTANCE; }

    public static class Type implements RecipeType<blockCuttingStationRecipes> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "block_cutting";
    }
    public static class Serializer implements RecipeSerializer<blockCuttingStationRecipes> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(Mod_ID, Type.ID);

        public @NotNull blockCuttingStationRecipes fromJson(@NotNull ResourceLocation id, @NotNull JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = withSize(2, Ingredient.EMPTY);
            if (inputs.size() == 2){
                for (int i = 0; i < inputs.size(); ++i) {
                    inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
                }
                return new blockCuttingStationRecipes(id, output, inputs);
            } else return new blockCuttingStationRecipes(id, output, null);
        }
        public blockCuttingStationRecipes fromNetwork(@NotNull ResourceLocation id, @NotNull FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = withSize(buf.readInt(), Ingredient.EMPTY);
            inputs.replaceAll(ignored -> Ingredient.fromNetwork(buf));
            ItemStack output = buf.readItem();
            return new blockCuttingStationRecipes(id, output, inputs);
        }
        public void toNetwork(@NotNull FriendlyByteBuf buf, @NotNull blockCuttingStationRecipes recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }
    }
}