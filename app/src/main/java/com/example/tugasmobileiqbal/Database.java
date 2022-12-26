package com.example.tugasmobileiqbal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    public static final String DB_NAME = "db_iqbal.db";
    public static final String TB_NAME = "tb_iqbal";
    public static final String COL_1 = "id";
    public static final String COL_2 = "visi";
    public static final String COL_3 = "misi";

    // Konstraktornya
    public Database(Context context){super(context,DB_NAME, null, 1);}


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + TB_NAME + "("+COL_1 + "int primary key, " + COL_2 + "text not null, " + COL_3 +" text not null);";
        sqLiteDatabase.execSQL(sql);
        String query = "INSERT INTO " + TB_NAME + "("+COL_1+", "+COL_2+", "+COL_3+") VALUES ('1', 'Ini adalah visi', 'Ini adalah Misi')";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
