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
        listaPost.add(new UtentePost(new Utente(),new Post("nomePost1", "descrizione", 3,"pubblico","standard")));
        listaPost.add(new UtentePost(new Utente(),new Post("nomePost2", "descrizione2", 2, "privato","personalizzato")));

        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView postvetrinaListView = findViewById(R.id.postvetrinaListView);
        postvetrinaListView.setAdapter(postListAdapter);

        postvetrinaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                UtentePost p = postListAdapter.getItem(i);
                Intent postIntent=new Intent(AccountVetrina.this, PostActivity.class);


                postIntent.putExtra("username", "utenteX");
                postIntent.putExtra("nome percorso", p.getNomePercorso());
                postIntent.putExtra("descrizione", p.getDescrizione());
                postIntent.putExtra("tipologia", p.getTipologia());

                startActivity(postIntent);
            }
        });

    }
}