package com.example.tarealogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button irloginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        irloginButton = findViewById(R.id.irloginButton);

        /*loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Bienvenido!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"Datos incorrectos!", Toast.LENGTH_SHORT).show();
                }

            }
        });*/
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(miIntent);
    }

}