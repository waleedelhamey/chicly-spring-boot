package iti.jets.Chicly.Spring.Boot.subproduct.domain;

import iti.jets.Chicly.Spring.Boot.product.domain.Product;
import iti.jets.Chicly.Spring.Boot.shared.enums.Color;
import iti.jets.Chicly.Spring.Boot.shared.enums.Size;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subProduct")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class SubProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @NonNull
    @NotNull
    private Size size;

    @NonNull
    private Integer stock;

    @Enumerated(EnumType.STRING)
    @NonNull
    @NotNull
    private Color color;
    @NonNull
    @NotNull
    private BigDecimal price;

    private String imageURL;

    private Boolean isDeleted = false;

    private Boolean isNewArrival = false;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;




}