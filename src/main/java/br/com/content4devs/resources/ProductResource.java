package br.com.content4devs.resources;

import br.com.content4devs.*;
import br.com.content4devs.dto.ProductInputDTO;
import br.com.content4devs.service.IProductService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.stream.Collectors;

@GrpcService
public class ProductResource extends ProductsServiceGrpc.ProductsServiceImplBase {

    private final IProductService productService;

    public ProductResource(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public void create(ProductServiceRequest request, StreamObserver<ProductServiceResponse> responseObserver) {
        var inputDTO = new ProductInputDTO(
                request.getName(),
                request.getPrice(),
                request.getQuantityInStock()
        );

        var outputDTO = productService.create(inputDTO);
        var response = ProductServiceResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .setQuantityInStock(outputDTO.getQuantityInStock())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(RequestById request, StreamObserver<ProductServiceResponse> responseObserver) {
        var outputDTO = productService.findById(request.getId());
        var response = ProductServiceResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .setQuantityInStock(outputDTO.getQuantityInStock())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Empty request, StreamObserver<ProductsList> responseObserver) {
        var outputDTOS = this.productService.findAll();
        var productList = outputDTOS.stream()
                .map(product -> ProductServiceResponse.newBuilder()
                        .setId(product.getId())
                        .setName(product.getName())
                        .setPrice(product.getPrice())
                        .setQuantityInStock(product.getQuantityInStock())
                        .build())
                .collect(Collectors.toList());

        var response = ProductsList.newBuilder()
                .addAllProducts(productList)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(RequestById request, StreamObserver<Empty> responseObserver) {
        this.productService.delete(request.getId());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
