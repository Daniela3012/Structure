package DTO.Level2.Movies;

import java.time.LocalDate;
import java.util.UUID;

public class MovieService {
    private MovieRepository repository = new MovieRepository();
    private MovieMapper mapper = new MovieMapper();

    public MovieDTO createMovie (CreateMovieDTO dto) {
        String id = UUID.randomUUID().toString();
        String internalNotes = "INT-" + id.substring(0, 5);
        LocalDate date = LocalDate.now();
        Movie movie = mapper.toEntity(dto, id, internalNotes, date);
        repository.save(movie);
        return mapper.toDTO(movie);
    }
}
