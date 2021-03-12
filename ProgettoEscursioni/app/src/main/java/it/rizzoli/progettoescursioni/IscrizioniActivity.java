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
import it.rizzoli.retrofit.RetrofitClientInstance;
import retrofit2.Call;

public class IscrizioniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iscrizioni);

        ArrayList<Utente> list=new ArrayList<>();
        list.add(new Utente("pippo"));
        list.add(new Utente("pluto"));

        IscrizioniListAdapter iscrizioniListAdapter=new IscrizioniListAdapter(this,R.layout.list_account,list);
        ListView iscrizioniListView = findViewById(R.id.iscrizioniListView);
        iscrizioniListView.setAdapter(iscrizioniListAdapter);

        iscrizioniListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Utente ut = iscrizioniListAdapter.getItem(i);
                String user = ut.getUsername();
                Toast.makeText(IscrizioniActivity.this, user, Toast.LENGTH_LONG).show();

                Intent accountVetrinaIntent = new Intent(IscrizioniActivity.this, AccountVetrina.class);
                accountVetrinaIntent.putExtra("UTENTE", ut.getId());
                startActivity(accountVetrinaIntent );

                UtenteInterface ui = (new RetrofitClientInstance()).getUtenteInterface();
                Call<List<Utente>> call = ui.all();
            }
        });
  
    }
}