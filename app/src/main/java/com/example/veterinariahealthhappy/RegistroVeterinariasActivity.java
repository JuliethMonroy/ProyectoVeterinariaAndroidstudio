package com.example.veterinariahealthhappy;

import static android.widget.ImageButton.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class RegistroVeterinariasActivity extends AppCompatActivity {

    private ImageButton edevolver;

    EditText textveterinaria;
    EditText textveterinarioacargo;
    EditText textDireccion;
    EditText txtciudadmunicipio;
    Button btnregistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_veterinarias);

        edevolver = (ImageButton) findViewById(R.id.btndevolver);

        edevolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroVeterinariasActivity.this, InicioActivity.class);
                startActivity(intent);

            }
        });
    }
}

