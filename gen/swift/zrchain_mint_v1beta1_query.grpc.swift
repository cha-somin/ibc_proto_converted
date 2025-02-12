//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: zrchain/mint/v1beta1/query.proto
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


/// Query provides defines the gRPC querier service.
///
/// Usage: instantiate `Zrchain_Mint_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Zrchain_Mint_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse>

  func inflation(
    _ request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse>

  func annualProvisions(
    _ request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>
}

extension Zrchain_Mint_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "zrchain.mint.v1beta1.Query"
  }

  /// Params returns the total set of minting parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Inflation returns the current minting inflation value.
  ///
  /// - Parameters:
  ///   - request: Request to send to Inflation.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func inflation(
    _ request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse> {
    return self.makeUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }

  /// AnnualProvisions current minting annual provisions value.
  ///
  /// - Parameters:
  ///   - request: Request to send to AnnualProvisions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func annualProvisions(
    _ request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse> {
    return self.makeUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.annualProvisions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnnualProvisionsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Zrchain_Mint_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Zrchain_Mint_V1beta1_QueryNIOClient")
internal final class Zrchain_Mint_V1beta1_QueryClient: Zrchain_Mint_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the zrchain.mint.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Zrchain_Mint_V1beta1_QueryNIOClient: Zrchain_Mint_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the zrchain.mint.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Zrchain_Mint_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse>

  func makeInflationCall(
    _ request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse>

  func makeAnnualProvisionsCall(
    _ request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Zrchain_Mint_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Zrchain_Mint_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeInflationCall(
    _ request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse> {
    return self.makeAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }

  internal func makeAnnualProvisionsCall(
    _ request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse> {
    return self.makeAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.annualProvisions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnnualProvisionsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Zrchain_Mint_V1beta1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Zrchain_Mint_V1beta1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func inflation(
    _ request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Zrchain_Mint_V1beta1_QueryInflationResponse {
    return try await self.performAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }

  internal func annualProvisions(
    _ request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse {
    return try await self.performAsyncUnaryCall(
      path: Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.annualProvisions.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnnualProvisionsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Zrchain_Mint_V1beta1_QueryAsyncClient: Zrchain_Mint_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Zrchain_Mint_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'inflation'.
  func makeInflationInterceptors() -> [ClientInterceptor<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse>]

  /// - Returns: Interceptors to use when invoking 'annualProvisions'.
  func makeAnnualProvisionsInterceptors() -> [ClientInterceptor<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>]
}

internal enum Zrchain_Mint_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "zrchain.mint.v1beta1.Query",
    methods: [
      Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.params,
      Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.inflation,
      Zrchain_Mint_V1beta1_QueryClientMetadata.Methods.annualProvisions,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/zrchain.mint.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let inflation = GRPCMethodDescriptor(
      name: "Inflation",
      path: "/zrchain.mint.v1beta1.Query/Inflation",
      type: GRPCCallType.unary
    )

    internal static let annualProvisions = GRPCMethodDescriptor(
      name: "AnnualProvisions",
      path: "/zrchain.mint.v1beta1.Query/AnnualProvisions",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Zrchain_Mint_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Zrchain_Mint_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of minting parameters.
  func params(request: Zrchain_Mint_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Zrchain_Mint_V1beta1_QueryParamsResponse>

  /// Inflation returns the current minting inflation value.
  func inflation(request: Zrchain_Mint_V1beta1_QueryInflationRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Zrchain_Mint_V1beta1_QueryInflationResponse>

  /// AnnualProvisions current minting annual provisions value.
  func annualProvisions(request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>
}

extension Zrchain_Mint_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Zrchain_Mint_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
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
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Inflation":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryInflationRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryInflationResponse>(),
        interceptors: self.interceptors?.makeInflationInterceptors() ?? [],
        userFunction: self.inflation(request:context:)
      )

    case "AnnualProvisions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>(),
        interceptors: self.interceptors?.makeAnnualProvisionsInterceptors() ?? [],
        userFunction: self.annualProvisions(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query provides defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Zrchain_Mint_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Zrchain_Mint_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params returns the total set of minting parameters.
  @Sendable func params(
    request: Zrchain_Mint_V1beta1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Zrchain_Mint_V1beta1_QueryParamsResponse

  /// Inflation returns the current minting inflation value.
  @Sendable func inflation(
    request: Zrchain_Mint_V1beta1_QueryInflationRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Zrchain_Mint_V1beta1_QueryInflationResponse

  /// AnnualProvisions current minting annual provisions value.
  @Sendable func annualProvisions(
    request: Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Zrchain_Mint_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Zrchain_Mint_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Zrchain_Mint_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Zrchain_Mint_V1beta1_QueryServerInterceptorFactoryProtocol? {
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
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Inflation":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryInflationRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryInflationResponse>(),
        interceptors: self.interceptors?.makeInflationInterceptors() ?? [],
        wrapping: self.inflation(request:context:)
      )

    case "AnnualProvisions":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest>(),
        responseSerializer: ProtobufSerializer<Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>(),
        interceptors: self.interceptors?.makeAnnualProvisionsInterceptors() ?? [],
        wrapping: self.annualProvisions(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Zrchain_Mint_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Zrchain_Mint_V1beta1_QueryParamsRequest, Zrchain_Mint_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'inflation'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInflationInterceptors() -> [ServerInterceptor<Zrchain_Mint_V1beta1_QueryInflationRequest, Zrchain_Mint_V1beta1_QueryInflationResponse>]

  /// - Returns: Interceptors to use when handling 'annualProvisions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAnnualProvisionsInterceptors() -> [ServerInterceptor<Zrchain_Mint_V1beta1_QueryAnnualProvisionsRequest, Zrchain_Mint_V1beta1_QueryAnnualProvisionsResponse>]
}

internal enum Zrchain_Mint_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "zrchain.mint.v1beta1.Query",
    methods: [
      Zrchain_Mint_V1beta1_QueryServerMetadata.Methods.params,
      Zrchain_Mint_V1beta1_QueryServerMetadata.Methods.inflation,
      Zrchain_Mint_V1beta1_QueryServerMetadata.Methods.annualProvisions,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/zrchain.mint.v1beta1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let inflation = GRPCMethodDescriptor(
      name: "Inflation",
      path: "/zrchain.mint.v1beta1.Query/Inflation",
      type: GRPCCallType.unary
    )

    internal static let annualProvisions = GRPCMethodDescriptor(
      name: "AnnualProvisions",
      path: "/zrchain.mint.v1beta1.Query/AnnualProvisions",
      type: GRPCCallType.unary
    )
  }
}
