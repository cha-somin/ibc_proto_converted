package com.persistence.oracle.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: persistence/oracle/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "persistence.oracle.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> getAllExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllExchangeRates",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> getAllExchangeRatesMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> getAllExchangeRatesMethod;
    if ((getAllExchangeRatesMethod = QueryGrpc.getAllExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllExchangeRatesMethod = QueryGrpc.getAllExchangeRatesMethod) == null) {
          QueryGrpc.getAllExchangeRatesMethod = getAllExchangeRatesMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllExchangeRates"))
              .build();
        }
      }
    }
    return getAllExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest, com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest, com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveExchangeRates",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod;
    if ((getActiveExchangeRatesMethod = QueryGrpc.getActiveExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveExchangeRatesMethod = QueryGrpc.getActiveExchangeRatesMethod) == null) {
          QueryGrpc.getActiveExchangeRatesMethod = getActiveExchangeRatesMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveExchangeRates"))
              .build();
        }
      }
    }
    return getActiveExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeederDelegation",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest, com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod;
    if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
          QueryGrpc.getFeederDelegationMethod = getFeederDelegationMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest, com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeederDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeederDelegation"))
              .build();
        }
      }
    }
    return getFeederDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> getMissCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissCounter",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> getMissCounterMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest, com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> getMissCounterMethod;
    if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
          QueryGrpc.getMissCounterMethod = getMissCounterMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest, com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MissCounter"))
              .build();
        }
      }
    }
    return getMissCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevote",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;
    if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
          QueryGrpc.getAggregatePrevoteMethod = getAggregatePrevoteMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevote"))
              .build();
        }
      }
    }
    return getAggregatePrevoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevotes",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;
    if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
          QueryGrpc.getAggregatePrevotesMethod = getAggregatePrevotesMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevotes"))
              .build();
        }
      }
    }
    return getAggregatePrevotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVote",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod;
    if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
          QueryGrpc.getAggregateVoteMethod = getAggregateVoteMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVote"))
              .build();
        }
      }
    }
    return getAggregateVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVotes",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod;
    if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
          QueryGrpc.getAggregateVotesMethod = getAggregateVotesMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest, com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVotes"))
              .build();
        }
      }
    }
    return getAggregateVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest, com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest, com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> getQueryRewardPoolBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryRewardPoolBalance",
      requestType = com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest.class,
      responseType = com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest,
      com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> getQueryRewardPoolBalanceMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest, com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> getQueryRewardPoolBalanceMethod;
    if ((getQueryRewardPoolBalanceMethod = QueryGrpc.getQueryRewardPoolBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryRewardPoolBalanceMethod = QueryGrpc.getQueryRewardPoolBalanceMethod) == null) {
          QueryGrpc.getQueryRewardPoolBalanceMethod = getQueryRewardPoolBalanceMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest, com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryRewardPoolBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryRewardPoolBalance"))
              .build();
        }
      }
    }
    return getQueryRewardPoolBalanceMethod;
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
     * ExchangeRates returns exchange rates of all denoms.
     * </pre>
     */
    default void allExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates of a specified denom.
     * </pre>
     */
    default void exchangeRate(com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    default void activeExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    default void feederDelegation(com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeederDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    default void missCounter(com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMissCounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    default void aggregatePrevote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregatePrevoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    default void aggregatePrevotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregatePrevotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    default void aggregateVote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    default void aggregateVotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryRewardPoolBalance queries funds left in the reward pool.
     * </pre>
     */
    default void queryRewardPoolBalance(com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryRewardPoolBalanceMethod(), responseObserver);
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
     * ExchangeRates returns exchange rates of all denoms.
     * </pre>
     */
    public void allExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates of a specified denom.
     * </pre>
     */
    public void exchangeRate(com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public void activeExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void missCounter(com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public void aggregatePrevote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public void aggregatePrevotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public void aggregateVote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public void aggregateVotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryRewardPoolBalance queries funds left in the reward pool.
     * </pre>
     */
    public void queryRewardPoolBalance(com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryRewardPoolBalanceMethod(), getCallOptions()), request, responseObserver);
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
     * ExchangeRates returns exchange rates of all denoms.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse allExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates of a specified denom.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse exchangeRate(com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse activeExchangeRates(com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse feederDelegation(com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeederDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse missCounter(com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMissCounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse aggregatePrevote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregatePrevoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse aggregatePrevotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregatePrevotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse aggregateVote(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse aggregateVotes(com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse params(com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryRewardPoolBalance queries funds left in the reward pool.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse queryRewardPoolBalance(com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryRewardPoolBalanceMethod(), getCallOptions(), request);
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
     * ExchangeRates returns exchange rates of all denoms.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse> allExchangeRates(
        com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates of a specified denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse> exchangeRate(
        com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse> activeExchangeRates(
        com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse> feederDelegation(
        com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse> missCounter(
        com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse> aggregatePrevote(
        com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse> aggregatePrevotes(
        com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse> aggregateVote(
        com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse> aggregateVotes(
        com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse> params(
        com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryRewardPoolBalance queries funds left in the reward pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse> queryRewardPoolBalance(
        com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryRewardPoolBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_EXCHANGE_RATES = 0;
  private static final int METHODID_EXCHANGE_RATE = 1;
  private static final int METHODID_ACTIVE_EXCHANGE_RATES = 2;
  private static final int METHODID_FEEDER_DELEGATION = 3;
  private static final int METHODID_MISS_COUNTER = 4;
  private static final int METHODID_AGGREGATE_PREVOTE = 5;
  private static final int METHODID_AGGREGATE_PREVOTES = 6;
  private static final int METHODID_AGGREGATE_VOTE = 7;
  private static final int METHODID_AGGREGATE_VOTES = 8;
  private static final int METHODID_PARAMS = 9;
  private static final int METHODID_QUERY_REWARD_POOL_BALANCE = 10;

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
        case METHODID_ALL_EXCHANGE_RATES:
          serviceImpl.allExchangeRates((com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE:
          serviceImpl.exchangeRate((com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_EXCHANGE_RATES:
          serviceImpl.activeExchangeRates((com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_FEEDER_DELEGATION:
          serviceImpl.feederDelegation((com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse>) responseObserver);
          break;
        case METHODID_MISS_COUNTER:
          serviceImpl.missCounter((com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTE:
          serviceImpl.aggregatePrevote((com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTES:
          serviceImpl.aggregatePrevotes((com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTE:
          serviceImpl.aggregateVote((com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTES:
          serviceImpl.aggregateVotes((com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_REWARD_POOL_BALANCE:
          serviceImpl.queryRewardPoolBalance((com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse>) responseObserver);
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
          getAllExchangeRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryAllExchangeRatesResponse>(
                service, METHODID_ALL_EXCHANGE_RATES)))
        .addMethod(
          getExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryExchangeRateResponse>(
                service, METHODID_EXCHANGE_RATE)))
        .addMethod(
          getActiveExchangeRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryActiveExchangeRatesResponse>(
                service, METHODID_ACTIVE_EXCHANGE_RATES)))
        .addMethod(
          getFeederDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryFeederDelegationResponse>(
                service, METHODID_FEEDER_DELEGATION)))
        .addMethod(
          getMissCounterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryMissCounterResponse>(
                service, METHODID_MISS_COUNTER)))
        .addMethod(
          getAggregatePrevoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevoteResponse>(
                service, METHODID_AGGREGATE_PREVOTE)))
        .addMethod(
          getAggregatePrevotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregatePrevotesResponse>(
                service, METHODID_AGGREGATE_PREVOTES)))
        .addMethod(
          getAggregateVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVoteResponse>(
                service, METHODID_AGGREGATE_VOTE)))
        .addMethod(
          getAggregateVotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryAggregateVotesResponse>(
                service, METHODID_AGGREGATE_VOTES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryParamsRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryRewardPoolBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceRequest,
              com.persistence.oracle.v1beta1.QueryProto.QueryRewardPoolBalanceResponse>(
                service, METHODID_QUERY_REWARD_POOL_BALANCE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.persistence.oracle.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getAllExchangeRatesMethod())
              .addMethod(getExchangeRateMethod())
              .addMethod(getActiveExchangeRatesMethod())
              .addMethod(getFeederDelegationMethod())
              .addMethod(getMissCounterMethod())
              .addMethod(getAggregatePrevoteMethod())
              .addMethod(getAggregatePrevotesMethod())
              .addMethod(getAggregateVoteMethod())
              .addMethod(getAggregateVotesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getQueryRewardPoolBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
