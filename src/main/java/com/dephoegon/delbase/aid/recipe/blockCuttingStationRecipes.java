package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.block.item.cutterPlans;
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

import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.inputSlot;
import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.planSlot;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static com.dephoegon.delbase.item.blockCutterPlans.ARMOR_COMPOUND;
import static net.minecraft.core.NonNullList.withSize;

public class blockCuttingStationRecipes implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final ItemStack plan;
    private final ItemStack input;
    public @NotNull ItemStack getResultItem() { return output.copy(); }
    public ItemStack getPlans() { return plan; }
    public ItemStack getInput() { return input; }
    private @NotNull ItemStack getDefault(@NotNull ItemStack input) { return input.getItem().getDefaultInstance(); }
    public blockCuttingStationRecipes(ResourceLocation id, ItemStack output, ItemStack plan, ItemStack input) {
        this.id = id;
        this.output = output;
        this.plan = plan;
        this.input = input;
    }
    public boolean matches(@NotNull SimpleContainer pContainer, @NotNull Level pLevel) {
        if (getInput().equals(ItemStack.EMPTY) || getPlans().equals(ItemStack.EMPTY)) { return false; }
        boolean inputs = getDefault(getInput()).toString().equals(getDefault(pContainer.getItem(inputSlot)).toString());
        boolean outputs = false;
        boolean hold = false;
        if (inputs) { outputs = getDefault(getPlans()).toString().equals(getDefault(pContainer.getItem(planSlot)).toString()); }
        if (inputs && outputs) {
            int planSlots = getDefault(getPlans()).toString().equals(ARMOR_COMPOUND.get().getDefaultInstance().toString()) ? getPlans().getCount() : 1;
            hold = planSlots <= pContainer.getItem(planSlot).getCount() && getInput().getCount() <= pContainer.getItem(inputSlot).getCount();
        }
        return hold;
    }
    @Override
    public boolean isSpecial() { return true; }
    @Override
    public @NotNull ItemStack assemble(@NotNull SimpleContainer pContainer) { return output; }
    public boolean canCraftInDimensions(int pWidth, int pHeight) { return true; }
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

        @Override
        public @NotNull blockCuttingStationRecipes fromJson(@NotNull ResourceLocation id, @NotNull JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            ItemStack input = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "input"));
            ItemStack plan = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "plans"));
            if (plan.getItem() instanceof cutterPlans) { plan.setCount(1); }

            return new blockCuttingStationRecipes(id, output, plan, input);
        }
        @Override
        public blockCuttingStationRecipes fromNetwork(@NotNull ResourceLocation id, @NotNull FriendlyByteBuf buf) {
            ItemStack output = buf.readItem();
            ItemStack plans = buf.readItem();
            ItemStack inputs = buf.readItem();
            if (plans.getItem() instanceof cutterPlans) { plans.setCount(1); }
            return new blockCuttingStationRecipes(id, output, plans, inputs);
        }
        @Override
        public void toNetwork(@NotNull FriendlyByteBuf buf, @NotNull blockCuttingStationRecipes recipe) {
            buf.writeItemStack(recipe.output, false);
            if (recipe.getPlans().getItem() instanceof cutterPlans) { recipe.plan.setCount(1); }
            buf.writeItemStack(recipe.plan, false);
            buf.writeItemStack(recipe.input, false);
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
        @SuppressWarnings("SameParameterValue")
        private static <G> Class<G> castClass(Class<?> cls) {
            //noinspection unchecked
            return (Class<G>)cls;
        }
    }
}
