package br.com.content4devs.resources;

import br.com.content4devs.*;
import br.com.content4devs.domain.Product;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.*;

@SuppressWarnings("ResultOfMethodCallIgnored")
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@DirtiesContext
public class ProductResourceIntegrationTest {

    @GrpcClient("inProcess")
    private ProductsServiceGrpc.ProductsServiceBlockingStub blockingStub;

    @Autowired
    private Flyway flyway;

    @BeforeEach
    public void setUp() {
        this.flyway.clean();
        this.flyway.migrate();
    }

    @Test
    @DisplayName("when valid data is provided a product is created")
    public void createProductSuccessTest() {
        var request = ProductServiceRequest.newBuilder()
                .setName("any name")
                .setPrice(10.00)
                .setQuantityInStock(10)
                .build();

        var response = blockingStub.create(request);

        assertThat(request).usingRecursiveComparison()
                .comparingOnlyFields("name", "price", "quantity_in_stock")
                .isEqualTo(response);
    }

    @Test
    @DisplayName("when create is called with duplicated name is provided, throw AlreadyExistsException")
    public void createProductAlreadyExistsExceptionTest() {
        var request = ProductServiceRequest.newBuilder()
                .setName("Product A")
                .setPrice(10.00)
                .setQuantityInStock(10)
                .build();

        assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> blockingStub.create(request))
                .withMessage("ALREADY_EXISTS: Produto Product A já cadastrado no sistema.");
    }

    @Test
    @DisplayName("when findById with valid id is called a product is returned")
    public void findByIdProductSuccessTest() {
        var request = RequestById.newBuilder()
                .setId(1L)
                .build();
        var product = new Product(1L, "Product A", 10.99, 10);

        var response = blockingStub.findById(request);

        assertThat(response.getId()).isEqualTo(product.getId());
        assertThat(response.getName()).isEqualTo(product.getName());
    }

    @Test
    @DisplayName("when findById with invalid id is called, throw NotFoundException")
    public void findByIdProductNotFoundExceptionTest() {
        var request = RequestById.newBuilder()
                .setId(100L)
                .build();

        assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> blockingStub.findById(request))
                .withMessage("NOT_FOUND: Produto com ID 100 não encontrado.");
    }

    @Test
    @DisplayName("when findAll is called, returns a list of products")
    public void findAllProductSuccessTest() {
        var request = Empty.newBuilder().build();

        var response = blockingStub.findAll(request);

        assertThat(response).isInstanceOf(ProductsList.class);
        assertThat(response.getProductsCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("when delete with valid id is called a product is deleted")
    public void deleteProductSuccessTest() {
        var request = RequestById.newBuilder()
                .setId(1L)
                .build();

        assertThatNoException().isThrownBy(() -> blockingStub.delete(request));
    }

    @Test
    @DisplayName("when delete with invalid id is called, throw NotFoundException")
    public void deleteProductNotFoundExceptionTest() {
        var request = RequestById.newBuilder()
                .setId(100L)
                .build();

        assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> blockingStub.findById(request))
                .withMessage("NOT_FOUND: Produto com ID 100 não encontrado.");
    }
}
