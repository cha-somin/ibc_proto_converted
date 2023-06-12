//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/reward/v1/query.proto
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


/// Query defines the gRPC querier service for reward module.
///
/// Usage: instantiate `Provenance_Reward_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Reward_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? { get }

  func rewardProgramByID(
    _ request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse>

  func rewardPrograms(
    _ request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse>

  func claimPeriodRewardDistributions(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>

  func claimPeriodRewardDistributionsByID(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>

  func rewardDistributionsByAddress(
    _ request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>
}

extension Provenance_Reward_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "provenance.reward.v1.Query"
  }

  /// RewardProgramByID returns a reward program matching the ID.
  ///
  /// - Parameters:
  ///   - request: Request to send to RewardProgramByID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rewardProgramByID(
    _ request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardProgramByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramByIDInterceptors() ?? []
    )
  }

  /// RewardPrograms returns a list of reward programs matching the query type.
  ///
  /// - Parameters:
  ///   - request: Request to send to RewardPrograms.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rewardPrograms(
    _ request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardPrograms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramsInterceptors() ?? []
    )
  }

  /// ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimPeriodRewardDistributions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimPeriodRewardDistributions(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsInterceptors() ?? []
    )
  }

  /// ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimPeriodRewardDistributionsByID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimPeriodRewardDistributionsByID(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributionsByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsByIDInterceptors() ?? []
    )
  }

  /// RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
  /// status.
  ///
  /// - Parameters:
  ///   - request: Request to send to RewardDistributionsByAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rewardDistributionsByAddress(
    _ request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse> {
    return self.makeUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardDistributionsByAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardDistributionsByAddressInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Reward_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Reward_V1_QueryNIOClient")
internal final class Provenance_Reward_V1_QueryClient: Provenance_Reward_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.reward.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Reward_V1_QueryNIOClient: Provenance_Reward_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.reward.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for reward module.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Reward_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeRewardProgramByIDCall(
    _ request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse>

  func makeRewardProgramsCall(
    _ request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse>

  func makeClaimPeriodRewardDistributionsCall(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>

  func makeClaimPeriodRewardDistributionsByIDCall(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>

  func makeRewardDistributionsByAddressCall(
    _ request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Reward_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRewardProgramByIDCall(
    _ request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardProgramByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramByIDInterceptors() ?? []
    )
  }

  internal func makeRewardProgramsCall(
    _ request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardPrograms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramsInterceptors() ?? []
    )
  }

  internal func makeClaimPeriodRewardDistributionsCall(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsInterceptors() ?? []
    )
  }

  internal func makeClaimPeriodRewardDistributionsByIDCall(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributionsByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsByIDInterceptors() ?? []
    )
  }

  internal func makeRewardDistributionsByAddressCall(
    _ request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardDistributionsByAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardDistributionsByAddressInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_QueryAsyncClientProtocol {
  internal func rewardProgramByID(
    _ request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_QueryRewardProgramByIDResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardProgramByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramByIDInterceptors() ?? []
    )
  }

  internal func rewardPrograms(
    _ request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_QueryRewardProgramsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardPrograms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardProgramsInterceptors() ?? []
    )
  }

  internal func claimPeriodRewardDistributions(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsInterceptors() ?? []
    )
  }

  internal func claimPeriodRewardDistributionsByID(
    _ request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributionsByID.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsByIDInterceptors() ?? []
    )
  }

  internal func rewardDistributionsByAddress(
    _ request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Reward_V1_QueryClientMetadata.Methods.rewardDistributionsByAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRewardDistributionsByAddressInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Reward_V1_QueryAsyncClient: Provenance_Reward_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Reward_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'rewardProgramByID'.
  func makeRewardProgramByIDInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse>]

  /// - Returns: Interceptors to use when invoking 'rewardPrograms'.
  func makeRewardProgramsInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimPeriodRewardDistributions'.
  func makeClaimPeriodRewardDistributionsInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimPeriodRewardDistributionsByID'.
  func makeClaimPeriodRewardDistributionsByIDInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>]

  /// - Returns: Interceptors to use when invoking 'rewardDistributionsByAddress'.
  func makeRewardDistributionsByAddressInterceptors() -> [ClientInterceptor<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>]
}

