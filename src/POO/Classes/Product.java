package POO.Classes;

import POO.Interfaces.Priceable;

public abstract  class Product implements Priceable {
    protected long productId;
    protected double price;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void reponerStock(){

    };

    public void conteoProducto() {

    };

    @Override
    public void getPrice() {

    }

    @Override
    public void setPrice() {

    }
}
