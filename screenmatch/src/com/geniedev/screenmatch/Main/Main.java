package com.geniedev.screenmatch.Main;

import com.geniedev.screenmatch.Episodes;
import com.geniedev.screenmatch.Movie;
import com.geniedev.screenmatch.Series;
import com.geniedev.screenmatch.math.FilterRecomendation;
import com.geniedev.screenmatch.math.TimeCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie("Origen",2010 );
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

        Movie secondMovie = new Movie("Fight Club",1999);

        secondMovie.setDurationMinutes(139);
        secondMovie.setIncludedInPlan(true);

        System.out.println("\nAquí la segunda película");
        secondMovie.ShowSpecs();
        secondMovie.scoreAnalyzer(9.9);
        secondMovie.scoreAnalyzer(9.1);
        secondMovie.scoreAnalyzer(9.6);
        System.out.println(secondMovie.averageScore());

        Series houseDragons = new Series("House of the Dragons",2022);
        houseDragons.setSeason(2);
        houseDragons.setMinutesEpisode(55);
        houseDragons.setEpisodes(8);
        houseDragons.ShowSpecs();

        TimeCalculator calculator = new TimeCalculator();
        calculator.addList(firstMovie);
        calculator.addList(houseDragons);
        calculator.addList(secondMovie);
        System.out.println(calculator.getTime());

        FilterRecomendation filterRecomendation = new FilterRecomendation();
        filterRecomendation.filter(firstMovie);
        filterRecomendation.filter(firstMovie);

        Episodes episodes = new Episodes();
        episodes.setName("La casa del Dragon");
        episodes.setNum(1);
        episodes.setSeries(houseDragons);
        episodes.setViewsT(320);
        filterRecomendation.filter(episodes);

        var TheBatman = new Movie("The Batman",2022);
        TheBatman.setDurationMinutes(176);
        TheBatman.setIncludedInPlan(true);


        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(TheBatman);
        movieList.add(firstMovie);
        movieList.add(secondMovie);

        System.out.println("Tamano de la lista "+ movieList.size());
        System.out.println("La primera pelicula es "+ movieList.getFirst().getNombre());

        System.out.println(movieList);

        System.out.println("toString Peicula: " + movieList.getFirst().toString());





    }
}
