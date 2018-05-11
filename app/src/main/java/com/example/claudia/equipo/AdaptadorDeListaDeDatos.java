package com.example.claudia.equipo;

/**
 * Created by Claudia on 09/05/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class AdaptadorDeListaDeDatos extends BaseAdapter {

    public ArrayList<Datos> arreglo;
    public Context context;
    public LayoutInflater inflater;

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        arreglo.get(i);
        return arreglo.get(i).id;
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.datos, null);
        TextView titl = (TextView) v.findViewById(R.id.titulo);
        titl.setText(arreglo.get(i).titulo);
        TextView anio = (TextView) v.findViewById(R.id.año);
        anio.setText(arreglo.get(i).anio);
        TextView gnr = (TextView) v.findViewById(R.id.genero);
        gnr.setText(arreglo.get(i).genero);
        TextView tcanc = (TextView) v.findViewById(R.id.canciones);
        tcanc.setText(arreglo.get(i).tot_canciones);
        TextView tdur = (TextView) v.findViewById(R.id.duracion);
        tdur.setText(arreglo.get(i).tot_duracion);
        ImageView imagen = (ImageView) v.findViewById(R.id.portada);
        Picasso.with(context).load(arreglo.get(i).Portada).into(imagen);
        return v;
    }
}