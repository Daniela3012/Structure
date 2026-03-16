package POO.Level3.BibliotecaGrande;

public class Usuario {
    private String DNI;
    private String name;

    public Usuario(String DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }
}
