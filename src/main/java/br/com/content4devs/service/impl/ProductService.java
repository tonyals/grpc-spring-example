package br.com.content4devs.service.impl;

import br.com.content4devs.dto.ProductInputDTO;
import br.com.content4devs.dto.ProductOutputDTO;
import br.com.content4devs.exception.AlreadyExistsException;
import br.com.content4devs.exception.NotFoundException;
import br.com.content4devs.repository.ProductRepository;
import br.com.content4devs.service.IProductService;
import br.com.content4devs.util.ProductConverterUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductOutputDTO create(ProductInputDTO inputDTO) {
        checkDuplicity(inputDTO.getName());
        var product = ProductConverterUtil.productInputDTOToProduct(inputDTO);
        var save = this.productRepository.save(product);
        return ProductConverterUtil.productToProductOutputDto(save);
    }

    @Override
    public ProductOutputDTO findById(Long id) {
        var product = this.productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id));
        return ProductConverterUtil.productToProductOutputDto(product);
    }

    @Override
    public void delete(Long id) {
        var product = this.productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id));
        this.productRepository.delete(product);
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        var products = this.productRepository.findAll();
        return products.stream()
                .map(ProductConverterUtil::productToProductOutputDto)
                .collect(Collectors.toList());
    }

    private void checkDuplicity(String s) {
        this.productRepository.findByNameIgnoreCase(s)
                .ifPresent(e -> {
                    throw new AlreadyExistsException(s);
                });
    }
}
