package it.rizzoli.progettoescursioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            public void onClick(View view) {
<<<<<<< HEAD
                Toast.makeText(RecuperopasswordActivity.this, "btnConferma", Toast.LENGTH_LONG).show();
                Intent confermaIntent= new Intent(RecuperopasswordActivity.this, AccountActivity.class);
                startActivity(confermaIntent);

            }
        });
    }
    //public
=======
                Toast.makeText(RecuperopasswordActivity.this, "btnConferma", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(RecuperopasswordActivity.this,ConfermaActivity.class);
                startActivity(intent);
            }
        });
    }

>>>>>>> 7856e4f92ab178fe00966264fe13c0fe2f7fe6c9
}