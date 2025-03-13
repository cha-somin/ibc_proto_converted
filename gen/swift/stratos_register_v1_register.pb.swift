// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stratos/register/v1/register.proto
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

/// Params defines the Register module parameters
struct Stratos_Register_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bondDenom: String = String()

  var unbondingThreasholdTime: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _unbondingThreasholdTime ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_unbondingThreasholdTime = newValue}
  }
  /// Returns true if `unbondingThreasholdTime` has been explicitly set.
  var hasUnbondingThreasholdTime: Bool {return self._unbondingThreasholdTime != nil}
  /// Clears the value of `unbondingThreasholdTime`. Subsequent reads from it will return its default value.
  mutating func clearUnbondingThreasholdTime() {self._unbondingThreasholdTime = nil}

  var unbondingCompletionTime: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _unbondingCompletionTime ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_unbondingCompletionTime = newValue}
  }
  /// Returns true if `unbondingCompletionTime` has been explicitly set.
  var hasUnbondingCompletionTime: Bool {return self._unbondingCompletionTime != nil}
  /// Clears the value of `unbondingCompletionTime`. Subsequent reads from it will return its default value.
  mutating func clearUnbondingCompletionTime() {self._unbondingCompletionTime = nil}

  var maxEntries: UInt32 = 0

  var resourceNodeRegEnabled: Bool = false

  var resourceNodeMinDeposit: Cosmos_Base_V1beta1_Coin {
    get {return _resourceNodeMinDeposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_resourceNodeMinDeposit = newValue}
  }
  /// Returns true if `resourceNodeMinDeposit` has been explicitly set.
  var hasResourceNodeMinDeposit: Bool {return self._resourceNodeMinDeposit != nil}
  /// Clears the value of `resourceNodeMinDeposit`. Subsequent reads from it will return its default value.
  mutating func clearResourceNodeMinDeposit() {self._resourceNodeMinDeposit = nil}

  var votingPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _votingPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_votingPeriod = newValue}
  }
  /// Returns true if `votingPeriod` has been explicitly set.
  var hasVotingPeriod: Bool {return self._votingPeriod != nil}
  /// Clears the value of `votingPeriod`. Subsequent reads from it will return its default value.
  mutating func clearVotingPeriod() {self._votingPeriod = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _unbondingThreasholdTime: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _unbondingCompletionTime: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _resourceNodeMinDeposit: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _votingPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

struct Stratos_Register_V1_ResourceNode {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var networkAddress: String = String()

  var pubkey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _pubkey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_pubkey = newValue}
  }
  /// Returns true if `pubkey` has been explicitly set.
  var hasPubkey: Bool {return self._pubkey != nil}
  /// Clears the value of `pubkey`. Subsequent reads from it will return its default value.
  mutating func clearPubkey() {self._pubkey = nil}

  var suspend: Bool = false

  var status: Cosmos_Staking_V1beta1_BondStatus = .unspecified

  var tokens: String = String()

  var ownerAddress: String = String()

  var description_p: Stratos_Register_V1_Description {
    get {return _description_p ?? Stratos_Register_V1_Description()}
    set {_description_p = newValue}
  }
  /// Returns true if `description_p` has been explicitly set.
  var hasDescription_p: Bool {return self._description_p != nil}
  /// Clears the value of `description_p`. Subsequent reads from it will return its default value.
  mutating func clearDescription_p() {self._description_p = nil}

  var creationTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _creationTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_creationTime = newValue}
  }
  /// Returns true if `creationTime` has been explicitly set.
  var hasCreationTime: Bool {return self._creationTime != nil}
  /// Clears the value of `creationTime`. Subsequent reads from it will return its default value.
  mutating func clearCreationTime() {self._creationTime = nil}

  var nodeType: UInt32 = 0

  var effectiveTokens: String = String()

  var beneficiaryAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pubkey: SwiftProtobuf.Google_Protobuf_Any? = nil
  fileprivate var _description_p: Stratos_Register_V1_Description? = nil
  fileprivate var _creationTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Stratos_Register_V1_MetaNode {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var networkAddress: String = String()

  var pubkey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _pubkey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_pubkey = newValue}
  }
  /// Returns true if `pubkey` has been explicitly set.
  var hasPubkey: Bool {return self._pubkey != nil}
  /// Clears the value of `pubkey`. Subsequent reads from it will return its default value.
  mutating func clearPubkey() {self._pubkey = nil}

  var suspend: Bool = false

  var status: Cosmos_Staking_V1beta1_BondStatus = .unspecified

  var tokens: String = String()

  var ownerAddress: String = String()

  var description_p: Stratos_Register_V1_Description {
    get {return _description_p ?? Stratos_Register_V1_Description()}
    set {_description_p = newValue}
  }
  /// Returns true if `description_p` has been explicitly set.
  var hasDescription_p: Bool {return self._description_p != nil}
  /// Clears the value of `description_p`. Subsequent reads from it will return its default value.
  mutating func clearDescription_p() {self._description_p = nil}

  var creationTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _creationTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_creationTime = newValue}
  }
  /// Returns true if `creationTime` has been explicitly set.
  var hasCreationTime: Bool {return self._creationTime != nil}
  /// Clears the value of `creationTime`. Subsequent reads from it will return its default value.
  mutating func clearCreationTime() {self._creationTime = nil}

  var beneficiaryAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pubkey: SwiftProtobuf.Google_Protobuf_Any? = nil
  fileprivate var _description_p: Stratos_Register_V1_Description? = nil
  fileprivate var _creationTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Stratos_Register_V1_MetaNodeRegistrationVotePool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var networkAddress: String = String()

  var approveList: [String] = []

  var rejectList: [String] = []

  var expireTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _expireTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_expireTime = newValue}
  }
  /// Returns true if `expireTime` has been explicitly set.
  var hasExpireTime: Bool {return self._expireTime != nil}
  /// Clears the value of `expireTime`. Subsequent reads from it will return its default value.
  mutating func clearExpireTime() {self._expireTime = nil}

  var isVotePassed: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _expireTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Stratos_Register_V1_KickMetaNodeVotePool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var targetNetworkAddress: String = String()

  var approveList: [String] = []

  var rejectList: [String] = []

  var expireTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _expireTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_expireTime = newValue}
  }
  /// Returns true if `expireTime` has been explicitly set.
  var hasExpireTime: Bool {return self._expireTime != nil}
  /// Clears the value of `expireTime`. Subsequent reads from it will return its default value.
  mutating func clearExpireTime() {self._expireTime = nil}

  var isVotePassed: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _expireTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Stratos_Register_V1_Description {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var moniker: String = String()

  var identity: String = String()

  var website: String = String()

  var securityContact: String = String()

  var details: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// UnbondingNode stores all of a single delegator's unbonding bonds
/// for a single unbonding node in a time-ordered list
struct Stratos_Register_V1_UnbondingNode {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var networkAddr: String = String()

  var isMetaNode: Bool = false

  var entries: [Stratos_Register_V1_UnbondingNodeEntry] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stratos_Register_V1_UnbondingNodeEntry {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creationHeight: Int64 = 0

  var completionTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _completionTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_completionTime = newValue}
  }
  /// Returns true if `completionTime` has been explicitly set.
  var hasCompletionTime: Bool {return self._completionTime != nil}
  /// Clears the value of `completionTime`. Subsequent reads from it will return its default value.
  mutating func clearCompletionTime() {self._completionTime = nil}

  var initialBalance: String = String()

  var balance: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _completionTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stratos_Register_V1_Params: @unchecked Sendable {}
extension Stratos_Register_V1_ResourceNode: @unchecked Sendable {}
extension Stratos_Register_V1_MetaNode: @unchecked Sendable {}
extension Stratos_Register_V1_MetaNodeRegistrationVotePool: @unchecked Sendable {}
extension Stratos_Register_V1_KickMetaNodeVotePool: @unchecked Sendable {}
extension Stratos_Register_V1_Description: @unchecked Sendable {}
extension Stratos_Register_V1_UnbondingNode: @unchecked Sendable {}
extension Stratos_Register_V1_UnbondingNodeEntry: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stratos.register.v1"

extension Stratos_Register_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "bond_denom"),
    2: .standard(proto: "unbonding_threashold_time"),
    3: .standard(proto: "unbonding_completion_time"),
    4: .standard(proto: "max_entries"),
    5: .standard(proto: "resource_node_reg_enabled"),
    6: .standard(proto: "resource_node_min_deposit"),
    7: .standard(proto: "voting_period"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.bondDenom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._unbondingThreasholdTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._unbondingCompletionTime) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.maxEntries) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.resourceNodeRegEnabled) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._resourceNodeMinDeposit) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._votingPeriod) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.bondDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.bondDenom, fieldNumber: 1)
    }
    try { if let v = self._unbondingThreasholdTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._unbondingCompletionTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.maxEntries != 0 {
      try visitor.visitSingularUInt32Field(value: self.maxEntries, fieldNumber: 4)
    }
    if self.resourceNodeRegEnabled != false {
      try visitor.visitSingularBoolField(value: self.resourceNodeRegEnabled, fieldNumber: 5)
    }
    try { if let v = self._resourceNodeMinDeposit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try { if let v = self._votingPeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_Params, rhs: Stratos_Register_V1_Params) -> Bool {
    if lhs.bondDenom != rhs.bondDenom {return false}
    if lhs._unbondingThreasholdTime != rhs._unbondingThreasholdTime {return false}
    if lhs._unbondingCompletionTime != rhs._unbondingCompletionTime {return false}
    if lhs.maxEntries != rhs.maxEntries {return false}
    if lhs.resourceNodeRegEnabled != rhs.resourceNodeRegEnabled {return false}
    if lhs._resourceNodeMinDeposit != rhs._resourceNodeMinDeposit {return false}
    if lhs._votingPeriod != rhs._votingPeriod {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_ResourceNode: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ResourceNode"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "network_address"),
    2: .same(proto: "pubkey"),
    3: .same(proto: "suspend"),
    4: .same(proto: "status"),
    5: .same(proto: "tokens"),
    6: .standard(proto: "owner_address"),
    7: .same(proto: "description"),
    8: .standard(proto: "creation_time"),
    9: .standard(proto: "node_type"),
    10: .standard(proto: "effective_tokens"),
    11: .standard(proto: "beneficiary_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.networkAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pubkey) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.suspend) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.tokens) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._description_p) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._creationTime) }()
      case 9: try { try decoder.decodeSingularUInt32Field(value: &self.nodeType) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.effectiveTokens) }()
      case 11: try { try decoder.decodeSingularStringField(value: &self.beneficiaryAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.networkAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.networkAddress, fieldNumber: 1)
    }
    try { if let v = self._pubkey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.suspend != false {
      try visitor.visitSingularBoolField(value: self.suspend, fieldNumber: 3)
    }
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 4)
    }
    if !self.tokens.isEmpty {
      try visitor.visitSingularStringField(value: self.tokens, fieldNumber: 5)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 6)
    }
    try { if let v = self._description_p {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try { if let v = self._creationTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    if self.nodeType != 0 {
      try visitor.visitSingularUInt32Field(value: self.nodeType, fieldNumber: 9)
    }
    if !self.effectiveTokens.isEmpty {
      try visitor.visitSingularStringField(value: self.effectiveTokens, fieldNumber: 10)
    }
    if !self.beneficiaryAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.beneficiaryAddress, fieldNumber: 11)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_ResourceNode, rhs: Stratos_Register_V1_ResourceNode) -> Bool {
    if lhs.networkAddress != rhs.networkAddress {return false}
    if lhs._pubkey != rhs._pubkey {return false}
    if lhs.suspend != rhs.suspend {return false}
    if lhs.status != rhs.status {return false}
    if lhs.tokens != rhs.tokens {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs._description_p != rhs._description_p {return false}
    if lhs._creationTime != rhs._creationTime {return false}
    if lhs.nodeType != rhs.nodeType {return false}
    if lhs.effectiveTokens != rhs.effectiveTokens {return false}
    if lhs.beneficiaryAddress != rhs.beneficiaryAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_MetaNode: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MetaNode"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "network_address"),
    2: .same(proto: "pubkey"),
    3: .same(proto: "suspend"),
    4: .same(proto: "status"),
    5: .same(proto: "tokens"),
    6: .standard(proto: "owner_address"),
    7: .same(proto: "description"),
    8: .standard(proto: "creation_time"),
    9: .standard(proto: "beneficiary_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.networkAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pubkey) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.suspend) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.tokens) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._description_p) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._creationTime) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.beneficiaryAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.networkAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.networkAddress, fieldNumber: 1)
    }
    try { if let v = self._pubkey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.suspend != false {
      try visitor.visitSingularBoolField(value: self.suspend, fieldNumber: 3)
    }
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 4)
    }
    if !self.tokens.isEmpty {
      try visitor.visitSingularStringField(value: self.tokens, fieldNumber: 5)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 6)
    }
    try { if let v = self._description_p {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try { if let v = self._creationTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    if !self.beneficiaryAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.beneficiaryAddress, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_MetaNode, rhs: Stratos_Register_V1_MetaNode) -> Bool {
    if lhs.networkAddress != rhs.networkAddress {return false}
    if lhs._pubkey != rhs._pubkey {return false}
    if lhs.suspend != rhs.suspend {return false}
    if lhs.status != rhs.status {return false}
    if lhs.tokens != rhs.tokens {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs._description_p != rhs._description_p {return false}
    if lhs._creationTime != rhs._creationTime {return false}
    if lhs.beneficiaryAddress != rhs.beneficiaryAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_MetaNodeRegistrationVotePool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MetaNodeRegistrationVotePool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "network_address"),
    2: .standard(proto: "approve_list"),
    3: .standard(proto: "reject_list"),
    4: .standard(proto: "expire_time"),
    5: .standard(proto: "is_vote_passed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.networkAddress) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.approveList) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.rejectList) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._expireTime) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.isVotePassed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.networkAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.networkAddress, fieldNumber: 1)
    }
    if !self.approveList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.approveList, fieldNumber: 2)
    }
    if !self.rejectList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.rejectList, fieldNumber: 3)
    }
    try { if let v = self._expireTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if self.isVotePassed != false {
      try visitor.visitSingularBoolField(value: self.isVotePassed, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_MetaNodeRegistrationVotePool, rhs: Stratos_Register_V1_MetaNodeRegistrationVotePool) -> Bool {
    if lhs.networkAddress != rhs.networkAddress {return false}
    if lhs.approveList != rhs.approveList {return false}
    if lhs.rejectList != rhs.rejectList {return false}
    if lhs._expireTime != rhs._expireTime {return false}
    if lhs.isVotePassed != rhs.isVotePassed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_KickMetaNodeVotePool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".KickMetaNodeVotePool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "target_network_address"),
    2: .standard(proto: "approve_list"),
    3: .standard(proto: "reject_list"),
    4: .standard(proto: "expire_time"),
    5: .standard(proto: "is_vote_passed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.targetNetworkAddress) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.approveList) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.rejectList) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._expireTime) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.isVotePassed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.targetNetworkAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.targetNetworkAddress, fieldNumber: 1)
    }
    if !self.approveList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.approveList, fieldNumber: 2)
    }
    if !self.rejectList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.rejectList, fieldNumber: 3)
    }
    try { if let v = self._expireTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if self.isVotePassed != false {
      try visitor.visitSingularBoolField(value: self.isVotePassed, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_KickMetaNodeVotePool, rhs: Stratos_Register_V1_KickMetaNodeVotePool) -> Bool {
    if lhs.targetNetworkAddress != rhs.targetNetworkAddress {return false}
    if lhs.approveList != rhs.approveList {return false}
    if lhs.rejectList != rhs.rejectList {return false}
    if lhs._expireTime != rhs._expireTime {return false}
    if lhs.isVotePassed != rhs.isVotePassed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_Description: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Description"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "moniker"),
    2: .same(proto: "identity"),
    3: .same(proto: "website"),
    4: .standard(proto: "security_contact"),
    5: .same(proto: "details"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.moniker) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.identity) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.website) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.securityContact) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.details) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.moniker.isEmpty {
      try visitor.visitSingularStringField(value: self.moniker, fieldNumber: 1)
    }
    if !self.identity.isEmpty {
      try visitor.visitSingularStringField(value: self.identity, fieldNumber: 2)
    }
    if !self.website.isEmpty {
      try visitor.visitSingularStringField(value: self.website, fieldNumber: 3)
    }
    if !self.securityContact.isEmpty {
      try visitor.visitSingularStringField(value: self.securityContact, fieldNumber: 4)
    }
    if !self.details.isEmpty {
      try visitor.visitSingularStringField(value: self.details, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_Description, rhs: Stratos_Register_V1_Description) -> Bool {
    if lhs.moniker != rhs.moniker {return false}
    if lhs.identity != rhs.identity {return false}
    if lhs.website != rhs.website {return false}
    if lhs.securityContact != rhs.securityContact {return false}
    if lhs.details != rhs.details {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_UnbondingNode: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UnbondingNode"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "network_addr"),
    2: .standard(proto: "is_meta_node"),
    3: .same(proto: "entries"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.networkAddr) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.isMetaNode) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.entries) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.networkAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.networkAddr, fieldNumber: 1)
    }
    if self.isMetaNode != false {
      try visitor.visitSingularBoolField(value: self.isMetaNode, fieldNumber: 2)
    }
    if !self.entries.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.entries, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_UnbondingNode, rhs: Stratos_Register_V1_UnbondingNode) -> Bool {
    if lhs.networkAddr != rhs.networkAddr {return false}
    if lhs.isMetaNode != rhs.isMetaNode {return false}
    if lhs.entries != rhs.entries {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Register_V1_UnbondingNodeEntry: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UnbondingNodeEntry"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "creation_height"),
    2: .standard(proto: "completion_time"),
    3: .standard(proto: "initial_balance"),
    4: .same(proto: "balance"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.creationHeight) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._completionTime) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.initialBalance) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.balance) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.creationHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.creationHeight, fieldNumber: 1)
    }
    try { if let v = self._completionTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.initialBalance.isEmpty {
      try visitor.visitSingularStringField(value: self.initialBalance, fieldNumber: 3)
    }
    if !self.balance.isEmpty {
      try visitor.visitSingularStringField(value: self.balance, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Register_V1_UnbondingNodeEntry, rhs: Stratos_Register_V1_UnbondingNodeEntry) -> Bool {
    if lhs.creationHeight != rhs.creationHeight {return false}
    if lhs._completionTime != rhs._completionTime {return false}
    if lhs.initialBalance != rhs.initialBalance {return false}
    if lhs.balance != rhs.balance {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
