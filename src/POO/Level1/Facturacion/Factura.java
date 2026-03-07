package POO.Level1.Facturacion;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factura {
    private Date date;
    private Cliente client;
    private Map<Producto, Integer> factura;

    public Factura(Date date, Cliente client) {
        this.date = date;
        this.client = client;
        this.factura = new HashMap<>();
    }

    public Date getDate() {
        return date;
    }

    public Cliente getClient() {
        return client;
    }

    public void addProduct (Producto product, Integer quantity) {
        factura.put(product, quantity);
    }

    public Double getTotalPrice () {
        if (factura.isEmpty()) {
            return 0.0;
        }
        double totalPrice = 0;
        for (Map.Entry<Producto, Integer> entry : factura.entrySet()) {
            totalPrice += entry.getValue()*entry.getKey().getPrice();
        }
        Double total = Math.round(totalPrice * 100.0)/100.0;
        return total;
    }


}
