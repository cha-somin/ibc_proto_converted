//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: neutron/feerefunder/tx.proto
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
/// Usage: instantiate `Neutron_Feerefunder_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Neutron_Feerefunder_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? { get }

  func updateParams(
    _ request: Neutron_Feerefunder_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse>
}

extension Neutron_Feerefunder_MsgClientProtocol {
  internal var serviceName: String {
    return "neutron.feerefunder.Msg"
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Neutron_Feerefunder_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Neutron_Feerefunder_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Neutron_Feerefunder_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Neutron_Feerefunder_MsgNIOClient")
internal final class Neutron_Feerefunder_MsgClient: Neutron_Feerefunder_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the neutron.feerefunder.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Neutron_Feerefunder_MsgNIOClient: Neutron_Feerefunder_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the neutron.feerefunder.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Neutron_Feerefunder_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? { get }

  func makeUpdateParamsCall(
    _ request: Neutron_Feerefunder_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Feerefunder_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Neutron_Feerefunder_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeUpdateParamsCall(
    _ request: Neutron_Feerefunder_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Feerefunder_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Feerefunder_MsgAsyncClientProtocol {
  internal func updateParams(
    _ request: Neutron_Feerefunder_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Feerefunder_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Feerefunder_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Neutron_Feerefunder_MsgAsyncClient: Neutron_Feerefunder_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Neutron_Feerefunder_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse>]
}

internal enum Neutron_Feerefunder_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "neutron.feerefunder.Msg",
    methods: [
      Neutron_Feerefunder_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/neutron.feerefunder.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Neutron_Feerefunder_MsgProvider: CallHandlerProvider {
  var interceptors: Neutron_Feerefunder_MsgServerInterceptorFactoryProtocol? { get }

  /// this line is used by starport scaffolding # proto/tx/rpc
  func updateParams(request: Neutron_Feerefunder_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Feerefunder_MsgUpdateParamsResponse>
}

extension Neutron_Feerefunder_MsgProvider {
  internal var serviceName: Substring {
    return Neutron_Feerefunder_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Feerefunder_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Neutron_Feerefunder_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        userFunction: self.updateParams(request:context:)
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
internal protocol Neutron_Feerefunder_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Neutron_Feerefunder_MsgServerInterceptorFactoryProtocol? { get }

  /// this line is used by starport scaffolding # proto/tx/rpc
  @Sendable func updateParams(
    request: Neutron_Feerefunder_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Feerefunder_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Feerefunder_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Neutron_Feerefunder_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Neutron_Feerefunder_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Neutron_Feerefunder_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Feerefunder_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Neutron_Feerefunder_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Neutron_Feerefunder_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Neutron_Feerefunder_MsgUpdateParams, Neutron_Feerefunder_MsgUpdateParamsResponse>]
}

internal enum Neutron_Feerefunder_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "neutron.feerefunder.Msg",
    methods: [
      Neutron_Feerefunder_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/neutron.feerefunder.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
