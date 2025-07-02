package com.josedavdmast3r.screenmacth.modelos;

import java.util.ArrayList;
import java.util.List;

//Miembros Variables de la clase TarjetaDeCredito
public class TarjetaDeCredito {
    private double limiteSaldo;
    private double saldoActual;
    private List<Compra> ListaDeCompras;

    // Constructor que inicializa la tarjeta con un límite de saldo
    public TarjetaDeCredito(double limite) {
        this.limiteSaldo = limite;
        this.saldoActual = limite;
        this.ListaDeCompras = new ArrayList<>();
    }

    // Método para realizar una compra
    public boolean realizarCompra(Compra compra) {
        if (this.saldoActual >= compra.getValor()) {
            this.saldoActual -= compra.getValor();
            this.ListaDeCompras.add(compra);
            return true; // Compra exitosa
        }
        return false;
    }

    public double getLimiteSaldo() {
        return limiteSaldo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public List<Compra> getListaDeCompras() {
        return ListaDeCompras;
    }


}
