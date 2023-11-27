package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.database.AppDatabase;
import com.example.myapplication.database.entitas.Mahasiswa;

public class TambahActivity extends AppCompatActivity {

    EditText etNama,etNPM;
    Button btnSimpan;
    AppDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        etNama = findViewById(R.id.etNama);
        etNPM = findViewById(R.id.etNPM);
        btnSimpan = findViewById(R.id.btnSave);
        database = AppDatabase.getInstance(getApplicationContext());

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.fullName = etNama.getText().toString();
                mahasiswa.npm = etNPM.getText().toString();
                database.mahasiswaDao().insertAll(mahasiswa);
                finish();
            }
        });
    }
}