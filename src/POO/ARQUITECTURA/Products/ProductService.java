package POO.ARQUITECTURA.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private ProductRepository repository = new ProductRepository();

    public List<ProductDTO> getAll () {
        List<Product> products = repository.findAll();
        List<ProductDTO> result = new ArrayList<>();

        for (Product p : products) {
            result.add(new ProductDTO(p.getId(), p.getName(), p.getPrice(), p.getStock()));
        }
        return result;

    }

}
