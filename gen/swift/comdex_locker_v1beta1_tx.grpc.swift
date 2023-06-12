//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: comdex/locker/v1beta1/tx.proto
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


///For CLI Command & Proposals 
///
/// Usage: instantiate `Comdex_Locker_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Comdex_Locker_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func msgCreateLocker(
    _ request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse>

  func msgDepositAsset(
    _ request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse>

  func msgWithdrawAsset(
    _ request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>

  func msgCloseLocker(
    _ request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse>

  func msgLockerRewardCalc(
    _ request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>
}

extension Comdex_Locker_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "comdex.locker.v1beta1.Msg"
  }

  /// Unary call to MsgCreateLocker
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgCreateLocker.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgCreateLocker(
    _ request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse> {
    return self.makeUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCreateLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCreateLockerInterceptors() ?? []
    )
  }

  /// Unary call to MsgDepositAsset
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgDepositAsset.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgDepositAsset(
    _ request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse> {
    return self.makeUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgDepositAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgDepositAssetInterceptors() ?? []
    )
  }

  /// Unary call to MsgWithdrawAsset
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgWithdrawAsset.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgWithdrawAsset(
    _ request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse> {
    return self.makeUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgWithdrawAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgWithdrawAssetInterceptors() ?? []
    )
  }

  /// Unary call to MsgCloseLocker
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgCloseLocker.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgCloseLocker(
    _ request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse> {
    return self.makeUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCloseLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCloseLockerInterceptors() ?? []
    )
  }

  /// Unary call to MsgLockerRewardCalc
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgLockerRewardCalc.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgLockerRewardCalc(
    _ request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse> {
    return self.makeUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgLockerRewardCalc.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgLockerRewardCalcInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Comdex_Locker_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Comdex_Locker_V1beta1_MsgNIOClient")
internal final class Comdex_Locker_V1beta1_MsgClient: Comdex_Locker_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the comdex.locker.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Comdex_Locker_V1beta1_MsgNIOClient: Comdex_Locker_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the comdex.locker.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

///For CLI Command & Proposals 
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Locker_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeMsgCreateLockerCall(
    _ request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse>

  func makeMsgDepositAssetCall(
    _ request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse>

  func makeMsgWithdrawAssetCall(
    _ request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>

  func makeMsgCloseLockerCall(
    _ request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse>

  func makeMsgLockerRewardCalcCall(
    _ request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Locker_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Locker_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeMsgCreateLockerCall(
    _ request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCreateLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCreateLockerInterceptors() ?? []
    )
  }

  internal func makeMsgDepositAssetCall(
    _ request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgDepositAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgDepositAssetInterceptors() ?? []
    )
  }

  internal func makeMsgWithdrawAssetCall(
    _ request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgWithdrawAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgWithdrawAssetInterceptors() ?? []
    )
  }

  internal func makeMsgCloseLockerCall(
    _ request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCloseLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCloseLockerInterceptors() ?? []
    )
  }

  internal func makeMsgLockerRewardCalcCall(
    _ request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgLockerRewardCalc.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgLockerRewardCalcInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Locker_V1beta1_MsgAsyncClientProtocol {
  internal func msgCreateLocker(
    _ request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Locker_V1beta1_MsgCreateLockerResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCreateLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCreateLockerInterceptors() ?? []
    )
  }

  internal func msgDepositAsset(
    _ request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Locker_V1beta1_MsgDepositAssetResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgDepositAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgDepositAssetInterceptors() ?? []
    )
  }

  internal func msgWithdrawAsset(
    _ request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Locker_V1beta1_MsgWithdrawAssetResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgWithdrawAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgWithdrawAssetInterceptors() ?? []
    )
  }

  internal func msgCloseLocker(
    _ request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Locker_V1beta1_MsgCloseLockerResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCloseLocker.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCloseLockerInterceptors() ?? []
    )
  }

  internal func msgLockerRewardCalc(
    _ request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgLockerRewardCalc.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgLockerRewardCalcInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Comdex_Locker_V1beta1_MsgAsyncClient: Comdex_Locker_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Comdex_Locker_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'msgCreateLocker'.
  func makeMsgCreateLockerInterceptors() -> [ClientInterceptor<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse>]

  /// - Returns: Interceptors to use when invoking 'msgDepositAsset'.
  func makeMsgDepositAssetInterceptors() -> [ClientInterceptor<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse>]

  /// - Returns: Interceptors to use when invoking 'msgWithdrawAsset'.
  func makeMsgWithdrawAssetInterceptors() -> [ClientInterceptor<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>]

  /// - Returns: Interceptors to use when invoking 'msgCloseLocker'.
  func makeMsgCloseLockerInterceptors() -> [ClientInterceptor<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse>]

  /// - Returns: Interceptors to use when invoking 'msgLockerRewardCalc'.
  func makeMsgLockerRewardCalcInterceptors() -> [ClientInterceptor<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>]
}

internal enum Comdex_Locker_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "comdex.locker.v1beta1.Msg",
    methods: [
      Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCreateLocker,
      Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgDepositAsset,
      Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgWithdrawAsset,
      Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgCloseLocker,
      Comdex_Locker_V1beta1_MsgClientMetadata.Methods.msgLockerRewardCalc,
    ]
  )

  internal enum Methods {
    internal static let msgCreateLocker = GRPCMethodDescriptor(
      name: "MsgCreateLocker",
      path: "/comdex.locker.v1beta1.Msg/MsgCreateLocker",
      type: GRPCCallType.unary
    )

    internal static let msgDepositAsset = GRPCMethodDescriptor(
      name: "MsgDepositAsset",
      path: "/comdex.locker.v1beta1.Msg/MsgDepositAsset",
      type: GRPCCallType.unary
    )

    internal static let msgWithdrawAsset = GRPCMethodDescriptor(
      name: "MsgWithdrawAsset",
      path: "/comdex.locker.v1beta1.Msg/MsgWithdrawAsset",
      type: GRPCCallType.unary
    )

    internal static let msgCloseLocker = GRPCMethodDescriptor(
      name: "MsgCloseLocker",
      path: "/comdex.locker.v1beta1.Msg/MsgCloseLocker",
      type: GRPCCallType.unary
    )

    internal static let msgLockerRewardCalc = GRPCMethodDescriptor(
      name: "MsgLockerRewardCalc",
      path: "/comdex.locker.v1beta1.Msg/MsgLockerRewardCalc",
      type: GRPCCallType.unary
    )
  }
}

///For CLI Command & Proposals 
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Comdex_Locker_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Comdex_Locker_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func msgCreateLocker(request: Comdex_Locker_V1beta1_MsgCreateLockerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Locker_V1beta1_MsgCreateLockerResponse>

  func msgDepositAsset(request: Comdex_Locker_V1beta1_MsgDepositAssetRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Locker_V1beta1_MsgDepositAssetResponse>

  func msgWithdrawAsset(request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>

  func msgCloseLocker(request: Comdex_Locker_V1beta1_MsgCloseLockerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Locker_V1beta1_MsgCloseLockerResponse>

  func msgLockerRewardCalc(request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>
}

extension Comdex_Locker_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Comdex_Locker_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MsgCreateLocker":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgCreateLockerRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgCreateLockerResponse>(),
        interceptors: self.interceptors?.makeMsgCreateLockerInterceptors() ?? [],
        userFunction: self.msgCreateLocker(request:context:)
      )

    case "MsgDepositAsset":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgDepositAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgDepositAssetResponse>(),
        interceptors: self.interceptors?.makeMsgDepositAssetInterceptors() ?? [],
        userFunction: self.msgDepositAsset(request:context:)
      )

    case "MsgWithdrawAsset":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>(),
        interceptors: self.interceptors?.makeMsgWithdrawAssetInterceptors() ?? [],
        userFunction: self.msgWithdrawAsset(request:context:)
      )

    case "MsgCloseLocker":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgCloseLockerRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgCloseLockerResponse>(),
        interceptors: self.interceptors?.makeMsgCloseLockerInterceptors() ?? [],
        userFunction: self.msgCloseLocker(request:context:)
      )

    case "MsgLockerRewardCalc":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>(),
        interceptors: self.interceptors?.makeMsgLockerRewardCalcInterceptors() ?? [],
        userFunction: self.msgLockerRewardCalc(request:context:)
      )

    default:
      return nil
    }
  }
}

