package com.ctbe.Natnaelnigatu;

import com.ctbe.Natnaelnigatu.model.Product;
import com.ctbe.Natnaelnigatu.repository.ProductRepository;
import com.ctbe.Natnaelnigatu.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void findById_returnsProduct_whenProductExists() {

        // Arrange
        Product laptop = new Product("Laptop", 1200.0);
        laptop.setId(1L);

        when(productRepository.findById(1L)).thenReturn(Optional.of(laptop));

        // Act
        Optional<Product> result = productService.findById(1L);

        // Assert
        assertThat(result).isPresent();
        assertThat(result.get().getName()).isEqualTo("Laptop");
        assertThat(result.get().getPrice()).isEqualTo(1200.0);
    }

    @Test
    void findById_returnsEmpty_whenProductNotFound() {

        // Arrange
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        // Act
        Optional<Product> result = productService.findById(99L);

        // Assert
        assertThat(result).isEmpty();
    }
}