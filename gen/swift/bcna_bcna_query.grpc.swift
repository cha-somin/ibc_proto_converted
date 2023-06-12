//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: bcna/bcna/query.proto
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
/// Usage: instantiate `Bitcannaglobal_Bcna_Bcna_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Bitcannaglobal_Bcna_Bcna_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>

  func bitcannaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>

  func bitcannaidAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>

  func bitcannaidByBcnaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>

  func supplychain(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>

  func supplychainAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>
}

extension Bitcannaglobal_Bcna_Bcna_QueryClientProtocol {
  internal var serviceName: String {
    return "bitcannaglobal.bcna.bcna.Query"
  }

  /// Parameters queries the parameters of the module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Queries a Bitcannaid by id.
  ///
  /// - Parameters:
  ///   - request: Request to send to Bitcannaid.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bitcannaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidInterceptors() ?? []
    )
  }

  /// Queries a list of Bitcannaid items.
  ///
  /// - Parameters:
  ///   - request: Request to send to BitcannaidAll.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bitcannaidAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidAllInterceptors() ?? []
    )
  }

  /// Queries a Bitcannaid by bcnaid.
  ///
  /// - Parameters:
  ///   - request: Request to send to BitcannaidByBcnaid.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bitcannaidByBcnaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidByBcnaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidByBcnaidInterceptors() ?? []
    )
  }

  /// Queries a Supplychain by id.
  ///
  /// - Parameters:
  ///   - request: Request to send to Supplychain.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func supplychain(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychain.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainInterceptors() ?? []
    )
  }

  /// Queries a list of Supplychain items.
  ///
  /// - Parameters:
  ///   - request: Request to send to SupplychainAll.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func supplychainAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse> {
    return self.makeUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychainAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainAllInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Bitcannaglobal_Bcna_Bcna_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Bitcannaglobal_Bcna_Bcna_QueryNIOClient")
internal final class Bitcannaglobal_Bcna_Bcna_QueryClient: Bitcannaglobal_Bcna_Bcna_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the bitcannaglobal.bcna.bcna.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Bitcannaglobal_Bcna_Bcna_QueryNIOClient: Bitcannaglobal_Bcna_Bcna_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the bitcannaglobal.bcna.bcna.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Bitcannaglobal_Bcna_Bcna_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>

  func makeBitcannaidCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>

  func makeBitcannaidAllCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>

  func makeBitcannaidByBcnaidCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>

  func makeSupplychainCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>

  func makeSupplychainAllCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitcannaglobal_Bcna_Bcna_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeBitcannaidCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidInterceptors() ?? []
    )
  }

  internal func makeBitcannaidAllCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidAllInterceptors() ?? []
    )
  }

  internal func makeBitcannaidByBcnaidCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidByBcnaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidByBcnaidInterceptors() ?? []
    )
  }

  internal func makeSupplychainCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychain.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainInterceptors() ?? []
    )
  }

  internal func makeSupplychainAllCall(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychainAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainAllInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitcannaglobal_Bcna_Bcna_QueryAsyncClientProtocol {
  internal func params(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func bitcannaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidInterceptors() ?? []
    )
  }

  internal func bitcannaidAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidAllInterceptors() ?? []
    )
  }

  internal func bitcannaidByBcnaid(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidByBcnaid.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBitcannaidByBcnaidInterceptors() ?? []
    )
  }

  internal func supplychain(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychain.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainInterceptors() ?? []
    )
  }

  internal func supplychainAll(
    _ request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychainAll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplychainAllInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Bitcannaglobal_Bcna_Bcna_QueryAsyncClient: Bitcannaglobal_Bcna_Bcna_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Bitcannaglobal_Bcna_Bcna_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'bitcannaid'.
  func makeBitcannaidInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>]

  /// - Returns: Interceptors to use when invoking 'bitcannaidAll'.
  func makeBitcannaidAllInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>]

  /// - Returns: Interceptors to use when invoking 'bitcannaidByBcnaid'.
  func makeBitcannaidByBcnaidInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>]

  /// - Returns: Interceptors to use when invoking 'supplychain'.
  func makeSupplychainInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>]

  /// - Returns: Interceptors to use when invoking 'supplychainAll'.
  func makeSupplychainAllInterceptors() -> [ClientInterceptor<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>]
}

