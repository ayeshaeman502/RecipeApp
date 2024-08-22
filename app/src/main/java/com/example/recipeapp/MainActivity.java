package com.example.recipeapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private RecipeViewModel recipeViewModel;
    private TextView recipeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeTextView = findViewById(R.id.recipe_text_view);

        recipeViewModel = new ViewModelProvider(this).get(RecipeViewModel.class);

        String query = "pasta"; // Example query
        recipeViewModel.fetchRecipes(query);

        recipeViewModel.getRecipes().observe(this, recipeResponse -> {
            if (recipeResponse != null) {
                // Display the first recipe's title
                recipeTextView.setText(recipeResponse.getRecipes()[0].getTitle());
            }
        });
    }
}
