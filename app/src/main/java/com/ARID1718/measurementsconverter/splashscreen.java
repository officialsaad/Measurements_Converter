package com.ARID1718.measurementsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class splashscreen extends AppCompatActivity {

    ProgressBar p1;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        p1 =findViewById(R.id.progressBar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                count +=1;
                if (count>= 100){
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else {
                    p1.setProgress(count);
                    // Recursive call to update progress until counter reaches 100
                    new Handler().postDelayed(this, 50); // Adjust delay as needed
                }
            }
        },2000);
    }
}