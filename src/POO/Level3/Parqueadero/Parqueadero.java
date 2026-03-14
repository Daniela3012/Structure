package POO.Level3.Parqueadero;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String name;
    private List<Espacio> espacios;
    private List<Ticket> tickets;

    public Parqueadero(String name) {
        this.name = name;
        espacios = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public Ticket crearTicket(TipoDeTicket tipo, Titular titular, Vehiculo vehiculo, Espacio espacio) {
        Ticket ticket = null;
        if (espacio.getEstado() == EstadoEspacio.LIBRE) {
            if (tipo == TipoDeTicket.REGULAR) {
                ticket = new TicketNormal(titular,vehiculo,espacio,30);
                System.out.println("Ticket creado correctamente");
            }
            if (tipo == TipoDeTicket.ILIMITADO) {
                ticket = new TicketIlimitado(titular,vehiculo,espacio);
                System.out.println("Ticket creado correctamente");
            }
            tickets.add(ticket);
            espacio.setEstado(EstadoEspacio.OCUPADO);
            return ticket;
        }
        return null;

    }
}
