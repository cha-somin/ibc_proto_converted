//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: coreum/feemodel/v1/query.proto
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
/// Usage: instantiate `Coreum_Feemodel_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Coreum_Feemodel_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? { get }

  func minGasPrice(
    _ request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse>

  func params(
    _ request: Coreum_Feemodel_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse>
}

extension Coreum_Feemodel_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "coreum.feemodel.v1.Query"
  }

  /// MinGasPrice queries the current minimum gas price required by the network.
  ///
  /// - Parameters:
  ///   - request: Request to send to MinGasPrice.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func minGasPrice(
    _ request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse> {
    return self.makeUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.minGasPrice.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMinGasPriceInterceptors() ?? []
    )
  }

  /// Params queries the parameters of x/feemodel module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Coreum_Feemodel_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Coreum_Feemodel_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Coreum_Feemodel_V1_QueryNIOClient")
internal final class Coreum_Feemodel_V1_QueryClient: Coreum_Feemodel_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the coreum.feemodel.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Coreum_Feemodel_V1_QueryNIOClient: Coreum_Feemodel_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the coreum.feemodel.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Coreum_Feemodel_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeMinGasPriceCall(
    _ request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse>

  func makeParamsCall(
    _ request: Coreum_Feemodel_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Coreum_Feemodel_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Coreum_Feemodel_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeMinGasPriceCall(
    _ request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse> {
    return self.makeAsyncUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.minGasPrice.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMinGasPriceInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Coreum_Feemodel_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Coreum_Feemodel_V1_QueryAsyncClientProtocol {
  internal func minGasPrice(
    _ request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Coreum_Feemodel_V1_QueryMinGasPriceResponse {
    return try await self.performAsyncUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.minGasPrice.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMinGasPriceInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Coreum_Feemodel_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Coreum_Feemodel_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Coreum_Feemodel_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Coreum_Feemodel_V1_QueryAsyncClient: Coreum_Feemodel_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Coreum_Feemodel_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'minGasPrice'.
  func makeMinGasPriceInterceptors() -> [ClientInterceptor<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse>]
}

internal enum Coreum_Feemodel_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "coreum.feemodel.v1.Query",
    methods: [
      Coreum_Feemodel_V1_QueryClientMetadata.Methods.minGasPrice,
      Coreum_Feemodel_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let minGasPrice = GRPCMethodDescriptor(
      name: "MinGasPrice",
      path: "/coreum.feemodel.v1.Query/MinGasPrice",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/coreum.feemodel.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Coreum_Feemodel_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Coreum_Feemodel_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// MinGasPrice queries the current minimum gas price required by the network.
  func minGasPrice(request: Coreum_Feemodel_V1_QueryMinGasPriceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Coreum_Feemodel_V1_QueryMinGasPriceResponse>

  /// Params queries the parameters of x/feemodel module.
  func params(request: Coreum_Feemodel_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Coreum_Feemodel_V1_QueryParamsResponse>
}

extension Coreum_Feemodel_V1_QueryProvider {
  internal var serviceName: Substring {
    return Coreum_Feemodel_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MinGasPrice":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Coreum_Feemodel_V1_QueryMinGasPriceRequest>(),
        responseSerializer: ProtobufSerializer<Coreum_Feemodel_V1_QueryMinGasPriceResponse>(),
        interceptors: self.interceptors?.makeMinGasPriceInterceptors() ?? [],
        userFunction: self.minGasPrice(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Coreum_Feemodel_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Coreum_Feemodel_V1_QueryParamsResponse>(),
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
internal protocol Coreum_Feemodel_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Coreum_Feemodel_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// MinGasPrice queries the current minimum gas price required by the network.
  @Sendable func minGasPrice(
    request: Coreum_Feemodel_V1_QueryMinGasPriceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Coreum_Feemodel_V1_QueryMinGasPriceResponse

  /// Params queries the parameters of x/feemodel module.
  @Sendable func params(
    request: Coreum_Feemodel_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Coreum_Feemodel_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Coreum_Feemodel_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Coreum_Feemodel_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Coreum_Feemodel_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Coreum_Feemodel_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MinGasPrice":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Coreum_Feemodel_V1_QueryMinGasPriceRequest>(),
        responseSerializer: ProtobufSerializer<Coreum_Feemodel_V1_QueryMinGasPriceResponse>(),
        interceptors: self.interceptors?.makeMinGasPriceInterceptors() ?? [],
        wrapping: self.minGasPrice(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Coreum_Feemodel_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Coreum_Feemodel_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Coreum_Feemodel_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'minGasPrice'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMinGasPriceInterceptors() -> [ServerInterceptor<Coreum_Feemodel_V1_QueryMinGasPriceRequest, Coreum_Feemodel_V1_QueryMinGasPriceResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Coreum_Feemodel_V1_QueryParamsRequest, Coreum_Feemodel_V1_QueryParamsResponse>]
}

internal enum Coreum_Feemodel_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "coreum.feemodel.v1.Query",
    methods: [
      Coreum_Feemodel_V1_QueryServerMetadata.Methods.minGasPrice,
      Coreum_Feemodel_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let minGasPrice = GRPCMethodDescriptor(
      name: "MinGasPrice",
      path: "/coreum.feemodel.v1.Query/MinGasPrice",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/coreum.feemodel.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}