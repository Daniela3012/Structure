package DTO.Level2.Orders;

public class CreateOrderDTO {
    private String customerName;
    private double total;

    public CreateOrderDTO(String customerName, double total) {
        this.customerName = customerName;
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
        return total;
    }
}
