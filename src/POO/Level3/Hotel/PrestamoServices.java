package POO.Level3.Hotel;

import java.time.LocalDate;
import java.util.List;


public class PrestamoServices {
    private PrestamoHistoricos conteos;

    public Reserva crearReserva (List<Reserva> reservas, Cliente cliente, Habitacion habitacion,LocalDate fechaDeReserva, int horas) {
        if (habitacion.disponibilidadHabitacion() && conteos.calcularResevarActivasCliente(reservas,cliente)<=2) {
            Reserva newReserva = new Reserva(cliente,habitacion,fechaDeReserva,horas);
            reservas.add(newReserva);
            return newReserva;
        }
        return null;
    }

    public void realizarCheckIn (List<Reserva> reservas, Cliente cliente, Habitacion habitacion, LocalDate fechaDeIngreso) {
        for (Reserva r : reservas) {
            if (r.getCliente().equals(cliente) && r.getHabitacion().equals(habitacion)) {
                if (fechaDeIngreso.isAfter(r.getFechaDeReserva()) || fechaDeIngreso.equals(r.getFechaDeReserva())) {
                    habitacion.ocuparHabitacion();
                }
            }
        }
    }

    public void realizarCheclOut (List<Reserva> reservas, Cliente cliente, Habitacion habitacion, LocalDate fechaDeSalida) {
        for (Reserva r: reservas) {
            if (r.getCliente().equals(cliente) && r.getHabitacion().equals(habitacion)) {
                if (r.calcularMulta(fechaDeSalida)>0) {
                    System.out.println("La multa es : "+r.calcularMulta(fechaDeSalida));
                    r.finalizarReserva(fechaDeSalida);
                } else {
                    System.out.println("Gracias por tu estancia");
                    r.finalizarReserva(fechaDeSalida);
                }
            }
        }
    }

    public void cancelarReserva (List<Reserva> reservas, Cliente cliente, Habitacion habitacion, LocalDate fechaDeSalida) {
        for (Reserva r: reservas) {
            if (r.getCliente().equals(cliente) && r.getHabitacion().equals(habitacion)) {
                if (r.calcularMulta(fechaDeSalida)>0) {
                    System.out.println("La multa es : "+r.calcularMulta(fechaDeSalida));
                    r.cancelarReserva();
                } else {
                    System.out.println("Gracias por tu estancia");
                    r.cancelarReserva();
                }
            }
        }
    }


}
