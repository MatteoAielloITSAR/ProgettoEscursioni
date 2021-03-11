package it.rizzoli.retrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance extends Application {

    public static final String BASE_URL = "http://192.168.1.53:8080";
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
<<<<<<< HEAD
=======
}

>>>>>>> 346d3a0e518bbc703ceaed03769d67bb083b5347


