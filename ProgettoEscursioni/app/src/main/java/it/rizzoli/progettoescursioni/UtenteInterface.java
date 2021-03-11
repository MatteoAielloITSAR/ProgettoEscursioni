package it.rizzoli.progettoescursioni;


import java.util.List;

import it.rizzoli.model.Utente;
import it.rizzoli.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UtenteInterface {

    @GET()
    Call<List<Utente>> all();

    @GET("/utenti/{id}")
    Call<Utente> byId(@Path("id") Integer id);

    @POST("/utente")
    Call<Utente> inserisci(@Body Utente utente);

    @POST("/utenti/{id}")
    Call<Utente> inserisciPost(@Body Post post, @Path("id") Integer id);

    @PUT("/utenti/{id}")
    Call<Utente> aggiorna(@Body Utente utente, @Path("id") Integer id);


}
