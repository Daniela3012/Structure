package DTO.Level2.Orders;

public class Order {
    private String id;
    private String customerName;
    private double total;
    private String internalCode;

    public Order(String id, String customerName, double total, String internalCode) {
        this.id = id;
        this.customerName = customerName;
        this.total = total;
        this.internalCode = internalCode;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
        return total;
    }

    public String getInternalCode() {
        return internalCode;
    }
}
