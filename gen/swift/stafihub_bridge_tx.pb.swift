// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/bridge/tx.proto
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

struct Stafihub_Stafihub_Bridge_MsgSetResourceidToDenom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var resourceID: String = String()

  var denom: String = String()

  var denomType: Stafihub_Stafihub_Bridge_DenomType = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgSetResourceidToDenomResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgDeposit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var destChainID: UInt32 = 0

  var denom: String = String()

  var amount: String = String()

  var receiver: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgDepositResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgAddChainId {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgAddChainIdResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgVoteProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var depositNonce: UInt64 = 0

  var resourceID: String = String()

  var amount: String = String()

  var receiver: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgVoteProposalResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgRmChainId {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgRmChainIdResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiver {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiverResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgSetRelayFee {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var value: Cosmos_Base_V1beta1_Coin {
    get {return _value ?? Cosmos_Base_V1beta1_Coin()}
    set {_value = newValue}
  }
  /// Returns true if `value` has been explicitly set.
  var hasValue: Bool {return self._value != nil}
  /// Clears the value of `value`. Subsequent reads from it will return its default value.
  mutating func clearValue() {self._value = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _value: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stafihub_Stafihub_Bridge_MsgSetRelayFeeResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgAddBannedDenom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var denom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgAddBannedDenomResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgRmBannedDenom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var chainID: UInt32 = 0

  var denom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Bridge_MsgRmBannedDenomResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Bridge_MsgSetResourceidToDenom: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgSetResourceidToDenomResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgDeposit: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgDepositResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgAddChainId: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgAddChainIdResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgVoteProposal: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgVoteProposalResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgRmChainId: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgRmChainIdResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiver: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiverResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgSetRelayFee: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgAddBannedDenom: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgAddBannedDenomResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgRmBannedDenom: @unchecked Sendable {}
extension Stafihub_Stafihub_Bridge_MsgRmBannedDenomResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.bridge"

extension Stafihub_Stafihub_Bridge_MsgSetResourceidToDenom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetResourceidToDenom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "resourceId"),
    3: .same(proto: "denom"),
    4: .same(proto: "denomType"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.resourceID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.denomType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.resourceID.isEmpty {
      try visitor.visitSingularStringField(value: self.resourceID, fieldNumber: 2)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 3)
    }
    if self.denomType != .unspecified {
      try visitor.visitSingularEnumField(value: self.denomType, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetResourceidToDenom, rhs: Stafihub_Stafihub_Bridge_MsgSetResourceidToDenom) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.resourceID != rhs.resourceID {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.denomType != rhs.denomType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgSetResourceidToDenomResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetResourceidToDenomResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetResourceidToDenomResponse, rhs: Stafihub_Stafihub_Bridge_MsgSetResourceidToDenomResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgDeposit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeposit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "destChainId"),
    3: .same(proto: "denom"),
    4: .same(proto: "amount"),
    5: .same(proto: "receiver"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.destChainID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.destChainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.destChainID, fieldNumber: 2)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 3)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 4)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgDeposit, rhs: Stafihub_Stafihub_Bridge_MsgDeposit) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.destChainID != rhs.destChainID {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgDepositResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDepositResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgDepositResponse, rhs: Stafihub_Stafihub_Bridge_MsgDepositResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgAddChainId: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddChainId"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgAddChainId, rhs: Stafihub_Stafihub_Bridge_MsgAddChainId) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgAddChainIdResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddChainIdResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgAddChainIdResponse, rhs: Stafihub_Stafihub_Bridge_MsgAddChainIdResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgVoteProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgVoteProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
    3: .same(proto: "depositNonce"),
    4: .same(proto: "resourceId"),
    5: .same(proto: "amount"),
    6: .same(proto: "receiver"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.depositNonce) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.resourceID) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    if self.depositNonce != 0 {
      try visitor.visitSingularUInt64Field(value: self.depositNonce, fieldNumber: 3)
    }
    if !self.resourceID.isEmpty {
      try visitor.visitSingularStringField(value: self.resourceID, fieldNumber: 4)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 5)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgVoteProposal, rhs: Stafihub_Stafihub_Bridge_MsgVoteProposal) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.depositNonce != rhs.depositNonce {return false}
    if lhs.resourceID != rhs.resourceID {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgVoteProposalResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgVoteProposalResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgVoteProposalResponse, rhs: Stafihub_Stafihub_Bridge_MsgVoteProposalResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgRmChainId: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmChainId"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgRmChainId, rhs: Stafihub_Stafihub_Bridge_MsgRmChainId) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgRmChainIdResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmChainIdResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgRmChainIdResponse, rhs: Stafihub_Stafihub_Bridge_MsgRmChainIdResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiver: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetRelayFeeReceiver"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiver, rhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiver) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiverResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetRelayFeeReceiverResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiverResponse, rhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeReceiverResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgSetRelayFee: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetRelayFee"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
    3: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    try { if let v = self._value {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetRelayFee, rhs: Stafihub_Stafihub_Bridge_MsgSetRelayFee) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs._value != rhs._value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgSetRelayFeeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetRelayFeeResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeResponse, rhs: Stafihub_Stafihub_Bridge_MsgSetRelayFeeResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgAddBannedDenom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddBannedDenom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
    3: .same(proto: "denom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgAddBannedDenom, rhs: Stafihub_Stafihub_Bridge_MsgAddBannedDenom) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgAddBannedDenomResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddBannedDenomResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgAddBannedDenomResponse, rhs: Stafihub_Stafihub_Bridge_MsgAddBannedDenomResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgRmBannedDenom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmBannedDenom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "chainId"),
    3: .same(proto: "denom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.chainID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.chainID != 0 {
      try visitor.visitSingularUInt32Field(value: self.chainID, fieldNumber: 2)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgRmBannedDenom, rhs: Stafihub_Stafihub_Bridge_MsgRmBannedDenom) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Bridge_MsgRmBannedDenomResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmBannedDenomResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Bridge_MsgRmBannedDenomResponse, rhs: Stafihub_Stafihub_Bridge_MsgRmBannedDenomResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}