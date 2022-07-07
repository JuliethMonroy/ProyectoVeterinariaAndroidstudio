package com.example.veterinariahealthhappy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class serviciosActivity extends AppCompatActivity {

    private Button eveterinario;


    ImageButton ImageButton4, ImageButton5,ImageButton6,ImageButton7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        ImageButton4= (ImageButton) findViewById(R.id.btn4);
        ImageButton5 = (ImageButton) findViewById(R.id.btn5);
        ImageButton6 = (ImageButton) findViewById(R.id.btn6);
        ImageButton7 = (ImageButton) findViewById(R.id.btn7);

        eveterinario = eveterinario = findViewById(R.id.btnveterinario);

        ImageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(serviciosActivity.this, medicosActivity.class);
                startActivity(intent);

            }
        });


        ImageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(serviciosActivity.this, AgendarActivity.class);
                startActivity(intent);

            }
        });

        ImageButton7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(serviciosActivity.this, EmergenciasActivity.class);
                startActivity(intent);

            }
        });

        eveterinario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(serviciosActivity.this, InicioActivity.class);
                startActivity(intent);

            }
        });


        ImageButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(serviciosActivity.this, UbicarveterinariasActivity.class);
                startActivity(intent);

            }
        });
    }

}
