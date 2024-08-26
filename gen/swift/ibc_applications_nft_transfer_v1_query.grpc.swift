//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: ibc/applications/nft_transfer/v1/query.proto
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
/// Usage: instantiate `Ibc_Applications_NftTransfer_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Ibc_Applications_NftTransfer_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? { get }

  func classTrace(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>

  func classTraces(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>

  func classHash(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>

  func escrowAddress(
    _ request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>

  func params(
    _ request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse>
}

extension Ibc_Applications_NftTransfer_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "ibc.applications.nft_transfer.v1.Query"
  }

  /// ClassTrace queries a denomination trace information.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClassTrace.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func classTrace(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTrace.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTraceInterceptors() ?? []
    )
  }

  /// ClassTraces queries all denomination traces.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClassTraces.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func classTraces(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTraces.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTracesInterceptors() ?? []
    )
  }

  /// ClassHash queries a class id hash information.
  ///
  /// - Parameters:
  ///   - request: Request to send to ClassHash.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func classHash(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classHash.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassHashInterceptors() ?? []
    )
  }

  /// EscrowAddress returns the escrow address for a particular port and channel id.
  ///
  /// - Parameters:
  ///   - request: Request to send to EscrowAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func escrowAddress(
    _ request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.escrowAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEscrowAddressInterceptors() ?? []
    )
  }

  /// Params queries all parameters of the ibc-transfer module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Ibc_Applications_NftTransfer_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Ibc_Applications_NftTransfer_V1_QueryNIOClient")
internal final class Ibc_Applications_NftTransfer_V1_QueryClient: Ibc_Applications_NftTransfer_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the ibc.applications.nft_transfer.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Ibc_Applications_NftTransfer_V1_QueryNIOClient: Ibc_Applications_NftTransfer_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the ibc.applications.nft_transfer.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ibc_Applications_NftTransfer_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeClassTraceCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>

  func makeClassTracesCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>

  func makeClassHashCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>

  func makeEscrowAddressCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>

  func makeParamsCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_NftTransfer_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ibc_Applications_NftTransfer_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeClassTraceCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTrace.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTraceInterceptors() ?? []
    )
  }

  internal func makeClassTracesCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTraces.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTracesInterceptors() ?? []
    )
  }

  internal func makeClassHashCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classHash.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassHashInterceptors() ?? []
    )
  }

  internal func makeEscrowAddressCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.escrowAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEscrowAddressInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_NftTransfer_V1_QueryAsyncClientProtocol {
  internal func classTrace(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTrace.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTraceInterceptors() ?? []
    )
  }

  internal func classTraces(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTraces.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassTracesInterceptors() ?? []
    )
  }

  internal func classHash(
    _ request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassHashResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classHash.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassHashInterceptors() ?? []
    )
  }

  internal func escrowAddress(
    _ request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.escrowAddress.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEscrowAddressInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Ibc_Applications_NftTransfer_V1_QueryAsyncClient: Ibc_Applications_NftTransfer_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Ibc_Applications_NftTransfer_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'classTrace'.
  func makeClassTraceInterceptors() -> [ClientInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>]

  /// - Returns: Interceptors to use when invoking 'classTraces'.
  func makeClassTracesInterceptors() -> [ClientInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>]

  /// - Returns: Interceptors to use when invoking 'classHash'.
  func makeClassHashInterceptors() -> [ClientInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>]

  /// - Returns: Interceptors to use when invoking 'escrowAddress'.
  func makeEscrowAddressInterceptors() -> [ClientInterceptor<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse>]
}

