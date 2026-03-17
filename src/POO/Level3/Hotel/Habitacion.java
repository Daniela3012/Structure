package POO.Level3.Hotel;


public class Habitacion {
    private String codId;
    private EstadoHabitacion estado;

    public Habitacion(String codId) {
        this.codId = codId;
        this.estado = EstadoHabitacion.LIBRE;
    }

    public String getCodId() {
        return codId;
    }

    public boolean disponibilidadHabitacion() {
        if (estado.equals(EstadoHabitacion.LIBRE)) {
            return true;
        }
        if (estado.equals(EstadoHabitacion.OCUPADO) || estado.equals(EstadoHabitacion.RESERVADO)) {
            return false;
        }
        return false;
    }

    public EstadoHabitacion estadoHabitacion () {
        return estado;
    }

    public void ocuparHabitacion () {
        estado = EstadoHabitacion.OCUPADO;
    }

    public void reservarHabitacion () {
        estado = EstadoHabitacion.RESERVADO;
    }

    public void liberarHabitacion () {
        estado = EstadoHabitacion.LIBRE;
    }
}
