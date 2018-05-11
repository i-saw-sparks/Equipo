package com.example.claudia.equipo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.claudia.equipo.AdaptadorDeListaDeDatos;
import com.example.claudia.equipo.OrigenDeDatos;
import com.example.claudia.equipo.R;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public ImageView portada;
    public ListView lista;
    public OrigenDeDatos origen;
    public AdaptadorDeListaDeDatos adap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        portada=(ImageView)findViewById(R.id.portada);
        lista=(ListView)findViewById(R.id.listview);

        adap = new AdaptadorDeListaDeDatos();
        origen= new OrigenDeDatos();
        adap.arreglo=origen.showAll();
        adap.context=this;
        lista.setAdapter(adap);



    }
}