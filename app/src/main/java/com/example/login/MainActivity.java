package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Bundle extras = getIntent().getExtras();
            Usuario user = extras.getParcelable("user");
            Snackbar msm = Snackbar.make
                    (findViewById(R.id.myCoordinatorLayout),user.getNombre()+"-"+user.getTelefono()+"-"+user.getCorreo()+"-"+user.getContraseña()
                            ,BaseTransientBottomBar.LENGTH_LONG);

            if (!user.getNombre().equals("")&&!user.getCorreo().equals("")&&!user.getContraseña().equals("")){
                msm.show();
            }
        }catch (Exception e){
        }
    }

    public void btnRegistrar(View view) {
        Intent intent = new Intent(getApplicationContext(),RegistrarActivity.class);
        startActivity(intent);
    }
}