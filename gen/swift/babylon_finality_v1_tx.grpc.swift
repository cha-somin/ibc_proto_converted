//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: babylon/finality/v1/tx.proto
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
/// Usage: instantiate `Babylon_Finality_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Babylon_Finality_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? { get }

  func commitPubRandList(
    _ request: Babylon_Finality_V1_MsgCommitPubRandList,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse>

  func addFinalitySig(
    _ request: Babylon_Finality_V1_MsgAddFinalitySig,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse>

  func updateParams(
    _ request: Babylon_Finality_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse>
}

extension Babylon_Finality_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "babylon.finality.v1.Msg"
  }

  /// CommitPubRandList commits a list of public randomness for EOTS
  ///
  /// - Parameters:
  ///   - request: Request to send to CommitPubRandList.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func commitPubRandList(
    _ request: Babylon_Finality_V1_MsgCommitPubRandList,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse> {
    return self.makeUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.commitPubRandList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCommitPubRandListInterceptors() ?? []
    )
  }

  /// AddFinalitySig adds a finality signature to a given block
  ///
  /// - Parameters:
  ///   - request: Request to send to AddFinalitySig.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addFinalitySig(
    _ request: Babylon_Finality_V1_MsgAddFinalitySig,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse> {
    return self.makeUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.addFinalitySig.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFinalitySigInterceptors() ?? []
    )
  }

  /// TODO: msg for evidence of equivocation. this is not specified yet
  /// UpdateParams updates the finality module parameters.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Babylon_Finality_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Babylon_Finality_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Babylon_Finality_V1_MsgNIOClient")
