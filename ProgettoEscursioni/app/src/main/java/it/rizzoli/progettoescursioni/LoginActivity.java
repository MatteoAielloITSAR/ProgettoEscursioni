package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnRegistrati = findViewById(R.id.btnRegistrati);
        Button btnRecuperaPassword = findViewById(R.id.btnRecuperaPassword);
        Button btnAccedi = findViewById(R.id.btnAccedi);

        btnRegistrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "btnRegistrati", Toast.LENGTH_SHORT).show();


                Intent registratiIntent=new Intent(LoginActivity.this,RegistrazioneUtenteActivity.class);
                startActivity(registratiIntent);
            }
        });

        btnRecuperaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "btnRecuperaPassword", Toast.LENGTH_SHORT).show();
                Intent recuperaPwdIntent=new Intent(LoginActivity.this, RecuperopasswordActivity.class);
                startActivity(recuperaPwdIntent);
            }
        });

        btnAccedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etUsername.getText().toString();
                String password=etPassword.getText().toString();

                if(username.length()<=0 || password.length()<=0){
                    Toast.makeText(LoginActivity.this, "Username o Password errati", Toast.LENGTH_SHORT).show();
                }else{

                }



                Toast.makeText(LoginActivity.this, "btnAccedi", Toast.LENGTH_SHORT).show();
                Intent accediIntent=new Intent(LoginActivity.this, AccountActivity.class);
                startActivity(accediIntent);
            }
        });
        
    }
}