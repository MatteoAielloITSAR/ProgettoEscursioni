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

public class AccountVetrina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_vetrina);

        ArrayList<Post> listaPost = new ArrayList<>();
        listaPost.add(new Post("pippo", "asd", 0,"","a"));
        listaPost.add(new Post("pluto", "asad", 0,"","s"));

        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView postvetrinaListView = findViewById(R.id.postvetrinaListView);
        postvetrinaListView.setAdapter(postListAdapter);

        postvetrinaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Post p = postListAdapter.getItem(i);
                Intent postIntent=new Intent(AccountVetrina.this, PostActivity.class);

               /* postIntent.putExtra(SplashActivity.USERNAME_KEY, username);*/

                startActivity(postIntent);
            }
        });

    }
}