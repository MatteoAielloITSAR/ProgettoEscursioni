package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import it.rizzoli.listadapter.PostListAdapter;

public class SearchPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_post);
        TextView searchPost= findViewById(R.id.searchPost);
        EditText editTextRicerca = findViewById(R.id.editTextRicerca);
        Button buttonSearch = findViewById(R.id.buttonSearch);

        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView ricercapostListView = findViewById(R.id.ricercapostListView);
        ricercapostListView.setAdapter(postListAdapter);



        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchPostActivity.this, "Stai cercando", Toast.LENGTH_LONG).show();
            }
        });
    }
}