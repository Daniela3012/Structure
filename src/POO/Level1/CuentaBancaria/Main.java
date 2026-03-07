package POO.Level1.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        Titular daniela = new Titular("Daniela");
        Cuenta micuenta = new Cuenta(daniela,"193-456654-01",500000);
        micuenta.agregarDinero(1000000);
        System.out.println(micuenta.getSaldo());
        micuenta.retirarDinero(25000);
        System.out.println(micuenta.getSaldo());
    }
}
