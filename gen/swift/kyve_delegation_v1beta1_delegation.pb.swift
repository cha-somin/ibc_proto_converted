// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/delegation/v1beta1/delegation.proto
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

/// SlashType ...
enum Kyve_Delegation_V1beta1_SlashType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// SLASH_TYPE_UNSPECIFIED ...
  case unspecified // = 0

  /// SLASH_TYPE_TIMEOUT ...
  case timeout // = 1

  /// SLASH_TYPE_VOTE ...
  case vote // = 2

  /// SLASH_TYPE_UPLOAD ...
  case upload // = 3
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .timeout
    case 2: self = .vote
    case 3: self = .upload
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .timeout: return 1
    case .vote: return 2
    case .upload: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Kyve_Delegation_V1beta1_SlashType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Kyve_Delegation_V1beta1_SlashType] = [
    .unspecified,
    .timeout,
    .vote,
    .upload,
  ]
}

#endif  // swift(>=4.2)

/// Delegator stores the information that one address has delegated to another address
/// It stores important information for the F1-Fee distribution algorithm
struct Kyve_Delegation_V1beta1_Delegator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// staker corresponds to a KYVE-staker on the protocol-side
  var staker: String = String()

  /// delegator the user who delegate to the staker.
  /// If staker and delegator are the same we call it: self-delegation
  var delegator: String = String()

  /// k_index is an internal index for the f1-distribution algorithm
  var kIndex: UInt64 = 0

  /// initial_amount of stake the user had when it delegated.
  /// slashes can cause that the actual stake is lower.
  var initialAmount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DelegationEntry represents an entry according to the F1-Fee-Distribution algorithm.
/// Take a look at x/delegation/keeper/logic_f1distribution.go for more details
struct Kyve_Delegation_V1beta1_DelegationEntry {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// staker on protocol level
  var staker: String = String()

  /// k_index is the of the period this entry ends
  var kIndex: UInt64 = 0

  /// value is the quotient of collected rewards and total stake according to F1-distribution
  var value: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DelegationPoolData stores general delegation information for every staker
struct Kyve_Delegation_V1beta1_DelegationData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Every staker has one DelegationData
  var staker: String = String()

  /// current_rewards ...
  var currentRewards: UInt64 = 0

  /// total_delegation ...
  var totalDelegation: UInt64 = 0

  /// latest_index_k ...
  var latestIndexK: UInt64 = 0

  /// delegator_count the amount of different addresses delegating to the staker
  var delegatorCount: UInt64 = 0

  /// latest_index_was_undelegation helps indicates when an entry can be deleted
  var latestIndexWasUndelegation: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DelegationSlash represents an f1-slash
/// these entries needs to be iterated to obtain the current amount of the actual stake
/// Every staker can have n slash-entries
struct Kyve_Delegation_V1beta1_DelegationSlash {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// staker who got slashed
  var staker: String = String()

  /// k_index for f1-algorithm
  var kIndex: UInt64 = 0

  /// fraction that got slashed
  var fraction: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// UndelegationQueueEntry ...
struct Kyve_Delegation_V1beta1_UndelegationQueueEntry {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// index ...
  var index: UInt64 = 0

  /// staker ...
  var staker: String = String()

  /// delegator ...
  var delegator: String = String()

  /// amount ...
  var amount: UInt64 = 0

  /// creation_time ...
  var creationTime: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueueState ...
struct Kyve_Delegation_V1beta1_QueueState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// low_index ...
  var lowIndex: UInt64 = 0

  /// high_index ...
  var highIndex: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RedelegationCooldown ...
struct Kyve_Delegation_V1beta1_RedelegationCooldown {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// low_index ...
  var address: String = String()

