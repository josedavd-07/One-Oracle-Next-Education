package com.josedavdmast3r.screenmacth.modelos;

import java.sql.Wrapper;

public class Compra implements Comparable<Compra> {
    private double valor;
    private String descripcion;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + descripcion;
    }

    //Implementamos el ordenamiento de lso datos
    // Wrapper de la clase Compra haciendo un cast a Double
    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
