package DTO.Level2.Movies;

import java.time.LocalDate;

public class MovieDTO {
    private String title;
    private int duration;
    private RatingLabel ratingLabel;
    private String releaseDate;

    public MovieDTO(String title, int duration, RatingLabel ratingLabel, String releaseDate) {
        this.title = title;
        this.duration = duration;
        this.ratingLabel = ratingLabel;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public RatingLabel getRatingLabel() {
        return ratingLabel;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
