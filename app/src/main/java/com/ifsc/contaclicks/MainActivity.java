package com.ifsc.contaclicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
int i=0;
String[] nomes = new String[] {"Mercurio","Venus","Terra","Marte","Jupter","Saturno","Urano","Netuno"};
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

//Recuperar Listview
        lv= findViewById(R.id.Listview);
        //Adaptador
        ArrayAdapter<String> arrayAdapterPlanetas = new ArrayAdapter(
                //this(ActivityMain),fxml,(dentro
                this,
                //android.R.layout.simple_list_item_1,
                R.layout.item_lista,
                R.id.textView,
                //android.R.id.text1,
                nomes);

lv.setAdapter(arrayAdapterPlanetas);
lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(getApplicationContext(),
                PlanetaMain.class);

        i.putExtra("nome",nomes[position]);

        startActivity(i);
    }
});



        }

}
