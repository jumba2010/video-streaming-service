package video.streaming.serivice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import video.streaming.serivice.domain.User;
import video.streaming.serivice.dto.UserDto;
import video.streaming.serivice.mapper.UserMapper;
import video.streaming.serivice.repository.UserRepository;

import java.util.List;

@Data
@AllArgsConstructor
@Service
public class UserService {

    private final  UserRepository userRepo;
    private final UserMapper userMapper;
    public List<UserDto> findAllUsers() {

        return null;
    }

    public void createUser(UserDto user) {
        userRepo.save(userMapper.fromDto(user));
    }

    public void updateUser(final UserDto userDto) {
        User user=userRepo.findByEmail(userDto.getEmail()).orElseThrow(()->
                new ResponseStatusException(HttpStatus.BAD_REQUEST,"User by given email was not found"));
        user.setContact(user.getContact());
        user.setName(userDto.getName());
        userRepo.save(user);
    }
}
