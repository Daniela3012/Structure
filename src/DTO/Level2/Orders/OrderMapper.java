package DTO.Level2.Orders;

public class OrderMapper {
    public Order toEntity (CreateOrderDTO dto, String id, String internalCode) {
        return new Order(id,dto.getCustomerName(), dto.getTotal(), internalCode);
    }

    public OrderDTO toDTO (Order order) {
        return new OrderDTO(order.getCustomerName(), order.getTotal());
    }

}
