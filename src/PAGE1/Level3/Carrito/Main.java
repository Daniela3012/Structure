package PAGE1.Level3.Carrito;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> misCompras = new ArrayList<>();
        misCompras.add(new Product(200, "Teclado"));
        misCompras.add(new Product(60, "funda de tablet"));
        misCompras.add(new Product(50000, "Geep Wrangler"));

        double montoTotal = 0;
        for (Product p : misCompras) {
            montoTotal += p.getPriceProduct();
        }

        System.out.println("El total a pagar es : "+montoTotal+" soles");
    }
}
