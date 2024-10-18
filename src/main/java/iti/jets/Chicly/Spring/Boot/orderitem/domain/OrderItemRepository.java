package iti.jets.Chicly.Spring.Boot.orderitem.domain;


import iti.jets.Chicly.Spring.Boot.EntitiesEmbeddedId.OrderProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderProductId> {
}
