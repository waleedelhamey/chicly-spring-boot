package iti.jets.Chicly.Spring.Boot.product.service;

import iti.jets.Chicly.Spring.Boot.product.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository ;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
