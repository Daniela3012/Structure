package POO.Level1.Banco;

public class Cuenta {
    private ClientePerson titular;
    private String idCuenta;
    private double monto;

    public Cuenta(ClientePerson titular, String idCuenta, double monto) {
        this.titular = titular;
        this.idCuenta = idCuenta;
        this.monto = monto;
    }

    public ClientePerson getTitular() {
        return titular;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;

    }
}
