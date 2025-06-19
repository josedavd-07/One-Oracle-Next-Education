package com.josedavdmast3r.spotify.Main;

import com.josedavdmast3r.spotify.modelos.Cancion;
import com.josedavdmast3r.spotify.modelos.MisFavoritos;
import com.josedavdmast3r.spotify.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Te rescatare");
        miCancion.setArtista("Priscila");
        miCancion.setAlbum("La bondad de Dios");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("La  Inteligencia Artificial");
        miPodcast.setPresentador("Freddy Vega");

        // Simulamos reproducciones y me gusta esta es de la secciion cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        // Simulamos reproducciones y me gusta esta es de la secciion podcast
        for (int i = 0; i < 200; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miCancion.reproducir();
        }
        System.out.printf("""
                >> Total de reproducciones de la cancion: %d
                >> Total de me gusta de la cancion: %d
                """, miCancion.getTotalReproducciones(),miCancion.getTotalmeGusta())
        ;

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(miCancion);
        misFavoritos.adicione(miPodcast);

    }
}
