package POO.Level2.SistemEmpleados;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(long id, String name, double salarioMensual) {
        super(id, name);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
