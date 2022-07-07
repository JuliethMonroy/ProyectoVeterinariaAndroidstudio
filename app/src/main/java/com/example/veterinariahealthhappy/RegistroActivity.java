package com.example.veterinariahealthhappy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.veterinariahealthhappy.bd.DbUsuarios;

public class RegistroActivity extends AppCompatActivity {

    EditText txtIdentidad, txtTipoUser, txtNombre, txtEdad, txtTipoA, txtRaza, txtEmail,txtUsuario,txtContraseña;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtIdentidad = findViewById(R.id.txtIdentidad);
        txtTipoUser = findViewById(R.id.txtTipoUser);
        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtTipoA = findViewById(R.id.txtTipoA);
        txtRaza = findViewById(R.id.txtRaza);
        txtEmail = findViewById(R.id.txtEmail);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);

        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbUsuarios dbUsuarios = new DbUsuarios(RegistroActivity.this);
                long id = dbUsuarios.insertarUsuario(txtIdentidad.getText().toString(), txtTipoUser.getText().toString(), txtNombre.getText().toString(), txtEdad.getText().toString(), txtTipoA.getText().toString(), txtRaza.getText().toString(), txtEmail.getText().toString(), txtUsuario.getText().toString(),txtContraseña.getText().toString());

                if (id > 0){
                    Toast.makeText(RegistroActivity.this, "REGISTRADO", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(RegistroActivity.this, "ERROR AL REGISTRARSE", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
    private void limpiar(){
        txtIdentidad.setText("");
        txtTipoUser.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTipoA.setText("");
        txtRaza.setText("");
        txtEmail.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
    }
}