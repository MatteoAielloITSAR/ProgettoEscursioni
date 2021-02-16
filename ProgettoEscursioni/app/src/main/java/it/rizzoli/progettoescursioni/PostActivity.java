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

        Button btnUsername=findViewById(R.id.username);
        btnUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent postIntent = new Intent(PostActivity.this, AccountVetrina.class);
                startActivity(postIntent);
            }
        });
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        String stringUsername = bundle.getString("username");
        String stringNomePercorso = bundle.getString("nome percorso");
        String stringDescrizione = bundle.getString("descrizione");
        String stringTipologia = bundle.getString("tipologia");
        int intDifficolta = bundle.getInt("difficolta");

        TextView tvNomePercorso = findViewById(R.id.nomePercorso);
        tvNomePercorso.setText(stringNomePercorso);

        TextView tvDescrizione = findViewById(R.id.descrizione);
        tvDescrizione.setText(stringDescrizione);

        TextView tvTipologia = findViewById(R.id.tipologia);
        tvTipologia.setText(stringTipologia);

        TextView tvDifficolta = findViewById(R.id.difficolta);
        tvDifficolta.setText(String.valueOf(intDifficolta));

        btnUsername.setText(stringUsername);



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