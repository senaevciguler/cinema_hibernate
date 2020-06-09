package ee.sdaacademy.cinema;

import ee.sdaacademy.cinema.repositories.MovieRepository;

public class Application {
    public static void main ( String[] args ) {
        MovieRepository repository = new MovieRepository();
        repository.findAll().stream().forEach(movie -> {
            System.out.println(movie.getName());
        });
    }
}
