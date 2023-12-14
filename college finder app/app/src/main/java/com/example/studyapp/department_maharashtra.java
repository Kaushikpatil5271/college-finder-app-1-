package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class department_maharashtra extends AppCompatActivity {

    Button clicked;
    Button clicked2;
    Button clicked3;
    Button clicked4;
    Button clicked5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_maharashtra);

        clicked=findViewById(R.id.technology);
        clicked2=findViewById(R.id.law);
        clicked3=findViewById(R.id.arts);
        clicked4=findViewById(R.id.science);
        clicked5=findViewById(R.id.commerce);


        clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(department_maharashtra.this, technology.class);
                startActivity(k);

            }
        });
        clicked2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/llb-courses?state_id=21");

            }
        });
        clicked3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/ba-courses?state_id=21");

            }
        });
        clicked4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/bsc-courses?state_id=21");

            }
        });
        clicked5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/bcom-courses?state_id=21");

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
