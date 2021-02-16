package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ArrayList<UtentePost> listaPostAcc = new ArrayList<>();
        listaPostAcc.add(new UtentePost(new Utente(),new Post("pippo", "asd", 0,"","a")));
        listaPostAcc.add(new UtentePost(new Utente(),new Post("pluto", "asad", 0,"","s")));

        PostListAdapter accpostListAdapter = new PostListAdapter(this, R.layout.list_post, listaPostAcc);
        ListView postaccountListView = findViewById(R.id.postaccountListView);
        postaccountListView.setAdapter(accpostListAdapter);

        postaccountListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                UtentePost p = accpostListAdapter.getItem(i);
                Intent postIntent=new Intent(AccountActivity.this, PostActivity.class);

                postIntent.putExtra("utente", "utenteX");
                postIntent.putExtra("nome percorso", p.getNomePercorso());
                postIntent.putExtra("descrizione", p.getDescrizione());
                postIntent.putExtra("tipologia", p.getTipologia());

                startActivity(postIntent);
            }
        });

     /*   postaccountListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Post p = accpostListAdapter.getItem(i);
                Intent postIntent=new Intent(AccountActivity.this, PostActivity.class);

                 postIntent.putExtra(SplashActivity.USERNAME_KEY, username);
                postIntent.putExtra("username", "");
                postIntent.putExtra("nome percorso", p.getNomePercorso());
                postIntent.putExtra("descrizione", p.getDescrizione());
                postIntent.putExtra("tipologia", p.getTipologia());

                startActivity(postIntent);
            }
        });

        /*
        LinearLayout lyPost1=findViewById(R.id.lyPost1);

        lyPost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountActivity.this,PostActivity.class);
                startActivity(intent);
            }
        });
         */

    }
}