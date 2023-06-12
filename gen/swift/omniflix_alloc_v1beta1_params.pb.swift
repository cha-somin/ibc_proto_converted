// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: omniflix/alloc/v1beta1/params.proto
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

struct Omniflix_Alloc_V1beta1_WeightedAddress {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var weight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Omniflix_Alloc_V1beta1_DistributionProportions {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingRewards: String = String()

  var nftIncentives: String = String()

  var nodeHostsIncentives: String = String()

  var developerRewards: String = String()

  var communityPool: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Omniflix_Alloc_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// distribution_proportions defines the proportion of the minted denom
  var distributionProportions: Omniflix_Alloc_V1beta1_DistributionProportions {
    get {return _distributionProportions ?? Omniflix_Alloc_V1beta1_DistributionProportions()}
    set {_distributionProportions = newValue}
  }
  /// Returns true if `distributionProportions` has been explicitly set.
  var hasDistributionProportions: Bool {return self._distributionProportions != nil}
  /// Clears the value of `distributionProportions`. Subsequent reads from it will return its default value.
  mutating func clearDistributionProportions() {self._distributionProportions = nil}

  /// address to receive developer rewards
  var weightedDeveloperRewardsReceivers: [Omniflix_Alloc_V1beta1_WeightedAddress] = []

  /// address to receive nft incentives
  var weightedNftIncentivesReceivers: [Omniflix_Alloc_V1beta1_WeightedAddress] = []

  /// address to receive node host incentives
  var weightedNodeHostsIncentivesReceivers: [Omniflix_Alloc_V1beta1_WeightedAddress] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _distributionProportions: Omniflix_Alloc_V1beta1_DistributionProportions? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Omniflix_Alloc_V1beta1_WeightedAddress: @unchecked Sendable {}
extension Omniflix_Alloc_V1beta1_DistributionProportions: @unchecked Sendable {}
extension Omniflix_Alloc_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "omniflix.alloc.v1beta1"

extension Omniflix_Alloc_V1beta1_WeightedAddress: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WeightedAddress"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.weight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.weight.isEmpty {
      try visitor.visitSingularStringField(value: self.weight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Omniflix_Alloc_V1beta1_WeightedAddress, rhs: Omniflix_Alloc_V1beta1_WeightedAddress) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Omniflix_Alloc_V1beta1_DistributionProportions: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DistributionProportions"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_rewards"),
    2: .standard(proto: "nft_incentives"),
    3: .standard(proto: "node_hosts_incentives"),
    4: .standard(proto: "developer_rewards"),
    5: .standard(proto: "community_pool"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingRewards) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.nftIncentives) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.nodeHostsIncentives) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.developerRewards) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.communityPool) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingRewards.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingRewards, fieldNumber: 1)
    }
    if !self.nftIncentives.isEmpty {
      try visitor.visitSingularStringField(value: self.nftIncentives, fieldNumber: 2)
    }
    if !self.nodeHostsIncentives.isEmpty {
      try visitor.visitSingularStringField(value: self.nodeHostsIncentives, fieldNumber: 3)
    }
    if !self.developerRewards.isEmpty {
      try visitor.visitSingularStringField(value: self.developerRewards, fieldNumber: 4)
    }
    if !self.communityPool.isEmpty {
      try visitor.visitSingularStringField(value: self.communityPool, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Omniflix_Alloc_V1beta1_DistributionProportions, rhs: Omniflix_Alloc_V1beta1_DistributionProportions) -> Bool {
    if lhs.stakingRewards != rhs.stakingRewards {return false}
    if lhs.nftIncentives != rhs.nftIncentives {return false}
    if lhs.nodeHostsIncentives != rhs.nodeHostsIncentives {return false}
    if lhs.developerRewards != rhs.developerRewards {return false}
    if lhs.communityPool != rhs.communityPool {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Omniflix_Alloc_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "distribution_proportions"),
    2: .standard(proto: "weighted_developer_rewards_receivers"),
    3: .standard(proto: "weighted_nft_incentives_receivers"),
    4: .standard(proto: "weighted_node_hosts_incentives_receivers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._distributionProportions) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.weightedDeveloperRewardsReceivers) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.weightedNftIncentivesReceivers) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.weightedNodeHostsIncentivesReceivers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._distributionProportions {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.weightedDeveloperRewardsReceivers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.weightedDeveloperRewardsReceivers, fieldNumber: 2)
    }
    if !self.weightedNftIncentivesReceivers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.weightedNftIncentivesReceivers, fieldNumber: 3)
    }
    if !self.weightedNodeHostsIncentivesReceivers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.weightedNodeHostsIncentivesReceivers, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Omniflix_Alloc_V1beta1_Params, rhs: Omniflix_Alloc_V1beta1_Params) -> Bool {
    if lhs._distributionProportions != rhs._distributionProportions {return false}
    if lhs.weightedDeveloperRewardsReceivers != rhs.weightedDeveloperRewardsReceivers {return false}
    if lhs.weightedNftIncentivesReceivers != rhs.weightedNftIncentivesReceivers {return false}
    if lhs.weightedNodeHostsIncentivesReceivers != rhs.weightedNodeHostsIncentivesReceivers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
