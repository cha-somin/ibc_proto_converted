package com.initia.distribution.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for distribution module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: initia/distribution/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "initia.distribution.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryParamsRequest,
      com.initia.distribution.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.initia.distribution.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryParamsRequest,
      com.initia.distribution.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryParamsRequest, com.initia.distribution.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryParamsRequest, com.initia.distribution.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorOutstandingRewards",
      requestType = com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest, com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> getValidatorOutstandingRewardsMethod;
    if ((getValidatorOutstandingRewardsMethod = QueryGrpc.getValidatorOutstandingRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorOutstandingRewardsMethod = QueryGrpc.getValidatorOutstandingRewardsMethod) == null) {
          QueryGrpc.getValidatorOutstandingRewardsMethod = getValidatorOutstandingRewardsMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest, com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorOutstandingRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorOutstandingRewards"))
              .build();
        }
      }
    }
    return getValidatorOutstandingRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> getValidatorCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorCommission",
      requestType = com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> getValidatorCommissionMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest, com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> getValidatorCommissionMethod;
    if ((getValidatorCommissionMethod = QueryGrpc.getValidatorCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorCommissionMethod = QueryGrpc.getValidatorCommissionMethod) == null) {
          QueryGrpc.getValidatorCommissionMethod = getValidatorCommissionMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest, com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorCommission"))
              .build();
        }
      }
    }
    return getValidatorCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> getValidatorSlashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorSlashes",
      requestType = com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest,
      com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> getValidatorSlashesMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest, com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> getValidatorSlashesMethod;
    if ((getValidatorSlashesMethod = QueryGrpc.getValidatorSlashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorSlashesMethod = QueryGrpc.getValidatorSlashesMethod) == null) {
          QueryGrpc.getValidatorSlashesMethod = getValidatorSlashesMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest, com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorSlashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorSlashes"))
              .build();
        }
      }
    }
    return getValidatorSlashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> getDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegationRewards",
      requestType = com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> getDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest, com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> getDelegationRewardsMethod;
    if ((getDelegationRewardsMethod = QueryGrpc.getDelegationRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationRewardsMethod = QueryGrpc.getDelegationRewardsMethod) == null) {
          QueryGrpc.getDelegationRewardsMethod = getDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest, com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegationRewards"))
              .build();
        }
      }
    }
    return getDelegationRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegationTotalRewards",
      requestType = com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest.class,
      responseType = com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest,
      com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod() {
    io.grpc.MethodDescriptor<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest, com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> getDelegationTotalRewardsMethod;
    if ((getDelegationTotalRewardsMethod = QueryGrpc.getDelegationTotalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationTotalRewardsMethod = QueryGrpc.getDelegationTotalRewardsMethod) == null) {
          QueryGrpc.getDelegationTotalRewardsMethod = getDelegationTotalRewardsMethod =
              io.grpc.MethodDescriptor.<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest, com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegationTotalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegationTotalRewards"))
              .build();
        }
      }
    }
    return getDelegationTotalRewardsMethod;
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
   * Query defines the gRPC querier service for distribution module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries params of the distribution module.
     * </pre>
     */
    default void params(com.initia.distribution.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    default void validatorOutstandingRewards(com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorOutstandingRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    default void validatorCommission(com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    default void validatorSlashes(com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorSlashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    default void delegationRewards(com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegationRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    default void delegationTotalRewards(com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegationTotalRewardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public void params(com.initia.distribution.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public void validatorOutstandingRewards(com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public void validatorCommission(com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public void validatorSlashes(com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorSlashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public void delegationRewards(com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public void delegationTotalRewards(com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegationTotalRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryParamsResponse params(com.initia.distribution.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse validatorOutstandingRewards(com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorOutstandingRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse validatorCommission(com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse validatorSlashes(com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorSlashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse delegationRewards(com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegationRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse delegationTotalRewards(com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegationTotalRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the distribution module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryParamsResponse> params(
        com.initia.distribution.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse> validatorOutstandingRewards(
        com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorCommission queries accumulated commission for a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse> validatorCommission(
        com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorSlashes queries slash events of a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse> validatorSlashes(
        com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorSlashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegationRewards queries the total rewards accrued by a delegation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse> delegationRewards(
        com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegationRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegationTotalRewards queries the total rewards accrued by a each
     * validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse> delegationTotalRewards(
        com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegationTotalRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_VALIDATOR_OUTSTANDING_REWARDS = 1;
  private static final int METHODID_VALIDATOR_COMMISSION = 2;
  private static final int METHODID_VALIDATOR_SLASHES = 3;
  private static final int METHODID_DELEGATION_REWARDS = 4;
  private static final int METHODID_DELEGATION_TOTAL_REWARDS = 5;

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
          serviceImpl.params((com.initia.distribution.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_OUTSTANDING_REWARDS:
          serviceImpl.validatorOutstandingRewards((com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_COMMISSION:
          serviceImpl.validatorCommission((com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_SLASHES:
          serviceImpl.validatorSlashes((com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse>) responseObserver);
          break;
        case METHODID_DELEGATION_REWARDS:
          serviceImpl.delegationRewards((com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse>) responseObserver);
          break;
        case METHODID_DELEGATION_TOTAL_REWARDS:
          serviceImpl.delegationTotalRewards((com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse>) responseObserver);
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
              com.initia.distribution.v1.QueryProto.QueryParamsRequest,
              com.initia.distribution.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getValidatorOutstandingRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsRequest,
              com.initia.distribution.v1.QueryProto.QueryValidatorOutstandingRewardsResponse>(
                service, METHODID_VALIDATOR_OUTSTANDING_REWARDS)))
        .addMethod(
          getValidatorCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.distribution.v1.QueryProto.QueryValidatorCommissionRequest,
              com.initia.distribution.v1.QueryProto.QueryValidatorCommissionResponse>(
                service, METHODID_VALIDATOR_COMMISSION)))
        .addMethod(
          getValidatorSlashesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.distribution.v1.QueryProto.QueryValidatorSlashesRequest,
              com.initia.distribution.v1.QueryProto.QueryValidatorSlashesResponse>(
                service, METHODID_VALIDATOR_SLASHES)))
        .addMethod(
          getDelegationRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.distribution.v1.QueryProto.QueryDelegationRewardsRequest,
              com.initia.distribution.v1.QueryProto.QueryDelegationRewardsResponse>(
                service, METHODID_DELEGATION_REWARDS)))
        .addMethod(
          getDelegationTotalRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsRequest,
              com.initia.distribution.v1.QueryProto.QueryDelegationTotalRewardsResponse>(
                service, METHODID_DELEGATION_TOTAL_REWARDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.initia.distribution.v1.QueryProto.getDescriptor();
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
              .addMethod(getValidatorOutstandingRewardsMethod())
              .addMethod(getValidatorCommissionMethod())
              .addMethod(getValidatorSlashesMethod())
              .addMethod(getDelegationRewardsMethod())
              .addMethod(getDelegationTotalRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
