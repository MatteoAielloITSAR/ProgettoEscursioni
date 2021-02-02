package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreazionePostActivity extends AppCompatActivity {

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