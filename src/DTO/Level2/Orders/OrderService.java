package DTO.Level2.Orders;
import java.util.UUID;

public class OrderService {
    private OrderRespository respository = new OrderRespository();
    private OrderMapper mapper = new OrderMapper();

    public OrderDTO createOrder (CreateOrderDTO dto) {
        String id = UUID.randomUUID().toString();
        String internalCode = "INT-" + id.substring(0, 5);

        Order order = mapper.toEntity(dto,id, internalCode);
        respository.save(order);

        return mapper.toDTO(order);
    }
}
