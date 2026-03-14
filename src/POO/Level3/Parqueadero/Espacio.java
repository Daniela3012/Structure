package POO.Level3.Parqueadero;

public class Espacio {
    private String codId;
    private EstadoEspacio estado;

    public Espacio(String codId) {
        this.codId = codId;
        estado = EstadoEspacio.LIBRE;
    }

    public String getCodId() {
        return codId;
    }

    public EstadoEspacio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEspacio estado) {
        this.estado = estado;
    }
}
