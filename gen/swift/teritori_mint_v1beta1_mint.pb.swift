// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: teritori/mint/v1beta1/mint.proto
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

/// Minter represents the minting state.
struct Teritori_Mint_V1beta1_Minter {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// current block provisions
  var blockProvisions: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// required values for team rewards
struct Teritori_Mint_V1beta1_TeamVestingMonthInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var monthsSinceGenesis: Int64 = 0

  var monthStartedBlock: Int64 = 0

  var oneMonthPeriodInBlocks: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Teritori_Mint_V1beta1_MonthlyVestingAddress {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var monthlyAmounts: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Teritori_Mint_V1beta1_DistributionProportions {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// grants_program defines the proportion of the minted minted_denom that is
  /// to be allocated as grants.
  var grantsProgram: String = String()

  /// community_pool defines the proportion of the minted minted_denom that is
  /// to be allocated to the community pool.
  var communityPool: String = String()

  /// usage_incentive defines the proportion of the minted minted_denom that is
  /// to be allocated as usage incentive.
  var usageIncentive: String = String()

  /// staking defines the proportion of the minted minted_denom that is to be
  /// allocated as staking rewards.
  var staking: String = String()

  /// developer_rewards defines the proportion of the minted minted_denom that is
  /// to be allocated to developer rewards address.
  var developerRewards: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Params holds parameters for the mint module.
struct Teritori_Mint_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// type of coin to mint
  var mintDenom: String = String()

  /// block provisions from the first block
  var genesisBlockProvisions: String = String()

  /// number of blocks take to reduce rewards
  var reductionPeriodInBlocks: Int64 = 0

  /// reduction multiplier to execute on each period
  var reductionFactor: String = String()

  /// distribution_proportions defines the proportion of the minted denom
  var distributionProportions: Teritori_Mint_V1beta1_DistributionProportions {
    get {return _distributionProportions ?? Teritori_Mint_V1beta1_DistributionProportions()}
    set {_distributionProportions = newValue}
  }
  /// Returns true if `distributionProportions` has been explicitly set.
  var hasDistributionProportions: Bool {return self._distributionProportions != nil}
  /// Clears the value of `distributionProportions`. Subsequent reads from it will return its default value.
  mutating func clearDistributionProportions() {self._distributionProportions = nil}

  /// address to receive developer rewards
  var weightedDeveloperRewardsReceivers: [Teritori_Mint_V1beta1_MonthlyVestingAddress] = []

  /// usage incentive address
  var usageIncentiveAddress: String = String()

  /// grants program address
  var grantsProgramAddress: String = String()

  /// team reserve funds address
  var teamReserveAddress: String = String()

  /// start block to distribute minting rewards
  var mintingRewardsDistributionStartBlock: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _distributionProportions: Teritori_Mint_V1beta1_DistributionProportions? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Teritori_Mint_V1beta1_Minter: @unchecked Sendable {}
extension Teritori_Mint_V1beta1_TeamVestingMonthInfo: @unchecked Sendable {}
extension Teritori_Mint_V1beta1_MonthlyVestingAddress: @unchecked Sendable {}
extension Teritori_Mint_V1beta1_DistributionProportions: @unchecked Sendable {}
extension Teritori_Mint_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "teritori.mint.v1beta1"

extension Teritori_Mint_V1beta1_Minter: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Minter"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_provisions"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.blockProvisions) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.blockProvisions.isEmpty {
      try visitor.visitSingularStringField(value: self.blockProvisions, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_Minter, rhs: Teritori_Mint_V1beta1_Minter) -> Bool {
    if lhs.blockProvisions != rhs.blockProvisions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Teritori_Mint_V1beta1_TeamVestingMonthInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TeamVestingMonthInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "months_since_genesis"),
    2: .standard(proto: "month_started_block"),
    3: .standard(proto: "one_month_period_in_blocks"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.monthsSinceGenesis) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.monthStartedBlock) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.oneMonthPeriodInBlocks) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.monthsSinceGenesis != 0 {
      try visitor.visitSingularInt64Field(value: self.monthsSinceGenesis, fieldNumber: 1)
    }
    if self.monthStartedBlock != 0 {
      try visitor.visitSingularInt64Field(value: self.monthStartedBlock, fieldNumber: 2)
    }
    if self.oneMonthPeriodInBlocks != 0 {
      try visitor.visitSingularInt64Field(value: self.oneMonthPeriodInBlocks, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_TeamVestingMonthInfo, rhs: Teritori_Mint_V1beta1_TeamVestingMonthInfo) -> Bool {
    if lhs.monthsSinceGenesis != rhs.monthsSinceGenesis {return false}
    if lhs.monthStartedBlock != rhs.monthStartedBlock {return false}
    if lhs.oneMonthPeriodInBlocks != rhs.oneMonthPeriodInBlocks {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Teritori_Mint_V1beta1_MonthlyVestingAddress: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MonthlyVestingAddress"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "monthly_amounts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.monthlyAmounts) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.monthlyAmounts.isEmpty {
      try visitor.visitRepeatedStringField(value: self.monthlyAmounts, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_MonthlyVestingAddress, rhs: Teritori_Mint_V1beta1_MonthlyVestingAddress) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.monthlyAmounts != rhs.monthlyAmounts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Teritori_Mint_V1beta1_DistributionProportions: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DistributionProportions"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "grants_program"),
    2: .standard(proto: "community_pool"),
    3: .standard(proto: "usage_incentive"),
    4: .same(proto: "staking"),
    5: .standard(proto: "developer_rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.grantsProgram) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.communityPool) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.usageIncentive) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.staking) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.developerRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.grantsProgram.isEmpty {
      try visitor.visitSingularStringField(value: self.grantsProgram, fieldNumber: 1)
    }
    if !self.communityPool.isEmpty {
      try visitor.visitSingularStringField(value: self.communityPool, fieldNumber: 2)
    }
    if !self.usageIncentive.isEmpty {
      try visitor.visitSingularStringField(value: self.usageIncentive, fieldNumber: 3)
    }
    if !self.staking.isEmpty {
      try visitor.visitSingularStringField(value: self.staking, fieldNumber: 4)
    }
    if !self.developerRewards.isEmpty {
      try visitor.visitSingularStringField(value: self.developerRewards, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_DistributionProportions, rhs: Teritori_Mint_V1beta1_DistributionProportions) -> Bool {
    if lhs.grantsProgram != rhs.grantsProgram {return false}
    if lhs.communityPool != rhs.communityPool {return false}
    if lhs.usageIncentive != rhs.usageIncentive {return false}
    if lhs.staking != rhs.staking {return false}
    if lhs.developerRewards != rhs.developerRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Teritori_Mint_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "mint_denom"),
    2: .standard(proto: "genesis_block_provisions"),
    3: .standard(proto: "reduction_period_in_blocks"),
    4: .standard(proto: "reduction_factor"),
    5: .standard(proto: "distribution_proportions"),
    6: .standard(proto: "weighted_developer_rewards_receivers"),
    7: .standard(proto: "usage_incentive_address"),
    8: .standard(proto: "grants_program_address"),
    9: .standard(proto: "team_reserve_address"),
    10: .standard(proto: "minting_rewards_distribution_start_block"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.mintDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.genesisBlockProvisions) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.reductionPeriodInBlocks) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.reductionFactor) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._distributionProportions) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.weightedDeveloperRewardsReceivers) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.usageIncentiveAddress) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.grantsProgramAddress) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.teamReserveAddress) }()
      case 10: try { try decoder.decodeSingularInt64Field(value: &self.mintingRewardsDistributionStartBlock) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.mintDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.mintDenom, fieldNumber: 1)
    }
    if !self.genesisBlockProvisions.isEmpty {
      try visitor.visitSingularStringField(value: self.genesisBlockProvisions, fieldNumber: 2)
    }
    if self.reductionPeriodInBlocks != 0 {
      try visitor.visitSingularInt64Field(value: self.reductionPeriodInBlocks, fieldNumber: 3)
    }
    if !self.reductionFactor.isEmpty {
      try visitor.visitSingularStringField(value: self.reductionFactor, fieldNumber: 4)
    }
    try { if let v = self._distributionProportions {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if !self.weightedDeveloperRewardsReceivers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.weightedDeveloperRewardsReceivers, fieldNumber: 6)
    }
    if !self.usageIncentiveAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.usageIncentiveAddress, fieldNumber: 7)
    }
    if !self.grantsProgramAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.grantsProgramAddress, fieldNumber: 8)
    }
    if !self.teamReserveAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.teamReserveAddress, fieldNumber: 9)
    }
    if self.mintingRewardsDistributionStartBlock != 0 {
      try visitor.visitSingularInt64Field(value: self.mintingRewardsDistributionStartBlock, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Mint_V1beta1_Params, rhs: Teritori_Mint_V1beta1_Params) -> Bool {
    if lhs.mintDenom != rhs.mintDenom {return false}
    if lhs.genesisBlockProvisions != rhs.genesisBlockProvisions {return false}
    if lhs.reductionPeriodInBlocks != rhs.reductionPeriodInBlocks {return false}
    if lhs.reductionFactor != rhs.reductionFactor {return false}
    if lhs._distributionProportions != rhs._distributionProportions {return false}
    if lhs.weightedDeveloperRewardsReceivers != rhs.weightedDeveloperRewardsReceivers {return false}
    if lhs.usageIncentiveAddress != rhs.usageIncentiveAddress {return false}
    if lhs.grantsProgramAddress != rhs.grantsProgramAddress {return false}
    if lhs.teamReserveAddress != rhs.teamReserveAddress {return false}
    if lhs.mintingRewardsDistributionStartBlock != rhs.mintingRewardsDistributionStartBlock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}