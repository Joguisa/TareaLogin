package com.example.tarealogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        username.setImeOptions(EditorInfo.IME_ACTION_NEXT);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(LoginActivity.this,"Bienvenido!", Toast.LENGTH_SHORT).show();

                    Intent miIntent = new Intent(LoginActivity.this, InicioActivity.class);
                    startActivity(miIntent);
                } else {
                    Toast.makeText(LoginActivity.this,"Datos incorrectos!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}