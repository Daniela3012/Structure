package POO.Level3.BibliotecaGrande;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaGrande {
    private String name;
    private List<Prestamo> prestamos;

    public BibliotecaGrande(String name) {
        this.name = name;
        this.prestamos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Prestamo crearPrestamo (Usuario user, Libro libro, LocalDate fechaDeInicio) {
        Prestamo p = new Prestamo(user,libro,fechaDeInicio);
        prestamos.add(p);
        return p;
    }

    public boolean validarSiPuedePrestarse(String nameUsuario) {
        int librosPrestados = HistoricosDeEntidades.calcularLibrosPrestadosPorUsuarioEstadoActivo(prestamos, nameUsuario);
        if (librosPrestados>=0 && librosPrestados<3) {
            return true;
        }
        return false;
    }
    public int calcularLibrosActivosDeUsuario (String nameUsuario) {
        return HistoricosDeEntidades.calcularLibrosPrestadosPorUsuarioEstadoActivo(prestamos, nameUsuario);
    }

    public void verHistorialDeLibros (String nameLibro) {
        HistoricosDeEntidades.verHistorialDeLibros(prestamos, nameLibro);
    }

    public void verHistorialDeUsuario (String nameUsuario) {
        HistoricosDeEntidades.verHistorialDeUsuario(prestamos, nameUsuario);
    }

    public void devolverLibro (String nameLibro, String nameUsuario, LocalDate fechaDeDevolucion) {
        if (HistoricosDeEntidades.validarMulta(prestamos,nameLibro,fechaDeDevolucion)) {
            System.out.println("La multa es: "+HistoricosDeEntidades.mostrarMontoDeMulta(prestamos, nameLibro, fechaDeDevolucion));
            HistoricosDeEntidades.devolverLibro(prestamos, nameLibro,nameUsuario, fechaDeDevolucion);
        } else {
            HistoricosDeEntidades.devolverLibro(prestamos, nameLibro, nameUsuario,fechaDeDevolucion);
        }
    }


}
