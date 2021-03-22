package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import it.rizzoli.interfaceDB.UtenteInterface;
import it.rizzoli.listadapter.IscrizioniListAdapter;
import it.rizzoli.model.Utente;
import it.rizzoli.model.UtentePost;
import it.rizzoli.retrofit.RetrofitClientInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IscrizioniActivity extends AppCompatActivity {
    IscrizioniListAdapter iscrizioniListAdapter;
    List<Utente> list=new ArrayList<Utente>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iscrizioni);

        ListView iscrizioniListView = findViewById(R.id.iscrizioniListView);
        //list.add(new Utente("pippo"));
        //list.add(new Utente("pluto"));



        UtenteInterface ui = (new RetrofitClientInstance()).getUtenteInterface();
        Call<List<Utente>> call = ui.all();
        call.enqueue(new Callback<List<Utente>>() {
            @Override
            public void onResponse(Call<List<Utente>> call, Response<List<Utente>> response) {
                list = response.body();
                Toast.makeText(IscrizioniActivity.this, list.get(0).getNome(),Toast.LENGTH_LONG).show();
                iscrizioniListAdapter =new IscrizioniListAdapter(IscrizioniActivity.this,R.layout.list_account,(ArrayList)list);

                iscrizioniListView.setAdapter(iscrizioniListAdapter);
            }

            @Override
            public void onFailure(Call<List<Utente>> call, Throwable t) {

            }
        });

        iscrizioniListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Utente ut = iscrizioniListAdapter.getItem(i);
                String user = ut.getUsername();
                Toast.makeText(IscrizioniActivity.this, user, Toast.LENGTH_LONG).show();

                Intent accountVetrinaIntent = new Intent(IscrizioniActivity.this, AccountVetrina.class);
                accountVetrinaIntent.putExtra("UTENTE", ut.getId());
                startActivity(accountVetrinaIntent);


            }
        });

    }


}