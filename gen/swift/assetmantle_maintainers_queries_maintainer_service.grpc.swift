//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: assetmantle/maintainers/queries/maintainer/service.proto
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


/// Usage: instantiate `Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClient`, then call methods of this protocol to make API calls.
internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? { get }

  func handle(
    _ request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>
}

extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientProtocol {
  internal var serviceName: String {
    return "assetmantle.modules.maintainers.queries.maintainer.Service"
  }

  /// Unary call to Handle
  ///
  /// - Parameters:
  ///   - request: Request to send to Handle.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func handle(
    _ request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse> {
    return self.makeUnaryCall(
      path: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata.Methods.handle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHandleInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceNIOClient")
internal final class Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClient: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the assetmantle.modules.maintainers.queries.maintainer.Service service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceNIOClient: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the assetmantle.modules.maintainers.queries.maintainer.Service service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? { get }

  func makeHandleCall(
    _ request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeHandleCall(
    _ request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse> {
    return self.makeAsyncUnaryCall(
      path: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata.Methods.handle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHandleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncClientProtocol {
  internal func handle(
    _ request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse {
    return try await self.performAsyncUnaryCall(
      path: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata.Methods.handle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeHandleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncClient: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'handle'.
  func makeHandleInterceptors() -> [ClientInterceptor<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>]
}

internal enum Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Service",
    fullName: "assetmantle.modules.maintainers.queries.maintainer.Service",
    methods: [
      Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceClientMetadata.Methods.handle,
    ]
  )

  internal enum Methods {
    internal static let handle = GRPCMethodDescriptor(
      name: "Handle",
      path: "/assetmantle.modules.maintainers.queries.maintainer.Service/Handle",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceProvider: CallHandlerProvider {
  var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerInterceptorFactoryProtocol? { get }

  func handle(request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>
}

extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceProvider {
  internal var serviceName: Substring {
    return Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Handle":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest>(),
        responseSerializer: ProtobufSerializer<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>(),
        interceptors: self.interceptors?.makeHandleInterceptors() ?? [],
        userFunction: self.handle(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerInterceptorFactoryProtocol? { get }

  @Sendable func handle(
    request: Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Handle":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest>(),
        responseSerializer: ProtobufSerializer<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>(),
        interceptors: self.interceptors?.makeHandleInterceptors() ?? [],
        wrapping: self.handle(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'handle'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeHandleInterceptors() -> [ServerInterceptor<Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryRequest, Assetmantle_Modules_Maintainers_Queries_Maintainer_QueryResponse>]
}

internal enum Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Service",
    fullName: "assetmantle.modules.maintainers.queries.maintainer.Service",
    methods: [
      Assetmantle_Modules_Maintainers_Queries_Maintainer_ServiceServerMetadata.Methods.handle,
    ]
  )

  internal enum Methods {
    internal static let handle = GRPCMethodDescriptor(
      name: "Handle",
      path: "/assetmantle.modules.maintainers.queries.maintainer.Service/Handle",
      type: GRPCCallType.unary
    )
  }
}
