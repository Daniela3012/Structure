package POO.Level1.Banco;

import POO.Level1.ReservaHotel.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Cajero {
    private List<Transaccion> transaccions;

    public Cajero () {
        transaccions = new ArrayList<>();
    }

    public double ingresarDinero (ClientePerson cliente, Cuenta cuenta, double monto) {
        double nuevoMonto = cuenta.getMonto()+monto;
        cuenta.setMonto(nuevoMonto);
        Transaccion newTransaction = new Transaccion(cliente,cuenta,monto,TipoTransaccion.ABONO);
        transaccions.add(newTransaction);
        return nuevoMonto;
    }

    public double retirarDinero (ClientePerson cliente, Cuenta cuenta, double monto) {
        double nuevoMonto;
        if (cuenta.getMonto()<monto) {
            return -1;
        } else {
            Transaccion newTransaction = new Transaccion(cliente,cuenta,monto,TipoTransaccion.CARGO);
            transaccions.add(newTransaction);
            nuevoMonto = cuenta.getMonto()-monto;
            cuenta.setMonto(nuevoMonto);
            return nuevoMonto;
        }
    }

    public boolean validarPIN (ClientePerson cliente, String pin) {
        if (cliente.getPin().equals(pin)) {
            return true;
        } else {
            return false;
        }
    }
}
