//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: axelar/snapshot/v1beta1/service.proto
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


/// Msg defines the snapshot Msg service.
///
/// Usage: instantiate `Axelar_Snapshot_V1beta1_MsgServiceClient`, then call methods of this protocol to make API calls.
internal protocol Axelar_Snapshot_V1beta1_MsgServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? { get }

  func registerProxy(
    _ request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse>

  func deactivateProxy(
    _ request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse>
}

extension Axelar_Snapshot_V1beta1_MsgServiceClientProtocol {
  internal var serviceName: String {
    return "axelar.snapshot.v1beta1.MsgService"
  }

  /// RegisterProxy defines a method for registering a proxy account that can act
  /// in a validator account's stead.
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterProxy.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerProxy(
    _ request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse> {
    return self.makeUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.registerProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterProxyInterceptors() ?? []
    )
  }

  /// DeactivateProxy defines a method for deregistering a proxy account.
  ///
  /// - Parameters:
  ///   - request: Request to send to DeactivateProxy.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deactivateProxy(
    _ request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse> {
    return self.makeUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.deactivateProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateProxyInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Axelar_Snapshot_V1beta1_MsgServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Axelar_Snapshot_V1beta1_MsgServiceNIOClient")
internal final class Axelar_Snapshot_V1beta1_MsgServiceClient: Axelar_Snapshot_V1beta1_MsgServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the axelar.snapshot.v1beta1.MsgService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Axelar_Snapshot_V1beta1_MsgServiceNIOClient: Axelar_Snapshot_V1beta1_MsgServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the axelar.snapshot.v1beta1.MsgService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the snapshot Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Axelar_Snapshot_V1beta1_MsgServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? { get }

  func makeRegisterProxyCall(
    _ request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse>

  func makeDeactivateProxyCall(
    _ request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Axelar_Snapshot_V1beta1_MsgServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRegisterProxyCall(
    _ request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse> {
    return self.makeAsyncUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.registerProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterProxyInterceptors() ?? []
    )
  }

  internal func makeDeactivateProxyCall(
    _ request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse> {
    return self.makeAsyncUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.deactivateProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateProxyInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Axelar_Snapshot_V1beta1_MsgServiceAsyncClientProtocol {
  internal func registerProxy(
    _ request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Axelar_Snapshot_V1beta1_RegisterProxyResponse {
    return try await self.performAsyncUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.registerProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterProxyInterceptors() ?? []
    )
  }

  internal func deactivateProxy(
    _ request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Axelar_Snapshot_V1beta1_DeactivateProxyResponse {
    return try await self.performAsyncUnaryCall(
      path: Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.deactivateProxy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeactivateProxyInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Axelar_Snapshot_V1beta1_MsgServiceAsyncClient: Axelar_Snapshot_V1beta1_MsgServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Axelar_Snapshot_V1beta1_MsgServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'registerProxy'.
  func makeRegisterProxyInterceptors() -> [ClientInterceptor<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse>]

  /// - Returns: Interceptors to use when invoking 'deactivateProxy'.
  func makeDeactivateProxyInterceptors() -> [ClientInterceptor<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse>]
}

internal enum Axelar_Snapshot_V1beta1_MsgServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "MsgService",
    fullName: "axelar.snapshot.v1beta1.MsgService",
    methods: [
      Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.registerProxy,
      Axelar_Snapshot_V1beta1_MsgServiceClientMetadata.Methods.deactivateProxy,
    ]
  )

  internal enum Methods {
    internal static let registerProxy = GRPCMethodDescriptor(
      name: "RegisterProxy",
      path: "/axelar.snapshot.v1beta1.MsgService/RegisterProxy",
      type: GRPCCallType.unary
    )

    internal static let deactivateProxy = GRPCMethodDescriptor(
      name: "DeactivateProxy",
      path: "/axelar.snapshot.v1beta1.MsgService/DeactivateProxy",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the snapshot Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Axelar_Snapshot_V1beta1_MsgServiceProvider: CallHandlerProvider {
  var interceptors: Axelar_Snapshot_V1beta1_MsgServiceServerInterceptorFactoryProtocol? { get }

  /// RegisterProxy defines a method for registering a proxy account that can act
  /// in a validator account's stead.
  func registerProxy(request: Axelar_Snapshot_V1beta1_RegisterProxyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Snapshot_V1beta1_RegisterProxyResponse>

  /// DeactivateProxy defines a method for deregistering a proxy account.
  func deactivateProxy(request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Snapshot_V1beta1_DeactivateProxyResponse>
}

extension Axelar_Snapshot_V1beta1_MsgServiceProvider {
  internal var serviceName: Substring {
    return Axelar_Snapshot_V1beta1_MsgServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterProxy":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Snapshot_V1beta1_RegisterProxyRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Snapshot_V1beta1_RegisterProxyResponse>(),
        interceptors: self.interceptors?.makeRegisterProxyInterceptors() ?? [],
        userFunction: self.registerProxy(request:context:)
      )

    case "DeactivateProxy":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Snapshot_V1beta1_DeactivateProxyRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Snapshot_V1beta1_DeactivateProxyResponse>(),
        interceptors: self.interceptors?.makeDeactivateProxyInterceptors() ?? [],
        userFunction: self.deactivateProxy(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the snapshot Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Axelar_Snapshot_V1beta1_MsgServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Axelar_Snapshot_V1beta1_MsgServiceServerInterceptorFactoryProtocol? { get }

  /// RegisterProxy defines a method for registering a proxy account that can act
  /// in a validator account's stead.
  @Sendable func registerProxy(
    request: Axelar_Snapshot_V1beta1_RegisterProxyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Axelar_Snapshot_V1beta1_RegisterProxyResponse

  /// DeactivateProxy defines a method for deregistering a proxy account.
  @Sendable func deactivateProxy(
    request: Axelar_Snapshot_V1beta1_DeactivateProxyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Axelar_Snapshot_V1beta1_DeactivateProxyResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Axelar_Snapshot_V1beta1_MsgServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Axelar_Snapshot_V1beta1_MsgServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Axelar_Snapshot_V1beta1_MsgServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Axelar_Snapshot_V1beta1_MsgServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterProxy":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Snapshot_V1beta1_RegisterProxyRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Snapshot_V1beta1_RegisterProxyResponse>(),
        interceptors: self.interceptors?.makeRegisterProxyInterceptors() ?? [],
        wrapping: self.registerProxy(request:context:)
      )

    case "DeactivateProxy":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Snapshot_V1beta1_DeactivateProxyRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Snapshot_V1beta1_DeactivateProxyResponse>(),
        interceptors: self.interceptors?.makeDeactivateProxyInterceptors() ?? [],
        wrapping: self.deactivateProxy(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Axelar_Snapshot_V1beta1_MsgServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'registerProxy'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterProxyInterceptors() -> [ServerInterceptor<Axelar_Snapshot_V1beta1_RegisterProxyRequest, Axelar_Snapshot_V1beta1_RegisterProxyResponse>]

  /// - Returns: Interceptors to use when handling 'deactivateProxy'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeactivateProxyInterceptors() -> [ServerInterceptor<Axelar_Snapshot_V1beta1_DeactivateProxyRequest, Axelar_Snapshot_V1beta1_DeactivateProxyResponse>]
}

internal enum Axelar_Snapshot_V1beta1_MsgServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "MsgService",
    fullName: "axelar.snapshot.v1beta1.MsgService",
    methods: [
      Axelar_Snapshot_V1beta1_MsgServiceServerMetadata.Methods.registerProxy,
      Axelar_Snapshot_V1beta1_MsgServiceServerMetadata.Methods.deactivateProxy,
    ]
  )

  internal enum Methods {
    internal static let registerProxy = GRPCMethodDescriptor(
      name: "RegisterProxy",
      path: "/axelar.snapshot.v1beta1.MsgService/RegisterProxy",
      type: GRPCCallType.unary
    )

    internal static let deactivateProxy = GRPCMethodDescriptor(
      name: "DeactivateProxy",
      path: "/axelar.snapshot.v1beta1.MsgService/DeactivateProxy",
      type: GRPCCallType.unary
    )
  }
}
