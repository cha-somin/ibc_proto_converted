//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: lum-network/dfract/query.proto
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


/// Usage: instantiate `Lum_Network_Dfract_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Lum_Network_Dfract_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? { get }

  func moduleAccountBalance(
    _ request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse>

  func params(
    _ request: Lum_Network_Dfract_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse>

  func getDepositsForAddress(
    _ request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse>

  func fetchDeposits(
    _ request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse>
}

extension Lum_Network_Dfract_QueryClientProtocol {
  internal var serviceName: String {
    return "lum.network.dfract.Query"
  }

  /// Unary call to ModuleAccountBalance
  ///
  /// - Parameters:
  ///   - request: Request to send to ModuleAccountBalance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func moduleAccountBalance(
    _ request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.moduleAccountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? []
    )
  }

  /// Unary call to Params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Lum_Network_Dfract_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Unary call to GetDepositsForAddress
  ///
  /// - Parameters:
  ///   - request: Request to send to GetDepositsForAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getDepositsForAddress(
    _ request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.getDepositsForAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetDepositsForAddressInterceptors() ?? []
    )
  }

  /// Unary call to FetchDeposits
  ///
  /// - Parameters:
  ///   - request: Request to send to FetchDeposits.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func fetchDeposits(
    _ request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse> {
    return self.makeUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.fetchDeposits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchDepositsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Lum_Network_Dfract_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Lum_Network_Dfract_QueryNIOClient")
internal final class Lum_Network_Dfract_QueryClient: Lum_Network_Dfract_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the lum.network.dfract.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Lum_Network_Dfract_QueryNIOClient: Lum_Network_Dfract_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the lum.network.dfract.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Dfract_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? { get }

  func makeModuleAccountBalanceCall(
    _ request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse>

  func makeParamsCall(
    _ request: Lum_Network_Dfract_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse>

  func makeGetDepositsForAddressCall(
    _ request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse>

  func makeFetchDepositsCall(
    _ request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Dfract_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Dfract_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeModuleAccountBalanceCall(
    _ request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.moduleAccountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Lum_Network_Dfract_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeGetDepositsForAddressCall(
    _ request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.getDepositsForAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetDepositsForAddressInterceptors() ?? []
    )
  }

  internal func makeFetchDepositsCall(
    _ request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse> {
    return self.makeAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.fetchDeposits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchDepositsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Dfract_QueryAsyncClientProtocol {
  internal func moduleAccountBalance(
    _ request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Dfract_QueryModuleAccountBalanceResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.moduleAccountBalance.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Lum_Network_Dfract_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Dfract_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func getDepositsForAddress(
    _ request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Dfract_QueryGetDepositsForAddressResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.getDepositsForAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetDepositsForAddressInterceptors() ?? []
    )
  }

  internal func fetchDeposits(
    _ request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Lum_Network_Dfract_QueryFetchDepositsResponse {
    return try await self.performAsyncUnaryCall(
      path: Lum_Network_Dfract_QueryClientMetadata.Methods.fetchDeposits.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFetchDepositsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Lum_Network_Dfract_QueryAsyncClient: Lum_Network_Dfract_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Lum_Network_Dfract_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'moduleAccountBalance'.
  func makeModuleAccountBalanceInterceptors() -> [ClientInterceptor<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'getDepositsForAddress'.
  func makeGetDepositsForAddressInterceptors() -> [ClientInterceptor<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'fetchDeposits'.
  func makeFetchDepositsInterceptors() -> [ClientInterceptor<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse>]
}

internal enum Lum_Network_Dfract_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "lum.network.dfract.Query",
    methods: [
      Lum_Network_Dfract_QueryClientMetadata.Methods.moduleAccountBalance,
      Lum_Network_Dfract_QueryClientMetadata.Methods.params,
      Lum_Network_Dfract_QueryClientMetadata.Methods.getDepositsForAddress,
      Lum_Network_Dfract_QueryClientMetadata.Methods.fetchDeposits,
    ]
  )

  internal enum Methods {
    internal static let moduleAccountBalance = GRPCMethodDescriptor(
      name: "ModuleAccountBalance",
      path: "/lum.network.dfract.Query/ModuleAccountBalance",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/lum.network.dfract.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let getDepositsForAddress = GRPCMethodDescriptor(
      name: "GetDepositsForAddress",
      path: "/lum.network.dfract.Query/GetDepositsForAddress",
      type: GRPCCallType.unary
    )

    internal static let fetchDeposits = GRPCMethodDescriptor(
      name: "FetchDeposits",
      path: "/lum.network.dfract.Query/FetchDeposits",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Lum_Network_Dfract_QueryProvider: CallHandlerProvider {
  var interceptors: Lum_Network_Dfract_QueryServerInterceptorFactoryProtocol? { get }

  func moduleAccountBalance(request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Dfract_QueryModuleAccountBalanceResponse>

  func params(request: Lum_Network_Dfract_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Dfract_QueryParamsResponse>

  func getDepositsForAddress(request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Dfract_QueryGetDepositsForAddressResponse>

  func fetchDeposits(request: Lum_Network_Dfract_QueryFetchDepositsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Dfract_QueryFetchDepositsResponse>
}

extension Lum_Network_Dfract_QueryProvider {
  internal var serviceName: Substring {
    return Lum_Network_Dfract_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ModuleAccountBalance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryModuleAccountBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryModuleAccountBalanceResponse>(),
        interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? [],
        userFunction: self.moduleAccountBalance(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "GetDepositsForAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryGetDepositsForAddressRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryGetDepositsForAddressResponse>(),
        interceptors: self.interceptors?.makeGetDepositsForAddressInterceptors() ?? [],
        userFunction: self.getDepositsForAddress(request:context:)
      )

    case "FetchDeposits":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryFetchDepositsRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryFetchDepositsResponse>(),
        interceptors: self.interceptors?.makeFetchDepositsInterceptors() ?? [],
        userFunction: self.fetchDeposits(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Lum_Network_Dfract_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Lum_Network_Dfract_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func moduleAccountBalance(
    request: Lum_Network_Dfract_QueryModuleAccountBalanceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Dfract_QueryModuleAccountBalanceResponse

  @Sendable func params(
    request: Lum_Network_Dfract_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Dfract_QueryParamsResponse

  @Sendable func getDepositsForAddress(
    request: Lum_Network_Dfract_QueryGetDepositsForAddressRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Dfract_QueryGetDepositsForAddressResponse

  @Sendable func fetchDeposits(
    request: Lum_Network_Dfract_QueryFetchDepositsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Lum_Network_Dfract_QueryFetchDepositsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Lum_Network_Dfract_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Lum_Network_Dfract_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Lum_Network_Dfract_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Lum_Network_Dfract_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ModuleAccountBalance":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryModuleAccountBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryModuleAccountBalanceResponse>(),
        interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? [],
        wrapping: self.moduleAccountBalance(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "GetDepositsForAddress":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryGetDepositsForAddressRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryGetDepositsForAddressResponse>(),
        interceptors: self.interceptors?.makeGetDepositsForAddressInterceptors() ?? [],
        wrapping: self.getDepositsForAddress(request:context:)
      )

    case "FetchDeposits":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Dfract_QueryFetchDepositsRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Dfract_QueryFetchDepositsResponse>(),
        interceptors: self.interceptors?.makeFetchDepositsInterceptors() ?? [],
        wrapping: self.fetchDeposits(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Lum_Network_Dfract_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'moduleAccountBalance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeModuleAccountBalanceInterceptors() -> [ServerInterceptor<Lum_Network_Dfract_QueryModuleAccountBalanceRequest, Lum_Network_Dfract_QueryModuleAccountBalanceResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Lum_Network_Dfract_QueryParamsRequest, Lum_Network_Dfract_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'getDepositsForAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetDepositsForAddressInterceptors() -> [ServerInterceptor<Lum_Network_Dfract_QueryGetDepositsForAddressRequest, Lum_Network_Dfract_QueryGetDepositsForAddressResponse>]

  /// - Returns: Interceptors to use when handling 'fetchDeposits'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFetchDepositsInterceptors() -> [ServerInterceptor<Lum_Network_Dfract_QueryFetchDepositsRequest, Lum_Network_Dfract_QueryFetchDepositsResponse>]
}

internal enum Lum_Network_Dfract_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "lum.network.dfract.Query",
    methods: [
      Lum_Network_Dfract_QueryServerMetadata.Methods.moduleAccountBalance,
      Lum_Network_Dfract_QueryServerMetadata.Methods.params,
      Lum_Network_Dfract_QueryServerMetadata.Methods.getDepositsForAddress,
      Lum_Network_Dfract_QueryServerMetadata.Methods.fetchDeposits,
    ]
  )

  internal enum Methods {
    internal static let moduleAccountBalance = GRPCMethodDescriptor(
      name: "ModuleAccountBalance",
      path: "/lum.network.dfract.Query/ModuleAccountBalance",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/lum.network.dfract.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let getDepositsForAddress = GRPCMethodDescriptor(
      name: "GetDepositsForAddress",
      path: "/lum.network.dfract.Query/GetDepositsForAddress",
      type: GRPCCallType.unary
    )

    internal static let fetchDeposits = GRPCMethodDescriptor(
      name: "FetchDeposits",
      path: "/lum.network.dfract.Query/FetchDeposits",
      type: GRPCCallType.unary
    )
  }
}
