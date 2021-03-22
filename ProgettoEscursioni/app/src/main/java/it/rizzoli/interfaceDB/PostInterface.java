package it.rizzoli.interfaceDB;
import java.util.List;

import it.rizzoli.model.Utente;
import it.rizzoli.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PostInterface {

    @GET()
    Call<List<Post>> all();

    @GET("/post/{id}")
    Call<Utente> byId(@Path("id") Integer id);

    @POST("/post")
    Call<Post> inserisci(@Body Post post);

    @POST("/post/{id}")
    Call<Utente> inserisciPost(@Body Post post, @Path("id") Integer id);

    @PUT("/post/{id}")
    Call<Utente> aggiorna(@Body Post post, @Path("id") Integer id);


}
