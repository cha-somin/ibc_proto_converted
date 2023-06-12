package com.pstake.lspersistence.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC query service for the liquidstaking module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: pstake/lspersistence/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "pstake.lspersistence.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryParamsRequest,
      com.pstake.lspersistence.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.pstake.lspersistence.v1beta1.QueryParamsRequest.class,
      responseType = com.pstake.lspersistence.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryParamsRequest,
      com.pstake.lspersistence.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryParamsRequest, com.pstake.lspersistence.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.QueryParamsRequest, com.pstake.lspersistence.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest,
      com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> getLiquidValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidValidators",
      requestType = com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest.class,
      responseType = com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest,
      com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> getLiquidValidatorsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest, com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> getLiquidValidatorsMethod;
    if ((getLiquidValidatorsMethod = QueryGrpc.getLiquidValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidValidatorsMethod = QueryGrpc.getLiquidValidatorsMethod) == null) {
          QueryGrpc.getLiquidValidatorsMethod = getLiquidValidatorsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest, com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidValidators"))
              .build();
        }
      }
    }
    return getLiquidValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryStatesRequest,
      com.pstake.lspersistence.v1beta1.QueryStatesResponse> getStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "States",
      requestType = com.pstake.lspersistence.v1beta1.QueryStatesRequest.class,
      responseType = com.pstake.lspersistence.v1beta1.QueryStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryStatesRequest,
      com.pstake.lspersistence.v1beta1.QueryStatesResponse> getStatesMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.QueryStatesRequest, com.pstake.lspersistence.v1beta1.QueryStatesResponse> getStatesMethod;
    if ((getStatesMethod = QueryGrpc.getStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStatesMethod = QueryGrpc.getStatesMethod) == null) {
          QueryGrpc.getStatesMethod = getStatesMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.QueryStatesRequest, com.pstake.lspersistence.v1beta1.QueryStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "States"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.QueryStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("States"))
              .build();
        }
      }
    }
    return getStatesMethod;
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
   * Query defines the gRPC query service for the liquidstaking module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns parameters of the liquidstaking module.
     * </pre>
     */
    default void params(com.pstake.lspersistence.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidValidators returns liquid validators with states of the liquidstaking module.
     * </pre>
     */
    default void liquidValidators(com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * States returns states of the liquidstaking module.
     * </pre>
     */
    default void states(com.pstake.lspersistence.v1beta1.QueryStatesRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC query service for the liquidstaking module.
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
   * Query defines the gRPC query service for the liquidstaking module.
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
     * Params returns parameters of the liquidstaking module.
     * </pre>
     */
    public void params(com.pstake.lspersistence.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidValidators returns liquid validators with states of the liquidstaking module.
     * </pre>
     */
    public void liquidValidators(com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * States returns states of the liquidstaking module.
     * </pre>
     */
    public void states(com.pstake.lspersistence.v1beta1.QueryStatesRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the liquidstaking module.
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
     * Params returns parameters of the liquidstaking module.
     * </pre>
     */
    public com.pstake.lspersistence.v1beta1.QueryParamsResponse params(com.pstake.lspersistence.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidValidators returns liquid validators with states of the liquidstaking module.
     * </pre>
     */
    public com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse liquidValidators(com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * States returns states of the liquidstaking module.
     * </pre>
     */
    public com.pstake.lspersistence.v1beta1.QueryStatesResponse states(com.pstake.lspersistence.v1beta1.QueryStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the liquidstaking module.
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
     * Params returns parameters of the liquidstaking module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.QueryParamsResponse> params(
        com.pstake.lspersistence.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidValidators returns liquid validators with states of the liquidstaking module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse> liquidValidators(
        com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * States returns states of the liquidstaking module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.QueryStatesResponse> states(
        com.pstake.lspersistence.v1beta1.QueryStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_LIQUID_VALIDATORS = 1;
  private static final int METHODID_STATES = 2;

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
          serviceImpl.params((com.pstake.lspersistence.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LIQUID_VALIDATORS:
          serviceImpl.liquidValidators((com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse>) responseObserver);
          break;
        case METHODID_STATES:
          serviceImpl.states((com.pstake.lspersistence.v1beta1.QueryStatesRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.QueryStatesResponse>) responseObserver);
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
              com.pstake.lspersistence.v1beta1.QueryParamsRequest,
              com.pstake.lspersistence.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLiquidValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest,
              com.pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse>(
                service, METHODID_LIQUID_VALIDATORS)))
        .addMethod(
          getStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lspersistence.v1beta1.QueryStatesRequest,
              com.pstake.lspersistence.v1beta1.QueryStatesResponse>(
                service, METHODID_STATES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.lspersistence.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getLiquidValidatorsMethod())
              .addMethod(getStatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
