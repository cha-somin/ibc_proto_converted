//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stargaze/globalfee/v1/tx.proto
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


/// Msg defines the alloc Msg service.
///
/// Usage: instantiate `Publicawesome_Stargaze_Globalfee_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? { get }

  func setCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    callOptions: CallOptions?
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>

  func removeCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    callOptions: CallOptions?
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>

  func setContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    callOptions: CallOptions?
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>

  func removeContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    callOptions: CallOptions?
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>
}

extension Publicawesome_Stargaze_Globalfee_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "publicawesome.stargaze.globalfee.v1.Msg"
  }

  /// Unary call to SetCodeAuthorization
  ///
  /// - Parameters:
  ///   - request: Request to send to SetCodeAuthorization.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse> {
    return self.makeUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetCodeAuthorizationInterceptors() ?? []
    )
  }

  /// Unary call to RemoveCodeAuthorization
  ///
  /// - Parameters:
  ///   - request: Request to send to RemoveCodeAuthorization.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func removeCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse> {
    return self.makeUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveCodeAuthorizationInterceptors() ?? []
    )
  }

  /// Unary call to SetContractAuthorization
  ///
  /// - Parameters:
  ///   - request: Request to send to SetContractAuthorization.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse> {
    return self.makeUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractAuthorizationInterceptors() ?? []
    )
  }

  /// Unary call to RemoveContractAuthorization
  ///
  /// - Parameters:
  ///   - request: Request to send to RemoveContractAuthorization.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func removeContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse> {
    return self.makeUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveContractAuthorizationInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Publicawesome_Stargaze_Globalfee_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Publicawesome_Stargaze_Globalfee_V1_MsgNIOClient")
