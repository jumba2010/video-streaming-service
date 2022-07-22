package video.streaming.serivice.repository;

import org.springframework.data.repository.CrudRepository;
import video.streaming.serivice.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}
