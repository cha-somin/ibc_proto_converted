package com.osmosis.gamm.poolmodels.balancer.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/gamm/pool-models/balancer/tx/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.gamm.poolmodels.balancer.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool,
      com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> getCreateBalancerPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBalancerPool",
      requestType = com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool.class,
      responseType = com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool,
      com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> getCreateBalancerPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool, com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> getCreateBalancerPoolMethod;
    if ((getCreateBalancerPoolMethod = MsgGrpc.getCreateBalancerPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBalancerPoolMethod = MsgGrpc.getCreateBalancerPoolMethod) == null) {
          MsgGrpc.getCreateBalancerPoolMethod = getCreateBalancerPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool, com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBalancerPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBalancerPool"))
              .build();
        }
      }
    }
    return getCreateBalancerPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition,
      com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> getMigrateSharesToFullRangeConcentratedPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateSharesToFullRangeConcentratedPosition",
      requestType = com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition.class,
      responseType = com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition,
      com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> getMigrateSharesToFullRangeConcentratedPositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition, com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> getMigrateSharesToFullRangeConcentratedPositionMethod;
    if ((getMigrateSharesToFullRangeConcentratedPositionMethod = MsgGrpc.getMigrateSharesToFullRangeConcentratedPositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateSharesToFullRangeConcentratedPositionMethod = MsgGrpc.getMigrateSharesToFullRangeConcentratedPositionMethod) == null) {
          MsgGrpc.getMigrateSharesToFullRangeConcentratedPositionMethod = getMigrateSharesToFullRangeConcentratedPositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition, com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateSharesToFullRangeConcentratedPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateSharesToFullRangeConcentratedPosition"))
              .build();
        }
      }
    }
    return getMigrateSharesToFullRangeConcentratedPositionMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void createBalancerPool(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBalancerPoolMethod(), responseObserver);
    }

    /**
     */
    default void migrateSharesToFullRangeConcentratedPosition(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateSharesToFullRangeConcentratedPositionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
     */
    public void createBalancerPool(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBalancerPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateSharesToFullRangeConcentratedPosition(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
     */
    public com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse createBalancerPool(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBalancerPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse migrateSharesToFullRangeConcentratedPosition(com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse> createBalancerPool(
        com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBalancerPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse> migrateSharesToFullRangeConcentratedPosition(
        com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BALANCER_POOL = 0;
  private static final int METHODID_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION = 1;

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
        case METHODID_CREATE_BALANCER_POOL:
          serviceImpl.createBalancerPool((com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION:
          serviceImpl.migrateSharesToFullRangeConcentratedPosition((com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse>) responseObserver);
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
          getCreateBalancerPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool,
              com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse>(
                service, METHODID_CREATE_BALANCER_POOL)))
        .addMethod(
          getMigrateSharesToFullRangeConcentratedPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition,
              com.osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse>(
                service, METHODID_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.gamm.poolmodels.balancer.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateBalancerPoolMethod())
              .addMethod(getMigrateSharesToFullRangeConcentratedPositionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
