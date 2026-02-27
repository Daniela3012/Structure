package PAGE2.Level7.Facturacion;





import java.util.HashMap;
import java.util.Map;

public class Factura {
    private Map<String, Double> factura;
    private Double total;

    public Factura() {
        this.factura = new HashMap<>();
    }

    public void addProducts (String produc, Double price) {
        Producto myProduct = new Producto(produc, price);
        factura.put(produc, price);
    }

    public Double calculateTotal () {
        double totalProd = 0;
        for (Double p : factura.values()) {
            totalProd += p;
        }

        this.total = totalProd;
        return Math.round(totalProd * 100.0) / 100.0;
    }

    public String showExpensiveProduct () {
        if (factura.isEmpty()) {
            return null;
        }
        String productMoreExpensive = null;
        double precioMax = Double.MIN_VALUE;

        for (Map.Entry<String,Double> entry : factura.entrySet()) {
            if (entry.getValue() > precioMax) {
                precioMax = entry.getValue();
                productMoreExpensive = entry.getKey();
            }
        }
        return productMoreExpensive;
    }
}
