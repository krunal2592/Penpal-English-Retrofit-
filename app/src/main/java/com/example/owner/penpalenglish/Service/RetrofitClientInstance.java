package com.example.owner.penpalenglish.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {


    private static Retrofit retrofit;
    //private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static final String BASE_URL = "http://54.148.5.0:8080";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}