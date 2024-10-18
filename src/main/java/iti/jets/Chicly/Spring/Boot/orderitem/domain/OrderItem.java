package iti.jets.Chicly.Spring.Boot.orderitem.domain;
import iti.jets.Chicly.Spring.Boot.EntitiesEmbeddedId.OrderProductId;
import iti.jets.Chicly.Spring.Boot.order.domain.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
@Getter
@Setter
@IdClass(OrderProductId.class) // This indicates a composite key
@Entity // Marking the class as a JPA entity
@Table(name = "order_item") // Optional: Specify the table name if needed
@NoArgsConstructor
public class OrderItem {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order; // Establishing the relationship with the Order entity

    @Id
    @Column(name = "product_id") // Specify the column name for the composite key
    private Integer productId; // Assuming you will have a product ID as part of the composite key

    private Integer quantity = 1;

    private BigDecimal price;
}