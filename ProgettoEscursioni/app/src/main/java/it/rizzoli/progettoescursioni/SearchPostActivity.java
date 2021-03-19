package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import it.rizzoli.interfaceDB.PostInterface;
import it.rizzoli.interfaceDB.UtenteInterface;
import it.rizzoli.listadapter.PostListAdapter;
import it.rizzoli.model.Post;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;
import it.rizzoli.retrofit.RetrofitClientInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SearchPostActivity extends AppCompatActivity {

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
                Intent accountActivity = new Intent(SearchPostActivity.this, AccountActivity.class);
                startActivity(accountActivity);
                break;
            case R.id.crea:
                Intent creaPercorsoActivity = new Intent(SearchPostActivity.this, CreazionePostActivity.class);
                startActivity(creaPercorsoActivity);
                break;
            case R.id.iscrizioni:
                Intent iscrizioniActivity = new Intent(SearchPostActivity.this, PostIscrizioniActivity.class);
                startActivity(iscrizioniActivity);
                break;
            case R.id.ricerca:
                Intent ricercaActivity = new Intent(SearchPostActivity.this, SearchPostActivity.class);
                startActivity(ricercaActivity);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    List<Utente> lu;
    List<Post> lp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_post);
        TextView searchPost= findViewById(R.id.searchPost);
        /*EditText editTextRicerca = findViewById(R.id.editTextRicerca);
        Button buttonSearch = findViewById(R.id.buttonSearch);*/

        RetrofitClientInstance r=new RetrofitClientInstance();

        UtenteInterface u=r.getUtenteInterface();
        Call<List<Utente>> listaUtenti=u.all();
        listaUtenti.enqueue(new Callback<List<Utente>>() {
            @Override
            public void onResponse(Call<List<Utente>> call, Response<List<Utente>> response) {
                lu=response.body();
            }

            @Override
            public void onFailure(Call<List<Utente>> call, Throwable t) {

            }
        });
        /*
        PostInterface p=r.getPostInterface();
        Call<List<Post>> listaPost=p.all();
        listaPost.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                lp=response.body();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });
        for (int i=lp.size();i>0;i--){

        }

        PostListAdapter postListAdapter = new PostListAdapter(this, R.layout.list_post, listaPost);
        ListView ricercapostListView = findViewById(R.id.ricercapostListView);
        ricercapostListView.setAdapter(postListAdapter);

         */



       /* buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchPostActivity.this, "Stai cercando", Toast.LENGTH_LONG).show();
                String ricerca=editTextRicerca.getText().toString();
            }

        });*/

        /*

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

         */
    }
}