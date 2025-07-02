package com.josedavdmast3r.screenmacth.modelos;

import com.josedavdmast3r.screenmacth.calculos.IClasificacion;

public class Pelicula extends  Titulo implements IClasificacion {
    private String director;


    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calcularMedia() / 2);
    }

    @Override
    public String toString() {
        return String.format("""
            toString() de la pelicula
            Pelicula: %s 
            (%d)
            """, this.getNombre(), this.getFechaDeLanzamiento());
    }
}
