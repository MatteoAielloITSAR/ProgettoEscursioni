package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RecuperopasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperopassword);

        EditText etEmail = findViewById(R.id.etEmail);
        TextView twEmail = findViewById(R.id.twEmail);
        Button btnConferma = findViewById(R.id.btnConferma);

        btnConferma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecuperopasswordActivity.this, "btnConferma", Toast.LENGTH_SHORT).show();
            }
        });
    }
}