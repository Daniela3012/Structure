package POO.Level3.Parqueadero;

public abstract class Ticket {
    private Titular titular;
    private Vehiculo vehiculo;
    private Espacio espacio;
    private TipoDeTicket tipo;
    private EstadoTicket estado;

    public Ticket(Titular titular, Vehiculo vehiculo, Espacio espacio) {
        this.titular = titular;
        this.vehiculo = vehiculo;
        this.espacio = espacio;
        this.estado = EstadoTicket.INICIADO;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public TipoDeTicket getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeTicket tipo) {
        this.tipo = tipo;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    public EstadoTicket ticketPagado () {
        return this.estado = EstadoTicket.PAGADO;
    }

    public abstract double calculateTotal ();

}
