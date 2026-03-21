package DTO.Level1.Transform2;

public class ProductMapper {

    public ProductMapper () {}

    public ProductDTO toDTO (Product product) {
        if (product == null) return null;
        return new ProductDTO(product.getName(), product.getPrice(), mapStatus(product.getStock()));
    }

    private String mapStatus (int stock) {
       if (stock == 0) {
           return "Sin stock";
       }
       if (stock > 0) {
           return "Disponible";
       }

       return "No identificado";
    }
}
