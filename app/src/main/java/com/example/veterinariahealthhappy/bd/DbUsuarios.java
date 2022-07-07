package com.example.veterinariahealthhappy.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.veterinariahealthhappy.bd.DbHelper;

import androidx.annotation.Nullable;

public class DbUsuarios extends DbHelper{

    Context context;

    public DbUsuarios(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarUsuario(String user, String tipoUser, String nombre, String edad, String tipoA, String raza, String email, String usuario, String contraseña){

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("tipoUser", tipoUser);
            values.put("nombre", nombre);
            values.put("edad", edad);
            values.put("tipoA", tipoA);
            values.put("raza", raza);
            values.put("email", email);
            values.put("usuario", usuario);
            values.put("contraseña", contraseña);

            id = db.insert(TABLE_USUARIOS, null, values);
        }catch (Exception ex) {
            ex.toString();
        }

        return id;
    }

    public boolean checkUsaurio (String txtUsuario){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from t_usuarios where usuario=?", new String[] {txtUsuario});
    if(cursor.getCount()>0)
        return true;
    else
        return false;
}

    public boolean checkusuariocontraseña (String txtUsuario, String txtContraseña) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from t_usuarios where usuario=? and contraseña=?", new String[] {txtUsuario, txtContraseña});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
