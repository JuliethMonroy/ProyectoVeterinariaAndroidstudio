package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfilActivity extends AppCompatActivity {

    private Button evolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        evolver = evolver = findViewById(R.id.btnperfil);


        evolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(perfilActivity.this, InicioActivity.class);
                startActivity(intent);

            }
        });

    }
}