internal enum Provenance_Reward_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.reward.v1.Query",
    methods: [
      Provenance_Reward_V1_QueryClientMetadata.Methods.rewardProgramByID,
      Provenance_Reward_V1_QueryClientMetadata.Methods.rewardPrograms,
      Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributions,
      Provenance_Reward_V1_QueryClientMetadata.Methods.claimPeriodRewardDistributionsByID,
      Provenance_Reward_V1_QueryClientMetadata.Methods.rewardDistributionsByAddress,
    ]
  )

  internal enum Methods {
    internal static let rewardProgramByID = GRPCMethodDescriptor(
      name: "RewardProgramByID",
      path: "/provenance.reward.v1.Query/RewardProgramByID",
      type: GRPCCallType.unary
    )

    internal static let rewardPrograms = GRPCMethodDescriptor(
      name: "RewardPrograms",
      path: "/provenance.reward.v1.Query/RewardPrograms",
      type: GRPCCallType.unary
    )

    internal static let claimPeriodRewardDistributions = GRPCMethodDescriptor(
      name: "ClaimPeriodRewardDistributions",
      path: "/provenance.reward.v1.Query/ClaimPeriodRewardDistributions",
      type: GRPCCallType.unary
    )

    internal static let claimPeriodRewardDistributionsByID = GRPCMethodDescriptor(
      name: "ClaimPeriodRewardDistributionsByID",
      path: "/provenance.reward.v1.Query/ClaimPeriodRewardDistributionsByID",
      type: GRPCCallType.unary
    )

    internal static let rewardDistributionsByAddress = GRPCMethodDescriptor(
      name: "RewardDistributionsByAddress",
      path: "/provenance.reward.v1.Query/RewardDistributionsByAddress",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for reward module.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Reward_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Provenance_Reward_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// RewardProgramByID returns a reward program matching the ID.
  func rewardProgramByID(request: Provenance_Reward_V1_QueryRewardProgramByIDRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_QueryRewardProgramByIDResponse>

  /// RewardPrograms returns a list of reward programs matching the query type.
  func rewardPrograms(request: Provenance_Reward_V1_QueryRewardProgramsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_QueryRewardProgramsResponse>

  /// ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
  func claimPeriodRewardDistributions(request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>

  /// ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
  func claimPeriodRewardDistributionsByID(request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>

  /// RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
  /// status.
  func rewardDistributionsByAddress(request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>
}

extension Provenance_Reward_V1_QueryProvider {
  internal var serviceName: Substring {
    return Provenance_Reward_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RewardProgramByID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardProgramByIDRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardProgramByIDResponse>(),
        interceptors: self.interceptors?.makeRewardProgramByIDInterceptors() ?? [],
        userFunction: self.rewardProgramByID(request:context:)
      )

    case "RewardPrograms":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardProgramsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardProgramsResponse>(),
        interceptors: self.interceptors?.makeRewardProgramsInterceptors() ?? [],
        userFunction: self.rewardPrograms(request:context:)
      )

    case "ClaimPeriodRewardDistributions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>(),
        interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsInterceptors() ?? [],
        userFunction: self.claimPeriodRewardDistributions(request:context:)
      )

    case "ClaimPeriodRewardDistributionsByID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>(),
        interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsByIDInterceptors() ?? [],
        userFunction: self.claimPeriodRewardDistributionsByID(request:context:)
      )

    case "RewardDistributionsByAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>(),
        interceptors: self.interceptors?.makeRewardDistributionsByAddressInterceptors() ?? [],
        userFunction: self.rewardDistributionsByAddress(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for reward module.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Reward_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Reward_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// RewardProgramByID returns a reward program matching the ID.
  @Sendable func rewardProgramByID(
    request: Provenance_Reward_V1_QueryRewardProgramByIDRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_QueryRewardProgramByIDResponse

  /// RewardPrograms returns a list of reward programs matching the query type.
  @Sendable func rewardPrograms(
    request: Provenance_Reward_V1_QueryRewardProgramsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_QueryRewardProgramsResponse

  /// ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
  @Sendable func claimPeriodRewardDistributions(
    request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse

  /// ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
  @Sendable func claimPeriodRewardDistributionsByID(
    request: Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse

  /// RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
  /// status.
  @Sendable func rewardDistributionsByAddress(
    request: Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Reward_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Reward_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Reward_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Reward_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RewardProgramByID":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardProgramByIDRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardProgramByIDResponse>(),
        interceptors: self.interceptors?.makeRewardProgramByIDInterceptors() ?? [],
        wrapping: self.rewardProgramByID(request:context:)
      )

    case "RewardPrograms":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardProgramsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardProgramsResponse>(),
        interceptors: self.interceptors?.makeRewardProgramsInterceptors() ?? [],
        wrapping: self.rewardPrograms(request:context:)
      )

    case "ClaimPeriodRewardDistributions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>(),
        interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsInterceptors() ?? [],
        wrapping: self.claimPeriodRewardDistributions(request:context:)
      )

    case "ClaimPeriodRewardDistributionsByID":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>(),
        interceptors: self.interceptors?.makeClaimPeriodRewardDistributionsByIDInterceptors() ?? [],
        wrapping: self.claimPeriodRewardDistributionsByID(request:context:)
      )

    case "RewardDistributionsByAddress":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>(),
        interceptors: self.interceptors?.makeRewardDistributionsByAddressInterceptors() ?? [],
        wrapping: self.rewardDistributionsByAddress(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Reward_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'rewardProgramByID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRewardProgramByIDInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_QueryRewardProgramByIDRequest, Provenance_Reward_V1_QueryRewardProgramByIDResponse>]

  /// - Returns: Interceptors to use when handling 'rewardPrograms'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRewardProgramsInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_QueryRewardProgramsRequest, Provenance_Reward_V1_QueryRewardProgramsResponse>]

  /// - Returns: Interceptors to use when handling 'claimPeriodRewardDistributions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimPeriodRewardDistributionsInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsResponse>]

  /// - Returns: Interceptors to use when handling 'claimPeriodRewardDistributionsByID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimPeriodRewardDistributionsByIDInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDRequest, Provenance_Reward_V1_QueryClaimPeriodRewardDistributionsByIDResponse>]

  /// - Returns: Interceptors to use when handling 'rewardDistributionsByAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRewardDistributionsByAddressInterceptors() -> [ServerInterceptor<Provenance_Reward_V1_QueryRewardDistributionsByAddressRequest, Provenance_Reward_V1_QueryRewardDistributionsByAddressResponse>]
}

internal enum Provenance_Reward_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.reward.v1.Query",
    methods: [
      Provenance_Reward_V1_QueryServerMetadata.Methods.rewardProgramByID,
      Provenance_Reward_V1_QueryServerMetadata.Methods.rewardPrograms,
      Provenance_Reward_V1_QueryServerMetadata.Methods.claimPeriodRewardDistributions,
      Provenance_Reward_V1_QueryServerMetadata.Methods.claimPeriodRewardDistributionsByID,
      Provenance_Reward_V1_QueryServerMetadata.Methods.rewardDistributionsByAddress,
    ]
  )

  internal enum Methods {
    internal static let rewardProgramByID = GRPCMethodDescriptor(
      name: "RewardProgramByID",
      path: "/provenance.reward.v1.Query/RewardProgramByID",
      type: GRPCCallType.unary
    )

    internal static let rewardPrograms = GRPCMethodDescriptor(
      name: "RewardPrograms",
      path: "/provenance.reward.v1.Query/RewardPrograms",
      type: GRPCCallType.unary
    )

    internal static let claimPeriodRewardDistributions = GRPCMethodDescriptor(
      name: "ClaimPeriodRewardDistributions",
      path: "/provenance.reward.v1.Query/ClaimPeriodRewardDistributions",
      type: GRPCCallType.unary
    )

    internal static let claimPeriodRewardDistributionsByID = GRPCMethodDescriptor(
      name: "ClaimPeriodRewardDistributionsByID",
      path: "/provenance.reward.v1.Query/ClaimPeriodRewardDistributionsByID",
      type: GRPCCallType.unary
    )

    internal static let rewardDistributionsByAddress = GRPCMethodDescriptor(
      name: "RewardDistributionsByAddress",
      path: "/provenance.reward.v1.Query/RewardDistributionsByAddress",
      type: GRPCCallType.unary
    )
  }
}
