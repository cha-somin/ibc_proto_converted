//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kyve/delegation/v1beta1/tx.proto
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
/// Usage: instantiate `Kyve_Delegation_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kyve_Delegation_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func delegate(
    _ request: Kyve_Delegation_V1beta1_MsgDelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse>

  func withdrawRewards(
    _ request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>

  func undelegate(
    _ request: Kyve_Delegation_V1beta1_MsgUndelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse>

  func redelegate(
    _ request: Kyve_Delegation_V1beta1_MsgRedelegate,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse>

  func updateParams(
    _ request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>
}

extension Kyve_Delegation_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kyve.delegation.v1beta1.Msg"
  }

  /// Delegate ...
  ///
  /// - Parameters:
  ///   - request: Request to send to Delegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func delegate(
    _ request: Kyve_Delegation_V1beta1_MsgDelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse> {
    return self.makeUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.delegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateInterceptors() ?? []
    )
  }

  /// Withdraw ...
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawRewards.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawRewards(
    _ request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse> {
    return self.makeUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  /// Undelegate ...
  ///
  /// - Parameters:
  ///   - request: Request to send to Undelegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func undelegate(
    _ request: Kyve_Delegation_V1beta1_MsgUndelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse> {
    return self.makeUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.undelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUndelegateInterceptors() ?? []
    )
  }

  /// Redelegate ...
  ///
  /// - Parameters:
  ///   - request: Request to send to Redelegate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func redelegate(
    _ request: Kyve_Delegation_V1beta1_MsgRedelegate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse> {
    return self.makeUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.redelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRedelegateInterceptors() ?? []
    )
  }

  /// UpdateParams defines a governance operation for updating the x/delegation module
  /// parameters. The authority is hard-coded to the x/gov module account.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kyve_Delegation_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kyve_Delegation_V1beta1_MsgNIOClient")
internal final class Kyve_Delegation_V1beta1_MsgClient: Kyve_Delegation_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kyve.delegation.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kyve_Delegation_V1beta1_MsgNIOClient: Kyve_Delegation_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kyve.delegation.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kyve_Delegation_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeDelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgDelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse>

  func makeWithdrawRewardsCall(
    _ request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>

  func makeUndelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgUndelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse>

  func makeRedelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgRedelegate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse>

  func makeUpdateParamsCall(
    _ request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Delegation_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Delegation_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeDelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgDelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.delegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateInterceptors() ?? []
    )
  }

  internal func makeWithdrawRewardsCall(
    _ request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  internal func makeUndelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgUndelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.undelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUndelegateInterceptors() ?? []
    )
  }

  internal func makeRedelegateCall(
    _ request: Kyve_Delegation_V1beta1_MsgRedelegate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.redelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRedelegateInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Delegation_V1beta1_MsgAsyncClientProtocol {
  internal func delegate(
    _ request: Kyve_Delegation_V1beta1_MsgDelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Delegation_V1beta1_MsgDelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.delegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDelegateInterceptors() ?? []
    )
  }

  internal func withdrawRewards(
    _ request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  internal func undelegate(
    _ request: Kyve_Delegation_V1beta1_MsgUndelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Delegation_V1beta1_MsgUndelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.undelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUndelegateInterceptors() ?? []
    )
  }

  internal func redelegate(
    _ request: Kyve_Delegation_V1beta1_MsgRedelegate,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Delegation_V1beta1_MsgRedelegateResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.redelegate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRedelegateInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Kyve_Delegation_V1beta1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kyve_Delegation_V1beta1_MsgAsyncClient: Kyve_Delegation_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kyve_Delegation_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'delegate'.
  func makeDelegateInterceptors() -> [ClientInterceptor<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawRewards'.
  func makeWithdrawRewardsInterceptors() -> [ClientInterceptor<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>]

  /// - Returns: Interceptors to use when invoking 'undelegate'.
  func makeUndelegateInterceptors() -> [ClientInterceptor<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'redelegate'.
  func makeRedelegateInterceptors() -> [ClientInterceptor<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>]
}

internal enum Kyve_Delegation_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kyve.delegation.v1beta1.Msg",
    methods: [
      Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.delegate,
      Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.withdrawRewards,
      Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.undelegate,
      Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.redelegate,
      Kyve_Delegation_V1beta1_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let delegate = GRPCMethodDescriptor(
      name: "Delegate",
      path: "/kyve.delegation.v1beta1.Msg/Delegate",
      type: GRPCCallType.unary
    )

    internal static let withdrawRewards = GRPCMethodDescriptor(
      name: "WithdrawRewards",
      path: "/kyve.delegation.v1beta1.Msg/WithdrawRewards",
      type: GRPCCallType.unary
    )

    internal static let undelegate = GRPCMethodDescriptor(
      name: "Undelegate",
      path: "/kyve.delegation.v1beta1.Msg/Undelegate",
      type: GRPCCallType.unary
    )

    internal static let redelegate = GRPCMethodDescriptor(
      name: "Redelegate",
      path: "/kyve.delegation.v1beta1.Msg/Redelegate",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/kyve.delegation.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kyve_Delegation_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kyve_Delegation_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Delegate ...
  func delegate(request: Kyve_Delegation_V1beta1_MsgDelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Delegation_V1beta1_MsgDelegateResponse>

  /// Withdraw ...
  func withdrawRewards(request: Kyve_Delegation_V1beta1_MsgWithdrawRewards, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>

  /// Undelegate ...
  func undelegate(request: Kyve_Delegation_V1beta1_MsgUndelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Delegation_V1beta1_MsgUndelegateResponse>

  /// Redelegate ...
  func redelegate(request: Kyve_Delegation_V1beta1_MsgRedelegate, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Delegation_V1beta1_MsgRedelegateResponse>

  /// UpdateParams defines a governance operation for updating the x/delegation module
  /// parameters. The authority is hard-coded to the x/gov module account.
  func updateParams(request: Kyve_Delegation_V1beta1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>
}

extension Kyve_Delegation_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Kyve_Delegation_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Delegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgDelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgDelegateResponse>(),
        interceptors: self.interceptors?.makeDelegateInterceptors() ?? [],
        userFunction: self.delegate(request:context:)
      )

    case "WithdrawRewards":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgWithdrawRewards>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>(),
        interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? [],
        userFunction: self.withdrawRewards(request:context:)
      )

    case "Undelegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgUndelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgUndelegateResponse>(),
        interceptors: self.interceptors?.makeUndelegateInterceptors() ?? [],
        userFunction: self.undelegate(request:context:)
      )

    case "Redelegate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgRedelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgRedelegateResponse>(),
        interceptors: self.interceptors?.makeRedelegateInterceptors() ?? [],
        userFunction: self.redelegate(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>(),
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
internal protocol Kyve_Delegation_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kyve_Delegation_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Delegate ...
  @Sendable func delegate(
    request: Kyve_Delegation_V1beta1_MsgDelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Delegation_V1beta1_MsgDelegateResponse

  /// Withdraw ...
  @Sendable func withdrawRewards(
    request: Kyve_Delegation_V1beta1_MsgWithdrawRewards,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse

  /// Undelegate ...
  @Sendable func undelegate(
    request: Kyve_Delegation_V1beta1_MsgUndelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Delegation_V1beta1_MsgUndelegateResponse

  /// Redelegate ...
  @Sendable func redelegate(
    request: Kyve_Delegation_V1beta1_MsgRedelegate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Delegation_V1beta1_MsgRedelegateResponse

  /// UpdateParams defines a governance operation for updating the x/delegation module
  /// parameters. The authority is hard-coded to the x/gov module account.
  @Sendable func updateParams(
    request: Kyve_Delegation_V1beta1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kyve_Delegation_V1beta1_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kyve_Delegation_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kyve_Delegation_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kyve_Delegation_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kyve_Delegation_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Delegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgDelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgDelegateResponse>(),
        interceptors: self.interceptors?.makeDelegateInterceptors() ?? [],
        wrapping: self.delegate(request:context:)
      )

    case "WithdrawRewards":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgWithdrawRewards>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>(),
        interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? [],
        wrapping: self.withdrawRewards(request:context:)
      )

    case "Undelegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgUndelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgUndelegateResponse>(),
        interceptors: self.interceptors?.makeUndelegateInterceptors() ?? [],
        wrapping: self.undelegate(request:context:)
      )

    case "Redelegate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgRedelegate>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgRedelegateResponse>(),
        interceptors: self.interceptors?.makeRedelegateInterceptors() ?? [],
        wrapping: self.redelegate(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kyve_Delegation_V1beta1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kyve_Delegation_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'delegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDelegateInterceptors() -> [ServerInterceptor<Kyve_Delegation_V1beta1_MsgDelegate, Kyve_Delegation_V1beta1_MsgDelegateResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawRewards'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawRewardsInterceptors() -> [ServerInterceptor<Kyve_Delegation_V1beta1_MsgWithdrawRewards, Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse>]

  /// - Returns: Interceptors to use when handling 'undelegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUndelegateInterceptors() -> [ServerInterceptor<Kyve_Delegation_V1beta1_MsgUndelegate, Kyve_Delegation_V1beta1_MsgUndelegateResponse>]

  /// - Returns: Interceptors to use when handling 'redelegate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRedelegateInterceptors() -> [ServerInterceptor<Kyve_Delegation_V1beta1_MsgRedelegate, Kyve_Delegation_V1beta1_MsgRedelegateResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Kyve_Delegation_V1beta1_MsgUpdateParams, Kyve_Delegation_V1beta1_MsgUpdateParamsResponse>]
}

internal enum Kyve_Delegation_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kyve.delegation.v1beta1.Msg",
    methods: [
      Kyve_Delegation_V1beta1_MsgServerMetadata.Methods.delegate,
      Kyve_Delegation_V1beta1_MsgServerMetadata.Methods.withdrawRewards,
      Kyve_Delegation_V1beta1_MsgServerMetadata.Methods.undelegate,
      Kyve_Delegation_V1beta1_MsgServerMetadata.Methods.redelegate,
      Kyve_Delegation_V1beta1_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let delegate = GRPCMethodDescriptor(
      name: "Delegate",
      path: "/kyve.delegation.v1beta1.Msg/Delegate",
      type: GRPCCallType.unary
    )

    internal static let withdrawRewards = GRPCMethodDescriptor(
      name: "WithdrawRewards",
      path: "/kyve.delegation.v1beta1.Msg/WithdrawRewards",
      type: GRPCCallType.unary
    )

    internal static let undelegate = GRPCMethodDescriptor(
      name: "Undelegate",
      path: "/kyve.delegation.v1beta1.Msg/Undelegate",
      type: GRPCCallType.unary
    )

    internal static let redelegate = GRPCMethodDescriptor(
      name: "Redelegate",
      path: "/kyve.delegation.v1beta1.Msg/Redelegate",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/kyve.delegation.v1beta1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
