package com.ctbe.Natnaelnigatu.service;

import com.ctbe.Natnaelnigatu.model.Product;
import com.ctbe.Natnaelnigatu.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor Injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Return all products
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Return product by ID
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    // Save a product
    public Product save(Product product) {
        return productRepository.save(product);
    }
}