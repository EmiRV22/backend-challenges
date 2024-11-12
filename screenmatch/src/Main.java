public class Main {
    /** La clase main actúa como el punto de entrada del programa.
      * Es donde se inicia la ejecución del código y se crean instancias de las clases definidas.
      * Esto es esencial para organizar y estructurar el flujo del programa.
      */

    public static void main(String[] args) {
        // Instancia de la clase Movie
        Movie firstMovie = new Movie();
        firstMovie.name = "Origen";
        firstMovie.releaseDate = 2010;
        firstMovie.durationMinutes = 148;

        // Utilizamos metodos descritos de la clase Movie
        // .ShowSpecs y scoreAnalyzer
        firstMovie.ShowSpecs();
        firstMovie.scoreAnalyzer(9.3);
        firstMovie.scoreAnalyzer(9.9);
        firstMovie.scoreAnalyzer(6);
        firstMovie.scoreAnalyzer(8);
        firstMovie.scoreAnalyzer(5);

        System.out.println(firstMovie.averageScore());
        System.out.println(firstMovie.scoreCount);

        // Segunda instancia de la clase Movie
        Movie secondMovie = new Movie();
        secondMovie.name = "Figth Club";
        secondMovie.releaseDate = 1999;
        secondMovie.durationMinutes = 139;


        System.out.println("\n Aqui la segunda pelicula");
        secondMovie.ShowSpecs();
        secondMovie.scoreAnalyzer(9.9);
        secondMovie.scoreAnalyzer(9.1);
        secondMovie.scoreAnalyzer(9.6);
        System.out.println(secondMovie.averageScore());
        System.out.println(secondMovie.scoreCount);



    }
}
