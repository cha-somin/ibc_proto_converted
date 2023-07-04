//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: shentu/cvm/v1alpha1/tx.proto
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


/// Usage: instantiate `Shentu_Cvm_V1alpha1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Shentu_Cvm_V1alpha1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? { get }

  func call(
    _ request: Shentu_Cvm_V1alpha1_MsgCall,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse>

  func deploy(
    _ request: Shentu_Cvm_V1alpha1_MsgDeploy,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse>
}

extension Shentu_Cvm_V1alpha1_MsgClientProtocol {
  internal var serviceName: String {
    return "shentu.cvm.v1alpha1.Msg"
  }

  /// Unary call to Call
  ///
  /// - Parameters:
  ///   - request: Request to send to Call.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func call(
    _ request: Shentu_Cvm_V1alpha1_MsgCall,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.call.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCallInterceptors() ?? []
    )
  }

  /// Unary call to Deploy
  ///
  /// - Parameters:
  ///   - request: Request to send to Deploy.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deploy(
    _ request: Shentu_Cvm_V1alpha1_MsgDeploy,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.deploy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeployInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Shentu_Cvm_V1alpha1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Shentu_Cvm_V1alpha1_MsgNIOClient")
internal final class Shentu_Cvm_V1alpha1_MsgClient: Shentu_Cvm_V1alpha1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the shentu.cvm.v1alpha1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Shentu_Cvm_V1alpha1_MsgNIOClient: Shentu_Cvm_V1alpha1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the shentu.cvm.v1alpha1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Cvm_V1alpha1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCallCall(
    _ request: Shentu_Cvm_V1alpha1_MsgCall,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse>

  func makeDeployCall(
    _ request: Shentu_Cvm_V1alpha1_MsgDeploy,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Cvm_V1alpha1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCallCall(
    _ request: Shentu_Cvm_V1alpha1_MsgCall,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.call.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCallInterceptors() ?? []
    )
  }

  internal func makeDeployCall(
    _ request: Shentu_Cvm_V1alpha1_MsgDeploy,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.deploy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeployInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_MsgAsyncClientProtocol {
  internal func call(
    _ request: Shentu_Cvm_V1alpha1_MsgCall,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_MsgCallResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.call.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCallInterceptors() ?? []
    )
  }

  internal func deploy(
    _ request: Shentu_Cvm_V1alpha1_MsgDeploy,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_MsgDeployResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.deploy.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeployInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Shentu_Cvm_V1alpha1_MsgAsyncClient: Shentu_Cvm_V1alpha1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Shentu_Cvm_V1alpha1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'call'.
  func makeCallInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse>]

  /// - Returns: Interceptors to use when invoking 'deploy'.
  func makeDeployInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse>]
}

internal enum Shentu_Cvm_V1alpha1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "shentu.cvm.v1alpha1.Msg",
    methods: [
      Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.call,
      Shentu_Cvm_V1alpha1_MsgClientMetadata.Methods.deploy,
    ]
  )

  internal enum Methods {
    internal static let call = GRPCMethodDescriptor(
      name: "Call",
      path: "/shentu.cvm.v1alpha1.Msg/Call",
      type: GRPCCallType.unary
    )

    internal static let deploy = GRPCMethodDescriptor(
      name: "Deploy",
      path: "/shentu.cvm.v1alpha1.Msg/Deploy",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Shentu_Cvm_V1alpha1_MsgProvider: CallHandlerProvider {
  var interceptors: Shentu_Cvm_V1alpha1_MsgServerInterceptorFactoryProtocol? { get }

  func call(request: Shentu_Cvm_V1alpha1_MsgCall, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_MsgCallResponse>

  func deploy(request: Shentu_Cvm_V1alpha1_MsgDeploy, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_MsgDeployResponse>
}

extension Shentu_Cvm_V1alpha1_MsgProvider {
  internal var serviceName: Substring {
    return Shentu_Cvm_V1alpha1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Call":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_MsgCall>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_MsgCallResponse>(),
        interceptors: self.interceptors?.makeCallInterceptors() ?? [],
        userFunction: self.call(request:context:)
      )

    case "Deploy":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_MsgDeploy>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_MsgDeployResponse>(),
        interceptors: self.interceptors?.makeDeployInterceptors() ?? [],
        userFunction: self.deploy(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Cvm_V1alpha1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Cvm_V1alpha1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func call(
    request: Shentu_Cvm_V1alpha1_MsgCall,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_MsgCallResponse

  @Sendable func deploy(
    request: Shentu_Cvm_V1alpha1_MsgDeploy,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_MsgDeployResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Cvm_V1alpha1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Shentu_Cvm_V1alpha1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Shentu_Cvm_V1alpha1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Call":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_MsgCall>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_MsgCallResponse>(),
        interceptors: self.interceptors?.makeCallInterceptors() ?? [],
        wrapping: self.call(request:context:)
      )

    case "Deploy":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_MsgDeploy>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_MsgDeployResponse>(),
        interceptors: self.interceptors?.makeDeployInterceptors() ?? [],
        wrapping: self.deploy(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Shentu_Cvm_V1alpha1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'call'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCallInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_MsgCall, Shentu_Cvm_V1alpha1_MsgCallResponse>]

  /// - Returns: Interceptors to use when handling 'deploy'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeployInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_MsgDeploy, Shentu_Cvm_V1alpha1_MsgDeployResponse>]
}

internal enum Shentu_Cvm_V1alpha1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "shentu.cvm.v1alpha1.Msg",
    methods: [
      Shentu_Cvm_V1alpha1_MsgServerMetadata.Methods.call,
      Shentu_Cvm_V1alpha1_MsgServerMetadata.Methods.deploy,
    ]
  )

  internal enum Methods {
    internal static let call = GRPCMethodDescriptor(
      name: "Call",
      path: "/shentu.cvm.v1alpha1.Msg/Call",
      type: GRPCCallType.unary
    )

    internal static let deploy = GRPCMethodDescriptor(
      name: "Deploy",
      path: "/shentu.cvm.v1alpha1.Msg/Deploy",
      type: GRPCCallType.unary
    )
  }
}