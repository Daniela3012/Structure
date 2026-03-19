package POO.ARQUITECTURA.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> findAll () {
        List<Product> products = new ArrayList<>();

        products.add(new Product("001", "Daniela", 12.2, 3,4));
        products.add(new Product("001", "Adre", 12.2, 3,4));
        products.add(new Product("001", "Dylan", 12.2, 3,4));

        return products;
    }
}
