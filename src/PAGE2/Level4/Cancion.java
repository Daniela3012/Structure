package PAGE2.Level4;

public class Cancion {
    private String nombre;
    private String cantante;

    public Cancion(String nombre, String compositor) {
        this.nombre = nombre;
        this.cantante = compositor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcantante() {
        return cantante;
    }

    public void setcantante(String compositor) {
        this.cantante = compositor;
    }
}
