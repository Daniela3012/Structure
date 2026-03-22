package DTO.Level2.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies = new ArrayList<>();

    public void save (Movie movie) {
        movies.add(movie);
    }

    public List<Movie> findAll () {
        return movies;
    }
}
