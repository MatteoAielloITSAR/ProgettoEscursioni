package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SceltaPercorso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scelta_percorso);
        Button btnRegistrazione = findViewById(R.id.btnRegistrazione);
        Button btnManuale = findViewById(R.id.btnManuale);

        btnRegistrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SceltaPercorso.this, "btnRegistrazione", Toast.LENGTH_SHORT).show();
            }
        });
        btnManuale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SceltaPercorso.this, "btnManuale", Toast.LENGTH_SHORT).show();
            }
        });
    }
}