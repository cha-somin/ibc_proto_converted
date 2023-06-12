// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: lum-network/beam/tx.proto
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

struct Lum_Network_Beam_MsgOpenBeam {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var creatorAddress: String = String()

  var secret: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var schema: String = String()

  var data: Lum_Network_Beam_BeamData {
    get {return _data ?? Lum_Network_Beam_BeamData()}
    set {_data = newValue}
  }
  /// Returns true if `data` has been explicitly set.
  var hasData: Bool {return self._data != nil}
  /// Clears the value of `data`. Subsequent reads from it will return its default value.
  mutating func clearData() {self._data = nil}

  var claimAddress: String = String()

  var claimExpiresAtBlock: Int32 = 0

  var closesAtBlock: Int32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _data: Lum_Network_Beam_BeamData? = nil
}

struct Lum_Network_Beam_MsgUpdateBeam {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var updaterAddress: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var status: Lum_Network_Beam_BeamState = .unspecified

  var cancelReason: String = String()

  var hideContent: Bool = false

  var data: Lum_Network_Beam_BeamData {
    get {return _data ?? Lum_Network_Beam_BeamData()}
    set {_data = newValue}
  }
  /// Returns true if `data` has been explicitly set.
  var hasData: Bool {return self._data != nil}
  /// Clears the value of `data`. Subsequent reads from it will return its default value.
  mutating func clearData() {self._data = nil}

  var claimAddress: String = String()

  var claimExpiresAtBlock: Int32 = 0

  var closesAtBlock: Int32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _data: Lum_Network_Beam_BeamData? = nil
}

struct Lum_Network_Beam_MsgClaimBeam {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var claimerAddress: String = String()

  var secret: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Lum_Network_Beam_MsgOpenBeam: @unchecked Sendable {}
extension Lum_Network_Beam_MsgUpdateBeam: @unchecked Sendable {}
extension Lum_Network_Beam_MsgClaimBeam: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lum.network.beam"

extension Lum_Network_Beam_MsgOpenBeam: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgOpenBeam"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "creator_address"),
    3: .same(proto: "secret"),
    4: .same(proto: "amount"),
    5: .same(proto: "schema"),
    6: .same(proto: "data"),
    7: .standard(proto: "claim_address"),
    8: .standard(proto: "claim_expires_at_block"),
    9: .standard(proto: "closes_at_block"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.creatorAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.secret) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.schema) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._data) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.claimAddress) }()
      case 8: try { try decoder.decodeSingularInt32Field(value: &self.claimExpiresAtBlock) }()
      case 9: try { try decoder.decodeSingularInt32Field(value: &self.closesAtBlock) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.creatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.creatorAddress, fieldNumber: 2)
    }
    if !self.secret.isEmpty {
      try visitor.visitSingularStringField(value: self.secret, fieldNumber: 3)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.schema.isEmpty {
      try visitor.visitSingularStringField(value: self.schema, fieldNumber: 5)
    }
    try { if let v = self._data {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    if !self.claimAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.claimAddress, fieldNumber: 7)
    }
    if self.claimExpiresAtBlock != 0 {
      try visitor.visitSingularInt32Field(value: self.claimExpiresAtBlock, fieldNumber: 8)
    }
    if self.closesAtBlock != 0 {
      try visitor.visitSingularInt32Field(value: self.closesAtBlock, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Beam_MsgOpenBeam, rhs: Lum_Network_Beam_MsgOpenBeam) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.creatorAddress != rhs.creatorAddress {return false}
    if lhs.secret != rhs.secret {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.schema != rhs.schema {return false}
    if lhs._data != rhs._data {return false}
    if lhs.claimAddress != rhs.claimAddress {return false}
    if lhs.claimExpiresAtBlock != rhs.claimExpiresAtBlock {return false}
    if lhs.closesAtBlock != rhs.closesAtBlock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Lum_Network_Beam_MsgUpdateBeam: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateBeam"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "updater_address"),
    3: .same(proto: "amount"),
    4: .same(proto: "status"),
    5: .standard(proto: "cancel_reason"),
    6: .standard(proto: "hide_content"),
    7: .same(proto: "data"),
    8: .standard(proto: "claim_address"),
    9: .standard(proto: "claim_expires_at_block"),
    10: .standard(proto: "closes_at_block"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.updaterAddress) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.cancelReason) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.hideContent) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._data) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.claimAddress) }()
      case 9: try { try decoder.decodeSingularInt32Field(value: &self.claimExpiresAtBlock) }()
      case 10: try { try decoder.decodeSingularInt32Field(value: &self.closesAtBlock) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.updaterAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.updaterAddress, fieldNumber: 2)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 4)
    }
    if !self.cancelReason.isEmpty {
      try visitor.visitSingularStringField(value: self.cancelReason, fieldNumber: 5)
    }
    if self.hideContent != false {
      try visitor.visitSingularBoolField(value: self.hideContent, fieldNumber: 6)
    }
    try { if let v = self._data {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    if !self.claimAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.claimAddress, fieldNumber: 8)
    }
    if self.claimExpiresAtBlock != 0 {
      try visitor.visitSingularInt32Field(value: self.claimExpiresAtBlock, fieldNumber: 9)
    }
    if self.closesAtBlock != 0 {
      try visitor.visitSingularInt32Field(value: self.closesAtBlock, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Beam_MsgUpdateBeam, rhs: Lum_Network_Beam_MsgUpdateBeam) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.updaterAddress != rhs.updaterAddress {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.status != rhs.status {return false}
    if lhs.cancelReason != rhs.cancelReason {return false}
    if lhs.hideContent != rhs.hideContent {return false}
    if lhs._data != rhs._data {return false}
    if lhs.claimAddress != rhs.claimAddress {return false}
    if lhs.claimExpiresAtBlock != rhs.claimExpiresAtBlock {return false}
    if lhs.closesAtBlock != rhs.closesAtBlock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Lum_Network_Beam_MsgClaimBeam: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaimBeam"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "claimer_address"),
    3: .same(proto: "secret"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.claimerAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.secret) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.claimerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.claimerAddress, fieldNumber: 2)
    }
    if !self.secret.isEmpty {
      try visitor.visitSingularStringField(value: self.secret, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Beam_MsgClaimBeam, rhs: Lum_Network_Beam_MsgClaimBeam) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.claimerAddress != rhs.claimerAddress {return false}
    if lhs.secret != rhs.secret {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
