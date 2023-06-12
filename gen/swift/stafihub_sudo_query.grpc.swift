//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/sudo/query.proto
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
/// Usage: instantiate `Stafihub_Stafihub_Sudo_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Sudo_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? { get }

  func admin(
    _ request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse>
}

extension Stafihub_Stafihub_Sudo_QueryClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.sudo.Query"
  }

  /// Queries a list of admin items.
  ///
  /// - Parameters:
  ///   - request: Request to send to Admin.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func admin(
    _ request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Sudo_QueryClientMetadata.Methods.admin.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Sudo_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Sudo_QueryNIOClient")
internal final class Stafihub_Stafihub_Sudo_QueryClient: Stafihub_Stafihub_Sudo_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.sudo.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Sudo_QueryNIOClient: Stafihub_Stafihub_Sudo_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.sudo.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Sudo_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? { get }

  func makeAdminCall(
    _ request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Sudo_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Sudo_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAdminCall(
    _ request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Sudo_QueryClientMetadata.Methods.admin.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Sudo_QueryAsyncClientProtocol {
  internal func admin(
    _ request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Sudo_QueryAdminResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Sudo_QueryClientMetadata.Methods.admin.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAdminInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Sudo_QueryAsyncClient: Stafihub_Stafihub_Sudo_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Sudo_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'admin'.
  func makeAdminInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse>]
}

internal enum Stafihub_Stafihub_Sudo_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.sudo.Query",
    methods: [
      Stafihub_Stafihub_Sudo_QueryClientMetadata.Methods.admin,
    ]
  )

  internal enum Methods {
    internal static let admin = GRPCMethodDescriptor(
      name: "Admin",
      path: "/stafihub.stafihub.sudo.Query/Admin",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Sudo_QueryProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Sudo_QueryServerInterceptorFactoryProtocol? { get }

  /// Queries a list of admin items.
  func admin(request: Stafihub_Stafihub_Sudo_QueryAdminRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Sudo_QueryAdminResponse>
}

extension Stafihub_Stafihub_Sudo_QueryProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Sudo_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Admin":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Sudo_QueryAdminRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Sudo_QueryAdminResponse>(),
        interceptors: self.interceptors?.makeAdminInterceptors() ?? [],
        userFunction: self.admin(request:context:)
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
internal protocol Stafihub_Stafihub_Sudo_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Sudo_QueryServerInterceptorFactoryProtocol? { get }

  /// Queries a list of admin items.
  @Sendable func admin(
    request: Stafihub_Stafihub_Sudo_QueryAdminRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Sudo_QueryAdminResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Sudo_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Sudo_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Sudo_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Sudo_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Admin":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Sudo_QueryAdminRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Sudo_QueryAdminResponse>(),
        interceptors: self.interceptors?.makeAdminInterceptors() ?? [],
        wrapping: self.admin(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Sudo_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'admin'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAdminInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Sudo_QueryAdminRequest, Stafihub_Stafihub_Sudo_QueryAdminResponse>]
}

internal enum Stafihub_Stafihub_Sudo_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.sudo.Query",
    methods: [
      Stafihub_Stafihub_Sudo_QueryServerMetadata.Methods.admin,
    ]
  )

  internal enum Methods {
    internal static let admin = GRPCMethodDescriptor(
      name: "Admin",
      path: "/stafihub.stafihub.sudo.Query/Admin",
      type: GRPCCallType.unary
    )
  }
}
