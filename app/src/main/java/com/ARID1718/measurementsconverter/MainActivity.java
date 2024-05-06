package com.ARID1718.measurementsconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.bt1);
        b2 =findViewById(R.id.bt2);
        b3= findViewById(R.id.bt3);
        b4= findViewById(R.id.bt4);

        b1.setOnClickListener(v -> {

            Intent intent1=new Intent(getApplicationContext(),temp.class);
            startActivity(intent1);
            finish();

        });


        b2.setOnClickListener(v -> {
            Intent intent1=new Intent(getApplicationContext(),kms.class);
            startActivity(intent1);
            finish();


        });
        b3.setOnClickListener(v -> finishAffinity());
        b4.setOnClickListener(v -> {
            Intent intent1=new Intent(getApplicationContext(), inches.class);
            startActivity(intent1);
            finish();

        });
    }
}