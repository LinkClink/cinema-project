package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    Order create(Order order);

    List<Order> getOrdersHistory(User user);
}
