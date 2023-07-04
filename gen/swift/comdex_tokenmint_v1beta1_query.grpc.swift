//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: comdex/tokenmint/v1beta1/query.proto
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


/// Usage: instantiate `Comdex_Tokenmint_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Comdex_Tokenmint_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func queryAllTokenMintedForAllApps(
    _ request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>

  func queryTokenMintedByApp(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>

  func queryTokenMintedByAppAndAsset(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>
}

extension Comdex_Tokenmint_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "comdex.tokenmint.v1beta1.Query"
  }

  /// Unary call to QueryAllTokenMintedForAllApps
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryAllTokenMintedForAllApps.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryAllTokenMintedForAllApps(
    _ request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse> {
    return self.makeUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryAllTokenMintedForAllApps.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAllTokenMintedForAllAppsInterceptors() ?? []
    )
  }

  /// Unary call to QueryTokenMintedByApp
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryTokenMintedByApp.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryTokenMintedByApp(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse> {
    return self.makeUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByApp.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppInterceptors() ?? []
    )
  }

  /// Unary call to QueryTokenMintedByAppAndAsset
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryTokenMintedByAppAndAsset.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryTokenMintedByAppAndAsset(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse> {
    return self.makeUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByAppAndAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppAndAssetInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Comdex_Tokenmint_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Comdex_Tokenmint_V1beta1_QueryNIOClient")
internal final class Comdex_Tokenmint_V1beta1_QueryClient: Comdex_Tokenmint_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the comdex.tokenmint.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Comdex_Tokenmint_V1beta1_QueryNIOClient: Comdex_Tokenmint_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the comdex.tokenmint.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Tokenmint_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeQueryAllTokenMintedForAllAppsCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>

  func makeQueryTokenMintedByAppCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>

  func makeQueryTokenMintedByAppAndAssetCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Tokenmint_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Tokenmint_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeQueryAllTokenMintedForAllAppsCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryAllTokenMintedForAllApps.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAllTokenMintedForAllAppsInterceptors() ?? []
    )
  }

  internal func makeQueryTokenMintedByAppCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByApp.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppInterceptors() ?? []
    )
  }

  internal func makeQueryTokenMintedByAppAndAssetCall(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByAppAndAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppAndAssetInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Tokenmint_V1beta1_QueryAsyncClientProtocol {
  internal func queryAllTokenMintedForAllApps(
    _ request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryAllTokenMintedForAllApps.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAllTokenMintedForAllAppsInterceptors() ?? []
    )
  }

  internal func queryTokenMintedByApp(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByApp.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppInterceptors() ?? []
    )
  }

  internal func queryTokenMintedByAppAndAsset(
    _ request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByAppAndAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryTokenMintedByAppAndAssetInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Comdex_Tokenmint_V1beta1_QueryAsyncClient: Comdex_Tokenmint_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Comdex_Tokenmint_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'queryAllTokenMintedForAllApps'.
  func makeQueryAllTokenMintedForAllAppsInterceptors() -> [ClientInterceptor<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>]

  /// - Returns: Interceptors to use when invoking 'queryTokenMintedByApp'.
  func makeQueryTokenMintedByAppInterceptors() -> [ClientInterceptor<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>]

  /// - Returns: Interceptors to use when invoking 'queryTokenMintedByAppAndAsset'.
  func makeQueryTokenMintedByAppAndAssetInterceptors() -> [ClientInterceptor<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>]
}

