package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ContohSpinner extends AppCompatActivity {


    EditText tv_nama, address;
    String[] nama = {"S1-Ekonomi", "S1-Ilmu Pemerintahan", "S1-Hub.Internasional", "S1-Ilmu Komunikasi", "S1-Kewirausahaan", "S1-Sistem Informasi", "S1-Informatika", "S1-Tek. Informasi", "S1-Cyber Security"};
    Spinner spinnerNama;
    Button click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_spinner);



        initVariable();

        // buat variabel adapter
        ArrayAdapter adapter = new ArrayAdapter(ContohSpinner.this, android.R.layout.simple_spinner_item, nama);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNama.setAdapter(adapter);


    }

    private void initVariable() {
        tv_nama = findViewById(R.id.edtNama);
        address = findViewById(R.id.edtAlamat);
        spinnerNama = findViewById(R.id.spinnerJurusan);

        click = findViewById(R.id.tvClick);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String get_tv_nama = tv_nama.getText().toString();
                String get_address = address.getText().toString();
                String get_spinner = spinnerNama.getSelectedItem().toString();

                Toast.makeText(ContohSpinner.this, "Nama " + get_tv_nama + " Alamat : " + get_address + " Jurusan " + get_spinner , Toast.LENGTH_SHORT).show();

            }
        });

    }
}