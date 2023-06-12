package com.ethermint.feemarket.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ethermint/feemarket/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ethermint.feemarket.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryParamsRequest,
      com.ethermint.feemarket.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ethermint.feemarket.v1.QueryParamsRequest.class,
      responseType = com.ethermint.feemarket.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryParamsRequest,
      com.ethermint.feemarket.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryParamsRequest, com.ethermint.feemarket.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ethermint.feemarket.v1.QueryParamsRequest, com.ethermint.feemarket.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBaseFeeRequest,
      com.ethermint.feemarket.v1.QueryBaseFeeResponse> getBaseFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseFee",
      requestType = com.ethermint.feemarket.v1.QueryBaseFeeRequest.class,
      responseType = com.ethermint.feemarket.v1.QueryBaseFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBaseFeeRequest,
      com.ethermint.feemarket.v1.QueryBaseFeeResponse> getBaseFeeMethod() {
    io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBaseFeeRequest, com.ethermint.feemarket.v1.QueryBaseFeeResponse> getBaseFeeMethod;
    if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
          QueryGrpc.getBaseFeeMethod = getBaseFeeMethod =
              io.grpc.MethodDescriptor.<com.ethermint.feemarket.v1.QueryBaseFeeRequest, com.ethermint.feemarket.v1.QueryBaseFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BaseFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryBaseFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryBaseFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BaseFee"))
              .build();
        }
      }
    }
    return getBaseFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBlockGasRequest,
      com.ethermint.feemarket.v1.QueryBlockGasResponse> getBlockGasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockGas",
      requestType = com.ethermint.feemarket.v1.QueryBlockGasRequest.class,
      responseType = com.ethermint.feemarket.v1.QueryBlockGasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBlockGasRequest,
      com.ethermint.feemarket.v1.QueryBlockGasResponse> getBlockGasMethod() {
    io.grpc.MethodDescriptor<com.ethermint.feemarket.v1.QueryBlockGasRequest, com.ethermint.feemarket.v1.QueryBlockGasResponse> getBlockGasMethod;
    if ((getBlockGasMethod = QueryGrpc.getBlockGasMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlockGasMethod = QueryGrpc.getBlockGasMethod) == null) {
          QueryGrpc.getBlockGasMethod = getBlockGasMethod =
              io.grpc.MethodDescriptor.<com.ethermint.feemarket.v1.QueryBlockGasRequest, com.ethermint.feemarket.v1.QueryBlockGasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryBlockGasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.feemarket.v1.QueryBlockGasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlockGas"))
              .build();
        }
      }
    }
    return getBlockGasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries the parameters of x/feemarket module.
     * </pre>
     */
    default void params(com.ethermint.feemarket.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block.
     * </pre>
     */
    default void baseFee(com.ethermint.feemarket.v1.QueryBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBaseFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBaseFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockGas queries the gas used at a given block height
     * </pre>
     */
    default void blockGas(com.ethermint.feemarket.v1.QueryBlockGasRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBlockGasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockGasMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params queries the parameters of x/feemarket module.
     * </pre>
     */
    public void params(com.ethermint.feemarket.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block.
     * </pre>
     */
    public void baseFee(com.ethermint.feemarket.v1.QueryBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBaseFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockGas queries the gas used at a given block height
     * </pre>
     */
    public void blockGas(com.ethermint.feemarket.v1.QueryBlockGasRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBlockGasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockGasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params queries the parameters of x/feemarket module.
     * </pre>
     */
    public com.ethermint.feemarket.v1.QueryParamsResponse params(com.ethermint.feemarket.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block.
     * </pre>
     */
    public com.ethermint.feemarket.v1.QueryBaseFeeResponse baseFee(com.ethermint.feemarket.v1.QueryBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBaseFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockGas queries the gas used at a given block height
     * </pre>
     */
    public com.ethermint.feemarket.v1.QueryBlockGasResponse blockGas(com.ethermint.feemarket.v1.QueryBlockGasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockGasMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params queries the parameters of x/feemarket module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.feemarket.v1.QueryParamsResponse> params(
        com.ethermint.feemarket.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.feemarket.v1.QueryBaseFeeResponse> baseFee(
        com.ethermint.feemarket.v1.QueryBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockGas queries the gas used at a given block height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.feemarket.v1.QueryBlockGasResponse> blockGas(
        com.ethermint.feemarket.v1.QueryBlockGasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockGasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_BASE_FEE = 1;
  private static final int METHODID_BLOCK_GAS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARAMS:
          serviceImpl.params((com.ethermint.feemarket.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BASE_FEE:
          serviceImpl.baseFee((com.ethermint.feemarket.v1.QueryBaseFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBaseFeeResponse>) responseObserver);
          break;
        case METHODID_BLOCK_GAS:
          serviceImpl.blockGas((com.ethermint.feemarket.v1.QueryBlockGasRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.feemarket.v1.QueryBlockGasResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.feemarket.v1.QueryParamsRequest,
              com.ethermint.feemarket.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getBaseFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.feemarket.v1.QueryBaseFeeRequest,
              com.ethermint.feemarket.v1.QueryBaseFeeResponse>(
                service, METHODID_BASE_FEE)))
        .addMethod(
          getBlockGasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.feemarket.v1.QueryBlockGasRequest,
              com.ethermint.feemarket.v1.QueryBlockGasResponse>(
                service, METHODID_BLOCK_GAS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ethermint.feemarket.v1.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getParamsMethod())
              .addMethod(getBaseFeeMethod())
              .addMethod(getBlockGasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
