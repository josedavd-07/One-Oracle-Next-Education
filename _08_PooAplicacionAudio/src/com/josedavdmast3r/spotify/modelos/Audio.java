package com.josedavdmast3r.spotify.modelos;

public class Audio {
    private  String titulo;
    private  int duracion;
    private  int totalReproducciones;
    private int totalmeGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalmeGusta() {
        return totalmeGusta;
    }

    public void setTotalmeGusta(int totalmeGusta) {
        this.totalmeGusta = totalmeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta() {
        this.totalmeGusta++;
    }
    public void reproducir() {
        this.totalReproducciones++;
    }

}
