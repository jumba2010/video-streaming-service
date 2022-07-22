package video.streaming.serivice.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDto {
    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Contact is required")
    private String contact;

    @NotNull(message = "Email is required")
    @Email(message = "Email format is invalid")
    private String email;

    @NotNull(message = "Country is required")
    private String country;
}
