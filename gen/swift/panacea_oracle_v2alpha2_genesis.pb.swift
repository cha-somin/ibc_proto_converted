// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/oracle/v2alpha2/genesis.proto
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

/// GenesisState defines the oracle module's genesis state.
struct Panacea_Oracle_V2alpha2_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var oracles: [Panacea_Oracle_V2alpha2_Oracle] {
    get {return _storage._oracles}
    set {_uniqueStorage()._oracles = newValue}
  }

  var oracleRegistrations: [Panacea_Oracle_V2alpha2_OracleRegistration] {
    get {return _storage._oracleRegistrations}
    set {_uniqueStorage()._oracleRegistrations = newValue}
  }

  var oracleRegistrationVotes: [Panacea_Oracle_V2alpha2_OracleRegistrationVote] {
    get {return _storage._oracleRegistrationVotes}
    set {_uniqueStorage()._oracleRegistrationVotes = newValue}
  }

  var params: Panacea_Oracle_V2alpha2_Params {
    get {return _storage._params ?? Panacea_Oracle_V2alpha2_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var oracleUpgradeInfo: Panacea_Oracle_V2alpha2_OracleUpgradeInfo {
    get {return _storage._oracleUpgradeInfo ?? Panacea_Oracle_V2alpha2_OracleUpgradeInfo()}
    set {_uniqueStorage()._oracleUpgradeInfo = newValue}
  }
  /// Returns true if `oracleUpgradeInfo` has been explicitly set.
  var hasOracleUpgradeInfo: Bool {return _storage._oracleUpgradeInfo != nil}
  /// Clears the value of `oracleUpgradeInfo`. Subsequent reads from it will return its default value.
  mutating func clearOracleUpgradeInfo() {_uniqueStorage()._oracleUpgradeInfo = nil}

  var oracleRegistrationVoteQueueElements: [Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement] {
    get {return _storage._oracleRegistrationVoteQueueElements}
    set {_uniqueStorage()._oracleRegistrationVoteQueueElements = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// Params defines the oracle module's params.
struct Panacea_Oracle_V2alpha2_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// A base64-encoded oracle public key which is paired with an oracle private key generated in SGX by the first oracle.
  /// This key is used to encrypt data, so that the data can be decrypted and verified securely only in SGX
  var oraclePublicKey: String = String()

  /// A base64-encoded SGX remote report which contains an oracle public key.
  /// Using this report, anyone can validate that the oracle key pair was generated in SGX.
  var oraclePubKeyRemoteReport: String = String()

  /// The unique ID of current version of oracle.
  var uniqueID: String = String()

  /// Oracle commission rate on validating and delivering data
  var oracleCommissionRate: String = String()

  var voteParams: Panacea_Oracle_V2alpha2_VoteParams {
    get {return _voteParams ?? Panacea_Oracle_V2alpha2_VoteParams()}
    set {_voteParams = newValue}
  }
  /// Returns true if `voteParams` has been explicitly set.
  var hasVoteParams: Bool {return self._voteParams != nil}
  /// Clears the value of `voteParams`. Subsequent reads from it will return its default value.
  mutating func clearVoteParams() {self._voteParams = nil}

  var slashParams: Panacea_Oracle_V2alpha2_SlashParams {
    get {return _slashParams ?? Panacea_Oracle_V2alpha2_SlashParams()}
    set {_slashParams = newValue}
  }
  /// Returns true if `slashParams` has been explicitly set.
  var hasSlashParams: Bool {return self._slashParams != nil}
  /// Clears the value of `slashParams`. Subsequent reads from it will return its default value.
  mutating func clearSlashParams() {self._slashParams = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _voteParams: Panacea_Oracle_V2alpha2_VoteParams? = nil
  fileprivate var _slashParams: Panacea_Oracle_V2alpha2_SlashParams? = nil
}

/// Vote Params defines the params related to voting.
struct Panacea_Oracle_V2alpha2_VoteParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var votingPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _votingPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_votingPeriod = newValue}
  }
  /// Returns true if `votingPeriod` has been explicitly set.
  var hasVotingPeriod: Bool {return self._votingPeriod != nil}
  /// Clears the value of `votingPeriod`. Subsequent reads from it will return its default value.
  mutating func clearVotingPeriod() {self._votingPeriod = nil}

  var jailPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _jailPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_jailPeriod = newValue}
  }
  /// Returns true if `jailPeriod` has been explicitly set.
  var hasJailPeriod: Bool {return self._jailPeriod != nil}
  /// Clears the value of `jailPeriod`. Subsequent reads from it will return its default value.
  mutating func clearJailPeriod() {self._jailPeriod = nil}

  var threshold: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _jailPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// SlashParams defines the params related to slashing of oracle.
