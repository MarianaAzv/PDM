package com.ifsc.contaclicks;

import android.graphics.Bitmap;
import android.graphics.Insets;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class PlanetaMain extends AppCompatActivity {
    TextView textView2;





    // protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main_b);
        //Bundle bundle=getIntent().getExtras();
        //String msg = bundle.getString("mensagem");

        //TextView textView =findViewById(R.id.textView);
        //textView.setText(msg);

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainb);

        Bundle b=getIntent().getExtras();
      //  b.get("nome");

        Planeta p = (Planeta) b.getSerializable("Planeta");


        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView2);


        imageView.setImageResource(p.imagem);
        textView.setText(p.nome);

       // TextView tv =findViewById(R.id.textView2);
     //   tv.setText(b.get("nome").toString());

    }

}
