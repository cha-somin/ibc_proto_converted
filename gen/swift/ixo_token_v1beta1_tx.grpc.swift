//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: ixo/token/v1beta1/tx.proto
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


/// Msg defines the project Msg service.
///
/// Usage: instantiate `Ixo_Token_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Ixo_Token_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createToken(
    _ request: Ixo_Token_V1beta1_MsgCreateToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse>

  func mintToken(
    _ request: Ixo_Token_V1beta1_MsgMintToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse>

  func transferToken(
    _ request: Ixo_Token_V1beta1_MsgTransferToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse>

  func retireToken(
    _ request: Ixo_Token_V1beta1_MsgRetireToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse>

  func cancelToken(
    _ request: Ixo_Token_V1beta1_MsgCancelToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse>

  func pauseToken(
    _ request: Ixo_Token_V1beta1_MsgPauseToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse>

  func stopToken(
    _ request: Ixo_Token_V1beta1_MsgStopToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse>
}

extension Ixo_Token_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "ixo.token.v1beta1.Msg"
  }

  /// Unary call to CreateToken
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createToken(
    _ request: Ixo_Token_V1beta1_MsgCreateToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.createToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenInterceptors() ?? []
    )
  }

  /// Unary call to MintToken
  ///
  /// - Parameters:
  ///   - request: Request to send to MintToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func mintToken(
    _ request: Ixo_Token_V1beta1_MsgMintToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.mintToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintTokenInterceptors() ?? []
    )
  }

  /// Unary call to TransferToken
  ///
  /// - Parameters:
  ///   - request: Request to send to TransferToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func transferToken(
    _ request: Ixo_Token_V1beta1_MsgTransferToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.transferToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferTokenInterceptors() ?? []
    )
  }

  /// Unary call to RetireToken
  ///
  /// - Parameters:
  ///   - request: Request to send to RetireToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func retireToken(
    _ request: Ixo_Token_V1beta1_MsgRetireToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.retireToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRetireTokenInterceptors() ?? []
    )
  }

  /// Unary call to CancelToken
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelToken(
    _ request: Ixo_Token_V1beta1_MsgCancelToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.cancelToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelTokenInterceptors() ?? []
    )
  }

  /// Unary call to PauseToken
  ///
  /// - Parameters:
  ///   - request: Request to send to PauseToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pauseToken(
    _ request: Ixo_Token_V1beta1_MsgPauseToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.pauseToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePauseTokenInterceptors() ?? []
    )
  }

  /// Unary call to StopToken
  ///
  /// - Parameters:
  ///   - request: Request to send to StopToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func stopToken(
    _ request: Ixo_Token_V1beta1_MsgStopToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse> {
    return self.makeUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.stopToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStopTokenInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Ixo_Token_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Ixo_Token_V1beta1_MsgNIOClient")
internal final class Ixo_Token_V1beta1_MsgClient: Ixo_Token_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the ixo.token.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Ixo_Token_V1beta1_MsgNIOClient: Ixo_Token_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the ixo.token.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the project Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ixo_Token_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateTokenCall(
    _ request: Ixo_Token_V1beta1_MsgCreateToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse>

  func makeMintTokenCall(
    _ request: Ixo_Token_V1beta1_MsgMintToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse>

  func makeTransferTokenCall(
    _ request: Ixo_Token_V1beta1_MsgTransferToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse>

  func makeRetireTokenCall(
    _ request: Ixo_Token_V1beta1_MsgRetireToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse>

  func makeCancelTokenCall(
    _ request: Ixo_Token_V1beta1_MsgCancelToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse>

  func makePauseTokenCall(
    _ request: Ixo_Token_V1beta1_MsgPauseToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse>

  func makeStopTokenCall(
    _ request: Ixo_Token_V1beta1_MsgStopToken,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Token_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ixo_Token_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateTokenCall(
    _ request: Ixo_Token_V1beta1_MsgCreateToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.createToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenInterceptors() ?? []
    )
  }

  internal func makeMintTokenCall(
    _ request: Ixo_Token_V1beta1_MsgMintToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.mintToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintTokenInterceptors() ?? []
    )
  }

  internal func makeTransferTokenCall(
    _ request: Ixo_Token_V1beta1_MsgTransferToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.transferToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferTokenInterceptors() ?? []
    )
  }

  internal func makeRetireTokenCall(
    _ request: Ixo_Token_V1beta1_MsgRetireToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.retireToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRetireTokenInterceptors() ?? []
    )
  }

  internal func makeCancelTokenCall(
    _ request: Ixo_Token_V1beta1_MsgCancelToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.cancelToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelTokenInterceptors() ?? []
    )
  }

  internal func makePauseTokenCall(
    _ request: Ixo_Token_V1beta1_MsgPauseToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.pauseToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePauseTokenInterceptors() ?? []
    )
  }

  internal func makeStopTokenCall(
    _ request: Ixo_Token_V1beta1_MsgStopToken,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.stopToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStopTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Token_V1beta1_MsgAsyncClientProtocol {
  internal func createToken(
    _ request: Ixo_Token_V1beta1_MsgCreateToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgCreateTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.createToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTokenInterceptors() ?? []
    )
  }

  internal func mintToken(
    _ request: Ixo_Token_V1beta1_MsgMintToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgMintTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.mintToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintTokenInterceptors() ?? []
    )
  }

  internal func transferToken(
    _ request: Ixo_Token_V1beta1_MsgTransferToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgTransferTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.transferToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferTokenInterceptors() ?? []
    )
  }

  internal func retireToken(
    _ request: Ixo_Token_V1beta1_MsgRetireToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgRetireTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.retireToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRetireTokenInterceptors() ?? []
    )
  }

  internal func cancelToken(
    _ request: Ixo_Token_V1beta1_MsgCancelToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgCancelTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.cancelToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelTokenInterceptors() ?? []
    )
  }

  internal func pauseToken(
    _ request: Ixo_Token_V1beta1_MsgPauseToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgPauseTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.pauseToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePauseTokenInterceptors() ?? []
    )
  }

  internal func stopToken(
    _ request: Ixo_Token_V1beta1_MsgStopToken,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Token_V1beta1_MsgStopTokenResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Token_V1beta1_MsgClientMetadata.Methods.stopToken.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStopTokenInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Ixo_Token_V1beta1_MsgAsyncClient: Ixo_Token_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Ixo_Token_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createToken'.
  func makeCreateTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'mintToken'.
  func makeMintTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'transferToken'.
  func makeTransferTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'retireToken'.
  func makeRetireTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelToken'.
  func makeCancelTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'pauseToken'.
  func makePauseTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse>]

  /// - Returns: Interceptors to use when invoking 'stopToken'.
  func makeStopTokenInterceptors() -> [ClientInterceptor<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse>]
}

