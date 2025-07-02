package com.josedavdmast3r.screenmacth.Main;

import com.josedavdmast3r.screenmacth.modelos.Pelicula;
import com.josedavdmast3r.screenmacth.modelos.Serie;
import com.josedavdmast3r.screenmacth.modelos.Titulo;

import java.util.ArrayList;

public class MainConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Enredados", 2010);
        miPelicula.evaluationFilm(3);
        Pelicula otraPelicula = new Pelicula("El Rey León", 1994);
        otraPelicula.evaluationFilm(9);
        var myFilm = new Pelicula("El lorax el guardián del bosque", 2012);
        myFilm.evaluationFilm(8);
        Serie casaDragon = new Serie("La Casa del Dragón", 2022);

        //Haremos uso del arrayList
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(myFilm);

        for (Titulo item : lista){
            System.out.println(item.getNombre());

            //Forma moderna java 14+
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                //Pelicula pelicula = (Pelicula) item ; // Casting a Pelicula Forma antiguo
                System.out.println(pelicula.getClasificacion());
            }

        }
    }
}
