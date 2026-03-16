package POO.Level3.BibliotecaGrande;

public class Libro {
    private String name;
    private EstadoDeLibro estado;

    public Libro(String name) {
        this.name = name;
        this.estado = EstadoDeLibro.LIBRE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EstadoDeLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeLibro estado) {
        this.estado = estado;
    }
}
