package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import it.rizzoli.listadapter.IscrizioniListAdapter;
import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;

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

        ArrayList<Post> list=new ArrayList<>();
        list.add(new Post("pippo","des1","tipo1"));
        list.add(new Post("pluto","des2","tipo2"));

        PostListAdapter postListAdapter=new PostListAdapter(this,R.layout.list_post,list);
        ListView postListView = findViewById(R.id.percorsiListView);
        postListView.setAdapter(postListAdapter);


    }
}