package com.example.claudia.equipo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Claudia on 09/05/2018.
 */

public class OrigenDeDatos {
    public ArrayList<Datos> showAll()
    {
        ArrayList<Datos> nuevo = new ArrayList<>();

        Datos uno = new Datos();
        uno.Portada=("https://images-na.ssl-images-amazon.com/images/I/91vKScuJ4tL._SY355_.jpg");
        uno.titulo = ("A Fever You Can't Sweat Out");
        uno.anio = ("2005");
        uno.genero = ("Pop punk, dance punk");
        uno.tot_canciones = ("13");
        uno.tot_duracion = ("39:50");
        uno.id = 1;

        Datos dos = new Datos();
        dos.Portada=("https://images-na.ssl-images-amazon.com/images/I/912%2Bs-bVsIL._SL1425_.jpg");
        dos.titulo = ("Pretty. Odd.");
        dos.anio = ("2008");
        dos.genero = ("Pop barroco, folk rock, rock psicodélico");
        dos.tot_canciones = ("15");
        dos.tot_duracion = ("48:46");
        dos.id = 2;
        nuevo.add(dos);

        Datos tres = new Datos();
        tres.Portada=("https://images-na.ssl-images-amazon.com/images/I/512WnHJtiEL.jpg");
        tres.titulo = ("Vices & Virtues");
        tres.anio = ("2011");
        tres.genero = ("Pop punk, rock alternativo, pop barroco");
        tres.tot_canciones = ("10");
        tres.tot_duracion = ("37:27");
        tres.id = 3;
        nuevo.add(tres);

        Datos cuatro = new Datos();
        cuatro.Portada=("https://lastfm-img2.akamaized.net/i/u/770x0/a4774f5ef1874ef59f90a44d562c8e0d.jpg");
        cuatro.titulo = ("Too Weird to Live, Too Rare to Die!");
        cuatro.anio = ("2013");
        cuatro.genero = ("Pop rock, synth pop");
        cuatro.tot_canciones = ("10");
        cuatro.tot_duracion = ("32:32");
        cuatro.id = 4;
        nuevo.add(cuatro);

        Datos cinco = new Datos();
        cinco.Portada=("https://images-na.ssl-images-amazon.com/images/I/81hKk1Evy%2BL._SL1422_.jpg");
        cinco.titulo = ("Death of a Bachelor");
        cinco.anio = ("2016");
        cinco.genero = ("pop rock");
        cinco.tot_canciones = ("11");
        cinco.tot_duracion = ("36:06");
        cinco.id = 5;
        nuevo.add(cinco);

        Datos seis = new Datos();
        seis.Portada=("https://upload.wikimedia.org/wikipedia/en/5/5d/PATD_PFTW.jpg");
        seis.titulo = ("Pray For The Wicked");
        seis.anio = ("2018");
        seis.genero = ("TBA");
        seis.tot_canciones = ("11");
        seis.tot_duracion = ("TBA");
        seis.id = 6;
        nuevo.add(seis);

        Datos siete = new Datos();
        siete.Portada=("https://images.genius.com/c579346e75a2660cc71dd90cccc60b1a.500x500x1.jpg");
        siete.titulo = ("Nicotine EP");
        siete.anio = ("2014");
        siete.genero = ("NA");
        siete.tot_canciones = ("4");
        siete.tot_duracion = ("12:11");
        siete.id = 7;
        nuevo.add(siete);

        Datos ocho = new Datos();
        ocho.Portada=("https://upload.wikimedia.org/wikipedia/en/thumb/a/af/Panic_AllMyFriends.jpg/220px-Panic_AllMyFriends.jpg");
        ocho.titulo = ("All My Friends, We're Glorious: Death of a Bachelor Tour Live");
        ocho.anio = ("2017");
        ocho.genero = ("Live album, rock alternativo, pop rock");
        ocho.tot_canciones = ("21");
        ocho.tot_duracion = ("87:06");
        ocho.id = 8;
        nuevo.add(ocho);

        Datos nueve = new Datos();
        nueve.Portada=("https://upload.wikimedia.org/wikipedia/en/2/27/Live_in_chicago.jpg");
        nueve.titulo = ("...Live In Chicago");
        nueve.anio = ("2008");
        nueve.genero = ("Pop punk , rock alternativo");
        nueve.tot_canciones = ("17");
        nueve.tot_duracion = ("59:52");
        nueve.id = 9;
        nuevo.add(nueve);

        Datos diez = new Datos();
        diez.Portada=("https://images.genius.com/494c8acf691d8a7da62c7660f11093c5.499x499x1.jpg");
        diez.titulo = ("Introducing... Panic at the Disco");
        diez.anio = ("2008");
        diez.genero = ("Pop punk");
        diez.tot_canciones = ("5");
        diez.tot_duracion = ("16:30");
        diez.id = 10;
        nuevo.add(diez);





        return nuevo;
    }
}
