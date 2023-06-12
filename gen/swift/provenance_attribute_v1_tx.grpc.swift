//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/attribute/v1/tx.proto
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


/// Msg defines the attribute module Msg service.
///
/// Usage: instantiate `Provenance_Attribute_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Attribute_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? { get }

  func addAttribute(
    _ request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse>

  func updateAttribute(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse>

  func updateAttributeExpiration(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>

  func deleteAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse>

  func deleteDistinctAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>

  func setAccountData(
    _ request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse>
}

extension Provenance_Attribute_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "provenance.attribute.v1.Msg"
  }

  /// AddAttribute defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to AddAttribute.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addAttribute(
    _ request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.addAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAttributeInterceptors() ?? []
    )
  }

  /// UpdateAttribute defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateAttribute.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateAttribute(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeInterceptors() ?? []
    )
  }

  /// UpdateAttributeExpiration defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateAttributeExpiration.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateAttributeExpiration(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttributeExpiration.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeExpirationInterceptors() ?? []
    )
  }

  /// DeleteAttribute defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteAttribute.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAttributeInterceptors() ?? []
    )
  }

  /// DeleteDistinctAttribute defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteDistinctAttribute.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteDistinctAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteDistinctAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteDistinctAttributeInterceptors() ?? []
    )
  }

  /// SetAccountData defines a method for setting/updating an account's accountdata attribute.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetAccountData.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setAccountData(
    _ request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.setAccountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAccountDataInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Attribute_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Attribute_V1_MsgNIOClient")
internal final class Provenance_Attribute_V1_MsgClient: Provenance_Attribute_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.attribute.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Attribute_V1_MsgNIOClient: Provenance_Attribute_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.attribute.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the attribute module Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Attribute_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeAddAttributeCall(
    _ request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse>

  func makeUpdateAttributeCall(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse>

  func makeUpdateAttributeExpirationCall(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>

  func makeDeleteAttributeCall(
    _ request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse>

  func makeDeleteDistinctAttributeCall(
    _ request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>

  func makeSetAccountDataCall(
    _ request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Attribute_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAddAttributeCall(
    _ request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.addAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAttributeInterceptors() ?? []
    )
  }

  internal func makeUpdateAttributeCall(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeInterceptors() ?? []
    )
  }

  internal func makeUpdateAttributeExpirationCall(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttributeExpiration.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeExpirationInterceptors() ?? []
    )
  }

  internal func makeDeleteAttributeCall(
    _ request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAttributeInterceptors() ?? []
    )
  }

  internal func makeDeleteDistinctAttributeCall(
    _ request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteDistinctAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteDistinctAttributeInterceptors() ?? []
    )
  }

  internal func makeSetAccountDataCall(
    _ request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.setAccountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAccountDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_MsgAsyncClientProtocol {
  internal func addAttribute(
    _ request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgAddAttributeResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.addAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAttributeInterceptors() ?? []
    )
  }

  internal func updateAttribute(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgUpdateAttributeResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeInterceptors() ?? []
    )
  }

  internal func updateAttributeExpiration(
    _ request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttributeExpiration.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateAttributeExpirationInterceptors() ?? []
    )
  }

  internal func deleteAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgDeleteAttributeResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteAttributeInterceptors() ?? []
    )
  }

  internal func deleteDistinctAttribute(
    _ request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteDistinctAttribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteDistinctAttributeInterceptors() ?? []
    )
  }

  internal func setAccountData(
    _ request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_MsgSetAccountDataResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_MsgClientMetadata.Methods.setAccountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAccountDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Attribute_V1_MsgAsyncClient: Provenance_Attribute_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Attribute_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'addAttribute'.
  func makeAddAttributeInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse>]

  /// - Returns: Interceptors to use when invoking 'updateAttribute'.
  func makeUpdateAttributeInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse>]

  /// - Returns: Interceptors to use when invoking 'updateAttributeExpiration'.
  func makeUpdateAttributeExpirationInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteAttribute'.
  func makeDeleteAttributeInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteDistinctAttribute'.
  func makeDeleteDistinctAttributeInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>]

  /// - Returns: Interceptors to use when invoking 'setAccountData'.
  func makeSetAccountDataInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse>]
}

