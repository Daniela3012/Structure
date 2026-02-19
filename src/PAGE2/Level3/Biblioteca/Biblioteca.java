package PAGE2.Level3.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    protected List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }


    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public boolean prestarLibro(String nameLibro) {
       for (Libro l : libros) {
           if (l.getName().equals(nameLibro) && l.getEstadoDeLibro()==EstadoLibro.LIBRE) {
               l.setEstadoDeLibro(EstadoLibro.PRESTADO);
               return true;
           }
       }
       return false;
    }

    public void mostrarDisponibles(){
        libros.stream().filter(l->l.getEstadoDeLibro()==EstadoLibro.LIBRE)
                .forEach(l-> System.out.println(l.getName()));
    }
}
