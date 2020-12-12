package com.example.onclickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ValidasiActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat,edtJenisKelamin;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi);

        edtNama = findViewById(R.id.edtNama);
        edtAlamat = findViewById(R.id.edtAlamat);
        edtJenisKelamin = findViewById(R.id.edtJenisKelamin);

        btnSimpan = findViewById(R.id.btnSimpan);

        validasi();
    }

    private void validasi() {
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() || edtAlamat.getText().toString().isEmpty() || edtJenisKelamin.getText().toString().isEmpty()){
                    Toast.makeText(ValidasiActivity.this, "Maaf data harus di isi", Toast.LENGTH_SHORT).show();
                }else   {
                    String nama = edtNama.getText().toString();
                    String alamat = edtAlamat.getText().toString();
                    String jenisKelamin = edtJenisKelamin.getText().toString();

                    Toast.makeText(ValidasiActivity.this, " Hasil Inputan adalah :   Nama = " + nama + " Alamat = "
                            + alamat + " Jenis Kelamin = " + jenisKelamin, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}