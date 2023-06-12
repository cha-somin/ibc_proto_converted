package com.neutron.contractmanager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/contractmanager/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.contractmanager.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryParamsRequest,
      com.neutron.contractmanager.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.neutron.contractmanager.QueryParamsRequest.class,
      responseType = com.neutron.contractmanager.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryParamsRequest,
      com.neutron.contractmanager.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryParamsRequest, com.neutron.contractmanager.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.contractmanager.QueryParamsRequest, com.neutron.contractmanager.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest,
      com.neutron.contractmanager.QueryFailuresResponse> getAddressFailuresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressFailures",
      requestType = com.neutron.contractmanager.QueryFailuresRequest.class,
      responseType = com.neutron.contractmanager.QueryFailuresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest,
      com.neutron.contractmanager.QueryFailuresResponse> getAddressFailuresMethod() {
    io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest, com.neutron.contractmanager.QueryFailuresResponse> getAddressFailuresMethod;
    if ((getAddressFailuresMethod = QueryGrpc.getAddressFailuresMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressFailuresMethod = QueryGrpc.getAddressFailuresMethod) == null) {
          QueryGrpc.getAddressFailuresMethod = getAddressFailuresMethod =
              io.grpc.MethodDescriptor.<com.neutron.contractmanager.QueryFailuresRequest, com.neutron.contractmanager.QueryFailuresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressFailures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryFailuresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryFailuresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressFailures"))
              .build();
        }
      }
    }
    return getAddressFailuresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest,
      com.neutron.contractmanager.QueryFailuresResponse> getFailuresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Failures",
      requestType = com.neutron.contractmanager.QueryFailuresRequest.class,
      responseType = com.neutron.contractmanager.QueryFailuresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest,
      com.neutron.contractmanager.QueryFailuresResponse> getFailuresMethod() {
    io.grpc.MethodDescriptor<com.neutron.contractmanager.QueryFailuresRequest, com.neutron.contractmanager.QueryFailuresResponse> getFailuresMethod;
    if ((getFailuresMethod = QueryGrpc.getFailuresMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFailuresMethod = QueryGrpc.getFailuresMethod) == null) {
          QueryGrpc.getFailuresMethod = getFailuresMethod =
              io.grpc.MethodDescriptor.<com.neutron.contractmanager.QueryFailuresRequest, com.neutron.contractmanager.QueryFailuresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Failures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryFailuresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.contractmanager.QueryFailuresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Failures"))
              .build();
        }
      }
    }
    return getFailuresMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.neutron.contractmanager.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    default void addressFailures(com.neutron.contractmanager.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressFailuresMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    default void failures(com.neutron.contractmanager.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFailuresMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.neutron.contractmanager.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public void addressFailures(com.neutron.contractmanager.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressFailuresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public void failures(com.neutron.contractmanager.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFailuresMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.neutron.contractmanager.QueryParamsResponse params(com.neutron.contractmanager.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public com.neutron.contractmanager.QueryFailuresResponse addressFailures(com.neutron.contractmanager.QueryFailuresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressFailuresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public com.neutron.contractmanager.QueryFailuresResponse failures(com.neutron.contractmanager.QueryFailuresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFailuresMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.contractmanager.QueryParamsResponse> params(
        com.neutron.contractmanager.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.contractmanager.QueryFailuresResponse> addressFailures(
        com.neutron.contractmanager.QueryFailuresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressFailuresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.contractmanager.QueryFailuresResponse> failures(
        com.neutron.contractmanager.QueryFailuresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFailuresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ADDRESS_FAILURES = 1;
  private static final int METHODID_FAILURES = 2;

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
          serviceImpl.params((com.neutron.contractmanager.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_FAILURES:
          serviceImpl.addressFailures((com.neutron.contractmanager.QueryFailuresRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse>) responseObserver);
          break;
        case METHODID_FAILURES:
          serviceImpl.failures((com.neutron.contractmanager.QueryFailuresRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.contractmanager.QueryFailuresResponse>) responseObserver);
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
              com.neutron.contractmanager.QueryParamsRequest,
              com.neutron.contractmanager.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAddressFailuresMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.contractmanager.QueryFailuresRequest,
              com.neutron.contractmanager.QueryFailuresResponse>(
                service, METHODID_ADDRESS_FAILURES)))
        .addMethod(
          getFailuresMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.contractmanager.QueryFailuresRequest,
              com.neutron.contractmanager.QueryFailuresResponse>(
                service, METHODID_FAILURES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.contractmanager.QueryProto.getDescriptor();
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
              .addMethod(getAddressFailuresMethod())
              .addMethod(getFailuresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
