package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

      /*  TextView nameTextView = findViewById(R.id.nameTextView);

        Bundle data = getIntent().getExtras();
        String username = data.getString(SplashActivity.USERNAME_KEY);
        String password = data.getString(SplashActivity.PASSWORD_KEY);

        nameTextView.setText(username);

        Toast.makeText(this, "La password è: " + password, Toast.LENGTH_LONG).show();
       */

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