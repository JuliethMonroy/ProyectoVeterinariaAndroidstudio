package com.example.veterinariahealthhappy.bd;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NOMBRE = "veterinaria.db";
    public static final String TABLE_USUARIOS = "t_usuarios";
    public static final String TABLE_VETERINARIOS = "t_veterinarios";
    public static final String TABLE_AGENDAR = "t_agendar";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_USUARIOS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "tipoUser TEXT NOT NULL," +
                "nombre TEXT NOT NULL," +
                "edad TEXT NOT NULL," +
                "tipoA TEXT NOT NULL," +
                "raza TEXT NOT NULL," +
                "email TEXT NOT NULL," +
                "usuario TEXT NOT NULL," +
                "contraseña TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_VETERINARIOS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreVeterinaria TEXT NOT NULL," +
                "nombreVeterinario TEXT NOT NULL," +
                "direccion TEXT NOT NULL," +
                "cuidadMunicipio TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_AGENDAR + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "horaReserva TEXT NOT NULL," +
                "tipoMascota TEXT NOT NULL," +
                "tipoConsulta TEXT NOT NULL," +
                "motivoConsulta TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_USUARIOS);
        onCreate(sqLiteDatabase);

    }

}
