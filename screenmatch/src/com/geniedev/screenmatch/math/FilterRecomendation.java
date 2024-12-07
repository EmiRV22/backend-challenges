package com.geniedev.screenmatch.math;

public class FilterRecomendation {

    void filter(Clasification clasification) {

        if (clasification.getClasification() >= 4) {
            System.out.println("Buena puntacion, en tendencia");
        } else if (clasification.getClasification() >= 2) {
            System.out.println("popular por el momento");
        } else {
            System.out.println("Agregalo para ver mas tarde");
        }
    }
}

