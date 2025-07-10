package com.josedavdmast3r.screenmacth.calculos;

import com.josedavdmast3r.screenmacth.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    // Aplicaremo polimorfismo aquí ya quie una serie o una pelicula es un titulo pero de distinta forma
    // Por lo tanto, podemos recibir un titulo y calcular su tiempo
    // Y podemos decir que una serie o una película incluye un título

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
