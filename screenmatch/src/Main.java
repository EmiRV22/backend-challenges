public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Origen";
        firstMovie.releaseDate = 2010;
        firstMovie.durationMinutes = 148;

        Movie secondMovie = new Movie();
        secondMovie.name = "Figth Club";
        secondMovie.releaseDate = 1999;
        secondMovie.durationMinutes = 139;

        System.out.println("**************");
        System.out.println("\nLa primera pelicula es: "+ firstMovie.name);
        System.out.println("La fecha de lanzamiento fue : "+ firstMovie.releaseDate);
        System.out.println("Con una duracion en minutos de : "+ firstMovie.durationMinutes);

        System.out.println("\nAqui la segunda pelicula");

        System.out.println("\nLa primera pelicula es: "+ secondMovie.name);
        System.out.println("La fecha de lanzamiento fue : "+ secondMovie.releaseDate);
        System.out.println("Con una duracion en minutos de : "+ secondMovie.durationMinutes);

    }
}
