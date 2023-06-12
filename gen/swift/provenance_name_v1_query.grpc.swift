//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/name/v1/query.proto
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


/// Query defines the gRPC querier service for distribution module.
///
/// Usage: instantiate `Provenance_Name_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Name_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Provenance_Name_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse>

  func resolve(
    _ request: Provenance_Name_V1_QueryResolveRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse>

  func reverseLookup(
    _ request: Provenance_Name_V1_QueryReverseLookupRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse>
}

extension Provenance_Name_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "provenance.name.v1.Query"
  }

  /// Params queries params of the name module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Provenance_Name_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Resolve queries for the address associated with a given name
  ///
  /// - Parameters:
  ///   - request: Request to send to Resolve.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func resolve(
    _ request: Provenance_Name_V1_QueryResolveRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.resolve.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeResolveInterceptors() ?? []
    )
  }

  /// ReverseLookup queries for all names bound against a given address
  ///
  /// - Parameters:
  ///   - request: Request to send to ReverseLookup.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reverseLookup(
    _ request: Provenance_Name_V1_QueryReverseLookupRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.reverseLookup.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReverseLookupInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Name_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Name_V1_QueryNIOClient")
internal final class Provenance_Name_V1_QueryClient: Provenance_Name_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.name.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Name_V1_QueryNIOClient: Provenance_Name_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.name.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for distribution module.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Name_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Provenance_Name_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse>

  func makeResolveCall(
    _ request: Provenance_Name_V1_QueryResolveRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse>

  func makeReverseLookupCall(
    _ request: Provenance_Name_V1_QueryReverseLookupRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Name_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Provenance_Name_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeResolveCall(
    _ request: Provenance_Name_V1_QueryResolveRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.resolve.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeResolveInterceptors() ?? []
    )
  }

  internal func makeReverseLookupCall(
    _ request: Provenance_Name_V1_QueryReverseLookupRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.reverseLookup.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReverseLookupInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Provenance_Name_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func resolve(
    _ request: Provenance_Name_V1_QueryResolveRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_QueryResolveResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.resolve.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeResolveInterceptors() ?? []
    )
  }

  internal func reverseLookup(
    _ request: Provenance_Name_V1_QueryReverseLookupRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_QueryReverseLookupResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_QueryClientMetadata.Methods.reverseLookup.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReverseLookupInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Name_V1_QueryAsyncClient: Provenance_Name_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Name_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'resolve'.
  func makeResolveInterceptors() -> [ClientInterceptor<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse>]

  /// - Returns: Interceptors to use when invoking 'reverseLookup'.
  func makeReverseLookupInterceptors() -> [ClientInterceptor<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse>]
}

internal enum Provenance_Name_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.name.v1.Query",
    methods: [
      Provenance_Name_V1_QueryClientMetadata.Methods.params,
      Provenance_Name_V1_QueryClientMetadata.Methods.resolve,
      Provenance_Name_V1_QueryClientMetadata.Methods.reverseLookup,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/provenance.name.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let resolve = GRPCMethodDescriptor(
      name: "Resolve",
      path: "/provenance.name.v1.Query/Resolve",
      type: GRPCCallType.unary
    )

    internal static let reverseLookup = GRPCMethodDescriptor(
      name: "ReverseLookup",
      path: "/provenance.name.v1.Query/ReverseLookup",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for distribution module.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Name_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Provenance_Name_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries params of the name module.
  func params(request: Provenance_Name_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_QueryParamsResponse>

  /// Resolve queries for the address associated with a given name
  func resolve(request: Provenance_Name_V1_QueryResolveRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_QueryResolveResponse>

  /// ReverseLookup queries for all names bound against a given address
  func reverseLookup(request: Provenance_Name_V1_QueryReverseLookupRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_QueryReverseLookupResponse>
}

extension Provenance_Name_V1_QueryProvider {
  internal var serviceName: Substring {
    return Provenance_Name_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Resolve":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryResolveRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryResolveResponse>(),
        interceptors: self.interceptors?.makeResolveInterceptors() ?? [],
        userFunction: self.resolve(request:context:)
      )

    case "ReverseLookup":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryReverseLookupRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryReverseLookupResponse>(),
        interceptors: self.interceptors?.makeReverseLookupInterceptors() ?? [],
        userFunction: self.reverseLookup(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for distribution module.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Name_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Name_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries params of the name module.
  @Sendable func params(
    request: Provenance_Name_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_QueryParamsResponse

  /// Resolve queries for the address associated with a given name
  @Sendable func resolve(
    request: Provenance_Name_V1_QueryResolveRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_QueryResolveResponse

  /// ReverseLookup queries for all names bound against a given address
  @Sendable func reverseLookup(
    request: Provenance_Name_V1_QueryReverseLookupRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_QueryReverseLookupResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Name_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Name_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Name_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Resolve":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryResolveRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryResolveResponse>(),
        interceptors: self.interceptors?.makeResolveInterceptors() ?? [],
        wrapping: self.resolve(request:context:)
      )

    case "ReverseLookup":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_QueryReverseLookupRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_QueryReverseLookupResponse>(),
        interceptors: self.interceptors?.makeReverseLookupInterceptors() ?? [],
        wrapping: self.reverseLookup(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Name_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Provenance_Name_V1_QueryParamsRequest, Provenance_Name_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'resolve'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeResolveInterceptors() -> [ServerInterceptor<Provenance_Name_V1_QueryResolveRequest, Provenance_Name_V1_QueryResolveResponse>]

  /// - Returns: Interceptors to use when handling 'reverseLookup'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReverseLookupInterceptors() -> [ServerInterceptor<Provenance_Name_V1_QueryReverseLookupRequest, Provenance_Name_V1_QueryReverseLookupResponse>]
}

internal enum Provenance_Name_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.name.v1.Query",
    methods: [
      Provenance_Name_V1_QueryServerMetadata.Methods.params,
      Provenance_Name_V1_QueryServerMetadata.Methods.resolve,
      Provenance_Name_V1_QueryServerMetadata.Methods.reverseLookup,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/provenance.name.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let resolve = GRPCMethodDescriptor(
      name: "Resolve",
      path: "/provenance.name.v1.Query/Resolve",
      type: GRPCCallType.unary
    )

    internal static let reverseLookup = GRPCMethodDescriptor(
      name: "ReverseLookup",
      path: "/provenance.name.v1.Query/ReverseLookup",
      type: GRPCCallType.unary
    )
  }
}