internal enum Comdex_Tokenmint_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "comdex.tokenmint.v1beta1.Query",
    methods: [
      Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryAllTokenMintedForAllApps,
      Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByApp,
      Comdex_Tokenmint_V1beta1_QueryClientMetadata.Methods.queryTokenMintedByAppAndAsset,
    ]
  )

  internal enum Methods {
    internal static let queryAllTokenMintedForAllApps = GRPCMethodDescriptor(
      name: "QueryAllTokenMintedForAllApps",
      path: "/comdex.tokenmint.v1beta1.Query/QueryAllTokenMintedForAllApps",
      type: GRPCCallType.unary
    )

    internal static let queryTokenMintedByApp = GRPCMethodDescriptor(
      name: "QueryTokenMintedByApp",
      path: "/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByApp",
      type: GRPCCallType.unary
    )

    internal static let queryTokenMintedByAppAndAsset = GRPCMethodDescriptor(
      name: "QueryTokenMintedByAppAndAsset",
      path: "/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByAppAndAsset",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Comdex_Tokenmint_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Comdex_Tokenmint_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  func queryAllTokenMintedForAllApps(request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>

  func queryTokenMintedByApp(request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>

  func queryTokenMintedByAppAndAsset(request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>
}

extension Comdex_Tokenmint_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Comdex_Tokenmint_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "QueryAllTokenMintedForAllApps":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>(),
        interceptors: self.interceptors?.makeQueryAllTokenMintedForAllAppsInterceptors() ?? [],
        userFunction: self.queryAllTokenMintedForAllApps(request:context:)
      )

    case "QueryTokenMintedByApp":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>(),
        interceptors: self.interceptors?.makeQueryTokenMintedByAppInterceptors() ?? [],
        userFunction: self.queryTokenMintedByApp(request:context:)
      )

    case "QueryTokenMintedByAppAndAsset":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>(),
        interceptors: self.interceptors?.makeQueryTokenMintedByAppAndAssetInterceptors() ?? [],
        userFunction: self.queryTokenMintedByAppAndAsset(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Tokenmint_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Tokenmint_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func queryAllTokenMintedForAllApps(
    request: Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse

  @Sendable func queryTokenMintedByApp(
    request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse

  @Sendable func queryTokenMintedByAppAndAsset(
    request: Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Tokenmint_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Tokenmint_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Comdex_Tokenmint_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Comdex_Tokenmint_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "QueryAllTokenMintedForAllApps":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>(),
        interceptors: self.interceptors?.makeQueryAllTokenMintedForAllAppsInterceptors() ?? [],
        wrapping: self.queryAllTokenMintedForAllApps(request:context:)
      )

    case "QueryTokenMintedByApp":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>(),
        interceptors: self.interceptors?.makeQueryTokenMintedByAppInterceptors() ?? [],
        wrapping: self.queryTokenMintedByApp(request:context:)
      )

    case "QueryTokenMintedByAppAndAsset":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>(),
        interceptors: self.interceptors?.makeQueryTokenMintedByAppAndAssetInterceptors() ?? [],
        wrapping: self.queryTokenMintedByAppAndAsset(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Comdex_Tokenmint_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'queryAllTokenMintedForAllApps'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryAllTokenMintedForAllAppsInterceptors() -> [ServerInterceptor<Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsRequest, Comdex_Tokenmint_V1beta1_QueryAllTokenMintedForAllAppsResponse>]

  /// - Returns: Interceptors to use when handling 'queryTokenMintedByApp'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryTokenMintedByAppInterceptors() -> [ServerInterceptor<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppResponse>]

  /// - Returns: Interceptors to use when handling 'queryTokenMintedByAppAndAsset'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryTokenMintedByAppAndAssetInterceptors() -> [ServerInterceptor<Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetRequest, Comdex_Tokenmint_V1beta1_QueryTokenMintedByAppAndAssetResponse>]
}

internal enum Comdex_Tokenmint_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "comdex.tokenmint.v1beta1.Query",
    methods: [
      Comdex_Tokenmint_V1beta1_QueryServerMetadata.Methods.queryAllTokenMintedForAllApps,
      Comdex_Tokenmint_V1beta1_QueryServerMetadata.Methods.queryTokenMintedByApp,
      Comdex_Tokenmint_V1beta1_QueryServerMetadata.Methods.queryTokenMintedByAppAndAsset,
    ]
  )

  internal enum Methods {
    internal static let queryAllTokenMintedForAllApps = GRPCMethodDescriptor(
      name: "QueryAllTokenMintedForAllApps",
      path: "/comdex.tokenmint.v1beta1.Query/QueryAllTokenMintedForAllApps",
      type: GRPCCallType.unary
    )

    internal static let queryTokenMintedByApp = GRPCMethodDescriptor(
      name: "QueryTokenMintedByApp",
      path: "/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByApp",
      type: GRPCCallType.unary
    )

    internal static let queryTokenMintedByAppAndAsset = GRPCMethodDescriptor(
      name: "QueryTokenMintedByAppAndAsset",
      path: "/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByAppAndAsset",
      type: GRPCCallType.unary
    )
  }
}