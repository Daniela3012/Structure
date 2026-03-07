package POO.Level1.CuentaBancaria;

public class Cuenta {
    private Titular titular;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(Titular titular, String numeroCuenta,double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void agregarDinero (double monto) {
        saldo = saldo + monto;
        System.out.println("Monto agregado exitosamente");
    }

    public void retirarDinero (double monto ) {
        if (saldo >= monto) {
            saldo = saldo-monto;
            System.out.println("Monto retirado exitosamente");
        } else {
            System.out.println("No se pudo retirar monto, saldo insuficiente!");
        }
    }
}