  /// high_index ...
  var creationDate: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Delegation_V1beta1_SlashType: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_Delegator: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_DelegationEntry: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_DelegationData: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_DelegationSlash: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_UndelegationQueueEntry: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_QueueState: @unchecked Sendable {}
extension Kyve_Delegation_V1beta1_RedelegationCooldown: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.delegation.v1beta1"

extension Kyve_Delegation_V1beta1_SlashType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "SLASH_TYPE_UNSPECIFIED"),
    1: .same(proto: "SLASH_TYPE_TIMEOUT"),
    2: .same(proto: "SLASH_TYPE_VOTE"),
    3: .same(proto: "SLASH_TYPE_UPLOAD"),
  ]
}

extension Kyve_Delegation_V1beta1_Delegator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Delegator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
    2: .same(proto: "delegator"),
    3: .standard(proto: "k_index"),
    4: .standard(proto: "initial_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.delegator) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.kIndex) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.initialAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 1)
    }
    if !self.delegator.isEmpty {
      try visitor.visitSingularStringField(value: self.delegator, fieldNumber: 2)
    }
    if self.kIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.kIndex, fieldNumber: 3)
    }
    if self.initialAmount != 0 {
      try visitor.visitSingularUInt64Field(value: self.initialAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_Delegator, rhs: Kyve_Delegation_V1beta1_Delegator) -> Bool {
    if lhs.staker != rhs.staker {return false}
    if lhs.delegator != rhs.delegator {return false}
    if lhs.kIndex != rhs.kIndex {return false}
    if lhs.initialAmount != rhs.initialAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_DelegationEntry: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DelegationEntry"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
    2: .standard(proto: "k_index"),
    3: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.kIndex) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 1)
    }
    if self.kIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.kIndex, fieldNumber: 2)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularStringField(value: self.value, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_DelegationEntry, rhs: Kyve_Delegation_V1beta1_DelegationEntry) -> Bool {
    if lhs.staker != rhs.staker {return false}
    if lhs.kIndex != rhs.kIndex {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_DelegationData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DelegationData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
    2: .standard(proto: "current_rewards"),
    3: .standard(proto: "total_delegation"),
    4: .standard(proto: "latest_index_k"),
    5: .standard(proto: "delegator_count"),
    6: .standard(proto: "latest_index_was_undelegation"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.currentRewards) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.totalDelegation) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.latestIndexK) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.delegatorCount) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.latestIndexWasUndelegation) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 1)
    }
    if self.currentRewards != 0 {
      try visitor.visitSingularUInt64Field(value: self.currentRewards, fieldNumber: 2)
    }
    if self.totalDelegation != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalDelegation, fieldNumber: 3)
    }
    if self.latestIndexK != 0 {
      try visitor.visitSingularUInt64Field(value: self.latestIndexK, fieldNumber: 4)
    }
    if self.delegatorCount != 0 {
      try visitor.visitSingularUInt64Field(value: self.delegatorCount, fieldNumber: 5)
    }
    if self.latestIndexWasUndelegation != false {
      try visitor.visitSingularBoolField(value: self.latestIndexWasUndelegation, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_DelegationData, rhs: Kyve_Delegation_V1beta1_DelegationData) -> Bool {
    if lhs.staker != rhs.staker {return false}
    if lhs.currentRewards != rhs.currentRewards {return false}
    if lhs.totalDelegation != rhs.totalDelegation {return false}
    if lhs.latestIndexK != rhs.latestIndexK {return false}
    if lhs.delegatorCount != rhs.delegatorCount {return false}
    if lhs.latestIndexWasUndelegation != rhs.latestIndexWasUndelegation {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_DelegationSlash: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DelegationSlash"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "staker"),
    2: .standard(proto: "k_index"),
    3: .same(proto: "fraction"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.kIndex) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.fraction) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 1)
    }
    if self.kIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.kIndex, fieldNumber: 2)
    }
    if !self.fraction.isEmpty {
      try visitor.visitSingularStringField(value: self.fraction, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_DelegationSlash, rhs: Kyve_Delegation_V1beta1_DelegationSlash) -> Bool {
    if lhs.staker != rhs.staker {return false}
    if lhs.kIndex != rhs.kIndex {return false}
    if lhs.fraction != rhs.fraction {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_UndelegationQueueEntry: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UndelegationQueueEntry"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "staker"),
    3: .same(proto: "delegator"),
    4: .same(proto: "amount"),
    5: .standard(proto: "creation_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.staker) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.delegator) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.creationTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt64Field(value: self.index, fieldNumber: 1)
    }
    if !self.staker.isEmpty {
      try visitor.visitSingularStringField(value: self.staker, fieldNumber: 2)
    }
    if !self.delegator.isEmpty {
      try visitor.visitSingularStringField(value: self.delegator, fieldNumber: 3)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 4)
    }
    if self.creationTime != 0 {
      try visitor.visitSingularUInt64Field(value: self.creationTime, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_UndelegationQueueEntry, rhs: Kyve_Delegation_V1beta1_UndelegationQueueEntry) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.staker != rhs.staker {return false}
    if lhs.delegator != rhs.delegator {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.creationTime != rhs.creationTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_QueueState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueueState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "low_index"),
    2: .standard(proto: "high_index"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.lowIndex) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.highIndex) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.lowIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.lowIndex, fieldNumber: 1)
    }
    if self.highIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.highIndex, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_QueueState, rhs: Kyve_Delegation_V1beta1_QueueState) -> Bool {
    if lhs.lowIndex != rhs.lowIndex {return false}
    if lhs.highIndex != rhs.highIndex {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Delegation_V1beta1_RedelegationCooldown: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RedelegationCooldown"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "creation_date"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.creationDate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.creationDate != 0 {
      try visitor.visitSingularUInt64Field(value: self.creationDate, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Delegation_V1beta1_RedelegationCooldown, rhs: Kyve_Delegation_V1beta1_RedelegationCooldown) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.creationDate != rhs.creationDate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
