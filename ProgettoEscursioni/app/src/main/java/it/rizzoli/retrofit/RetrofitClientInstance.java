package it.rizzoli.retrofit;

import android.app.Application;

import it.rizzoli.interfaceDB.PostInterface;
import it.rizzoli.interfaceDB.UtenteInterface;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance extends Application {

    public static final String BASE_URL = "http://192.168.1.52:8080";
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public UtenteInterface getUtenteInterface() {
        UtenteInterface ui = retrofit.create(UtenteInterface.class);
        return ui;
    }

    public PostInterface getPostInterface() {
        PostInterface ui = retrofit.create(PostInterface.class);
        return ui;
    }
}


