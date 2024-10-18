package iti.jets.Chicly.Spring.Boot.subproduct.service;


import iti.jets.Chicly.Spring.Boot.subproduct.domain.SubProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubProductService {
    SubProductRepository subProductRepository;

    @Autowired
    public SubProductService(SubProductRepository subProductRepository) {
        this.subProductRepository = subProductRepository;
    }
}
