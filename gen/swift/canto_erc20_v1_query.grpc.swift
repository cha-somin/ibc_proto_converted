//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: canto/erc20/v1/query.proto
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


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Canto_Erc20_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Canto_Erc20_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? { get }

  func tokenPairs(
    _ request: Canto_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse>

  func tokenPair(
    _ request: Canto_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse>

  func params(
    _ request: Canto_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse>
}

extension Canto_Erc20_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "canto.erc20.v1.Query"
  }

  /// TokenPairs retrieves registered token pairs
  ///
  /// - Parameters:
  ///   - request: Request to send to TokenPairs.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenPairs(
    _ request: Canto_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse> {
    return self.makeUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  /// TokenPair retrieves a registered token pair
  ///
  /// - Parameters:
  ///   - request: Request to send to TokenPair.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenPair(
    _ request: Canto_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse> {
    return self.makeUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  /// Params retrieves the erc20 module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Canto_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Canto_Erc20_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Canto_Erc20_V1_QueryNIOClient")
internal final class Canto_Erc20_V1_QueryClient: Canto_Erc20_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the canto.erc20.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Canto_Erc20_V1_QueryNIOClient: Canto_Erc20_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the canto.erc20.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Erc20_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeTokenPairsCall(
    _ request: Canto_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse>

  func makeTokenPairCall(
    _ request: Canto_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse>

  func makeParamsCall(
    _ request: Canto_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Erc20_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Erc20_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeTokenPairsCall(
    _ request: Canto_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  internal func makeTokenPairCall(
    _ request: Canto_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Canto_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Erc20_V1_QueryAsyncClientProtocol {
  internal func tokenPairs(
    _ request: Canto_Erc20_V1_QueryTokenPairsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Erc20_V1_QueryTokenPairsResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPairs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? []
    )
  }

  internal func tokenPair(
    _ request: Canto_Erc20_V1_QueryTokenPairRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Erc20_V1_QueryTokenPairResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPair.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenPairInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Canto_Erc20_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Erc20_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Erc20_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Canto_Erc20_V1_QueryAsyncClient: Canto_Erc20_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Canto_Erc20_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'tokenPairs'.
  func makeTokenPairsInterceptors() -> [ClientInterceptor<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse>]

  /// - Returns: Interceptors to use when invoking 'tokenPair'.
  func makeTokenPairInterceptors() -> [ClientInterceptor<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse>]
}

internal enum Canto_Erc20_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.erc20.v1.Query",
    methods: [
      Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPairs,
      Canto_Erc20_V1_QueryClientMetadata.Methods.tokenPair,
      Canto_Erc20_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let tokenPairs = GRPCMethodDescriptor(
      name: "TokenPairs",
      path: "/canto.erc20.v1.Query/TokenPairs",
      type: GRPCCallType.unary
    )

    internal static let tokenPair = GRPCMethodDescriptor(
      name: "TokenPair",
      path: "/canto.erc20.v1.Query/TokenPair",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/canto.erc20.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Canto_Erc20_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Canto_Erc20_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// TokenPairs retrieves registered token pairs
  func tokenPairs(request: Canto_Erc20_V1_QueryTokenPairsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Erc20_V1_QueryTokenPairsResponse>

  /// TokenPair retrieves a registered token pair
  func tokenPair(request: Canto_Erc20_V1_QueryTokenPairRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Erc20_V1_QueryTokenPairResponse>

  /// Params retrieves the erc20 module params
  func params(request: Canto_Erc20_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Erc20_V1_QueryParamsResponse>
}

extension Canto_Erc20_V1_QueryProvider {
  internal var serviceName: Substring {
    return Canto_Erc20_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TokenPairs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryTokenPairsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryTokenPairsResponse>(),
        interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? [],
        userFunction: self.tokenPairs(request:context:)
      )

    case "TokenPair":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryTokenPairRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryTokenPairResponse>(),
        interceptors: self.interceptors?.makeTokenPairInterceptors() ?? [],
        userFunction: self.tokenPair(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Erc20_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Erc20_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// TokenPairs retrieves registered token pairs
  @Sendable func tokenPairs(
    request: Canto_Erc20_V1_QueryTokenPairsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Erc20_V1_QueryTokenPairsResponse

  /// TokenPair retrieves a registered token pair
  @Sendable func tokenPair(
    request: Canto_Erc20_V1_QueryTokenPairRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Erc20_V1_QueryTokenPairResponse

  /// Params retrieves the erc20 module params
  @Sendable func params(
    request: Canto_Erc20_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Erc20_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Erc20_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Erc20_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Canto_Erc20_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Canto_Erc20_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "TokenPairs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryTokenPairsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryTokenPairsResponse>(),
        interceptors: self.interceptors?.makeTokenPairsInterceptors() ?? [],
        wrapping: self.tokenPairs(request:context:)
      )

    case "TokenPair":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryTokenPairRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryTokenPairResponse>(),
        interceptors: self.interceptors?.makeTokenPairInterceptors() ?? [],
        wrapping: self.tokenPair(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Erc20_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Erc20_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Canto_Erc20_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'tokenPairs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenPairsInterceptors() -> [ServerInterceptor<Canto_Erc20_V1_QueryTokenPairsRequest, Canto_Erc20_V1_QueryTokenPairsResponse>]

  /// - Returns: Interceptors to use when handling 'tokenPair'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenPairInterceptors() -> [ServerInterceptor<Canto_Erc20_V1_QueryTokenPairRequest, Canto_Erc20_V1_QueryTokenPairResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Canto_Erc20_V1_QueryParamsRequest, Canto_Erc20_V1_QueryParamsResponse>]
}

internal enum Canto_Erc20_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.erc20.v1.Query",
    methods: [
      Canto_Erc20_V1_QueryServerMetadata.Methods.tokenPairs,
      Canto_Erc20_V1_QueryServerMetadata.Methods.tokenPair,
      Canto_Erc20_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let tokenPairs = GRPCMethodDescriptor(
      name: "TokenPairs",
      path: "/canto.erc20.v1.Query/TokenPairs",
      type: GRPCCallType.unary
    )

    internal static let tokenPair = GRPCMethodDescriptor(
      name: "TokenPair",
      path: "/canto.erc20.v1.Query/TokenPair",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/canto.erc20.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}
