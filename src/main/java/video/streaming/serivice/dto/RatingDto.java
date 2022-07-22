package video.streaming.serivice.dto;

import video.streaming.serivice.domain.Movie;

import java.time.LocalDateTime;

public class RatingDto {
    private String userName;
    private String userPhoto;
    private Movie movie;
    private double rate;
    private String comments;
    private LocalDateTime date;
}
