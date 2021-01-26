package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

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
        TextView twUsername = findViewById(R.id.twUsername);
        TextView twPassword = findViewById(R.id.twPassword);
        Button btnRegistrati = findViewById(R.id.btnRegistrati);
        Button btnRecuperaPassword = findViewById(R.id.btnRecuperaPassword);
        Button btnAccedi = findViewById(R.id.btnAccedi);

        btnRegistrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "btnRegistrati", Toast.LENGTH_SHORT).show();
            }
        });

        btnRecuperaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "btnRecuperaPassword", Toast.LENGTH_SHORT).show();
            }
        });

        btnAccedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "btnAccedi", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}