package iti.jets.Chicly.Spring.Boot.subproduct.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubProductRepository extends JpaRepository<SubProduct,Integer> {
}
