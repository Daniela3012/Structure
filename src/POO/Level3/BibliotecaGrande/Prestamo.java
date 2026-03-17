package POO.Level3.BibliotecaGrande;

import javax.print.attribute.DateTimeSyntax;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private EstadoPrestamo estado;
    private LocalDate fechaDeInicio;
    private LocalDate fechaFin;
    private LocalDate fechaDeDevolucion;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaDeInicio) {
        this.usuario = usuario;
        this.libro = libro;
        this.libro.setEstado(EstadoDeLibro.PRESTADO);
        this.estado = EstadoPrestamo.ACTIVO;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaFin = fechaDeInicio.plusDays(7);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaFin = fechaDeInicio.plusDays(7);
        this.fechaDeInicio = fechaDeInicio;
    }


    public void devolverLibro (LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
        setEstado(EstadoPrestamo.DESACTIVADO);
        libro.setEstado(EstadoDeLibro.LIBRE);
    }

    public double calcularMulta (LocalDate fechaDeDevolucion) {
        double multa = 0;
        int diasRetrazo = 0;
        this.fechaDeDevolucion = fechaDeDevolucion;
        diasRetrazo = (int) ChronoUnit.DAYS.between(fechaFin, fechaDeDevolucion);
        if (diasRetrazo >0) {
           return multa=diasRetrazo*10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "usuario=" + usuario.getName() +
                ", libro=" + libro.getName() +
                ", estado=" + estado +
                ", fechaDeInicio=" + fechaDeInicio +
                ", fechaFin=" + fechaFin +
                ", fechaDeDevolucion=" + fechaDeDevolucion +
                '}';
    }
}
