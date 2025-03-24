package com.ifsc.contaclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//Nao reconheceu a classe = ultimo carater + ctrol + tecla do espaço

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
int i=0;
EditText edpeso,edaltura;

TextView tvresultadoimc;

Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
          tvresultadoimc.setText(Double.toString(IMC));


        });
    }

}
