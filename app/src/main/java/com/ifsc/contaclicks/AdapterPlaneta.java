package com.ifsc.contaclicks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class AdapterPlaneta extends ArrayList<Planeta> {
    int mresource;
    public adapterPlaneta(@NonNull Context context, int resource, @NonNull List<Planeta> objetos){
        super(context, resource, objetos);
        mresource =resource;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(mresource,parent, false);

        //Preencher o item da view

        TextView tvnome = convertView.findViewById(R.id.textView);

        tvnome.setText(this.getItem(position).nome);

        return convertView;

    }
}
