package com.jodedavdmast3r.screenmacth.modelos;

import com.jodedavdmast3r.screenmacth.calculos.IClasificacion;

public class Pelicula extends  Titulo implements IClasificacion {
    private String director;

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
}
