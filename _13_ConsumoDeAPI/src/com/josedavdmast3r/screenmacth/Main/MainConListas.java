package com.josedavdmast3r.screenmacth.Main;

import com.josedavdmast3r.screenmacth.modelos.Pelicula;
import com.josedavdmast3r.screenmacth.modelos.Serie;
import com.josedavdmast3r.screenmacth.modelos.Titulo;

import java.util.*;

public class MainConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Enredados", 2010);
        miPelicula.evaluationFilm(3);
        Pelicula otraPelicula = new Pelicula("El Rey León", 1994);
        otraPelicula.evaluationFilm(9);
        var myFilm = new Pelicula("El lorax el guardián del bosque", 2012);
        myFilm.evaluationFilm(8);
        Serie casaDragon = new Serie("La Casa del Dragón", 2022);

        //Haremos uso de la interfaz list y implementamops su metodos
//        programemos para interfaces y no para implementaciones
//        List<Titulo> lista = new ArrayList<>();
//        ArrayList<Titulo> lista = new ArrayList<>();
        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(myFilm);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());

            //Forma moderna java 14+
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                //Pelicula pelicula = (Pelicula) item ; // Casting a Pelicula Forma antiguo
                System.out.println(pelicula.getClasificacion());
            }

        }
        //Ordenacion de string
        ArrayList<String> names = new ArrayList<>();
        names.add("Carlos Mario");
        names.add("Pedro");
        names.add("Fernando");
        names.add("Eva");
        System.out.println("Lista de nombres sin ordenar:" + names);
        Collections.sort(names);
        System.out.println("Lista de nombres ordenada:" + names);

        Collections.sort(lista);
        System.out.println("Ordenación de la lista" + lista);

        //Ver en un futuro expresiones lambda
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println(("Ordenación de la lista por fecha de lanzamiento: " + lista));


    }
}
