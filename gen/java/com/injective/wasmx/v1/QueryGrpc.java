package com.injective.wasmx.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: injective/wasmx/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.wasmx.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryWasmxParamsRequest,
      com.injective.wasmx.v1.QueryWasmxParamsResponse> getWasmxParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WasmxParams",
      requestType = com.injective.wasmx.v1.QueryWasmxParamsRequest.class,
      responseType = com.injective.wasmx.v1.QueryWasmxParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryWasmxParamsRequest,
      com.injective.wasmx.v1.QueryWasmxParamsResponse> getWasmxParamsMethod() {
    io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryWasmxParamsRequest, com.injective.wasmx.v1.QueryWasmxParamsResponse> getWasmxParamsMethod;
    if ((getWasmxParamsMethod = QueryGrpc.getWasmxParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWasmxParamsMethod = QueryGrpc.getWasmxParamsMethod) == null) {
          QueryGrpc.getWasmxParamsMethod = getWasmxParamsMethod =
              io.grpc.MethodDescriptor.<com.injective.wasmx.v1.QueryWasmxParamsRequest, com.injective.wasmx.v1.QueryWasmxParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WasmxParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryWasmxParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryWasmxParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WasmxParams"))
              .build();
        }
      }
    }
    return getWasmxParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryContractRegistrationInfoRequest,
      com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> getContractRegistrationInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractRegistrationInfo",
      requestType = com.injective.wasmx.v1.QueryContractRegistrationInfoRequest.class,
      responseType = com.injective.wasmx.v1.QueryContractRegistrationInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryContractRegistrationInfoRequest,
      com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> getContractRegistrationInfoMethod() {
    io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryContractRegistrationInfoRequest, com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> getContractRegistrationInfoMethod;
    if ((getContractRegistrationInfoMethod = QueryGrpc.getContractRegistrationInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractRegistrationInfoMethod = QueryGrpc.getContractRegistrationInfoMethod) == null) {
          QueryGrpc.getContractRegistrationInfoMethod = getContractRegistrationInfoMethod =
              io.grpc.MethodDescriptor.<com.injective.wasmx.v1.QueryContractRegistrationInfoRequest, com.injective.wasmx.v1.QueryContractRegistrationInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractRegistrationInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryContractRegistrationInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryContractRegistrationInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractRegistrationInfo"))
              .build();
        }
      }
    }
    return getContractRegistrationInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryModuleStateRequest,
      com.injective.wasmx.v1.QueryModuleStateResponse> getWasmxModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WasmxModuleState",
      requestType = com.injective.wasmx.v1.QueryModuleStateRequest.class,
      responseType = com.injective.wasmx.v1.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryModuleStateRequest,
      com.injective.wasmx.v1.QueryModuleStateResponse> getWasmxModuleStateMethod() {
    io.grpc.MethodDescriptor<com.injective.wasmx.v1.QueryModuleStateRequest, com.injective.wasmx.v1.QueryModuleStateResponse> getWasmxModuleStateMethod;
    if ((getWasmxModuleStateMethod = QueryGrpc.getWasmxModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWasmxModuleStateMethod = QueryGrpc.getWasmxModuleStateMethod) == null) {
          QueryGrpc.getWasmxModuleStateMethod = getWasmxModuleStateMethod =
              io.grpc.MethodDescriptor.<com.injective.wasmx.v1.QueryModuleStateRequest, com.injective.wasmx.v1.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WasmxModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.wasmx.v1.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WasmxModuleState"))
              .build();
        }
      }
    }
    return getWasmxModuleStateMethod;
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
     * Retrieves wasmx params
     * </pre>
     */
    default void wasmxParams(com.injective.wasmx.v1.QueryWasmxParamsRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryWasmxParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWasmxParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves contract registration info
     * </pre>
     */
    default void contractRegistrationInfo(com.injective.wasmx.v1.QueryContractRegistrationInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractRegistrationInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire wasmx module's state
     * </pre>
     */
    default void wasmxModuleState(com.injective.wasmx.v1.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWasmxModuleStateMethod(), responseObserver);
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
     * Retrieves wasmx params
     * </pre>
     */
    public void wasmxParams(com.injective.wasmx.v1.QueryWasmxParamsRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryWasmxParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWasmxParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves contract registration info
     * </pre>
     */
    public void contractRegistrationInfo(com.injective.wasmx.v1.QueryContractRegistrationInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractRegistrationInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire wasmx module's state
     * </pre>
     */
    public void wasmxModuleState(com.injective.wasmx.v1.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWasmxModuleStateMethod(), getCallOptions()), request, responseObserver);
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
     * Retrieves wasmx params
     * </pre>
     */
    public com.injective.wasmx.v1.QueryWasmxParamsResponse wasmxParams(com.injective.wasmx.v1.QueryWasmxParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWasmxParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves contract registration info
     * </pre>
     */
    public com.injective.wasmx.v1.QueryContractRegistrationInfoResponse contractRegistrationInfo(com.injective.wasmx.v1.QueryContractRegistrationInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractRegistrationInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire wasmx module's state
     * </pre>
     */
    public com.injective.wasmx.v1.QueryModuleStateResponse wasmxModuleState(com.injective.wasmx.v1.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWasmxModuleStateMethod(), getCallOptions(), request);
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
     * Retrieves wasmx params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.wasmx.v1.QueryWasmxParamsResponse> wasmxParams(
        com.injective.wasmx.v1.QueryWasmxParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWasmxParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves contract registration info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.wasmx.v1.QueryContractRegistrationInfoResponse> contractRegistrationInfo(
        com.injective.wasmx.v1.QueryContractRegistrationInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractRegistrationInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire wasmx module's state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.wasmx.v1.QueryModuleStateResponse> wasmxModuleState(
        com.injective.wasmx.v1.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWasmxModuleStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WASMX_PARAMS = 0;
  private static final int METHODID_CONTRACT_REGISTRATION_INFO = 1;
  private static final int METHODID_WASMX_MODULE_STATE = 2;

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
        case METHODID_WASMX_PARAMS:
          serviceImpl.wasmxParams((com.injective.wasmx.v1.QueryWasmxParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryWasmxParamsResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_REGISTRATION_INFO:
          serviceImpl.contractRegistrationInfo((com.injective.wasmx.v1.QueryContractRegistrationInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryContractRegistrationInfoResponse>) responseObserver);
          break;
        case METHODID_WASMX_MODULE_STATE:
          serviceImpl.wasmxModuleState((com.injective.wasmx.v1.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.wasmx.v1.QueryModuleStateResponse>) responseObserver);
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
          getWasmxParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.wasmx.v1.QueryWasmxParamsRequest,
              com.injective.wasmx.v1.QueryWasmxParamsResponse>(
                service, METHODID_WASMX_PARAMS)))
        .addMethod(
          getContractRegistrationInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.wasmx.v1.QueryContractRegistrationInfoRequest,
              com.injective.wasmx.v1.QueryContractRegistrationInfoResponse>(
                service, METHODID_CONTRACT_REGISTRATION_INFO)))
        .addMethod(
          getWasmxModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.wasmx.v1.QueryModuleStateRequest,
              com.injective.wasmx.v1.QueryModuleStateResponse>(
                service, METHODID_WASMX_MODULE_STATE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.injective.wasmx.v1.QueryProto.getDescriptor();
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
              .addMethod(getWasmxParamsMethod())
              .addMethod(getContractRegistrationInfoMethod())
              .addMethod(getWasmxModuleStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
