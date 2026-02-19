package POO.Classes;

import POO.Interfaces.InventoryManageable;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventoryManageable {
    protected List<Product> products = new ArrayList<>();

    public Inventory(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void generarReporte() {

    };

    public void analizarInventario() {

    };

    @Override
    public void addItem() {

    }

    @Override
    public void deleteItem() {

    }

    @Override
    public void listItems() {

    }

    @Override
    public void findItemById() {

    }
}
