//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cudos/admin/tx.proto
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


/// Msg defines the Msg service.
///
/// Usage: instantiate `Cudosnode_Cudosnode_Pocbasecosmos_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? { get }

  func adminSpendCommunityPool(
    _ request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>
}

extension Cudosnode_Cudosnode_Pocbasecosmos_MsgClientProtocol {
  internal var serviceName: String {
    return "cudosnode.cudosnode.pocbasecosmos.Msg"
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to AdminSpendCommunityPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func adminSpendCommunityPool(
    _ request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse> {
    return self.makeUnaryCall(
      path: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata.Methods.adminSpendCommunityPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminSpendCommunityPoolInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Cudosnode_Cudosnode_Pocbasecosmos_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cudosnode_Cudosnode_Pocbasecosmos_MsgNIOClient")
internal final class Cudosnode_Cudosnode_Pocbasecosmos_MsgClient: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cudosnode.cudosnode.pocbasecosmos.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cudosnode_Cudosnode_Pocbasecosmos_MsgNIOClient: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the cudosnode.cudosnode.pocbasecosmos.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? { get }

  func makeAdminSpendCommunityPoolCall(
    _ request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAdminSpendCommunityPoolCall(
    _ request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse> {
    return self.makeAsyncUnaryCall(
      path: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata.Methods.adminSpendCommunityPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminSpendCommunityPoolInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncClientProtocol {
  internal func adminSpendCommunityPool(
    _ request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    callOptions: CallOptions? = nil
  ) async throws -> Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse {
    return try await self.performAsyncUnaryCall(
      path: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata.Methods.adminSpendCommunityPool.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminSpendCommunityPoolInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncClient: Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'adminSpendCommunityPool'.
  func makeAdminSpendCommunityPoolInterceptors() -> [ClientInterceptor<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>]
}

internal enum Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "cudosnode.cudosnode.pocbasecosmos.Msg",
    methods: [
      Cudosnode_Cudosnode_Pocbasecosmos_MsgClientMetadata.Methods.adminSpendCommunityPool,
    ]
  )

  internal enum Methods {
    internal static let adminSpendCommunityPool = GRPCMethodDescriptor(
      name: "AdminSpendCommunityPool",
      path: "/cudosnode.cudosnode.pocbasecosmos.Msg/AdminSpendCommunityPool",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgProvider: CallHandlerProvider {
  var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgServerInterceptorFactoryProtocol? { get }

  /// this line is used by starport scaffolding # proto/tx/rpc
  func adminSpendCommunityPool(request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, context: StatusOnlyCallContext) -> EventLoopFuture<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>
}

extension Cudosnode_Cudosnode_Pocbasecosmos_MsgProvider {
  internal var serviceName: Substring {
    return Cudosnode_Cudosnode_Pocbasecosmos_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AdminSpendCommunityPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool>(),
        responseSerializer: ProtobufSerializer<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>(),
        interceptors: self.interceptors?.makeAdminSpendCommunityPoolInterceptors() ?? [],
        userFunction: self.adminSpendCommunityPool(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgServerInterceptorFactoryProtocol? { get }

  /// this line is used by starport scaffolding # proto/tx/rpc
  @Sendable func adminSpendCommunityPool(
    request: Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudosnode_Cudosnode_Pocbasecosmos_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cudosnode_Cudosnode_Pocbasecosmos_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cudosnode_Cudosnode_Pocbasecosmos_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cudosnode_Cudosnode_Pocbasecosmos_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AdminSpendCommunityPool":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool>(),
        responseSerializer: ProtobufSerializer<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>(),
        interceptors: self.interceptors?.makeAdminSpendCommunityPoolInterceptors() ?? [],
        wrapping: self.adminSpendCommunityPool(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cudosnode_Cudosnode_Pocbasecosmos_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'adminSpendCommunityPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAdminSpendCommunityPoolInterceptors() -> [ServerInterceptor<Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendCommunityPool, Cudosnode_Cudosnode_Pocbasecosmos_MsgAdminSpendResponse>]
}

internal enum Cudosnode_Cudosnode_Pocbasecosmos_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "cudosnode.cudosnode.pocbasecosmos.Msg",
    methods: [
      Cudosnode_Cudosnode_Pocbasecosmos_MsgServerMetadata.Methods.adminSpendCommunityPool,
    ]
  )

  internal enum Methods {
    internal static let adminSpendCommunityPool = GRPCMethodDescriptor(
      name: "AdminSpendCommunityPool",
      path: "/cudosnode.cudosnode.pocbasecosmos.Msg/AdminSpendCommunityPool",
      type: GRPCCallType.unary
    )
  }
}
