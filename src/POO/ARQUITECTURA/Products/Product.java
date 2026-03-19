package POO.ARQUITECTURA.Products;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private int supplier;

    public Product(String id, String name, double price, int stock, int supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getSupplier() {
        return supplier;
    }
}
