
package com.example.skill5parte4.movie_list;

import static com.example.skill5parte4.network.ApiClient.API_KEY;

import android.util.Log;

import java.util.List;

import com.example.skill5parte4.model.Movie;
import com.example.skill5parte4.model.MovieListResponse;
import com.example.skill5parte4.network.ApiClient;
import com.example.skill5parte4.network.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieListModel implements MovieListContract.Model {

    private final String TAG = "MovieListModel";

    @Override
    public void getMovieList(final OnFinishedListener onFinishedListener, int pageNo) {

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<MovieListResponse> call = apiService.getPopularMovies(API_KEY, pageNo);
        call.enqueue(new Callback<MovieListResponse>() {
            @Override
            public void onResponse(Call<MovieListResponse> call, Response<MovieListResponse> response) {
                List<Movie> movies = response.body().getResults();
                Log.d(TAG, "Number of movies received: " + movies.size());
                onFinishedListener.onFinished(movies);
            }

            @Override
            public void onFailure(Call<MovieListResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
                onFinishedListener.onFailure(t);
            }
        });
    }

}
