package POO.Level2.SistemEmpleados;

public class EmpleadoHorasTrabajadas extends Empleado {
    private int horaTrabajadas;
    private double tarifa;

    public EmpleadoHorasTrabajadas(long id, String name, int horasTrabajas, double tarifa) {
        super(id, name);
        this.horaTrabajadas = horasTrabajas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSalario() {
        return horaTrabajadas*tarifa;
    }

}
