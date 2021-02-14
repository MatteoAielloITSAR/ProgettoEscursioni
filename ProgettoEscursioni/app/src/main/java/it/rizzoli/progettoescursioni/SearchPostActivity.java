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

public class SearchPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_post);
        TextView searchPost= findViewById(R.id.searchPost);
        EditText editTextRicerca = findViewById(R.id.editTextRicerca);
        Button buttonSearch = findViewById(R.id.buttonSearch);

        ArrayList<Post> listaPost = new ArrayList<>();
        listaPost.add(new Post("Monte Bianco", "qwerty", 0, "", "a"));
        listaPost.add(new Post("Monte Rosa", "ytrewq", 1, "", "c"));
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
                Post p = postListAdapter.getItem(i);
                Intent postIntent=new Intent(SearchPostActivity.this, PostActivity.class);
                /*
                postIntent.putExtra(())
                */

            }
        });
    }
}