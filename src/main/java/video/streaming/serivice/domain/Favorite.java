package video.streaming.serivice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Favorite extends LifeCycleEntity{

    @ManyToOne
    private User user;
    @ManyToOne
    private Movie movie;
}
