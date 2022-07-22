package video.streaming.serivice.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Movie extends  LifeCycleEntity{
private String title;
private int duration;
private int releaseYear;
private Language language;
private String url;
private String image;
}
