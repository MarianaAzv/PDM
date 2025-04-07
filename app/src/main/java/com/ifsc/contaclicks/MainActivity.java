package com.ifsc.contaclicks;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageView imageView;

Integer[] imagens = new Integer[] { R.drawable.cachorro,  R.drawable.gardem, R.drawable.happy,R.drawable.patinho};
    Button buttonNextImage,buttonCacular;
    int posicao =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("ciclo de vida", "metodo onCreate");
         setContentView(R.layout.activity_main);

        buttonNextImage = findViewById(R.id.button2);
        imageView=findViewById(R.id.imageView);


        buttonNextImage.setOnClickListener(v->{
            imageView.setImageResource(imagens[posicao]);
            if(posicao < imagens.length -1){
                posicao++;
            } else {
                posicao= 0;
            }
        });





        }

}
