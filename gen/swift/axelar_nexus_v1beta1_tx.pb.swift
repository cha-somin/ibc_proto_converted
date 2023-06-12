// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/nexus/v1beta1/tx.proto
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

struct Axelar_Nexus_V1beta1_RegisterChainMaintainerRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var chains: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_RegisterChainMaintainerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_DeregisterChainMaintainerRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var chains: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_DeregisterChainMaintainerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ActivateChainRequest represents a message to activate chains
struct Axelar_Nexus_V1beta1_ActivateChainRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var chains: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_ActivateChainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DeactivateChainRequest represents a message to deactivate chains
struct Axelar_Nexus_V1beta1_DeactivateChainRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var chains: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_DeactivateChainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RegisterAssetFeeRequest represents a message to register the transfer fee
/// info associated to an asset on a chain
struct Axelar_Nexus_V1beta1_RegisterAssetFeeRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var feeInfo: Axelar_Nexus_Exported_V1beta1_FeeInfo {
    get {return _feeInfo ?? Axelar_Nexus_Exported_V1beta1_FeeInfo()}
    set {_feeInfo = newValue}
  }
  /// Returns true if `feeInfo` has been explicitly set.
  var hasFeeInfo: Bool {return self._feeInfo != nil}
  /// Clears the value of `feeInfo`. Subsequent reads from it will return its default value.
  mutating func clearFeeInfo() {self._feeInfo = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _feeInfo: Axelar_Nexus_Exported_V1beta1_FeeInfo? = nil
}

struct Axelar_Nexus_V1beta1_RegisterAssetFeeResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SetTransferRateLimitRequest represents a message to set rate limits on
/// transfers
struct Axelar_Nexus_V1beta1_SetTransferRateLimitRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: Data = Data()

  var chain: String = String()

  var limit: Cosmos_Base_V1beta1_Coin {
    get {return _limit ?? Cosmos_Base_V1beta1_Coin()}
    set {_limit = newValue}
  }
  /// Returns true if `limit` has been explicitly set.
  var hasLimit: Bool {return self._limit != nil}
  /// Clears the value of `limit`. Subsequent reads from it will return its default value.
  mutating func clearLimit() {self._limit = nil}

  var window: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _window ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_window = newValue}
  }
  /// Returns true if `window` has been explicitly set.
  var hasWindow: Bool {return self._window != nil}
  /// Clears the value of `window`. Subsequent reads from it will return its default value.
  mutating func clearWindow() {self._window = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _limit: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _window: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

struct Axelar_Nexus_V1beta1_SetTransferRateLimitResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Nexus_V1beta1_RegisterChainMaintainerRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_RegisterChainMaintainerResponse: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_DeregisterChainMaintainerRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_DeregisterChainMaintainerResponse: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_ActivateChainRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_ActivateChainResponse: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_DeactivateChainRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_DeactivateChainResponse: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_RegisterAssetFeeRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_RegisterAssetFeeResponse: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_SetTransferRateLimitRequest: @unchecked Sendable {}
extension Axelar_Nexus_V1beta1_SetTransferRateLimitResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.nexus.v1beta1"

extension Axelar_Nexus_V1beta1_RegisterChainMaintainerRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisterChainMaintainerRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "chains"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.chains) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.chains.isEmpty {
      try visitor.visitRepeatedStringField(value: self.chains, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_RegisterChainMaintainerRequest, rhs: Axelar_Nexus_V1beta1_RegisterChainMaintainerRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.chains != rhs.chains {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_RegisterChainMaintainerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisterChainMaintainerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_RegisterChainMaintainerResponse, rhs: Axelar_Nexus_V1beta1_RegisterChainMaintainerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_DeregisterChainMaintainerRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeregisterChainMaintainerRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "chains"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.chains) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.chains.isEmpty {
      try visitor.visitRepeatedStringField(value: self.chains, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_DeregisterChainMaintainerRequest, rhs: Axelar_Nexus_V1beta1_DeregisterChainMaintainerRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.chains != rhs.chains {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_DeregisterChainMaintainerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeregisterChainMaintainerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_DeregisterChainMaintainerResponse, rhs: Axelar_Nexus_V1beta1_DeregisterChainMaintainerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_ActivateChainRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ActivateChainRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "chains"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.chains) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.chains.isEmpty {
      try visitor.visitRepeatedStringField(value: self.chains, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_ActivateChainRequest, rhs: Axelar_Nexus_V1beta1_ActivateChainRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.chains != rhs.chains {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_ActivateChainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ActivateChainResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_ActivateChainResponse, rhs: Axelar_Nexus_V1beta1_ActivateChainResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_DeactivateChainRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeactivateChainRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "chains"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.chains) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.chains.isEmpty {
      try visitor.visitRepeatedStringField(value: self.chains, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_DeactivateChainRequest, rhs: Axelar_Nexus_V1beta1_DeactivateChainRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.chains != rhs.chains {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_DeactivateChainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DeactivateChainResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_DeactivateChainResponse, rhs: Axelar_Nexus_V1beta1_DeactivateChainResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_RegisterAssetFeeRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisterAssetFeeRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "fee_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._feeInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    try { if let v = self._feeInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_RegisterAssetFeeRequest, rhs: Axelar_Nexus_V1beta1_RegisterAssetFeeRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs._feeInfo != rhs._feeInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_RegisterAssetFeeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisterAssetFeeResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_RegisterAssetFeeResponse, rhs: Axelar_Nexus_V1beta1_RegisterAssetFeeResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_SetTransferRateLimitRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SetTransferRateLimitRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "chain"),
    3: .same(proto: "limit"),
    4: .same(proto: "window"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.chain) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._limit) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._window) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.sender.isEmpty {
      try visitor.visitSingularBytesField(value: self.sender, fieldNumber: 1)
    }
    if !self.chain.isEmpty {
      try visitor.visitSingularStringField(value: self.chain, fieldNumber: 2)
    }
    try { if let v = self._limit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._window {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_SetTransferRateLimitRequest, rhs: Axelar_Nexus_V1beta1_SetTransferRateLimitRequest) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.chain != rhs.chain {return false}
    if lhs._limit != rhs._limit {return false}
    if lhs._window != rhs._window {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_SetTransferRateLimitResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SetTransferRateLimitResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_SetTransferRateLimitResponse, rhs: Axelar_Nexus_V1beta1_SetTransferRateLimitResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
