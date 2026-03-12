package POO.Level2.SistemaPago;

public class Tarjeta implements MetodoPago{
    @Override
    public void pagar() {
        System.out.println("Estoy pagando con tarjeta");
    }
}