///For CLI Command & Proposals 
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Locker_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Locker_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func msgCreateLocker(
    request: Comdex_Locker_V1beta1_MsgCreateLockerRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Locker_V1beta1_MsgCreateLockerResponse

  @Sendable func msgDepositAsset(
    request: Comdex_Locker_V1beta1_MsgDepositAssetRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Locker_V1beta1_MsgDepositAssetResponse

  @Sendable func msgWithdrawAsset(
    request: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Locker_V1beta1_MsgWithdrawAssetResponse

  @Sendable func msgCloseLocker(
    request: Comdex_Locker_V1beta1_MsgCloseLockerRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Locker_V1beta1_MsgCloseLockerResponse

  @Sendable func msgLockerRewardCalc(
    request: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Locker_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Locker_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Comdex_Locker_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Comdex_Locker_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MsgCreateLocker":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgCreateLockerRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgCreateLockerResponse>(),
        interceptors: self.interceptors?.makeMsgCreateLockerInterceptors() ?? [],
        wrapping: self.msgCreateLocker(request:context:)
      )

    case "MsgDepositAsset":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgDepositAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgDepositAssetResponse>(),
        interceptors: self.interceptors?.makeMsgDepositAssetInterceptors() ?? [],
        wrapping: self.msgDepositAsset(request:context:)
      )

    case "MsgWithdrawAsset":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>(),
        interceptors: self.interceptors?.makeMsgWithdrawAssetInterceptors() ?? [],
        wrapping: self.msgWithdrawAsset(request:context:)
      )

    case "MsgCloseLocker":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgCloseLockerRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgCloseLockerResponse>(),
        interceptors: self.interceptors?.makeMsgCloseLockerInterceptors() ?? [],
        wrapping: self.msgCloseLocker(request:context:)
      )

    case "MsgLockerRewardCalc":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>(),
        interceptors: self.interceptors?.makeMsgLockerRewardCalcInterceptors() ?? [],
        wrapping: self.msgLockerRewardCalc(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Comdex_Locker_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'msgCreateLocker'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgCreateLockerInterceptors() -> [ServerInterceptor<Comdex_Locker_V1beta1_MsgCreateLockerRequest, Comdex_Locker_V1beta1_MsgCreateLockerResponse>]

  /// - Returns: Interceptors to use when handling 'msgDepositAsset'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgDepositAssetInterceptors() -> [ServerInterceptor<Comdex_Locker_V1beta1_MsgDepositAssetRequest, Comdex_Locker_V1beta1_MsgDepositAssetResponse>]

  /// - Returns: Interceptors to use when handling 'msgWithdrawAsset'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgWithdrawAssetInterceptors() -> [ServerInterceptor<Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, Comdex_Locker_V1beta1_MsgWithdrawAssetResponse>]

  /// - Returns: Interceptors to use when handling 'msgCloseLocker'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgCloseLockerInterceptors() -> [ServerInterceptor<Comdex_Locker_V1beta1_MsgCloseLockerRequest, Comdex_Locker_V1beta1_MsgCloseLockerResponse>]

  /// - Returns: Interceptors to use when handling 'msgLockerRewardCalc'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgLockerRewardCalcInterceptors() -> [ServerInterceptor<Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse>]
}

internal enum Comdex_Locker_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "comdex.locker.v1beta1.Msg",
    methods: [
      Comdex_Locker_V1beta1_MsgServerMetadata.Methods.msgCreateLocker,
      Comdex_Locker_V1beta1_MsgServerMetadata.Methods.msgDepositAsset,
      Comdex_Locker_V1beta1_MsgServerMetadata.Methods.msgWithdrawAsset,
      Comdex_Locker_V1beta1_MsgServerMetadata.Methods.msgCloseLocker,
      Comdex_Locker_V1beta1_MsgServerMetadata.Methods.msgLockerRewardCalc,
    ]
  )

  internal enum Methods {
    internal static let msgCreateLocker = GRPCMethodDescriptor(
      name: "MsgCreateLocker",
      path: "/comdex.locker.v1beta1.Msg/MsgCreateLocker",
      type: GRPCCallType.unary
    )

    internal static let msgDepositAsset = GRPCMethodDescriptor(
      name: "MsgDepositAsset",
      path: "/comdex.locker.v1beta1.Msg/MsgDepositAsset",
      type: GRPCCallType.unary
    )

    internal static let msgWithdrawAsset = GRPCMethodDescriptor(
      name: "MsgWithdrawAsset",
      path: "/comdex.locker.v1beta1.Msg/MsgWithdrawAsset",
      type: GRPCCallType.unary
    )

    internal static let msgCloseLocker = GRPCMethodDescriptor(
      name: "MsgCloseLocker",
      path: "/comdex.locker.v1beta1.Msg/MsgCloseLocker",
      type: GRPCCallType.unary
    )

    internal static let msgLockerRewardCalc = GRPCMethodDescriptor(
      name: "MsgLockerRewardCalc",
      path: "/comdex.locker.v1beta1.Msg/MsgLockerRewardCalc",
      type: GRPCCallType.unary
    )
  }
}
