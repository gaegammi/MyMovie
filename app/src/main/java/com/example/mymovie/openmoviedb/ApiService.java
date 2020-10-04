package com.example.mymovie.openmoviedb;

import com.example.mymovie.appclasses.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search_json2.jsp?")
    Call<ResponseModel> getMovieInfo(@Query("ServiceKey") String key, @Query("collection") String collection);

}
