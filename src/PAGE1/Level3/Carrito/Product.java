package PAGE1.Level3.Carrito;

public class Product {
    private String nameProduct;
    private double priceProduct;

    public Product(double priceProduct, String nameProduct) {
        this.priceProduct = priceProduct;
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
}
