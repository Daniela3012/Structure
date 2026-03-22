package DTO.Level2.Orders;

public class OrderController {
    private OrderService service = new OrderService();

    public OrderDTO createOrder (CreateOrderDTO dto) {
        return service.createOrder(dto);
    }
}
