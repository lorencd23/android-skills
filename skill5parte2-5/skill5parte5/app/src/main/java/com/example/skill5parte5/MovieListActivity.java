package com.example.skill5parte5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skill5parte5.adapters.MovieRecyclerView;
import com.example.skill5parte5.adapters.OnMovieListener;

public class MovieListActivity extends AppCompatActivity implements OnMovieListener {

    //RecyclerView
    private RecyclerView recyclerView;
    private MovieRecyclerView movieRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void ObserveAnyChange(){
        movieRecyclerAdapter.setMovies(movieModels);
    }



    private void ConfigureRecyclerView(){
        movieRecyclerAdapter = new MovieRecyclerView(this);

        recyclerView.setAdapter(movieRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    @Override
    public void onMovieClick(int position) {

    }

    @Override
    public void onCategoryClick(String category) {

    }
}
