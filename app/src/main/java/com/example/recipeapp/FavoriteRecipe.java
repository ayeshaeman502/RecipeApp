package com.example.recipeapp.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favorite_recipe")
public class FavoriteRecipe {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    public FavoriteRecipe(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
