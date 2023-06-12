//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stride/interchainquery/v1/query.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


/// Usage: instantiate `Stride_Interchainquery_V1_QueryServiceClient`, then call methods of this protocol to make API calls.
internal protocol Stride_Interchainquery_V1_QueryServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? { get }

  func pendingQueries(
    _ request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse>
}

extension Stride_Interchainquery_V1_QueryServiceClientProtocol {
  internal var serviceName: String {
    return "stride.interchainquery.v1.QueryService"
  }

  /// Unary call to PendingQueries
  ///
  /// - Parameters:
  ///   - request: Request to send to PendingQueries.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pendingQueries(
    _ request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse> {
    return self.makeUnaryCall(
      path: Stride_Interchainquery_V1_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stride_Interchainquery_V1_QueryServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stride_Interchainquery_V1_QueryServiceNIOClient")
internal final class Stride_Interchainquery_V1_QueryServiceClient: Stride_Interchainquery_V1_QueryServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stride.interchainquery.v1.QueryService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stride_Interchainquery_V1_QueryServiceNIOClient: Stride_Interchainquery_V1_QueryServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the stride.interchainquery.v1.QueryService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Interchainquery_V1_QueryServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? { get }

  func makePendingQueriesCall(
    _ request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Interchainquery_V1_QueryServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Interchainquery_V1_QueryServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makePendingQueriesCall(
    _ request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Interchainquery_V1_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Interchainquery_V1_QueryServiceAsyncClientProtocol {
  internal func pendingQueries(
    _ request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Interchainquery_V1_QueryPendingQueriesResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Interchainquery_V1_QueryServiceClientMetadata.Methods.pendingQueries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stride_Interchainquery_V1_QueryServiceAsyncClient: Stride_Interchainquery_V1_QueryServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stride_Interchainquery_V1_QueryServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'pendingQueries'.
  func makePendingQueriesInterceptors() -> [ClientInterceptor<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse>]
}

internal enum Stride_Interchainquery_V1_QueryServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QueryService",
    fullName: "stride.interchainquery.v1.QueryService",
    methods: [
      Stride_Interchainquery_V1_QueryServiceClientMetadata.Methods.pendingQueries,
    ]
  )

  internal enum Methods {
    internal static let pendingQueries = GRPCMethodDescriptor(
      name: "PendingQueries",
      path: "/stride.interchainquery.v1.QueryService/PendingQueries",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Stride_Interchainquery_V1_QueryServiceProvider: CallHandlerProvider {
  var interceptors: Stride_Interchainquery_V1_QueryServiceServerInterceptorFactoryProtocol? { get }

  func pendingQueries(request: Stride_Interchainquery_V1_QueryPendingQueriesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Interchainquery_V1_QueryPendingQueriesResponse>
}

extension Stride_Interchainquery_V1_QueryServiceProvider {
  internal var serviceName: Substring {
    return Stride_Interchainquery_V1_QueryServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "PendingQueries":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Interchainquery_V1_QueryPendingQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Interchainquery_V1_QueryPendingQueriesResponse>(),
        interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? [],
        userFunction: self.pendingQueries(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Interchainquery_V1_QueryServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Interchainquery_V1_QueryServiceServerInterceptorFactoryProtocol? { get }

  @Sendable func pendingQueries(
    request: Stride_Interchainquery_V1_QueryPendingQueriesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Interchainquery_V1_QueryPendingQueriesResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Interchainquery_V1_QueryServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Interchainquery_V1_QueryServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stride_Interchainquery_V1_QueryServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stride_Interchainquery_V1_QueryServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "PendingQueries":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Interchainquery_V1_QueryPendingQueriesRequest>(),
        responseSerializer: ProtobufSerializer<Stride_Interchainquery_V1_QueryPendingQueriesResponse>(),
        interceptors: self.interceptors?.makePendingQueriesInterceptors() ?? [],
        wrapping: self.pendingQueries(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stride_Interchainquery_V1_QueryServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'pendingQueries'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePendingQueriesInterceptors() -> [ServerInterceptor<Stride_Interchainquery_V1_QueryPendingQueriesRequest, Stride_Interchainquery_V1_QueryPendingQueriesResponse>]
}

internal enum Stride_Interchainquery_V1_QueryServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QueryService",
    fullName: "stride.interchainquery.v1.QueryService",
    methods: [
      Stride_Interchainquery_V1_QueryServiceServerMetadata.Methods.pendingQueries,
    ]
  )

  internal enum Methods {
    internal static let pendingQueries = GRPCMethodDescriptor(
      name: "PendingQueries",
      path: "/stride.interchainquery.v1.QueryService/PendingQueries",
      type: GRPCCallType.unary
    )
  }
}
