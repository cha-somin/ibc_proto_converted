//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: canto/epochs/v1/query.proto
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
/// Usage: instantiate `Canto_Epochs_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Canto_Epochs_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? { get }

  func epochInfos(
    _ request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse>

  func currentEpoch(
    _ request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse>
}

extension Canto_Epochs_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "canto.epochs.v1.Query"
  }

  /// EpochInfos provide running epochInfos
  ///
  /// - Parameters:
  ///   - request: Request to send to EpochInfos.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func epochInfos(
    _ request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse> {
    return self.makeUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.epochInfos.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochInfosInterceptors() ?? []
    )
  }

  /// CurrentEpoch provide current epoch of specified identifier
  ///
  /// - Parameters:
  ///   - request: Request to send to CurrentEpoch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func currentEpoch(
    _ request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse> {
    return self.makeUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.currentEpoch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCurrentEpochInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Canto_Epochs_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Canto_Epochs_V1_QueryNIOClient")
internal final class Canto_Epochs_V1_QueryClient: Canto_Epochs_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the canto.epochs.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Canto_Epochs_V1_QueryNIOClient: Canto_Epochs_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the canto.epochs.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Canto_Epochs_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeEpochInfosCall(
    _ request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse>

  func makeCurrentEpochCall(
    _ request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Epochs_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Epochs_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeEpochInfosCall(
    _ request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.epochInfos.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochInfosInterceptors() ?? []
    )
  }

  internal func makeCurrentEpochCall(
    _ request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse> {
    return self.makeAsyncUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.currentEpoch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCurrentEpochInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Epochs_V1_QueryAsyncClientProtocol {
  internal func epochInfos(
    _ request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Epochs_V1_QueryEpochsInfoResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.epochInfos.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEpochInfosInterceptors() ?? []
    )
  }

  internal func currentEpoch(
    _ request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Canto_Epochs_V1_QueryCurrentEpochResponse {
    return try await self.performAsyncUnaryCall(
      path: Canto_Epochs_V1_QueryClientMetadata.Methods.currentEpoch.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCurrentEpochInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Canto_Epochs_V1_QueryAsyncClient: Canto_Epochs_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Canto_Epochs_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'epochInfos'.
  func makeEpochInfosInterceptors() -> [ClientInterceptor<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse>]

  /// - Returns: Interceptors to use when invoking 'currentEpoch'.
  func makeCurrentEpochInterceptors() -> [ClientInterceptor<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse>]
}

internal enum Canto_Epochs_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.epochs.v1.Query",
    methods: [
      Canto_Epochs_V1_QueryClientMetadata.Methods.epochInfos,
      Canto_Epochs_V1_QueryClientMetadata.Methods.currentEpoch,
    ]
  )

  internal enum Methods {
    internal static let epochInfos = GRPCMethodDescriptor(
      name: "EpochInfos",
      path: "/canto.epochs.v1.Query/EpochInfos",
      type: GRPCCallType.unary
    )

    internal static let currentEpoch = GRPCMethodDescriptor(
      name: "CurrentEpoch",
      path: "/canto.epochs.v1.Query/CurrentEpoch",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Canto_Epochs_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Canto_Epochs_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// EpochInfos provide running epochInfos
  func epochInfos(request: Canto_Epochs_V1_QueryEpochsInfoRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Epochs_V1_QueryEpochsInfoResponse>

  /// CurrentEpoch provide current epoch of specified identifier
  func currentEpoch(request: Canto_Epochs_V1_QueryCurrentEpochRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Canto_Epochs_V1_QueryCurrentEpochResponse>
}

extension Canto_Epochs_V1_QueryProvider {
  internal var serviceName: Substring {
    return Canto_Epochs_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "EpochInfos":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Epochs_V1_QueryEpochsInfoRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Epochs_V1_QueryEpochsInfoResponse>(),
        interceptors: self.interceptors?.makeEpochInfosInterceptors() ?? [],
        userFunction: self.epochInfos(request:context:)
      )

    case "CurrentEpoch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Epochs_V1_QueryCurrentEpochRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Epochs_V1_QueryCurrentEpochResponse>(),
        interceptors: self.interceptors?.makeCurrentEpochInterceptors() ?? [],
        userFunction: self.currentEpoch(request:context:)
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
internal protocol Canto_Epochs_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Canto_Epochs_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// EpochInfos provide running epochInfos
  @Sendable func epochInfos(
    request: Canto_Epochs_V1_QueryEpochsInfoRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Epochs_V1_QueryEpochsInfoResponse

  /// CurrentEpoch provide current epoch of specified identifier
  @Sendable func currentEpoch(
    request: Canto_Epochs_V1_QueryCurrentEpochRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Canto_Epochs_V1_QueryCurrentEpochResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Canto_Epochs_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Canto_Epochs_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Canto_Epochs_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Canto_Epochs_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "EpochInfos":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Epochs_V1_QueryEpochsInfoRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Epochs_V1_QueryEpochsInfoResponse>(),
        interceptors: self.interceptors?.makeEpochInfosInterceptors() ?? [],
        wrapping: self.epochInfos(request:context:)
      )

    case "CurrentEpoch":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Canto_Epochs_V1_QueryCurrentEpochRequest>(),
        responseSerializer: ProtobufSerializer<Canto_Epochs_V1_QueryCurrentEpochResponse>(),
        interceptors: self.interceptors?.makeCurrentEpochInterceptors() ?? [],
        wrapping: self.currentEpoch(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Canto_Epochs_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'epochInfos'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEpochInfosInterceptors() -> [ServerInterceptor<Canto_Epochs_V1_QueryEpochsInfoRequest, Canto_Epochs_V1_QueryEpochsInfoResponse>]

  /// - Returns: Interceptors to use when handling 'currentEpoch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCurrentEpochInterceptors() -> [ServerInterceptor<Canto_Epochs_V1_QueryCurrentEpochRequest, Canto_Epochs_V1_QueryCurrentEpochResponse>]
}

internal enum Canto_Epochs_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "canto.epochs.v1.Query",
    methods: [
      Canto_Epochs_V1_QueryServerMetadata.Methods.epochInfos,
      Canto_Epochs_V1_QueryServerMetadata.Methods.currentEpoch,
    ]
  )

  internal enum Methods {
    internal static let epochInfos = GRPCMethodDescriptor(
      name: "EpochInfos",
      path: "/canto.epochs.v1.Query/EpochInfos",
      type: GRPCCallType.unary
    )

    internal static let currentEpoch = GRPCMethodDescriptor(
      name: "CurrentEpoch",
      path: "/canto.epochs.v1.Query/CurrentEpoch",
      type: GRPCCallType.unary
    )
  }
}
