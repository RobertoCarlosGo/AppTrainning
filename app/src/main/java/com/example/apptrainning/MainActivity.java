package com.example.apptrainning;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView imageView = findViewById(R.id.myImageView);
        //imageView.setImageResource(R.drawable.logo);

        setContentView(R.layout.activity_main);

        // Obtén una referencia al botón desde el diseño XML
        Button btnAbrirNuevaActividad = findViewById(R.id.loginbtn);

        // Programa el botón para abrir la nueva actividad
        btnAbrirNuevaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Crea un Intent para abrir la nueva actividad
                    Intent intent = new Intent(getApplicationContext(), Crear2.class);

                    // Inicia la nueva actividad
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                    // Agrega aquí el código para manejar la excepción, por ejemplo, mostrar un mensaje de error
                }
            }
        });

        Button btnLogin = findViewById(R.id.forgtpwbtn);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    // Crea un Intent para abrir la nueva actividad
                    Intent intent = new Intent(getApplicationContext(), NewPassword1.class);

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