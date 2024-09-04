// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/superfluid/superfluid.proto
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

/// SuperfluidAssetType indicates whether the superfluid asset is
/// a native token, lp share of a pool, or concentrated share of a pool
enum Osmosis_Superfluid_SuperfluidAssetType: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case native // = 0
  case lpshare // = 1

  /// SuperfluidAssetTypeLendingShare = 3; // for now not exist
  case concentratedShare // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .native
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .native
    case 1: self = .lpshare
    case 2: self = .concentratedShare
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .native: return 0
    case .lpshare: return 1
    case .concentratedShare: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Osmosis_Superfluid_SuperfluidAssetType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Osmosis_Superfluid_SuperfluidAssetType] = [
    .native,
    .lpshare,
    .concentratedShare,
  ]
}

#endif  // swift(>=4.2)

/// SuperfluidAsset stores the pair of superfluid asset type and denom pair
struct Osmosis_Superfluid_SuperfluidAsset {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  /// AssetType indicates whether the superfluid asset is a native token or an lp
  /// share
  var assetType: Osmosis_Superfluid_SuperfluidAssetType = .native

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SuperfluidIntermediaryAccount takes the role of intermediary between LP token
/// and OSMO tokens for superfluid staking. The intermediary account is the
/// actual account responsible for delegation, not the validator account itself.
struct Osmosis_Superfluid_SuperfluidIntermediaryAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Denom indicates the denom of the superfluid asset.
  var denom: String = String()

  var valAddr: String = String()

  /// perpetual gauge for rewards distribution
  var gaugeID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// The Osmo-Equivalent-Multiplier Record for epoch N refers to the osmo worth we
/// treat an LP share as having, for all of epoch N. Eventually this is intended
/// to be set as the Time-weighted-average-osmo-backing for the entire duration
/// of epoch N-1. (Thereby locking what's in use for epoch N as based on the
/// prior epochs rewards) However for now, this is not the TWAP but instead the
/// spot price at the boundary. For different types of assets in the future, it
/// could change.
struct Osmosis_Superfluid_OsmoEquivalentMultiplierRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var epochNumber: Int64 = 0

  /// superfluid asset denom, can be LP token or native token
  var denom: String = String()

  var multiplier: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SuperfluidDelegationRecord is a struct used to indicate superfluid
/// delegations of an account in the state machine in a user friendly form.
struct Osmosis_Superfluid_SuperfluidDelegationRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var delegatorAddress: String = String()

  var validatorAddress: String = String()

  var delegationAmount: Cosmos_Base_V1beta1_Coin {
    get {return _delegationAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_delegationAmount = newValue}
  }
  /// Returns true if `delegationAmount` has been explicitly set.
  var hasDelegationAmount: Bool {return self._delegationAmount != nil}
  /// Clears the value of `delegationAmount`. Subsequent reads from it will return its default value.
  mutating func clearDelegationAmount() {self._delegationAmount = nil}

  var equivalentStakedAmount: Cosmos_Base_V1beta1_Coin {
    get {return _equivalentStakedAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_equivalentStakedAmount = newValue}
  }
  /// Returns true if `equivalentStakedAmount` has been explicitly set.
  var hasEquivalentStakedAmount: Bool {return self._equivalentStakedAmount != nil}
  /// Clears the value of `equivalentStakedAmount`. Subsequent reads from it will return its default value.
  mutating func clearEquivalentStakedAmount() {self._equivalentStakedAmount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _delegationAmount: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _equivalentStakedAmount: Cosmos_Base_V1beta1_Coin? = nil
}

/// LockIdIntermediaryAccountConnection is a struct used to indicate the
/// relationship between the underlying lock id and superfluid delegation done
/// via lp shares.
struct Osmosis_Superfluid_LockIdIntermediaryAccountConnection {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lockID: UInt64 = 0

