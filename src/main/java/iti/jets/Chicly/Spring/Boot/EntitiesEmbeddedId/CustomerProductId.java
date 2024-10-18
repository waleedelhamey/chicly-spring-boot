package iti.jets.Chicly.Spring.Boot.EntitiesEmbeddedId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CustomerProductId implements Serializable {
    private Integer customer;
    private Integer subProduct;
}