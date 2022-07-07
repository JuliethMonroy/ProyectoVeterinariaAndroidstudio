package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class medicosActivity extends AppCompatActivity {

    private Button eregresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicos);

        eregresar = eregresar= findViewById(R.id.btnregresar);

        eregresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medicosActivity .this, serviciosActivity.class);
                startActivity(intent);

            }
        });

    }
}
