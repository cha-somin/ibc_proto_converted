//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: babylon/epoching/v1/tx.proto
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
/// Usage: instantiate `Babylon_Epoching_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Babylon_Epoching_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? { get }

  func wrappedDelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedDelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse>

  func wrappedUndelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse>

  func wrappedBeginRedelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>

  func wrappedCancelUnbondingDelegation(
    _ request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>

  func updateParams(
    _ request: Babylon_Epoching_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse>
}

extension Babylon_Epoching_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "babylon.epoching.v1.Msg"
  }

  /// WrappedDelegate defines a method for performing a delegation of coins from
  /// a delegator to a validator.
  ///
  /// - Parameters:
  ///   - request: Request to send to WrappedDelegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func wrappedDelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedDelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse> {
    return self.makeUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedDelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedDelegateInterceptors() ?? []
    )
  }

  /// WrappedUndelegate defines a method for performing an undelegation from a
  /// delegate and a validator.
  ///
  /// - Parameters:
  ///   - request: Request to send to WrappedUndelegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func wrappedUndelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse> {
    return self.makeUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedUndelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedUndelegateInterceptors() ?? []
    )
  }

  /// WrappedBeginRedelegate defines a method for performing a redelegation of
  /// coins from a delegator and source validator to a destination validator.
  ///
  /// - Parameters:
  ///   - request: Request to send to WrappedBeginRedelegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func wrappedBeginRedelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse> {
    return self.makeUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedBeginRedelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedBeginRedelegateInterceptors() ?? []
    )
  }

  /// WrappedCancelUnbondingDelegation defines a method for cancelling unbonding of
  /// coins from a delegator and source validator to a destination validator.
  ///
  /// - Parameters:
  ///   - request: Request to send to WrappedCancelUnbondingDelegation.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func wrappedCancelUnbondingDelegation(
    _ request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse> {
    return self.makeUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedCancelUnbondingDelegation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedCancelUnbondingDelegationInterceptors() ?? []
    )
  }

  /// UpdateParams defines a method for updating epoching module parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Babylon_Epoching_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Babylon_Epoching_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Babylon_Epoching_V1_MsgNIOClient")
