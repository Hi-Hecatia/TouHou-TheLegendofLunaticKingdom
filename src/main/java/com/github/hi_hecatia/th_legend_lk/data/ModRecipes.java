package com.github.hi_hecatia.th_legend_lk.data;

import com.github.hi_hecatia.th_legend_lk.init.ModInitItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(DataGenerator generator) {
        super(generator);
    }

    //注册配方表
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipeConsumer) {
        craftingDoughWithWater(recipeConsumer);
        craftingTuanzi(recipeConsumer);
        smeltingDoughWithWater(recipeConsumer);
    }

    private void craftingDoughWithWater(Consumer<FinishedRecipe> consumer){
        ShapelessRecipeBuilder
                .shapeless(ModInitItems.DOUGH_WITH_WATER.get(),2)
                .requires(Items.WHEAT,2)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_wheat",has(Items.WHEAT))
                .save(consumer);
    }

    private void craftingTuanzi(Consumer<FinishedRecipe> consumer){
        ShapedRecipeBuilder.
                shaped(ModInitItems.TUANZI.get())
                .define('0', ModInitItems.TUANZI_WITHOUT_STICK.get())
                .define('1',Items.STICK)
                .pattern("0  ")
                .pattern(" 0 ")
                .pattern("  1")
                .unlockedBy("",has(ModInitItems.TUANZI_WITHOUT_STICK.get()))
                .save(consumer);
    }

    private void smeltingDoughWithWater(Consumer<FinishedRecipe> consumer){
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(ModInitItems.DOUGH_WITH_WATER.get()), ModInitItems.TUANZI_WITHOUT_STICK.get(),1f,20*8)
                .unlockedBy("has_dough_with_water",has(ModInitItems.DOUGH_WITH_WATER.get()))
                .save(consumer);
    }
}
