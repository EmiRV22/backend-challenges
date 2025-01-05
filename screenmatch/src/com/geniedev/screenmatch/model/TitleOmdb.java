package com.geniedev.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public class TitleOmdb {

    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private String year;

    @SerializedName("Runtime")
    private String runtime;

    @SerializedName("Director")
    private String director;

    // Otros campos...

    @Override
    public String toString() {
        return
                "Titulo: " + name +
                ", year='" + year +
                ", runtime=" + runtime+
                ", director=" + director;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getDirector() {
        return director;
    }
}
