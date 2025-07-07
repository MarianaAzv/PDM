package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    EditText edPe,edAl, edN;
    TextView tvResultado;

    TextView txtIMC;
    Button button;


    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        txtIMC=findViewById(R.id.txtCalcularIMC);
        edPe=findViewById((R.id.editTxtPeso));
        edAl=findViewById(R.id.editTxtAltura);
        edN=findViewById(R.id.editTextNome);
        button=findViewById(R.id.button);
        img=findViewById(R.id.imageView);
        img.setImageResource(R.drawable.perfil);



        button.setOnClickListener(v ->{

            float peso,altura,imc;
            peso = Float.parseFloat(edPe.getText().toString());
            altura = Float.parseFloat(edAl.getText().toString());

            imc = (peso/(altura * altura));


            DecimalFormat decimalFormat = new DecimalFormat("##.##");



            Intent intent = new Intent(getApplicationContext(), MainActivityB.class);

            String resNome = edN.getText().toString();
            intent.putExtra("Nome",resNome);

            String restAltura = edAl.getText().toString();
            intent.putExtra("Altura",restAltura);

            String resPeso = edPe.getText().toString();
            intent.putExtra("Peso",resPeso);

            String resIMC = String.valueOf(imc);
            intent.putExtra("IMC",resIMC);

            startActivity(intent);
        });

    }

}