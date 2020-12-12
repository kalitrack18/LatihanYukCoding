package com.example.onclickbuttonii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "Nama";
    public static final String EXTRA_JENKEL = "Kelamin";

    EditText TextName, TextJenisKel;
    Button sendAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextName = findViewById(R.id.edtNama);
        TextJenisKel = findViewById(R.id.edtJenisKelamin);
        sendAct = findViewById(R.id.btnMove);
        sendAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                String name = TextName.getText().toString();
                String JenisKelamin = TextJenisKel.getText().toString();
                intent.putExtra(EXTRA_NAME, name);
                intent.putExtra(EXTRA_JENKEL,JenisKelamin);
                startActivity(intent);
            }
        });
    }
}