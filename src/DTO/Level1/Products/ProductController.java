package DTO.Level1.Products;

import java.util.List;

public class ProductController {
    private ProductService service = new ProductService();

    public List<ProductDTO> getProduct () {
        return service.getAll();
    }
}
