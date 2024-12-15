package com.geniedev.screenmatch;

public class Title {
    String name;
    private int releaseDate;
    private int durationMinutes;
    private boolean includedInPlan;
    private double scoreSum;
    private int scoreCount;
    private String director;


    //Constructor
    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String getNombre(){
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    // Getter para releaseDate
    public int getReleaseDate() {
        return releaseDate;
    }

    // Setter para releaseDate
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getScoreCount(){
        return scoreCount;
    }

    public void ShowSpecs(){
        System.out.println("\nEl nombre de la pelicula es: " + name);
        System.out.println("La fecha de lanzamiento fue: " + releaseDate);
        System.out.println("La pelicula tiene una duracion de: " + getDurationMinutes() + " minutos");
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

    public void scoreAnalyzer(double score){
        scoreSum += score;
        scoreCount++;
    }

    public double averageScore(){
        return scoreSum / scoreCount;
    }
}
