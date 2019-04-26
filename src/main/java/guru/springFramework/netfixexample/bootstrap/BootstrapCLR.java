package guru.springFramework.netfixexample.bootstrap;

import guru.springFramework.netfixexample.domain.Movie;
import guru.springFramework.netfixexample.repositoreies.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class BootstrapCLR implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public BootstrapCLR(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        movieRepository.deleteAll()
                .thenMany(
                        Flux.just("Lord of the Rings 1", "Star Wars 2", "Galaxy Quest 3")
                                .map(title -> new Movie(title))
                                .flatMap(movieRepository::save)
                ).subscribe(null, null, () -> {
            movieRepository.findAll().subscribe(System.out::println);
        });


    }
}
