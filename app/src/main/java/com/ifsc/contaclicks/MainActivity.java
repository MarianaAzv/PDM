package com.ifsc.contaclicks;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

 PackageManager  pm;

 List<ApplicationInfo> applicationInfosList;
 ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listView);
        pm=getPackageManager();

        applicationInfosList=pm.getInstalledApplications(PackageManager.MATCH_ALL);

        AppAdapter appAdapter = new AppAdapter(this,R.layout.app_item);
        lv.setAdapter(appAdapter);

        lv.setOnItemClickListener((adapter, view, position, id) ->{

            ApplicationInfo applicationInfo =(ApplicationInfo) adapter.getItemAtPosition(position);
            Intent i = pm.getLaunchIntentForPackage(applicationInfo.packageName);
            if(i!=null){
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(),"App nao lançavel",Toast.LENGTH_LONG);
            }


        } );



        }

}
