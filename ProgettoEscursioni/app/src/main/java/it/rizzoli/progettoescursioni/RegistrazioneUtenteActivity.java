package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrazioneUtenteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_utente);

        /*
        TextView twNome = findViewById(R.id.twNome);
        TextView twCognome = findViewById(R.id.twCognome);
        TextView twUsername = findViewById(R.id.twUsername);
        TextView twPassword = findViewById(R.id.twPassword);
        */

        EditText etNome = findViewById(R.id.etNome);
        EditText etCognome = findViewById(R.id.etCognome);
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);

        Button btnRegistrati = findViewById(R.id.btnRegistrati);

        btnRegistrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrazioneUtenteActivity.this, "btnRegistrati", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(RegistrazioneUtenteActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}