package br.com.content4devs.service;

import br.com.content4devs.domain.Product;
import br.com.content4devs.dto.ProductInputDTO;
import br.com.content4devs.exception.AlreadyExistsException;
import br.com.content4devs.exception.NotFoundException;
import br.com.content4devs.repository.ProductRepository;
import br.com.content4devs.service.impl.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.groups.Tuple.tuple;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    @DisplayName("when create product service is call with valid data a product is returned")
    public void createProductSuccessTest() {
        var productCreated = new Product(1L, "product name", 10.00, 10);

        when(productRepository.save(any())).thenReturn(productCreated);

        var productInput = new ProductInputDTO("product name", 10.00, 10);

        var productOutputDTO = productService.create(productInput);

        assertThat(productOutputDTO)
                .usingRecursiveComparison()
                .isEqualTo(productCreated);
    }

    @Test
    @DisplayName("when create product service is call with duplicated name, throw AlreadyExistsException")
    public void createProductExceptionTest() {
        var product = new Product(1L, "product name", 10.00, 10);

        when(productRepository.findByNameIgnoreCase(any())).thenReturn(Optional.of(product));

        var productInput = new ProductInputDTO("product name", 10.00, 10);

        assertThatExceptionOfType(AlreadyExistsException.class)
                .isThrownBy(() -> productService.create(productInput));
    }

    @Test
    @DisplayName("when findById product service is call with valid id a product is returned")
    public void findProductByIdSuccessTest() {
        var id = 1L;
        var productCreated = new Product(1L, "product name", 10.00, 10);

        when(productRepository.findById(any())).thenReturn(Optional.of(productCreated));

        var productOutputDTO = productService.findById(id);

        assertThat(productOutputDTO)
                .usingRecursiveComparison()
                .isEqualTo(productCreated);
    }

    @Test
    @DisplayName("when findById product service is call with invalid id, throw NotFoundException")
    public void findProductByIdExceptionTest() {
        var id = 1L;

        when(productRepository.findById(any())).thenReturn(Optional.empty());

        assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> productService.findById(id));
    }

    @Test
    @DisplayName("when findAll product service is call a list of product is returned")
    public void findAllProductsSuccessTest() {
        var products = List.of(
                new Product(1L, "product name", 10.00, 10),
                new Product(2L, "other product name", 15.00, 20)
        );

        when(productRepository.findAll()).thenReturn(products);

        var productOutputDTO = productService.findAll();

        assertThat(productOutputDTO)
                .extracting("id", "name", "price", "quantityInStock")
                .contains(
                        tuple(1L, "product name", 10.00, 10),
                        tuple(2L, "other product name", 15.00, 20)
                );
    }

    @Test
    @DisplayName("when delete product service is call with valid id should does not throw")
    public void deleteProductSuccessTest() {
        var id = 1L;
        var product = new Product(1L, "product name", 10.00, 10);

        when(productRepository.findById(any())).thenReturn(Optional.of(product));

        assertThatNoException().isThrownBy(() -> productService.delete(id));
    }

    @Test
    @DisplayName("when delete product service is call with invalid id, throw NotFoundException")
    public void deleteProductExceptionTest() {
        var id = 1L;

        when(productRepository.findById(any())).thenReturn(Optional.empty());

        assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> productService.delete(id));
    }
}
