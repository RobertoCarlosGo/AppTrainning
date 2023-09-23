package com.example.apptrainning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewPassword1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password1);

        Button btncode = findViewById(R.id.codebtn);
        btncode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    // Crea un Intent para abrir la nueva actividad
                    Intent intent = new Intent(getApplicationContext(), NewPassword2.class);

                    // Inicia la nueva actividad
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                    // Agrega aquí el código para manejar la excepción, por ejemplo, mostrar un mensaje de error
                }
            }
        });
    }


}