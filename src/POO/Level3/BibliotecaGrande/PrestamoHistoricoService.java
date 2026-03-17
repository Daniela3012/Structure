package POO.Level3.BibliotecaGrande;

import java.util.List;

public class PrestamoHistoricoService {

    public void historialLibro (List<Prestamo> prestamos, Libro libro) {
        for (Prestamo p : prestamos) {
            if (p.getLibro().equals(libro)) {
                System.out.println("Usuario prestado : "+p.getUsuario()+" y devolvio el dia : "+p.getFechaDeDevolucion());
            }
        }
    }

    public void historialUsuario (List<Prestamo> prestamos, Usuario usuario) {
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario)) {
                System.out.println("Libro prestado : "+p.getLibro()+" y devolvio el dia : "+p.getFechaDeDevolucion());
            }
        }
    }

    public void calcularPrestamosActivosUsuario (List<Prestamo> prestamos, Usuario usuario) {
        int cantidadPrestamosActivos = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario) && p.getEstado().equals(EstadoPrestamo.ACTIVO)) {
                cantidadPrestamosActivos++;
            }
        }
        System.out.println("El usuario "+usuario.getName()+" tiene "+cantidadPrestamosActivos+" libros prestados");
    }
}
