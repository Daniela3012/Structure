package DTO.Level2.Movies;

public class CreateMovieDTO {
    private String title;
    private int duration;
    private int rating;

    public CreateMovieDTO(String title, int duration, int rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }
}
