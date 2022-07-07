package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class veterinarioActivity extends AppCompatActivity {


    private Button eservicios,eRegistraveterinario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinario);

        eservicios = eservicios = findViewById(R.id.btnservicios);
        eRegistraveterinario = eRegistraveterinario = findViewById(R.id.btnregistrarveterinario);

        eservicios.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(veterinarioActivity.this,InicioActivity.class);
                startActivity(intent);

            }
        });

        eRegistraveterinario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(veterinarioActivity.this, RegistroVeterinariasActivity.class);
                startActivity(intent);

            }
        });
    }
}