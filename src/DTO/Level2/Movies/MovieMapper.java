package DTO.Level2.Movies;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MovieMapper {

    //DE ENTITY A DTO
    public MovieDTO toDTO (Movie movie) {
        return new MovieDTO(movie.getTitle(),movie.getDuration(), mapRatingLabel(movie.getRating()),mapFormatedDate(movie.getLocalDate()));
    }

    //DE DTO A ENTITY
    public Movie toEntity (CreateMovieDTO dto,String id, String internalNotes, LocalDate localDate) {
        return new Movie(id, dto.getTitle(), dto.getDuration(), dto.getRating(), internalNotes,localDate);
    }

    private RatingLabel mapRatingLabel (int rating) {
        return switch (rating) {
            case 1 -> RatingLabel.MALO;
            case 2 -> RatingLabel.MALO;
            case 3 -> RatingLabel.REGULAR;
            case 4 -> RatingLabel.BUENO;
            case 5 -> RatingLabel.EXCELENTE;
            default -> throw new IllegalStateException("Unexpected value: " + rating);
        };
    }

    private String mapFormatedDate (LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = localDate.format(formatter);
        return fechaFormateada;
    }
}
