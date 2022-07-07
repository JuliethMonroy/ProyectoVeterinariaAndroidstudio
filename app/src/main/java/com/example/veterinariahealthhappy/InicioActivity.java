package com.example.veterinariahealthhappy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    android.widget.ImageButton ImageButton, ImageButton1,ImageButton2,ImageButton3;

    private Button eSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageButton = (ImageButton) findViewById(R.id.btn);
        ImageButton1 = (ImageButton) findViewById(R.id.btn1);
        ImageButton2 = (ImageButton) findViewById(R.id.btn2);
        ImageButton3 = (ImageButton) findViewById(R.id.btn3);
        eSalir=(Button) findViewById(R.id.btnSalir);

        ImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, perfilActivity.class);
                startActivity(intent);

            }
        });
        ImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, serviciosActivity.class);
                startActivity(intent);


            }
        });
        ImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, mascotasActivity.class);
                startActivity(intent);

            }
        });

        ImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, veterinarioActivity.class);
                startActivity(intent);



            }
        });
        eSalir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}