package com.example.studyapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {
    private Button apradesh, assam, bihar ,jammu , maharashtra
            , tamil , goa , karnataka , kerala , uttar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_first_page);
        getSupportActionBar().hide();

        ImageView logouticon = findViewById(R.id.logout);
        logouticon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstPage.this);

                builder.setTitle(R.string.logout);
                builder.setMessage(R.string.message);

                builder.setPositiveButton("LOGOUT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(FirstPage.this, "Logout Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(FirstPage.this,Login.class);
                        startActivity(intent);
                    }
                });

                builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog dialog = builder.show();
            }
        });

        TextView title = findViewById(R.id.toolbar_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstPage.this,FirstPage.class);
                startActivity(intent);
            }
        });


        apradesh = (Button) findViewById(R.id.apradesh);
        apradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        assam = (Button) findViewById(R.id.asam);
        assam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        bihar = (Button) findViewById(R.id.bihar);
        bihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        jammu = (Button) findViewById(R.id.jammu);
        jammu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        maharashtra = (Button) findViewById(R.id.maharashtra);
        maharashtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });

        tamil = (Button) findViewById(R.id.tamil);
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

        goa = (Button) findViewById(R.id.goa);
        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });

        karnataka = (Button) findViewById(R.id.karnataka);
        karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        });

        kerala = (Button) findViewById(R.id.kerala);
        kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });

        uttar = (Button) findViewById(R.id.uttar);
        uttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });


    }


    private void openActivity2() {
        Intent intent = new Intent(this, dept_last.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent = new Intent(this, assam.class);
        startActivity(intent);
    }
    private void openActivity4() {
        Intent intent = new Intent(this, bihar.class);
        startActivity(intent);
    }

    private void openActivity5() {
        Intent intent = new Intent(this, jammu.class);
        startActivity(intent);
    }

    private void openActivity6() {
        Intent intent = new Intent(this, department_maharashtra.class);
        startActivity(intent);
    }

    private void openActivity7() {
        Intent intent = new Intent(this, department_next.class);
        startActivity(intent);
    }

    private void openActivity8() {
        Intent intent = new Intent(this, goa.class);
        startActivity(intent);
    }

    private void openActivity9() {
        Intent intent = new Intent(this,karnataka.class);
        startActivity(intent);
    }

    private void openActivity10() {
        Intent intent = new Intent(this, tamil.class);
        startActivity(intent);
    }
    private void openActivity11() {
        Intent intent = new Intent(this, up.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.exit);
        builder.setMessage(R.string.message);

        builder.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = builder.show();
    }
}