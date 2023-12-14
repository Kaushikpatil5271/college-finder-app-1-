package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnLogin;
        EditText edtEmail, edtPass;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.buttonLogin);
        edtEmail = findViewById(R.id.editEmail);
        edtPass = findViewById(R.id.editPass);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();

                if (email.equals("")) {
                    edtEmail.setError("Please enter an email");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    edtEmail.setError("Please enter a valid email");
                } else if (pass.equals("")) {
                    edtPass.setError("Please enter a password");
                } else {
                    Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, FirstPage.class);
                    startActivity(intent);
                }


            }
        });

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}