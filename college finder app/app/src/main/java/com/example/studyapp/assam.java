package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class assam extends AppCompatActivity {
    Button clicked;
    Button clicked2;
    Button clicked3;
    Button clicked4;
    Button clicked5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);

        clicked=findViewById(R.id.technology12);
        clicked2=findViewById(R.id.law12);
        clicked3=findViewById(R.id.arts12);
        clicked4=findViewById(R.id.science12);
        clicked5=findViewById(R.id.commerce12);


        clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/btech/assam-colleges");

            }
        });
        clicked2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/law/assam-colleges");

            }
        });
        clicked3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/arts/assam-colleges");

            }
        });
        clicked4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/science/assam-colleges");

            }
        });
        clicked5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://collegedunia.com/commerce/assam-colleges");

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
