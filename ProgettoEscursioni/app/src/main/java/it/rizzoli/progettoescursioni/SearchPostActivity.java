package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;

public class SearchPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_post);
        TextView searchPost= findViewById(R.id.searchPost);
        EditText editTextRicerca = findViewById(R.id.editTextRicerca);
        Button buttonSearch = findViewById(R.id.buttonSearch);

        ArrayList<UtentePost> listaPost = new ArrayList<>();
        listaPost.add(new UtentePost(new Utente(),new Post("Monte Bianco", "qwerty", 0, "", "a")));
        listaPost.add(new UtentePost(new Utente(),new Post("Monte Rosa", "ytrewq", 1, "", "c")));
        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView ricercapostListView = findViewById(R.id.ricercapostListView);
        ricercapostListView.setAdapter(postListAdapter);



        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchPostActivity.this, "Stai cercando", Toast.LENGTH_LONG).show();
            }

        });

        ricercapostListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                UtentePost p = postListAdapter.getItem(i);
                Intent postIntent2=new Intent(SearchPostActivity.this, PostActivity.class);

                postIntent2.putExtra("utente", "utenteX");
                postIntent2.putExtra("nome percorso", p.getNomePercorso());
                postIntent2.putExtra("descrizione", p.getDescrizione());
                postIntent2.putExtra("tipologia", p.getTipologia());

                startActivity(postIntent2);


            }
        });
    }
}