package movielibrary;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    public List<Movie> movieList = new ArrayList<>();

    public void addMovie (Movie movie) {
        movieList.add(movie);
    }
}
