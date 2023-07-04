package com.confio.twasm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: confio/twasm/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "confio.twasm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest,
      com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> getPrivilegedContractsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrivilegedContracts",
      requestType = com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest.class,
      responseType = com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest,
      com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> getPrivilegedContractsMethod() {
    io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest, com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> getPrivilegedContractsMethod;
    if ((getPrivilegedContractsMethod = QueryGrpc.getPrivilegedContractsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPrivilegedContractsMethod = QueryGrpc.getPrivilegedContractsMethod) == null) {
          QueryGrpc.getPrivilegedContractsMethod = getPrivilegedContractsMethod =
              io.grpc.MethodDescriptor.<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest, com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrivilegedContracts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PrivilegedContracts"))
              .build();
        }
      }
    }
    return getPrivilegedContractsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest,
      com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> getContractsByPrivilegeTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByPrivilegeType",
      requestType = com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest.class,
      responseType = com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest,
      com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> getContractsByPrivilegeTypeMethod() {
    io.grpc.MethodDescriptor<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest, com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> getContractsByPrivilegeTypeMethod;
    if ((getContractsByPrivilegeTypeMethod = QueryGrpc.getContractsByPrivilegeTypeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByPrivilegeTypeMethod = QueryGrpc.getContractsByPrivilegeTypeMethod) == null) {
          QueryGrpc.getContractsByPrivilegeTypeMethod = getContractsByPrivilegeTypeMethod =
              io.grpc.MethodDescriptor.<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest, com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractsByPrivilegeType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByPrivilegeType"))
              .build();
        }
      }
    }
    return getContractsByPrivilegeTypeMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * PrivilegedContracts returns all privileged contracts
     * </pre>
     */
    default void privilegedContracts(com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest request,
        io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrivilegedContractsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractsByPrivilegeType returns all contracts that have registered for the
     * privilege type
     * </pre>
     */
    default void contractsByPrivilegeType(com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest request,
        io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractsByPrivilegeTypeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * PrivilegedContracts returns all privileged contracts
     * </pre>
     */
    public void privilegedContracts(com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest request,
        io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrivilegedContractsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractsByPrivilegeType returns all contracts that have registered for the
     * privilege type
     * </pre>
     */
    public void contractsByPrivilegeType(com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest request,
        io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractsByPrivilegeTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * PrivilegedContracts returns all privileged contracts
     * </pre>
     */
    public com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse privilegedContracts(com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrivilegedContractsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractsByPrivilegeType returns all contracts that have registered for the
     * privilege type
     * </pre>
     */
    public com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse contractsByPrivilegeType(com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractsByPrivilegeTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * PrivilegedContracts returns all privileged contracts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse> privilegedContracts(
        com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrivilegedContractsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractsByPrivilegeType returns all contracts that have registered for the
     * privilege type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse> contractsByPrivilegeType(
        com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractsByPrivilegeTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRIVILEGED_CONTRACTS = 0;
  private static final int METHODID_CONTRACTS_BY_PRIVILEGE_TYPE = 1;

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
        case METHODID_PRIVILEGED_CONTRACTS:
          serviceImpl.privilegedContracts((com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_PRIVILEGE_TYPE:
          serviceImpl.contractsByPrivilegeType((com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse>) responseObserver);
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
          getPrivilegedContractsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsRequest,
              com.confio.twasm.v1beta1.QueryProto.QueryPrivilegedContractsResponse>(
                service, METHODID_PRIVILEGED_CONTRACTS)))
        .addMethod(
          getContractsByPrivilegeTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeRequest,
              com.confio.twasm.v1beta1.QueryProto.QueryContractsByPrivilegeTypeResponse>(
                service, METHODID_CONTRACTS_BY_PRIVILEGE_TYPE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.confio.twasm.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getPrivilegedContractsMethod())
              .addMethod(getContractsByPrivilegeTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}