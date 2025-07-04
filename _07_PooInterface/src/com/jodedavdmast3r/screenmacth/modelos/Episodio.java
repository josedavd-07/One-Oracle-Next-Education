package com.jodedavdmast3r.screenmacth.modelos;

import com.jodedavdmast3r.screenmacth.calculos.IClasificacion;

public class Episodio  implements IClasificacion {

    private int numero;
    private String nombre;

    private  Serie serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 1000){
            return 4;
        }
        else{
            return 2;
        }
    }
}
