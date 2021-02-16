package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import it.rizzoli.listadapter.IscrizioniListAdapter;
import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;

public class PostIscrizioniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_iscrizioni);

        Button btnIscrizioni=findViewById(R.id.buttonIscrizioni);
        btnIscrizioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostIscrizioniActivity.this, IscrizioniActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<UtentePost> list=new ArrayList<>();
        list.add(new UtentePost(new Utente("utente1"),new Post("pippo", "asd", 2,"ss","a")));
        list.add(new UtentePost(new Utente("utente2"),new Post("pluto", "asad", 4,"aa","s")));

        PostListAdapter postListAdapter=new PostListAdapter(this,R.layout.list_post,list);
        ListView postListView = findViewById(R.id.percorsiListView);
        postListView.setAdapter(postListAdapter);

        postListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UtentePost p= postListAdapter.getItem(position);
                String nome=p.getNomePercorso();
                Toast.makeText(PostIscrizioniActivity.this,nome,Toast.LENGTH_LONG).show();

                Intent postIntent = new Intent(PostIscrizioniActivity.this, PostActivity.class);
                postIntent.putExtra("POST", p.getId());
                startActivity(postIntent);

            }
        });


    }
}