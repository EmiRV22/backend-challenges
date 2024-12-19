package com.geniedev.screenmatch.Main;
import com.geniedev.screenmatch.Movie;
import com.geniedev.screenmatch.Series;
import com.geniedev.screenmatch.Title;
import java.util.*;

public class MainList {
    public static void main(String[] args) {

        Movie firstMovie = new Movie("Origen",2010 );
        firstMovie.scoreAnalyzer(9);
        Movie secondMovie = new Movie("Fight Club",1999);
        secondMovie.scoreAnalyzer(8);
        var TheBatman = new Movie("The Batman",2022);
        TheBatman.scoreAnalyzer(10);

        Series houseDragons = new Series("House of the Dragons",2022);
        houseDragons.scoreAnalyzer(7);

        List<Title> list = new LinkedList<>();
        list.add(TheBatman);
        list.add(firstMovie);
        list.add(secondMovie);
        list.add(houseDragons);

        list.sort(Comparator.comparing(Title::getReleaseDate));

       for (Title item: list){

           System.out.println(item.getName());

           if(item instanceof Movie movie){
               System.out.println(movie.getClasification());
           }

       }

       ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Robert Pattinson");
        artistList.add("Leonardo DiCaprio");
        artistList.add("Edward Norton");

        Collections.sort(artistList);
        System.out.println(artistList);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(list);

    }
}
