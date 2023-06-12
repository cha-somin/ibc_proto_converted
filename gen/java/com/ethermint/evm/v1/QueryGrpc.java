package com.ethermint.evm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ethermint/evm/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ethermint.evm.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryAccountRequest,
      com.ethermint.evm.v1.QueryAccountResponse> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = com.ethermint.evm.v1.QueryAccountRequest.class,
      responseType = com.ethermint.evm.v1.QueryAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryAccountRequest,
      com.ethermint.evm.v1.QueryAccountResponse> getAccountMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryAccountRequest, com.ethermint.evm.v1.QueryAccountResponse> getAccountMethod;
    if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
          QueryGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryAccountRequest, com.ethermint.evm.v1.QueryAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCosmosAccountRequest,
      com.ethermint.evm.v1.QueryCosmosAccountResponse> getCosmosAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CosmosAccount",
      requestType = com.ethermint.evm.v1.QueryCosmosAccountRequest.class,
      responseType = com.ethermint.evm.v1.QueryCosmosAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCosmosAccountRequest,
      com.ethermint.evm.v1.QueryCosmosAccountResponse> getCosmosAccountMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCosmosAccountRequest, com.ethermint.evm.v1.QueryCosmosAccountResponse> getCosmosAccountMethod;
    if ((getCosmosAccountMethod = QueryGrpc.getCosmosAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCosmosAccountMethod = QueryGrpc.getCosmosAccountMethod) == null) {
          QueryGrpc.getCosmosAccountMethod = getCosmosAccountMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryCosmosAccountRequest, com.ethermint.evm.v1.QueryCosmosAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CosmosAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryCosmosAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryCosmosAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CosmosAccount"))
              .build();
        }
      }
    }
    return getCosmosAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryValidatorAccountRequest,
      com.ethermint.evm.v1.QueryValidatorAccountResponse> getValidatorAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorAccount",
      requestType = com.ethermint.evm.v1.QueryValidatorAccountRequest.class,
      responseType = com.ethermint.evm.v1.QueryValidatorAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryValidatorAccountRequest,
      com.ethermint.evm.v1.QueryValidatorAccountResponse> getValidatorAccountMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryValidatorAccountRequest, com.ethermint.evm.v1.QueryValidatorAccountResponse> getValidatorAccountMethod;
    if ((getValidatorAccountMethod = QueryGrpc.getValidatorAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorAccountMethod = QueryGrpc.getValidatorAccountMethod) == null) {
          QueryGrpc.getValidatorAccountMethod = getValidatorAccountMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryValidatorAccountRequest, com.ethermint.evm.v1.QueryValidatorAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryValidatorAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryValidatorAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorAccount"))
              .build();
        }
      }
    }
    return getValidatorAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBalanceRequest,
      com.ethermint.evm.v1.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.ethermint.evm.v1.QueryBalanceRequest.class,
      responseType = com.ethermint.evm.v1.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBalanceRequest,
      com.ethermint.evm.v1.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBalanceRequest, com.ethermint.evm.v1.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryBalanceRequest, com.ethermint.evm.v1.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryStorageRequest,
      com.ethermint.evm.v1.QueryStorageResponse> getStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Storage",
      requestType = com.ethermint.evm.v1.QueryStorageRequest.class,
      responseType = com.ethermint.evm.v1.QueryStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryStorageRequest,
      com.ethermint.evm.v1.QueryStorageResponse> getStorageMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryStorageRequest, com.ethermint.evm.v1.QueryStorageResponse> getStorageMethod;
    if ((getStorageMethod = QueryGrpc.getStorageMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStorageMethod = QueryGrpc.getStorageMethod) == null) {
          QueryGrpc.getStorageMethod = getStorageMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryStorageRequest, com.ethermint.evm.v1.QueryStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Storage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryStorageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Storage"))
              .build();
        }
      }
    }
    return getStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCodeRequest,
      com.ethermint.evm.v1.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = com.ethermint.evm.v1.QueryCodeRequest.class,
      responseType = com.ethermint.evm.v1.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCodeRequest,
      com.ethermint.evm.v1.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryCodeRequest, com.ethermint.evm.v1.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryCodeRequest, com.ethermint.evm.v1.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
              .build();
        }
      }
    }
    return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryParamsRequest,
      com.ethermint.evm.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ethermint.evm.v1.QueryParamsRequest.class,
      responseType = com.ethermint.evm.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryParamsRequest,
      com.ethermint.evm.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryParamsRequest, com.ethermint.evm.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryParamsRequest, com.ethermint.evm.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest,
      com.ethermint.evm.v1.MsgEthereumTxResponse> getEthCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EthCall",
      requestType = com.ethermint.evm.v1.EthCallRequest.class,
      responseType = com.ethermint.evm.v1.MsgEthereumTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest,
      com.ethermint.evm.v1.MsgEthereumTxResponse> getEthCallMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest, com.ethermint.evm.v1.MsgEthereumTxResponse> getEthCallMethod;
    if ((getEthCallMethod = QueryGrpc.getEthCallMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEthCallMethod = QueryGrpc.getEthCallMethod) == null) {
          QueryGrpc.getEthCallMethod = getEthCallMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.EthCallRequest, com.ethermint.evm.v1.MsgEthereumTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EthCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.EthCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.MsgEthereumTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EthCall"))
              .build();
        }
      }
    }
    return getEthCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest,
      com.ethermint.evm.v1.EstimateGasResponse> getEstimateGasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateGas",
      requestType = com.ethermint.evm.v1.EthCallRequest.class,
      responseType = com.ethermint.evm.v1.EstimateGasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest,
      com.ethermint.evm.v1.EstimateGasResponse> getEstimateGasMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.EthCallRequest, com.ethermint.evm.v1.EstimateGasResponse> getEstimateGasMethod;
    if ((getEstimateGasMethod = QueryGrpc.getEstimateGasMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateGasMethod = QueryGrpc.getEstimateGasMethod) == null) {
          QueryGrpc.getEstimateGasMethod = getEstimateGasMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.EthCallRequest, com.ethermint.evm.v1.EstimateGasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.EthCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.EstimateGasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateGas"))
              .build();
        }
      }
    }
    return getEstimateGasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceTxRequest,
      com.ethermint.evm.v1.QueryTraceTxResponse> getTraceTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraceTx",
      requestType = com.ethermint.evm.v1.QueryTraceTxRequest.class,
      responseType = com.ethermint.evm.v1.QueryTraceTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceTxRequest,
      com.ethermint.evm.v1.QueryTraceTxResponse> getTraceTxMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceTxRequest, com.ethermint.evm.v1.QueryTraceTxResponse> getTraceTxMethod;
    if ((getTraceTxMethod = QueryGrpc.getTraceTxMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraceTxMethod = QueryGrpc.getTraceTxMethod) == null) {
          QueryGrpc.getTraceTxMethod = getTraceTxMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryTraceTxRequest, com.ethermint.evm.v1.QueryTraceTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraceTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryTraceTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryTraceTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraceTx"))
              .build();
        }
      }
    }
    return getTraceTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceBlockRequest,
      com.ethermint.evm.v1.QueryTraceBlockResponse> getTraceBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraceBlock",
      requestType = com.ethermint.evm.v1.QueryTraceBlockRequest.class,
      responseType = com.ethermint.evm.v1.QueryTraceBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceBlockRequest,
      com.ethermint.evm.v1.QueryTraceBlockResponse> getTraceBlockMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryTraceBlockRequest, com.ethermint.evm.v1.QueryTraceBlockResponse> getTraceBlockMethod;
    if ((getTraceBlockMethod = QueryGrpc.getTraceBlockMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraceBlockMethod = QueryGrpc.getTraceBlockMethod) == null) {
          QueryGrpc.getTraceBlockMethod = getTraceBlockMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryTraceBlockRequest, com.ethermint.evm.v1.QueryTraceBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraceBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryTraceBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryTraceBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraceBlock"))
              .build();
        }
      }
    }
    return getTraceBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBaseFeeRequest,
      com.ethermint.evm.v1.QueryBaseFeeResponse> getBaseFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseFee",
      requestType = com.ethermint.evm.v1.QueryBaseFeeRequest.class,
      responseType = com.ethermint.evm.v1.QueryBaseFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBaseFeeRequest,
      com.ethermint.evm.v1.QueryBaseFeeResponse> getBaseFeeMethod() {
    io.grpc.MethodDescriptor<com.ethermint.evm.v1.QueryBaseFeeRequest, com.ethermint.evm.v1.QueryBaseFeeResponse> getBaseFeeMethod;
    if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
          QueryGrpc.getBaseFeeMethod = getBaseFeeMethod =
              io.grpc.MethodDescriptor.<com.ethermint.evm.v1.QueryBaseFeeRequest, com.ethermint.evm.v1.QueryBaseFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BaseFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryBaseFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ethermint.evm.v1.QueryBaseFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BaseFee"))
              .build();
        }
      }
    }
    return getBaseFeeMethod;
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
     * Account queries an Ethereum account.
     * </pre>
     */
    default void account(com.ethermint.evm.v1.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CosmosAccount queries an Ethereum account's Cosmos Address.
     * </pre>
     */
    default void cosmosAccount(com.ethermint.evm.v1.QueryCosmosAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCosmosAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCosmosAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorAccount queries an Ethereum account's from a validator consensus
     * Address.
     * </pre>
     */
    default void validatorAccount(com.ethermint.evm.v1.QueryValidatorAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryValidatorAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance of a the EVM denomination for a single
     * EthAccount.
     * </pre>
     */
    default void balance(com.ethermint.evm.v1.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Storage queries the balance of all coins for a single account.
     * </pre>
     */
    default void storage(com.ethermint.evm.v1.QueryStorageRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Code queries the balance of all coins for a single account.
     * </pre>
     */
    default void code(com.ethermint.evm.v1.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/evm module.
     * </pre>
     */
    default void params(com.ethermint.evm.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * EthCall implements the `eth_call` rpc api
     * </pre>
     */
    default void ethCall(com.ethermint.evm.v1.EthCallRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.MsgEthereumTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEthCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateGas implements the `eth_estimateGas` rpc api
     * </pre>
     */
    default void estimateGas(com.ethermint.evm.v1.EthCallRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.EstimateGasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateGasMethod(), responseObserver);
    }

    /**
     * <pre>
     * TraceTx implements the `debug_traceTransaction` rpc api
     * </pre>
     */
    default void traceTx(com.ethermint.evm.v1.QueryTraceTxRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraceTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * TraceBlock implements the `debug_traceBlockByNumber` and `debug_traceBlockByHash` rpc api
     * </pre>
     */
    default void traceBlock(com.ethermint.evm.v1.QueryTraceBlockRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraceBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block,
     * it's similar to feemarket module's method, but also checks london hardfork status.
     * </pre>
     */
    default void baseFee(com.ethermint.evm.v1.QueryBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBaseFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBaseFeeMethod(), responseObserver);
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
     * Account queries an Ethereum account.
     * </pre>
     */
    public void account(com.ethermint.evm.v1.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CosmosAccount queries an Ethereum account's Cosmos Address.
     * </pre>
     */
    public void cosmosAccount(com.ethermint.evm.v1.QueryCosmosAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCosmosAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCosmosAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorAccount queries an Ethereum account's from a validator consensus
     * Address.
     * </pre>
     */
    public void validatorAccount(com.ethermint.evm.v1.QueryValidatorAccountRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryValidatorAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance of a the EVM denomination for a single
     * EthAccount.
     * </pre>
     */
    public void balance(com.ethermint.evm.v1.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Storage queries the balance of all coins for a single account.
     * </pre>
     */
    public void storage(com.ethermint.evm.v1.QueryStorageRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Code queries the balance of all coins for a single account.
     * </pre>
     */
    public void code(com.ethermint.evm.v1.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/evm module.
     * </pre>
     */
    public void params(com.ethermint.evm.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EthCall implements the `eth_call` rpc api
     * </pre>
     */
    public void ethCall(com.ethermint.evm.v1.EthCallRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.MsgEthereumTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEthCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateGas implements the `eth_estimateGas` rpc api
     * </pre>
     */
    public void estimateGas(com.ethermint.evm.v1.EthCallRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.EstimateGasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateGasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TraceTx implements the `debug_traceTransaction` rpc api
     * </pre>
     */
    public void traceTx(com.ethermint.evm.v1.QueryTraceTxRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraceTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TraceBlock implements the `debug_traceBlockByNumber` and `debug_traceBlockByHash` rpc api
     * </pre>
     */
    public void traceBlock(com.ethermint.evm.v1.QueryTraceBlockRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraceBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block,
     * it's similar to feemarket module's method, but also checks london hardfork status.
     * </pre>
     */
    public void baseFee(com.ethermint.evm.v1.QueryBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBaseFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request, responseObserver);
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
     * Account queries an Ethereum account.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryAccountResponse account(com.ethermint.evm.v1.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CosmosAccount queries an Ethereum account's Cosmos Address.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryCosmosAccountResponse cosmosAccount(com.ethermint.evm.v1.QueryCosmosAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCosmosAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorAccount queries an Ethereum account's from a validator consensus
     * Address.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryValidatorAccountResponse validatorAccount(com.ethermint.evm.v1.QueryValidatorAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Balance queries the balance of a the EVM denomination for a single
     * EthAccount.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryBalanceResponse balance(com.ethermint.evm.v1.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Storage queries the balance of all coins for a single account.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryStorageResponse storage(com.ethermint.evm.v1.QueryStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Code queries the balance of all coins for a single account.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryCodeResponse code(com.ethermint.evm.v1.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/evm module.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryParamsResponse params(com.ethermint.evm.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EthCall implements the `eth_call` rpc api
     * </pre>
     */
    public com.ethermint.evm.v1.MsgEthereumTxResponse ethCall(com.ethermint.evm.v1.EthCallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEthCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateGas implements the `eth_estimateGas` rpc api
     * </pre>
     */
    public com.ethermint.evm.v1.EstimateGasResponse estimateGas(com.ethermint.evm.v1.EthCallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateGasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TraceTx implements the `debug_traceTransaction` rpc api
     * </pre>
     */
    public com.ethermint.evm.v1.QueryTraceTxResponse traceTx(com.ethermint.evm.v1.QueryTraceTxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraceTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TraceBlock implements the `debug_traceBlockByNumber` and `debug_traceBlockByHash` rpc api
     * </pre>
     */
    public com.ethermint.evm.v1.QueryTraceBlockResponse traceBlock(com.ethermint.evm.v1.QueryTraceBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraceBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block,
     * it's similar to feemarket module's method, but also checks london hardfork status.
     * </pre>
     */
    public com.ethermint.evm.v1.QueryBaseFeeResponse baseFee(com.ethermint.evm.v1.QueryBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBaseFeeMethod(), getCallOptions(), request);
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
     * Account queries an Ethereum account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryAccountResponse> account(
        com.ethermint.evm.v1.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CosmosAccount queries an Ethereum account's Cosmos Address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryCosmosAccountResponse> cosmosAccount(
        com.ethermint.evm.v1.QueryCosmosAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCosmosAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorAccount queries an Ethereum account's from a validator consensus
     * Address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryValidatorAccountResponse> validatorAccount(
        com.ethermint.evm.v1.QueryValidatorAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Balance queries the balance of a the EVM denomination for a single
     * EthAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryBalanceResponse> balance(
        com.ethermint.evm.v1.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Storage queries the balance of all coins for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryStorageResponse> storage(
        com.ethermint.evm.v1.QueryStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Code queries the balance of all coins for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryCodeResponse> code(
        com.ethermint.evm.v1.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/evm module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryParamsResponse> params(
        com.ethermint.evm.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EthCall implements the `eth_call` rpc api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.MsgEthereumTxResponse> ethCall(
        com.ethermint.evm.v1.EthCallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEthCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateGas implements the `eth_estimateGas` rpc api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.EstimateGasResponse> estimateGas(
        com.ethermint.evm.v1.EthCallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateGasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TraceTx implements the `debug_traceTransaction` rpc api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryTraceTxResponse> traceTx(
        com.ethermint.evm.v1.QueryTraceTxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraceTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TraceBlock implements the `debug_traceBlockByNumber` and `debug_traceBlockByHash` rpc api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryTraceBlockResponse> traceBlock(
        com.ethermint.evm.v1.QueryTraceBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraceBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BaseFee queries the base fee of the parent block of the current block,
     * it's similar to feemarket module's method, but also checks london hardfork status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ethermint.evm.v1.QueryBaseFeeResponse> baseFee(
        com.ethermint.evm.v1.QueryBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT = 0;
  private static final int METHODID_COSMOS_ACCOUNT = 1;
  private static final int METHODID_VALIDATOR_ACCOUNT = 2;
  private static final int METHODID_BALANCE = 3;
  private static final int METHODID_STORAGE = 4;
  private static final int METHODID_CODE = 5;
  private static final int METHODID_PARAMS = 6;
  private static final int METHODID_ETH_CALL = 7;
  private static final int METHODID_ESTIMATE_GAS = 8;
  private static final int METHODID_TRACE_TX = 9;
  private static final int METHODID_TRACE_BLOCK = 10;
  private static final int METHODID_BASE_FEE = 11;

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
        case METHODID_ACCOUNT:
          serviceImpl.account((com.ethermint.evm.v1.QueryAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryAccountResponse>) responseObserver);
          break;
        case METHODID_COSMOS_ACCOUNT:
          serviceImpl.cosmosAccount((com.ethermint.evm.v1.QueryCosmosAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCosmosAccountResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_ACCOUNT:
          serviceImpl.validatorAccount((com.ethermint.evm.v1.QueryValidatorAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryValidatorAccountResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((com.ethermint.evm.v1.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_STORAGE:
          serviceImpl.storage((com.ethermint.evm.v1.QueryStorageRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryStorageResponse>) responseObserver);
          break;
        case METHODID_CODE:
          serviceImpl.code((com.ethermint.evm.v1.QueryCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.ethermint.evm.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ETH_CALL:
          serviceImpl.ethCall((com.ethermint.evm.v1.EthCallRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.MsgEthereumTxResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_GAS:
          serviceImpl.estimateGas((com.ethermint.evm.v1.EthCallRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.EstimateGasResponse>) responseObserver);
          break;
        case METHODID_TRACE_TX:
          serviceImpl.traceTx((com.ethermint.evm.v1.QueryTraceTxRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceTxResponse>) responseObserver);
          break;
        case METHODID_TRACE_BLOCK:
          serviceImpl.traceBlock((com.ethermint.evm.v1.QueryTraceBlockRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryTraceBlockResponse>) responseObserver);
          break;
        case METHODID_BASE_FEE:
          serviceImpl.baseFee((com.ethermint.evm.v1.QueryBaseFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.ethermint.evm.v1.QueryBaseFeeResponse>) responseObserver);
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
          getAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryAccountRequest,
              com.ethermint.evm.v1.QueryAccountResponse>(
                service, METHODID_ACCOUNT)))
        .addMethod(
          getCosmosAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryCosmosAccountRequest,
              com.ethermint.evm.v1.QueryCosmosAccountResponse>(
                service, METHODID_COSMOS_ACCOUNT)))
        .addMethod(
          getValidatorAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryValidatorAccountRequest,
              com.ethermint.evm.v1.QueryValidatorAccountResponse>(
                service, METHODID_VALIDATOR_ACCOUNT)))
        .addMethod(
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryBalanceRequest,
              com.ethermint.evm.v1.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryStorageRequest,
              com.ethermint.evm.v1.QueryStorageResponse>(
                service, METHODID_STORAGE)))
        .addMethod(
          getCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryCodeRequest,
              com.ethermint.evm.v1.QueryCodeResponse>(
                service, METHODID_CODE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryParamsRequest,
              com.ethermint.evm.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getEthCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.EthCallRequest,
              com.ethermint.evm.v1.MsgEthereumTxResponse>(
                service, METHODID_ETH_CALL)))
        .addMethod(
          getEstimateGasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.EthCallRequest,
              com.ethermint.evm.v1.EstimateGasResponse>(
                service, METHODID_ESTIMATE_GAS)))
        .addMethod(
          getTraceTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryTraceTxRequest,
              com.ethermint.evm.v1.QueryTraceTxResponse>(
                service, METHODID_TRACE_TX)))
        .addMethod(
          getTraceBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryTraceBlockRequest,
              com.ethermint.evm.v1.QueryTraceBlockResponse>(
                service, METHODID_TRACE_BLOCK)))
        .addMethod(
          getBaseFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ethermint.evm.v1.QueryBaseFeeRequest,
              com.ethermint.evm.v1.QueryBaseFeeResponse>(
                service, METHODID_BASE_FEE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ethermint.evm.v1.QueryProto.getDescriptor();
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
              .addMethod(getAccountMethod())
              .addMethod(getCosmosAccountMethod())
              .addMethod(getValidatorAccountMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getStorageMethod())
              .addMethod(getCodeMethod())
              .addMethod(getParamsMethod())
              .addMethod(getEthCallMethod())
              .addMethod(getEstimateGasMethod())
              .addMethod(getTraceTxMethod())
              .addMethod(getTraceBlockMethod())
              .addMethod(getBaseFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
