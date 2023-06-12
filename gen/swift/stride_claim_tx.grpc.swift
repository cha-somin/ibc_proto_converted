//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stride/claim/tx.proto
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
/// Usage: instantiate `Stride_Claim_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Stride_Claim_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? { get }

  func setAirdropAllocations(
    _ request: Stride_Claim_MsgSetAirdropAllocations,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse>

  func claimFreeAmount(
    _ request: Stride_Claim_MsgClaimFreeAmount,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse>

  func createAirdrop(
    _ request: Stride_Claim_MsgCreateAirdrop,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse>

  func deleteAirdrop(
    _ request: Stride_Claim_MsgDeleteAirdrop,
    callOptions: CallOptions?
  ) -> UnaryCall<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse>
}

extension Stride_Claim_MsgClientProtocol {
  internal var serviceName: String {
    return "stride.claim.Msg"
  }

  /// Unary call to SetAirdropAllocations
  ///
  /// - Parameters:
  ///   - request: Request to send to SetAirdropAllocations.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setAirdropAllocations(
    _ request: Stride_Claim_MsgSetAirdropAllocations,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse> {
    return self.makeUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.setAirdropAllocations.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAirdropAllocationsInterceptors() ?? []
    )
  }

  /// Unary call to ClaimFreeAmount
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimFreeAmount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimFreeAmount(
    _ request: Stride_Claim_MsgClaimFreeAmount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse> {
    return self.makeUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.claimFreeAmount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimFreeAmountInterceptors() ?? []
    )
  }

  /// Unary call to CreateAirdrop
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateAirdrop.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createAirdrop(
    _ request: Stride_Claim_MsgCreateAirdrop,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse> {
    return self.makeUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.createAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateAirdropInterceptors() ?? []
    )
  }

  /// Unary call to DeleteAirdrop
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteAirdrop.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteAirdrop(
    _ request: Stride_Claim_MsgDeleteAirdrop,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse> {
    return self.makeUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.deleteAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAirdropInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stride_Claim_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stride_Claim_MsgNIOClient")
internal final class Stride_Claim_MsgClient: Stride_Claim_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stride.claim.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stride_Claim_MsgNIOClient: Stride_Claim_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the stride.claim.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Claim_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetAirdropAllocationsCall(
    _ request: Stride_Claim_MsgSetAirdropAllocations,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse>

  func makeClaimFreeAmountCall(
    _ request: Stride_Claim_MsgClaimFreeAmount,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse>

  func makeCreateAirdropCall(
    _ request: Stride_Claim_MsgCreateAirdrop,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse>

  func makeDeleteAirdropCall(
    _ request: Stride_Claim_MsgDeleteAirdrop,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Claim_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Claim_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetAirdropAllocationsCall(
    _ request: Stride_Claim_MsgSetAirdropAllocations,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.setAirdropAllocations.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAirdropAllocationsInterceptors() ?? []
    )
  }

  internal func makeClaimFreeAmountCall(
    _ request: Stride_Claim_MsgClaimFreeAmount,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.claimFreeAmount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimFreeAmountInterceptors() ?? []
    )
  }

  internal func makeCreateAirdropCall(
    _ request: Stride_Claim_MsgCreateAirdrop,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.createAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateAirdropInterceptors() ?? []
    )
  }

  internal func makeDeleteAirdropCall(
    _ request: Stride_Claim_MsgDeleteAirdrop,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse> {
    return self.makeAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.deleteAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAirdropInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Claim_MsgAsyncClientProtocol {
  internal func setAirdropAllocations(
    _ request: Stride_Claim_MsgSetAirdropAllocations,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Claim_MsgSetAirdropAllocationsResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.setAirdropAllocations.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAirdropAllocationsInterceptors() ?? []
    )
  }

  internal func claimFreeAmount(
    _ request: Stride_Claim_MsgClaimFreeAmount,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Claim_MsgClaimFreeAmountResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.claimFreeAmount.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimFreeAmountInterceptors() ?? []
    )
  }

  internal func createAirdrop(
    _ request: Stride_Claim_MsgCreateAirdrop,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Claim_MsgCreateAirdropResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.createAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateAirdropInterceptors() ?? []
    )
  }

  internal func deleteAirdrop(
    _ request: Stride_Claim_MsgDeleteAirdrop,
    callOptions: CallOptions? = nil
  ) async throws -> Stride_Claim_MsgDeleteAirdropResponse {
    return try await self.performAsyncUnaryCall(
      path: Stride_Claim_MsgClientMetadata.Methods.deleteAirdrop.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAirdropInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stride_Claim_MsgAsyncClient: Stride_Claim_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Claim_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stride_Claim_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setAirdropAllocations'.
  func makeSetAirdropAllocationsInterceptors() -> [ClientInterceptor<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimFreeAmount'.
  func makeClaimFreeAmountInterceptors() -> [ClientInterceptor<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse>]

  /// - Returns: Interceptors to use when invoking 'createAirdrop'.
  func makeCreateAirdropInterceptors() -> [ClientInterceptor<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteAirdrop'.
  func makeDeleteAirdropInterceptors() -> [ClientInterceptor<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse>]
}

internal enum Stride_Claim_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stride.claim.Msg",
    methods: [
      Stride_Claim_MsgClientMetadata.Methods.setAirdropAllocations,
      Stride_Claim_MsgClientMetadata.Methods.claimFreeAmount,
      Stride_Claim_MsgClientMetadata.Methods.createAirdrop,
      Stride_Claim_MsgClientMetadata.Methods.deleteAirdrop,
    ]
  )

  internal enum Methods {
    internal static let setAirdropAllocations = GRPCMethodDescriptor(
      name: "SetAirdropAllocations",
      path: "/stride.claim.Msg/SetAirdropAllocations",
      type: GRPCCallType.unary
    )

    internal static let claimFreeAmount = GRPCMethodDescriptor(
      name: "ClaimFreeAmount",
      path: "/stride.claim.Msg/ClaimFreeAmount",
      type: GRPCCallType.unary
    )

    internal static let createAirdrop = GRPCMethodDescriptor(
      name: "CreateAirdrop",
      path: "/stride.claim.Msg/CreateAirdrop",
      type: GRPCCallType.unary
    )

    internal static let deleteAirdrop = GRPCMethodDescriptor(
      name: "DeleteAirdrop",
      path: "/stride.claim.Msg/DeleteAirdrop",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stride_Claim_MsgProvider: CallHandlerProvider {
  var interceptors: Stride_Claim_MsgServerInterceptorFactoryProtocol? { get }

  func setAirdropAllocations(request: Stride_Claim_MsgSetAirdropAllocations, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Claim_MsgSetAirdropAllocationsResponse>

  func claimFreeAmount(request: Stride_Claim_MsgClaimFreeAmount, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Claim_MsgClaimFreeAmountResponse>

  func createAirdrop(request: Stride_Claim_MsgCreateAirdrop, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Claim_MsgCreateAirdropResponse>

  func deleteAirdrop(request: Stride_Claim_MsgDeleteAirdrop, context: StatusOnlyCallContext) -> EventLoopFuture<Stride_Claim_MsgDeleteAirdropResponse>
}

extension Stride_Claim_MsgProvider {
  internal var serviceName: Substring {
    return Stride_Claim_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetAirdropAllocations":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgSetAirdropAllocations>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgSetAirdropAllocationsResponse>(),
        interceptors: self.interceptors?.makeSetAirdropAllocationsInterceptors() ?? [],
        userFunction: self.setAirdropAllocations(request:context:)
      )

    case "ClaimFreeAmount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgClaimFreeAmount>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgClaimFreeAmountResponse>(),
        interceptors: self.interceptors?.makeClaimFreeAmountInterceptors() ?? [],
        userFunction: self.claimFreeAmount(request:context:)
      )

    case "CreateAirdrop":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgCreateAirdrop>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgCreateAirdropResponse>(),
        interceptors: self.interceptors?.makeCreateAirdropInterceptors() ?? [],
        userFunction: self.createAirdrop(request:context:)
      )

    case "DeleteAirdrop":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgDeleteAirdrop>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgDeleteAirdropResponse>(),
        interceptors: self.interceptors?.makeDeleteAirdropInterceptors() ?? [],
        userFunction: self.deleteAirdrop(request:context:)
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
internal protocol Stride_Claim_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Claim_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func setAirdropAllocations(
    request: Stride_Claim_MsgSetAirdropAllocations,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Claim_MsgSetAirdropAllocationsResponse

  @Sendable func claimFreeAmount(
    request: Stride_Claim_MsgClaimFreeAmount,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Claim_MsgClaimFreeAmountResponse

  @Sendable func createAirdrop(
    request: Stride_Claim_MsgCreateAirdrop,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Claim_MsgCreateAirdropResponse

  @Sendable func deleteAirdrop(
    request: Stride_Claim_MsgDeleteAirdrop,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stride_Claim_MsgDeleteAirdropResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Claim_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Claim_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stride_Claim_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stride_Claim_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetAirdropAllocations":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgSetAirdropAllocations>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgSetAirdropAllocationsResponse>(),
        interceptors: self.interceptors?.makeSetAirdropAllocationsInterceptors() ?? [],
        wrapping: self.setAirdropAllocations(request:context:)
      )

    case "ClaimFreeAmount":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgClaimFreeAmount>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgClaimFreeAmountResponse>(),
        interceptors: self.interceptors?.makeClaimFreeAmountInterceptors() ?? [],
        wrapping: self.claimFreeAmount(request:context:)
      )

    case "CreateAirdrop":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgCreateAirdrop>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgCreateAirdropResponse>(),
        interceptors: self.interceptors?.makeCreateAirdropInterceptors() ?? [],
        wrapping: self.createAirdrop(request:context:)
      )

    case "DeleteAirdrop":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stride_Claim_MsgDeleteAirdrop>(),
        responseSerializer: ProtobufSerializer<Stride_Claim_MsgDeleteAirdropResponse>(),
        interceptors: self.interceptors?.makeDeleteAirdropInterceptors() ?? [],
        wrapping: self.deleteAirdrop(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stride_Claim_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setAirdropAllocations'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetAirdropAllocationsInterceptors() -> [ServerInterceptor<Stride_Claim_MsgSetAirdropAllocations, Stride_Claim_MsgSetAirdropAllocationsResponse>]

  /// - Returns: Interceptors to use when handling 'claimFreeAmount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimFreeAmountInterceptors() -> [ServerInterceptor<Stride_Claim_MsgClaimFreeAmount, Stride_Claim_MsgClaimFreeAmountResponse>]

  /// - Returns: Interceptors to use when handling 'createAirdrop'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateAirdropInterceptors() -> [ServerInterceptor<Stride_Claim_MsgCreateAirdrop, Stride_Claim_MsgCreateAirdropResponse>]

  /// - Returns: Interceptors to use when handling 'deleteAirdrop'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteAirdropInterceptors() -> [ServerInterceptor<Stride_Claim_MsgDeleteAirdrop, Stride_Claim_MsgDeleteAirdropResponse>]
}

internal enum Stride_Claim_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stride.claim.Msg",
    methods: [
      Stride_Claim_MsgServerMetadata.Methods.setAirdropAllocations,
      Stride_Claim_MsgServerMetadata.Methods.claimFreeAmount,
      Stride_Claim_MsgServerMetadata.Methods.createAirdrop,
      Stride_Claim_MsgServerMetadata.Methods.deleteAirdrop,
    ]
  )

  internal enum Methods {
    internal static let setAirdropAllocations = GRPCMethodDescriptor(
      name: "SetAirdropAllocations",
      path: "/stride.claim.Msg/SetAirdropAllocations",
      type: GRPCCallType.unary
    )

    internal static let claimFreeAmount = GRPCMethodDescriptor(
      name: "ClaimFreeAmount",
      path: "/stride.claim.Msg/ClaimFreeAmount",
      type: GRPCCallType.unary
    )

    internal static let createAirdrop = GRPCMethodDescriptor(
      name: "CreateAirdrop",
      path: "/stride.claim.Msg/CreateAirdrop",
      type: GRPCCallType.unary
    )

    internal static let deleteAirdrop = GRPCMethodDescriptor(
      name: "DeleteAirdrop",
      path: "/stride.claim.Msg/DeleteAirdrop",
      type: GRPCCallType.unary
    )
  }
}
