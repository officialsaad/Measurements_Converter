package com.ARID1718.measurementsconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class inches extends AppCompatActivity {
    Button b1, b2;
    Spinner sp1;
    EditText ed1;
    TextView tx1, tx2;
    String string1, string2;
    float v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches);

        sp1 = findViewById(R.id.sp11);
        ed1 = findViewById(R.id.et11);
        b1 = findViewById(R.id.bt11);
        tx2 = findViewById(R.id.ml22);
        tx1 = findViewById(R.id.km11);
        b2 = findViewById(R.id.btn22);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = sp1.getSelectedItem().toString().trim();
                string1 = ed1.getText().toString().trim();

                // Check if the input is a valid integer
                if (!string1.isEmpty() && string1.matches("\\d+")) {
                    v1 = Integer.parseInt(string1);

                    if (s.equals("inc")) {
                        v2 = v1 * 0.03937f;
                        string2 = String.valueOf(v2);
                        tx1.setText(string2);
                        tx2.setText("0");
                    } else {
                        v2 = v1 * 25.4f;
                        string2 = String.valueOf(v2);

                        tx2.setText(string2);
                        tx1.setText("0");
                    }
                } else {
                    // Display a toast if the input is not a valid integer
                    Toast.makeText(inches.this, "Please enter a valid integer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(inches.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
