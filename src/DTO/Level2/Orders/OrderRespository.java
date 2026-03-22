package DTO.Level2.Orders;

import java.util.ArrayList;
import java.util.List;

public class OrderRespository {
    private List<Order> orders = new ArrayList<>();

    public void save (Order order) {
        orders.add(order);
    }

    public List<Order> findAll() {
        return orders;
    }
}
