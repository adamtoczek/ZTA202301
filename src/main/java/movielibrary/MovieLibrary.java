package movielibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MovieLibrary {
    public List<Movie> movieList = new ArrayList<>();

    public void addMovie (Movie movie) {
        movieList.add(movie);
    }

    public void showRandomMovie() {
        int randomInt = ThreadLocalRandom.current().nextInt(0, movieList.size());
        System.out.println(movieList.get(randomInt));
    }

    public void showMoviesFromDates(int dateStart, int dateEnd) {
        List<Movie> list = getMoviesFromDates(dateStart, dateEnd);
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }

    private List<Movie> getMoviesFromDates(int dateStart, int dateEnd) {
//        List<Movie> tmp = new ArrayList<>();
//        for(Movie movie : movieList) {
//            if (movie.dataWydania >= dateStart && movie.dataWydania <= dateEnd)
//                tmp.add(movie);
//        }
//        return tmp;
        return movieList.stream().filter(movie -> movie.dataWydania >= dateStart && movie.dataWydania <= dateEnd).collect(Collectors.toList());
    }

    public void showMoviesWithActor(String imie, String nazwisko) {
        List<Movie> list = getMoviesWithActor(imie, nazwisko);
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }

    private List<Movie> getMoviesWithActor(String imie, String nazwisko) {
        List<Movie> tmp = new ArrayList<>();
        Actor actor = new Actor(imie, nazwisko);
        for (Movie movie : movieList)
            if (movie.actorsList.contains(actor))
                tmp.add(movie);

//        for (Movie movie : movieList) {
//            for (Actor actor : movie.actorsList)
//                if (actor.imie.equals(imie) && actor.nazwisko.equals(nazwisko))
//                    tmp.add(movie);
//        }

        return tmp;
    }


}
