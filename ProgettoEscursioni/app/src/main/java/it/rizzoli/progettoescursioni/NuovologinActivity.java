package it.rizzoli.progettoescursioni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NuovologinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuovologin);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        TextView twUsername = findViewById(R.id.twUsername);
        TextView twPassword = findViewById(R.id.twPassword);
        Button btnAccedi = findViewById(R.id.btnAccedi);

        btnAccedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(NuovologinActivity.this,AccountActivity.class);
                startActivity(accountIntent);
                Toast.makeText(NuovologinActivity.this, "btnAccedi", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}