// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sentinel/subscription/v2/genesis.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Sentinel_Subscription_V2_GenesisSubscription {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var subscription: SwiftProtobuf.Google_Protobuf_Any {
    get {return _subscription ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_subscription = newValue}
  }
  /// Returns true if `subscription` has been explicitly set.
  var hasSubscription: Bool {return self._subscription != nil}
  /// Clears the value of `subscription`. Subsequent reads from it will return its default value.
  mutating func clearSubscription() {self._subscription = nil}

  var allocations: [Sentinel_Subscription_V2_Allocation] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _subscription: SwiftProtobuf.Google_Protobuf_Any? = nil
}

struct Sentinel_Subscription_V2_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var subscriptions: [Sentinel_Subscription_V2_GenesisSubscription] = []

  var params: Sentinel_Subscription_V2_Params {
    get {return _params ?? Sentinel_Subscription_V2_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Sentinel_Subscription_V2_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Sentinel_Subscription_V2_GenesisSubscription: @unchecked Sendable {}
extension Sentinel_Subscription_V2_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "sentinel.subscription.v2"

extension Sentinel_Subscription_V2_GenesisSubscription: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisSubscription"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "subscription"),
    2: .same(proto: "allocations"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._subscription) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.allocations) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._subscription {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.allocations.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.allocations, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Sentinel_Subscription_V2_GenesisSubscription, rhs: Sentinel_Subscription_V2_GenesisSubscription) -> Bool {
    if lhs._subscription != rhs._subscription {return false}
    if lhs.allocations != rhs.allocations {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Sentinel_Subscription_V2_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "subscriptions"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.subscriptions) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.subscriptions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.subscriptions, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Sentinel_Subscription_V2_GenesisState, rhs: Sentinel_Subscription_V2_GenesisState) -> Bool {
    if lhs.subscriptions != rhs.subscriptions {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
