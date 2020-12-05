package com.example.onclickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Nama";
    public static final String EXTRA_PASSWORD = "Password";
    EditText Name;
    EditText txtpass;
    Button btnMain;
    TextView tvClick;
    TextView tvHere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.txtNama);
        txtpass = findViewById(R.id.txtPwd);
        tvClick = findViewById(R.id.tv_click);
        tvHere = findViewById(R.id.tv_here);
        btnMain = findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ambilNilaiEditext = Name.getText().toString();
                String ambilNilaiPassword = txtpass.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(EXTRA_MESSAGE, ambilNilaiEditext);
                intent.putExtra(EXTRA_PASSWORD, ambilNilaiPassword);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Berpindah Activity", Toast.LENGTH_SHORT).show();
            }
        });

        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ambilNilaiEditTExt = Name.getText().toString();
                tvHere.setText(ambilNilaiEditTExt);
                Toast.makeText(MainActivity.this, "Halo, " + ambilNilaiEditTExt, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

