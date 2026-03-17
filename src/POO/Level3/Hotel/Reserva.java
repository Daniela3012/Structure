package POO.Level3.Hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private EstadoReserva estado;
    private LocalDate fechaDeReserva;
    private LocalDate fechaFinReserva;
    private LocalDate fechaDeSalida;
    private int horasAReservar;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaDeReserva, int horasAReservar) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaDeReserva = fechaDeReserva;
        this.horasAReservar = horasAReservar;
        this.estado = EstadoReserva.ACTIVA;
        this.habitacion.reservarHabitacion();
        this.fechaFinReserva = calcularFechaFinReserva(horasAReservar);
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaDeReserva() {
        return fechaDeReserva;
    }

    public double calcularMontoInicial (int horasAReservar) {
        return horasAReservar*20;
    }

    public double calcularMontoTotal (LocalDate fechaDeSalida) {
        return calcularMulta(fechaDeSalida) + calcularMontoInicial(horasAReservar);
    }

    public void cancelarReserva () {
            this.estado = EstadoReserva.CANCELADO;
            this.habitacion.liberarHabitacion();
    }

    public void finalizarReserva (LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
        this.estado = EstadoReserva.FINALIZADO;
        habitacion.liberarHabitacion();
    }

    public double calcularMulta (LocalDate fechaDeSalida) {
        if (fechaDeSalida.isAfter(fechaFinReserva)) {
            long horas = ChronoUnit.HOURS.between(
                    fechaDeSalida.atStartOfDay(),
                    fechaFinReserva.atStartOfDay());
            return horas*12;
        }
        return 0;
    }

    public LocalDate calcularFechaFinReserva (int horasAReservar) {
        LocalDate resultado = fechaDeReserva
                .atStartOfDay()
                .plusHours(horasAReservar)
                .toLocalDate();
        return fechaFinReserva;
    }
}
