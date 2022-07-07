package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class mascotasActivity extends AppCompatActivity {

    private Button evolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        evolver = evolver = findViewById(R.id.btnvolver);


        evolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mascotasActivity.this,serviciosActivity.class);
                startActivity(intent);

            }
        });

    }
}