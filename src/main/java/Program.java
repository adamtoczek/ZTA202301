import movielibrary.*;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        MovieLibrary biblioteka = new MovieLibrary();

        Actor helenka = new Actor("Helen", "Mirien");
        Actor szon = new Actor("Sean", "Connery");
        Actor tomek = new Actor("Tom", "Cruise");
        Actor meryl = new Actor("Meryl", "Streep");

        Director romek = new Director("Roman", "Polański");
        Director stasiek = new Director("Steven", "Spielberg");

        biblioteka.addMovie(new Movie(romek, Arrays.asList(helenka, tomek, meryl), 1999, "Ogniem i mieczem", Gatunek.DRAMAT));
        biblioteka.addMovie(new Movie(stasiek, Arrays.asList(szon, tomek,meryl), 1980, "Wielki Błękit", Gatunek.DRAMAT));
        biblioteka.addMovie(new Movie(stasiek, Arrays.asList(helenka, meryl, tomek), 2020, "Gwiezdne Wojny", Gatunek.THRILLER));


    }
}
