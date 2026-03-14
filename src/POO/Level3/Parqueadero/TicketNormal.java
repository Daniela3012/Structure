package POO.Level3.Parqueadero;

public class TicketNormal extends Ticket{
    private int minutosEstablecidos;
    private int minutosPasados;

    public TicketNormal(Titular titular, Vehiculo vehiculo, Espacio espacio, int minutosEstablecidos) {
        super(titular, vehiculo, espacio);
        super.setTipo(TipoDeTicket.REGULAR);
        this.minutosEstablecidos = minutosEstablecidos;
    }

    @Override
    public double calculateTotal() {
        return (minutosEstablecidos*10)+(minutosPasados*12);
    }

    public void ingresarMinutosEstablecidos (int minutosPasados) {
        this.minutosPasados = minutosPasados;
    }

}
