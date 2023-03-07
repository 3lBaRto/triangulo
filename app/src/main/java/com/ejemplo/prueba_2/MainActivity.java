package com.ejemplo.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String TAG = "Depuracion";
    EditText sideOne,sideTwo;
    TextView Result;
    Button Calculate;

    Button AbrirG;

    Button Llamar;

    String phonenumber = "6043004411700";









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy oncreate");
        sideOne = findViewById(R.id.sideone);
        sideTwo = findViewById(R.id.sidetwo);
        Result = findViewById(R.id.txtResult);
        Calculate = findViewById(R.id.calculate);
        AbrirG = findViewById(R.id.agoogle);
        Llamar = findViewById(R.id.llamar);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Estoy  onstart");
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*float sideone = Float.parseFloat(sideOne.getText().toString());
                float sidetwo =Float.parseFloat(sideTwo.getText().toString());
                float result = sideone*sidetwo;
                Result.setText(String.valueOf(result));*/
                enviarDatos(view);
            }



        });
        AbrirG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton2(view);

            }
        });

        Llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamar(view);
            }


        });

    }




    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Estoy Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Estoy onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estoy  onDestroy");
    }

    /*
    // creo una funcion, con nombre gotoActivity2, es publica y no espera nada de respuesta
    // View es el tipo de dato(en este caso, un objeto que es la vista, por eso View
    //view es el nombre de ese objeto que recibe la funcion
    public void gotoActivity2(View view){
        String correo = "holamundo@gmail.com";
        Intent pasarDato = new Intent(this,segundaPantalla.class);
        pasarDato.putExtra("email",correo);
        startActivity(pasarDato);


    }*/
    public void enviarDatos(View view){
        float l1 = Float.parseFloat(sideOne.getText().toString());
        float l2 = Float.parseFloat(sideOne.getText().toString());
        float resultado = l1*l2;

        Intent pasarDato = new Intent(this,segundaPantalla.class);

        pasarDato.putExtra("lado1",l1);
        pasarDato.putExtra("lado2",l2);
        pasarDato.putExtra("resultado",resultado);

        startActivity(pasarDato);

    }

    public void boton2(View view) {
        Intent irAGoogle = new Intent(Intent.ACTION_VIEW);
        irAGoogle.setData(Uri.parse("https://www.google.com"));

        startActivity(irAGoogle);
    }

    public void llamar(View view) {
        Intent llamada = new Intent(Intent.ACTION_DIAL);
        llamada.setData(Uri.parse("tel: " + phonenumber));

        if(llamada.resolveActivity(getPackageManager())!=null)
        {
            startActivity(llamada);
        }
    }
}