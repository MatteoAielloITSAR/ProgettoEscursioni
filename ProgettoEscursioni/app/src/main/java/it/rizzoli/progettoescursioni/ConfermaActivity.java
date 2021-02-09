package it.rizzoli.progettoescursioni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConfermaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperopassword);

        EditText etCode = findViewById(R.id.etCode);
        TextView twCode = findViewById(R.id.twCode);
        Button btnCodeconfirm = findViewById(R.id.btnCodeconfirm);

        btnCodeconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConfermaActivity.this, "btnCodeconfirm", Toast.LENGTH_LONG).show();
                Intent confermatoIntent= new Intent(ConfermaActivity.this, AccountActivity.class);
                startActivity(confermatoIntent);

            }
        });
    }
}