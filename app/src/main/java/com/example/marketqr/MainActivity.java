package com.example.marketqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    EditText edt_usuario, edt_contrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = (Button) findViewById(R.id.login);
        edt_usuario = (EditText) findViewById(R.id.usuario);
        edt_contrasenia = (EditText) findViewById(R.id.contrasenia);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = "raul", contrasenia="1234";
                if (edt_usuario.getText().toString().equals(usuario) && edt_contrasenia.getText().toString().equals(contrasenia)){
                    startActivity(new Intent(MainActivity.this, bottomNavigation.class));
                }else{
                    if (edt_usuario.getText().toString().equals(usuario) == false){
                        Toast.makeText(getApplicationContext(), "Usuario incorrecto",Toast.LENGTH_SHORT).show();
                    }else if (edt_contrasenia.getText().toString().equals(contrasenia) == false){
                        Toast.makeText(getApplicationContext(), "Contraseña incorrecto",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}

