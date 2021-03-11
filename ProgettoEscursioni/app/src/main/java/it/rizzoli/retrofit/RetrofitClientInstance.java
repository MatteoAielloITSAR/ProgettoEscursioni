package it.rizzoli.retrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance extends Application {

    public static Retrofit retrofit;

    private RetrofitClientInstance() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.53:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    /*
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.1.53:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

     */
}
