//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cudos/cudoMint/query.proto
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


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Cudos_CudoMint_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Cudos_CudoMint_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? { get }
}

extension Cudos_CudoMint_QueryClientProtocol {
  internal var serviceName: String {
    return "cudos.cudoMint.Query"
  }
}

@available(*, deprecated)
extension Cudos_CudoMint_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cudos_CudoMint_QueryNIOClient")
internal final class Cudos_CudoMint_QueryClient: Cudos_CudoMint_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cudos.cudoMint.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cudos_CudoMint_QueryNIOClient: Cudos_CudoMint_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the cudos.cudoMint.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cudos_CudoMint_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudos_CudoMint_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cudos_CudoMint_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? {
    return nil
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudos_CudoMint_QueryAsyncClientProtocol {
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cudos_CudoMint_QueryAsyncClient: Cudos_CudoMint_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cudos_CudoMint_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cudos_CudoMint_QueryClientInterceptorFactoryProtocol: Sendable {
}

internal enum Cudos_CudoMint_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cudos.cudoMint.Query",
    methods: [
    ]
  )

  internal enum Methods {
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cudos_CudoMint_QueryProvider: CallHandlerProvider {
  var interceptors: Cudos_CudoMint_QueryServerInterceptorFactoryProtocol? { get }
}

extension Cudos_CudoMint_QueryProvider {
  internal var serviceName: Substring {
    return Cudos_CudoMint_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cudos_CudoMint_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cudos_CudoMint_QueryServerInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cudos_CudoMint_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cudos_CudoMint_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cudos_CudoMint_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cudos_CudoMint_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    default:
      return nil
    }
  }
}

internal protocol Cudos_CudoMint_QueryServerInterceptorFactoryProtocol {
}

internal enum Cudos_CudoMint_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "cudos.cudoMint.Query",
    methods: [
    ]
  )

  internal enum Methods {
  }
}
