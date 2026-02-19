package PAGE2.Level3.Biblioteca;

public class Libro {
    protected String name;
    protected EstadoLibro estado;

    public Libro(String name) {
        this.name = name;
        this.estado = EstadoLibro.LIBRE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EstadoLibro getEstadoDeLibro() {
        return estado;
    }

    public void setEstadoDeLibro(EstadoLibro estado) {
        this.estado = estado;
    }
}
