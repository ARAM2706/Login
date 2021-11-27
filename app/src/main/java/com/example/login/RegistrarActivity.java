package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class RegistrarActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText telefono;
    private EditText mail;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
    }

    public void btnRegresar(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    public void btnGuardar(View view) {
        nombre = findViewById(R.id.inName);
        telefono = findViewById(R.id.inTel);
        mail = findViewById(R.id.inMail);
        pass = findViewById(R.id.inPass);
        if (telefono.getText().toString().matches("[0-9]+")){
            Usuario user = new Usuario
                    (nombre.getText().toString(),Integer.parseInt(telefono.getText().toString()),
                            mail.getText().toString(),pass.getText().toString());
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.putExtra("user",user);
            startActivity(intent);
        }


    }
}