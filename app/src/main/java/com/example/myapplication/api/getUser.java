package com.example.myapplication.api;

import com.example.myapplication.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface getUser {
    Gson gson =new GsonBuilder().setDateFormat("dd-MM-yyyy").create();

    getUser getUser= new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(getUser.class);

    @GET("users")
    Call<List<User>> getListUser();
}
