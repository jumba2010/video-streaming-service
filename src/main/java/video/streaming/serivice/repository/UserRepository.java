package video.streaming.serivice.repository;

import org.springframework.data.repository.CrudRepository;
import video.streaming.serivice.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    Optional<User> findByEmail(final String email);
}
