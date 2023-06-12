package com.starnamed.x.starname.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: iov/starname/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "starnamed.x.starname.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainRequest,
      com.starnamed.x.starname.v1beta1.QueryDomainResponse> getDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Domain",
      requestType = com.starnamed.x.starname.v1beta1.QueryDomainRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainRequest,
      com.starnamed.x.starname.v1beta1.QueryDomainResponse> getDomainMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainRequest, com.starnamed.x.starname.v1beta1.QueryDomainResponse> getDomainMethod;
    if ((getDomainMethod = QueryGrpc.getDomainMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDomainMethod = QueryGrpc.getDomainMethod) == null) {
          QueryGrpc.getDomainMethod = getDomainMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryDomainRequest, com.starnamed.x.starname.v1beta1.QueryDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Domain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Domain"))
              .build();
        }
      }
    }
    return getDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> getDomainAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DomainAccounts",
      requestType = com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> getDomainAccountsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest, com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> getDomainAccountsMethod;
    if ((getDomainAccountsMethod = QueryGrpc.getDomainAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDomainAccountsMethod = QueryGrpc.getDomainAccountsMethod) == null) {
          QueryGrpc.getDomainAccountsMethod = getDomainAccountsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest, com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DomainAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DomainAccounts"))
              .build();
        }
      }
    }
    return getDomainAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryStarnameRequest,
      com.starnamed.x.starname.v1beta1.QueryStarnameResponse> getStarnameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Starname",
      requestType = com.starnamed.x.starname.v1beta1.QueryStarnameRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryStarnameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryStarnameRequest,
      com.starnamed.x.starname.v1beta1.QueryStarnameResponse> getStarnameMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryStarnameRequest, com.starnamed.x.starname.v1beta1.QueryStarnameResponse> getStarnameMethod;
    if ((getStarnameMethod = QueryGrpc.getStarnameMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStarnameMethod = QueryGrpc.getStarnameMethod) == null) {
          QueryGrpc.getStarnameMethod = getStarnameMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryStarnameRequest, com.starnamed.x.starname.v1beta1.QueryStarnameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Starname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryStarnameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryStarnameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Starname"))
              .build();
        }
      }
    }
    return getStarnameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> getOwnerAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OwnerAccounts",
      requestType = com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> getOwnerAccountsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest, com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> getOwnerAccountsMethod;
    if ((getOwnerAccountsMethod = QueryGrpc.getOwnerAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerAccountsMethod = QueryGrpc.getOwnerAccountsMethod) == null) {
          QueryGrpc.getOwnerAccountsMethod = getOwnerAccountsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest, com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OwnerAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OwnerAccounts"))
              .build();
        }
      }
    }
    return getOwnerAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest,
      com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> getOwnerDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OwnerDomains",
      requestType = com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest,
      com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> getOwnerDomainsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest, com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> getOwnerDomainsMethod;
    if ((getOwnerDomainsMethod = QueryGrpc.getOwnerDomainsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerDomainsMethod = QueryGrpc.getOwnerDomainsMethod) == null) {
          QueryGrpc.getOwnerDomainsMethod = getOwnerDomainsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest, com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OwnerDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OwnerDomains"))
              .build();
        }
      }
    }
    return getOwnerDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> getResourceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceAccounts",
      requestType = com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> getResourceAccountsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest, com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> getResourceAccountsMethod;
    if ((getResourceAccountsMethod = QueryGrpc.getResourceAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourceAccountsMethod = QueryGrpc.getResourceAccountsMethod) == null) {
          QueryGrpc.getResourceAccountsMethod = getResourceAccountsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest, com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ResourceAccounts"))
              .build();
        }
      }
    }
    return getResourceAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> getBrokerAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrokerAccounts",
      requestType = com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest,
      com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> getBrokerAccountsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest, com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> getBrokerAccountsMethod;
    if ((getBrokerAccountsMethod = QueryGrpc.getBrokerAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBrokerAccountsMethod = QueryGrpc.getBrokerAccountsMethod) == null) {
          QueryGrpc.getBrokerAccountsMethod = getBrokerAccountsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest, com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrokerAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BrokerAccounts"))
              .build();
        }
      }
    }
    return getBrokerAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest,
      com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> getBrokerDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrokerDomains",
      requestType = com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest,
      com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> getBrokerDomainsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest, com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> getBrokerDomainsMethod;
    if ((getBrokerDomainsMethod = QueryGrpc.getBrokerDomainsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBrokerDomainsMethod = QueryGrpc.getBrokerDomainsMethod) == null) {
          QueryGrpc.getBrokerDomainsMethod = getBrokerDomainsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest, com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrokerDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BrokerDomains"))
              .build();
        }
      }
    }
    return getBrokerDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryYieldRequest,
      com.starnamed.x.starname.v1beta1.QueryYieldResponse> getYieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Yield",
      requestType = com.starnamed.x.starname.v1beta1.QueryYieldRequest.class,
      responseType = com.starnamed.x.starname.v1beta1.QueryYieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryYieldRequest,
      com.starnamed.x.starname.v1beta1.QueryYieldResponse> getYieldMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.QueryYieldRequest, com.starnamed.x.starname.v1beta1.QueryYieldResponse> getYieldMethod;
    if ((getYieldMethod = QueryGrpc.getYieldMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getYieldMethod = QueryGrpc.getYieldMethod) == null) {
          QueryGrpc.getYieldMethod = getYieldMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.QueryYieldRequest, com.starnamed.x.starname.v1beta1.QueryYieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Yield"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryYieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.QueryYieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Yield"))
              .build();
        }
      }
    }
    return getYieldMethod;
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
     * Domain gets a starname's domain info.
     * </pre>
     */
    default void domain(com.starnamed.x.starname.v1beta1.QueryDomainRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * DomainAccounts gets accounts associated with a given domain.
     * </pre>
     */
    default void domainAccounts(com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDomainAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starname gets all the information associated with a starname.
     * </pre>
     */
    default void starname(com.starnamed.x.starname.v1beta1.QueryStarnameRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryStarnameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStarnameMethod(), responseObserver);
    }

    /**
     * <pre>
     * OwnerAccounts gets accounts associated with a given owner.
     * </pre>
     */
    default void ownerAccounts(com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OwnerDomains gets domains associated with a given owner.
     * </pre>
     */
    default void ownerDomains(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResourceAccounts gets accounts associated with a given resource.
     * </pre>
     */
    default void resourceAccounts(com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BrokerAccounts gets accounts associated with a given broker.
     * </pre>
     */
    default void brokerAccounts(com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrokerAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BrokerDomains gets domains associated with a given broker.
     * </pre>
     */
    default void brokerDomains(com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrokerDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Yield estimates and retrieves the annualized yield for delegators
     * </pre>
     */
    default void yield(com.starnamed.x.starname.v1beta1.QueryYieldRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryYieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getYieldMethod(), responseObserver);
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
     * Domain gets a starname's domain info.
     * </pre>
     */
    public void domain(com.starnamed.x.starname.v1beta1.QueryDomainRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DomainAccounts gets accounts associated with a given domain.
     * </pre>
     */
    public void domainAccounts(com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDomainAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starname gets all the information associated with a starname.
     * </pre>
     */
    public void starname(com.starnamed.x.starname.v1beta1.QueryStarnameRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryStarnameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStarnameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OwnerAccounts gets accounts associated with a given owner.
     * </pre>
     */
    public void ownerAccounts(com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OwnerDomains gets domains associated with a given owner.
     * </pre>
     */
    public void ownerDomains(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResourceAccounts gets accounts associated with a given resource.
     * </pre>
     */
    public void resourceAccounts(com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BrokerAccounts gets accounts associated with a given broker.
     * </pre>
     */
    public void brokerAccounts(com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrokerAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BrokerDomains gets domains associated with a given broker.
     * </pre>
     */
    public void brokerDomains(com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrokerDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Yield estimates and retrieves the annualized yield for delegators
     * </pre>
     */
    public void yield(com.starnamed.x.starname.v1beta1.QueryYieldRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryYieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getYieldMethod(), getCallOptions()), request, responseObserver);
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
     * Domain gets a starname's domain info.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryDomainResponse domain(com.starnamed.x.starname.v1beta1.QueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DomainAccounts gets accounts associated with a given domain.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse domainAccounts(com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDomainAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starname gets all the information associated with a starname.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryStarnameResponse starname(com.starnamed.x.starname.v1beta1.QueryStarnameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStarnameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OwnerAccounts gets accounts associated with a given owner.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse ownerAccounts(com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OwnerDomains gets domains associated with a given owner.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse ownerDomains(com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResourceAccounts gets accounts associated with a given resource.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse resourceAccounts(com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BrokerAccounts gets accounts associated with a given broker.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse brokerAccounts(com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrokerAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BrokerDomains gets domains associated with a given broker.
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse brokerDomains(com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrokerDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Yield estimates and retrieves the annualized yield for delegators
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.QueryYieldResponse yield(com.starnamed.x.starname.v1beta1.QueryYieldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getYieldMethod(), getCallOptions(), request);
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
     * Domain gets a starname's domain info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryDomainResponse> domain(
        com.starnamed.x.starname.v1beta1.QueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DomainAccounts gets accounts associated with a given domain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse> domainAccounts(
        com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDomainAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starname gets all the information associated with a starname.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryStarnameResponse> starname(
        com.starnamed.x.starname.v1beta1.QueryStarnameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStarnameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OwnerAccounts gets accounts associated with a given owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse> ownerAccounts(
        com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OwnerDomains gets domains associated with a given owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse> ownerDomains(
        com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResourceAccounts gets accounts associated with a given resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse> resourceAccounts(
        com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BrokerAccounts gets accounts associated with a given broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse> brokerAccounts(
        com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrokerAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BrokerDomains gets domains associated with a given broker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse> brokerDomains(
        com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrokerDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Yield estimates and retrieves the annualized yield for delegators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.QueryYieldResponse> yield(
        com.starnamed.x.starname.v1beta1.QueryYieldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getYieldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DOMAIN = 0;
  private static final int METHODID_DOMAIN_ACCOUNTS = 1;
  private static final int METHODID_STARNAME = 2;
  private static final int METHODID_OWNER_ACCOUNTS = 3;
  private static final int METHODID_OWNER_DOMAINS = 4;
  private static final int METHODID_RESOURCE_ACCOUNTS = 5;
  private static final int METHODID_BROKER_ACCOUNTS = 6;
  private static final int METHODID_BROKER_DOMAINS = 7;
  private static final int METHODID_YIELD = 8;

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
        case METHODID_DOMAIN:
          serviceImpl.domain((com.starnamed.x.starname.v1beta1.QueryDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainResponse>) responseObserver);
          break;
        case METHODID_DOMAIN_ACCOUNTS:
          serviceImpl.domainAccounts((com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse>) responseObserver);
          break;
        case METHODID_STARNAME:
          serviceImpl.starname((com.starnamed.x.starname.v1beta1.QueryStarnameRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryStarnameResponse>) responseObserver);
          break;
        case METHODID_OWNER_ACCOUNTS:
          serviceImpl.ownerAccounts((com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse>) responseObserver);
          break;
        case METHODID_OWNER_DOMAINS:
          serviceImpl.ownerDomains((com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse>) responseObserver);
          break;
        case METHODID_RESOURCE_ACCOUNTS:
          serviceImpl.resourceAccounts((com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse>) responseObserver);
          break;
        case METHODID_BROKER_ACCOUNTS:
          serviceImpl.brokerAccounts((com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse>) responseObserver);
          break;
        case METHODID_BROKER_DOMAINS:
          serviceImpl.brokerDomains((com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse>) responseObserver);
          break;
        case METHODID_YIELD:
          serviceImpl.yield((com.starnamed.x.starname.v1beta1.QueryYieldRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.QueryYieldResponse>) responseObserver);
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
          getDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryDomainRequest,
              com.starnamed.x.starname.v1beta1.QueryDomainResponse>(
                service, METHODID_DOMAIN)))
        .addMethod(
          getDomainAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryDomainAccountsRequest,
              com.starnamed.x.starname.v1beta1.QueryDomainAccountsResponse>(
                service, METHODID_DOMAIN_ACCOUNTS)))
        .addMethod(
          getStarnameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryStarnameRequest,
              com.starnamed.x.starname.v1beta1.QueryStarnameResponse>(
                service, METHODID_STARNAME)))
        .addMethod(
          getOwnerAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest,
              com.starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse>(
                service, METHODID_OWNER_ACCOUNTS)))
        .addMethod(
          getOwnerDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest,
              com.starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse>(
                service, METHODID_OWNER_DOMAINS)))
        .addMethod(
          getResourceAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryResourceAccountsRequest,
              com.starnamed.x.starname.v1beta1.QueryResourceAccountsResponse>(
                service, METHODID_RESOURCE_ACCOUNTS)))
        .addMethod(
          getBrokerAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest,
              com.starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse>(
                service, METHODID_BROKER_ACCOUNTS)))
        .addMethod(
          getBrokerDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest,
              com.starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse>(
                service, METHODID_BROKER_DOMAINS)))
        .addMethod(
          getYieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.QueryYieldRequest,
              com.starnamed.x.starname.v1beta1.QueryYieldResponse>(
                service, METHODID_YIELD)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.starnamed.x.starname.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getDomainMethod())
              .addMethod(getDomainAccountsMethod())
              .addMethod(getStarnameMethod())
              .addMethod(getOwnerAccountsMethod())
              .addMethod(getOwnerDomainsMethod())
              .addMethod(getResourceAccountsMethod())
              .addMethod(getBrokerAccountsMethod())
              .addMethod(getBrokerDomainsMethod())
              .addMethod(getYieldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
