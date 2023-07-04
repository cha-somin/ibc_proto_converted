//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: archway/rewards/v1/tx.proto
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


/// Msg defines the module messaging service.
///
/// Usage: instantiate `Archway_Rewards_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Archway_Rewards_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? { get }

  func setContractMetadata(
    _ request: Archway_Rewards_V1_MsgSetContractMetadata,
    callOptions: CallOptions?
  ) -> UnaryCall<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse>

  func withdrawRewards(
    _ request: Archway_Rewards_V1_MsgWithdrawRewards,
    callOptions: CallOptions?
  ) -> UnaryCall<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse>

  func setFlatFee(
    _ request: Archway_Rewards_V1_MsgSetFlatFee,
    callOptions: CallOptions?
  ) -> UnaryCall<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse>
}

extension Archway_Rewards_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "archway.rewards.v1.Msg"
  }

  /// SetContractMetadata creates or updates an existing contract metadata.
  /// Method is authorized to the contract owner (admin if no metadata exists).
  ///
  /// - Parameters:
  ///   - request: Request to send to SetContractMetadata.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setContractMetadata(
    _ request: Archway_Rewards_V1_MsgSetContractMetadata,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse> {
    return self.makeUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setContractMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractMetadataInterceptors() ?? []
    )
  }

  /// WithdrawRewards performs collected rewards distribution.
  /// Rewards might be credited from multiple contracts (rewards_address must be
  /// set in the corresponding contract metadata).
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawRewards.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawRewards(
    _ request: Archway_Rewards_V1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse> {
    return self.makeUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  /// SetFlatFee sets or updates or removes the flat fee to interact with the
  /// contract Method is authorized to the contract owner.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetFlatFee.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setFlatFee(
    _ request: Archway_Rewards_V1_MsgSetFlatFee,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse> {
    return self.makeUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setFlatFee.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetFlatFeeInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Archway_Rewards_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Archway_Rewards_V1_MsgNIOClient")
internal final class Archway_Rewards_V1_MsgClient: Archway_Rewards_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the archway.rewards.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Archway_Rewards_V1_MsgNIOClient: Archway_Rewards_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the archway.rewards.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the module messaging service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Archway_Rewards_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetContractMetadataCall(
    _ request: Archway_Rewards_V1_MsgSetContractMetadata,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse>

  func makeWithdrawRewardsCall(
    _ request: Archway_Rewards_V1_MsgWithdrawRewards,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse>

  func makeSetFlatFeeCall(
    _ request: Archway_Rewards_V1_MsgSetFlatFee,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Archway_Rewards_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Archway_Rewards_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetContractMetadataCall(
    _ request: Archway_Rewards_V1_MsgSetContractMetadata,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse> {
    return self.makeAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setContractMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractMetadataInterceptors() ?? []
    )
  }

  internal func makeWithdrawRewardsCall(
    _ request: Archway_Rewards_V1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse> {
    return self.makeAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  internal func makeSetFlatFeeCall(
    _ request: Archway_Rewards_V1_MsgSetFlatFee,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse> {
    return self.makeAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setFlatFee.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetFlatFeeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Archway_Rewards_V1_MsgAsyncClientProtocol {
  internal func setContractMetadata(
    _ request: Archway_Rewards_V1_MsgSetContractMetadata,
    callOptions: CallOptions? = nil
  ) async throws -> Archway_Rewards_V1_MsgSetContractMetadataResponse {
    return try await self.performAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setContractMetadata.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetContractMetadataInterceptors() ?? []
    )
  }

  internal func withdrawRewards(
    _ request: Archway_Rewards_V1_MsgWithdrawRewards,
    callOptions: CallOptions? = nil
  ) async throws -> Archway_Rewards_V1_MsgWithdrawRewardsResponse {
    return try await self.performAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.withdrawRewards.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? []
    )
  }

  internal func setFlatFee(
    _ request: Archway_Rewards_V1_MsgSetFlatFee,
    callOptions: CallOptions? = nil
  ) async throws -> Archway_Rewards_V1_MsgSetFlatFeeResponse {
    return try await self.performAsyncUnaryCall(
      path: Archway_Rewards_V1_MsgClientMetadata.Methods.setFlatFee.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetFlatFeeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Archway_Rewards_V1_MsgAsyncClient: Archway_Rewards_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Archway_Rewards_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setContractMetadata'.
  func makeSetContractMetadataInterceptors() -> [ClientInterceptor<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawRewards'.
  func makeWithdrawRewardsInterceptors() -> [ClientInterceptor<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse>]

  /// - Returns: Interceptors to use when invoking 'setFlatFee'.
  func makeSetFlatFeeInterceptors() -> [ClientInterceptor<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse>]
}

internal enum Archway_Rewards_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "archway.rewards.v1.Msg",
    methods: [
      Archway_Rewards_V1_MsgClientMetadata.Methods.setContractMetadata,
      Archway_Rewards_V1_MsgClientMetadata.Methods.withdrawRewards,
      Archway_Rewards_V1_MsgClientMetadata.Methods.setFlatFee,
    ]
  )

  internal enum Methods {
    internal static let setContractMetadata = GRPCMethodDescriptor(
      name: "SetContractMetadata",
      path: "/archway.rewards.v1.Msg/SetContractMetadata",
      type: GRPCCallType.unary
    )

    internal static let withdrawRewards = GRPCMethodDescriptor(
      name: "WithdrawRewards",
      path: "/archway.rewards.v1.Msg/WithdrawRewards",
      type: GRPCCallType.unary
    )

    internal static let setFlatFee = GRPCMethodDescriptor(
      name: "SetFlatFee",
      path: "/archway.rewards.v1.Msg/SetFlatFee",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the module messaging service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Archway_Rewards_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Archway_Rewards_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetContractMetadata creates or updates an existing contract metadata.
  /// Method is authorized to the contract owner (admin if no metadata exists).
  func setContractMetadata(request: Archway_Rewards_V1_MsgSetContractMetadata, context: StatusOnlyCallContext) -> EventLoopFuture<Archway_Rewards_V1_MsgSetContractMetadataResponse>

  /// WithdrawRewards performs collected rewards distribution.
  /// Rewards might be credited from multiple contracts (rewards_address must be
  /// set in the corresponding contract metadata).
  func withdrawRewards(request: Archway_Rewards_V1_MsgWithdrawRewards, context: StatusOnlyCallContext) -> EventLoopFuture<Archway_Rewards_V1_MsgWithdrawRewardsResponse>

  /// SetFlatFee sets or updates or removes the flat fee to interact with the
  /// contract Method is authorized to the contract owner.
  func setFlatFee(request: Archway_Rewards_V1_MsgSetFlatFee, context: StatusOnlyCallContext) -> EventLoopFuture<Archway_Rewards_V1_MsgSetFlatFeeResponse>
}

extension Archway_Rewards_V1_MsgProvider {
  internal var serviceName: Substring {
    return Archway_Rewards_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetContractMetadata":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgSetContractMetadata>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgSetContractMetadataResponse>(),
        interceptors: self.interceptors?.makeSetContractMetadataInterceptors() ?? [],
        userFunction: self.setContractMetadata(request:context:)
      )

    case "WithdrawRewards":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgWithdrawRewards>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgWithdrawRewardsResponse>(),
        interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? [],
        userFunction: self.withdrawRewards(request:context:)
      )

    case "SetFlatFee":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgSetFlatFee>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgSetFlatFeeResponse>(),
        interceptors: self.interceptors?.makeSetFlatFeeInterceptors() ?? [],
        userFunction: self.setFlatFee(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the module messaging service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Archway_Rewards_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Archway_Rewards_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetContractMetadata creates or updates an existing contract metadata.
  /// Method is authorized to the contract owner (admin if no metadata exists).
  @Sendable func setContractMetadata(
    request: Archway_Rewards_V1_MsgSetContractMetadata,
    context: GRPCAsyncServerCallContext
  ) async throws -> Archway_Rewards_V1_MsgSetContractMetadataResponse

  /// WithdrawRewards performs collected rewards distribution.
  /// Rewards might be credited from multiple contracts (rewards_address must be
  /// set in the corresponding contract metadata).
  @Sendable func withdrawRewards(
    request: Archway_Rewards_V1_MsgWithdrawRewards,
    context: GRPCAsyncServerCallContext
  ) async throws -> Archway_Rewards_V1_MsgWithdrawRewardsResponse

  /// SetFlatFee sets or updates or removes the flat fee to interact with the
  /// contract Method is authorized to the contract owner.
  @Sendable func setFlatFee(
    request: Archway_Rewards_V1_MsgSetFlatFee,
    context: GRPCAsyncServerCallContext
  ) async throws -> Archway_Rewards_V1_MsgSetFlatFeeResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Archway_Rewards_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Archway_Rewards_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Archway_Rewards_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Archway_Rewards_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetContractMetadata":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgSetContractMetadata>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgSetContractMetadataResponse>(),
        interceptors: self.interceptors?.makeSetContractMetadataInterceptors() ?? [],
        wrapping: self.setContractMetadata(request:context:)
      )

    case "WithdrawRewards":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgWithdrawRewards>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgWithdrawRewardsResponse>(),
        interceptors: self.interceptors?.makeWithdrawRewardsInterceptors() ?? [],
        wrapping: self.withdrawRewards(request:context:)
      )

    case "SetFlatFee":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Archway_Rewards_V1_MsgSetFlatFee>(),
        responseSerializer: ProtobufSerializer<Archway_Rewards_V1_MsgSetFlatFeeResponse>(),
        interceptors: self.interceptors?.makeSetFlatFeeInterceptors() ?? [],
        wrapping: self.setFlatFee(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Archway_Rewards_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setContractMetadata'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetContractMetadataInterceptors() -> [ServerInterceptor<Archway_Rewards_V1_MsgSetContractMetadata, Archway_Rewards_V1_MsgSetContractMetadataResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawRewards'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawRewardsInterceptors() -> [ServerInterceptor<Archway_Rewards_V1_MsgWithdrawRewards, Archway_Rewards_V1_MsgWithdrawRewardsResponse>]

  /// - Returns: Interceptors to use when handling 'setFlatFee'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetFlatFeeInterceptors() -> [ServerInterceptor<Archway_Rewards_V1_MsgSetFlatFee, Archway_Rewards_V1_MsgSetFlatFeeResponse>]
}

internal enum Archway_Rewards_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "archway.rewards.v1.Msg",
    methods: [
      Archway_Rewards_V1_MsgServerMetadata.Methods.setContractMetadata,
      Archway_Rewards_V1_MsgServerMetadata.Methods.withdrawRewards,
      Archway_Rewards_V1_MsgServerMetadata.Methods.setFlatFee,
    ]
  )

  internal enum Methods {
    internal static let setContractMetadata = GRPCMethodDescriptor(
      name: "SetContractMetadata",
      path: "/archway.rewards.v1.Msg/SetContractMetadata",
      type: GRPCCallType.unary
    )

    internal static let withdrawRewards = GRPCMethodDescriptor(
      name: "WithdrawRewards",
      path: "/archway.rewards.v1.Msg/WithdrawRewards",
      type: GRPCCallType.unary
    )

    internal static let setFlatFee = GRPCMethodDescriptor(
      name: "SetFlatFee",
      path: "/archway.rewards.v1.Msg/SetFlatFee",
      type: GRPCCallType.unary
    )
  }
}