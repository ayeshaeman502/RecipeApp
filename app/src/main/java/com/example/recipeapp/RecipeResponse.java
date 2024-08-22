package com.example.recipeapp;

import com.google.gson.annotations.SerializedName;

public class RecipeResponse {

    @SerializedName("results")
    private Recipe[] recipes;

    public Recipe[] getRecipes() {
        return recipes;
    }
}
