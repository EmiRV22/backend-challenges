package com.geniedev.screenmatch;

import com.geniedev.screenmatch.math.Clasification;

public class Movie extends Title implements Clasification {


    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public int getClasification() {
        return (int) (averageScore() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getReleaseDate() + ")";
    }
}




