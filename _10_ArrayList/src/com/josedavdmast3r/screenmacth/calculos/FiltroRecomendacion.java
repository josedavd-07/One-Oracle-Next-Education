package com.josedavdmast3r.screenmacth.calculos;

import com.jodedavdmast3r.screenmacth.calculos.IClasificacion;

public class FiltroRecomendacion {
    public  void filtra(IClasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy recomendado");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Recomendado");
        }else {
            System.out.println("Dejalo en tu lista para ver mas tarde");
        }
    }

}
