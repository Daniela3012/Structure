package POO.Level3.BibliotecaGrande;

import java.time.LocalDate;
import java.util.List;

public class PrestamoService {
    public Prestamo prestarLibro (List<Prestamo> prestamos, Usuario usuario, Libro libro, LocalDate fechaDeInicio) {
        if (!validarDisponibilidadLibro(libro)) {
            throw new RuntimeException("El libro ya está prestado");
        }

        if (!validarUsuarioPuedePrestar(prestamos, usuario)) {
            throw new RuntimeException("El usuario ya tiene 3 préstamos activos");
        }

        Prestamo prestamo = new Prestamo(usuario, libro, fechaDeInicio);
        prestamos.add(prestamo);

        return prestamo;


    }

    public double devolverLibro (List<Prestamo> prestamos, Usuario usuario, Libro libro, LocalDate fechaDeDevolucion) {
        double multa = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario) && p.getLibro().equals(libro) && p.getEstado().equals(EstadoPrestamo.ACTIVO)) {
                multa = p.calcularMulta(fechaDeDevolucion);
                p.devolverLibro(fechaDeDevolucion);
            }
        }
        return multa;
    }

    public boolean validarDisponibilidadLibro (Libro libro) {
        return libro.getEstado() == EstadoDeLibro.LIBRE;
    }

    public boolean validarUsuarioPuedePrestar (List<Prestamo> prestamos, Usuario usuario) {
        int librosPrestadosAUsuario = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario) && p.getEstado().equals(EstadoPrestamo.ACTIVO)) {
                librosPrestadosAUsuario++;
            }
        }
        return librosPrestadosAUsuario<3;
    }
}