struct Panacea_Oracle_V2alpha2_SlashParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var slashFractionDowntime: String = String()

  var slashFractionForgery: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// OracleRegistrationVoteQueueElement defines a oracle registration vote queue.
struct Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var uniqueID: String = String()

  var address: Data = Data()

  var votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _votingEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_votingEndTime = newValue}
  }
  /// Returns true if `votingEndTime` has been explicitly set.
  var hasVotingEndTime: Bool {return self._votingEndTime != nil}
  /// Clears the value of `votingEndTime`. Subsequent reads from it will return its default value.
  mutating func clearVotingEndTime() {self._votingEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Oracle_V2alpha2_GenesisState: @unchecked Sendable {}
extension Panacea_Oracle_V2alpha2_Params: @unchecked Sendable {}
extension Panacea_Oracle_V2alpha2_VoteParams: @unchecked Sendable {}
extension Panacea_Oracle_V2alpha2_SlashParams: @unchecked Sendable {}
extension Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.oracle.v2alpha2"

extension Panacea_Oracle_V2alpha2_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "oracles"),
    2: .standard(proto: "oracle_registrations"),
    3: .standard(proto: "oracle_registration_votes"),
    4: .same(proto: "params"),
    5: .standard(proto: "oracle_upgrade_info"),
    6: .standard(proto: "oracle_registration_vote_queue_elements"),
  ]

  fileprivate class _StorageClass {
    var _oracles: [Panacea_Oracle_V2alpha2_Oracle] = []
    var _oracleRegistrations: [Panacea_Oracle_V2alpha2_OracleRegistration] = []
    var _oracleRegistrationVotes: [Panacea_Oracle_V2alpha2_OracleRegistrationVote] = []
    var _params: Panacea_Oracle_V2alpha2_Params? = nil
    var _oracleUpgradeInfo: Panacea_Oracle_V2alpha2_OracleUpgradeInfo? = nil
    var _oracleRegistrationVoteQueueElements: [Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _oracles = source._oracles
      _oracleRegistrations = source._oracleRegistrations
      _oracleRegistrationVotes = source._oracleRegistrationVotes
      _params = source._params
      _oracleUpgradeInfo = source._oracleUpgradeInfo
      _oracleRegistrationVoteQueueElements = source._oracleRegistrationVoteQueueElements
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeRepeatedMessageField(value: &_storage._oracles) }()
        case 2: try { try decoder.decodeRepeatedMessageField(value: &_storage._oracleRegistrations) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._oracleRegistrationVotes) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._oracleUpgradeInfo) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._oracleRegistrationVoteQueueElements) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      if !_storage._oracles.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._oracles, fieldNumber: 1)
      }
      if !_storage._oracleRegistrations.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._oracleRegistrations, fieldNumber: 2)
      }
      if !_storage._oracleRegistrationVotes.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._oracleRegistrationVotes, fieldNumber: 3)
      }
      try { if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._oracleUpgradeInfo {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      if !_storage._oracleRegistrationVoteQueueElements.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._oracleRegistrationVoteQueueElements, fieldNumber: 6)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Oracle_V2alpha2_GenesisState, rhs: Panacea_Oracle_V2alpha2_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._oracles != rhs_storage._oracles {return false}
        if _storage._oracleRegistrations != rhs_storage._oracleRegistrations {return false}
        if _storage._oracleRegistrationVotes != rhs_storage._oracleRegistrationVotes {return false}
        if _storage._params != rhs_storage._params {return false}
        if _storage._oracleUpgradeInfo != rhs_storage._oracleUpgradeInfo {return false}
        if _storage._oracleRegistrationVoteQueueElements != rhs_storage._oracleRegistrationVoteQueueElements {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Oracle_V2alpha2_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "oracle_public_key"),
    2: .standard(proto: "oracle_pub_key_remote_report"),
    3: .standard(proto: "unique_id"),
    4: .standard(proto: "oracle_commission_rate"),
    5: .standard(proto: "vote_params"),
    6: .standard(proto: "slash_params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.oraclePublicKey) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.oraclePubKeyRemoteReport) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.uniqueID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.oracleCommissionRate) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._voteParams) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._slashParams) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.oraclePublicKey.isEmpty {
      try visitor.visitSingularStringField(value: self.oraclePublicKey, fieldNumber: 1)
    }
    if !self.oraclePubKeyRemoteReport.isEmpty {
      try visitor.visitSingularStringField(value: self.oraclePubKeyRemoteReport, fieldNumber: 2)
    }
    if !self.uniqueID.isEmpty {
      try visitor.visitSingularStringField(value: self.uniqueID, fieldNumber: 3)
    }
    if !self.oracleCommissionRate.isEmpty {
      try visitor.visitSingularStringField(value: self.oracleCommissionRate, fieldNumber: 4)
    }
    try { if let v = self._voteParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._slashParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Oracle_V2alpha2_Params, rhs: Panacea_Oracle_V2alpha2_Params) -> Bool {
    if lhs.oraclePublicKey != rhs.oraclePublicKey {return false}
    if lhs.oraclePubKeyRemoteReport != rhs.oraclePubKeyRemoteReport {return false}
    if lhs.uniqueID != rhs.uniqueID {return false}
    if lhs.oracleCommissionRate != rhs.oracleCommissionRate {return false}
    if lhs._voteParams != rhs._voteParams {return false}
    if lhs._slashParams != rhs._slashParams {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Oracle_V2alpha2_VoteParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VoteParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "voting_period"),
    2: .standard(proto: "jail_period"),
    3: .same(proto: "threshold"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._votingPeriod) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._jailPeriod) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.threshold) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._votingPeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._jailPeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.threshold.isEmpty {
      try visitor.visitSingularStringField(value: self.threshold, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Oracle_V2alpha2_VoteParams, rhs: Panacea_Oracle_V2alpha2_VoteParams) -> Bool {
    if lhs._votingPeriod != rhs._votingPeriod {return false}
    if lhs._jailPeriod != rhs._jailPeriod {return false}
    if lhs.threshold != rhs.threshold {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Oracle_V2alpha2_SlashParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SlashParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "slash_fraction_downtime"),
    2: .standard(proto: "slash_fraction_forgery"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.slashFractionDowntime) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.slashFractionForgery) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.slashFractionDowntime.isEmpty {
      try visitor.visitSingularStringField(value: self.slashFractionDowntime, fieldNumber: 1)
    }
    if !self.slashFractionForgery.isEmpty {
      try visitor.visitSingularStringField(value: self.slashFractionForgery, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Oracle_V2alpha2_SlashParams, rhs: Panacea_Oracle_V2alpha2_SlashParams) -> Bool {
    if lhs.slashFractionDowntime != rhs.slashFractionDowntime {return false}
    if lhs.slashFractionForgery != rhs.slashFractionForgery {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OracleRegistrationVoteQueueElement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "unique_id"),
    2: .same(proto: "address"),
    3: .standard(proto: "voting_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.uniqueID) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.address) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._votingEndTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.uniqueID.isEmpty {
      try visitor.visitSingularStringField(value: self.uniqueID, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularBytesField(value: self.address, fieldNumber: 2)
    }
    try { if let v = self._votingEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement, rhs: Panacea_Oracle_V2alpha2_OracleRegistrationVoteQueueElement) -> Bool {
    if lhs.uniqueID != rhs.uniqueID {return false}
    if lhs.address != rhs.address {return false}
    if lhs._votingEndTime != rhs._votingEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
