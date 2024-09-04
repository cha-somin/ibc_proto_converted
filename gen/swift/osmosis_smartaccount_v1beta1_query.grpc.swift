//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/smartaccount/v1beta1/query.proto
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
/// Usage: instantiate `Osmosis_Smartaccount_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Smartaccount_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse>

  func getAuthenticator(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>

  func getAuthenticators(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>
}

extension Osmosis_Smartaccount_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "osmosis.smartaccount.v1beta1.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Unary call to GetAuthenticator
  ///
  /// - Parameters:
  ///   - request: Request to send to GetAuthenticator.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getAuthenticator(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorInterceptors() ?? []
    )
  }

  /// Unary call to GetAuthenticators
  ///
  /// - Parameters:
  ///   - request: Request to send to GetAuthenticators.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getAuthenticators(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse> {
    return self.makeUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticators.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Osmosis_Smartaccount_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Osmosis_Smartaccount_V1beta1_QueryNIOClient")
internal final class Osmosis_Smartaccount_V1beta1_QueryClient: Osmosis_Smartaccount_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the osmosis.smartaccount.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Osmosis_Smartaccount_V1beta1_QueryNIOClient: Osmosis_Smartaccount_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.smartaccount.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Osmosis_Smartaccount_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse>

  func makeGetAuthenticatorCall(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>

  func makeGetAuthenticatorsCall(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Smartaccount_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Smartaccount_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeGetAuthenticatorCall(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorInterceptors() ?? []
    )
  }

  internal func makeGetAuthenticatorsCall(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse> {
    return self.makeAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticators.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Smartaccount_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Smartaccount_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func getAuthenticator(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticator.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorInterceptors() ?? []
    )
  }

  internal func getAuthenticators(
    _ request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse {
    return try await self.performAsyncUnaryCall(
      path: Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticators.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetAuthenticatorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Osmosis_Smartaccount_V1beta1_QueryAsyncClient: Osmosis_Smartaccount_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Osmosis_Smartaccount_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'getAuthenticator'.
  func makeGetAuthenticatorInterceptors() -> [ClientInterceptor<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>]

  /// - Returns: Interceptors to use when invoking 'getAuthenticators'.
  func makeGetAuthenticatorsInterceptors() -> [ClientInterceptor<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>]
}

internal enum Osmosis_Smartaccount_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "osmosis.smartaccount.v1beta1.Query",
    methods: [
      Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.params,
      Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticator,
      Osmosis_Smartaccount_V1beta1_QueryClientMetadata.Methods.getAuthenticators,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/osmosis.smartaccount.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let getAuthenticator = GRPCMethodDescriptor(
      name: "GetAuthenticator",
      path: "/osmosis.smartaccount.v1beta1.Query/GetAuthenticator",
      type: GRPCCallType.unary
    )

    internal static let getAuthenticators = GRPCMethodDescriptor(
      name: "GetAuthenticators",
      path: "/osmosis.smartaccount.v1beta1.Query/GetAuthenticators",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Smartaccount_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Osmosis_Smartaccount_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Smartaccount_V1beta1_QueryParamsResponse>

  func getAuthenticator(request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>

  func getAuthenticators(request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>
}

extension Osmosis_Smartaccount_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Osmosis_Smartaccount_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "GetAuthenticator":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>(),
        interceptors: self.interceptors?.makeGetAuthenticatorInterceptors() ?? [],
        userFunction: self.getAuthenticator(request:context:)
      )

    case "GetAuthenticators":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>(),
        interceptors: self.interceptors?.makeGetAuthenticatorsInterceptors() ?? [],
        userFunction: self.getAuthenticators(request:context:)
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
internal protocol Osmosis_Smartaccount_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Osmosis_Smartaccount_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Osmosis_Smartaccount_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Smartaccount_V1beta1_QueryParamsResponse

  @Sendable func getAuthenticator(
    request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse

  @Sendable func getAuthenticators(
    request: Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Osmosis_Smartaccount_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Osmosis_Smartaccount_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Osmosis_Smartaccount_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Osmosis_Smartaccount_V1beta1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "GetAuthenticator":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>(),
        interceptors: self.interceptors?.makeGetAuthenticatorInterceptors() ?? [],
        wrapping: self.getAuthenticator(request:context:)
      )

    case "GetAuthenticators":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>(),
        interceptors: self.interceptors?.makeGetAuthenticatorsInterceptors() ?? [],
        wrapping: self.getAuthenticators(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Smartaccount_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Osmosis_Smartaccount_V1beta1_QueryParamsRequest, Osmosis_Smartaccount_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'getAuthenticator'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetAuthenticatorInterceptors() -> [ServerInterceptor<Osmosis_Smartaccount_V1beta1_GetAuthenticatorRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorResponse>]

  /// - Returns: Interceptors to use when handling 'getAuthenticators'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetAuthenticatorsInterceptors() -> [ServerInterceptor<Osmosis_Smartaccount_V1beta1_GetAuthenticatorsRequest, Osmosis_Smartaccount_V1beta1_GetAuthenticatorsResponse>]
}

internal enum Osmosis_Smartaccount_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "osmosis.smartaccount.v1beta1.Query",
    methods: [
      Osmosis_Smartaccount_V1beta1_QueryServerMetadata.Methods.params,
      Osmosis_Smartaccount_V1beta1_QueryServerMetadata.Methods.getAuthenticator,
      Osmosis_Smartaccount_V1beta1_QueryServerMetadata.Methods.getAuthenticators,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/osmosis.smartaccount.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let getAuthenticator = GRPCMethodDescriptor(
      name: "GetAuthenticator",
      path: "/osmosis.smartaccount.v1beta1.Query/GetAuthenticator",
      type: GRPCCallType.unary
    )

    internal static let getAuthenticators = GRPCMethodDescriptor(
      name: "GetAuthenticators",
      path: "/osmosis.smartaccount.v1beta1.Query/GetAuthenticators",
      type: GRPCCallType.unary
    )
  }
}
