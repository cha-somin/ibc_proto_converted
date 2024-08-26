//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: babylon/incentive/query.proto
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
/// Usage: instantiate `Babylon_Incentive_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Babylon_Incentive_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Babylon_Incentive_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse>

  func rewardGauges(
    _ request: Babylon_Incentive_QueryRewardGaugesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse>

  func bTCStakingGauge(
    _ request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse>

  func bTCTimestampingGauge(
    _ request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse>
}

extension Babylon_Incentive_QueryClientProtocol {
  internal var serviceName: String {
    return "babylon.incentive.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Babylon_Incentive_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// RewardGauge queries the reward gauge of a given stakeholder address
  ///
  /// - Parameters:
  ///   - request: Request to send to RewardGauges.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rewardGauges(
    _ request: Babylon_Incentive_QueryRewardGaugesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse> {
    return self.makeUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.rewardGauges.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardGaugesInterceptors() ?? []
    )
  }

  /// BTCStakingGauge queries the BTC staking gauge of a given height
  ///
  /// - Parameters:
  ///   - request: Request to send to BTCStakingGauge.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bTCStakingGauge(
    _ request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse> {
    return self.makeUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCStakingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCStakingGaugeInterceptors() ?? []
    )
  }

  /// BTCTimestampingGauge queries the BTC timestamping gauge of a given epoch
  ///
  /// - Parameters:
  ///   - request: Request to send to BTCTimestampingGauge.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bTCTimestampingGauge(
    _ request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse> {
    return self.makeUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCTimestampingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCTimestampingGaugeInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Babylon_Incentive_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Babylon_Incentive_QueryNIOClient")
internal final class Babylon_Incentive_QueryClient: Babylon_Incentive_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the babylon.incentive.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Babylon_Incentive_QueryNIOClient: Babylon_Incentive_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the babylon.incentive.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Babylon_Incentive_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Babylon_Incentive_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse>

  func makeRewardGaugesCall(
    _ request: Babylon_Incentive_QueryRewardGaugesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse>

  func makeBtcstakingGaugeCall(
    _ request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse>

  func makeBtctimestampingGaugeCall(
    _ request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Incentive_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Incentive_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Babylon_Incentive_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeRewardGaugesCall(
    _ request: Babylon_Incentive_QueryRewardGaugesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.rewardGauges.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardGaugesInterceptors() ?? []
    )
  }

  internal func makeBtcstakingGaugeCall(
    _ request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCStakingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCStakingGaugeInterceptors() ?? []
    )
  }

  internal func makeBtctimestampingGaugeCall(
    _ request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCTimestampingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCTimestampingGaugeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Incentive_QueryAsyncClientProtocol {
  internal func params(
    _ request: Babylon_Incentive_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Incentive_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func rewardGauges(
    _ request: Babylon_Incentive_QueryRewardGaugesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Incentive_QueryRewardGaugesResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.rewardGauges.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardGaugesInterceptors() ?? []
    )
  }

  internal func bTCStakingGauge(
    _ request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Incentive_QueryBTCStakingGaugeResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCStakingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCStakingGaugeInterceptors() ?? []
    )
  }

  internal func bTCTimestampingGauge(
    _ request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Incentive_QueryBTCTimestampingGaugeResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Incentive_QueryClientMetadata.Methods.bTCTimestampingGauge.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBTCTimestampingGaugeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Babylon_Incentive_QueryAsyncClient: Babylon_Incentive_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Incentive_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Babylon_Incentive_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'rewardGauges'.
  func makeRewardGaugesInterceptors() -> [ClientInterceptor<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse>]

  /// - Returns: Interceptors to use when invoking 'bTCStakingGauge'.
  func makeBTCStakingGaugeInterceptors() -> [ClientInterceptor<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse>]

  /// - Returns: Interceptors to use when invoking 'bTCTimestampingGauge'.
  func makeBTCTimestampingGaugeInterceptors() -> [ClientInterceptor<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse>]
}

internal enum Babylon_Incentive_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "babylon.incentive.Query",
    methods: [
      Babylon_Incentive_QueryClientMetadata.Methods.params,
      Babylon_Incentive_QueryClientMetadata.Methods.rewardGauges,
      Babylon_Incentive_QueryClientMetadata.Methods.bTCStakingGauge,
      Babylon_Incentive_QueryClientMetadata.Methods.bTCTimestampingGauge,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/babylon.incentive.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let rewardGauges = GRPCMethodDescriptor(
      name: "RewardGauges",
      path: "/babylon.incentive.Query/RewardGauges",
      type: GRPCCallType.unary
    )

    internal static let bTCStakingGauge = GRPCMethodDescriptor(
      name: "BTCStakingGauge",
      path: "/babylon.incentive.Query/BTCStakingGauge",
      type: GRPCCallType.unary
    )

    internal static let bTCTimestampingGauge = GRPCMethodDescriptor(
      name: "BTCTimestampingGauge",
      path: "/babylon.incentive.Query/BTCTimestampingGauge",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Babylon_Incentive_QueryProvider: CallHandlerProvider {
  var interceptors: Babylon_Incentive_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Babylon_Incentive_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Incentive_QueryParamsResponse>

  /// RewardGauge queries the reward gauge of a given stakeholder address
  func rewardGauges(request: Babylon_Incentive_QueryRewardGaugesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Incentive_QueryRewardGaugesResponse>

  /// BTCStakingGauge queries the BTC staking gauge of a given height
  func bTCStakingGauge(request: Babylon_Incentive_QueryBTCStakingGaugeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Incentive_QueryBTCStakingGaugeResponse>

  /// BTCTimestampingGauge queries the BTC timestamping gauge of a given epoch
  func bTCTimestampingGauge(request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Incentive_QueryBTCTimestampingGaugeResponse>
}

extension Babylon_Incentive_QueryProvider {
  internal var serviceName: Substring {
    return Babylon_Incentive_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "RewardGauges":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryRewardGaugesRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryRewardGaugesResponse>(),
        interceptors: self.interceptors?.makeRewardGaugesInterceptors() ?? [],
        userFunction: self.rewardGauges(request:context:)
      )

    case "BTCStakingGauge":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryBTCStakingGaugeRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryBTCStakingGaugeResponse>(),
        interceptors: self.interceptors?.makeBTCStakingGaugeInterceptors() ?? [],
        userFunction: self.bTCStakingGauge(request:context:)
      )

    case "BTCTimestampingGauge":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryBTCTimestampingGaugeRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryBTCTimestampingGaugeResponse>(),
        interceptors: self.interceptors?.makeBTCTimestampingGaugeInterceptors() ?? [],
        userFunction: self.bTCTimestampingGauge(request:context:)
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
internal protocol Babylon_Incentive_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Incentive_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Babylon_Incentive_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Incentive_QueryParamsResponse

  /// RewardGauge queries the reward gauge of a given stakeholder address
  @Sendable func rewardGauges(
    request: Babylon_Incentive_QueryRewardGaugesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Incentive_QueryRewardGaugesResponse

  /// BTCStakingGauge queries the BTC staking gauge of a given height
  @Sendable func bTCStakingGauge(
    request: Babylon_Incentive_QueryBTCStakingGaugeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Incentive_QueryBTCStakingGaugeResponse

  /// BTCTimestampingGauge queries the BTC timestamping gauge of a given epoch
  @Sendable func bTCTimestampingGauge(
    request: Babylon_Incentive_QueryBTCTimestampingGaugeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Incentive_QueryBTCTimestampingGaugeResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Incentive_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Incentive_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Babylon_Incentive_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Babylon_Incentive_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "RewardGauges":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryRewardGaugesRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryRewardGaugesResponse>(),
        interceptors: self.interceptors?.makeRewardGaugesInterceptors() ?? [],
        wrapping: self.rewardGauges(request:context:)
      )

    case "BTCStakingGauge":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryBTCStakingGaugeRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryBTCStakingGaugeResponse>(),
        interceptors: self.interceptors?.makeBTCStakingGaugeInterceptors() ?? [],
        wrapping: self.bTCStakingGauge(request:context:)
      )

    case "BTCTimestampingGauge":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Incentive_QueryBTCTimestampingGaugeRequest>(),
        responseSerializer: ProtobufSerializer<Babylon_Incentive_QueryBTCTimestampingGaugeResponse>(),
        interceptors: self.interceptors?.makeBTCTimestampingGaugeInterceptors() ?? [],
        wrapping: self.bTCTimestampingGauge(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Babylon_Incentive_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Babylon_Incentive_QueryParamsRequest, Babylon_Incentive_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'rewardGauges'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRewardGaugesInterceptors() -> [ServerInterceptor<Babylon_Incentive_QueryRewardGaugesRequest, Babylon_Incentive_QueryRewardGaugesResponse>]

  /// - Returns: Interceptors to use when handling 'bTCStakingGauge'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBTCStakingGaugeInterceptors() -> [ServerInterceptor<Babylon_Incentive_QueryBTCStakingGaugeRequest, Babylon_Incentive_QueryBTCStakingGaugeResponse>]

  /// - Returns: Interceptors to use when handling 'bTCTimestampingGauge'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBTCTimestampingGaugeInterceptors() -> [ServerInterceptor<Babylon_Incentive_QueryBTCTimestampingGaugeRequest, Babylon_Incentive_QueryBTCTimestampingGaugeResponse>]
}

internal enum Babylon_Incentive_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "babylon.incentive.Query",
    methods: [
      Babylon_Incentive_QueryServerMetadata.Methods.params,
      Babylon_Incentive_QueryServerMetadata.Methods.rewardGauges,
      Babylon_Incentive_QueryServerMetadata.Methods.bTCStakingGauge,
      Babylon_Incentive_QueryServerMetadata.Methods.bTCTimestampingGauge,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/babylon.incentive.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let rewardGauges = GRPCMethodDescriptor(
      name: "RewardGauges",
      path: "/babylon.incentive.Query/RewardGauges",
      type: GRPCCallType.unary
    )

    internal static let bTCStakingGauge = GRPCMethodDescriptor(
      name: "BTCStakingGauge",
      path: "/babylon.incentive.Query/BTCStakingGauge",
      type: GRPCCallType.unary
    )

    internal static let bTCTimestampingGauge = GRPCMethodDescriptor(
      name: "BTCTimestampingGauge",
      path: "/babylon.incentive.Query/BTCTimestampingGauge",
      type: GRPCCallType.unary
    )
  }
}
