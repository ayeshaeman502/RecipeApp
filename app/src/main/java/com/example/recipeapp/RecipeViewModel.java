package com.example.recipeapp;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecipeViewModel extends AndroidViewModel {

    private MutableLiveData<RecipeResponse> recipes;
    private RecipeApiService apiService;
private final String API_KEY = "12345-abcde-67890-fghij";

    public RecipeViewModel(Application application) {
        super(application);
        apiService = ApiClient.getClient().create(RecipeApiService.class);
        recipes = new MutableLiveData<>();
    }

    public LiveData<RecipeResponse> getRecipes() {
        return recipes;
    }

    public void fetchRecipes(String query) {
        Call<RecipeResponse> call = apiService.searchRecipes(query, API_KEY);
        call.enqueue(new Callback<RecipeResponse>() {
            @Override
            public void onResponse(Call<RecipeResponse> call, Response<RecipeResponse> response) {
                if (response.isSuccessful()) {
                    recipes.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<RecipeResponse> call, Throwable t) {
                // Handle the error
            }
        });
    }
}
