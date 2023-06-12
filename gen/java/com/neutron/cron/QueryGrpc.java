package com.neutron.cron;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/cron/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.cron.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.cron.QueryParamsRequest,
      com.neutron.cron.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.neutron.cron.QueryParamsRequest.class,
      responseType = com.neutron.cron.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.cron.QueryParamsRequest,
      com.neutron.cron.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.cron.QueryParamsRequest, com.neutron.cron.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.cron.QueryParamsRequest, com.neutron.cron.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.cron.QueryGetScheduleRequest,
      com.neutron.cron.QueryGetScheduleResponse> getScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedule",
      requestType = com.neutron.cron.QueryGetScheduleRequest.class,
      responseType = com.neutron.cron.QueryGetScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.cron.QueryGetScheduleRequest,
      com.neutron.cron.QueryGetScheduleResponse> getScheduleMethod() {
    io.grpc.MethodDescriptor<com.neutron.cron.QueryGetScheduleRequest, com.neutron.cron.QueryGetScheduleResponse> getScheduleMethod;
    if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
          QueryGrpc.getScheduleMethod = getScheduleMethod =
              io.grpc.MethodDescriptor.<com.neutron.cron.QueryGetScheduleRequest, com.neutron.cron.QueryGetScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QueryGetScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QueryGetScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedule"))
              .build();
        }
      }
    }
    return getScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.cron.QuerySchedulesRequest,
      com.neutron.cron.QuerySchedulesResponse> getSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedules",
      requestType = com.neutron.cron.QuerySchedulesRequest.class,
      responseType = com.neutron.cron.QuerySchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.cron.QuerySchedulesRequest,
      com.neutron.cron.QuerySchedulesResponse> getSchedulesMethod() {
    io.grpc.MethodDescriptor<com.neutron.cron.QuerySchedulesRequest, com.neutron.cron.QuerySchedulesResponse> getSchedulesMethod;
    if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
          QueryGrpc.getSchedulesMethod = getSchedulesMethod =
              io.grpc.MethodDescriptor.<com.neutron.cron.QuerySchedulesRequest, com.neutron.cron.QuerySchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QuerySchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.cron.QuerySchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedules"))
              .build();
        }
      }
    }
    return getSchedulesMethod;
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
     * Queries the parameters of the module.
     * </pre>
     */
    default void params(com.neutron.cron.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    default void schedule(com.neutron.cron.QueryGetScheduleRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QueryGetScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    default void schedules(com.neutron.cron.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QuerySchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulesMethod(), responseObserver);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public void params(com.neutron.cron.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public void schedule(com.neutron.cron.QueryGetScheduleRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QueryGetScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public void schedules(com.neutron.cron.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.cron.QuerySchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request, responseObserver);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public com.neutron.cron.QueryParamsResponse params(com.neutron.cron.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public com.neutron.cron.QueryGetScheduleResponse schedule(com.neutron.cron.QueryGetScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public com.neutron.cron.QuerySchedulesResponse schedules(com.neutron.cron.QuerySchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulesMethod(), getCallOptions(), request);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.cron.QueryParamsResponse> params(
        com.neutron.cron.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.cron.QueryGetScheduleResponse> schedule(
        com.neutron.cron.QueryGetScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.cron.QuerySchedulesResponse> schedules(
        com.neutron.cron.QuerySchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SCHEDULE = 1;
  private static final int METHODID_SCHEDULES = 2;

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
          serviceImpl.params((com.neutron.cron.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.cron.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE:
          serviceImpl.schedule((com.neutron.cron.QueryGetScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.cron.QueryGetScheduleResponse>) responseObserver);
          break;
        case METHODID_SCHEDULES:
          serviceImpl.schedules((com.neutron.cron.QuerySchedulesRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.cron.QuerySchedulesResponse>) responseObserver);
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
              com.neutron.cron.QueryParamsRequest,
              com.neutron.cron.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.cron.QueryGetScheduleRequest,
              com.neutron.cron.QueryGetScheduleResponse>(
                service, METHODID_SCHEDULE)))
        .addMethod(
          getSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.cron.QuerySchedulesRequest,
              com.neutron.cron.QuerySchedulesResponse>(
                service, METHODID_SCHEDULES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.cron.QueryProto.getDescriptor();
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
              .addMethod(getScheduleMethod())
              .addMethod(getSchedulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
