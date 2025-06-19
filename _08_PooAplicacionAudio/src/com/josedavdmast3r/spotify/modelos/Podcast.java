package com.josedavdmast3r.spotify.modelos;

public class Podcast extends  Audio {
    private String Presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() >= 2000) {
            return 9;
        } else {
            return 2;
        }
    }

    public String getPresentador() {
        return Presentador;
    }

    public void setPresentador(String presentador) {
        Presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
