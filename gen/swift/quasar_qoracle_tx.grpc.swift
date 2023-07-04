//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: quasar/qoracle/tx.proto
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
/// Usage: instantiate `Quasarlabs_Quasarnode_Qoracle_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Quasarlabs_Quasarnode_Qoracle_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? { get }
}

extension Quasarlabs_Quasarnode_Qoracle_MsgClientProtocol {
  internal var serviceName: String {
    return "quasarlabs.quasarnode.qoracle.Msg"
  }
}

@available(*, deprecated)
extension Quasarlabs_Quasarnode_Qoracle_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Quasarlabs_Quasarnode_Qoracle_MsgNIOClient")
internal final class Quasarlabs_Quasarnode_Qoracle_MsgClient: Quasarlabs_Quasarnode_Qoracle_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the quasarlabs.quasarnode.qoracle.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Quasarlabs_Quasarnode_Qoracle_MsgNIOClient: Quasarlabs_Quasarnode_Qoracle_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the quasarlabs.quasarnode.qoracle.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quasarlabs_Quasarnode_Qoracle_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qoracle_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quasarlabs_Quasarnode_Qoracle_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? {
    return nil
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qoracle_MsgAsyncClientProtocol {
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Quasarlabs_Quasarnode_Qoracle_MsgAsyncClient: Quasarlabs_Quasarnode_Qoracle_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Quasarlabs_Quasarnode_Qoracle_MsgClientInterceptorFactoryProtocol: Sendable {
}

internal enum Quasarlabs_Quasarnode_Qoracle_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "quasarlabs.quasarnode.qoracle.Msg",
    methods: [
    ]
  )

  internal enum Methods {
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Quasarlabs_Quasarnode_Qoracle_MsgProvider: CallHandlerProvider {
  var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgServerInterceptorFactoryProtocol? { get }
}

extension Quasarlabs_Quasarnode_Qoracle_MsgProvider {
  internal var serviceName: Substring {
    return Quasarlabs_Quasarnode_Qoracle_MsgServerMetadata.serviceDescriptor.fullName[...]
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

/// Msg defines the Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Quasarlabs_Quasarnode_Qoracle_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgServerInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Quasarlabs_Quasarnode_Qoracle_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Quasarlabs_Quasarnode_Qoracle_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Quasarlabs_Quasarnode_Qoracle_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Quasarlabs_Quasarnode_Qoracle_MsgServerInterceptorFactoryProtocol? {
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

internal protocol Quasarlabs_Quasarnode_Qoracle_MsgServerInterceptorFactoryProtocol {
}

internal enum Quasarlabs_Quasarnode_Qoracle_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "quasarlabs.quasarnode.qoracle.Msg",
    methods: [
    ]
  )

  internal enum Methods {
  }
}