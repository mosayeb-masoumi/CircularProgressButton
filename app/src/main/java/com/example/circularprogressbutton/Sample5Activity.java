package com.example.circularprogressbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dd.CircularProgressButton;

public class Sample5Activity extends AppCompatActivity {

    boolean a = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample5);

        final CircularProgressButton circularButton1 = findViewById(R.id.circularButton1);
        circularButton1.setIndeterminateProgressMode(true);
        circularButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (circularButton1.getProgress() == 0) {
                    circularButton1.setProgress(50);
                } else if (circularButton1.getProgress() == 100) {
                    circularButton1.setProgress(0);
                } else {
                    circularButton1.setProgress(100);
                }
            }
        });

        final CircularProgressButton circularButton2 = findViewById(R.id.circularButton2);
        circularButton2.setIndeterminateProgressMode(true);
        circularButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (circularButton2.getProgress() == 0) {
                    circularButton2.setProgress(50);
                } else if (circularButton2.getProgress() == -1) {
                    circularButton2.setProgress(0);
                } else {
                    circularButton2.setProgress(-1);
                }
            }
        });




        final CircularProgressButton circularButton3 = findViewById(R.id.circularButton3);
        circularButton3.setIndeterminateProgressMode(true);
        circularButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (circularButton3.getProgress() == 0 && a) {
                    // 50 = circulare
                    // 0 = initial state
                    // 100== complete
                    // -1 == error
                    circularButton3.setProgress(50);
                    circularButton3.setProgress(100);

                } else if (circularButton3.getProgress() == 0 && !a) {
                    circularButton3.setProgress(50);
                    circularButton3.setProgress(-1);
                }
//                else {
//                    circularButton3.setProgress(-1);
//                }
            }
        });
    }
}
