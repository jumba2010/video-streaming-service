package video.streaming.serivice.repository;

import org.springframework.data.repository.CrudRepository;
import video.streaming.serivice.domain.Rating;

public interface RatingRepository extends CrudRepository<Rating,Long> {
}
