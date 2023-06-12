// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/mining/models.proto
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

struct Stafihub_Stafihub_Mining_StakePool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var index: UInt32 = 0

  /// staked token denom
  var stakeTokenDenom: String = String()

  var rewardPools: [Stafihub_Stafihub_Mining_RewardPool] = []

  /// total (staked) balance of staked token
  var totalStakedAmount: String = String()

  var totalStakedPower: String = String()

  var emergencySwitch: Bool = false

  var creator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_RewardPool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var index: UInt32 = 0

  var rewardTokenDenom: String = String()

  var totalRewardAmount: String = String()

  var leftRewardAmount: String = String()

  var rewardPerSecond: String = String()

  var startTimestamp: UInt64 = 0

  var rewardPerPower: String = String()

  var lastRewardTimestamp: UInt64 = 0

  var creator: String = String()

  var totalClaimedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_UserStakeRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var userAddress: String = String()

  var stakePoolIndex: UInt32 = 0

  var index: UInt32 = 0

  var stakedAmount: String = String()

  var stakedPower: String = String()

  /// the begin timestamp
  var startTimestamp: UInt64 = 0

  /// promise not unstake before this timestamp
  var lockEndTimestamp: UInt64 = 0

  var userRewardInfos: [Stafihub_Stafihub_Mining_UserRewardInfo] = []

  var stakeItemIndex: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_UserRewardInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var rewardPoolIndex: UInt32 = 0

  var rewardTokenDenom: String = String()

  var rewardDebt: String = String()

  var claimedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_RewardToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var rewardTokenDenom: String = String()

  var minTotalRewardAmount: String = String()

  var minRewardPerSecond: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_StakeItem {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var index: UInt32 = 0

  var stakePoolIndex: UInt32 = 0

  var lockSecond: UInt64 = 0

  /// user stakedPower = powerRewardRate * stakedAmount
  var powerRewardRate: String = String()

  var enable: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Mining_StakeItemLimit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var maxPowerRewardRate: String = String()

  var maxLockSecond: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Mining_StakePool: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_RewardPool: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_UserStakeRecord: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_UserRewardInfo: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_RewardToken: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_StakeItem: @unchecked Sendable {}
extension Stafihub_Stafihub_Mining_StakeItemLimit: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.mining"

extension Stafihub_Stafihub_Mining_StakePool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StakePool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "stakeTokenDenom"),
    3: .same(proto: "rewardPools"),
    4: .same(proto: "totalStakedAmount"),
    5: .same(proto: "totalStakedPower"),
    6: .same(proto: "emergencySwitch"),
    7: .same(proto: "creator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.stakeTokenDenom) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.rewardPools) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.totalStakedAmount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.totalStakedPower) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.emergencySwitch) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 1)
    }
    if !self.stakeTokenDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakeTokenDenom, fieldNumber: 2)
    }
    if !self.rewardPools.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardPools, fieldNumber: 3)
    }
    if !self.totalStakedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalStakedAmount, fieldNumber: 4)
    }
    if !self.totalStakedPower.isEmpty {
      try visitor.visitSingularStringField(value: self.totalStakedPower, fieldNumber: 5)
    }
    if self.emergencySwitch != false {
      try visitor.visitSingularBoolField(value: self.emergencySwitch, fieldNumber: 6)
    }
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_StakePool, rhs: Stafihub_Stafihub_Mining_StakePool) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.stakeTokenDenom != rhs.stakeTokenDenom {return false}
    if lhs.rewardPools != rhs.rewardPools {return false}
    if lhs.totalStakedAmount != rhs.totalStakedAmount {return false}
    if lhs.totalStakedPower != rhs.totalStakedPower {return false}
    if lhs.emergencySwitch != rhs.emergencySwitch {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_RewardPool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardPool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "rewardTokenDenom"),
    3: .same(proto: "totalRewardAmount"),
    4: .same(proto: "leftRewardAmount"),
    5: .same(proto: "rewardPerSecond"),
    6: .same(proto: "startTimestamp"),
    7: .same(proto: "rewardPerPower"),
    8: .same(proto: "lastRewardTimestamp"),
    9: .same(proto: "creator"),
    10: .same(proto: "totalClaimedAmount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rewardTokenDenom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.totalRewardAmount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.leftRewardAmount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.rewardPerSecond) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.startTimestamp) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.rewardPerPower) }()
      case 8: try { try decoder.decodeSingularUInt64Field(value: &self.lastRewardTimestamp) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.totalClaimedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 1)
    }
    if !self.rewardTokenDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardTokenDenom, fieldNumber: 2)
    }
    if !self.totalRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRewardAmount, fieldNumber: 3)
    }
    if !self.leftRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.leftRewardAmount, fieldNumber: 4)
    }
    if !self.rewardPerSecond.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardPerSecond, fieldNumber: 5)
    }
    if self.startTimestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.startTimestamp, fieldNumber: 6)
    }
    if !self.rewardPerPower.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardPerPower, fieldNumber: 7)
    }
    if self.lastRewardTimestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.lastRewardTimestamp, fieldNumber: 8)
    }
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 9)
    }
    if !self.totalClaimedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.totalClaimedAmount, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_RewardPool, rhs: Stafihub_Stafihub_Mining_RewardPool) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.rewardTokenDenom != rhs.rewardTokenDenom {return false}
    if lhs.totalRewardAmount != rhs.totalRewardAmount {return false}
    if lhs.leftRewardAmount != rhs.leftRewardAmount {return false}
    if lhs.rewardPerSecond != rhs.rewardPerSecond {return false}
    if lhs.startTimestamp != rhs.startTimestamp {return false}
    if lhs.rewardPerPower != rhs.rewardPerPower {return false}
    if lhs.lastRewardTimestamp != rhs.lastRewardTimestamp {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.totalClaimedAmount != rhs.totalClaimedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_UserStakeRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UserStakeRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userAddress"),
    2: .same(proto: "stakePoolIndex"),
    3: .same(proto: "index"),
    4: .same(proto: "stakedAmount"),
    5: .same(proto: "stakedPower"),
    6: .same(proto: "startTimestamp"),
    7: .same(proto: "lockEndTimestamp"),
    8: .same(proto: "userRewardInfos"),
    9: .same(proto: "stakeItemIndex"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.userAddress) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.stakePoolIndex) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.stakedAmount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.stakedPower) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.startTimestamp) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.lockEndTimestamp) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.userRewardInfos) }()
      case 9: try { try decoder.decodeSingularUInt32Field(value: &self.stakeItemIndex) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.userAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.userAddress, fieldNumber: 1)
    }
    if self.stakePoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.stakePoolIndex, fieldNumber: 2)
    }
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 3)
    }
    if !self.stakedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.stakedAmount, fieldNumber: 4)
    }
    if !self.stakedPower.isEmpty {
      try visitor.visitSingularStringField(value: self.stakedPower, fieldNumber: 5)
    }
    if self.startTimestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.startTimestamp, fieldNumber: 6)
    }
    if self.lockEndTimestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockEndTimestamp, fieldNumber: 7)
    }
    if !self.userRewardInfos.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.userRewardInfos, fieldNumber: 8)
    }
    if self.stakeItemIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.stakeItemIndex, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_UserStakeRecord, rhs: Stafihub_Stafihub_Mining_UserStakeRecord) -> Bool {
    if lhs.userAddress != rhs.userAddress {return false}
    if lhs.stakePoolIndex != rhs.stakePoolIndex {return false}
    if lhs.index != rhs.index {return false}
    if lhs.stakedAmount != rhs.stakedAmount {return false}
    if lhs.stakedPower != rhs.stakedPower {return false}
    if lhs.startTimestamp != rhs.startTimestamp {return false}
    if lhs.lockEndTimestamp != rhs.lockEndTimestamp {return false}
    if lhs.userRewardInfos != rhs.userRewardInfos {return false}
    if lhs.stakeItemIndex != rhs.stakeItemIndex {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_UserRewardInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UserRewardInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "rewardPoolIndex"),
    2: .same(proto: "rewardTokenDenom"),
    3: .same(proto: "rewardDebt"),
    4: .same(proto: "claimedAmount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.rewardPoolIndex) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rewardTokenDenom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.rewardDebt) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.claimedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.rewardPoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.rewardPoolIndex, fieldNumber: 1)
    }
    if !self.rewardTokenDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardTokenDenom, fieldNumber: 2)
    }
    if !self.rewardDebt.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardDebt, fieldNumber: 3)
    }
    if !self.claimedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.claimedAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_UserRewardInfo, rhs: Stafihub_Stafihub_Mining_UserRewardInfo) -> Bool {
    if lhs.rewardPoolIndex != rhs.rewardPoolIndex {return false}
    if lhs.rewardTokenDenom != rhs.rewardTokenDenom {return false}
    if lhs.rewardDebt != rhs.rewardDebt {return false}
    if lhs.claimedAmount != rhs.claimedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_RewardToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "rewardTokenDenom"),
    2: .same(proto: "minTotalRewardAmount"),
    3: .same(proto: "minRewardPerSecond"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.rewardTokenDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.minTotalRewardAmount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.minRewardPerSecond) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.rewardTokenDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardTokenDenom, fieldNumber: 1)
    }
    if !self.minTotalRewardAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.minTotalRewardAmount, fieldNumber: 2)
    }
    if !self.minRewardPerSecond.isEmpty {
      try visitor.visitSingularStringField(value: self.minRewardPerSecond, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_RewardToken, rhs: Stafihub_Stafihub_Mining_RewardToken) -> Bool {
    if lhs.rewardTokenDenom != rhs.rewardTokenDenom {return false}
    if lhs.minTotalRewardAmount != rhs.minTotalRewardAmount {return false}
    if lhs.minRewardPerSecond != rhs.minRewardPerSecond {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_StakeItem: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StakeItem"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "stakePoolIndex"),
    3: .same(proto: "lockSecond"),
    4: .same(proto: "powerRewardRate"),
    5: .same(proto: "enable"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.stakePoolIndex) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.lockSecond) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.powerRewardRate) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.enable) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 1)
    }
    if self.stakePoolIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.stakePoolIndex, fieldNumber: 2)
    }
    if self.lockSecond != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockSecond, fieldNumber: 3)
    }
    if !self.powerRewardRate.isEmpty {
      try visitor.visitSingularStringField(value: self.powerRewardRate, fieldNumber: 4)
    }
    if self.enable != false {
      try visitor.visitSingularBoolField(value: self.enable, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_StakeItem, rhs: Stafihub_Stafihub_Mining_StakeItem) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.stakePoolIndex != rhs.stakePoolIndex {return false}
    if lhs.lockSecond != rhs.lockSecond {return false}
    if lhs.powerRewardRate != rhs.powerRewardRate {return false}
    if lhs.enable != rhs.enable {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Mining_StakeItemLimit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StakeItemLimit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "maxPowerRewardRate"),
    2: .same(proto: "maxLockSecond"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.maxPowerRewardRate) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.maxLockSecond) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.maxPowerRewardRate.isEmpty {
      try visitor.visitSingularStringField(value: self.maxPowerRewardRate, fieldNumber: 1)
    }
    if self.maxLockSecond != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxLockSecond, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Mining_StakeItemLimit, rhs: Stafihub_Stafihub_Mining_StakeItemLimit) -> Bool {
    if lhs.maxPowerRewardRate != rhs.maxPowerRewardRate {return false}
    if lhs.maxLockSecond != rhs.maxLockSecond {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
