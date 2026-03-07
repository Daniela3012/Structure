package POO.Level1.TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> products;
    private Cliente client;

    public Carrito(Cliente client) {
        products = new ArrayList<Producto>();
        this.client = client;
    }

    public Cliente getClient() {
        return client;
    }

    public void addProduct (Producto product) {
        products.add(product);
    }

    public void removeProduct (String nameProduct) {
        if (products.isEmpty()) {
            System.out.println("No tiene productos");
        } else {
            products.removeIf(p->p.getName().equals(nameProduct));
        }
    }

    public void showProducts () {
        for (Producto p: products) {
            System.out.println("Product : "+p.getName()+" cuesta "+p.getPrice());
        }
    }


}
