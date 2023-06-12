//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kyve/global/v1beta1/tx.proto
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
/// Usage: instantiate `Kyve_Global_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kyve_Global_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func updateParams(
    _ request: Kyve_Global_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse>
}

extension Kyve_Global_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kyve.global.v1beta1.Msg"
  }

  /// UpdateParams defines a governance operation for updating the x/global
  /// module parameters. The authority is hard-coded to the x/gov module
  /// account.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Kyve_Global_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Kyve_Global_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kyve_Global_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kyve_Global_V1beta1_MsgNIOClient")
internal final class Kyve_Global_V1beta1_MsgClient: Kyve_Global_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kyve.global.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kyve_Global_V1beta1_MsgNIOClient: Kyve_Global_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kyve.global.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kyve_Global_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeUpdateParamsCall(
    _ request: Kyve_Global_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Global_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Global_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeUpdateParamsCall(
    _ request: Kyve_Global_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Global_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Global_V1beta1_MsgAsyncClientProtocol {
  internal func updateParams(
    _ request: Kyve_Global_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Global_V1beta1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Global_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kyve_Global_V1beta1_MsgAsyncClient: Kyve_Global_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kyve_Global_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse>]
}

internal enum Kyve_Global_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kyve.global.v1beta1.Msg",
    methods: [
      Kyve_Global_V1beta1_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/kyve.global.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kyve_Global_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kyve_Global_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// UpdateParams defines a governance operation for updating the x/global
  /// module parameters. The authority is hard-coded to the x/gov module
  /// account.
  func updateParams(request: Kyve_Global_V1beta1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Global_V1beta1_MsgUpdateParamsResponse>
}

extension Kyve_Global_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Kyve_Global_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Kyve_Global_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Kyve_Global_V1beta1_MsgUpdateParamsResponse>(),
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
internal protocol Kyve_Global_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Global_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// UpdateParams defines a governance operation for updating the x/global
  /// module parameters. The authority is hard-coded to the x/gov module
  /// account.
  @Sendable func updateParams(
    request: Kyve_Global_V1beta1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Global_V1beta1_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Global_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Global_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kyve_Global_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kyve_Global_V1beta1_MsgServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Kyve_Global_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Kyve_Global_V1beta1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kyve_Global_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Kyve_Global_V1beta1_MsgUpdateParams, Kyve_Global_V1beta1_MsgUpdateParamsResponse>]
}

internal enum Kyve_Global_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kyve.global.v1beta1.Msg",
    methods: [
      Kyve_Global_V1beta1_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/kyve.global.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
