package POO.Level1.Banco;

public class Transaccion {
    private ClientePerson persona;
    private Cuenta cuenta;
    private double monto;
    private TipoTransaccion tipoTransaccion;

    public Transaccion(ClientePerson persona, Cuenta cuenta, double monto, TipoTransaccion tipoTransaccion) {
        this.persona = persona;
        this.cuenta = cuenta;
        this.monto = monto;
        this.tipoTransaccion = tipoTransaccion;
    }

    public ClientePerson getPersona() {
        return persona;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }
}
