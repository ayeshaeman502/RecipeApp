package com.example.recipeapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {FavoriteRecipe.class}, version = 1)
public abstract class RecipeDatabase extends RoomDatabase {
    public abstract RecipeDao recipeDao();
}
