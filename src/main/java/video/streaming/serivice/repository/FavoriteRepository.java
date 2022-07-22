package video.streaming.serivice.repository;

import org.springframework.data.repository.CrudRepository;
import video.streaming.serivice.domain.Favorite;

public interface FavoriteRepository extends CrudRepository<Favorite,Long> {
}
