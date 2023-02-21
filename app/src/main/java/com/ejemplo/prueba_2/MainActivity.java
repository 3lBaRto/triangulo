package com.ejemplo.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy oncreate");
        sideOne =findViewById(R.id.sideone);
        sideTwo =findViewById(R.id.sidetwo);
        Result =findViewById(R.id.txtResult);
        Calculate =findViewById(R.id.calculate);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Estoy  onstart");
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sideone = Float.parseFloat(sideOne.getText().toString());
                float sidetwo =Float.parseFloat(sideTwo.getText().toString());
                float result = sideone*sidetwo;
                Result.setText(String.valueOf(result));
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
}