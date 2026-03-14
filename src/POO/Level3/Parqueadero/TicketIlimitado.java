package POO.Level3.Parqueadero;

public class TicketIlimitado extends Ticket {
    private int minutosTotales;

    public TicketIlimitado(Titular titular, Vehiculo vehiculo, Espacio espacio) {
        super(titular, vehiculo, espacio);
        super.setTipo(TipoDeTicket.ILIMITADO);
    }

    @Override
    public double calculateTotal() {
        return minutosTotales*8;
    }

    public void ingresarMinutosTotales (int minutosTotales) {
        this.minutosTotales = minutosTotales;

    }
}
