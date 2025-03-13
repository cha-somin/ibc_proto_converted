// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stratos/pot/v1/genesis.proto
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

/// GenesisState defines the register module's genesis state.
struct Stratos_Pot_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Stratos_Pot_V1_Params {
    get {return _params ?? Stratos_Pot_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var totalMinedToken: Cosmos_Base_V1beta1_Coin {
    get {return _totalMinedToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_totalMinedToken = newValue}
  }
  /// Returns true if `totalMinedToken` has been explicitly set.
  var hasTotalMinedToken: Bool {return self._totalMinedToken != nil}
  /// Clears the value of `totalMinedToken`. Subsequent reads from it will return its default value.
  mutating func clearTotalMinedToken() {self._totalMinedToken = nil}

  var lastDistributedEpoch: String = String()

  var immatureTotalInfo: [Stratos_Pot_V1_ImmatureTotal] = []

  var matureTotalInfo: [Stratos_Pot_V1_MatureTotal] = []

  var individualRewardInfo: [Stratos_Pot_V1_Reward] = []

  var maturedEpoch: String = String()

  var rewardTotalInfo: [Stratos_Pot_V1_RewardTotal] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Stratos_Pot_V1_Params? = nil
  fileprivate var _totalMinedToken: Cosmos_Base_V1beta1_Coin? = nil
}

struct Stratos_Pot_V1_ImmatureTotal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var walletAddress: String = String()

  var value: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stratos_Pot_V1_MatureTotal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var walletAddress: String = String()

  var value: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stratos_Pot_V1_RewardTotal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var epoch: String = String()

  var totalReward: Stratos_Pot_V1_TotalReward {
    get {return _totalReward ?? Stratos_Pot_V1_TotalReward()}
    set {_totalReward = newValue}
  }
  /// Returns true if `totalReward` has been explicitly set.
  var hasTotalReward: Bool {return self._totalReward != nil}
  /// Clears the value of `totalReward`. Subsequent reads from it will return its default value.
  mutating func clearTotalReward() {self._totalReward = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _totalReward: Stratos_Pot_V1_TotalReward? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stratos_Pot_V1_GenesisState: @unchecked Sendable {}
extension Stratos_Pot_V1_ImmatureTotal: @unchecked Sendable {}
extension Stratos_Pot_V1_MatureTotal: @unchecked Sendable {}
extension Stratos_Pot_V1_RewardTotal: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stratos.pot.v1"

extension Stratos_Pot_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "total_mined_token"),
    3: .standard(proto: "last_distributed_epoch"),
    4: .standard(proto: "immature_total_info"),
    5: .standard(proto: "mature_total_info"),
    6: .standard(proto: "individual_reward_info"),
    7: .standard(proto: "matured_epoch"),
    8: .standard(proto: "reward_total_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._totalMinedToken) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.lastDistributedEpoch) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.immatureTotalInfo) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.matureTotalInfo) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.individualRewardInfo) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.maturedEpoch) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.rewardTotalInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._totalMinedToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.lastDistributedEpoch.isEmpty {
      try visitor.visitSingularStringField(value: self.lastDistributedEpoch, fieldNumber: 3)
    }
    if !self.immatureTotalInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.immatureTotalInfo, fieldNumber: 4)
    }
    if !self.matureTotalInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.matureTotalInfo, fieldNumber: 5)
    }
    if !self.individualRewardInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.individualRewardInfo, fieldNumber: 6)
    }
    if !self.maturedEpoch.isEmpty {
      try visitor.visitSingularStringField(value: self.maturedEpoch, fieldNumber: 7)
    }
    if !self.rewardTotalInfo.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardTotalInfo, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Pot_V1_GenesisState, rhs: Stratos_Pot_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs._totalMinedToken != rhs._totalMinedToken {return false}
    if lhs.lastDistributedEpoch != rhs.lastDistributedEpoch {return false}
    if lhs.immatureTotalInfo != rhs.immatureTotalInfo {return false}
    if lhs.matureTotalInfo != rhs.matureTotalInfo {return false}
    if lhs.individualRewardInfo != rhs.individualRewardInfo {return false}
    if lhs.maturedEpoch != rhs.maturedEpoch {return false}
    if lhs.rewardTotalInfo != rhs.rewardTotalInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Pot_V1_ImmatureTotal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ImmatureTotal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "wallet_address"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.walletAddress) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.walletAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.walletAddress, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Pot_V1_ImmatureTotal, rhs: Stratos_Pot_V1_ImmatureTotal) -> Bool {
    if lhs.walletAddress != rhs.walletAddress {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Pot_V1_MatureTotal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MatureTotal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "wallet_address"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.walletAddress) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.walletAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.walletAddress, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Pot_V1_MatureTotal, rhs: Stratos_Pot_V1_MatureTotal) -> Bool {
    if lhs.walletAddress != rhs.walletAddress {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Pot_V1_RewardTotal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardTotal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "epoch"),
    2: .standard(proto: "total_reward"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.epoch) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._totalReward) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.epoch.isEmpty {
      try visitor.visitSingularStringField(value: self.epoch, fieldNumber: 1)
    }
    try { if let v = self._totalReward {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Pot_V1_RewardTotal, rhs: Stratos_Pot_V1_RewardTotal) -> Bool {
    if lhs.epoch != rhs.epoch {return false}
    if lhs._totalReward != rhs._totalReward {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
