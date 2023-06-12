// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/axelarnet/v1beta1/events.proto
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

struct Axelar_Axelarnet_V1beta1_IBCTransferSent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var receipient: String = String()

  var asset: Cosmos_Base_V1beta1_Coin {
    get {return _asset ?? Cosmos_Base_V1beta1_Coin()}
    set {_asset = newValue}
  }
  /// Returns true if `asset` has been explicitly set.
  var hasAsset: Bool {return self._asset != nil}
  /// Clears the value of `asset`. Subsequent reads from it will return its default value.
  mutating func clearAsset() {self._asset = nil}

  var sequence: UInt64 = 0

  var portID: String = String()

  var channelID: String = String()

  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _asset: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_IBCTransferCompleted {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var sequence: UInt64 = 0

  var portID: String = String()

  var channelID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Axelarnet_V1beta1_IBCTransferFailed {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var sequence: UInt64 = 0

  var portID: String = String()

  var channelID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Axelarnet_V1beta1_IBCTransferRetried {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var receipient: String = String()

  var asset: Cosmos_Base_V1beta1_Coin {
    get {return _asset ?? Cosmos_Base_V1beta1_Coin()}
    set {_asset = newValue}
  }
  /// Returns true if `asset` has been explicitly set.
  var hasAsset: Bool {return self._asset != nil}
  /// Clears the value of `asset`. Subsequent reads from it will return its default value.
  mutating func clearAsset() {self._asset = nil}

  var sequence: UInt64 = 0

  var portID: String = String()

  var channelID: String = String()

  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _asset: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_AxelarTransferCompleted {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var receipient: String = String()

  var asset: Cosmos_Base_V1beta1_Coin {
    get {return _asset ?? Cosmos_Base_V1beta1_Coin()}
    set {_asset = newValue}
  }
  /// Returns true if `asset` has been explicitly set.
  var hasAsset: Bool {return self._asset != nil}
  /// Clears the value of `asset`. Subsequent reads from it will return its default value.
  mutating func clearAsset() {self._asset = nil}

  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _asset: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_FeeCollected {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var collector: Data = Data()

  var fee: Cosmos_Base_V1beta1_Coin {
    get {return _fee ?? Cosmos_Base_V1beta1_Coin()}
    set {_fee = newValue}
  }
  /// Returns true if `fee` has been explicitly set.
  var hasFee: Bool {return self._fee != nil}
  /// Clears the value of `fee`. Subsequent reads from it will return its default value.
  mutating func clearFee() {self._fee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fee: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_FeePaid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var messageID: String = String()

  var recipient: Data = Data()

  var fee: Cosmos_Base_V1beta1_Coin {
    get {return _fee ?? Cosmos_Base_V1beta1_Coin()}
    set {_fee = newValue}
  }
  /// Returns true if `fee` has been explicitly set.
  var hasFee: Bool {return self._fee != nil}
  /// Clears the value of `fee`. Subsequent reads from it will return its default value.
  mutating func clearFee() {self._fee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fee: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_ContractCallSubmitted {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var messageID: String = String()

  var sender: String = String()

  var sourceChain: String = String()

  var destinationChain: String = String()

  var contractAddress: String = String()

  var payload: Data = Data()

  var payloadHash: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Axelarnet_V1beta1_ContractCallWithTokenSubmitted {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var messageID: String = String()

  var sender: String = String()

  var sourceChain: String = String()

  var destinationChain: String = String()

  var contractAddress: String = String()

  var payload: Data = Data()

  var payloadHash: Data = Data()

  var asset: Cosmos_Base_V1beta1_Coin {
    get {return _asset ?? Cosmos_Base_V1beta1_Coin()}
    set {_asset = newValue}
  }
  /// Returns true if `asset` has been explicitly set.
  var hasAsset: Bool {return self._asset != nil}
  /// Clears the value of `asset`. Subsequent reads from it will return its default value.
  mutating func clearAsset() {self._asset = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _asset: Cosmos_Base_V1beta1_Coin? = nil
}

struct Axelar_Axelarnet_V1beta1_TokenSent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var transferID: UInt64 = 0

  var sender: String = String()

  var sourceChain: String = String()

  var destinationChain: String = String()

  var destinationAddress: String = String()

  var asset: Cosmos_Base_V1beta1_Coin {
    get {return _asset ?? Cosmos_Base_V1beta1_Coin()}
    set {_asset = newValue}
  }
  /// Returns true if `asset` has been explicitly set.
  var hasAsset: Bool {return self._asset != nil}
  /// Clears the value of `asset`. Subsequent reads from it will return its default value.
  mutating func clearAsset() {self._asset = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _asset: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Axelarnet_V1beta1_IBCTransferSent: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_IBCTransferCompleted: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_IBCTransferFailed: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_IBCTransferRetried: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_AxelarTransferCompleted: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_FeeCollected: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_FeePaid: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_ContractCallSubmitted: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_ContractCallWithTokenSubmitted: @unchecked Sendable {}
extension Axelar_Axelarnet_V1beta1_TokenSent: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.axelarnet.v1beta1"

extension Axelar_Axelarnet_V1beta1_IBCTransferSent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IBCTransferSent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "receipient"),
    3: .same(proto: "asset"),
    4: .same(proto: "sequence"),
    5: .standard(proto: "port_id"),
    6: .standard(proto: "channel_id"),
    7: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.receipient) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._asset) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.portID) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.receipient.isEmpty {
      try visitor.visitSingularStringField(value: self.receipient, fieldNumber: 2)
    }
    try { if let v = self._asset {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 4)
    }
    if !self.portID.isEmpty {
      try visitor.visitSingularStringField(value: self.portID, fieldNumber: 5)
    }
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 6)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_IBCTransferSent, rhs: Axelar_Axelarnet_V1beta1_IBCTransferSent) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.receipient != rhs.receipient {return false}
    if lhs._asset != rhs._asset {return false}
    if lhs.sequence != rhs.sequence {return false}
    if lhs.portID != rhs.portID {return false}
    if lhs.channelID != rhs.channelID {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_IBCTransferCompleted: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IBCTransferCompleted"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "sequence"),
    3: .standard(proto: "port_id"),
    4: .standard(proto: "channel_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.portID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 2)
    }
    if !self.portID.isEmpty {
      try visitor.visitSingularStringField(value: self.portID, fieldNumber: 3)
    }
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_IBCTransferCompleted, rhs: Axelar_Axelarnet_V1beta1_IBCTransferCompleted) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.sequence != rhs.sequence {return false}
    if lhs.portID != rhs.portID {return false}
    if lhs.channelID != rhs.channelID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_IBCTransferFailed: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IBCTransferFailed"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "sequence"),
    3: .standard(proto: "port_id"),
    4: .standard(proto: "channel_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.portID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 2)
    }
    if !self.portID.isEmpty {
      try visitor.visitSingularStringField(value: self.portID, fieldNumber: 3)
    }
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_IBCTransferFailed, rhs: Axelar_Axelarnet_V1beta1_IBCTransferFailed) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.sequence != rhs.sequence {return false}
    if lhs.portID != rhs.portID {return false}
    if lhs.channelID != rhs.channelID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_IBCTransferRetried: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IBCTransferRetried"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "receipient"),
    3: .same(proto: "asset"),
    4: .same(proto: "sequence"),
    5: .standard(proto: "port_id"),
    6: .standard(proto: "channel_id"),
    7: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.receipient) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._asset) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.sequence) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.portID) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.channelID) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.receipient.isEmpty {
      try visitor.visitSingularStringField(value: self.receipient, fieldNumber: 2)
    }
    try { if let v = self._asset {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.sequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.sequence, fieldNumber: 4)
    }
    if !self.portID.isEmpty {
      try visitor.visitSingularStringField(value: self.portID, fieldNumber: 5)
    }
    if !self.channelID.isEmpty {
      try visitor.visitSingularStringField(value: self.channelID, fieldNumber: 6)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_IBCTransferRetried, rhs: Axelar_Axelarnet_V1beta1_IBCTransferRetried) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.receipient != rhs.receipient {return false}
    if lhs._asset != rhs._asset {return false}
    if lhs.sequence != rhs.sequence {return false}
    if lhs.portID != rhs.portID {return false}
    if lhs.channelID != rhs.channelID {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_AxelarTransferCompleted: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AxelarTransferCompleted"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "receipient"),
    3: .same(proto: "asset"),
    4: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.receipient) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._asset) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.receipient.isEmpty {
      try visitor.visitSingularStringField(value: self.receipient, fieldNumber: 2)
    }
    try { if let v = self._asset {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_AxelarTransferCompleted, rhs: Axelar_Axelarnet_V1beta1_AxelarTransferCompleted) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.receipient != rhs.receipient {return false}
    if lhs._asset != rhs._asset {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_FeeCollected: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FeeCollected"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "collector"),
    2: .same(proto: "fee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.collector) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._fee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.collector.isEmpty {
      try visitor.visitSingularBytesField(value: self.collector, fieldNumber: 1)
    }
    try { if let v = self._fee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_FeeCollected, rhs: Axelar_Axelarnet_V1beta1_FeeCollected) -> Bool {
    if lhs.collector != rhs.collector {return false}
    if lhs._fee != rhs._fee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_FeePaid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FeePaid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "message_id"),
    2: .same(proto: "recipient"),
    3: .same(proto: "fee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.messageID) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.recipient) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._fee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.messageID.isEmpty {
      try visitor.visitSingularStringField(value: self.messageID, fieldNumber: 1)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularBytesField(value: self.recipient, fieldNumber: 2)
    }
    try { if let v = self._fee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_FeePaid, rhs: Axelar_Axelarnet_V1beta1_FeePaid) -> Bool {
    if lhs.messageID != rhs.messageID {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs._fee != rhs._fee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_ContractCallSubmitted: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractCallSubmitted"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "message_id"),
    2: .same(proto: "sender"),
    3: .standard(proto: "source_chain"),
    4: .standard(proto: "destination_chain"),
    5: .standard(proto: "contract_address"),
    6: .same(proto: "payload"),
    7: .standard(proto: "payload_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.messageID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sourceChain) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.destinationChain) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.payload) }()
      case 7: try { try decoder.decodeSingularBytesField(value: &self.payloadHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.messageID.isEmpty {
      try visitor.visitSingularStringField(value: self.messageID, fieldNumber: 1)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 2)
    }
    if !self.sourceChain.isEmpty {
      try visitor.visitSingularStringField(value: self.sourceChain, fieldNumber: 3)
    }
    if !self.destinationChain.isEmpty {
      try visitor.visitSingularStringField(value: self.destinationChain, fieldNumber: 4)
    }
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 5)
    }
    if !self.payload.isEmpty {
      try visitor.visitSingularBytesField(value: self.payload, fieldNumber: 6)
    }
    if !self.payloadHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.payloadHash, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_ContractCallSubmitted, rhs: Axelar_Axelarnet_V1beta1_ContractCallSubmitted) -> Bool {
    if lhs.messageID != rhs.messageID {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.sourceChain != rhs.sourceChain {return false}
    if lhs.destinationChain != rhs.destinationChain {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.payload != rhs.payload {return false}
    if lhs.payloadHash != rhs.payloadHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_ContractCallWithTokenSubmitted: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractCallWithTokenSubmitted"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "message_id"),
    2: .same(proto: "sender"),
    3: .standard(proto: "source_chain"),
    4: .standard(proto: "destination_chain"),
    5: .standard(proto: "contract_address"),
    6: .same(proto: "payload"),
    7: .standard(proto: "payload_hash"),
    8: .same(proto: "asset"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.messageID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sourceChain) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.destinationChain) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.payload) }()
      case 7: try { try decoder.decodeSingularBytesField(value: &self.payloadHash) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._asset) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.messageID.isEmpty {
      try visitor.visitSingularStringField(value: self.messageID, fieldNumber: 1)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 2)
    }
    if !self.sourceChain.isEmpty {
      try visitor.visitSingularStringField(value: self.sourceChain, fieldNumber: 3)
    }
    if !self.destinationChain.isEmpty {
      try visitor.visitSingularStringField(value: self.destinationChain, fieldNumber: 4)
    }
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 5)
    }
    if !self.payload.isEmpty {
      try visitor.visitSingularBytesField(value: self.payload, fieldNumber: 6)
    }
    if !self.payloadHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.payloadHash, fieldNumber: 7)
    }
    try { if let v = self._asset {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_ContractCallWithTokenSubmitted, rhs: Axelar_Axelarnet_V1beta1_ContractCallWithTokenSubmitted) -> Bool {
    if lhs.messageID != rhs.messageID {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.sourceChain != rhs.sourceChain {return false}
    if lhs.destinationChain != rhs.destinationChain {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.payload != rhs.payload {return false}
    if lhs.payloadHash != rhs.payloadHash {return false}
    if lhs._asset != rhs._asset {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Axelarnet_V1beta1_TokenSent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenSent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "transfer_id"),
    2: .same(proto: "sender"),
    3: .standard(proto: "source_chain"),
    4: .standard(proto: "destination_chain"),
    5: .standard(proto: "destination_address"),
    6: .same(proto: "asset"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.transferID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sourceChain) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.destinationChain) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.destinationAddress) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._asset) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.transferID != 0 {
      try visitor.visitSingularUInt64Field(value: self.transferID, fieldNumber: 1)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 2)
    }
    if !self.sourceChain.isEmpty {
      try visitor.visitSingularStringField(value: self.sourceChain, fieldNumber: 3)
    }
    if !self.destinationChain.isEmpty {
      try visitor.visitSingularStringField(value: self.destinationChain, fieldNumber: 4)
    }
    if !self.destinationAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.destinationAddress, fieldNumber: 5)
    }
    try { if let v = self._asset {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_TokenSent, rhs: Axelar_Axelarnet_V1beta1_TokenSent) -> Bool {
    if lhs.transferID != rhs.transferID {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.sourceChain != rhs.sourceChain {return false}
    if lhs.destinationChain != rhs.destinationChain {return false}
    if lhs.destinationAddress != rhs.destinationAddress {return false}
    if lhs._asset != rhs._asset {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
