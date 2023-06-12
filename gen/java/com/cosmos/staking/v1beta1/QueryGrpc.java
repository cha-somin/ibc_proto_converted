package com.cosmos.staking.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/staking/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.staking.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validators",
      requestType = com.cosmos.staking.v1beta1.QueryValidatorsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorsRequest, com.cosmos.staking.v1beta1.QueryValidatorsResponse> getValidatorsMethod;
    if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
          QueryGrpc.getValidatorsMethod = getValidatorsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryValidatorsRequest, com.cosmos.staking.v1beta1.QueryValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validators"))
              .build();
        }
      }
    }
    return getValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorRequest,
      com.cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validator",
      requestType = com.cosmos.staking.v1beta1.QueryValidatorRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorRequest,
      com.cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorRequest, com.cosmos.staking.v1beta1.QueryValidatorResponse> getValidatorMethod;
    if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
          QueryGrpc.getValidatorMethod = getValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryValidatorRequest, com.cosmos.staking.v1beta1.QueryValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validator"))
              .build();
        }
      }
    }
    return getValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorDelegations",
      requestType = com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest, com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> getValidatorDelegationsMethod;
    if ((getValidatorDelegationsMethod = QueryGrpc.getValidatorDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorDelegationsMethod = QueryGrpc.getValidatorDelegationsMethod) == null) {
          QueryGrpc.getValidatorDelegationsMethod = getValidatorDelegationsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest, com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorDelegations"))
              .build();
        }
      }
    }
    return getValidatorDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorUnbondingDelegations",
      requestType = com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest, com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;
    if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
          QueryGrpc.getValidatorUnbondingDelegationsMethod = getValidatorUnbondingDelegationsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest, com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorUnbondingDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorUnbondingDelegations"))
              .build();
        }
      }
    }
    return getValidatorUnbondingDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegationRequest,
      com.cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegation",
      requestType = com.cosmos.staking.v1beta1.QueryDelegationRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegationRequest,
      com.cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegationRequest, com.cosmos.staking.v1beta1.QueryDelegationResponse> getDelegationMethod;
    if ((getDelegationMethod = QueryGrpc.getDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationMethod = QueryGrpc.getDelegationMethod) == null) {
          QueryGrpc.getDelegationMethod = getDelegationMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryDelegationRequest, com.cosmos.staking.v1beta1.QueryDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Delegation"))
              .build();
        }
      }
    }
    return getDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
      com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingDelegation",
      requestType = com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
      com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest, com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> getUnbondingDelegationMethod;
    if ((getUnbondingDelegationMethod = QueryGrpc.getUnbondingDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingDelegationMethod = QueryGrpc.getUnbondingDelegationMethod) == null) {
          QueryGrpc.getUnbondingDelegationMethod = getUnbondingDelegationMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest, com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondingDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingDelegation"))
              .build();
        }
      }
    }
    return getUnbondingDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorDelegations",
      requestType = com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest, com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> getDelegatorDelegationsMethod;
    if ((getDelegatorDelegationsMethod = QueryGrpc.getDelegatorDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorDelegationsMethod = QueryGrpc.getDelegatorDelegationsMethod) == null) {
          QueryGrpc.getDelegatorDelegationsMethod = getDelegatorDelegationsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest, com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorDelegations"))
              .build();
        }
      }
    }
    return getDelegatorDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorUnbondingDelegations",
      requestType = com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest, com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> getDelegatorUnbondingDelegationsMethod;
    if ((getDelegatorUnbondingDelegationsMethod = QueryGrpc.getDelegatorUnbondingDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorUnbondingDelegationsMethod = QueryGrpc.getDelegatorUnbondingDelegationsMethod) == null) {
          QueryGrpc.getDelegatorUnbondingDelegationsMethod = getDelegatorUnbondingDelegationsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest, com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorUnbondingDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorUnbondingDelegations"))
              .build();
        }
      }
    }
    return getDelegatorUnbondingDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryRedelegationsRequest,
      com.cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redelegations",
      requestType = com.cosmos.staking.v1beta1.QueryRedelegationsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryRedelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryRedelegationsRequest,
      com.cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryRedelegationsRequest, com.cosmos.staking.v1beta1.QueryRedelegationsResponse> getRedelegationsMethod;
    if ((getRedelegationsMethod = QueryGrpc.getRedelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRedelegationsMethod = QueryGrpc.getRedelegationsMethod) == null) {
          QueryGrpc.getRedelegationsMethod = getRedelegationsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryRedelegationsRequest, com.cosmos.staking.v1beta1.QueryRedelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryRedelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryRedelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Redelegations"))
              .build();
        }
      }
    }
    return getRedelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorValidators",
      requestType = com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest, com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> getDelegatorValidatorsMethod;
    if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorValidatorsMethod = QueryGrpc.getDelegatorValidatorsMethod) == null) {
          QueryGrpc.getDelegatorValidatorsMethod = getDelegatorValidatorsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest, com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorValidators"))
              .build();
        }
      }
    }
    return getDelegatorValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorValidator",
      requestType = com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest, com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> getDelegatorValidatorMethod;
    if ((getDelegatorValidatorMethod = QueryGrpc.getDelegatorValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorValidatorMethod = QueryGrpc.getDelegatorValidatorMethod) == null) {
          QueryGrpc.getDelegatorValidatorMethod = getDelegatorValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest, com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorValidator"))
              .build();
        }
      }
    }
    return getDelegatorValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
      com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalInfo",
      requestType = com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
      com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest, com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> getHistoricalInfoMethod;
    if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
          QueryGrpc.getHistoricalInfoMethod = getHistoricalInfoMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest, com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalInfo"))
              .build();
        }
      }
    }
    return getHistoricalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryPoolRequest,
      com.cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.cosmos.staking.v1beta1.QueryPoolRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryPoolRequest,
      com.cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryPoolRequest, com.cosmos.staking.v1beta1.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryPoolRequest, com.cosmos.staking.v1beta1.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryParamsRequest,
      com.cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.cosmos.staking.v1beta1.QueryParamsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryParamsRequest,
      com.cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryParamsRequest, com.cosmos.staking.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryParamsRequest, com.cosmos.staking.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
     * Validators queries all validators that match the given status.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void validators(com.cosmos.staking.v1beta1.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    default void validator(com.cosmos.staking.v1beta1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void validatorDelegations(com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void validatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorUnbondingDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    default void delegation(com.cosmos.staking.v1beta1.QueryDelegationRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    default void unbondingDelegation(com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void delegatorDelegations(com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void delegatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorUnbondingDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void redelegations(com.cosmos.staking.v1beta1.QueryRedelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryRedelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void delegatorValidators(com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    default void delegatorValidator(com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    default void historicalInfo(com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    default void pool(com.cosmos.staking.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    default void params(com.cosmos.staking.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
     * Validators queries all validators that match the given status.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void validators(com.cosmos.staking.v1beta1.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public void validator(com.cosmos.staking.v1beta1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void validatorDelegations(com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void validatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public void delegation(com.cosmos.staking.v1beta1.QueryDelegationRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public void unbondingDelegation(com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void delegatorDelegations(com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void delegatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorUnbondingDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void redelegations(com.cosmos.staking.v1beta1.QueryRedelegationsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryRedelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void delegatorValidators(com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public void delegatorValidator(com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public void historicalInfo(com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public void pool(com.cosmos.staking.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public void params(com.cosmos.staking.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
     * Validators queries all validators that match the given status.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryValidatorsResponse validators(com.cosmos.staking.v1beta1.QueryValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryValidatorResponse validator(com.cosmos.staking.v1beta1.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse validatorDelegations(com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse validatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorUnbondingDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryDelegationResponse delegation(com.cosmos.staking.v1beta1.QueryDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse unbondingDelegation(com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse delegatorDelegations(com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse delegatorUnbondingDelegations(com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorUnbondingDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryRedelegationsResponse redelegations(com.cosmos.staking.v1beta1.QueryRedelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse delegatorValidators(com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse delegatorValidator(com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse historicalInfo(com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryPoolResponse pool(com.cosmos.staking.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryParamsResponse params(com.cosmos.staking.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
     * Validators queries all validators that match the given status.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryValidatorsResponse> validators(
        com.cosmos.staking.v1beta1.QueryValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryValidatorResponse> validator(
        com.cosmos.staking.v1beta1.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorDelegations queries delegate info for given validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse> validatorDelegations(
        com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse> validatorUnbondingDelegations(
        com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegation queries delegate info for given validator delegator pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryDelegationResponse> delegation(
        com.cosmos.staking.v1beta1.QueryDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondingDelegation queries unbonding info for given validator delegator
     * pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse> unbondingDelegation(
        com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorDelegations queries all delegations of a given delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse> delegatorDelegations(
        com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorUnbondingDelegations queries all unbonding delegations of a given
     * delegator address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse> delegatorUnbondingDelegations(
        com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorUnbondingDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Redelegations queries redelegations of given address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryRedelegationsResponse> redelegations(
        com.cosmos.staking.v1beta1.QueryRedelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorValidators queries all validators info for given delegator
     * address.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse> delegatorValidators(
        com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorValidator queries validator info for given delegator validator
     * pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse> delegatorValidator(
        com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse> historicalInfo(
        com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool queries the pool info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryPoolResponse> pool(
        com.cosmos.staking.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parameters queries the staking parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryParamsResponse> params(
        com.cosmos.staking.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATORS = 0;
  private static final int METHODID_VALIDATOR = 1;
  private static final int METHODID_VALIDATOR_DELEGATIONS = 2;
  private static final int METHODID_VALIDATOR_UNBONDING_DELEGATIONS = 3;
  private static final int METHODID_DELEGATION = 4;
  private static final int METHODID_UNBONDING_DELEGATION = 5;
  private static final int METHODID_DELEGATOR_DELEGATIONS = 6;
  private static final int METHODID_DELEGATOR_UNBONDING_DELEGATIONS = 7;
  private static final int METHODID_REDELEGATIONS = 8;
  private static final int METHODID_DELEGATOR_VALIDATORS = 9;
  private static final int METHODID_DELEGATOR_VALIDATOR = 10;
  private static final int METHODID_HISTORICAL_INFO = 11;
  private static final int METHODID_POOL = 12;
  private static final int METHODID_PARAMS = 13;

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
        case METHODID_VALIDATORS:
          serviceImpl.validators((com.cosmos.staking.v1beta1.QueryValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR:
          serviceImpl.validator((com.cosmos.staking.v1beta1.QueryValidatorRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_DELEGATIONS:
          serviceImpl.validatorDelegations((com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_UNBONDING_DELEGATIONS:
          serviceImpl.validatorUnbondingDelegations((com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATION:
          serviceImpl.delegation((com.cosmos.staking.v1beta1.QueryDelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegationResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_DELEGATION:
          serviceImpl.unbondingDelegation((com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_DELEGATIONS:
          serviceImpl.delegatorDelegations((com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_UNBONDING_DELEGATIONS:
          serviceImpl.delegatorUnbondingDelegations((com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>) responseObserver);
          break;
        case METHODID_REDELEGATIONS:
          serviceImpl.redelegations((com.cosmos.staking.v1beta1.QueryRedelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryRedelegationsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_VALIDATORS:
          serviceImpl.delegatorValidators((com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_VALIDATOR:
          serviceImpl.delegatorValidator((com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_INFO:
          serviceImpl.historicalInfo((com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.cosmos.staking.v1beta1.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.cosmos.staking.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryParamsResponse>) responseObserver);
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
          getValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryValidatorsRequest,
              com.cosmos.staking.v1beta1.QueryValidatorsResponse>(
                service, METHODID_VALIDATORS)))
        .addMethod(
          getValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryValidatorRequest,
              com.cosmos.staking.v1beta1.QueryValidatorResponse>(
                service, METHODID_VALIDATOR)))
        .addMethod(
          getValidatorDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryValidatorDelegationsRequest,
              com.cosmos.staking.v1beta1.QueryValidatorDelegationsResponse>(
                service, METHODID_VALIDATOR_DELEGATIONS)))
        .addMethod(
          getValidatorUnbondingDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest,
              com.cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse>(
                service, METHODID_VALIDATOR_UNBONDING_DELEGATIONS)))
        .addMethod(
          getDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryDelegationRequest,
              com.cosmos.staking.v1beta1.QueryDelegationResponse>(
                service, METHODID_DELEGATION)))
        .addMethod(
          getUnbondingDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryUnbondingDelegationRequest,
              com.cosmos.staking.v1beta1.QueryUnbondingDelegationResponse>(
                service, METHODID_UNBONDING_DELEGATION)))
        .addMethod(
          getDelegatorDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest,
              com.cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse>(
                service, METHODID_DELEGATOR_DELEGATIONS)))
        .addMethod(
          getDelegatorUnbondingDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest,
              com.cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse>(
                service, METHODID_DELEGATOR_UNBONDING_DELEGATIONS)))
        .addMethod(
          getRedelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryRedelegationsRequest,
              com.cosmos.staking.v1beta1.QueryRedelegationsResponse>(
                service, METHODID_REDELEGATIONS)))
        .addMethod(
          getDelegatorValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest,
              com.cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse>(
                service, METHODID_DELEGATOR_VALIDATORS)))
        .addMethod(
          getDelegatorValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryDelegatorValidatorRequest,
              com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse>(
                service, METHODID_DELEGATOR_VALIDATOR)))
        .addMethod(
          getHistoricalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryHistoricalInfoRequest,
              com.cosmos.staking.v1beta1.QueryHistoricalInfoResponse>(
                service, METHODID_HISTORICAL_INFO)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryPoolRequest,
              com.cosmos.staking.v1beta1.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryParamsRequest,
              com.cosmos.staking.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.staking.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getValidatorsMethod())
              .addMethod(getValidatorMethod())
              .addMethod(getValidatorDelegationsMethod())
              .addMethod(getValidatorUnbondingDelegationsMethod())
              .addMethod(getDelegationMethod())
              .addMethod(getUnbondingDelegationMethod())
              .addMethod(getDelegatorDelegationsMethod())
              .addMethod(getDelegatorUnbondingDelegationsMethod())
              .addMethod(getRedelegationsMethod())
              .addMethod(getDelegatorValidatorsMethod())
              .addMethod(getDelegatorValidatorMethod())
              .addMethod(getHistoricalInfoMethod())
              .addMethod(getPoolMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
