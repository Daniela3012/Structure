package DTO.Level2.Movies;

import java.time.LocalDate;


public class Movie {
    private String id;
    private String title;
    private int duration;
    private int rating;
    private String internalNotes;
    private LocalDate localDate;

    public Movie(String id, String title, int duracion, int rating, String internalNotes, LocalDate localDate) {
        this.id = id;
        this.title = title;
        this.duration = duracion;
        this.rating = rating;
        this.internalNotes = internalNotes;
        this.localDate = localDate;
    }

    public String getId() {
        return id;
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

    public String getInternalNotes() {
        return internalNotes;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
