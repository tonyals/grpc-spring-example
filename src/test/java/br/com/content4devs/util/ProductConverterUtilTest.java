package br.com.content4devs.util;

import br.com.content4devs.domain.Product;
import org.junit.jupiter.api.Test;

import static br.com.content4devs.util.ProductConverterUtil.productToProductOutputDto;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductConverterUtilTest {

    @Test
    public void productToProductOutputDtoTest() {
        var product = new Product(1L, "product name", 10.00, 100);
        var productOutputDto = productToProductOutputDto(product);
        assertThat(product)
                .usingRecursiveComparison()
                .isEqualTo(productOutputDto);
    }

    @Test
    public void productInputDTOToProductTest() {
        var product = new Product(1L, "product name", 10.00, 100);
        var productOutputDto = productToProductOutputDto(product);
        assertThat(product)
                .usingRecursiveComparison()
                .isEqualTo(productOutputDto);
    }
}
