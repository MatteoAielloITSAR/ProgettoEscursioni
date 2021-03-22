package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;

public class AccountVetrina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_vetrina);

        ArrayList<UtentePost> listaPost = new ArrayList<>();
        listaPost.add(new UtentePost(new Utente("mariorossi"),new Post("Baita della volpe, Monte Bianco", "Partenza da Baita Trecime, seguire il percorso 503 e 512", 1,"tutti","personalizzato")));
        listaPost.add(new UtentePost(new Utente("mariorossi"),new Post("Cima Monte Rosa", "Inizio dal rifugio Margherita e continuare sul passo dei Salati", 2, "tutti","personalizzato")));

        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView postvetrinaListView = findViewById(R.id.postvetrinaListView);
        postvetrinaListView.setAdapter(postListAdapter);

        postvetrinaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                UtentePost p = postListAdapter.getItem(i);
                Intent postIntent=new Intent(AccountVetrina.this, PostActivity.class);


                postIntent.putExtra("username", "mariorossi");
                postIntent.putExtra("nome percorso", p.getNomePercorso());
                postIntent.putExtra("descrizione", p.getDescrizione());
                postIntent.putExtra("tipologia", p.getTipologia());

                startActivity(postIntent);
            }
        });

    }
}