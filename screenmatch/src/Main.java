public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Origen";
        firstMovie.releaseDate = 2010;
        firstMovie.durationMinutes = 148;

        firstMovie.ShowSpecs();
        firstMovie.scoreAnalyzer(9.3);
        firstMovie.scoreAnalyzer(9.9);
        firstMovie.scoreAnalyzer(6);
        firstMovie.scoreAnalyzer(8);
        firstMovie.scoreAnalyzer(5);

        System.out.println(firstMovie.averageScore());
        System.out.println(firstMovie.scoreCount);

        Movie secondMovie = new Movie();
        secondMovie.name = "Figth Club";
        secondMovie.releaseDate = 1999;
        secondMovie.durationMinutes = 139;


        System.out.println("\nAqui la segunda pelicula");

         secondMovie.ShowSpecs();


    }
}