internal enum Provenance_Attribute_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.attribute.v1.Msg",
    methods: [
      Provenance_Attribute_V1_MsgClientMetadata.Methods.addAttribute,
      Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttribute,
      Provenance_Attribute_V1_MsgClientMetadata.Methods.updateAttributeExpiration,
      Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteAttribute,
      Provenance_Attribute_V1_MsgClientMetadata.Methods.deleteDistinctAttribute,
      Provenance_Attribute_V1_MsgClientMetadata.Methods.setAccountData,
    ]
  )

  internal enum Methods {
    internal static let addAttribute = GRPCMethodDescriptor(
      name: "AddAttribute",
      path: "/provenance.attribute.v1.Msg/AddAttribute",
      type: GRPCCallType.unary
    )

    internal static let updateAttribute = GRPCMethodDescriptor(
      name: "UpdateAttribute",
      path: "/provenance.attribute.v1.Msg/UpdateAttribute",
      type: GRPCCallType.unary
    )

    internal static let updateAttributeExpiration = GRPCMethodDescriptor(
      name: "UpdateAttributeExpiration",
      path: "/provenance.attribute.v1.Msg/UpdateAttributeExpiration",
      type: GRPCCallType.unary
    )

    internal static let deleteAttribute = GRPCMethodDescriptor(
      name: "DeleteAttribute",
      path: "/provenance.attribute.v1.Msg/DeleteAttribute",
      type: GRPCCallType.unary
    )

    internal static let deleteDistinctAttribute = GRPCMethodDescriptor(
      name: "DeleteDistinctAttribute",
      path: "/provenance.attribute.v1.Msg/DeleteDistinctAttribute",
      type: GRPCCallType.unary
    )

    internal static let setAccountData = GRPCMethodDescriptor(
      name: "SetAccountData",
      path: "/provenance.attribute.v1.Msg/SetAccountData",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the attribute module Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Attribute_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Provenance_Attribute_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// AddAttribute defines a method to verify a particular invariance.
  func addAttribute(request: Provenance_Attribute_V1_MsgAddAttributeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgAddAttributeResponse>

  /// UpdateAttribute defines a method to verify a particular invariance.
  func updateAttribute(request: Provenance_Attribute_V1_MsgUpdateAttributeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgUpdateAttributeResponse>

  /// UpdateAttributeExpiration defines a method to verify a particular invariance.
  func updateAttributeExpiration(request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>

  /// DeleteAttribute defines a method to verify a particular invariance.
  func deleteAttribute(request: Provenance_Attribute_V1_MsgDeleteAttributeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgDeleteAttributeResponse>

  /// DeleteDistinctAttribute defines a method to verify a particular invariance.
  func deleteDistinctAttribute(request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>

  /// SetAccountData defines a method for setting/updating an account's accountdata attribute.
  func setAccountData(request: Provenance_Attribute_V1_MsgSetAccountDataRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_MsgSetAccountDataResponse>
}

extension Provenance_Attribute_V1_MsgProvider {
  internal var serviceName: Substring {
    return Provenance_Attribute_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddAttribute":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgAddAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgAddAttributeResponse>(),
        interceptors: self.interceptors?.makeAddAttributeInterceptors() ?? [],
        userFunction: self.addAttribute(request:context:)
      )

    case "UpdateAttribute":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgUpdateAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgUpdateAttributeResponse>(),
        interceptors: self.interceptors?.makeUpdateAttributeInterceptors() ?? [],
        userFunction: self.updateAttribute(request:context:)
      )

    case "UpdateAttributeExpiration":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>(),
        interceptors: self.interceptors?.makeUpdateAttributeExpirationInterceptors() ?? [],
        userFunction: self.updateAttributeExpiration(request:context:)
      )

    case "DeleteAttribute":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgDeleteAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgDeleteAttributeResponse>(),
        interceptors: self.interceptors?.makeDeleteAttributeInterceptors() ?? [],
        userFunction: self.deleteAttribute(request:context:)
      )

    case "DeleteDistinctAttribute":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>(),
        interceptors: self.interceptors?.makeDeleteDistinctAttributeInterceptors() ?? [],
        userFunction: self.deleteDistinctAttribute(request:context:)
      )

    case "SetAccountData":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgSetAccountDataRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgSetAccountDataResponse>(),
        interceptors: self.interceptors?.makeSetAccountDataInterceptors() ?? [],
        userFunction: self.setAccountData(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the attribute module Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Attribute_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Attribute_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// AddAttribute defines a method to verify a particular invariance.
  @Sendable func addAttribute(
    request: Provenance_Attribute_V1_MsgAddAttributeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgAddAttributeResponse

  /// UpdateAttribute defines a method to verify a particular invariance.
  @Sendable func updateAttribute(
    request: Provenance_Attribute_V1_MsgUpdateAttributeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgUpdateAttributeResponse

  /// UpdateAttributeExpiration defines a method to verify a particular invariance.
  @Sendable func updateAttributeExpiration(
    request: Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse

  /// DeleteAttribute defines a method to verify a particular invariance.
  @Sendable func deleteAttribute(
    request: Provenance_Attribute_V1_MsgDeleteAttributeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgDeleteAttributeResponse

  /// DeleteDistinctAttribute defines a method to verify a particular invariance.
  @Sendable func deleteDistinctAttribute(
    request: Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse

  /// SetAccountData defines a method for setting/updating an account's accountdata attribute.
  @Sendable func setAccountData(
    request: Provenance_Attribute_V1_MsgSetAccountDataRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_MsgSetAccountDataResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Attribute_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Attribute_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Attribute_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddAttribute":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgAddAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgAddAttributeResponse>(),
        interceptors: self.interceptors?.makeAddAttributeInterceptors() ?? [],
        wrapping: self.addAttribute(request:context:)
      )

    case "UpdateAttribute":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgUpdateAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgUpdateAttributeResponse>(),
        interceptors: self.interceptors?.makeUpdateAttributeInterceptors() ?? [],
        wrapping: self.updateAttribute(request:context:)
      )

    case "UpdateAttributeExpiration":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>(),
        interceptors: self.interceptors?.makeUpdateAttributeExpirationInterceptors() ?? [],
        wrapping: self.updateAttributeExpiration(request:context:)
      )

    case "DeleteAttribute":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgDeleteAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgDeleteAttributeResponse>(),
        interceptors: self.interceptors?.makeDeleteAttributeInterceptors() ?? [],
        wrapping: self.deleteAttribute(request:context:)
      )

    case "DeleteDistinctAttribute":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>(),
        interceptors: self.interceptors?.makeDeleteDistinctAttributeInterceptors() ?? [],
        wrapping: self.deleteDistinctAttribute(request:context:)
      )

    case "SetAccountData":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_MsgSetAccountDataRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_MsgSetAccountDataResponse>(),
        interceptors: self.interceptors?.makeSetAccountDataInterceptors() ?? [],
        wrapping: self.setAccountData(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Attribute_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'addAttribute'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddAttributeInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgAddAttributeRequest, Provenance_Attribute_V1_MsgAddAttributeResponse>]

  /// - Returns: Interceptors to use when handling 'updateAttribute'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateAttributeInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgUpdateAttributeRequest, Provenance_Attribute_V1_MsgUpdateAttributeResponse>]

  /// - Returns: Interceptors to use when handling 'updateAttributeExpiration'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateAttributeExpirationInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgUpdateAttributeExpirationRequest, Provenance_Attribute_V1_MsgUpdateAttributeExpirationResponse>]

  /// - Returns: Interceptors to use when handling 'deleteAttribute'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteAttributeInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgDeleteAttributeRequest, Provenance_Attribute_V1_MsgDeleteAttributeResponse>]

  /// - Returns: Interceptors to use when handling 'deleteDistinctAttribute'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteDistinctAttributeInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgDeleteDistinctAttributeRequest, Provenance_Attribute_V1_MsgDeleteDistinctAttributeResponse>]

  /// - Returns: Interceptors to use when handling 'setAccountData'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetAccountDataInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_MsgSetAccountDataRequest, Provenance_Attribute_V1_MsgSetAccountDataResponse>]
}

internal enum Provenance_Attribute_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.attribute.v1.Msg",
    methods: [
      Provenance_Attribute_V1_MsgServerMetadata.Methods.addAttribute,
      Provenance_Attribute_V1_MsgServerMetadata.Methods.updateAttribute,
      Provenance_Attribute_V1_MsgServerMetadata.Methods.updateAttributeExpiration,
      Provenance_Attribute_V1_MsgServerMetadata.Methods.deleteAttribute,
      Provenance_Attribute_V1_MsgServerMetadata.Methods.deleteDistinctAttribute,
      Provenance_Attribute_V1_MsgServerMetadata.Methods.setAccountData,
    ]
  )

  internal enum Methods {
    internal static let addAttribute = GRPCMethodDescriptor(
      name: "AddAttribute",
      path: "/provenance.attribute.v1.Msg/AddAttribute",
      type: GRPCCallType.unary
    )

    internal static let updateAttribute = GRPCMethodDescriptor(
      name: "UpdateAttribute",
      path: "/provenance.attribute.v1.Msg/UpdateAttribute",
      type: GRPCCallType.unary
    )

    internal static let updateAttributeExpiration = GRPCMethodDescriptor(
      name: "UpdateAttributeExpiration",
      path: "/provenance.attribute.v1.Msg/UpdateAttributeExpiration",
      type: GRPCCallType.unary
    )

    internal static let deleteAttribute = GRPCMethodDescriptor(
      name: "DeleteAttribute",
      path: "/provenance.attribute.v1.Msg/DeleteAttribute",
      type: GRPCCallType.unary
    )

    internal static let deleteDistinctAttribute = GRPCMethodDescriptor(
      name: "DeleteDistinctAttribute",
      path: "/provenance.attribute.v1.Msg/DeleteDistinctAttribute",
      type: GRPCCallType.unary
    )

    internal static let setAccountData = GRPCMethodDescriptor(
      name: "SetAccountData",
      path: "/provenance.attribute.v1.Msg/SetAccountData",
      type: GRPCCallType.unary
    )
  }
}