internal enum Ixo_Token_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ixo.token.v1beta1.Msg",
    methods: [
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.createToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.mintToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.transferToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.retireToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.cancelToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.pauseToken,
      Ixo_Token_V1beta1_MsgClientMetadata.Methods.stopToken,
    ]
  )

  internal enum Methods {
    internal static let createToken = GRPCMethodDescriptor(
      name: "CreateToken",
      path: "/ixo.token.v1beta1.Msg/CreateToken",
      type: GRPCCallType.unary
    )

    internal static let mintToken = GRPCMethodDescriptor(
      name: "MintToken",
      path: "/ixo.token.v1beta1.Msg/MintToken",
      type: GRPCCallType.unary
    )

    internal static let transferToken = GRPCMethodDescriptor(
      name: "TransferToken",
      path: "/ixo.token.v1beta1.Msg/TransferToken",
      type: GRPCCallType.unary
    )

    internal static let retireToken = GRPCMethodDescriptor(
      name: "RetireToken",
      path: "/ixo.token.v1beta1.Msg/RetireToken",
      type: GRPCCallType.unary
    )

    internal static let cancelToken = GRPCMethodDescriptor(
      name: "CancelToken",
      path: "/ixo.token.v1beta1.Msg/CancelToken",
      type: GRPCCallType.unary
    )

    internal static let pauseToken = GRPCMethodDescriptor(
      name: "PauseToken",
      path: "/ixo.token.v1beta1.Msg/PauseToken",
      type: GRPCCallType.unary
    )

    internal static let stopToken = GRPCMethodDescriptor(
      name: "StopToken",
      path: "/ixo.token.v1beta1.Msg/StopToken",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the project Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Ixo_Token_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Ixo_Token_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func createToken(request: Ixo_Token_V1beta1_MsgCreateToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgCreateTokenResponse>

  func mintToken(request: Ixo_Token_V1beta1_MsgMintToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgMintTokenResponse>

  func transferToken(request: Ixo_Token_V1beta1_MsgTransferToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgTransferTokenResponse>

  func retireToken(request: Ixo_Token_V1beta1_MsgRetireToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgRetireTokenResponse>

  func cancelToken(request: Ixo_Token_V1beta1_MsgCancelToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgCancelTokenResponse>

  func pauseToken(request: Ixo_Token_V1beta1_MsgPauseToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgPauseTokenResponse>

  func stopToken(request: Ixo_Token_V1beta1_MsgStopToken, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Token_V1beta1_MsgStopTokenResponse>
}

extension Ixo_Token_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Ixo_Token_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgCreateToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgCreateTokenResponse>(),
        interceptors: self.interceptors?.makeCreateTokenInterceptors() ?? [],
        userFunction: self.createToken(request:context:)
      )

    case "MintToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgMintToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgMintTokenResponse>(),
        interceptors: self.interceptors?.makeMintTokenInterceptors() ?? [],
        userFunction: self.mintToken(request:context:)
      )

    case "TransferToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgTransferToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgTransferTokenResponse>(),
        interceptors: self.interceptors?.makeTransferTokenInterceptors() ?? [],
        userFunction: self.transferToken(request:context:)
      )

    case "RetireToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgRetireToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgRetireTokenResponse>(),
        interceptors: self.interceptors?.makeRetireTokenInterceptors() ?? [],
        userFunction: self.retireToken(request:context:)
      )

    case "CancelToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgCancelToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgCancelTokenResponse>(),
        interceptors: self.interceptors?.makeCancelTokenInterceptors() ?? [],
        userFunction: self.cancelToken(request:context:)
      )

    case "PauseToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgPauseToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgPauseTokenResponse>(),
        interceptors: self.interceptors?.makePauseTokenInterceptors() ?? [],
        userFunction: self.pauseToken(request:context:)
      )

    case "StopToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgStopToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgStopTokenResponse>(),
        interceptors: self.interceptors?.makeStopTokenInterceptors() ?? [],
        userFunction: self.stopToken(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the project Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ixo_Token_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ixo_Token_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func createToken(
    request: Ixo_Token_V1beta1_MsgCreateToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgCreateTokenResponse

  @Sendable func mintToken(
    request: Ixo_Token_V1beta1_MsgMintToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgMintTokenResponse

  @Sendable func transferToken(
    request: Ixo_Token_V1beta1_MsgTransferToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgTransferTokenResponse

  @Sendable func retireToken(
    request: Ixo_Token_V1beta1_MsgRetireToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgRetireTokenResponse

  @Sendable func cancelToken(
    request: Ixo_Token_V1beta1_MsgCancelToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgCancelTokenResponse

  @Sendable func pauseToken(
    request: Ixo_Token_V1beta1_MsgPauseToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgPauseTokenResponse

  @Sendable func stopToken(
    request: Ixo_Token_V1beta1_MsgStopToken,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Token_V1beta1_MsgStopTokenResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Token_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ixo_Token_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Ixo_Token_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Ixo_Token_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgCreateToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgCreateTokenResponse>(),
        interceptors: self.interceptors?.makeCreateTokenInterceptors() ?? [],
        wrapping: self.createToken(request:context:)
      )

    case "MintToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgMintToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgMintTokenResponse>(),
        interceptors: self.interceptors?.makeMintTokenInterceptors() ?? [],
        wrapping: self.mintToken(request:context:)
      )

    case "TransferToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgTransferToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgTransferTokenResponse>(),
        interceptors: self.interceptors?.makeTransferTokenInterceptors() ?? [],
        wrapping: self.transferToken(request:context:)
      )

    case "RetireToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgRetireToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgRetireTokenResponse>(),
        interceptors: self.interceptors?.makeRetireTokenInterceptors() ?? [],
        wrapping: self.retireToken(request:context:)
      )

    case "CancelToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgCancelToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgCancelTokenResponse>(),
        interceptors: self.interceptors?.makeCancelTokenInterceptors() ?? [],
        wrapping: self.cancelToken(request:context:)
      )

    case "PauseToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgPauseToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgPauseTokenResponse>(),
        interceptors: self.interceptors?.makePauseTokenInterceptors() ?? [],
        wrapping: self.pauseToken(request:context:)
      )

    case "StopToken":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Token_V1beta1_MsgStopToken>(),
        responseSerializer: ProtobufSerializer<Ixo_Token_V1beta1_MsgStopTokenResponse>(),
        interceptors: self.interceptors?.makeStopTokenInterceptors() ?? [],
        wrapping: self.stopToken(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Ixo_Token_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgCreateToken, Ixo_Token_V1beta1_MsgCreateTokenResponse>]

  /// - Returns: Interceptors to use when handling 'mintToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMintTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgMintToken, Ixo_Token_V1beta1_MsgMintTokenResponse>]

  /// - Returns: Interceptors to use when handling 'transferToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTransferTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgTransferToken, Ixo_Token_V1beta1_MsgTransferTokenResponse>]

  /// - Returns: Interceptors to use when handling 'retireToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRetireTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgRetireToken, Ixo_Token_V1beta1_MsgRetireTokenResponse>]

  /// - Returns: Interceptors to use when handling 'cancelToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgCancelToken, Ixo_Token_V1beta1_MsgCancelTokenResponse>]

  /// - Returns: Interceptors to use when handling 'pauseToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePauseTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgPauseToken, Ixo_Token_V1beta1_MsgPauseTokenResponse>]

  /// - Returns: Interceptors to use when handling 'stopToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStopTokenInterceptors() -> [ServerInterceptor<Ixo_Token_V1beta1_MsgStopToken, Ixo_Token_V1beta1_MsgStopTokenResponse>]
}

internal enum Ixo_Token_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ixo.token.v1beta1.Msg",
    methods: [
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.createToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.mintToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.transferToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.retireToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.cancelToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.pauseToken,
      Ixo_Token_V1beta1_MsgServerMetadata.Methods.stopToken,
    ]
  )

  internal enum Methods {
    internal static let createToken = GRPCMethodDescriptor(
      name: "CreateToken",
      path: "/ixo.token.v1beta1.Msg/CreateToken",
      type: GRPCCallType.unary
    )

    internal static let mintToken = GRPCMethodDescriptor(
      name: "MintToken",
      path: "/ixo.token.v1beta1.Msg/MintToken",
      type: GRPCCallType.unary
    )

    internal static let transferToken = GRPCMethodDescriptor(
      name: "TransferToken",
      path: "/ixo.token.v1beta1.Msg/TransferToken",
      type: GRPCCallType.unary
    )

    internal static let retireToken = GRPCMethodDescriptor(
      name: "RetireToken",
      path: "/ixo.token.v1beta1.Msg/RetireToken",
      type: GRPCCallType.unary
    )

    internal static let cancelToken = GRPCMethodDescriptor(
      name: "CancelToken",
      path: "/ixo.token.v1beta1.Msg/CancelToken",
      type: GRPCCallType.unary
    )

    internal static let pauseToken = GRPCMethodDescriptor(
      name: "PauseToken",
      path: "/ixo.token.v1beta1.Msg/PauseToken",
      type: GRPCCallType.unary
    )

    internal static let stopToken = GRPCMethodDescriptor(
      name: "StopToken",
      path: "/ixo.token.v1beta1.Msg/StopToken",
      type: GRPCCallType.unary
    )
  }
}
