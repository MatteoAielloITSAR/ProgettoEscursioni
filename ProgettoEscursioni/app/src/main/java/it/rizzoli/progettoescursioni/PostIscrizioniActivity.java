package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
            case R.id.account:
                Intent accountActivity = new Intent(PostIscrizioniActivity.this, AccountActivity.class);
                startActivity(accountActivity);
                break;
            case R.id.crea:
                Intent creaPercorsoActivity = new Intent(PostIscrizioniActivity.this, CreazionePostActivity.class);
                startActivity(creaPercorsoActivity);
                break;
            case R.id.iscrizioni:
                Intent iscrizioniActivity = new Intent(PostIscrizioniActivity.this, PostIscrizioniActivity.class);
                startActivity(iscrizioniActivity);
                break;
            case R.id.ricerca:
                Intent ricercaActivity = new Intent(PostIscrizioniActivity.this, SearchPostActivity.class);
                startActivity(ricercaActivity);
                break;

        }
        return super.onOptionsItemSelected(item);
    }


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