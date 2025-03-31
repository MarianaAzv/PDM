package com.ifsc.contaclicks;

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
            //calcular o IMC
            double peso,altura,IMC;

            peso = Double.parseDouble(edpeso.getText().toString());
            altura = Double.parseDouble(edaltura.getText().toString());


           IMC = peso /(altura*altura);
           //Formatando numero ##,##
            DecimalFormat decimalFormat = new DecimalFormat("##,##");


          tvresultadoimc.setText(decimalFormat.format(IMC));


        });


    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Ciclo de vida","metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de vida","metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de vida","metodo onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de vida","metodo onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de vida","metodo onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo de vida","metodo onDestroy");
    }
}
