package com.ifsc.contaclicks;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//Nao reconheceu a classe = ultimo carater + ctrol + tecla do espaço

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
int i=0;
EditText edpeso,edaltura;

TextView tvresultadoimc;

Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Ciclo de vida","metodo onCreate");

        setContentView(R.layout.activity_main);
        edpeso = findViewById(R.id.edpeso);
        edaltura = findViewById(R.id.edaltura);
        tvresultadoimc = findViewById(R.id.tvresultadoimc);
        buttonCalcular = findViewById(R.id.button);
        //define um tratamento para o click no botao

        buttonCalcular.setOnClickListener(v ->{


            Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
            String msg = edpeso.getText().toString();
            intent.putExtra("mesagem",msg);
            startActivity(intent);

        });


    }


}
