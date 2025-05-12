package com.ifsc.contaclicks;

import android.graphics.Insets;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        TextView tv =findViewById(R.id.textView2);
        tv.setText(b.get("nome").toString());

    }

}
