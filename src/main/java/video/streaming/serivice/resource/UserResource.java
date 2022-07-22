package video.streaming.serivice.resource;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import video.streaming.serivice.dto.UserDto;
import video.streaming.serivice.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/user")
public class UserResource {

    private final UserService userService;

    @GetMapping
    public List<UserDto> findAllUsers(){
       return  userService.findAllUsers();
    }

    @PostMapping
    public void createUser(@RequestBody @Valid UserDto user){
        userService.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody @Valid UserDto user){
        userService.updateUser(user);
    }
}
