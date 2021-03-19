package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CreazionePostActivity extends AppCompatActivity {

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
                Intent accountActivity = new Intent(CreazionePostActivity.this, AccountActivity.class);
                startActivity(accountActivity);
                break;
            case R.id.crea:
                Intent creaPercorsoActivity = new Intent(CreazionePostActivity.this, CreazionePostActivity.class);
                startActivity(creaPercorsoActivity);
                break;
            case R.id.iscrizioni:
                Intent iscrizioniActivity = new Intent(CreazionePostActivity.this, PostIscrizioniActivity.class);
                startActivity(iscrizioniActivity);
                break;
            case R.id.ricerca:
                Intent ricercaActivity = new Intent(CreazionePostActivity.this, SearchPostActivity.class);
                startActivity(ricercaActivity);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    Button btnCreaPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creazione_post);

        btnCreaPost=findViewById(R.id.btnCreaPost);
        btnCreaPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(CreazionePostActivity.this,AccountActivity.class);
                startActivity(accountIntent);
            }
        });

    }
}