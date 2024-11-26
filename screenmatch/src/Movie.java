public class Movie {
    String name;
    private int releaseDate;
    private int durationMinutes;
    private boolean includedInPlan;
    private double scoreSum;
    private int scoreCount;



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

    public int getScoreCount(){
        return scoreCount;
    }

   public void ShowSpecs(){
        System.out.println("\nEl nombre de la pelicula es: " + name);
        System.out.println("La fecha de lanzamiento fue: " + releaseDate);
        System.out.println("La pelicula tiene una duracion de: " + durationMinutes + " minutos");
    }

    public void scoreAnalyzer(double score){
        scoreSum += score;
        scoreCount++;
    }

    public double averageScore(){
        return scoreSum / scoreCount;
    }
}
