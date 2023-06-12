package com.axelar.axelarnet.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the axelarnet Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/axelarnet/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.axelarnet.v1beta1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.LinkRequest,
      com.axelar.axelarnet.v1beta1.LinkResponse> getLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Link",
      requestType = com.axelar.axelarnet.v1beta1.LinkRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.LinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.LinkRequest,
      com.axelar.axelarnet.v1beta1.LinkResponse> getLinkMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.LinkRequest, com.axelar.axelarnet.v1beta1.LinkResponse> getLinkMethod;
    if ((getLinkMethod = MsgServiceGrpc.getLinkMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getLinkMethod = MsgServiceGrpc.getLinkMethod) == null) {
          MsgServiceGrpc.getLinkMethod = getLinkMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.LinkRequest, com.axelar.axelarnet.v1beta1.LinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Link"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.LinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.LinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("Link"))
              .build();
        }
      }
    }
    return getLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ConfirmDepositRequest,
      com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> getConfirmDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmDeposit",
      requestType = com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.ConfirmDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ConfirmDepositRequest,
      com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> getConfirmDepositMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ConfirmDepositRequest, com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> getConfirmDepositMethod;
    if ((getConfirmDepositMethod = MsgServiceGrpc.getConfirmDepositMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmDepositMethod = MsgServiceGrpc.getConfirmDepositMethod) == null) {
          MsgServiceGrpc.getConfirmDepositMethod = getConfirmDepositMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.ConfirmDepositRequest, com.axelar.axelarnet.v1beta1.ConfirmDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.ConfirmDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmDeposit"))
              .build();
        }
      }
    }
    return getConfirmDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest,
      com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> getExecutePendingTransfersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecutePendingTransfers",
      requestType = com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest,
      com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> getExecutePendingTransfersMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest, com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> getExecutePendingTransfersMethod;
    if ((getExecutePendingTransfersMethod = MsgServiceGrpc.getExecutePendingTransfersMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getExecutePendingTransfersMethod = MsgServiceGrpc.getExecutePendingTransfersMethod) == null) {
          MsgServiceGrpc.getExecutePendingTransfersMethod = getExecutePendingTransfersMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest, com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecutePendingTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ExecutePendingTransfers"))
              .build();
        }
      }
    }
    return getExecutePendingTransfersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest,
      com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> getAddCosmosBasedChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCosmosBasedChain",
      requestType = com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest,
      com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> getAddCosmosBasedChainMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest, com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> getAddCosmosBasedChainMethod;
    if ((getAddCosmosBasedChainMethod = MsgServiceGrpc.getAddCosmosBasedChainMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getAddCosmosBasedChainMethod = MsgServiceGrpc.getAddCosmosBasedChainMethod) == null) {
          MsgServiceGrpc.getAddCosmosBasedChainMethod = getAddCosmosBasedChainMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest, com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCosmosBasedChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("AddCosmosBasedChain"))
              .build();
        }
      }
    }
    return getAddCosmosBasedChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterAssetRequest,
      com.axelar.axelarnet.v1beta1.RegisterAssetResponse> getRegisterAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAsset",
      requestType = com.axelar.axelarnet.v1beta1.RegisterAssetRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.RegisterAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterAssetRequest,
      com.axelar.axelarnet.v1beta1.RegisterAssetResponse> getRegisterAssetMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterAssetRequest, com.axelar.axelarnet.v1beta1.RegisterAssetResponse> getRegisterAssetMethod;
    if ((getRegisterAssetMethod = MsgServiceGrpc.getRegisterAssetMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRegisterAssetMethod = MsgServiceGrpc.getRegisterAssetMethod) == null) {
          MsgServiceGrpc.getRegisterAssetMethod = getRegisterAssetMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.RegisterAssetRequest, com.axelar.axelarnet.v1beta1.RegisterAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RegisterAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RegisterAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RegisterAsset"))
              .build();
        }
      }
    }
    return getRegisterAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest,
      com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> getRouteIBCTransfersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteIBCTransfers",
      requestType = com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest,
      com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> getRouteIBCTransfersMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest, com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> getRouteIBCTransfersMethod;
    if ((getRouteIBCTransfersMethod = MsgServiceGrpc.getRouteIBCTransfersMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRouteIBCTransfersMethod = MsgServiceGrpc.getRouteIBCTransfersMethod) == null) {
          MsgServiceGrpc.getRouteIBCTransfersMethod = getRouteIBCTransfersMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest, com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteIBCTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RouteIBCTransfers"))
              .build();
        }
      }
    }
    return getRouteIBCTransfersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest,
      com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> getRegisterFeeCollectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterFeeCollector",
      requestType = com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest,
      com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> getRegisterFeeCollectorMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest, com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> getRegisterFeeCollectorMethod;
    if ((getRegisterFeeCollectorMethod = MsgServiceGrpc.getRegisterFeeCollectorMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRegisterFeeCollectorMethod = MsgServiceGrpc.getRegisterFeeCollectorMethod) == null) {
          MsgServiceGrpc.getRegisterFeeCollectorMethod = getRegisterFeeCollectorMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest, com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterFeeCollector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RegisterFeeCollector"))
              .build();
        }
      }
    }
    return getRegisterFeeCollectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest,
      com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> getRetryIBCTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryIBCTransfer",
      requestType = com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest,
      com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> getRetryIBCTransferMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest, com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> getRetryIBCTransferMethod;
    if ((getRetryIBCTransferMethod = MsgServiceGrpc.getRetryIBCTransferMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRetryIBCTransferMethod = MsgServiceGrpc.getRetryIBCTransferMethod) == null) {
          MsgServiceGrpc.getRetryIBCTransferMethod = getRetryIBCTransferMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest, com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetryIBCTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RetryIBCTransfer"))
              .build();
        }
      }
    }
    return getRetryIBCTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteMessageRequest,
      com.axelar.axelarnet.v1beta1.RouteMessageResponse> getRouteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteMessage",
      requestType = com.axelar.axelarnet.v1beta1.RouteMessageRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.RouteMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteMessageRequest,
      com.axelar.axelarnet.v1beta1.RouteMessageResponse> getRouteMessageMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.RouteMessageRequest, com.axelar.axelarnet.v1beta1.RouteMessageResponse> getRouteMessageMethod;
    if ((getRouteMessageMethod = MsgServiceGrpc.getRouteMessageMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRouteMessageMethod = MsgServiceGrpc.getRouteMessageMethod) == null) {
          MsgServiceGrpc.getRouteMessageMethod = getRouteMessageMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.RouteMessageRequest, com.axelar.axelarnet.v1beta1.RouteMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RouteMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.RouteMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RouteMessage"))
              .build();
        }
      }
    }
    return getRouteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.CallContractRequest,
      com.axelar.axelarnet.v1beta1.CallContractResponse> getCallContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallContract",
      requestType = com.axelar.axelarnet.v1beta1.CallContractRequest.class,
      responseType = com.axelar.axelarnet.v1beta1.CallContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.CallContractRequest,
      com.axelar.axelarnet.v1beta1.CallContractResponse> getCallContractMethod() {
    io.grpc.MethodDescriptor<com.axelar.axelarnet.v1beta1.CallContractRequest, com.axelar.axelarnet.v1beta1.CallContractResponse> getCallContractMethod;
    if ((getCallContractMethod = MsgServiceGrpc.getCallContractMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getCallContractMethod = MsgServiceGrpc.getCallContractMethod) == null) {
          MsgServiceGrpc.getCallContractMethod = getCallContractMethod =
              io.grpc.MethodDescriptor.<com.axelar.axelarnet.v1beta1.CallContractRequest, com.axelar.axelarnet.v1beta1.CallContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.CallContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.axelarnet.v1beta1.CallContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("CallContract"))
              .build();
        }
      }
    }
    return getCallContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the axelarnet Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void link(com.axelar.axelarnet.v1beta1.LinkRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.LinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkMethod(), responseObserver);
    }

    /**
     */
    default void confirmDeposit(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmDepositMethod(), responseObserver);
    }

    /**
     */
    default void executePendingTransfers(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecutePendingTransfersMethod(), responseObserver);
    }

    /**
     */
    default void addCosmosBasedChain(com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCosmosBasedChainMethod(), responseObserver);
    }

    /**
     */
    default void registerAsset(com.axelar.axelarnet.v1beta1.RegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAssetMethod(), responseObserver);
    }

    /**
     */
    default void routeIBCTransfers(com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteIBCTransfersMethod(), responseObserver);
    }

    /**
     */
    default void registerFeeCollector(com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterFeeCollectorMethod(), responseObserver);
    }

    /**
     */
    default void retryIBCTransfer(com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetryIBCTransferMethod(), responseObserver);
    }

    /**
     */
    default void routeMessage(com.axelar.axelarnet.v1beta1.RouteMessageRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteMessageMethod(), responseObserver);
    }

    /**
     */
    default void callContract(com.axelar.axelarnet.v1beta1.CallContractRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.CallContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallContractMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   * <pre>
   * Msg defines the axelarnet Msg service.
   * </pre>
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the axelarnet Msg service.
   * </pre>
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void link(com.axelar.axelarnet.v1beta1.LinkRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.LinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmDeposit(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executePendingTransfers(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecutePendingTransfersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCosmosBasedChain(com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCosmosBasedChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerAsset(com.axelar.axelarnet.v1beta1.RegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void routeIBCTransfers(com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteIBCTransfersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerFeeCollector(com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterFeeCollectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retryIBCTransfer(com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetryIBCTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void routeMessage(com.axelar.axelarnet.v1beta1.RouteMessageRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callContract(com.axelar.axelarnet.v1beta1.CallContractRequest request,
        io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.CallContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the axelarnet Msg service.
   * </pre>
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.LinkResponse link(com.axelar.axelarnet.v1beta1.LinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.ConfirmDepositResponse confirmDeposit(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse executePendingTransfers(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecutePendingTransfersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse addCosmosBasedChain(com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCosmosBasedChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.RegisterAssetResponse registerAsset(com.axelar.axelarnet.v1beta1.RegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse routeIBCTransfers(com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteIBCTransfersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse registerFeeCollector(com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterFeeCollectorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse retryIBCTransfer(com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryIBCTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.RouteMessageResponse routeMessage(com.axelar.axelarnet.v1beta1.RouteMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.axelarnet.v1beta1.CallContractResponse callContract(com.axelar.axelarnet.v1beta1.CallContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallContractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   * <pre>
   * Msg defines the axelarnet Msg service.
   * </pre>
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.LinkResponse> link(
        com.axelar.axelarnet.v1beta1.LinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.ConfirmDepositResponse> confirmDeposit(
        com.axelar.axelarnet.v1beta1.ConfirmDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse> executePendingTransfers(
        com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecutePendingTransfersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse> addCosmosBasedChain(
        com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCosmosBasedChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.RegisterAssetResponse> registerAsset(
        com.axelar.axelarnet.v1beta1.RegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse> routeIBCTransfers(
        com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteIBCTransfersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse> registerFeeCollector(
        com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterFeeCollectorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse> retryIBCTransfer(
        com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetryIBCTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.RouteMessageResponse> routeMessage(
        com.axelar.axelarnet.v1beta1.RouteMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.axelarnet.v1beta1.CallContractResponse> callContract(
        com.axelar.axelarnet.v1beta1.CallContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LINK = 0;
  private static final int METHODID_CONFIRM_DEPOSIT = 1;
  private static final int METHODID_EXECUTE_PENDING_TRANSFERS = 2;
  private static final int METHODID_ADD_COSMOS_BASED_CHAIN = 3;
  private static final int METHODID_REGISTER_ASSET = 4;
  private static final int METHODID_ROUTE_IBCTRANSFERS = 5;
  private static final int METHODID_REGISTER_FEE_COLLECTOR = 6;
  private static final int METHODID_RETRY_IBCTRANSFER = 7;
  private static final int METHODID_ROUTE_MESSAGE = 8;
  private static final int METHODID_CALL_CONTRACT = 9;

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
        case METHODID_LINK:
          serviceImpl.link((com.axelar.axelarnet.v1beta1.LinkRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.LinkResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_DEPOSIT:
          serviceImpl.confirmDeposit((com.axelar.axelarnet.v1beta1.ConfirmDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ConfirmDepositResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_PENDING_TRANSFERS:
          serviceImpl.executePendingTransfers((com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse>) responseObserver);
          break;
        case METHODID_ADD_COSMOS_BASED_CHAIN:
          serviceImpl.addCosmosBasedChain((com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ASSET:
          serviceImpl.registerAsset((com.axelar.axelarnet.v1beta1.RegisterAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterAssetResponse>) responseObserver);
          break;
        case METHODID_ROUTE_IBCTRANSFERS:
          serviceImpl.routeIBCTransfers((com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse>) responseObserver);
          break;
        case METHODID_REGISTER_FEE_COLLECTOR:
          serviceImpl.registerFeeCollector((com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse>) responseObserver);
          break;
        case METHODID_RETRY_IBCTRANSFER:
          serviceImpl.retryIBCTransfer((com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse>) responseObserver);
          break;
        case METHODID_ROUTE_MESSAGE:
          serviceImpl.routeMessage((com.axelar.axelarnet.v1beta1.RouteMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.RouteMessageResponse>) responseObserver);
          break;
        case METHODID_CALL_CONTRACT:
          serviceImpl.callContract((com.axelar.axelarnet.v1beta1.CallContractRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.axelarnet.v1beta1.CallContractResponse>) responseObserver);
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
          getLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.LinkRequest,
              com.axelar.axelarnet.v1beta1.LinkResponse>(
                service, METHODID_LINK)))
        .addMethod(
          getConfirmDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.ConfirmDepositRequest,
              com.axelar.axelarnet.v1beta1.ConfirmDepositResponse>(
                service, METHODID_CONFIRM_DEPOSIT)))
        .addMethod(
          getExecutePendingTransfersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest,
              com.axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse>(
                service, METHODID_EXECUTE_PENDING_TRANSFERS)))
        .addMethod(
          getAddCosmosBasedChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest,
              com.axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse>(
                service, METHODID_ADD_COSMOS_BASED_CHAIN)))
        .addMethod(
          getRegisterAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.RegisterAssetRequest,
              com.axelar.axelarnet.v1beta1.RegisterAssetResponse>(
                service, METHODID_REGISTER_ASSET)))
        .addMethod(
          getRouteIBCTransfersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.RouteIBCTransfersRequest,
              com.axelar.axelarnet.v1beta1.RouteIBCTransfersResponse>(
                service, METHODID_ROUTE_IBCTRANSFERS)))
        .addMethod(
          getRegisterFeeCollectorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest,
              com.axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse>(
                service, METHODID_REGISTER_FEE_COLLECTOR)))
        .addMethod(
          getRetryIBCTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.RetryIBCTransferRequest,
              com.axelar.axelarnet.v1beta1.RetryIBCTransferResponse>(
                service, METHODID_RETRY_IBCTRANSFER)))
        .addMethod(
          getRouteMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.RouteMessageRequest,
              com.axelar.axelarnet.v1beta1.RouteMessageResponse>(
                service, METHODID_ROUTE_MESSAGE)))
        .addMethod(
          getCallContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.axelarnet.v1beta1.CallContractRequest,
              com.axelar.axelarnet.v1beta1.CallContractResponse>(
                service, METHODID_CALL_CONTRACT)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.axelarnet.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getLinkMethod())
              .addMethod(getConfirmDepositMethod())
              .addMethod(getExecutePendingTransfersMethod())
              .addMethod(getAddCosmosBasedChainMethod())
              .addMethod(getRegisterAssetMethod())
              .addMethod(getRouteIBCTransfersMethod())
              .addMethod(getRegisterFeeCollectorMethod())
              .addMethod(getRetryIBCTransferMethod())
              .addMethod(getRouteMessageMethod())
              .addMethod(getCallContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
