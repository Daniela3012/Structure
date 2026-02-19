package PAGE2.Level3.Biblioteca;

import PAGE2.Level3.Listapeliculas.Pelicula;

public class Main {
    public static void main(String[] args) {
        Biblioteca myLibrary = new Biblioteca();
        myLibrary.agregarLibro(new Libro("Yo Robot"));
        myLibrary.agregarLibro(new Libro("xxx"));
        myLibrary.agregarLibro(new Libro("gfdgdsg"));
        myLibrary.agregarLibro(new Libro("gfdgdsg"));
        myLibrary.agregarLibro(new Libro("gfdfhdgdsg"));
        myLibrary.agregarLibro(new Libro("gfdgdasaasg"));
        myLibrary.agregarLibro(new Libro("gfdgdsq2wwg"));
        myLibrary.agregarLibro(new Libro("gfdg"));

        myLibrary.mostrarDisponibles();

        myLibrary.prestarLibro("Yo Robot");


        for (Libro l : myLibrary.getLibros()) {
            if (l.getName().equals("Yo Robot")) {
                System.out.println("El estadp del libro "+l.getName()+" es : "+l.getEstadoDeLibro());
            }
        }
    }
}
