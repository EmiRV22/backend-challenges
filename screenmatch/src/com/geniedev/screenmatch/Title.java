package com.geniedev.screenmatch;

import com.geniedev.screenmatch.model.TitleOmdb;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private int releaseDate;

    @SerializedName("Runtime")
    private String runtime;

    @SerializedName("Director")
    private String director;

    // Otros campos...
    private int durationMinutes;
    private boolean includedInPlan;
    private double scoreSum;
    private int scoreCount;

    // Constructor
    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    // Constructor TitleOmdb
    public Title(TitleOmdb titleOmdb) {
        this.name = titleOmdb.getName();
        try {
            this.releaseDate = Integer.parseInt(titleOmdb.getYear().split(" ")[0]);
        } catch (NumberFormatException e) {
            this.releaseDate = 0;
        }
        this.runtime = titleOmdb.getRuntime();
        this.director = titleOmdb.getDirector();
    }

    // Getters y Setters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombre() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getScoreCount() {
        return scoreCount;
    }

    public void ShowSpecs() {
        System.out.println("\nEl nombre de la pelicula es: " + name);
        System.out.println("La fecha de lanzamiento fue: " + releaseDate);
        System.out.println("La pelicula tiene una duracion de: " + getDurationMinutes() + " minutos");
        System.out.println("Director: " + director);
    }

    public String getName() {
        return name;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(double scoreSum) {
        this.scoreSum = scoreSum;
    }

    public void setScoreCount(int scoreCount) {
        this.scoreCount = scoreCount;
    }

    public void scoreAnalyzer(double score) {
        scoreSum += score;
        scoreCount++;
    }

    public double averageScore() {
        return scoreSum / scoreCount;
    }

    @Override
    public int compareTo(Title other) {
        return Integer.compare(this.releaseDate, other.releaseDate);
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", runtime='" + runtime + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public void showSpecs() {
        System.out.println("\nEl nombre de la película es: " + name);
        System.out.println("La fecha de lanzamiento fue: " + releaseDate);
        System.out.println("La película tiene una duración de: " + getDurationMinutes() + " minutos");
        System.out.println("Director: " + director);
        // Otros detalles...
    }
}


