package POO.Level3.Parqueadero;

public class Titular {
    private String DNI;
    private String name;

    public Titular(String DNI, String name) {
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