internal final class Publicawesome_Stargaze_Globalfee_V1_MsgClient: Publicawesome_Stargaze_Globalfee_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the publicawesome.stargaze.globalfee.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Publicawesome_Stargaze_Globalfee_V1_MsgNIOClient: Publicawesome_Stargaze_Globalfee_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the publicawesome.stargaze.globalfee.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the alloc Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetCodeAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>

  func makeRemoveCodeAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>

  func makeSetContractAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>

  func makeRemoveContractAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Publicawesome_Stargaze_Globalfee_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetCodeAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse> {
    return self.makeAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetCodeAuthorizationInterceptors() ?? []
    )
  }

  internal func makeRemoveCodeAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse> {
    return self.makeAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveCodeAuthorizationInterceptors() ?? []
    )
  }

  internal func makeSetContractAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse> {
    return self.makeAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractAuthorizationInterceptors() ?? []
    )
  }

  internal func makeRemoveContractAuthorizationCall(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse> {
    return self.makeAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveContractAuthorizationInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Publicawesome_Stargaze_Globalfee_V1_MsgAsyncClientProtocol {
  internal func setCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    callOptions: CallOptions? = nil
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse {
    return try await self.performAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetCodeAuthorizationInterceptors() ?? []
    )
  }

  internal func removeCodeAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    callOptions: CallOptions? = nil
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse {
    return try await self.performAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeCodeAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveCodeAuthorizationInterceptors() ?? []
    )
  }

  internal func setContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    callOptions: CallOptions? = nil
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse {
    return try await self.performAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractAuthorizationInterceptors() ?? []
    )
  }

  internal func removeContractAuthorization(
    _ request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    callOptions: CallOptions? = nil
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse {
    return try await self.performAsyncUnaryCall(
      path: Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeContractAuthorization.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveContractAuthorizationInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Publicawesome_Stargaze_Globalfee_V1_MsgAsyncClient: Publicawesome_Stargaze_Globalfee_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setCodeAuthorization'.
  func makeSetCodeAuthorizationInterceptors() -> [ClientInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>]

  /// - Returns: Interceptors to use when invoking 'removeCodeAuthorization'.
  func makeRemoveCodeAuthorizationInterceptors() -> [ClientInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>]

  /// - Returns: Interceptors to use when invoking 'setContractAuthorization'.
  func makeSetContractAuthorizationInterceptors() -> [ClientInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>]

  /// - Returns: Interceptors to use when invoking 'removeContractAuthorization'.
  func makeRemoveContractAuthorizationInterceptors() -> [ClientInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>]
}

internal enum Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "publicawesome.stargaze.globalfee.v1.Msg",
    methods: [
      Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setCodeAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeCodeAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.setContractAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgClientMetadata.Methods.removeContractAuthorization,
    ]
  )

  internal enum Methods {
    internal static let setCodeAuthorization = GRPCMethodDescriptor(
      name: "SetCodeAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/SetCodeAuthorization",
      type: GRPCCallType.unary
    )

    internal static let removeCodeAuthorization = GRPCMethodDescriptor(
      name: "RemoveCodeAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/RemoveCodeAuthorization",
      type: GRPCCallType.unary
    )

    internal static let setContractAuthorization = GRPCMethodDescriptor(
      name: "SetContractAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/SetContractAuthorization",
      type: GRPCCallType.unary
    )

    internal static let removeContractAuthorization = GRPCMethodDescriptor(
      name: "RemoveContractAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/RemoveContractAuthorization",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the alloc Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgServerInterceptorFactoryProtocol? { get }

  func setCodeAuthorization(request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, context: StatusOnlyCallContext) -> EventLoopFuture<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>

  func removeCodeAuthorization(request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, context: StatusOnlyCallContext) -> EventLoopFuture<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>

  func setContractAuthorization(request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, context: StatusOnlyCallContext) -> EventLoopFuture<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>

  func removeContractAuthorization(request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, context: StatusOnlyCallContext) -> EventLoopFuture<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>
}

extension Publicawesome_Stargaze_Globalfee_V1_MsgProvider {
  internal var serviceName: Substring {
    return Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetCodeAuthorization":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>(),
        interceptors: self.interceptors?.makeSetCodeAuthorizationInterceptors() ?? [],
        userFunction: self.setCodeAuthorization(request:context:)
      )

    case "RemoveCodeAuthorization":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>(),
        interceptors: self.interceptors?.makeRemoveCodeAuthorizationInterceptors() ?? [],
        userFunction: self.removeCodeAuthorization(request:context:)
      )

    case "SetContractAuthorization":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>(),
        interceptors: self.interceptors?.makeSetContractAuthorizationInterceptors() ?? [],
        userFunction: self.setContractAuthorization(request:context:)
      )

    case "RemoveContractAuthorization":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>(),
        interceptors: self.interceptors?.makeRemoveContractAuthorizationInterceptors() ?? [],
        userFunction: self.removeContractAuthorization(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the alloc Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func setCodeAuthorization(
    request: Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization,
    context: GRPCAsyncServerCallContext
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse

  @Sendable func removeCodeAuthorization(
    request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization,
    context: GRPCAsyncServerCallContext
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse

  @Sendable func setContractAuthorization(
    request: Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization,
    context: GRPCAsyncServerCallContext
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse

  @Sendable func removeContractAuthorization(
    request: Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization,
    context: GRPCAsyncServerCallContext
  ) async throws -> Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Publicawesome_Stargaze_Globalfee_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Publicawesome_Stargaze_Globalfee_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetCodeAuthorization":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>(),
        interceptors: self.interceptors?.makeSetCodeAuthorizationInterceptors() ?? [],
        wrapping: self.setCodeAuthorization(request:context:)
      )

    case "RemoveCodeAuthorization":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>(),
        interceptors: self.interceptors?.makeRemoveCodeAuthorizationInterceptors() ?? [],
        wrapping: self.removeCodeAuthorization(request:context:)
      )

    case "SetContractAuthorization":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>(),
        interceptors: self.interceptors?.makeSetContractAuthorizationInterceptors() ?? [],
        wrapping: self.setContractAuthorization(request:context:)
      )

    case "RemoveContractAuthorization":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>(),
        interceptors: self.interceptors?.makeRemoveContractAuthorizationInterceptors() ?? [],
        wrapping: self.removeContractAuthorization(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Publicawesome_Stargaze_Globalfee_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setCodeAuthorization'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetCodeAuthorizationInterceptors() -> [ServerInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetCodeAuthorizationResponse>]

  /// - Returns: Interceptors to use when handling 'removeCodeAuthorization'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRemoveCodeAuthorizationInterceptors() -> [ServerInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveCodeAuthorizationResponse>]

  /// - Returns: Interceptors to use when handling 'setContractAuthorization'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetContractAuthorizationInterceptors() -> [ServerInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgSetContractAuthorizationResponse>]

  /// - Returns: Interceptors to use when handling 'removeContractAuthorization'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRemoveContractAuthorizationInterceptors() -> [ServerInterceptor<Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorization, Publicawesome_Stargaze_Globalfee_V1_MsgRemoveContractAuthorizationResponse>]
}

internal enum Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "publicawesome.stargaze.globalfee.v1.Msg",
    methods: [
      Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.Methods.setCodeAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.Methods.removeCodeAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.Methods.setContractAuthorization,
      Publicawesome_Stargaze_Globalfee_V1_MsgServerMetadata.Methods.removeContractAuthorization,
    ]
  )

  internal enum Methods {
    internal static let setCodeAuthorization = GRPCMethodDescriptor(
      name: "SetCodeAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/SetCodeAuthorization",
      type: GRPCCallType.unary
    )

    internal static let removeCodeAuthorization = GRPCMethodDescriptor(
      name: "RemoveCodeAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/RemoveCodeAuthorization",
      type: GRPCCallType.unary
    )

    internal static let setContractAuthorization = GRPCMethodDescriptor(
      name: "SetContractAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/SetContractAuthorization",
      type: GRPCCallType.unary
    )

    internal static let removeContractAuthorization = GRPCMethodDescriptor(
      name: "RemoveContractAuthorization",
      path: "/publicawesome.stargaze.globalfee.v1.Msg/RemoveContractAuthorization",
      type: GRPCCallType.unary
    )
  }
}
