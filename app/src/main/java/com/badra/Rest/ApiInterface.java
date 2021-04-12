package com.badra.Rest;

import com.badra.Model.GetPost;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts")
    Call<GetPost> getPost();
}
