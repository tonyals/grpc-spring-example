package br.com.content4devs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: products.proto")
public final class ProductsServiceGrpc {

  private ProductsServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.content4devs.ProductsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.content4devs.ProductServiceRequest,
      br.com.content4devs.ProductServiceResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = br.com.content4devs.ProductServiceRequest.class,
      responseType = br.com.content4devs.ProductServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.content4devs.ProductServiceRequest,
      br.com.content4devs.ProductServiceResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<br.com.content4devs.ProductServiceRequest, br.com.content4devs.ProductServiceResponse> getCreateMethod;
    if ((getCreateMethod = ProductsServiceGrpc.getCreateMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getCreateMethod = ProductsServiceGrpc.getCreateMethod) == null) {
          ProductsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<br.com.content4devs.ProductServiceRequest, br.com.content4devs.ProductServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.ProductServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.ProductServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.content4devs.RequestById,
      br.com.content4devs.ProductServiceResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = br.com.content4devs.RequestById.class,
      responseType = br.com.content4devs.ProductServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.content4devs.RequestById,
      br.com.content4devs.ProductServiceResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<br.com.content4devs.RequestById, br.com.content4devs.ProductServiceResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ProductsServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getFindByIdMethod = ProductsServiceGrpc.getFindByIdMethod) == null) {
          ProductsServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<br.com.content4devs.RequestById, br.com.content4devs.ProductServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.RequestById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.ProductServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.content4devs.RequestById,
      br.com.content4devs.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = br.com.content4devs.RequestById.class,
      responseType = br.com.content4devs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.content4devs.RequestById,
      br.com.content4devs.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<br.com.content4devs.RequestById, br.com.content4devs.Empty> getDeleteMethod;
    if ((getDeleteMethod = ProductsServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getDeleteMethod = ProductsServiceGrpc.getDeleteMethod) == null) {
          ProductsServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<br.com.content4devs.RequestById, br.com.content4devs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.RequestById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.content4devs.Empty,
      br.com.content4devs.ProductsList> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = br.com.content4devs.Empty.class,
      responseType = br.com.content4devs.ProductsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.content4devs.Empty,
      br.com.content4devs.ProductsList> getFindAllMethod() {
    io.grpc.MethodDescriptor<br.com.content4devs.Empty, br.com.content4devs.ProductsList> getFindAllMethod;
    if ((getFindAllMethod = ProductsServiceGrpc.getFindAllMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getFindAllMethod = ProductsServiceGrpc.getFindAllMethod) == null) {
          ProductsServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<br.com.content4devs.Empty, br.com.content4devs.ProductsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.content4devs.ProductsList.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub>() {
        @java.lang.Override
        public ProductsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceStub(channel, callOptions);
        }
      };
    return ProductsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub>() {
        @java.lang.Override
        public ProductsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub>() {
        @java.lang.Override
        public ProductsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceFutureStub(channel, callOptions);
        }
      };
    return ProductsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(br.com.content4devs.ProductServiceRequest request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findById(br.com.content4devs.RequestById request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void delete(br.com.content4devs.RequestById request,
        io.grpc.stub.StreamObserver<br.com.content4devs.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findAll(br.com.content4devs.Empty request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.content4devs.ProductServiceRequest,
                br.com.content4devs.ProductServiceResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.content4devs.RequestById,
                br.com.content4devs.ProductServiceResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.content4devs.RequestById,
                br.com.content4devs.Empty>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.content4devs.Empty,
                br.com.content4devs.ProductsList>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ProductsServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductsServiceStub> {
    private ProductsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(br.com.content4devs.ProductServiceRequest request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(br.com.content4devs.RequestById request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(br.com.content4devs.RequestById request,
        io.grpc.stub.StreamObserver<br.com.content4devs.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(br.com.content4devs.Empty request,
        io.grpc.stub.StreamObserver<br.com.content4devs.ProductsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductsServiceBlockingStub> {
    private ProductsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.content4devs.ProductServiceResponse create(br.com.content4devs.ProductServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.content4devs.ProductServiceResponse findById(br.com.content4devs.RequestById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.content4devs.Empty delete(br.com.content4devs.RequestById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.content4devs.ProductsList findAll(br.com.content4devs.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductsServiceFutureStub> {
    private ProductsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.content4devs.ProductServiceResponse> create(
        br.com.content4devs.ProductServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.content4devs.ProductServiceResponse> findById(
        br.com.content4devs.RequestById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.content4devs.Empty> delete(
        br.com.content4devs.RequestById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.content4devs.ProductsList> findAll(
        br.com.content4devs.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_FIND_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((br.com.content4devs.ProductServiceRequest) request,
              (io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((br.com.content4devs.RequestById) request,
              (io.grpc.stub.StreamObserver<br.com.content4devs.ProductServiceResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((br.com.content4devs.RequestById) request,
              (io.grpc.stub.StreamObserver<br.com.content4devs.Empty>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((br.com.content4devs.Empty) request,
              (io.grpc.stub.StreamObserver<br.com.content4devs.ProductsList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.content4devs.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductsService");
    }
  }

  private static final class ProductsServiceFileDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier {
    ProductsServiceFileDescriptorSupplier() {}
  }

  private static final class ProductsServiceMethodDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
