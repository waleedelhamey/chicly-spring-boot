package iti.jets.Chicly.Spring.Boot.EntitiesEmbeddedId;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderProductId implements Serializable {

    private Integer order; // Use Integer if order ID is Integer

    private Integer productId; // Assuming you also need a product ID

    // Default constructor
    public OrderProductId() {}

    // Getters and setters...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderProductId)) return false;
        OrderProductId that = (OrderProductId) o;
        return Objects.equals(order, that.order) && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, productId);
    }
}