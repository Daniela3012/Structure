package POO.Classes;

import POO.Interfaces.InventoryManageable;

public class Clothing extends Product implements InventoryManageable {
    protected int size;
    protected String material;

    public Clothing(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