internal final class Babylon_Epoching_V1_MsgClient: Babylon_Epoching_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the babylon.epoching.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Babylon_Epoching_V1_MsgNIOClient: Babylon_Epoching_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the babylon.epoching.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Babylon_Epoching_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeWrappedDelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedDelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse>

  func makeWrappedUndelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse>

  func makeWrappedBeginRedelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>

  func makeWrappedCancelUnbondingDelegationCall(
    _ request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>

  func makeUpdateParamsCall(
    _ request: Babylon_Epoching_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Epoching_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Epoching_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeWrappedDelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedDelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedDelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedDelegateInterceptors() ?? []
    )
  }

  internal func makeWrappedUndelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedUndelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedUndelegateInterceptors() ?? []
    )
  }

  internal func makeWrappedBeginRedelegateCall(
    _ request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedBeginRedelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedBeginRedelegateInterceptors() ?? []
    )
  }

  internal func makeWrappedCancelUnbondingDelegationCall(
    _ request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedCancelUnbondingDelegation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedCancelUnbondingDelegationInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Babylon_Epoching_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Epoching_V1_MsgAsyncClientProtocol {
  internal func wrappedDelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedDelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Epoching_V1_MsgWrappedDelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedDelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedDelegateInterceptors() ?? []
    )
  }

  internal func wrappedUndelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Epoching_V1_MsgWrappedUndelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedUndelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedUndelegateInterceptors() ?? []
    )
  }

  internal func wrappedBeginRedelegate(
    _ request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedBeginRedelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedBeginRedelegateInterceptors() ?? []
    )
  }

  internal func wrappedCancelUnbondingDelegation(
    _ request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedCancelUnbondingDelegation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWrappedCancelUnbondingDelegationInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Babylon_Epoching_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Epoching_V1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Epoching_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Babylon_Epoching_V1_MsgAsyncClient: Babylon_Epoching_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Babylon_Epoching_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'wrappedDelegate'.
  func makeWrappedDelegateInterceptors() -> [ClientInterceptor<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'wrappedUndelegate'.
  func makeWrappedUndelegateInterceptors() -> [ClientInterceptor<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'wrappedBeginRedelegate'.
  func makeWrappedBeginRedelegateInterceptors() -> [ClientInterceptor<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'wrappedCancelUnbondingDelegation'.
  func makeWrappedCancelUnbondingDelegationInterceptors() -> [ClientInterceptor<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse>]
}

internal enum Babylon_Epoching_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "babylon.epoching.v1.Msg",
    methods: [
      Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedDelegate,
      Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedUndelegate,
      Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedBeginRedelegate,
      Babylon_Epoching_V1_MsgClientMetadata.Methods.wrappedCancelUnbondingDelegation,
      Babylon_Epoching_V1_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let wrappedDelegate = GRPCMethodDescriptor(
      name: "WrappedDelegate",
      path: "/babylon.epoching.v1.Msg/WrappedDelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedUndelegate = GRPCMethodDescriptor(
      name: "WrappedUndelegate",
      path: "/babylon.epoching.v1.Msg/WrappedUndelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedBeginRedelegate = GRPCMethodDescriptor(
      name: "WrappedBeginRedelegate",
      path: "/babylon.epoching.v1.Msg/WrappedBeginRedelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedCancelUnbondingDelegation = GRPCMethodDescriptor(
      name: "WrappedCancelUnbondingDelegation",
      path: "/babylon.epoching.v1.Msg/WrappedCancelUnbondingDelegation",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/babylon.epoching.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Babylon_Epoching_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Babylon_Epoching_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// WrappedDelegate defines a method for performing a delegation of coins from
  /// a delegator to a validator.
  func wrappedDelegate(request: Babylon_Epoching_V1_MsgWrappedDelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Epoching_V1_MsgWrappedDelegateResponse>

  /// WrappedUndelegate defines a method for performing an undelegation from a
  /// delegate and a validator.
  func wrappedUndelegate(request: Babylon_Epoching_V1_MsgWrappedUndelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Epoching_V1_MsgWrappedUndelegateResponse>

  /// WrappedBeginRedelegate defines a method for performing a redelegation of
  /// coins from a delegator and source validator to a destination validator.
  func wrappedBeginRedelegate(request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>

  /// WrappedCancelUnbondingDelegation defines a method for cancelling unbonding of
  /// coins from a delegator and source validator to a destination validator.
  func wrappedCancelUnbondingDelegation(request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>

  /// UpdateParams defines a method for updating epoching module parameters.
  func updateParams(request: Babylon_Epoching_V1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Epoching_V1_MsgUpdateParamsResponse>
}

extension Babylon_Epoching_V1_MsgProvider {
  internal var serviceName: Substring {
    return Babylon_Epoching_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "WrappedDelegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedDelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedDelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedDelegateInterceptors() ?? [],
        userFunction: self.wrappedDelegate(request:context:)
      )

    case "WrappedUndelegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedUndelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedUndelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedUndelegateInterceptors() ?? [],
        userFunction: self.wrappedUndelegate(request:context:)
      )

    case "WrappedBeginRedelegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedBeginRedelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedBeginRedelegateInterceptors() ?? [],
        userFunction: self.wrappedBeginRedelegate(request:context:)
      )

    case "WrappedCancelUnbondingDelegation":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>(),
        interceptors: self.interceptors?.makeWrappedCancelUnbondingDelegationInterceptors() ?? [],
        userFunction: self.wrappedCancelUnbondingDelegation(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgUpdateParamsResponse>(),
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
internal protocol Babylon_Epoching_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Epoching_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// WrappedDelegate defines a method for performing a delegation of coins from
  /// a delegator to a validator.
  @Sendable func wrappedDelegate(
    request: Babylon_Epoching_V1_MsgWrappedDelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Epoching_V1_MsgWrappedDelegateResponse

  /// WrappedUndelegate defines a method for performing an undelegation from a
  /// delegate and a validator.
  @Sendable func wrappedUndelegate(
    request: Babylon_Epoching_V1_MsgWrappedUndelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Epoching_V1_MsgWrappedUndelegateResponse

  /// WrappedBeginRedelegate defines a method for performing a redelegation of
  /// coins from a delegator and source validator to a destination validator.
  @Sendable func wrappedBeginRedelegate(
    request: Babylon_Epoching_V1_MsgWrappedBeginRedelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse

  /// WrappedCancelUnbondingDelegation defines a method for cancelling unbonding of
  /// coins from a delegator and source validator to a destination validator.
  @Sendable func wrappedCancelUnbondingDelegation(
    request: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse

  /// UpdateParams defines a method for updating epoching module parameters.
  @Sendable func updateParams(
    request: Babylon_Epoching_V1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Epoching_V1_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Epoching_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Epoching_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Babylon_Epoching_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Babylon_Epoching_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "WrappedDelegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedDelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedDelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedDelegateInterceptors() ?? [],
        wrapping: self.wrappedDelegate(request:context:)
      )

    case "WrappedUndelegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedUndelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedUndelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedUndelegateInterceptors() ?? [],
        wrapping: self.wrappedUndelegate(request:context:)
      )

    case "WrappedBeginRedelegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedBeginRedelegate>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>(),
        interceptors: self.interceptors?.makeWrappedBeginRedelegateInterceptors() ?? [],
        wrapping: self.wrappedBeginRedelegate(request:context:)
      )

    case "WrappedCancelUnbondingDelegation":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>(),
        interceptors: self.interceptors?.makeWrappedCancelUnbondingDelegationInterceptors() ?? [],
        wrapping: self.wrappedCancelUnbondingDelegation(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Epoching_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Babylon_Epoching_V1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Babylon_Epoching_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'wrappedDelegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWrappedDelegateInterceptors() -> [ServerInterceptor<Babylon_Epoching_V1_MsgWrappedDelegate, Babylon_Epoching_V1_MsgWrappedDelegateResponse>]

  /// - Returns: Interceptors to use when handling 'wrappedUndelegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWrappedUndelegateInterceptors() -> [ServerInterceptor<Babylon_Epoching_V1_MsgWrappedUndelegate, Babylon_Epoching_V1_MsgWrappedUndelegateResponse>]

  /// - Returns: Interceptors to use when handling 'wrappedBeginRedelegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWrappedBeginRedelegateInterceptors() -> [ServerInterceptor<Babylon_Epoching_V1_MsgWrappedBeginRedelegate, Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse>]

  /// - Returns: Interceptors to use when handling 'wrappedCancelUnbondingDelegation'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWrappedCancelUnbondingDelegationInterceptors() -> [ServerInterceptor<Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Babylon_Epoching_V1_MsgUpdateParams, Babylon_Epoching_V1_MsgUpdateParamsResponse>]
}

internal enum Babylon_Epoching_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "babylon.epoching.v1.Msg",
    methods: [
      Babylon_Epoching_V1_MsgServerMetadata.Methods.wrappedDelegate,
      Babylon_Epoching_V1_MsgServerMetadata.Methods.wrappedUndelegate,
      Babylon_Epoching_V1_MsgServerMetadata.Methods.wrappedBeginRedelegate,
      Babylon_Epoching_V1_MsgServerMetadata.Methods.wrappedCancelUnbondingDelegation,
      Babylon_Epoching_V1_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let wrappedDelegate = GRPCMethodDescriptor(
      name: "WrappedDelegate",
      path: "/babylon.epoching.v1.Msg/WrappedDelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedUndelegate = GRPCMethodDescriptor(
      name: "WrappedUndelegate",
      path: "/babylon.epoching.v1.Msg/WrappedUndelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedBeginRedelegate = GRPCMethodDescriptor(
      name: "WrappedBeginRedelegate",
      path: "/babylon.epoching.v1.Msg/WrappedBeginRedelegate",
      type: GRPCCallType.unary
    )

    internal static let wrappedCancelUnbondingDelegation = GRPCMethodDescriptor(
      name: "WrappedCancelUnbondingDelegation",
      path: "/babylon.epoching.v1.Msg/WrappedCancelUnbondingDelegation",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/babylon.epoching.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
