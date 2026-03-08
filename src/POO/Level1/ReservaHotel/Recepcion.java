package POO.Level1.ReservaHotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcion {
    private List<Reserva> reservas;
    private List<Habitacion> habitaciones;

    public Recepcion () {
        reservas = new ArrayList<>();
        habitaciones = new ArrayList<>();
    }


    public void crearReserva (Cliente cliente, Habitacion habitacion) {
        if (EstadoHabitacion.LIBRE == habitacion.getEstado()) {
            Reserva rsva = new Reserva(cliente, habitacion);
            habitacion.setEstado(EstadoHabitacion.OCUPADO);
            reservas.add(rsva);
        } else {
            System.out.println("La habitacion esta ocupada");
        }
    }

    public void agregarHabitacion (Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public EstadoHabitacion consultarEstadoHabitacion (Habitacion habitacion) {
        return habitacion.getEstado();
    }
    public Cliente consultarQuienOcupaHabitacion (Habitacion habitacion) {
        for (Reserva r: reservas) {
            if (r.getHabitacion().equals(habitacion)) {
                return r.getCliente();
            }
        }
        return null;
    }

    public void mostrarLibres () {
        for (Habitacion h : habitaciones) {
            if (h.getEstado() == EstadoHabitacion.LIBRE) {
                System.out.println("La habitacion "+h.getCod()+" esta "+h.getEstado());
            }
        }
    }

}
