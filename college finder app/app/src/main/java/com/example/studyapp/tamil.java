package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tamil extends AppCompatActivity {
    Button clicked;
    Button clicked2;
    Button clicked3;
    Button clicked4;
    Button clicked5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil);

        clicked=findViewById(R.id.technology7);
        clicked2=findViewById(R.id.law7);
        clicked3=findViewById(R.id.arts7);
        clicked4=findViewById(R.id.science7);
        clicked5=findViewById(R.id.commerce7);


        clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/btech-courses?state_id=18");

            }
        });
        clicked2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/llb-courses?state_id=18");

            }
        });
        clicked3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/ba-courses?state_id=18");

            }
        });
        clicked4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/bsc-courses?state_id=18");

            }
        });
        clicked5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/bcom-courses?state_id=18");

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
