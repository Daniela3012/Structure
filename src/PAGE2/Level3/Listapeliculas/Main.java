package PAGE2.Level3.Listapeliculas;

public class Main {
    public static void main(String[] args) {

        Favoritos favs = new Favoritos();
        favs.addMovie(new Pelicula("Avatar 1"));
        favs.addMovie(new Pelicula("Intesamente"));
        favs.addMovie(new Pelicula("Avatar 2"));

        System.out.println(favs.findMovie("Avatar 1"));
        System.out.println(favs.findMovie("Avatar 3"));
    }
}
