package com.cosmos.feegrant.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the feegrant msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/feegrant/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.feegrant.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance,
      com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> getGrantAllowanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantAllowance",
      requestType = com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance.class,
      responseType = com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance,
      com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> getGrantAllowanceMethod() {
    io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance, com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> getGrantAllowanceMethod;
    if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
          MsgGrpc.getGrantAllowanceMethod = getGrantAllowanceMethod =
              io.grpc.MethodDescriptor.<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance, com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantAllowance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GrantAllowance"))
              .build();
        }
      }
    }
    return getGrantAllowanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance,
      com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAllowance",
      requestType = com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance.class,
      responseType = com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance,
      com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod() {
    io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance, com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod;
    if ((getRevokeAllowanceMethod = MsgGrpc.getRevokeAllowanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeAllowanceMethod = MsgGrpc.getRevokeAllowanceMethod) == null) {
          MsgGrpc.getRevokeAllowanceMethod = getRevokeAllowanceMethod =
              io.grpc.MethodDescriptor.<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance, com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeAllowance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeAllowance"))
              .build();
        }
      }
    }
    return getRevokeAllowanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances,
      com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> getPruneAllowancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PruneAllowances",
      requestType = com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances.class,
      responseType = com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances,
      com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> getPruneAllowancesMethod() {
    io.grpc.MethodDescriptor<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances, com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> getPruneAllowancesMethod;
    if ((getPruneAllowancesMethod = MsgGrpc.getPruneAllowancesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPruneAllowancesMethod = MsgGrpc.getPruneAllowancesMethod) == null) {
          MsgGrpc.getPruneAllowancesMethod = getPruneAllowancesMethod =
              io.grpc.MethodDescriptor.<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances, com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PruneAllowances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PruneAllowances"))
              .build();
        }
      }
    }
    return getPruneAllowancesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the feegrant msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    default void grantAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantAllowanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeAllowance revokes any fee allowance of granter's account that
     * has been granted to the grantee.
     * </pre>
     */
    default void revokeAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeAllowanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * PruneAllowances prunes expired fee allowances, currently up to 75 at a time.
     * Since cosmos-sdk 0.50
     * </pre>
     */
    default void pruneAllowances(com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPruneAllowancesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the feegrant msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the feegrant msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public void grantAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeAllowance revokes any fee allowance of granter's account that
     * has been granted to the grantee.
     * </pre>
     */
    public void revokeAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeAllowanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PruneAllowances prunes expired fee allowances, currently up to 75 at a time.
     * Since cosmos-sdk 0.50
     * </pre>
     */
    public void pruneAllowances(com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances request,
        io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPruneAllowancesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the feegrant msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse grantAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantAllowanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeAllowance revokes any fee allowance of granter's account that
     * has been granted to the grantee.
     * </pre>
     */
    public com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse revokeAllowance(com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeAllowanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PruneAllowances prunes expired fee allowances, currently up to 75 at a time.
     * Since cosmos-sdk 0.50
     * </pre>
     */
    public com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse pruneAllowances(com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPruneAllowancesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the feegrant msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse> grantAllowance(
        com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeAllowance revokes any fee allowance of granter's account that
     * has been granted to the grantee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse> revokeAllowance(
        com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeAllowanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PruneAllowances prunes expired fee allowances, currently up to 75 at a time.
     * Since cosmos-sdk 0.50
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse> pruneAllowances(
        com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPruneAllowancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRANT_ALLOWANCE = 0;
  private static final int METHODID_REVOKE_ALLOWANCE = 1;
  private static final int METHODID_PRUNE_ALLOWANCES = 2;

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
        case METHODID_GRANT_ALLOWANCE:
          serviceImpl.grantAllowance((com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance) request,
              (io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ALLOWANCE:
          serviceImpl.revokeAllowance((com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance) request,
              (io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse>) responseObserver);
          break;
        case METHODID_PRUNE_ALLOWANCES:
          serviceImpl.pruneAllowances((com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances) request,
              (io.grpc.stub.StreamObserver<com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse>) responseObserver);
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
          getGrantAllowanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowance,
              com.cosmos.feegrant.v1beta1.TxProto.MsgGrantAllowanceResponse>(
                service, METHODID_GRANT_ALLOWANCE)))
        .addMethod(
          getRevokeAllowanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowance,
              com.cosmos.feegrant.v1beta1.TxProto.MsgRevokeAllowanceResponse>(
                service, METHODID_REVOKE_ALLOWANCE)))
        .addMethod(
          getPruneAllowancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowances,
              com.cosmos.feegrant.v1beta1.TxProto.MsgPruneAllowancesResponse>(
                service, METHODID_PRUNE_ALLOWANCES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.feegrant.v1beta1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getGrantAllowanceMethod())
              .addMethod(getRevokeAllowanceMethod())
              .addMethod(getPruneAllowancesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
