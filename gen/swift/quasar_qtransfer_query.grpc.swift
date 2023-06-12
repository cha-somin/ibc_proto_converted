//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: quasar/qtransfer/query.proto
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
/// Usage: instantiate `Quasarlabs_Quasarnode_Qtransfer_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>
}

extension Quasarlabs_Quasarnode_Qtransfer_QueryClientProtocol {
  internal var serviceName: String {
    return "quasarlabs.quasarnode.qtransfer.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Quasarlabs_Quasarnode_Qtransfer_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Quasarlabs_Quasarnode_Qtransfer_QueryNIOClient")
internal final class Quasarlabs_Quasarnode_Qtransfer_QueryClient: Quasarlabs_Quasarnode_Qtransfer_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the quasarlabs.quasarnode.qtransfer.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Quasarlabs_Quasarnode_Qtransfer_QueryNIOClient: Quasarlabs_Quasarnode_Qtransfer_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the quasarlabs.quasarnode.qtransfer.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qtransfer_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qtransfer_QueryAsyncClientProtocol {
  internal func params(
    _ request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Quasarlabs_Quasarnode_Qtransfer_QueryAsyncClient: Quasarlabs_Quasarnode_Qtransfer_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>]
}

internal enum Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "quasarlabs.quasarnode.qtransfer.Query",
    methods: [
      Quasarlabs_Quasarnode_Qtransfer_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/quasarlabs.quasarnode.qtransfer.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryProvider: CallHandlerProvider {
  var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>
}

extension Quasarlabs_Quasarnode_Qtransfer_QueryProvider {
  internal var serviceName: Substring {
    return Quasarlabs_Quasarnode_Qtransfer_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>(),
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
internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qtransfer_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quasarlabs_Quasarnode_Qtransfer_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Quasarlabs_Quasarnode_Qtransfer_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Quasarlabs_Quasarnode_Qtransfer_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Quasarlabs_Quasarnode_Qtransfer_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Quasarlabs_Quasarnode_Qtransfer_QueryParamsRequest, Quasarlabs_Quasarnode_Qtransfer_QueryParamsResponse>]
}

internal enum Quasarlabs_Quasarnode_Qtransfer_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "quasarlabs.quasarnode.qtransfer.Query",
    methods: [
      Quasarlabs_Quasarnode_Qtransfer_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/quasarlabs.quasarnode.qtransfer.Query/Params",
      type: GRPCCallType.unary
    )
  }
}
