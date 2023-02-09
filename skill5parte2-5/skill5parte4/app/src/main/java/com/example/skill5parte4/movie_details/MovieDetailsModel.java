
package com.example.skill5parte4.movie_details;

import static com.example.skill5parte4.network.ApiClient.API_KEY;
import static com.example.skill5parte4.utils.Constants.CREDITS;

import android.util.Log;

import com.example.skill5parte4.model.Movie;
import com.example.skill5parte4.network.ApiClient;
import com.example.skill5parte4.network.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieDetailsModel implements MovieDetailsContract.Model {

    private final String TAG = "MovieDetailsModel";

    @Override
    public void getMovieDetails(final OnFinishedListener onFinishedListener, int movieId) {

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Movie> call = apiService.getMovieDetails(movieId, API_KEY, CREDITS);
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Movie movie = response.body();
                Log.d(TAG, "Movie data received: " + movie.toString());
                onFinishedListener.onFinished(movie);
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.e(TAG, t.toString());
                onFinishedListener.onFailure(t);
            }
        });

    }
}
