//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: quicksilver/interchainquery/v1/query.proto
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


/// Query provides defines the gRPC querier service.
///
/// Usage: instantiate `Quicksilver_Interchainquery_V1_QuerySrvrClient`, then call methods of this protocol to make API calls.
internal protocol Quicksilver_Interchainquery_V1_QuerySrvrClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? { get }

  func queries(
    _ request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse>
}

extension Quicksilver_Interchainquery_V1_QuerySrvrClientProtocol {
  internal var serviceName: String {
    return "quicksilver.interchainquery.v1.QuerySrvr"
  }

  /// Params returns the total set of minting parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to Queries.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queries(
    _ request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse> {
    return self.makeUnaryCall(
      path: Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Quicksilver_Interchainquery_V1_QuerySrvrClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Quicksilver_Interchainquery_V1_QuerySrvrNIOClient")
internal final class Quicksilver_Interchainquery_V1_QuerySrvrClient: Quicksilver_Interchainquery_V1_QuerySrvrClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the quicksilver.interchainquery.v1.QuerySrvr service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Quicksilver_Interchainquery_V1_QuerySrvrNIOClient: Quicksilver_Interchainquery_V1_QuerySrvrClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol?

  /// Creates a client for the quicksilver.interchainquery.v1.QuerySrvr service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quicksilver_Interchainquery_V1_QuerySrvrAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? { get }

  func makeQueriesCall(
    _ request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Interchainquery_V1_QuerySrvrAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata.serviceDescriptor
  }

  internal var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeQueriesCall(
    _ request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse> {
    return self.makeAsyncUnaryCall(
      path: Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Interchainquery_V1_QuerySrvrAsyncClientProtocol {
  internal func queries(
    _ request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quicksilver_Interchainquery_V1_QueryRequestsResponse {
    return try await self.performAsyncUnaryCall(
      path: Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata.Methods.queries.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueriesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Quicksilver_Interchainquery_V1_QuerySrvrAsyncClient: Quicksilver_Interchainquery_V1_QuerySrvrAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Quicksilver_Interchainquery_V1_QuerySrvrClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'queries'.
  func makeQueriesInterceptors() -> [ClientInterceptor<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse>]
}

internal enum Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QuerySrvr",
    fullName: "quicksilver.interchainquery.v1.QuerySrvr",
    methods: [
      Quicksilver_Interchainquery_V1_QuerySrvrClientMetadata.Methods.queries,
    ]
  )

  internal enum Methods {
    internal static let queries = GRPCMethodDescriptor(
      name: "Queries",
      path: "/quicksilver.interchainquery.v1.QuerySrvr/Queries",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Quicksilver_Interchainquery_V1_QuerySrvrProvider: CallHandlerProvider {
  var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of minting parameters.
  func queries(request: Quicksilver_Interchainquery_V1_QueryRequestsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quicksilver_Interchainquery_V1_QueryRequestsResponse>
}

extension Quicksilver_Interchainquery_V1_QuerySrvrProvider {
  internal var serviceName: Substring {
    return Quicksilver_Interchainquery_V1_QuerySrvrServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Queries":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Interchainquery_V1_QueryRequestsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Interchainquery_V1_QueryRequestsResponse>(),
        interceptors: self.interceptors?.makeQueriesInterceptors() ?? [],
        userFunction: self.queries(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query provides defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quicksilver_Interchainquery_V1_QuerySrvrAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of minting parameters.
  @Sendable func queries(
    request: Quicksilver_Interchainquery_V1_QueryRequestsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quicksilver_Interchainquery_V1_QueryRequestsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quicksilver_Interchainquery_V1_QuerySrvrAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quicksilver_Interchainquery_V1_QuerySrvrServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Quicksilver_Interchainquery_V1_QuerySrvrServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Quicksilver_Interchainquery_V1_QuerySrvrServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Queries":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Quicksilver_Interchainquery_V1_QueryRequestsRequest>(),
        responseSerializer: ProtobufSerializer<Quicksilver_Interchainquery_V1_QueryRequestsResponse>(),
        interceptors: self.interceptors?.makeQueriesInterceptors() ?? [],
        wrapping: self.queries(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Quicksilver_Interchainquery_V1_QuerySrvrServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'queries'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueriesInterceptors() -> [ServerInterceptor<Quicksilver_Interchainquery_V1_QueryRequestsRequest, Quicksilver_Interchainquery_V1_QueryRequestsResponse>]
}

internal enum Quicksilver_Interchainquery_V1_QuerySrvrServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "QuerySrvr",
    fullName: "quicksilver.interchainquery.v1.QuerySrvr",
    methods: [
      Quicksilver_Interchainquery_V1_QuerySrvrServerMetadata.Methods.queries,
    ]
  )

  internal enum Methods {
    internal static let queries = GRPCMethodDescriptor(
      name: "Queries",
      path: "/quicksilver.interchainquery.v1.QuerySrvr/Queries",
      type: GRPCCallType.unary
    )
  }
}