internal enum Bitcannaglobal_Bcna_Bcna_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "bitcannaglobal.bcna.bcna.Query",
    methods: [
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.params,
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaid,
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidAll,
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.bitcannaidByBcnaid,
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychain,
      Bitcannaglobal_Bcna_Bcna_QueryClientMetadata.Methods.supplychainAll,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/bitcannaglobal.bcna.bcna.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let bitcannaid = GRPCMethodDescriptor(
      name: "Bitcannaid",
      path: "/bitcannaglobal.bcna.bcna.Query/Bitcannaid",
      type: GRPCCallType.unary
    )

    internal static let bitcannaidAll = GRPCMethodDescriptor(
      name: "BitcannaidAll",
      path: "/bitcannaglobal.bcna.bcna.Query/BitcannaidAll",
      type: GRPCCallType.unary
    )

    internal static let bitcannaidByBcnaid = GRPCMethodDescriptor(
      name: "BitcannaidByBcnaid",
      path: "/bitcannaglobal.bcna.bcna.Query/BitcannaidByBcnaid",
      type: GRPCCallType.unary
    )

    internal static let supplychain = GRPCMethodDescriptor(
      name: "Supplychain",
      path: "/bitcannaglobal.bcna.bcna.Query/Supplychain",
      type: GRPCCallType.unary
    )

    internal static let supplychainAll = GRPCMethodDescriptor(
      name: "SupplychainAll",
      path: "/bitcannaglobal.bcna.bcna.Query/SupplychainAll",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Bitcannaglobal_Bcna_Bcna_QueryProvider: CallHandlerProvider {
  var interceptors: Bitcannaglobal_Bcna_Bcna_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  func params(request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>

  /// Queries a Bitcannaid by id.
  func bitcannaid(request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>

  /// Queries a list of Bitcannaid items.
  func bitcannaidAll(request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>

  /// Queries a Bitcannaid by bcnaid.
  func bitcannaidByBcnaid(request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>

  /// Queries a Supplychain by id.
  func supplychain(request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>

  /// Queries a list of Supplychain items.
  func supplychainAll(request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>
}

extension Bitcannaglobal_Bcna_Bcna_QueryProvider {
  internal var serviceName: Substring {
    return Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Bitcannaid":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidInterceptors() ?? [],
        userFunction: self.bitcannaid(request:context:)
      )

    case "BitcannaidAll":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidAllInterceptors() ?? [],
        userFunction: self.bitcannaidAll(request:context:)
      )

    case "BitcannaidByBcnaid":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidByBcnaidInterceptors() ?? [],
        userFunction: self.bitcannaidByBcnaid(request:context:)
      )

    case "Supplychain":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>(),
        interceptors: self.interceptors?.makeSupplychainInterceptors() ?? [],
        userFunction: self.supplychain(request:context:)
      )

    case "SupplychainAll":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>(),
        interceptors: self.interceptors?.makeSupplychainAllInterceptors() ?? [],
        userFunction: self.supplychainAll(request:context:)
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
internal protocol Bitcannaglobal_Bcna_Bcna_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bitcannaglobal_Bcna_Bcna_QueryServerInterceptorFactoryProtocol? { get }

  /// Parameters queries the parameters of the module.
  @Sendable func params(
    request: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryParamsResponse

  /// Queries a Bitcannaid by id.
  @Sendable func bitcannaid(
    request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse

  /// Queries a list of Bitcannaid items.
  @Sendable func bitcannaidAll(
    request: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse

  /// Queries a Bitcannaid by bcnaid.
  @Sendable func bitcannaidByBcnaid(
    request: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse

  /// Queries a Supplychain by id.
  @Sendable func supplychain(
    request: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse

  /// Queries a list of Supplychain items.
  @Sendable func supplychainAll(
    request: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitcannaglobal_Bcna_Bcna_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Bitcannaglobal_Bcna_Bcna_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Bitcannaid":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidInterceptors() ?? [],
        wrapping: self.bitcannaid(request:context:)
      )

    case "BitcannaidAll":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidAllInterceptors() ?? [],
        wrapping: self.bitcannaidAll(request:context:)
      )

    case "BitcannaidByBcnaid":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>(),
        interceptors: self.interceptors?.makeBitcannaidByBcnaidInterceptors() ?? [],
        wrapping: self.bitcannaidByBcnaid(request:context:)
      )

    case "Supplychain":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>(),
        interceptors: self.interceptors?.makeSupplychainInterceptors() ?? [],
        wrapping: self.supplychain(request:context:)
      )

    case "SupplychainAll":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest>(),
        responseSerializer: ProtobufSerializer<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>(),
        interceptors: self.interceptors?.makeSupplychainAllInterceptors() ?? [],
        wrapping: self.supplychainAll(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Bitcannaglobal_Bcna_Bcna_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, Bitcannaglobal_Bcna_Bcna_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'bitcannaid'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBitcannaidInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse>]

  /// - Returns: Interceptors to use when handling 'bitcannaidAll'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBitcannaidAllInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse>]

  /// - Returns: Interceptors to use when handling 'bitcannaidByBcnaid'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBitcannaidByBcnaidInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse>]

  /// - Returns: Interceptors to use when handling 'supplychain'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSupplychainInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse>]

  /// - Returns: Interceptors to use when handling 'supplychainAll'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSupplychainAllInterceptors() -> [ServerInterceptor<Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse>]
}

internal enum Bitcannaglobal_Bcna_Bcna_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "bitcannaglobal.bcna.bcna.Query",
    methods: [
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.params,
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.bitcannaid,
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.bitcannaidAll,
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.bitcannaidByBcnaid,
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.supplychain,
      Bitcannaglobal_Bcna_Bcna_QueryServerMetadata.Methods.supplychainAll,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/bitcannaglobal.bcna.bcna.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let bitcannaid = GRPCMethodDescriptor(
      name: "Bitcannaid",
      path: "/bitcannaglobal.bcna.bcna.Query/Bitcannaid",
      type: GRPCCallType.unary
    )

    internal static let bitcannaidAll = GRPCMethodDescriptor(
      name: "BitcannaidAll",
      path: "/bitcannaglobal.bcna.bcna.Query/BitcannaidAll",
      type: GRPCCallType.unary
    )

    internal static let bitcannaidByBcnaid = GRPCMethodDescriptor(
      name: "BitcannaidByBcnaid",
      path: "/bitcannaglobal.bcna.bcna.Query/BitcannaidByBcnaid",
      type: GRPCCallType.unary
    )

    internal static let supplychain = GRPCMethodDescriptor(
      name: "Supplychain",
      path: "/bitcannaglobal.bcna.bcna.Query/Supplychain",
      type: GRPCCallType.unary
    )

    internal static let supplychainAll = GRPCMethodDescriptor(
      name: "SupplychainAll",
      path: "/bitcannaglobal.bcna.bcna.Query/SupplychainAll",
      type: GRPCCallType.unary
    )
  }
}
