package video.streaming.serivice.dto;

import lombok.Data;
import video.streaming.serivice.domain.Language;

@Data
public class MovieDto {
    private String title;
    private int duration;
    private int releaseYear;
    private Language language;
    private String url;
    private String image;
}
