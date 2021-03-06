package com.example.onclickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView txtName;
    TextView txtPassword;
    TextView RecvText;
    private String  password;
    private String name;
    private String Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD);
        Text = intent.getStringExtra(MainActivity.TEXT_EXTRA);

        // capture the layout's TextView and set the string as its text
        txtName = findViewById(R.id.txtView);
        txtPassword = findViewById(R.id.txtPassword);
        RecvText = findViewById(R.id.receiveText);
        txtName.setText(name);
        txtPassword.setText(password);
        RecvText.setText(Text);

    }
}