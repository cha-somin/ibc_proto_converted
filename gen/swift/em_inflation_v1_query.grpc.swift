//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: em/inflation/v1/query.proto
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


/// Usage: instantiate `Em_Inflation_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Em_Inflation_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func inflation(
    _ request: Em_Inflation_V1_QueryInflationRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse>
}

extension Em_Inflation_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "em.inflation.v1.Query"
  }

  /// Unary call to Inflation
  ///
  /// - Parameters:
  ///   - request: Request to send to Inflation.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func inflation(
    _ request: Em_Inflation_V1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse> {
    return self.makeUnaryCall(
      path: Em_Inflation_V1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Em_Inflation_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Em_Inflation_V1_QueryNIOClient")
internal final class Em_Inflation_V1_QueryClient: Em_Inflation_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the em.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Em_Inflation_V1_QueryNIOClient: Em_Inflation_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the em.inflation.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Em_Inflation_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeInflationCall(
    _ request: Em_Inflation_V1_QueryInflationRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Em_Inflation_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Em_Inflation_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeInflationCall(
    _ request: Em_Inflation_V1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse> {
    return self.makeAsyncUnaryCall(
      path: Em_Inflation_V1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Em_Inflation_V1_QueryAsyncClientProtocol {
  internal func inflation(
    _ request: Em_Inflation_V1_QueryInflationRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Em_Inflation_V1_QueryInflationResponse {
    return try await self.performAsyncUnaryCall(
      path: Em_Inflation_V1_QueryClientMetadata.Methods.inflation.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInflationInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Em_Inflation_V1_QueryAsyncClient: Em_Inflation_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Em_Inflation_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Em_Inflation_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'inflation'.
  func makeInflationInterceptors() -> [ClientInterceptor<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse>]
}

internal enum Em_Inflation_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "em.inflation.v1.Query",
    methods: [
      Em_Inflation_V1_QueryClientMetadata.Methods.inflation,
    ]
  )

  internal enum Methods {
    internal static let inflation = GRPCMethodDescriptor(
      name: "Inflation",
      path: "/em.inflation.v1.Query/Inflation",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Em_Inflation_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Em_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  func inflation(request: Em_Inflation_V1_QueryInflationRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Em_Inflation_V1_QueryInflationResponse>
}

extension Em_Inflation_V1_QueryProvider {
  internal var serviceName: Substring {
    return Em_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Inflation":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Em_Inflation_V1_QueryInflationRequest>(),
        responseSerializer: ProtobufSerializer<Em_Inflation_V1_QueryInflationResponse>(),
        interceptors: self.interceptors?.makeInflationInterceptors() ?? [],
        userFunction: self.inflation(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Em_Inflation_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Em_Inflation_V1_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func inflation(
    request: Em_Inflation_V1_QueryInflationRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Em_Inflation_V1_QueryInflationResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Em_Inflation_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Em_Inflation_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Em_Inflation_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Em_Inflation_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Inflation":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Em_Inflation_V1_QueryInflationRequest>(),
        responseSerializer: ProtobufSerializer<Em_Inflation_V1_QueryInflationResponse>(),
        interceptors: self.interceptors?.makeInflationInterceptors() ?? [],
        wrapping: self.inflation(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Em_Inflation_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'inflation'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInflationInterceptors() -> [ServerInterceptor<Em_Inflation_V1_QueryInflationRequest, Em_Inflation_V1_QueryInflationResponse>]
}

internal enum Em_Inflation_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "em.inflation.v1.Query",
    methods: [
      Em_Inflation_V1_QueryServerMetadata.Methods.inflation,
    ]
  )

  internal enum Methods {
    internal static let inflation = GRPCMethodDescriptor(
      name: "Inflation",
      path: "/em.inflation.v1.Query/Inflation",
      type: GRPCCallType.unary
    )
  }
}
