package POO.ARQUITECTURA.Products;

public class ProductDTO {
    private String id;
    private String name;
    private double price;
    private int stock;

    public ProductDTO(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
