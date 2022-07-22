package video.streaming.serivice.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class User extends LifeCycleEntity{
    private String name;
    private String contact;
    private String email;
    private String country;
}
