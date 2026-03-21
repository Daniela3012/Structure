package DTO.Level1.Transform2;

public class ProductDTO {
    private String name;
    private double price;
    private String status;

    public ProductDTO(String name, double price, String status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
