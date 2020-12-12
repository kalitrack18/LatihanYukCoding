package com.example.onclickbuttonii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tvName, tvJenisKelamin;
    Button btnBack;
    private String name;
    private String JenisKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        Intent intent = getIntent();

         name = intent.getStringExtra(MainActivity.EXTRA_NAME);
         JenisKel = intent.getStringExtra(MainActivity.EXTRA_JENKEL);

        tvName = findViewById(R.id.txtViewName);
        tvJenisKelamin = findViewById(R.id.txtViewJenisKelamin);

        tvName.setText(name);
        tvJenisKelamin.setText(JenisKel);

        btnBack =findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Activity2.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}