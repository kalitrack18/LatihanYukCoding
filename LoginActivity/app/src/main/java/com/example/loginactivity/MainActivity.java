package com.example.loginactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        loginLogic();
    }

    private void initView() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnPassword);
    }

    private void loginLogic() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edtUsername.getText().toString();
                String Passwd = edtPassword.getText().toString();

                if (userName.isEmpty()) {
                    edtUsername.setError("Data tidak bisa kosong");
                } else if (Passwd.isEmpty()) {
                    edtPassword.setError("Data tidak boleh kosong");
                } else {
                    if (userName.equals("admin") && Passwd.equals("black")) {
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();

                        showAlertDialog();

                    }
                }
            }
        });

    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);


        // set tittle dialog
        alertDialog.setTitle("Login Ulang ? ");

        alertDialog
                .setMessage("Klik Ya untuk Login Ulang")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });

        AlertDialog alertDialog1 = alertDialog.create();

        alertDialog1.show();


    }

}