package PAGE2.Level3.Listapeliculas;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {
    protected List<Pelicula> favorites;

    public Favoritos() {
        this.favorites = new ArrayList<>();
    }

    public List<Pelicula> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Pelicula> favorites) {
        this.favorites = favorites;
    }

    public void addMovie (Pelicula movie) {
        favorites.add(movie);
    }

    public boolean findMovie(String name) {

        return favorites.stream().anyMatch(p->p.getName().equals(name));
    }
}
