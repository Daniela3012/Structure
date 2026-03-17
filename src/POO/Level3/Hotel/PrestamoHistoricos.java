package POO.Level3.Hotel;

import java.util.List;

public class PrestamoHistoricos {
    public int calcularResevarActivasCliente (List<Reserva> reservas, Cliente cliente) {
        int reservasActivasCliente = 0;
        for (Reserva r : reservas) {
            if (r.getEstado().equals(EstadoReserva.ACTIVA) && r.getCliente().equals(cliente)) {
                reservasActivasCliente++;
            }
        }
        return reservasActivasCliente;
    }

}
