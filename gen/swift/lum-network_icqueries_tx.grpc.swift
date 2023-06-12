//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: lum-network/icqueries/tx.proto
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


/// Msg defines the icqueries Msg service.
///
/// Usage: instantiate `Lum_Network_Icqueries_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Lum_Network_Icqueries_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? { get }

  func submitQueryResponse(
    _ request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>
}

extension Lum_Network_Icqueries_MsgClientProtocol {
  internal var serviceName: String {
    return "lum.network.icqueries.Msg"
  }

  /// SubmitQueryResponse defines a method for submit query responses.
  ///
  /// - Parameters:
  ///   - request: Request to send to SubmitQueryResponse.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func submitQueryResponse(
    _ request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Icqueries_MsgClientMetadata.Methods.submitQueryResponse.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitQueryResponseInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Lum_Network_Icqueries_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Lum_Network_Icqueries_MsgNIOClient")
internal final class Lum_Network_Icqueries_MsgClient: Lum_Network_Icqueries_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the lum.network.icqueries.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Lum_Network_Icqueries_MsgNIOClient: Lum_Network_Icqueries_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the lum.network.icqueries.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the icqueries Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Icqueries_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? { get }

  func makeSubmitQueryResponseCall(
    _ request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Icqueries_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSubmitQueryResponseCall(
    _ request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Icqueries_MsgClientMetadata.Methods.submitQueryResponse.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitQueryResponseInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_MsgAsyncClientProtocol {
  internal func submitQueryResponse(
    _ request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Icqueries_MsgSubmitQueryResponseResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Icqueries_MsgClientMetadata.Methods.submitQueryResponse.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitQueryResponseInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Lum_Network_Icqueries_MsgAsyncClient: Lum_Network_Icqueries_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Lum_Network_Icqueries_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'submitQueryResponse'.
  func makeSubmitQueryResponseInterceptors() -> [ClientInterceptor<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>]
}

internal enum Lum_Network_Icqueries_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "lum.network.icqueries.Msg",
    methods: [
      Lum_Network_Icqueries_MsgClientMetadata.Methods.submitQueryResponse,
    ]
  )

  internal enum Methods {
    internal static let submitQueryResponse = GRPCMethodDescriptor(
      name: "SubmitQueryResponse",
      path: "/lum.network.icqueries.Msg/SubmitQueryResponse",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the icqueries Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Lum_Network_Icqueries_MsgProvider: CallHandlerProvider {
  var interceptors: Lum_Network_Icqueries_MsgServerInterceptorFactoryProtocol? { get }

  /// SubmitQueryResponse defines a method for submit query responses.
  func submitQueryResponse(request: Lum_Network_Icqueries_MsgSubmitQueryResponse, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>
}

extension Lum_Network_Icqueries_MsgProvider {
  internal var serviceName: Substring {
    return Lum_Network_Icqueries_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SubmitQueryResponse":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_MsgSubmitQueryResponse>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>(),
        interceptors: self.interceptors?.makeSubmitQueryResponseInterceptors() ?? [],
        userFunction: self.submitQueryResponse(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the icqueries Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Icqueries_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Icqueries_MsgServerInterceptorFactoryProtocol? { get }

  /// SubmitQueryResponse defines a method for submit query responses.
  @Sendable func submitQueryResponse(
    request: Lum_Network_Icqueries_MsgSubmitQueryResponse,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Icqueries_MsgSubmitQueryResponseResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Icqueries_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Icqueries_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Lum_Network_Icqueries_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Lum_Network_Icqueries_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SubmitQueryResponse":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Icqueries_MsgSubmitQueryResponse>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>(),
        interceptors: self.interceptors?.makeSubmitQueryResponseInterceptors() ?? [],
        wrapping: self.submitQueryResponse(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Lum_Network_Icqueries_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'submitQueryResponse'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSubmitQueryResponseInterceptors() -> [ServerInterceptor<Lum_Network_Icqueries_MsgSubmitQueryResponse, Lum_Network_Icqueries_MsgSubmitQueryResponseResponse>]
}

internal enum Lum_Network_Icqueries_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "lum.network.icqueries.Msg",
    methods: [
      Lum_Network_Icqueries_MsgServerMetadata.Methods.submitQueryResponse,
    ]
  )

  internal enum Methods {
    internal static let submitQueryResponse = GRPCMethodDescriptor(
      name: "SubmitQueryResponse",
      path: "/lum.network.icqueries.Msg/SubmitQueryResponse",
      type: GRPCCallType.unary
    )
  }
}
