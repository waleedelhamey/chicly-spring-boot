package iti.jets.Chicly.Spring.Boot.shared.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Address {
    @NonNull
    @NotEmpty
    private String street;
    @NonNull
    @NotEmpty
    private String city;

    @NonNull
    @NotEmpty
    private String zip;
    private String description;
}