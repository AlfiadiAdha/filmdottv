package com.example.filmdottv.network;

import com.example.filmdottv.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(Constant.MOVIE_PATH+"/popular")
    Call<Movie> popularmovies(
            @Query("page") int page);
}
