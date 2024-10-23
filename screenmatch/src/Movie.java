public class Movie {
    String name;
    int releaseDate;
    int durationMinutes;
    boolean includedInPlan;
    double scoreSum;
    int scoreCount;

    void ShowSpecs(){
        System.out.println("\nEl nombre de la pelicula es: "+ name);
        System.out.println("La fecha de lanzamiento fue : "+ releaseDate);
        System.out.println("La fecha de lanzamiento fue : "+ durationMinutes);

    }

    void scoreAnalyzer (double score){
        scoreSum += score;
        scoreCount++;
    }

    double averageScore(){
        return scoreSum / scoreCount;

    }
}
