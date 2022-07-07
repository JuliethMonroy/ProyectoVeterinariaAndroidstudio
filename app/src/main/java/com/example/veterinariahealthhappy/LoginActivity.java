package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.veterinariahealthhappy.bd.DbHelper;
import com.example.veterinariahealthhappy.bd.DbUsuarios;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario, txtContraseña;
    Button btnIniciarsesion;
    DbUsuarios DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);
        btnIniciarsesion = findViewById(R.id.btnIniciarsesion);
        DB = new DbUsuarios(this);

        btnIniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usua = txtUsuario.getText().toString();
                String pass = txtContraseña.getText().toString();

                if (TextUtils.isEmpty(usua) || TextUtils.isEmpty(pass))
                    Toast.makeText(LoginActivity.this, "Bienvenido!", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkusuariocontraseña =DB.checkusuariocontraseña(usua, pass);
                    if (checkusuariocontraseña==true){
                        Toast.makeText(LoginActivity.this, "BIENVENIDO!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),InicioActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this, "Credenciales Incorectas", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}