package guru.springFramework.netfixexample.service;

import guru.springFramework.netfixexample.domain.Movie;
import guru.springFramework.netfixexample.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * The interface Movie service.
 */
public interface MovieService {


    /**
     * Events flux.
     *
     * @param movieId the movie id
     * @return the flux
     */
    Flux<MovieEvent> events(String movieId);

    /**
     * Gets moview by id.
     *
     * @param id the id
     * @return the moview by id
     */
    Mono<Movie> getMoviewById(String id);

    /**
     * Gets all movies.
     *
     * @return the all movies
     */
    Flux<Movie> getAllMovies();
}
