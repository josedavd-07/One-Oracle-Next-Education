package com.josedavdmast3r.spotify.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8) {
            System.out.printf(">> El audio '%s'es uno de los favoritos del momento.\n", audio.getTitulo());
        } else {
            System.out.printf(">> El audio '%s' se encuentar en la lista de los favoritos.\n", audio.getTitulo());
        }
    }
}
