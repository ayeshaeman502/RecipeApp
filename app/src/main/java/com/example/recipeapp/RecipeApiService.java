package com.example.recipeapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApiService {

    @GET("recipes/complexSearch")
    Call<RecipeResponse> searchRecipes(
        @Query("query") String query,
        @Query("apiKey") String apiKey
    );
}