internal enum Ibc_Applications_NftTransfer_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "ibc.applications.nft_transfer.v1.Query",
    methods: [
      Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTrace,
      Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classTraces,
      Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.classHash,
      Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.escrowAddress,
      Ibc_Applications_NftTransfer_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let classTrace = GRPCMethodDescriptor(
      name: "ClassTrace",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassTrace",
      type: GRPCCallType.unary
    )

    internal static let classTraces = GRPCMethodDescriptor(
      name: "ClassTraces",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassTraces",
      type: GRPCCallType.unary
    )

    internal static let classHash = GRPCMethodDescriptor(
      name: "ClassHash",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassHash",
      type: GRPCCallType.unary
    )

    internal static let escrowAddress = GRPCMethodDescriptor(
      name: "EscrowAddress",
      path: "/ibc.applications.nft_transfer.v1.Query/EscrowAddress",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/ibc.applications.nft_transfer.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query provides defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Ibc_Applications_NftTransfer_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Ibc_Applications_NftTransfer_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// ClassTrace queries a denomination trace information.
  func classTrace(request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>

  /// ClassTraces queries all denomination traces.
  func classTraces(request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>

  /// ClassHash queries a class id hash information.
  func classHash(request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>

  /// EscrowAddress returns the escrow address for a particular port and channel id.
  func escrowAddress(request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>

  /// Params queries all parameters of the ibc-transfer module.
  func params(request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_NftTransfer_V1_QueryParamsResponse>
}

extension Ibc_Applications_NftTransfer_V1_QueryProvider {
  internal var serviceName: Substring {
    return Ibc_Applications_NftTransfer_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ClassTrace":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>(),
        interceptors: self.interceptors?.makeClassTraceInterceptors() ?? [],
        userFunction: self.classTrace(request:context:)
      )

    case "ClassTraces":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>(),
        interceptors: self.interceptors?.makeClassTracesInterceptors() ?? [],
        userFunction: self.classTraces(request:context:)
      )

    case "ClassHash":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>(),
        interceptors: self.interceptors?.makeClassHashInterceptors() ?? [],
        userFunction: self.classHash(request:context:)
      )

    case "EscrowAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>(),
        interceptors: self.interceptors?.makeEscrowAddressInterceptors() ?? [],
        userFunction: self.escrowAddress(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
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
internal protocol Ibc_Applications_NftTransfer_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ibc_Applications_NftTransfer_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// ClassTrace queries a denomination trace information.
  @Sendable func classTrace(
    request: Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse

  /// ClassTraces queries all denomination traces.
  @Sendable func classTraces(
    request: Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse

  /// ClassHash queries a class id hash information.
  @Sendable func classHash(
    request: Ibc_Applications_NftTransfer_V1_QueryClassHashRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryClassHashResponse

  /// EscrowAddress returns the escrow address for a particular port and channel id.
  @Sendable func escrowAddress(
    request: Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse

  /// Params queries all parameters of the ibc-transfer module.
  @Sendable func params(
    request: Ibc_Applications_NftTransfer_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_NftTransfer_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_NftTransfer_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ibc_Applications_NftTransfer_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Ibc_Applications_NftTransfer_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Ibc_Applications_NftTransfer_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ClassTrace":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>(),
        interceptors: self.interceptors?.makeClassTraceInterceptors() ?? [],
        wrapping: self.classTrace(request:context:)
      )

    case "ClassTraces":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>(),
        interceptors: self.interceptors?.makeClassTracesInterceptors() ?? [],
        wrapping: self.classTraces(request:context:)
      )

    case "ClassHash":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>(),
        interceptors: self.interceptors?.makeClassHashInterceptors() ?? [],
        wrapping: self.classHash(request:context:)
      )

    case "EscrowAddress":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>(),
        interceptors: self.interceptors?.makeEscrowAddressInterceptors() ?? [],
        wrapping: self.escrowAddress(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_NftTransfer_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_NftTransfer_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Ibc_Applications_NftTransfer_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'classTrace'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClassTraceInterceptors() -> [ServerInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassTraceRequest, Ibc_Applications_NftTransfer_V1_QueryClassTraceResponse>]

  /// - Returns: Interceptors to use when handling 'classTraces'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClassTracesInterceptors() -> [ServerInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassTracesRequest, Ibc_Applications_NftTransfer_V1_QueryClassTracesResponse>]

  /// - Returns: Interceptors to use when handling 'classHash'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClassHashInterceptors() -> [ServerInterceptor<Ibc_Applications_NftTransfer_V1_QueryClassHashRequest, Ibc_Applications_NftTransfer_V1_QueryClassHashResponse>]

  /// - Returns: Interceptors to use when handling 'escrowAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEscrowAddressInterceptors() -> [ServerInterceptor<Ibc_Applications_NftTransfer_V1_QueryEscrowAddressRequest, Ibc_Applications_NftTransfer_V1_QueryEscrowAddressResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Ibc_Applications_NftTransfer_V1_QueryParamsRequest, Ibc_Applications_NftTransfer_V1_QueryParamsResponse>]
}

internal enum Ibc_Applications_NftTransfer_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "ibc.applications.nft_transfer.v1.Query",
    methods: [
      Ibc_Applications_NftTransfer_V1_QueryServerMetadata.Methods.classTrace,
      Ibc_Applications_NftTransfer_V1_QueryServerMetadata.Methods.classTraces,
      Ibc_Applications_NftTransfer_V1_QueryServerMetadata.Methods.classHash,
      Ibc_Applications_NftTransfer_V1_QueryServerMetadata.Methods.escrowAddress,
      Ibc_Applications_NftTransfer_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let classTrace = GRPCMethodDescriptor(
      name: "ClassTrace",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassTrace",
      type: GRPCCallType.unary
    )

    internal static let classTraces = GRPCMethodDescriptor(
      name: "ClassTraces",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassTraces",
      type: GRPCCallType.unary
    )

    internal static let classHash = GRPCMethodDescriptor(
      name: "ClassHash",
      path: "/ibc.applications.nft_transfer.v1.Query/ClassHash",
      type: GRPCCallType.unary
    )

    internal static let escrowAddress = GRPCMethodDescriptor(
      name: "EscrowAddress",
      path: "/ibc.applications.nft_transfer.v1.Query/EscrowAddress",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/ibc.applications.nft_transfer.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}