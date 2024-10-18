package iti.jets.Chicly.Spring.Boot.product.domain;

import iti.jets.Chicly.Spring.Boot.shared.enums.Gender;
import iti.jets.Chicly.Spring.Boot.subcategory.domain.SubCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String description;

    @NonNull
    @NotEmpty
    private String name;

    @Enumerated(EnumType.STRING)
    @NonNull
    @NotNull
    private Gender gender;

    @NonNull
    private String isDeleted;


    @ManyToOne
    @JoinColumn(name = "subCategory_id")
    private SubCategory subCategory;

}
