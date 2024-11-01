// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/finality/v1/genesis.proto
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

/// GenesisState defines the finality module's genesis state.
struct Babylon_Finality_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params the current params of the state.
  var params: Babylon_Finality_V1_Params {
    get {return _storage._params ?? Babylon_Finality_V1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  /// indexed_blocks all the btc blocks and if their status are finalized.
  var indexedBlocks: [Babylon_Finality_V1_IndexedBlock] {
    get {return _storage._indexedBlocks}
    set {_uniqueStorage()._indexedBlocks = newValue}
  }

  /// evidences all the evidences ever registered.
  var evidences: [Babylon_Finality_V1_Evidence] {
    get {return _storage._evidences}
    set {_uniqueStorage()._evidences = newValue}
  }

  /// votes_sigs contains all the votes of finality providers ever registered.
  var voteSigs: [Babylon_Finality_V1_VoteSig] {
    get {return _storage._voteSigs}
    set {_uniqueStorage()._voteSigs = newValue}
  }

  /// public_randomness contains all the public randomness ever committed from the finality providers.
  var publicRandomness: [Babylon_Finality_V1_PublicRandomness] {
    get {return _storage._publicRandomness}
    set {_uniqueStorage()._publicRandomness = newValue}
  }

  /// pub_rand_commit contains all the public randomness commitment ever committed from the finality providers.
  var pubRandCommit: [Babylon_Finality_V1_PubRandCommitWithPK] {
    get {return _storage._pubRandCommit}
    set {_uniqueStorage()._pubRandCommit = newValue}
  }

  /// signing_infos represents a map between finality provider public key and their
  /// signing infos.
  var signingInfos: [Babylon_Finality_V1_SigningInfo] {
    get {return _storage._signingInfos}
    set {_uniqueStorage()._signingInfos = newValue}
  }

  /// missed_blocks represents a map between finality provider public key and their
  /// missed blocks.
  var missedBlocks: [Babylon_Finality_V1_FinalityProviderMissedBlocks] {
    get {return _storage._missedBlocks}
    set {_uniqueStorage()._missedBlocks = newValue}
  }

  /// voting_powers the voting power of every finality provider at every block height.
  var votingPowers: [Babylon_Finality_V1_VotingPowerFP] {
    get {return _storage._votingPowers}
    set {_uniqueStorage()._votingPowers = newValue}
  }

  /// vp_dst_cache is the table of all providers voting power with the total at one specific block.
  var vpDstCache: [Babylon_Finality_V1_VotingPowerDistCacheBlkHeight] {
    get {return _storage._vpDstCache}
    set {_uniqueStorage()._vpDstCache = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// VoteSig the vote of an finality provider
/// with the block of the vote, the finality provider btc public key and the vote signature.
struct Babylon_Finality_V1_VoteSig {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// block_height is the height of the voted block.
  var blockHeight: UInt64 = 0

  /// fp_btc_pk is the BTC PK of the finality provider that casts this vote
  var fpBtcPk: Data = Data()

  /// finality_sig is the finality signature to this block
  /// where finality signature is an EOTS signature, i.e.
  var finalitySig: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// PublicRandomness the block height and public randomness that the finality provider has submitted.
struct Babylon_Finality_V1_PublicRandomness {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// block_height is the height of block which the finality provider submitted public randomness.
  var blockHeight: UInt64 = 0

  /// fp_btc_pk is the BTC PK of the finality provider that casts this vote.
  var fpBtcPk: Data = Data()

  /// pub_rand is the public randomness the finality provider has committed to.
  var pubRand: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// PubRandCommitWithPK is the public randomness commitment with the finality provider's BTC public key
struct Babylon_Finality_V1_PubRandCommitWithPK {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// fp_btc_pk is the BTC PK of the finality provider that commits the public randomness
  var fpBtcPk: Data = Data()

  /// pub_rand_commit is the public randomness commitment
  var pubRandCommit: Babylon_Finality_V1_PubRandCommit {
    get {return _pubRandCommit ?? Babylon_Finality_V1_PubRandCommit()}
    set {_pubRandCommit = newValue}
  }
  /// Returns true if `pubRandCommit` has been explicitly set.
  var hasPubRandCommit: Bool {return self._pubRandCommit != nil}
  /// Clears the value of `pubRandCommit`. Subsequent reads from it will return its default value.
  mutating func clearPubRandCommit() {self._pubRandCommit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pubRandCommit: Babylon_Finality_V1_PubRandCommit? = nil
}

/// SigningInfo stores finality provider signing info of corresponding BTC public key.
struct Babylon_Finality_V1_SigningInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// fp_btc_pk is the BTC PK of the finality provider
  var fpBtcPk: Data = Data()

  /// fp_signing_info represents the signing info of this finality provider.
  var fpSigningInfo: Babylon_Finality_V1_FinalityProviderSigningInfo {
    get {return _fpSigningInfo ?? Babylon_Finality_V1_FinalityProviderSigningInfo()}
    set {_fpSigningInfo = newValue}
  }
  /// Returns true if `fpSigningInfo` has been explicitly set.
  var hasFpSigningInfo: Bool {return self._fpSigningInfo != nil}
  /// Clears the value of `fpSigningInfo`. Subsequent reads from it will return its default value.
  mutating func clearFpSigningInfo() {self._fpSigningInfo = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fpSigningInfo: Babylon_Finality_V1_FinalityProviderSigningInfo? = nil
}

/// FinalityProviderMissedBlocks contains array of missed blocks of corresponding
/// BTC public key.
struct Babylon_Finality_V1_FinalityProviderMissedBlocks {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// fp_btc_pk is the BTC PK of the finality provider
  var fpBtcPk: Data = Data()

  /// missed_blocks is an array of missed blocks by the finality provider.
  var missedBlocks: [Babylon_Finality_V1_MissedBlock] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MissedBlock contains height and missed status as boolean.
struct Babylon_Finality_V1_MissedBlock {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// index is the height at which the block was missed.
  var index: Int64 = 0

  /// missed is the missed status.
  var missed: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// VotingPowerFP contains the information about the voting power
/// of an finality provider in a specific block height.
struct Babylon_Finality_V1_VotingPowerFP {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// block_height is the height of the block the voting power was stored.
  var blockHeight: UInt64 = 0

  /// fp_btc_pk the finality provider btc public key.
  var fpBtcPk: Data = Data()

  /// voting_power is the power of the finality provider at this specific block height.
  var votingPower: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// VotingPowerDistCacheBlkHeight the total voting power of the finality providers at one specific block height
struct Babylon_Finality_V1_VotingPowerDistCacheBlkHeight {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// block_height is the height of the block the voting power distribution cached was stored.
  var blockHeight: UInt64 = 0

  /// vp_distribution the finality providers distribution cache at that height.
  var vpDistribution: Babylon_Finality_V1_VotingPowerDistCache {
    get {return _vpDistribution ?? Babylon_Finality_V1_VotingPowerDistCache()}
    set {_vpDistribution = newValue}
  }
  /// Returns true if `vpDistribution` has been explicitly set.
  var hasVpDistribution: Bool {return self._vpDistribution != nil}
  /// Clears the value of `vpDistribution`. Subsequent reads from it will return its default value.
  mutating func clearVpDistribution() {self._vpDistribution = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _vpDistribution: Babylon_Finality_V1_VotingPowerDistCache? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Finality_V1_GenesisState: @unchecked Sendable {}
extension Babylon_Finality_V1_VoteSig: @unchecked Sendable {}
extension Babylon_Finality_V1_PublicRandomness: @unchecked Sendable {}
extension Babylon_Finality_V1_PubRandCommitWithPK: @unchecked Sendable {}
extension Babylon_Finality_V1_SigningInfo: @unchecked Sendable {}
extension Babylon_Finality_V1_FinalityProviderMissedBlocks: @unchecked Sendable {}
extension Babylon_Finality_V1_MissedBlock: @unchecked Sendable {}
extension Babylon_Finality_V1_VotingPowerFP: @unchecked Sendable {}
extension Babylon_Finality_V1_VotingPowerDistCacheBlkHeight: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.finality.v1"

extension Babylon_Finality_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "indexed_blocks"),
    3: .same(proto: "evidences"),
    4: .standard(proto: "vote_sigs"),
    5: .standard(proto: "public_randomness"),
    6: .standard(proto: "pub_rand_commit"),
    7: .standard(proto: "signing_infos"),
    8: .standard(proto: "missed_blocks"),
    9: .standard(proto: "voting_powers"),
    10: .standard(proto: "vp_dst_cache"),
  ]

  fileprivate class _StorageClass {
    var _params: Babylon_Finality_V1_Params? = nil
    var _indexedBlocks: [Babylon_Finality_V1_IndexedBlock] = []
    var _evidences: [Babylon_Finality_V1_Evidence] = []
    var _voteSigs: [Babylon_Finality_V1_VoteSig] = []
    var _publicRandomness: [Babylon_Finality_V1_PublicRandomness] = []
    var _pubRandCommit: [Babylon_Finality_V1_PubRandCommitWithPK] = []
    var _signingInfos: [Babylon_Finality_V1_SigningInfo] = []
    var _missedBlocks: [Babylon_Finality_V1_FinalityProviderMissedBlocks] = []
    var _votingPowers: [Babylon_Finality_V1_VotingPowerFP] = []
    var _vpDstCache: [Babylon_Finality_V1_VotingPowerDistCacheBlkHeight] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _indexedBlocks = source._indexedBlocks
      _evidences = source._evidences
      _voteSigs = source._voteSigs
      _publicRandomness = source._publicRandomness
      _pubRandCommit = source._pubRandCommit
      _signingInfos = source._signingInfos
      _missedBlocks = source._missedBlocks
      _votingPowers = source._votingPowers
      _vpDstCache = source._vpDstCache
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 2: try { try decoder.decodeRepeatedMessageField(value: &_storage._indexedBlocks) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._evidences) }()
        case 4: try { try decoder.decodeRepeatedMessageField(value: &_storage._voteSigs) }()
        case 5: try { try decoder.decodeRepeatedMessageField(value: &_storage._publicRandomness) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._pubRandCommit) }()
        case 7: try { try decoder.decodeRepeatedMessageField(value: &_storage._signingInfos) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._missedBlocks) }()
        case 9: try { try decoder.decodeRepeatedMessageField(value: &_storage._votingPowers) }()
        case 10: try { try decoder.decodeRepeatedMessageField(value: &_storage._vpDstCache) }()
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
      try { if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      if !_storage._indexedBlocks.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._indexedBlocks, fieldNumber: 2)
      }
      if !_storage._evidences.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._evidences, fieldNumber: 3)
      }
      if !_storage._voteSigs.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._voteSigs, fieldNumber: 4)
      }
      if !_storage._publicRandomness.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._publicRandomness, fieldNumber: 5)
      }
      if !_storage._pubRandCommit.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._pubRandCommit, fieldNumber: 6)
      }
      if !_storage._signingInfos.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._signingInfos, fieldNumber: 7)
      }
      if !_storage._missedBlocks.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._missedBlocks, fieldNumber: 8)
      }
      if !_storage._votingPowers.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._votingPowers, fieldNumber: 9)
      }
      if !_storage._vpDstCache.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._vpDstCache, fieldNumber: 10)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_GenesisState, rhs: Babylon_Finality_V1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._indexedBlocks != rhs_storage._indexedBlocks {return false}
        if _storage._evidences != rhs_storage._evidences {return false}
        if _storage._voteSigs != rhs_storage._voteSigs {return false}
        if _storage._publicRandomness != rhs_storage._publicRandomness {return false}
        if _storage._pubRandCommit != rhs_storage._pubRandCommit {return false}
        if _storage._signingInfos != rhs_storage._signingInfos {return false}
        if _storage._missedBlocks != rhs_storage._missedBlocks {return false}
        if _storage._votingPowers != rhs_storage._votingPowers {return false}
        if _storage._vpDstCache != rhs_storage._vpDstCache {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_VoteSig: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VoteSig"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "finality_sig"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.finalitySig) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if !self.finalitySig.isEmpty {
      try visitor.visitSingularBytesField(value: self.finalitySig, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_VoteSig, rhs: Babylon_Finality_V1_VoteSig) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.finalitySig != rhs.finalitySig {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_PublicRandomness: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PublicRandomness"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "pub_rand"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.pubRand) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if !self.pubRand.isEmpty {
      try visitor.visitSingularBytesField(value: self.pubRand, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_PublicRandomness, rhs: Babylon_Finality_V1_PublicRandomness) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.pubRand != rhs.pubRand {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_PubRandCommitWithPK: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PubRandCommitWithPK"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "fp_btc_pk"),
    2: .standard(proto: "pub_rand_commit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pubRandCommit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 1)
    }
    try { if let v = self._pubRandCommit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_PubRandCommitWithPK, rhs: Babylon_Finality_V1_PubRandCommitWithPK) -> Bool {
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs._pubRandCommit != rhs._pubRandCommit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_SigningInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SigningInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "fp_btc_pk"),
    2: .standard(proto: "fp_signing_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._fpSigningInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 1)
    }
    try { if let v = self._fpSigningInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_SigningInfo, rhs: Babylon_Finality_V1_SigningInfo) -> Bool {
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs._fpSigningInfo != rhs._fpSigningInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_FinalityProviderMissedBlocks: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FinalityProviderMissedBlocks"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "fp_btc_pk"),
    2: .standard(proto: "missed_blocks"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.missedBlocks) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 1)
    }
    if !self.missedBlocks.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.missedBlocks, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_FinalityProviderMissedBlocks, rhs: Babylon_Finality_V1_FinalityProviderMissedBlocks) -> Bool {
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.missedBlocks != rhs.missedBlocks {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MissedBlock: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MissedBlock"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "missed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.missed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularInt64Field(value: self.index, fieldNumber: 1)
    }
    if self.missed != false {
      try visitor.visitSingularBoolField(value: self.missed, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MissedBlock, rhs: Babylon_Finality_V1_MissedBlock) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.missed != rhs.missed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_VotingPowerFP: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VotingPowerFP"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "voting_power"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.votingPower) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if self.votingPower != 0 {
      try visitor.visitSingularUInt64Field(value: self.votingPower, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_VotingPowerFP, rhs: Babylon_Finality_V1_VotingPowerFP) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.votingPower != rhs.votingPower {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_VotingPowerDistCacheBlkHeight: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VotingPowerDistCacheBlkHeight"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .standard(proto: "vp_distribution"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._vpDistribution) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    try { if let v = self._vpDistribution {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_VotingPowerDistCacheBlkHeight, rhs: Babylon_Finality_V1_VotingPowerDistCacheBlkHeight) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs._vpDistribution != rhs._vpDistribution {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
