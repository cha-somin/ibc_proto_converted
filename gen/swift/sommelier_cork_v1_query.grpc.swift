//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: sommelier/cork/v1/query.proto
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


/// Query defines the gRPC query service for the cork module.
///
/// Usage: instantiate `Cork_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Cork_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? { get }

  func queryParams(
    _ request: Cork_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse>

  func querySubmittedCorks(
    _ request: Cork_V1_QuerySubmittedCorksRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse>

  func queryCommitPeriod(
    _ request: Cork_V1_QueryCommitPeriodRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse>

  func queryCellarIDs(
    _ request: Cork_V1_QueryCellarIDsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse>

  func queryScheduledCorks(
    _ request: Cork_V1_QueryScheduledCorksRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse>

  func queryScheduledBlockHeights(
    _ request: Cork_V1_QueryScheduledBlockHeightsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse>

  func queryScheduledCorksByBlockHeight(
    _ request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse>
}

extension Cork_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "cork.v1.Query"
  }

  /// QueryParams queries the allocation module parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryParams(
    _ request: Cork_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryParamsInterceptors() ?? []
    )
  }

  /// QuerySubmittedCorks queries the submitted corks awaiting vote
  ///
  /// - Parameters:
  ///   - request: Request to send to QuerySubmittedCorks.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func querySubmittedCorks(
    _ request: Cork_V1_QuerySubmittedCorksRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.querySubmittedCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQuerySubmittedCorksInterceptors() ?? []
    )
  }

  /// QueryCommitPeriod queries the heights for the current voting period (current, start and end)
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryCommitPeriod.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryCommitPeriod(
    _ request: Cork_V1_QueryCommitPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCommitPeriod.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCommitPeriodInterceptors() ?? []
    )
  }

  /// QueryCellarIDs returns all cellars and current tick ranges
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryCellarIDs.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryCellarIDs(
    _ request: Cork_V1_QueryCellarIDsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCellarIDs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCellarIDsInterceptors() ?? []
    )
  }

  /// QueryScheduledCorks returns all scheduled corks
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryScheduledCorks.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryScheduledCorks(
    _ request: Cork_V1_QueryScheduledCorksRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksInterceptors() ?? []
    )
  }

  /// QueryScheduledBlockHeights returns all scheduled block heights
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryScheduledBlockHeights.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryScheduledBlockHeights(
    _ request: Cork_V1_QueryScheduledBlockHeightsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledBlockHeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledBlockHeightsInterceptors() ?? []
    )
  }

  /// QueryScheduledCorks returns all scheduled corks at a block height
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryScheduledCorksByBlockHeight.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryScheduledCorksByBlockHeight(
    _ request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse> {
    return self.makeUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorksByBlockHeight.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksByBlockHeightInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Cork_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cork_V1_QueryNIOClient")
internal final class Cork_V1_QueryClient: Cork_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cork.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cork_V1_QueryNIOClient: Cork_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the cork.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC query service for the cork module.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cork_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeQueryParamsCall(
    _ request: Cork_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse>

  func makeQuerySubmittedCorksCall(
    _ request: Cork_V1_QuerySubmittedCorksRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse>

  func makeQueryCommitPeriodCall(
    _ request: Cork_V1_QueryCommitPeriodRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse>

  func makeQueryCellarIdsCall(
    _ request: Cork_V1_QueryCellarIDsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse>

  func makeQueryScheduledCorksCall(
    _ request: Cork_V1_QueryScheduledCorksRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse>

  func makeQueryScheduledBlockHeightsCall(
    _ request: Cork_V1_QueryScheduledBlockHeightsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse>

  func makeQueryScheduledCorksByBlockHeightCall(
    _ request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cork_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cork_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeQueryParamsCall(
    _ request: Cork_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryParamsInterceptors() ?? []
    )
  }

  internal func makeQuerySubmittedCorksCall(
    _ request: Cork_V1_QuerySubmittedCorksRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.querySubmittedCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQuerySubmittedCorksInterceptors() ?? []
    )
  }

  internal func makeQueryCommitPeriodCall(
    _ request: Cork_V1_QueryCommitPeriodRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCommitPeriod.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCommitPeriodInterceptors() ?? []
    )
  }

  internal func makeQueryCellarIdsCall(
    _ request: Cork_V1_QueryCellarIDsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCellarIDs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCellarIDsInterceptors() ?? []
    )
  }

  internal func makeQueryScheduledCorksCall(
    _ request: Cork_V1_QueryScheduledCorksRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksInterceptors() ?? []
    )
  }

  internal func makeQueryScheduledBlockHeightsCall(
    _ request: Cork_V1_QueryScheduledBlockHeightsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledBlockHeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledBlockHeightsInterceptors() ?? []
    )
  }

  internal func makeQueryScheduledCorksByBlockHeightCall(
    _ request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse> {
    return self.makeAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorksByBlockHeight.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksByBlockHeightInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cork_V1_QueryAsyncClientProtocol {
  internal func queryParams(
    _ request: Cork_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryParamsInterceptors() ?? []
    )
  }

  internal func querySubmittedCorks(
    _ request: Cork_V1_QuerySubmittedCorksRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QuerySubmittedCorksResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.querySubmittedCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQuerySubmittedCorksInterceptors() ?? []
    )
  }

  internal func queryCommitPeriod(
    _ request: Cork_V1_QueryCommitPeriodRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryCommitPeriodResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCommitPeriod.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCommitPeriodInterceptors() ?? []
    )
  }

  internal func queryCellarIDs(
    _ request: Cork_V1_QueryCellarIDsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryCellarIDsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryCellarIDs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryCellarIDsInterceptors() ?? []
    )
  }

  internal func queryScheduledCorks(
    _ request: Cork_V1_QueryScheduledCorksRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryScheduledCorksResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorks.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksInterceptors() ?? []
    )
  }

  internal func queryScheduledBlockHeights(
    _ request: Cork_V1_QueryScheduledBlockHeightsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryScheduledBlockHeightsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledBlockHeights.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledBlockHeightsInterceptors() ?? []
    )
  }

  internal func queryScheduledCorksByBlockHeight(
    _ request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cork_V1_QueryScheduledCorksByBlockHeightResponse {
    return try await self.performAsyncUnaryCall(
      path: Cork_V1_QueryClientMetadata.Methods.queryScheduledCorksByBlockHeight.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryScheduledCorksByBlockHeightInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cork_V1_QueryAsyncClient: Cork_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cork_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cork_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'queryParams'.
  func makeQueryParamsInterceptors() -> [ClientInterceptor<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'querySubmittedCorks'.
  func makeQuerySubmittedCorksInterceptors() -> [ClientInterceptor<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse>]

  /// - Returns: Interceptors to use when invoking 'queryCommitPeriod'.
  func makeQueryCommitPeriodInterceptors() -> [ClientInterceptor<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse>]

  /// - Returns: Interceptors to use when invoking 'queryCellarIDs'.
  func makeQueryCellarIDsInterceptors() -> [ClientInterceptor<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse>]

  /// - Returns: Interceptors to use when invoking 'queryScheduledCorks'.
  func makeQueryScheduledCorksInterceptors() -> [ClientInterceptor<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse>]

  /// - Returns: Interceptors to use when invoking 'queryScheduledBlockHeights'.
  func makeQueryScheduledBlockHeightsInterceptors() -> [ClientInterceptor<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse>]

  /// - Returns: Interceptors to use when invoking 'queryScheduledCorksByBlockHeight'.
  func makeQueryScheduledCorksByBlockHeightInterceptors() -> [ClientInterceptor<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse>]
}

internal enum Cork_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cork.v1.Query",
    methods: [
      Cork_V1_QueryClientMetadata.Methods.queryParams,
      Cork_V1_QueryClientMetadata.Methods.querySubmittedCorks,
      Cork_V1_QueryClientMetadata.Methods.queryCommitPeriod,
      Cork_V1_QueryClientMetadata.Methods.queryCellarIDs,
      Cork_V1_QueryClientMetadata.Methods.queryScheduledCorks,
      Cork_V1_QueryClientMetadata.Methods.queryScheduledBlockHeights,
      Cork_V1_QueryClientMetadata.Methods.queryScheduledCorksByBlockHeight,
    ]
  )

  internal enum Methods {
    internal static let queryParams = GRPCMethodDescriptor(
      name: "QueryParams",
      path: "/cork.v1.Query/QueryParams",
      type: GRPCCallType.unary
    )

    internal static let querySubmittedCorks = GRPCMethodDescriptor(
      name: "QuerySubmittedCorks",
      path: "/cork.v1.Query/QuerySubmittedCorks",
      type: GRPCCallType.unary
    )

    internal static let queryCommitPeriod = GRPCMethodDescriptor(
      name: "QueryCommitPeriod",
      path: "/cork.v1.Query/QueryCommitPeriod",
      type: GRPCCallType.unary
    )

    internal static let queryCellarIDs = GRPCMethodDescriptor(
      name: "QueryCellarIDs",
      path: "/cork.v1.Query/QueryCellarIDs",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledCorks = GRPCMethodDescriptor(
      name: "QueryScheduledCorks",
      path: "/cork.v1.Query/QueryScheduledCorks",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledBlockHeights = GRPCMethodDescriptor(
      name: "QueryScheduledBlockHeights",
      path: "/cork.v1.Query/QueryScheduledBlockHeights",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledCorksByBlockHeight = GRPCMethodDescriptor(
      name: "QueryScheduledCorksByBlockHeight",
      path: "/cork.v1.Query/QueryScheduledCorksByBlockHeight",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC query service for the cork module.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cork_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Cork_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// QueryParams queries the allocation module parameters.
  func queryParams(request: Cork_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryParamsResponse>

  /// QuerySubmittedCorks queries the submitted corks awaiting vote
  func querySubmittedCorks(request: Cork_V1_QuerySubmittedCorksRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QuerySubmittedCorksResponse>

  /// QueryCommitPeriod queries the heights for the current voting period (current, start and end)
  func queryCommitPeriod(request: Cork_V1_QueryCommitPeriodRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryCommitPeriodResponse>

  /// QueryCellarIDs returns all cellars and current tick ranges
  func queryCellarIDs(request: Cork_V1_QueryCellarIDsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryCellarIDsResponse>

  /// QueryScheduledCorks returns all scheduled corks
  func queryScheduledCorks(request: Cork_V1_QueryScheduledCorksRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryScheduledCorksResponse>

  /// QueryScheduledBlockHeights returns all scheduled block heights
  func queryScheduledBlockHeights(request: Cork_V1_QueryScheduledBlockHeightsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryScheduledBlockHeightsResponse>

  /// QueryScheduledCorks returns all scheduled corks at a block height
  func queryScheduledCorksByBlockHeight(request: Cork_V1_QueryScheduledCorksByBlockHeightRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cork_V1_QueryScheduledCorksByBlockHeightResponse>
}

extension Cork_V1_QueryProvider {
  internal var serviceName: Substring {
    return Cork_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "QueryParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeQueryParamsInterceptors() ?? [],
        userFunction: self.queryParams(request:context:)
      )

    case "QuerySubmittedCorks":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QuerySubmittedCorksRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QuerySubmittedCorksResponse>(),
        interceptors: self.interceptors?.makeQuerySubmittedCorksInterceptors() ?? [],
        userFunction: self.querySubmittedCorks(request:context:)
      )

    case "QueryCommitPeriod":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryCommitPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryCommitPeriodResponse>(),
        interceptors: self.interceptors?.makeQueryCommitPeriodInterceptors() ?? [],
        userFunction: self.queryCommitPeriod(request:context:)
      )

    case "QueryCellarIDs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryCellarIDsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryCellarIDsResponse>(),
        interceptors: self.interceptors?.makeQueryCellarIDsInterceptors() ?? [],
        userFunction: self.queryCellarIDs(request:context:)
      )

    case "QueryScheduledCorks":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledCorksRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledCorksResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledCorksInterceptors() ?? [],
        userFunction: self.queryScheduledCorks(request:context:)
      )

    case "QueryScheduledBlockHeights":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledBlockHeightsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledBlockHeightsResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledBlockHeightsInterceptors() ?? [],
        userFunction: self.queryScheduledBlockHeights(request:context:)
      )

    case "QueryScheduledCorksByBlockHeight":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledCorksByBlockHeightRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledCorksByBlockHeightResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledCorksByBlockHeightInterceptors() ?? [],
        userFunction: self.queryScheduledCorksByBlockHeight(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC query service for the cork module.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cork_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cork_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// QueryParams queries the allocation module parameters.
  @Sendable func queryParams(
    request: Cork_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryParamsResponse

  /// QuerySubmittedCorks queries the submitted corks awaiting vote
  @Sendable func querySubmittedCorks(
    request: Cork_V1_QuerySubmittedCorksRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QuerySubmittedCorksResponse

  /// QueryCommitPeriod queries the heights for the current voting period (current, start and end)
  @Sendable func queryCommitPeriod(
    request: Cork_V1_QueryCommitPeriodRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryCommitPeriodResponse

  /// QueryCellarIDs returns all cellars and current tick ranges
  @Sendable func queryCellarIDs(
    request: Cork_V1_QueryCellarIDsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryCellarIDsResponse

  /// QueryScheduledCorks returns all scheduled corks
  @Sendable func queryScheduledCorks(
    request: Cork_V1_QueryScheduledCorksRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryScheduledCorksResponse

  /// QueryScheduledBlockHeights returns all scheduled block heights
  @Sendable func queryScheduledBlockHeights(
    request: Cork_V1_QueryScheduledBlockHeightsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryScheduledBlockHeightsResponse

  /// QueryScheduledCorks returns all scheduled corks at a block height
  @Sendable func queryScheduledCorksByBlockHeight(
    request: Cork_V1_QueryScheduledCorksByBlockHeightRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cork_V1_QueryScheduledCorksByBlockHeightResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cork_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cork_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cork_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cork_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "QueryParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeQueryParamsInterceptors() ?? [],
        wrapping: self.queryParams(request:context:)
      )

    case "QuerySubmittedCorks":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QuerySubmittedCorksRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QuerySubmittedCorksResponse>(),
        interceptors: self.interceptors?.makeQuerySubmittedCorksInterceptors() ?? [],
        wrapping: self.querySubmittedCorks(request:context:)
      )

    case "QueryCommitPeriod":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryCommitPeriodRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryCommitPeriodResponse>(),
        interceptors: self.interceptors?.makeQueryCommitPeriodInterceptors() ?? [],
        wrapping: self.queryCommitPeriod(request:context:)
      )

    case "QueryCellarIDs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryCellarIDsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryCellarIDsResponse>(),
        interceptors: self.interceptors?.makeQueryCellarIDsInterceptors() ?? [],
        wrapping: self.queryCellarIDs(request:context:)
      )

    case "QueryScheduledCorks":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledCorksRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledCorksResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledCorksInterceptors() ?? [],
        wrapping: self.queryScheduledCorks(request:context:)
      )

    case "QueryScheduledBlockHeights":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledBlockHeightsRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledBlockHeightsResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledBlockHeightsInterceptors() ?? [],
        wrapping: self.queryScheduledBlockHeights(request:context:)
      )

    case "QueryScheduledCorksByBlockHeight":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cork_V1_QueryScheduledCorksByBlockHeightRequest>(),
        responseSerializer: ProtobufSerializer<Cork_V1_QueryScheduledCorksByBlockHeightResponse>(),
        interceptors: self.interceptors?.makeQueryScheduledCorksByBlockHeightInterceptors() ?? [],
        wrapping: self.queryScheduledCorksByBlockHeight(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cork_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'queryParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryParamsInterceptors() -> [ServerInterceptor<Cork_V1_QueryParamsRequest, Cork_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'querySubmittedCorks'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQuerySubmittedCorksInterceptors() -> [ServerInterceptor<Cork_V1_QuerySubmittedCorksRequest, Cork_V1_QuerySubmittedCorksResponse>]

  /// - Returns: Interceptors to use when handling 'queryCommitPeriod'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryCommitPeriodInterceptors() -> [ServerInterceptor<Cork_V1_QueryCommitPeriodRequest, Cork_V1_QueryCommitPeriodResponse>]

  /// - Returns: Interceptors to use when handling 'queryCellarIDs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryCellarIDsInterceptors() -> [ServerInterceptor<Cork_V1_QueryCellarIDsRequest, Cork_V1_QueryCellarIDsResponse>]

  /// - Returns: Interceptors to use when handling 'queryScheduledCorks'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryScheduledCorksInterceptors() -> [ServerInterceptor<Cork_V1_QueryScheduledCorksRequest, Cork_V1_QueryScheduledCorksResponse>]

  /// - Returns: Interceptors to use when handling 'queryScheduledBlockHeights'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryScheduledBlockHeightsInterceptors() -> [ServerInterceptor<Cork_V1_QueryScheduledBlockHeightsRequest, Cork_V1_QueryScheduledBlockHeightsResponse>]

  /// - Returns: Interceptors to use when handling 'queryScheduledCorksByBlockHeight'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryScheduledCorksByBlockHeightInterceptors() -> [ServerInterceptor<Cork_V1_QueryScheduledCorksByBlockHeightRequest, Cork_V1_QueryScheduledCorksByBlockHeightResponse>]
}

internal enum Cork_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cork.v1.Query",
    methods: [
      Cork_V1_QueryServerMetadata.Methods.queryParams,
      Cork_V1_QueryServerMetadata.Methods.querySubmittedCorks,
      Cork_V1_QueryServerMetadata.Methods.queryCommitPeriod,
      Cork_V1_QueryServerMetadata.Methods.queryCellarIDs,
      Cork_V1_QueryServerMetadata.Methods.queryScheduledCorks,
      Cork_V1_QueryServerMetadata.Methods.queryScheduledBlockHeights,
      Cork_V1_QueryServerMetadata.Methods.queryScheduledCorksByBlockHeight,
    ]
  )

  internal enum Methods {
    internal static let queryParams = GRPCMethodDescriptor(
      name: "QueryParams",
      path: "/cork.v1.Query/QueryParams",
      type: GRPCCallType.unary
    )

    internal static let querySubmittedCorks = GRPCMethodDescriptor(
      name: "QuerySubmittedCorks",
      path: "/cork.v1.Query/QuerySubmittedCorks",
      type: GRPCCallType.unary
    )

    internal static let queryCommitPeriod = GRPCMethodDescriptor(
      name: "QueryCommitPeriod",
      path: "/cork.v1.Query/QueryCommitPeriod",
      type: GRPCCallType.unary
    )

    internal static let queryCellarIDs = GRPCMethodDescriptor(
      name: "QueryCellarIDs",
      path: "/cork.v1.Query/QueryCellarIDs",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledCorks = GRPCMethodDescriptor(
      name: "QueryScheduledCorks",
      path: "/cork.v1.Query/QueryScheduledCorks",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledBlockHeights = GRPCMethodDescriptor(
      name: "QueryScheduledBlockHeights",
      path: "/cork.v1.Query/QueryScheduledBlockHeights",
      type: GRPCCallType.unary
    )

    internal static let queryScheduledCorksByBlockHeight = GRPCMethodDescriptor(
      name: "QueryScheduledCorksByBlockHeight",
      path: "/cork.v1.Query/QueryScheduledCorksByBlockHeight",
      type: GRPCCallType.unary
    )
  }
}
