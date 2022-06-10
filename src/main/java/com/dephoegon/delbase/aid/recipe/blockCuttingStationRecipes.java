package com.dephoegon.delbase.aid.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.core.NonNullList.withSize;

public class blockCuttingStationRecipes implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public blockCuttingStationRecipes(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }
    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if (recipeItems == null) { return false; } else {
            return (recipeItems.get(1).test(pContainer.getItem(0)) && recipeItems.get(0).test(pContainer.getItem(1)));
        }
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<blockCuttingStationRecipes> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "block_cutting";
    }

    public static class Serializer implements RecipeSerializer<blockCuttingStationRecipes> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(Mod_ID, Type.ID);

        @Override
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
        @Override
        public blockCuttingStationRecipes fromNetwork(@NotNull ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = withSize(buf.readInt(), Ingredient.EMPTY);
            for (int i =0; i < inputs.size(); ++i) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }
            ItemStack output = buf.readItem();
            return new blockCuttingStationRecipes(id, output, inputs);
        }
        @Override
        public void toNetwork(FriendlyByteBuf buf, blockCuttingStationRecipes recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }
        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }
        @Nullable
        @Override
        public ResourceLocation getRegistryName() { return ID; }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(RecipeSerializer.class);
        }
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }


}
