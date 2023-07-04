//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: secret/compute/v1beta1/msg.proto
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


/// Msg defines the wasm Msg service.
///
/// Usage: instantiate `Secret_Compute_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Secret_Compute_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func storeCode(
    _ request: Secret_Compute_V1beta1_MsgStoreCode,
    callOptions: CallOptions?
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse>

  func instantiateContract(
    _ request: Secret_Compute_V1beta1_MsgInstantiateContract,
    callOptions: CallOptions?
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse>

  func executeContract(
    _ request: Secret_Compute_V1beta1_MsgExecuteContract,
    callOptions: CallOptions?
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse>
}

extension Secret_Compute_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "secret.compute.v1beta1.Msg"
  }

  /// StoreCode to submit Wasm code to the system
  ///
  /// - Parameters:
  ///   - request: Request to send to StoreCode.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func storeCode(
    _ request: Secret_Compute_V1beta1_MsgStoreCode,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse> {
    return self.makeUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.storeCode.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStoreCodeInterceptors() ?? []
    )
  }

  ///  Instantiate creates a new smart contract instance for the given code id.
  ///
  /// - Parameters:
  ///   - request: Request to send to InstantiateContract.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func instantiateContract(
    _ request: Secret_Compute_V1beta1_MsgInstantiateContract,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse> {
    return self.makeUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.instantiateContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInstantiateContractInterceptors() ?? []
    )
  }

  /// Execute submits the given message data to a smart contract
  ///
  /// - Parameters:
  ///   - request: Request to send to ExecuteContract.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func executeContract(
    _ request: Secret_Compute_V1beta1_MsgExecuteContract,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse> {
    return self.makeUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.executeContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeExecuteContractInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Secret_Compute_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Secret_Compute_V1beta1_MsgNIOClient")
internal final class Secret_Compute_V1beta1_MsgClient: Secret_Compute_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the secret.compute.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Secret_Compute_V1beta1_MsgNIOClient: Secret_Compute_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the secret.compute.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the wasm Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Secret_Compute_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeStoreCodeCall(
    _ request: Secret_Compute_V1beta1_MsgStoreCode,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse>

  func makeInstantiateContractCall(
    _ request: Secret_Compute_V1beta1_MsgInstantiateContract,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse>

  func makeExecuteContractCall(
    _ request: Secret_Compute_V1beta1_MsgExecuteContract,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Secret_Compute_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Secret_Compute_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeStoreCodeCall(
    _ request: Secret_Compute_V1beta1_MsgStoreCode,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse> {
    return self.makeAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.storeCode.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStoreCodeInterceptors() ?? []
    )
  }

  internal func makeInstantiateContractCall(
    _ request: Secret_Compute_V1beta1_MsgInstantiateContract,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse> {
    return self.makeAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.instantiateContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInstantiateContractInterceptors() ?? []
    )
  }

  internal func makeExecuteContractCall(
    _ request: Secret_Compute_V1beta1_MsgExecuteContract,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse> {
    return self.makeAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.executeContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeExecuteContractInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Secret_Compute_V1beta1_MsgAsyncClientProtocol {
  internal func storeCode(
    _ request: Secret_Compute_V1beta1_MsgStoreCode,
    callOptions: CallOptions? = nil
  ) async throws -> Secret_Compute_V1beta1_MsgStoreCodeResponse {
    return try await self.performAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.storeCode.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStoreCodeInterceptors() ?? []
    )
  }

  internal func instantiateContract(
    _ request: Secret_Compute_V1beta1_MsgInstantiateContract,
    callOptions: CallOptions? = nil
  ) async throws -> Secret_Compute_V1beta1_MsgInstantiateContractResponse {
    return try await self.performAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.instantiateContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInstantiateContractInterceptors() ?? []
    )
  }

  internal func executeContract(
    _ request: Secret_Compute_V1beta1_MsgExecuteContract,
    callOptions: CallOptions? = nil
  ) async throws -> Secret_Compute_V1beta1_MsgExecuteContractResponse {
    return try await self.performAsyncUnaryCall(
      path: Secret_Compute_V1beta1_MsgClientMetadata.Methods.executeContract.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeExecuteContractInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Secret_Compute_V1beta1_MsgAsyncClient: Secret_Compute_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Secret_Compute_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'storeCode'.
  func makeStoreCodeInterceptors() -> [ClientInterceptor<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse>]

  /// - Returns: Interceptors to use when invoking 'instantiateContract'.
  func makeInstantiateContractInterceptors() -> [ClientInterceptor<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse>]

  /// - Returns: Interceptors to use when invoking 'executeContract'.
  func makeExecuteContractInterceptors() -> [ClientInterceptor<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse>]
}

internal enum Secret_Compute_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "secret.compute.v1beta1.Msg",
    methods: [
      Secret_Compute_V1beta1_MsgClientMetadata.Methods.storeCode,
      Secret_Compute_V1beta1_MsgClientMetadata.Methods.instantiateContract,
      Secret_Compute_V1beta1_MsgClientMetadata.Methods.executeContract,
    ]
  )

  internal enum Methods {
    internal static let storeCode = GRPCMethodDescriptor(
      name: "StoreCode",
      path: "/secret.compute.v1beta1.Msg/StoreCode",
      type: GRPCCallType.unary
    )

    internal static let instantiateContract = GRPCMethodDescriptor(
      name: "InstantiateContract",
      path: "/secret.compute.v1beta1.Msg/InstantiateContract",
      type: GRPCCallType.unary
    )

    internal static let executeContract = GRPCMethodDescriptor(
      name: "ExecuteContract",
      path: "/secret.compute.v1beta1.Msg/ExecuteContract",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the wasm Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Secret_Compute_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Secret_Compute_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// StoreCode to submit Wasm code to the system
  func storeCode(request: Secret_Compute_V1beta1_MsgStoreCode, context: StatusOnlyCallContext) -> EventLoopFuture<Secret_Compute_V1beta1_MsgStoreCodeResponse>

  ///  Instantiate creates a new smart contract instance for the given code id.
  func instantiateContract(request: Secret_Compute_V1beta1_MsgInstantiateContract, context: StatusOnlyCallContext) -> EventLoopFuture<Secret_Compute_V1beta1_MsgInstantiateContractResponse>

  /// Execute submits the given message data to a smart contract
  func executeContract(request: Secret_Compute_V1beta1_MsgExecuteContract, context: StatusOnlyCallContext) -> EventLoopFuture<Secret_Compute_V1beta1_MsgExecuteContractResponse>
}

extension Secret_Compute_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Secret_Compute_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "StoreCode":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgStoreCode>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgStoreCodeResponse>(),
        interceptors: self.interceptors?.makeStoreCodeInterceptors() ?? [],
        userFunction: self.storeCode(request:context:)
      )

    case "InstantiateContract":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgInstantiateContract>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgInstantiateContractResponse>(),
        interceptors: self.interceptors?.makeInstantiateContractInterceptors() ?? [],
        userFunction: self.instantiateContract(request:context:)
      )

    case "ExecuteContract":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgExecuteContract>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgExecuteContractResponse>(),
        interceptors: self.interceptors?.makeExecuteContractInterceptors() ?? [],
        userFunction: self.executeContract(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the wasm Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Secret_Compute_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Secret_Compute_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// StoreCode to submit Wasm code to the system
  @Sendable func storeCode(
    request: Secret_Compute_V1beta1_MsgStoreCode,
    context: GRPCAsyncServerCallContext
  ) async throws -> Secret_Compute_V1beta1_MsgStoreCodeResponse

  ///  Instantiate creates a new smart contract instance for the given code id.
  @Sendable func instantiateContract(
    request: Secret_Compute_V1beta1_MsgInstantiateContract,
    context: GRPCAsyncServerCallContext
  ) async throws -> Secret_Compute_V1beta1_MsgInstantiateContractResponse

  /// Execute submits the given message data to a smart contract
  @Sendable func executeContract(
    request: Secret_Compute_V1beta1_MsgExecuteContract,
    context: GRPCAsyncServerCallContext
  ) async throws -> Secret_Compute_V1beta1_MsgExecuteContractResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Secret_Compute_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Secret_Compute_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Secret_Compute_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Secret_Compute_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "StoreCode":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgStoreCode>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgStoreCodeResponse>(),
        interceptors: self.interceptors?.makeStoreCodeInterceptors() ?? [],
        wrapping: self.storeCode(request:context:)
      )

    case "InstantiateContract":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgInstantiateContract>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgInstantiateContractResponse>(),
        interceptors: self.interceptors?.makeInstantiateContractInterceptors() ?? [],
        wrapping: self.instantiateContract(request:context:)
      )

    case "ExecuteContract":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Secret_Compute_V1beta1_MsgExecuteContract>(),
        responseSerializer: ProtobufSerializer<Secret_Compute_V1beta1_MsgExecuteContractResponse>(),
        interceptors: self.interceptors?.makeExecuteContractInterceptors() ?? [],
        wrapping: self.executeContract(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Secret_Compute_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'storeCode'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStoreCodeInterceptors() -> [ServerInterceptor<Secret_Compute_V1beta1_MsgStoreCode, Secret_Compute_V1beta1_MsgStoreCodeResponse>]

  /// - Returns: Interceptors to use when handling 'instantiateContract'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInstantiateContractInterceptors() -> [ServerInterceptor<Secret_Compute_V1beta1_MsgInstantiateContract, Secret_Compute_V1beta1_MsgInstantiateContractResponse>]

  /// - Returns: Interceptors to use when handling 'executeContract'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeExecuteContractInterceptors() -> [ServerInterceptor<Secret_Compute_V1beta1_MsgExecuteContract, Secret_Compute_V1beta1_MsgExecuteContractResponse>]
}

internal enum Secret_Compute_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "secret.compute.v1beta1.Msg",
    methods: [
      Secret_Compute_V1beta1_MsgServerMetadata.Methods.storeCode,
      Secret_Compute_V1beta1_MsgServerMetadata.Methods.instantiateContract,
      Secret_Compute_V1beta1_MsgServerMetadata.Methods.executeContract,
    ]
  )

  internal enum Methods {
    internal static let storeCode = GRPCMethodDescriptor(
      name: "StoreCode",
      path: "/secret.compute.v1beta1.Msg/StoreCode",
      type: GRPCCallType.unary
    )

    internal static let instantiateContract = GRPCMethodDescriptor(
      name: "InstantiateContract",
      path: "/secret.compute.v1beta1.Msg/InstantiateContract",
      type: GRPCCallType.unary
    )

    internal static let executeContract = GRPCMethodDescriptor(
      name: "ExecuteContract",
      path: "/secret.compute.v1beta1.Msg/ExecuteContract",
      type: GRPCCallType.unary
    )
  }
}