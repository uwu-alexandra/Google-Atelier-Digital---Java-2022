package Lab2.Challenge2;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    //query1: Get all studios names that have published more than 2 movies
    public static void Query1(List<Studio> myList) {
        for (Studio studio : myList ) {
            if(studio.getFilme().length > 2) {
                System.out.println(studio.getNume());
            }
        }
    }
    //query2: Get all the studios names in which plays the actor with name "actor cu 2 oscaruri"
    public static void Query2(List<Studio> myList) {
        for(Studio studio : myList) {
            for(Film film : studio.getFilme()) {
                for(Actor actor : film.getActori()) {
                    if(actor.getNume().equals("Actor cu 2 oscaruri")) {
                        System.out.println(studio.getNume());
                    }
                }
            }
        }
    }
    //query3: Get all the movie names in which plays at least an actor with age above 50
    public static void Query3(List<Film> myList) {
        int count=0;
        for (Film movie : myList) {
            for (Actor actor : movie.getActori()) {
                if (actor.getVarsta() > 50) {
                  System.out.println(movie.getNume());
                  break;
                }
            }
        }
    }
*/
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Premiu[] {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oscar din 2010", 55, new Premiu[] {oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23, new Premiu[] {oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor fara oscar 01", 33, new Premiu[] {});
        Actor actorFaraPremii02 = new Actor("Actor fara oscar 02", 60, new Premiu[] {});
        Actor actorFaraPremii03 = new Actor("Actor fara oscar 03", 20, new Premiu[] {});

        Film film1 = new Film(1990, "Film cu actori de oscar ", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "Film cu actori fara premii 01", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "Film cu actori fara premii 02", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "Film cu actori de oscar 02", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "Film cu actori fara premii 03", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[] {studio1, studio2};

        //query1: Get all studios names that have published more than 2 movies
        System.out.println("All studios names that have published more than 2 movies: ");
        for (Studio s : studioDatabase) {
            if(s.getFilme().length > 2)
                System.out.println(s.getNume());
        }

        //query2: Get all the studios names in which plays the actor with name "actor cu 2 oscaruri"
        System.out.println("All the studios names in which plays the actor with name 'actor cu 2 oscaruri'");
        for (Studio s : studioDatabase) {
            if(s.getMovieByActor("Actor cu 2 oscaruri") != null) {
                System.out.println(s.getNume());
            }
        }

        //query3: Get all the movie names in which plays at least an actor with age above 50
        System.out.println("All the movie names in which plays at least an actor with age above 50");
        for (Studio s : studioDatabase) {
            s.getMovieByActorAge(50);
        }



       /* List<Studio> studios = new ArrayList<>();
        studios.add(studio1);
        studios.add(studio2);

        List<Film> movies = new ArrayList<>();
        movies.add(film1);
        movies.add(film2);
        movies.add(film3);
        movies.add(film4);
        movies.add(film5);

        System.out.println("All studios names that have published more than 2 movies: ");
        Query1(studios);
        System.out.println("All the studios names in which plays the actor with name 'actor cu 2 oscaruri'");
        Query2(studios);
        System.out.println("All the movie names in which plays at least an actor with age above 50");
        Query3(movies); */

    }
}

