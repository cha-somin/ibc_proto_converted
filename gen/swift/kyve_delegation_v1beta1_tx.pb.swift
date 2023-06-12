// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/delegation/v1beta1/tx.proto
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

/// MsgDelegate ...
struct Kyve_Delegation_V1beta1_MsgDelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator ...
  var creator: String = String()

  /// staker ...
  var staker: String = String()

  /// amount ...
  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDelegatePoolResponse defines the Msg/DelegatePool response type.
struct Kyve_Delegation_V1beta1_MsgDelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgWithdrawPool defines a SDK message for withdrawing delegation rewards from a specific pool.
struct Kyve_Delegation_V1beta1_MsgWithdrawRewards {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator ...
  var creator: String = String()

  /// staker ...
  var staker: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgWithdrawPoolResponse defines the Msg/WithdrawPool response type.
struct Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUndelegatePool defines a SDK message for undelegating from a specific pool.
struct Kyve_Delegation_V1beta1_MsgUndelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator ...
  var creator: String = String()

  /// staker ...
  var staker: String = String()

  /// amount ...
  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUndelegatePoolResponse defines the Msg/UndelegatePool response type.
struct Kyve_Delegation_V1beta1_MsgUndelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRedelegatePool defines a SDK message for redelegating from a
/// staker in a pool to another staker in the same or another pool
struct Kyve_Delegation_V1beta1_MsgRedelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator ...
  var creator: String = String()

  /// staker ...
  var fromStaker: String = String()

  /// staker ...
  var toStaker: String = String()

  /// amount ...
  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUndelegatePoolResponse defines the Msg/UndelegatePool response type.
struct Kyve_Delegation_V1beta1_MsgRedelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParams defines a SDK message for updating the module parameters.
struct Kyve_Delegation_V1beta1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  var authority: String = String()

  /// payload defines the x/delegation parameters to update.
  var payload: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParamsResponse defines the Msg/UpdateParams response type.
struct Kyve_Delegation_V1beta1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Delegation_V1beta1_MsgDelegate: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgDelegateResponse: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgWithdrawRewards: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgUndelegate: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgUndelegateResponse: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgRedelegate: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgRedelegateResponse: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgUpdateParams: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.delegation.v1beta1"

extension Kyve_Delegation_V1beta1_MsgDelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "staker"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 2)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgDelegate, rhs: Kyve_Delegation_V1beta1_MsgDelegate) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.staker != rhs.staker {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgDelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgDelegateResponse, rhs: Kyve_Delegation_V1beta1_MsgDelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgWithdrawRewards: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWithdrawRewards"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "staker"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgWithdrawRewards, rhs: Kyve_Delegation_V1beta1_MsgWithdrawRewards) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.staker != rhs.staker {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWithdrawRewardsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse, rhs: Kyve_Delegation_V1beta1_MsgWithdrawRewardsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgUndelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUndelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "staker"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 2)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgUndelegate, rhs: Kyve_Delegation_V1beta1_MsgUndelegate) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.staker != rhs.staker {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgUndelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUndelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgUndelegateResponse, rhs: Kyve_Delegation_V1beta1_MsgUndelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgRedelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRedelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .standard(proto: "from_staker"),
    3: .standard(proto: "to_staker"),
    4: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.fromStaker) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.toStaker) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.fromStaker.isEmpty {
      try visitor.visitSingularStringField(value: self.fromStaker, fieldNumber: 2)
    }
    if !self.toStaker.isEmpty {
      try visitor.visitSingularStringField(value: self.toStaker, fieldNumber: 3)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgRedelegate, rhs: Kyve_Delegation_V1beta1_MsgRedelegate) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.fromStaker != rhs.fromStaker {return false}
    if lhs.toStaker != rhs.toStaker {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgRedelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRedelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgRedelegateResponse, rhs: Kyve_Delegation_V1beta1_MsgRedelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "payload"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.payload) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.payload.isEmpty {
      try visitor.visitSingularStringField(value: self.payload, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgUpdateParams, rhs: Kyve_Delegation_V1beta1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.payload != rhs.payload {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_MsgUpdateParamsResponse, rhs: Kyve_Delegation_V1beta1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
