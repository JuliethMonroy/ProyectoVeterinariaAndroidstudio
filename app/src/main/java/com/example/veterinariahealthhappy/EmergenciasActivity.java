package com.example.veterinariahealthhappy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class EmergenciasActivity extends AppCompatActivity {

    private Button ebutton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencias);

        ebutton2 = ebutton2= findViewById(R.id.button2);

        ebutton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergenciasActivity .this, serviciosActivity.class);
                startActivity(intent);

            }
        });

    }
}