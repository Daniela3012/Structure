package POO.Level1.ReservaHotel;

public class Habitacion {
    private EstadoHabitacion estado;
    private String cod;

    public Habitacion(String cod) {
        this.cod = cod;
        this.estado = EstadoHabitacion.LIBRE;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }
}
