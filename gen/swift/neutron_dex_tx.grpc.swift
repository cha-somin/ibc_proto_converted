//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: neutron/dex/tx.proto
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
/// Usage: instantiate `Neutron_Dex_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Neutron_Dex_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? { get }

  func deposit(
    _ request: Neutron_Dex_MsgDeposit,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse>

  func withdrawal(
    _ request: Neutron_Dex_MsgWithdrawal,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse>

  func placeLimitOrder(
    _ request: Neutron_Dex_MsgPlaceLimitOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse>

  func withdrawFilledLimitOrder(
    _ request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>

  func cancelLimitOrder(
    _ request: Neutron_Dex_MsgCancelLimitOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse>

  func multiHopSwap(
    _ request: Neutron_Dex_MsgMultiHopSwap,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse>

  func updateParams(
    _ request: Neutron_Dex_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse>
}

extension Neutron_Dex_MsgClientProtocol {
  internal var serviceName: String {
    return "neutron.dex.Msg"
  }

  /// Unary call to Deposit
  ///
  /// - Parameters:
  ///   - request: Request to send to Deposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deposit(
    _ request: Neutron_Dex_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  /// Unary call to Withdrawal
  ///
  /// - Parameters:
  ///   - request: Request to send to Withdrawal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawal(
    _ request: Neutron_Dex_MsgWithdrawal,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawalInterceptors() ?? []
    )
  }

  /// Unary call to PlaceLimitOrder
  ///
  /// - Parameters:
  ///   - request: Request to send to PlaceLimitOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func placeLimitOrder(
    _ request: Neutron_Dex_MsgPlaceLimitOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.placeLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePlaceLimitOrderInterceptors() ?? []
    )
  }

  /// Unary call to WithdrawFilledLimitOrder
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawFilledLimitOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawFilledLimitOrder(
    _ request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawFilledLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawFilledLimitOrderInterceptors() ?? []
    )
  }

  /// Unary call to CancelLimitOrder
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelLimitOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelLimitOrder(
    _ request: Neutron_Dex_MsgCancelLimitOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.cancelLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelLimitOrderInterceptors() ?? []
    )
  }

  /// Unary call to MultiHopSwap
  ///
  /// - Parameters:
  ///   - request: Request to send to MultiHopSwap.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func multiHopSwap(
    _ request: Neutron_Dex_MsgMultiHopSwap,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.multiHopSwap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiHopSwapInterceptors() ?? []
    )
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Neutron_Dex_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Neutron_Dex_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Neutron_Dex_MsgNIOClient")
internal final class Neutron_Dex_MsgClient: Neutron_Dex_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the neutron.dex.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Neutron_Dex_MsgNIOClient: Neutron_Dex_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the neutron.dex.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Neutron_Dex_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? { get }

  func makeDepositCall(
    _ request: Neutron_Dex_MsgDeposit,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse>

  func makeWithdrawalCall(
    _ request: Neutron_Dex_MsgWithdrawal,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse>

  func makePlaceLimitOrderCall(
    _ request: Neutron_Dex_MsgPlaceLimitOrder,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse>

  func makeWithdrawFilledLimitOrderCall(
    _ request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>

  func makeCancelLimitOrderCall(
    _ request: Neutron_Dex_MsgCancelLimitOrder,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse>

  func makeMultiHopSwapCall(
    _ request: Neutron_Dex_MsgMultiHopSwap,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse>

  func makeUpdateParamsCall(
    _ request: Neutron_Dex_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Dex_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Neutron_Dex_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeDepositCall(
    _ request: Neutron_Dex_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  internal func makeWithdrawalCall(
    _ request: Neutron_Dex_MsgWithdrawal,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawalInterceptors() ?? []
    )
  }

  internal func makePlaceLimitOrderCall(
    _ request: Neutron_Dex_MsgPlaceLimitOrder,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.placeLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePlaceLimitOrderInterceptors() ?? []
    )
  }

  internal func makeWithdrawFilledLimitOrderCall(
    _ request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawFilledLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawFilledLimitOrderInterceptors() ?? []
    )
  }

  internal func makeCancelLimitOrderCall(
    _ request: Neutron_Dex_MsgCancelLimitOrder,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.cancelLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelLimitOrderInterceptors() ?? []
    )
  }

  internal func makeMultiHopSwapCall(
    _ request: Neutron_Dex_MsgMultiHopSwap,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.multiHopSwap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiHopSwapInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Neutron_Dex_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Dex_MsgAsyncClientProtocol {
  internal func deposit(
    _ request: Neutron_Dex_MsgDeposit,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgDepositResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  internal func withdrawal(
    _ request: Neutron_Dex_MsgWithdrawal,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgWithdrawalResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawalInterceptors() ?? []
    )
  }

  internal func placeLimitOrder(
    _ request: Neutron_Dex_MsgPlaceLimitOrder,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgPlaceLimitOrderResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.placeLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePlaceLimitOrderInterceptors() ?? []
    )
  }

  internal func withdrawFilledLimitOrder(
    _ request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgWithdrawFilledLimitOrderResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.withdrawFilledLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawFilledLimitOrderInterceptors() ?? []
    )
  }

  internal func cancelLimitOrder(
    _ request: Neutron_Dex_MsgCancelLimitOrder,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgCancelLimitOrderResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.cancelLimitOrder.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelLimitOrderInterceptors() ?? []
    )
  }

  internal func multiHopSwap(
    _ request: Neutron_Dex_MsgMultiHopSwap,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgMultiHopSwapResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.multiHopSwap.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiHopSwapInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Neutron_Dex_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Neutron_Dex_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Neutron_Dex_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Neutron_Dex_MsgAsyncClient: Neutron_Dex_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Neutron_Dex_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Neutron_Dex_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'deposit'.
  func makeDepositInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawal'.
  func makeWithdrawalInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse>]

  /// - Returns: Interceptors to use when invoking 'placeLimitOrder'.
  func makePlaceLimitOrderInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawFilledLimitOrder'.
  func makeWithdrawFilledLimitOrderInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelLimitOrder'.
  func makeCancelLimitOrderInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'multiHopSwap'.
  func makeMultiHopSwapInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse>]
}

internal enum Neutron_Dex_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "neutron.dex.Msg",
    methods: [
      Neutron_Dex_MsgClientMetadata.Methods.deposit,
      Neutron_Dex_MsgClientMetadata.Methods.withdrawal,
      Neutron_Dex_MsgClientMetadata.Methods.placeLimitOrder,
      Neutron_Dex_MsgClientMetadata.Methods.withdrawFilledLimitOrder,
      Neutron_Dex_MsgClientMetadata.Methods.cancelLimitOrder,
      Neutron_Dex_MsgClientMetadata.Methods.multiHopSwap,
      Neutron_Dex_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let deposit = GRPCMethodDescriptor(
      name: "Deposit",
      path: "/neutron.dex.Msg/Deposit",
      type: GRPCCallType.unary
    )

    internal static let withdrawal = GRPCMethodDescriptor(
      name: "Withdrawal",
      path: "/neutron.dex.Msg/Withdrawal",
      type: GRPCCallType.unary
    )

    internal static let placeLimitOrder = GRPCMethodDescriptor(
      name: "PlaceLimitOrder",
      path: "/neutron.dex.Msg/PlaceLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let withdrawFilledLimitOrder = GRPCMethodDescriptor(
      name: "WithdrawFilledLimitOrder",
      path: "/neutron.dex.Msg/WithdrawFilledLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let cancelLimitOrder = GRPCMethodDescriptor(
      name: "CancelLimitOrder",
      path: "/neutron.dex.Msg/CancelLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let multiHopSwap = GRPCMethodDescriptor(
      name: "MultiHopSwap",
      path: "/neutron.dex.Msg/MultiHopSwap",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/neutron.dex.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Neutron_Dex_MsgProvider: CallHandlerProvider {
  var interceptors: Neutron_Dex_MsgServerInterceptorFactoryProtocol? { get }

  func deposit(request: Neutron_Dex_MsgDeposit, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgDepositResponse>

  func withdrawal(request: Neutron_Dex_MsgWithdrawal, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgWithdrawalResponse>

  func placeLimitOrder(request: Neutron_Dex_MsgPlaceLimitOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgPlaceLimitOrderResponse>

  func withdrawFilledLimitOrder(request: Neutron_Dex_MsgWithdrawFilledLimitOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>

  func cancelLimitOrder(request: Neutron_Dex_MsgCancelLimitOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgCancelLimitOrderResponse>

  func multiHopSwap(request: Neutron_Dex_MsgMultiHopSwap, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgMultiHopSwapResponse>

  /// this line is used by starport scaffolding # proto/tx/rpc
  func updateParams(request: Neutron_Dex_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Neutron_Dex_MsgUpdateParamsResponse>
}

extension Neutron_Dex_MsgProvider {
  internal var serviceName: Substring {
    return Neutron_Dex_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        userFunction: self.deposit(request:context:)
      )

    case "Withdrawal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgWithdrawal>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgWithdrawalResponse>(),
        interceptors: self.interceptors?.makeWithdrawalInterceptors() ?? [],
        userFunction: self.withdrawal(request:context:)
      )

    case "PlaceLimitOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgPlaceLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgPlaceLimitOrderResponse>(),
        interceptors: self.interceptors?.makePlaceLimitOrderInterceptors() ?? [],
        userFunction: self.placeLimitOrder(request:context:)
      )

    case "WithdrawFilledLimitOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgWithdrawFilledLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>(),
        interceptors: self.interceptors?.makeWithdrawFilledLimitOrderInterceptors() ?? [],
        userFunction: self.withdrawFilledLimitOrder(request:context:)
      )

    case "CancelLimitOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgCancelLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgCancelLimitOrderResponse>(),
        interceptors: self.interceptors?.makeCancelLimitOrderInterceptors() ?? [],
        userFunction: self.cancelLimitOrder(request:context:)
      )

    case "MultiHopSwap":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgMultiHopSwap>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgMultiHopSwapResponse>(),
        interceptors: self.interceptors?.makeMultiHopSwapInterceptors() ?? [],
        userFunction: self.multiHopSwap(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgUpdateParamsResponse>(),
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
internal protocol Neutron_Dex_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Neutron_Dex_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func deposit(
    request: Neutron_Dex_MsgDeposit,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgDepositResponse

  @Sendable func withdrawal(
    request: Neutron_Dex_MsgWithdrawal,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgWithdrawalResponse

  @Sendable func placeLimitOrder(
    request: Neutron_Dex_MsgPlaceLimitOrder,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgPlaceLimitOrderResponse

  @Sendable func withdrawFilledLimitOrder(
    request: Neutron_Dex_MsgWithdrawFilledLimitOrder,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgWithdrawFilledLimitOrderResponse

  @Sendable func cancelLimitOrder(
    request: Neutron_Dex_MsgCancelLimitOrder,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgCancelLimitOrderResponse

  @Sendable func multiHopSwap(
    request: Neutron_Dex_MsgMultiHopSwap,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgMultiHopSwapResponse

  /// this line is used by starport scaffolding # proto/tx/rpc
  @Sendable func updateParams(
    request: Neutron_Dex_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Neutron_Dex_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Neutron_Dex_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Neutron_Dex_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Neutron_Dex_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Neutron_Dex_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deposit":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        wrapping: self.deposit(request:context:)
      )

    case "Withdrawal":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgWithdrawal>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgWithdrawalResponse>(),
        interceptors: self.interceptors?.makeWithdrawalInterceptors() ?? [],
        wrapping: self.withdrawal(request:context:)
      )

    case "PlaceLimitOrder":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgPlaceLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgPlaceLimitOrderResponse>(),
        interceptors: self.interceptors?.makePlaceLimitOrderInterceptors() ?? [],
        wrapping: self.placeLimitOrder(request:context:)
      )

    case "WithdrawFilledLimitOrder":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgWithdrawFilledLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>(),
        interceptors: self.interceptors?.makeWithdrawFilledLimitOrderInterceptors() ?? [],
        wrapping: self.withdrawFilledLimitOrder(request:context:)
      )

    case "CancelLimitOrder":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgCancelLimitOrder>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgCancelLimitOrderResponse>(),
        interceptors: self.interceptors?.makeCancelLimitOrderInterceptors() ?? [],
        wrapping: self.cancelLimitOrder(request:context:)
      )

    case "MultiHopSwap":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgMultiHopSwap>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgMultiHopSwapResponse>(),
        interceptors: self.interceptors?.makeMultiHopSwapInterceptors() ?? [],
        wrapping: self.multiHopSwap(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Neutron_Dex_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Neutron_Dex_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Neutron_Dex_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'deposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgDeposit, Neutron_Dex_MsgDepositResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawalInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgWithdrawal, Neutron_Dex_MsgWithdrawalResponse>]

  /// - Returns: Interceptors to use when handling 'placeLimitOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePlaceLimitOrderInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgPlaceLimitOrder, Neutron_Dex_MsgPlaceLimitOrderResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawFilledLimitOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawFilledLimitOrderInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgWithdrawFilledLimitOrder, Neutron_Dex_MsgWithdrawFilledLimitOrderResponse>]

  /// - Returns: Interceptors to use when handling 'cancelLimitOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelLimitOrderInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgCancelLimitOrder, Neutron_Dex_MsgCancelLimitOrderResponse>]

  /// - Returns: Interceptors to use when handling 'multiHopSwap'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMultiHopSwapInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgMultiHopSwap, Neutron_Dex_MsgMultiHopSwapResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Neutron_Dex_MsgUpdateParams, Neutron_Dex_MsgUpdateParamsResponse>]
}

internal enum Neutron_Dex_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "neutron.dex.Msg",
    methods: [
      Neutron_Dex_MsgServerMetadata.Methods.deposit,
      Neutron_Dex_MsgServerMetadata.Methods.withdrawal,
      Neutron_Dex_MsgServerMetadata.Methods.placeLimitOrder,
      Neutron_Dex_MsgServerMetadata.Methods.withdrawFilledLimitOrder,
      Neutron_Dex_MsgServerMetadata.Methods.cancelLimitOrder,
      Neutron_Dex_MsgServerMetadata.Methods.multiHopSwap,
      Neutron_Dex_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let deposit = GRPCMethodDescriptor(
      name: "Deposit",
      path: "/neutron.dex.Msg/Deposit",
      type: GRPCCallType.unary
    )

    internal static let withdrawal = GRPCMethodDescriptor(
      name: "Withdrawal",
      path: "/neutron.dex.Msg/Withdrawal",
      type: GRPCCallType.unary
    )

    internal static let placeLimitOrder = GRPCMethodDescriptor(
      name: "PlaceLimitOrder",
      path: "/neutron.dex.Msg/PlaceLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let withdrawFilledLimitOrder = GRPCMethodDescriptor(
      name: "WithdrawFilledLimitOrder",
      path: "/neutron.dex.Msg/WithdrawFilledLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let cancelLimitOrder = GRPCMethodDescriptor(
      name: "CancelLimitOrder",
      path: "/neutron.dex.Msg/CancelLimitOrder",
      type: GRPCCallType.unary
    )

    internal static let multiHopSwap = GRPCMethodDescriptor(
      name: "MultiHopSwap",
      path: "/neutron.dex.Msg/MultiHopSwap",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/neutron.dex.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}