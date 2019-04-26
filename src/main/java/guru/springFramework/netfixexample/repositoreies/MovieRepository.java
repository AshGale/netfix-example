package guru.springFramework.netfixexample.repositoreies;

import guru.springFramework.netfixexample.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {


}
