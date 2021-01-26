package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostIscrizioniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_iscrizioni);

        Button btnIscrizioni=findViewById(R.id.buttonIscrizioni);
        btnIscrizioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(PostIscrizioniActivity.this, IscrizioniActivity.class);
                startActivity(browserIntent);
            }
        });
    }
}