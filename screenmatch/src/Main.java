public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Origen";
        firstMovie.releaseDate = 2010;
        firstMovie.durationMinutes = 148;

        firstMovie.ShowSpecs();

        Movie secondMovie = new Movie();
        secondMovie.name = "Figth Club";
        secondMovie.releaseDate = 1999;
        secondMovie.durationMinutes = 139;

        System.out.println("\nAqui la segunda pelicula");

         secondMovie.ShowSpecs();

    }
}
