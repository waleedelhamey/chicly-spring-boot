package iti.jets.Chicly.Spring.Boot.order.domain;

import iti.jets.Chicly.Spring.Boot.customer.domain.Customer;
import iti.jets.Chicly.Spring.Boot.orderitem.domain.OrderItem;
import iti.jets.Chicly.Spring.Boot.shared.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @NonNull
    private Status status = Status.PENDING;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}, orphanRemoval = true)
    private Set<OrderItem> orderItems = new HashSet<OrderItem>();


}