  var intermediaryAccount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_UnpoolWhitelistedPools {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ids: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_ConcentratedPoolUserPositionRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var validatorAddress: String = String()

  var positionID: UInt64 = 0

  var lockID: UInt64 = 0

  var syntheticLock: Osmosis_Lockup_SyntheticLock {
    get {return _syntheticLock ?? Osmosis_Lockup_SyntheticLock()}
    set {_syntheticLock = newValue}
  }
  /// Returns true if `syntheticLock` has been explicitly set.
  var hasSyntheticLock: Bool {return self._syntheticLock != nil}
  /// Clears the value of `syntheticLock`. Subsequent reads from it will return its default value.
  mutating func clearSyntheticLock() {self._syntheticLock = nil}

  var delegationAmount: Cosmos_Base_V1beta1_Coin {
    get {return _delegationAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_delegationAmount = newValue}
  }
  /// Returns true if `delegationAmount` has been explicitly set.
  var hasDelegationAmount: Bool {return self._delegationAmount != nil}
  /// Clears the value of `delegationAmount`. Subsequent reads from it will return its default value.
  mutating func clearDelegationAmount() {self._delegationAmount = nil}

  var equivalentStakedAmount: Cosmos_Base_V1beta1_Coin {
    get {return _equivalentStakedAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_equivalentStakedAmount = newValue}
  }
  /// Returns true if `equivalentStakedAmount` has been explicitly set.
  var hasEquivalentStakedAmount: Bool {return self._equivalentStakedAmount != nil}
  /// Clears the value of `equivalentStakedAmount`. Subsequent reads from it will return its default value.
  mutating func clearEquivalentStakedAmount() {self._equivalentStakedAmount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _syntheticLock: Osmosis_Lockup_SyntheticLock? = nil
  fileprivate var _delegationAmount: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _equivalentStakedAmount: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Superfluid_SuperfluidAssetType: @unchecked Sendable {}
extension Osmosis_Superfluid_SuperfluidAsset: @unchecked Sendable {}
extension Osmosis_Superfluid_SuperfluidIntermediaryAccount: @unchecked Sendable {}
extension Osmosis_Superfluid_OsmoEquivalentMultiplierRecord: @unchecked Sendable {}
extension Osmosis_Superfluid_SuperfluidDelegationRecord: @unchecked Sendable {}
extension Osmosis_Superfluid_LockIdIntermediaryAccountConnection: @unchecked Sendable {}
extension Osmosis_Superfluid_UnpoolWhitelistedPools: @unchecked Sendable {}
extension Osmosis_Superfluid_ConcentratedPoolUserPositionRecord: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.superfluid"

extension Osmosis_Superfluid_SuperfluidAssetType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "SuperfluidAssetTypeNative"),
    1: .same(proto: "SuperfluidAssetTypeLPShare"),
    2: .same(proto: "SuperfluidAssetTypeConcentratedShare"),
  ]
}

extension Osmosis_Superfluid_SuperfluidAsset: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SuperfluidAsset"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "asset_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.assetType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if self.assetType != .native {
      try visitor.visitSingularEnumField(value: self.assetType, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_SuperfluidAsset, rhs: Osmosis_Superfluid_SuperfluidAsset) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.assetType != rhs.assetType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_SuperfluidIntermediaryAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SuperfluidIntermediaryAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "val_addr"),
    3: .standard(proto: "gauge_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.valAddr) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.gaugeID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.valAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.valAddr, fieldNumber: 2)
    }
    if self.gaugeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.gaugeID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_SuperfluidIntermediaryAccount, rhs: Osmosis_Superfluid_SuperfluidIntermediaryAccount) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.valAddr != rhs.valAddr {return false}
    if lhs.gaugeID != rhs.gaugeID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_OsmoEquivalentMultiplierRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OsmoEquivalentMultiplierRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_number"),
    2: .same(proto: "denom"),
    3: .same(proto: "multiplier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.epochNumber) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.multiplier) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.epochNumber != 0 {
      try visitor.visitSingularInt64Field(value: self.epochNumber, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.multiplier.isEmpty {
      try visitor.visitSingularStringField(value: self.multiplier, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_OsmoEquivalentMultiplierRecord, rhs: Osmosis_Superfluid_OsmoEquivalentMultiplierRecord) -> Bool {
    if lhs.epochNumber != rhs.epochNumber {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.multiplier != rhs.multiplier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_SuperfluidDelegationRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SuperfluidDelegationRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "delegator_address"),
    2: .standard(proto: "validator_address"),
    3: .standard(proto: "delegation_amount"),
    4: .standard(proto: "equivalent_staked_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.delegatorAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._delegationAmount) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._equivalentStakedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.delegatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.delegatorAddress, fieldNumber: 1)
    }
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 2)
    }
    try { if let v = self._delegationAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._equivalentStakedAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_SuperfluidDelegationRecord, rhs: Osmosis_Superfluid_SuperfluidDelegationRecord) -> Bool {
    if lhs.delegatorAddress != rhs.delegatorAddress {return false}
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs._delegationAmount != rhs._delegationAmount {return false}
    if lhs._equivalentStakedAmount != rhs._equivalentStakedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_LockIdIntermediaryAccountConnection: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LockIdIntermediaryAccountConnection"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "lock_id"),
    2: .standard(proto: "intermediary_account"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.lockID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.intermediaryAccount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.lockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockID, fieldNumber: 1)
    }
    if !self.intermediaryAccount.isEmpty {
      try visitor.visitSingularStringField(value: self.intermediaryAccount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_LockIdIntermediaryAccountConnection, rhs: Osmosis_Superfluid_LockIdIntermediaryAccountConnection) -> Bool {
    if lhs.lockID != rhs.lockID {return false}
    if lhs.intermediaryAccount != rhs.intermediaryAccount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_UnpoolWhitelistedPools: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UnpoolWhitelistedPools"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedUInt64Field(value: &self.ids) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ids.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.ids, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_UnpoolWhitelistedPools, rhs: Osmosis_Superfluid_UnpoolWhitelistedPools) -> Bool {
    if lhs.ids != rhs.ids {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_ConcentratedPoolUserPositionRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConcentratedPoolUserPositionRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .standard(proto: "position_id"),
    3: .standard(proto: "lock_id"),
    4: .standard(proto: "synthetic_lock"),
    5: .standard(proto: "delegation_amount"),
    6: .standard(proto: "equivalent_staked_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.positionID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.lockID) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._syntheticLock) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._delegationAmount) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._equivalentStakedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    if self.positionID != 0 {
      try visitor.visitSingularUInt64Field(value: self.positionID, fieldNumber: 2)
    }
    if self.lockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockID, fieldNumber: 3)
    }
    try { if let v = self._syntheticLock {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._delegationAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._equivalentStakedAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_ConcentratedPoolUserPositionRecord, rhs: Osmosis_Superfluid_ConcentratedPoolUserPositionRecord) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs.positionID != rhs.positionID {return false}
    if lhs.lockID != rhs.lockID {return false}
    if lhs._syntheticLock != rhs._syntheticLock {return false}
    if lhs._delegationAmount != rhs._delegationAmount {return false}
    if lhs._equivalentStakedAmount != rhs._equivalentStakedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
