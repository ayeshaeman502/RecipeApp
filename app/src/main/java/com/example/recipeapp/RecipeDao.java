package com.example.recipeapp.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RecipeDao {

    @Insert
    void insert(FavoriteRecipe favoriteRecipe);

    @Delete
    void delete(FavoriteRecipe favoriteRecipe);

    @Query("SELECT * FROM favorite_recipe")
    List<FavoriteRecipe> getAllFavoriteRecipes();

    @Query("SELECT * FROM favorite_recipe WHERE id = :id")
    FavoriteRecipe getRecipeById(int id);
}