internal final class Babylon_Finality_V1_MsgClient: Babylon_Finality_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the babylon.finality.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Babylon_Finality_V1_MsgNIOClient: Babylon_Finality_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the babylon.finality.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Babylon_Finality_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCommitPubRandListCall(
    _ request: Babylon_Finality_V1_MsgCommitPubRandList,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse>

  func makeAddFinalitySigCall(
    _ request: Babylon_Finality_V1_MsgAddFinalitySig,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse>

  func makeUpdateParamsCall(
    _ request: Babylon_Finality_V1_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Finality_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Finality_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCommitPubRandListCall(
    _ request: Babylon_Finality_V1_MsgCommitPubRandList,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.commitPubRandList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCommitPubRandListInterceptors() ?? []
    )
  }

  internal func makeAddFinalitySigCall(
    _ request: Babylon_Finality_V1_MsgAddFinalitySig,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.addFinalitySig.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFinalitySigInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Babylon_Finality_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Finality_V1_MsgAsyncClientProtocol {
  internal func commitPubRandList(
    _ request: Babylon_Finality_V1_MsgCommitPubRandList,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Finality_V1_MsgCommitPubRandListResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.commitPubRandList.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCommitPubRandListInterceptors() ?? []
    )
  }

  internal func addFinalitySig(
    _ request: Babylon_Finality_V1_MsgAddFinalitySig,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Finality_V1_MsgAddFinalitySigResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.addFinalitySig.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddFinalitySigInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Babylon_Finality_V1_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Babylon_Finality_V1_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Babylon_Finality_V1_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Babylon_Finality_V1_MsgAsyncClient: Babylon_Finality_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Babylon_Finality_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'commitPubRandList'.
  func makeCommitPubRandListInterceptors() -> [ClientInterceptor<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse>]

  /// - Returns: Interceptors to use when invoking 'addFinalitySig'.
  func makeAddFinalitySigInterceptors() -> [ClientInterceptor<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse>]
}

internal enum Babylon_Finality_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "babylon.finality.v1.Msg",
    methods: [
      Babylon_Finality_V1_MsgClientMetadata.Methods.commitPubRandList,
      Babylon_Finality_V1_MsgClientMetadata.Methods.addFinalitySig,
      Babylon_Finality_V1_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let commitPubRandList = GRPCMethodDescriptor(
      name: "CommitPubRandList",
      path: "/babylon.finality.v1.Msg/CommitPubRandList",
      type: GRPCCallType.unary
    )

    internal static let addFinalitySig = GRPCMethodDescriptor(
      name: "AddFinalitySig",
      path: "/babylon.finality.v1.Msg/AddFinalitySig",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/babylon.finality.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Babylon_Finality_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Babylon_Finality_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CommitPubRandList commits a list of public randomness for EOTS
  func commitPubRandList(request: Babylon_Finality_V1_MsgCommitPubRandList, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Finality_V1_MsgCommitPubRandListResponse>

  /// AddFinalitySig adds a finality signature to a given block
  func addFinalitySig(request: Babylon_Finality_V1_MsgAddFinalitySig, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Finality_V1_MsgAddFinalitySigResponse>

  /// TODO: msg for evidence of equivocation. this is not specified yet
  /// UpdateParams updates the finality module parameters.
  func updateParams(request: Babylon_Finality_V1_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Babylon_Finality_V1_MsgUpdateParamsResponse>
}

extension Babylon_Finality_V1_MsgProvider {
  internal var serviceName: Substring {
    return Babylon_Finality_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CommitPubRandList":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgCommitPubRandList>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgCommitPubRandListResponse>(),
        interceptors: self.interceptors?.makeCommitPubRandListInterceptors() ?? [],
        userFunction: self.commitPubRandList(request:context:)
      )

    case "AddFinalitySig":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgAddFinalitySig>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgAddFinalitySigResponse>(),
        interceptors: self.interceptors?.makeAddFinalitySigInterceptors() ?? [],
        userFunction: self.addFinalitySig(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgUpdateParamsResponse>(),
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
internal protocol Babylon_Finality_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Babylon_Finality_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// CommitPubRandList commits a list of public randomness for EOTS
  @Sendable func commitPubRandList(
    request: Babylon_Finality_V1_MsgCommitPubRandList,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Finality_V1_MsgCommitPubRandListResponse

  /// AddFinalitySig adds a finality signature to a given block
  @Sendable func addFinalitySig(
    request: Babylon_Finality_V1_MsgAddFinalitySig,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Finality_V1_MsgAddFinalitySigResponse

  /// TODO: msg for evidence of equivocation. this is not specified yet
  /// UpdateParams updates the finality module parameters.
  @Sendable func updateParams(
    request: Babylon_Finality_V1_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Babylon_Finality_V1_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Babylon_Finality_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Babylon_Finality_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Babylon_Finality_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Babylon_Finality_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CommitPubRandList":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgCommitPubRandList>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgCommitPubRandListResponse>(),
        interceptors: self.interceptors?.makeCommitPubRandListInterceptors() ?? [],
        wrapping: self.commitPubRandList(request:context:)
      )

    case "AddFinalitySig":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgAddFinalitySig>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgAddFinalitySigResponse>(),
        interceptors: self.interceptors?.makeAddFinalitySigInterceptors() ?? [],
        wrapping: self.addFinalitySig(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Babylon_Finality_V1_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Babylon_Finality_V1_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Babylon_Finality_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'commitPubRandList'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCommitPubRandListInterceptors() -> [ServerInterceptor<Babylon_Finality_V1_MsgCommitPubRandList, Babylon_Finality_V1_MsgCommitPubRandListResponse>]

  /// - Returns: Interceptors to use when handling 'addFinalitySig'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddFinalitySigInterceptors() -> [ServerInterceptor<Babylon_Finality_V1_MsgAddFinalitySig, Babylon_Finality_V1_MsgAddFinalitySigResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Babylon_Finality_V1_MsgUpdateParams, Babylon_Finality_V1_MsgUpdateParamsResponse>]
}

internal enum Babylon_Finality_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "babylon.finality.v1.Msg",
    methods: [
      Babylon_Finality_V1_MsgServerMetadata.Methods.commitPubRandList,
      Babylon_Finality_V1_MsgServerMetadata.Methods.addFinalitySig,
      Babylon_Finality_V1_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let commitPubRandList = GRPCMethodDescriptor(
      name: "CommitPubRandList",
      path: "/babylon.finality.v1.Msg/CommitPubRandList",
      type: GRPCCallType.unary
    )

    internal static let addFinalitySig = GRPCMethodDescriptor(
      name: "AddFinalitySig",
      path: "/babylon.finality.v1.Msg/AddFinalitySig",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/babylon.finality.v1.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
