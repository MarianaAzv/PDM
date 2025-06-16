package com.ifsc.contaclicks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AppAdapter extends ArrayAdapter<ApplicationInfo> {

    int mresource;


    public AppAdapter(Context context, int resource, @NonNull List<ApplicationInfo> objects) {
        super(context,resource,objects);
    }

   // public AppAdapter(MainActivity context, int appItem) {
    //    super(context,appItem);
 //   }

    @NonNull
    @Override
    public View getView(int position,@NonNull View convertView,@NonNull ViewGroup parent ){
        //Inflar o layout xml --> obj view
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        View v = layoutInflater.inflate(mresource,parent,false);
        //v é uma instacia de nosso app_item.xml
        ImageView imageView=v.findViewById(R.id.imageView);
        TextView tv=v.findViewById(R.id.textView);
        //Recuperamos o item de dado para preencher a posicao da lista
        ApplicationInfo appinfo= getItem(position);

        tv.setText(appinfo.loadLabel(getContext().getPackageManager()));

        return v;
    }
}
