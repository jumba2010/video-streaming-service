package video.streaming.serivice.mapper;

import org.mapstruct.Mapper;
import video.streaming.serivice.domain.User;
import video.streaming.serivice.dto.UserDto;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
    User fromDto(UserDto user);
}
