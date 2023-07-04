//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: rizon/tokenswap/tx.proto
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


/// Msg defines the tokenswap Msg service.
///
/// Usage: instantiate `Rizonworld_Rizon_Tokenswap_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Rizonworld_Rizon_Tokenswap_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? { get }

  func createTokenswap(
    _ request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>
}

extension Rizonworld_Rizon_Tokenswap_MsgClientProtocol {
  internal var serviceName: String {
    return "rizonworld.rizon.tokenswap.Msg"
  }

  /// CreateTokenswap defines a method for creating a new tokenswap
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateTokenswap.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createTokenswap(
    _ request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse> {
    return self.makeUnaryCall(
      path: Rizonworld_Rizon_Tokenswap_MsgClientMetadata.Methods.createTokenswap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenswapInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Rizonworld_Rizon_Tokenswap_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Rizonworld_Rizon_Tokenswap_MsgNIOClient")
internal final class Rizonworld_Rizon_Tokenswap_MsgClient: Rizonworld_Rizon_Tokenswap_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the rizonworld.rizon.tokenswap.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Rizonworld_Rizon_Tokenswap_MsgNIOClient: Rizonworld_Rizon_Tokenswap_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the rizonworld.rizon.tokenswap.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the tokenswap Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Rizonworld_Rizon_Tokenswap_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateTokenswapCall(
    _ request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Rizonworld_Rizon_Tokenswap_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Rizonworld_Rizon_Tokenswap_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateTokenswapCall(
    _ request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse> {
    return self.makeAsyncUnaryCall(
      path: Rizonworld_Rizon_Tokenswap_MsgClientMetadata.Methods.createTokenswap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenswapInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Rizonworld_Rizon_Tokenswap_MsgAsyncClientProtocol {
  internal func createTokenswap(
    _ request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse {
    return try await self.performAsyncUnaryCall(
      path: Rizonworld_Rizon_Tokenswap_MsgClientMetadata.Methods.createTokenswap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenswapInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Rizonworld_Rizon_Tokenswap_MsgAsyncClient: Rizonworld_Rizon_Tokenswap_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Rizonworld_Rizon_Tokenswap_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createTokenswap'.
  func makeCreateTokenswapInterceptors() -> [ClientInterceptor<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>]
}

internal enum Rizonworld_Rizon_Tokenswap_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "rizonworld.rizon.tokenswap.Msg",
    methods: [
      Rizonworld_Rizon_Tokenswap_MsgClientMetadata.Methods.createTokenswap,
    ]
  )

  internal enum Methods {
    internal static let createTokenswap = GRPCMethodDescriptor(
      name: "CreateTokenswap",
      path: "/rizonworld.rizon.tokenswap.Msg/CreateTokenswap",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the tokenswap Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Rizonworld_Rizon_Tokenswap_MsgProvider: CallHandlerProvider {
  var interceptors: Rizonworld_Rizon_Tokenswap_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateTokenswap defines a method for creating a new tokenswap
  func createTokenswap(request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>
}

extension Rizonworld_Rizon_Tokenswap_MsgProvider {
  internal var serviceName: Substring {
    return Rizonworld_Rizon_Tokenswap_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateTokenswap":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest>(),
        responseSerializer: ProtobufSerializer<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>(),
        interceptors: self.interceptors?.makeCreateTokenswapInterceptors() ?? [],
        userFunction: self.createTokenswap(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the tokenswap Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Rizonworld_Rizon_Tokenswap_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Rizonworld_Rizon_Tokenswap_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateTokenswap defines a method for creating a new tokenswap
  @Sendable func createTokenswap(
    request: Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Rizonworld_Rizon_Tokenswap_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Rizonworld_Rizon_Tokenswap_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Rizonworld_Rizon_Tokenswap_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Rizonworld_Rizon_Tokenswap_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateTokenswap":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest>(),
        responseSerializer: ProtobufSerializer<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>(),
        interceptors: self.interceptors?.makeCreateTokenswapInterceptors() ?? [],
        wrapping: self.createTokenswap(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Rizonworld_Rizon_Tokenswap_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createTokenswap'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateTokenswapInterceptors() -> [ServerInterceptor<Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapRequest, Rizonworld_Rizon_Tokenswap_MsgCreateTokenswapResponse>]
}

internal enum Rizonworld_Rizon_Tokenswap_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "rizonworld.rizon.tokenswap.Msg",
    methods: [
      Rizonworld_Rizon_Tokenswap_MsgServerMetadata.Methods.createTokenswap,
    ]
  )

  internal enum Methods {
    internal static let createTokenswap = GRPCMethodDescriptor(
      name: "CreateTokenswap",
      path: "/rizonworld.rizon.tokenswap.Msg/CreateTokenswap",
      type: GRPCCallType.unary
    )
  }
}