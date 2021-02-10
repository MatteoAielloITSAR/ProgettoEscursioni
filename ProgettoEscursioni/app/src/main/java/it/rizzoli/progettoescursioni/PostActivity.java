package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        Button btnUsername=findViewById(R.id.usernameAccount);
        btnUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent postIntent = new Intent(PostActivity.this, AccountVetrina.class);
                startActivity(postIntent);
            }
        });

        /*Button btnVisualMapPer=findViewById(R.id.visualizzaMappaPercorso);
        btnVisualMapPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent postIntent = new Intent(PostActivity.this, AccountVetrina.class);
               // startActivity(postIntent);
            }
        });

         */
    }
}