package com.crescent.lpfarm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: crescent/lpfarm/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "crescent.lpfarm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryParamsRequest,
      com.crescent.lpfarm.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.lpfarm.v1beta1.QueryParamsRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryParamsRequest,
      com.crescent.lpfarm.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryParamsRequest, com.crescent.lpfarm.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryParamsRequest, com.crescent.lpfarm.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlansRequest,
      com.crescent.lpfarm.v1beta1.QueryPlansResponse> getPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plans",
      requestType = com.crescent.lpfarm.v1beta1.QueryPlansRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlansRequest,
      com.crescent.lpfarm.v1beta1.QueryPlansResponse> getPlansMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlansRequest, com.crescent.lpfarm.v1beta1.QueryPlansResponse> getPlansMethod;
    if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
          QueryGrpc.getPlansMethod = getPlansMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryPlansRequest, com.crescent.lpfarm.v1beta1.QueryPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plans"))
              .build();
        }
      }
    }
    return getPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlanRequest,
      com.crescent.lpfarm.v1beta1.QueryPlanResponse> getPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plan",
      requestType = com.crescent.lpfarm.v1beta1.QueryPlanRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlanRequest,
      com.crescent.lpfarm.v1beta1.QueryPlanResponse> getPlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPlanRequest, com.crescent.lpfarm.v1beta1.QueryPlanResponse> getPlanMethod;
    if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
          QueryGrpc.getPlanMethod = getPlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryPlanRequest, com.crescent.lpfarm.v1beta1.QueryPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plan"))
              .build();
        }
      }
    }
    return getPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryFarmRequest,
      com.crescent.lpfarm.v1beta1.QueryFarmResponse> getFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Farm",
      requestType = com.crescent.lpfarm.v1beta1.QueryFarmRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryFarmRequest,
      com.crescent.lpfarm.v1beta1.QueryFarmResponse> getFarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryFarmRequest, com.crescent.lpfarm.v1beta1.QueryFarmResponse> getFarmMethod;
    if ((getFarmMethod = QueryGrpc.getFarmMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmMethod = QueryGrpc.getFarmMethod) == null) {
          QueryGrpc.getFarmMethod = getFarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryFarmRequest, com.crescent.lpfarm.v1beta1.QueryFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Farm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Farm"))
              .build();
        }
      }
    }
    return getFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionsRequest,
      com.crescent.lpfarm.v1beta1.QueryPositionsResponse> getPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Positions",
      requestType = com.crescent.lpfarm.v1beta1.QueryPositionsRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionsRequest,
      com.crescent.lpfarm.v1beta1.QueryPositionsResponse> getPositionsMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionsRequest, com.crescent.lpfarm.v1beta1.QueryPositionsResponse> getPositionsMethod;
    if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
          QueryGrpc.getPositionsMethod = getPositionsMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryPositionsRequest, com.crescent.lpfarm.v1beta1.QueryPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Positions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Positions"))
              .build();
        }
      }
    }
    return getPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionRequest,
      com.crescent.lpfarm.v1beta1.QueryPositionResponse> getPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Position",
      requestType = com.crescent.lpfarm.v1beta1.QueryPositionRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionRequest,
      com.crescent.lpfarm.v1beta1.QueryPositionResponse> getPositionMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryPositionRequest, com.crescent.lpfarm.v1beta1.QueryPositionResponse> getPositionMethod;
    if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
          QueryGrpc.getPositionMethod = getPositionMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryPositionRequest, com.crescent.lpfarm.v1beta1.QueryPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Position"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Position"))
              .build();
        }
      }
    }
    return getPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalRewards",
      requestType = com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest, com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;
    if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
          QueryGrpc.getHistoricalRewardsMethod = getHistoricalRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest, com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalRewards"))
              .build();
        }
      }
    }
    return getHistoricalRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> getTotalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalRewards",
      requestType = com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> getTotalRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest, com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> getTotalRewardsMethod;
    if ((getTotalRewardsMethod = QueryGrpc.getTotalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalRewardsMethod = QueryGrpc.getTotalRewardsMethod) == null) {
          QueryGrpc.getTotalRewardsMethod = getTotalRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest, com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalRewards"))
              .build();
        }
      }
    }
    return getTotalRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryRewardsResponse> getRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rewards",
      requestType = com.crescent.lpfarm.v1beta1.QueryRewardsRequest.class,
      responseType = com.crescent.lpfarm.v1beta1.QueryRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryRewardsRequest,
      com.crescent.lpfarm.v1beta1.QueryRewardsResponse> getRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.QueryRewardsRequest, com.crescent.lpfarm.v1beta1.QueryRewardsResponse> getRewardsMethod;
    if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
          QueryGrpc.getRewardsMethod = getRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.QueryRewardsRequest, com.crescent.lpfarm.v1beta1.QueryRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.QueryRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Rewards"))
              .build();
        }
      }
    }
    return getRewardsMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void params(com.crescent.lpfarm.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void plans(com.crescent.lpfarm.v1beta1.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlansMethod(), responseObserver);
    }

    /**
     */
    default void plan(com.crescent.lpfarm.v1beta1.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanMethod(), responseObserver);
    }

    /**
     */
    default void farm(com.crescent.lpfarm.v1beta1.QueryFarmRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmMethod(), responseObserver);
    }

    /**
     */
    default void positions(com.crescent.lpfarm.v1beta1.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionsMethod(), responseObserver);
    }

    /**
     */
    default void position(com.crescent.lpfarm.v1beta1.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionMethod(), responseObserver);
    }

    /**
     */
    default void historicalRewards(com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalRewardsMethod(), responseObserver);
    }

    /**
     */
    default void totalRewards(com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalRewardsMethod(), responseObserver);
    }

    /**
     */
    default void rewards(com.crescent.lpfarm.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     */
    public void params(com.crescent.lpfarm.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void plans(com.crescent.lpfarm.v1beta1.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void plan(com.crescent.lpfarm.v1beta1.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void farm(com.crescent.lpfarm.v1beta1.QueryFarmRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void positions(com.crescent.lpfarm.v1beta1.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void position(com.crescent.lpfarm.v1beta1.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void historicalRewards(com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalRewards(com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rewards(com.crescent.lpfarm.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     */
    public com.crescent.lpfarm.v1beta1.QueryParamsResponse params(com.crescent.lpfarm.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryPlansResponse plans(com.crescent.lpfarm.v1beta1.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlansMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryPlanResponse plan(com.crescent.lpfarm.v1beta1.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryFarmResponse farm(com.crescent.lpfarm.v1beta1.QueryFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryPositionsResponse positions(com.crescent.lpfarm.v1beta1.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryPositionResponse position(com.crescent.lpfarm.v1beta1.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse historicalRewards(com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse totalRewards(com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.QueryRewardsResponse rewards(com.crescent.lpfarm.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryParamsResponse> params(
        com.crescent.lpfarm.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryPlansResponse> plans(
        com.crescent.lpfarm.v1beta1.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryPlanResponse> plan(
        com.crescent.lpfarm.v1beta1.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryFarmResponse> farm(
        com.crescent.lpfarm.v1beta1.QueryFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryPositionsResponse> positions(
        com.crescent.lpfarm.v1beta1.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryPositionResponse> position(
        com.crescent.lpfarm.v1beta1.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse> historicalRewards(
        com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse> totalRewards(
        com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.QueryRewardsResponse> rewards(
        com.crescent.lpfarm.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_PLANS = 1;
  private static final int METHODID_PLAN = 2;
  private static final int METHODID_FARM = 3;
  private static final int METHODID_POSITIONS = 4;
  private static final int METHODID_POSITION = 5;
  private static final int METHODID_HISTORICAL_REWARDS = 6;
  private static final int METHODID_TOTAL_REWARDS = 7;
  private static final int METHODID_REWARDS = 8;

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
          serviceImpl.params((com.crescent.lpfarm.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_PLANS:
          serviceImpl.plans((com.crescent.lpfarm.v1beta1.QueryPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlansResponse>) responseObserver);
          break;
        case METHODID_PLAN:
          serviceImpl.plan((com.crescent.lpfarm.v1beta1.QueryPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPlanResponse>) responseObserver);
          break;
        case METHODID_FARM:
          serviceImpl.farm((com.crescent.lpfarm.v1beta1.QueryFarmRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryFarmResponse>) responseObserver);
          break;
        case METHODID_POSITIONS:
          serviceImpl.positions((com.crescent.lpfarm.v1beta1.QueryPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionsResponse>) responseObserver);
          break;
        case METHODID_POSITION:
          serviceImpl.position((com.crescent.lpfarm.v1beta1.QueryPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryPositionResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_REWARDS:
          serviceImpl.historicalRewards((com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_REWARDS:
          serviceImpl.totalRewards((com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse>) responseObserver);
          break;
        case METHODID_REWARDS:
          serviceImpl.rewards((com.crescent.lpfarm.v1beta1.QueryRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.QueryRewardsResponse>) responseObserver);
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
              com.crescent.lpfarm.v1beta1.QueryParamsRequest,
              com.crescent.lpfarm.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryPlansRequest,
              com.crescent.lpfarm.v1beta1.QueryPlansResponse>(
                service, METHODID_PLANS)))
        .addMethod(
          getPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryPlanRequest,
              com.crescent.lpfarm.v1beta1.QueryPlanResponse>(
                service, METHODID_PLAN)))
        .addMethod(
          getFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryFarmRequest,
              com.crescent.lpfarm.v1beta1.QueryFarmResponse>(
                service, METHODID_FARM)))
        .addMethod(
          getPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryPositionsRequest,
              com.crescent.lpfarm.v1beta1.QueryPositionsResponse>(
                service, METHODID_POSITIONS)))
        .addMethod(
          getPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryPositionRequest,
              com.crescent.lpfarm.v1beta1.QueryPositionResponse>(
                service, METHODID_POSITION)))
        .addMethod(
          getHistoricalRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest,
              com.crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse>(
                service, METHODID_HISTORICAL_REWARDS)))
        .addMethod(
          getTotalRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryTotalRewardsRequest,
              com.crescent.lpfarm.v1beta1.QueryTotalRewardsResponse>(
                service, METHODID_TOTAL_REWARDS)))
        .addMethod(
          getRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.QueryRewardsRequest,
              com.crescent.lpfarm.v1beta1.QueryRewardsResponse>(
                service, METHODID_REWARDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.lpfarm.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getPlansMethod())
              .addMethod(getPlanMethod())
              .addMethod(getFarmMethod())
              .addMethod(getPositionsMethod())
              .addMethod(getPositionMethod())
              .addMethod(getHistoricalRewardsMethod())
              .addMethod(getTotalRewardsMethod())
              .addMethod(getRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
