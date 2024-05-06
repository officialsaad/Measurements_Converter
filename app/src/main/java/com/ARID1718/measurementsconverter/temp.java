package com.ARID1718.measurementsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class temp extends AppCompatActivity {
    Spinner s1;
    String string1, string2;
    EditText e1;
    TextView e2;
    Button b1,b2;
    float v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        s1=findViewById(R.id.sp11);
        e1 = findViewById(R.id.et11);
        b1 = findViewById(R.id.bt1);
        e2 = findViewById(R.id.tx1);
        b2=findViewById(R.id.bt2);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s = s1.getSelectedItem().toString().trim();
                string1 = e1.getText().toString().trim();

                // Check if the input is a valid integer
                if (!string1.isEmpty() && string1.matches("\\d+")) {
                    v1 = Integer.parseInt(string1);

                    if (s.equals("F")) {
                        v2 = (v1 * 9 / 5) + 32;

                        string2 = String.valueOf(v2);
                        e2.setText("Fahrenheit : "+string2);
                    } else {
                        v2 = (v1 - 32) * 5 / 9;
                        string2 = String.valueOf(v2);
                        e2.setText(string2);
                        e2.setText("Celsius : "+string2);
                    }
                } else {
                    // Display a toast if the input is not a valid integer
                    Toast.makeText(temp.this, "Please enter a valid integer", Toast.LENGTH_SHORT).show();
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(temp.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}