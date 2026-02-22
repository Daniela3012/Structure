package PAGE2.Level6.Restaurant;

public class Plato {
    private String plate;
    private double cost;
    private int orderAssociate;

    public Plato(String plate, double cost) {
        this.plate = plate;
        this.cost = cost;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getoOderAssociate() {
        return orderAssociate;
    }

    public void setOrderAssociate(int orderAssociate) {
        this.orderAssociate = orderAssociate;
    }
}
