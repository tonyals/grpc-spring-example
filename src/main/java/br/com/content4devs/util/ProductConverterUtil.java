package br.com.content4devs.util;

import br.com.content4devs.domain.Product;
import br.com.content4devs.dto.ProductInputDTO;
import br.com.content4devs.dto.ProductOutputDTO;

public class ProductConverterUtil {

    public static ProductOutputDTO productToProductOutputDto(Product p) {
        return new ProductOutputDTO(
                p.getId(),
                p.getName(),
                p.getPrice(),
                p.getQuantityInStock()
        );
    }

    public static Product productInputDTOToProduct(ProductInputDTO p) {
        return new Product(
                null,
                p.getName(),
                p.getPrice(),
                p.getQuantityInStock()
        );
    }
}
