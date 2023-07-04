// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/locker/v1beta1/locker.proto
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

///locker_id will be the key which will be derived from the LockerLookUpTable
struct Comdex_Locker_V1beta1_Locker {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lockerID: UInt64 = 0

  var depositor: String = String()

  var returnsAccumulated: String = String()

  var netBalance: String = String()

  var createdAt: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _createdAt ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_createdAt = newValue}
  }
  /// Returns true if `createdAt` has been explicitly set.
  var hasCreatedAt: Bool {return self._createdAt != nil}
  /// Clears the value of `createdAt`. Subsequent reads from it will return its default value.
  mutating func clearCreatedAt() {self._createdAt = nil}

  var assetDepositID: UInt64 = 0

  var isLocked: Bool = false

  var appID: UInt64 = 0

  var blockHeight: Int64 = 0

  var blockTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _blockTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_blockTime = newValue}
  }
  /// Returns true if `blockTime` has been explicitly set.
  var hasBlockTime: Bool {return self._blockTime != nil}
  /// Clears the value of `blockTime`. Subsequent reads from it will return its default value.
  mutating func clearBlockTime() {self._blockTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _createdAt: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _blockTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Comdex_Locker_V1beta1_UserAppAssetLockerMapping {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var lockerID: UInt64 = 0

  var userData: [Comdex_Locker_V1beta1_UserTxData] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_UserTxData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var txType: String = String()

  var amount: String = String()

  var balance: String = String()

  var txTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _txTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_txTime = newValue}
  }
  /// Returns true if `txTime` has been explicitly set.
  var hasTxTime: Bool {return self._txTime != nil}
  /// Clears the value of `txTime`. Subsequent reads from it will return its default value.
  mutating func clearTxTime() {self._txTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _txTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Comdex_Locker_V1beta1_LockerLookupTableData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var lockerIds: [UInt64] = []

  var depositedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

///Key is app_mapping_id
struct Comdex_Locker_V1beta1_LockerProductAssetMapping {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_LockedDepositedAmountDataMap {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var assetID: UInt64 = 0

  var depositedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var totalRewards: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Locker_V1beta1_Locker: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_UserAppAssetLockerMapping: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_UserTxData: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_LockerLookupTableData: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_LockerProductAssetMapping: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_LockedDepositedAmountDataMap: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.locker.v1beta1"

extension Comdex_Locker_V1beta1_Locker: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Locker"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "locker_id"),
    2: .same(proto: "depositor"),
    3: .standard(proto: "returns_accumulated"),
    4: .standard(proto: "net_balance"),
    5: .standard(proto: "created_at"),
    6: .standard(proto: "asset_deposit_id"),
    7: .standard(proto: "is_locked"),
    8: .standard(proto: "app_id"),
    9: .standard(proto: "block_height"),
    10: .standard(proto: "block_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.returnsAccumulated) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.netBalance) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._createdAt) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.assetDepositID) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.isLocked) }()
      case 8: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 9: try { try decoder.decodeSingularInt64Field(value: &self.blockHeight) }()
      case 10: try { try decoder.decodeSingularMessageField(value: &self._blockTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 1)
    }
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 2)
    }
    if !self.returnsAccumulated.isEmpty {
      try visitor.visitSingularStringField(value: self.returnsAccumulated, fieldNumber: 3)
    }
    if !self.netBalance.isEmpty {
      try visitor.visitSingularStringField(value: self.netBalance, fieldNumber: 4)
    }
    try { if let v = self._createdAt {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if self.assetDepositID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetDepositID, fieldNumber: 6)
    }
    if self.isLocked != false {
      try visitor.visitSingularBoolField(value: self.isLocked, fieldNumber: 7)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 8)
    }
    if self.blockHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.blockHeight, fieldNumber: 9)
    }
    try { if let v = self._blockTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_Locker, rhs: Comdex_Locker_V1beta1_Locker) -> Bool {
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.depositor != rhs.depositor {return false}
    if lhs.returnsAccumulated != rhs.returnsAccumulated {return false}
    if lhs.netBalance != rhs.netBalance {return false}
    if lhs._createdAt != rhs._createdAt {return false}
    if lhs.assetDepositID != rhs.assetDepositID {return false}
    if lhs.isLocked != rhs.isLocked {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs._blockTime != rhs._blockTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_UserAppAssetLockerMapping: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UserAppAssetLockerMapping"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .standard(proto: "app_id"),
    3: .standard(proto: "asset_id"),
    4: .standard(proto: "locker_id"),
    5: .standard(proto: "user_data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.userData) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 2)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 3)
    }
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 4)
    }
    if !self.userData.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.userData, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_UserAppAssetLockerMapping, rhs: Comdex_Locker_V1beta1_UserAppAssetLockerMapping) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.userData != rhs.userData {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_UserTxData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UserTxData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "tx_type"),
    2: .same(proto: "amount"),
    3: .same(proto: "balance"),
    4: .standard(proto: "tx_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.txType) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.balance) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._txTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.txType.isEmpty {
      try visitor.visitSingularStringField(value: self.txType, fieldNumber: 1)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 2)
    }
    if !self.balance.isEmpty {
      try visitor.visitSingularStringField(value: self.balance, fieldNumber: 3)
    }
    try { if let v = self._txTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_UserTxData, rhs: Comdex_Locker_V1beta1_UserTxData) -> Bool {
    if lhs.txType != rhs.txType {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.balance != rhs.balance {return false}
    if lhs._txTime != rhs._txTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_LockerLookupTableData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LockerLookupTableData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "app_id"),
    2: .standard(proto: "asset_id"),
    3: .standard(proto: "locker_ids"),
    4: .standard(proto: "deposited_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 3: try { try decoder.decodeRepeatedUInt64Field(value: &self.lockerIds) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.depositedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 1)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 2)
    }
    if !self.lockerIds.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.lockerIds, fieldNumber: 3)
    }
    if !self.depositedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.depositedAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_LockerLookupTableData, rhs: Comdex_Locker_V1beta1_LockerLookupTableData) -> Bool {
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.lockerIds != rhs.lockerIds {return false}
    if lhs.depositedAmount != rhs.depositedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_LockerProductAssetMapping: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LockerProductAssetMapping"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "app_id"),
    2: .standard(proto: "asset_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 1)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_LockerProductAssetMapping, rhs: Comdex_Locker_V1beta1_LockerProductAssetMapping) -> Bool {
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_LockedDepositedAmountDataMap: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LockedDepositedAmountDataMap"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "asset_id"),
    2: .standard(proto: "deposited_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.depositedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 1)
    }
    if !self.depositedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.depositedAmount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_LockedDepositedAmountDataMap, rhs: Comdex_Locker_V1beta1_LockedDepositedAmountDataMap) -> Bool {
    if lhs.assetID != rhs.assetID {return false}
    if lhs.depositedAmount != rhs.depositedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LockerTotalRewardsByAssetAppWise"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "app_id"),
    2: .standard(proto: "asset_id"),
    3: .standard(proto: "total_rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.totalRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 1)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 2)
    }
    if !self.totalRewards.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRewards, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise, rhs: Comdex_Locker_V1beta1_LockerTotalRewardsByAssetAppWise) -> Bool {
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.totalRewards != rhs.totalRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}