public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setName("Origen");
        firstMovie.setReleaseDate(2010);
        firstMovie.setDurationMinutes(148);
        firstMovie.setIncludedInPlan(true);

        firstMovie.ShowSpecs();
        firstMovie.scoreAnalyzer(9.3);
        firstMovie.scoreAnalyzer(9.9);
        firstMovie.scoreAnalyzer(6);
        firstMovie.scoreAnalyzer(8);
        firstMovie.scoreAnalyzer(5);

        System.out.println(firstMovie.getScoreCount());
        System.out.println(firstMovie.averageScore());

        Movie secondMovie = new Movie();
        secondMovie.setName("Fight Club");
        secondMovie.setReleaseDate(1999);
        secondMovie.setDurationMinutes(139);
        secondMovie.setIncludedInPlan(true);


        System.out.println("\nAquí la segunda película");
        secondMovie.ShowSpecs();
        secondMovie.scoreAnalyzer(9.9);
        secondMovie.scoreAnalyzer(9.1);
        secondMovie.scoreAnalyzer(9.6);
        System.out.println(secondMovie.averageScore());
    }
}
