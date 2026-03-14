package POO.Level2.SistemEmpleados;

public abstract class Empleado {
    private long id;
    private String name;

    public Empleado(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double calcularSalario();

}
