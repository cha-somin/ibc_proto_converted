//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: irismod/random/query.proto
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


/// Query creates service with guardian as rpc
///
/// Usage: instantiate `Irismod_Random_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Irismod_Random_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? { get }

  func random(
    _ request: Irismod_Random_QueryRandomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse>

  func randomRequestQueue(
    _ request: Irismod_Random_QueryRandomRequestQueueRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse>
}

extension Irismod_Random_QueryClientProtocol {
  internal var serviceName: String {
    return "irismod.random.Query"
  }

  /// Random queries the random result
  ///
  /// - Parameters:
  ///   - request: Request to send to Random.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func random(
    _ request: Irismod_Random_QueryRandomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse> {
    return self.makeUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.random.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomInterceptors() ?? []
    )
  }

  /// RandomRequestQueue queries the random request queue
  ///
  /// - Parameters:
  ///   - request: Request to send to RandomRequestQueue.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func randomRequestQueue(
    _ request: Irismod_Random_QueryRandomRequestQueueRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse> {
    return self.makeUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.randomRequestQueue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomRequestQueueInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Irismod_Random_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Irismod_Random_QueryNIOClient")
internal final class Irismod_Random_QueryClient: Irismod_Random_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the irismod.random.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Irismod_Random_QueryNIOClient: Irismod_Random_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the irismod.random.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query creates service with guardian as rpc
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Random_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? { get }

  func makeRandomCall(
    _ request: Irismod_Random_QueryRandomRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse>

  func makeRandomRequestQueueCall(
    _ request: Irismod_Random_QueryRandomRequestQueueRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Random_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Random_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRandomCall(
    _ request: Irismod_Random_QueryRandomRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.random.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomInterceptors() ?? []
    )
  }

  internal func makeRandomRequestQueueCall(
    _ request: Irismod_Random_QueryRandomRequestQueueRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.randomRequestQueue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomRequestQueueInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Random_QueryAsyncClientProtocol {
  internal func random(
    _ request: Irismod_Random_QueryRandomRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Random_QueryRandomResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.random.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomInterceptors() ?? []
    )
  }

  internal func randomRequestQueue(
    _ request: Irismod_Random_QueryRandomRequestQueueRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Random_QueryRandomRequestQueueResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Random_QueryClientMetadata.Methods.randomRequestQueue.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRandomRequestQueueInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Irismod_Random_QueryAsyncClient: Irismod_Random_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Random_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Irismod_Random_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'random'.
  func makeRandomInterceptors() -> [ClientInterceptor<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse>]

  /// - Returns: Interceptors to use when invoking 'randomRequestQueue'.
  func makeRandomRequestQueueInterceptors() -> [ClientInterceptor<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse>]
}

internal enum Irismod_Random_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "irismod.random.Query",
    methods: [
      Irismod_Random_QueryClientMetadata.Methods.random,
      Irismod_Random_QueryClientMetadata.Methods.randomRequestQueue,
    ]
  )

  internal enum Methods {
    internal static let random = GRPCMethodDescriptor(
      name: "Random",
      path: "/irismod.random.Query/Random",
      type: GRPCCallType.unary
    )

    internal static let randomRequestQueue = GRPCMethodDescriptor(
      name: "RandomRequestQueue",
      path: "/irismod.random.Query/RandomRequestQueue",
      type: GRPCCallType.unary
    )
  }
}

/// Query creates service with guardian as rpc
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irismod_Random_QueryProvider: CallHandlerProvider {
  var interceptors: Irismod_Random_QueryServerInterceptorFactoryProtocol? { get }

  /// Random queries the random result
  func random(request: Irismod_Random_QueryRandomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Random_QueryRandomResponse>

  /// RandomRequestQueue queries the random request queue
  func randomRequestQueue(request: Irismod_Random_QueryRandomRequestQueueRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Random_QueryRandomRequestQueueResponse>
}

extension Irismod_Random_QueryProvider {
  internal var serviceName: Substring {
    return Irismod_Random_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Random":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Random_QueryRandomRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Random_QueryRandomResponse>(),
        interceptors: self.interceptors?.makeRandomInterceptors() ?? [],
        userFunction: self.random(request:context:)
      )

    case "RandomRequestQueue":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Random_QueryRandomRequestQueueRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Random_QueryRandomRequestQueueResponse>(),
        interceptors: self.interceptors?.makeRandomRequestQueueInterceptors() ?? [],
        userFunction: self.randomRequestQueue(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query creates service with guardian as rpc
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Random_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Random_QueryServerInterceptorFactoryProtocol? { get }

  /// Random queries the random result
  @Sendable func random(
    request: Irismod_Random_QueryRandomRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Random_QueryRandomResponse

  /// RandomRequestQueue queries the random request queue
  @Sendable func randomRequestQueue(
    request: Irismod_Random_QueryRandomRequestQueueRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Random_QueryRandomRequestQueueResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Random_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Random_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Irismod_Random_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Irismod_Random_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Random":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Random_QueryRandomRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Random_QueryRandomResponse>(),
        interceptors: self.interceptors?.makeRandomInterceptors() ?? [],
        wrapping: self.random(request:context:)
      )

    case "RandomRequestQueue":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Random_QueryRandomRequestQueueRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Random_QueryRandomRequestQueueResponse>(),
        interceptors: self.interceptors?.makeRandomRequestQueueInterceptors() ?? [],
        wrapping: self.randomRequestQueue(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irismod_Random_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'random'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRandomInterceptors() -> [ServerInterceptor<Irismod_Random_QueryRandomRequest, Irismod_Random_QueryRandomResponse>]

  /// - Returns: Interceptors to use when handling 'randomRequestQueue'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRandomRequestQueueInterceptors() -> [ServerInterceptor<Irismod_Random_QueryRandomRequestQueueRequest, Irismod_Random_QueryRandomRequestQueueResponse>]
}

internal enum Irismod_Random_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "irismod.random.Query",
    methods: [
      Irismod_Random_QueryServerMetadata.Methods.random,
      Irismod_Random_QueryServerMetadata.Methods.randomRequestQueue,
    ]
  )

  internal enum Methods {
    internal static let random = GRPCMethodDescriptor(
      name: "Random",
      path: "/irismod.random.Query/Random",
      type: GRPCCallType.unary
    )

    internal static let randomRequestQueue = GRPCMethodDescriptor(
      name: "RandomRequestQueue",
      path: "/irismod.random.Query/RandomRequestQueue",
      type: GRPCCallType.unary
    )
  }
}