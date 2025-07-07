package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivityB extends AppCompatActivity {

    TextView imcR;
    TextView nome;
    TextView nR;

    TextView altR;

    TextView pesoR;

    ImageView imgIMC;

    double imcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_b);
        Bundle bundle = getIntent().getExtras();

        String result = bundle.getString("IMC");

        imcR= findViewById(R.id.textView);

        imcR.setText(result);

        String nome = bundle.getString("Nome");

        nR= findViewById(R.id.txtNomeR);


        nR.setText(nome);

        pesoR=findViewById(R.id.txtPseoBR);
        String peso = bundle.getString("Peso");

        pesoR.setText(peso);

        String altura = bundle.getString("Altura");

        altR = findViewById(R.id.txtAlturaBR);

        altR.setText(altura);


  imgIMC = findViewById(R.id.imgIMC);
        imcc = Double.parseDouble(result);

                if(imcc < 18.5) {

            imgIMC.setImageResource(R.drawable.abaixopeso);

        }
                   if(imcc>= 18.5 && imcc < 24.9) {

            imgIMC.setImageResource(R.drawable.obesidade1);

        }
                    if(imcc >= 25 && imcc< 29.9) {

            imgIMC.setImageResource(R.drawable.sobrepeso);

        }
               if(imcc >= 30 && imcc < 34.9) {

            imgIMC.setImageResource(R.drawable.obesidade1);

        }
                   if(imcc >= 35 && imcc < 39.9) {

            imgIMC.setImageResource(R.drawable.obesidade2);

        }

                   if(imcc >= 40) {

            imgIMC.setImageResource(R.drawable.obesidade3);

        }

    }
}