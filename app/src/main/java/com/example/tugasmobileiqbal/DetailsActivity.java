package com.example.tugasmobileiqbal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView visi, misi;
    private Database SQLite = new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        visi = findViewById(R.id.visi);
        misi = findViewById(R.id.misi);

        getDatabase();
    }

    private void getDatabase() {
        try {
            SQLiteDatabase db = SQLite.getReadableDatabase();
            Cursor c = db.rawQuery("select * from tb_iqbal", null);
            c.moveToFirst();
            visi.setText(String.valueOf(c.getString(0)));
            misi.setText(String.valueOf(c.getString(1)));
            db.close();
        }catch (Exception e){
            Log.e("Err : ", e.getMessage());
        }
    }
}