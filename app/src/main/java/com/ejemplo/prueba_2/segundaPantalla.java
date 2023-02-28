package com.ejemplo.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaPantalla extends AppCompatActivity {


    public float l1;

    public float l2;

    public float resultado;

    TextView Datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        l1 = getIntent().getFloatExtra("lado1",0);
        l2 = getIntent().getFloatExtra("lado2",0);
        resultado = getIntent().getFloatExtra("resultado",0);
        publicarDatos(resultado,l1,l2);


    }

    public void publicarDatos(float correo, float l1, float l2 ){
        Datos = findViewById(R.id.txt1);
        Datos.setText("los datos obtenidos son: " + resultado + l1 + l2);



    }

}