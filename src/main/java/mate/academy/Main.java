package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movieTest = new Movie();
        movieTest.setTitle("Test Movie");
        movieTest.setDescription("Test Movie description");
        movieService.add(movieTest);

        Movie movie = movieService.get(1L);
        System.out.println(movie.getTitle());
        System.out.println(movie.getDescription());
    }
}
