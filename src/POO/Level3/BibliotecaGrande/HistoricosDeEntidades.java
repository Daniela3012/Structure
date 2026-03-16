package POO.Level3.BibliotecaGrande;

import java.time.LocalDate;
import java.util.List;

public class HistoricosDeEntidades {
    public static void verHistorialDeLibros (List<Prestamo> prestamos,String nameLibro) {
        System.out.println("El libro: "+nameLibro);
        System.out.println("Usuarios a los que se les presto: ");
        int cantidadDeVecesPrestado = 0;
        for (Prestamo p : prestamos) {
            if (p.getLibro().getName().equals(nameLibro)) {
                System.out.println(p.getUsuario().getName());
               cantidadDeVecesPrestado++;
            }
        }
        System.out.println("Cantidad de veces prestado: "+cantidadDeVecesPrestado);
    }

    public static void verHistorialDeUsuario (List<Prestamo> prestamos, String nameUsuario) {
        System.out.println("El Usuario: "+nameUsuario);
        System.out.println("Libros que tomo prestado: ");
        int cantidadDeLibrosPrestados = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().getName().equals(nameUsuario)) {
                System.out.println(p.getUsuario().getName());
                cantidadDeLibrosPrestados++;
            }
        }
        System.out.println("Cantidad de libros prestados: "+cantidadDeLibrosPrestados);
    }

    public static int calcularLibrosPrestadosPorUsuarioEstadoActivo (List<Prestamo>  prestamos, String nameUsuario) {
        int cantidadLibros = 0;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().getName().equals(nameUsuario) && p.getEstado().equals(EstadoPrestamo.ACTIVO)) {
                cantidadLibros++;
            }
        }
        return cantidadLibros;
    }

    public static boolean validarMulta (List<Prestamo> prestamos, String nameLibro, LocalDate fechaDeDevolucion) {
        for (Prestamo p : prestamos) {
            if (p.getLibro().getName().equals(nameLibro)) {
                if (p.calcularMulta(fechaDeDevolucion)>0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double mostrarMontoDeMulta (List<Prestamo> prestamos, String nameLibro, LocalDate fechaDeDevolucion) {
        for (Prestamo p : prestamos) {
            if (p.getLibro().getName().equals(nameLibro)) {
                if (p.calcularMulta(fechaDeDevolucion)>0) {
                    return p.calcularMulta(fechaDeDevolucion);
                }
            }
        }
        return 0;
    }

    public static void devolverLibro (List<Prestamo> prestamos, String nameUsuario, String nameLibro, LocalDate fechaDeDevolucion) {
        for (Prestamo p : prestamos) {
            if (p.getLibro().getName().equals(nameLibro) && p.getUsuario().getName().equals(nameUsuario)) {
                p.getLibro().setEstado(EstadoDeLibro.LIBRE);
                p.setEstado(EstadoPrestamo.DESACTIVADO);
                p.setFechaDeDevolucion(fechaDeDevolucion);
            }
        }
    }


}
