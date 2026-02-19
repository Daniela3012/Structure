package POO.Classes;

import POO.Interfaces.InventoryManageable;

public class Electronics extends Product implements InventoryManageable {
    protected String brand;
    protected String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

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
