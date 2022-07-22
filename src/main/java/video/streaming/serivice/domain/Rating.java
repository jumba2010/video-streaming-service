package video.streaming.serivice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class Rating extends  LifeCycleEntity{

    @ManyToOne
    private User user;
    @ManyToOne
    private Movie movie;
    private double rate;
    private String comments;
}
