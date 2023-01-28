package movielibrary;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public Director director;
    public List<Actor> actorsList;
    public int dataWydania;
    public String tytul;
    public Gatunek gatunek;

    public Movie(Director director, List<Actor> actorsList, int dataWydania, String tytul, Gatunek gatunek) {
        this.director = director;
        this.actorsList = actorsList;
        this.dataWydania = dataWydania;
        this.tytul = tytul;
        this.gatunek = gatunek;
    }


}
