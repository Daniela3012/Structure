package POO.Level3.Hotel;

public class Cliente {
    private String DNI;
    private String name;

    public Cliente(String DNI, String name) {
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
