// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/gov/v1alpha1/genesis.proto
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

/// GenesisState defines the gov module's genesis state.
struct Shentu_Gov_V1alpha1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// starting_proposal_id is the ID of the starting proposal.
  var startingProposalID: UInt64 {
    get {return _storage._startingProposalID}
    set {_uniqueStorage()._startingProposalID = newValue}
  }

  /// deposits defines all the deposits present at genesis.
  var deposits: [Cosmos_Gov_V1beta1_Deposit] {
    get {return _storage._deposits}
    set {_uniqueStorage()._deposits = newValue}
  }

  /// votes defines all the votes present at genesis.
  var votes: [Cosmos_Gov_V1beta1_Vote] {
    get {return _storage._votes}
    set {_uniqueStorage()._votes = newValue}
  }

  /// proposals defines all the proposals present at genesis.
  var proposals: [Cosmos_Gov_V1beta1_Proposal] {
    get {return _storage._proposals}
    set {_uniqueStorage()._proposals = newValue}
  }

  /// params defines all the parameters of related to deposit.
  var depositParams: Cosmos_Gov_V1beta1_DepositParams {
    get {return _storage._depositParams ?? Cosmos_Gov_V1beta1_DepositParams()}
    set {_uniqueStorage()._depositParams = newValue}
  }
  /// Returns true if `depositParams` has been explicitly set.
  var hasDepositParams: Bool {return _storage._depositParams != nil}
  /// Clears the value of `depositParams`. Subsequent reads from it will return its default value.
  mutating func clearDepositParams() {_uniqueStorage()._depositParams = nil}

  /// params defines all the parameters of related to voting.
  var votingParams: Cosmos_Gov_V1beta1_VotingParams {
    get {return _storage._votingParams ?? Cosmos_Gov_V1beta1_VotingParams()}
    set {_uniqueStorage()._votingParams = newValue}
  }
  /// Returns true if `votingParams` has been explicitly set.
  var hasVotingParams: Bool {return _storage._votingParams != nil}
  /// Clears the value of `votingParams`. Subsequent reads from it will return its default value.
  mutating func clearVotingParams() {_uniqueStorage()._votingParams = nil}

  /// params defines all the parameters of related to tally.
  var tallyParams: Cosmos_Gov_V1beta1_TallyParams {
    get {return _storage._tallyParams ?? Cosmos_Gov_V1beta1_TallyParams()}
    set {_uniqueStorage()._tallyParams = newValue}
  }
  /// Returns true if `tallyParams` has been explicitly set.
  var hasTallyParams: Bool {return _storage._tallyParams != nil}
  /// Clears the value of `tallyParams`. Subsequent reads from it will return its default value.
  mutating func clearTallyParams() {_uniqueStorage()._tallyParams = nil}

  /// params defines all the parameters of related to custom.
  var customParams: Shentu_Gov_V1alpha1_CustomParams {
    get {return _storage._customParams ?? Shentu_Gov_V1alpha1_CustomParams()}
    set {_uniqueStorage()._customParams = newValue}
  }
  /// Returns true if `customParams` has been explicitly set.
  var hasCustomParams: Bool {return _storage._customParams != nil}
  /// Clears the value of `customParams`. Subsequent reads from it will return its default value.
  mutating func clearCustomParams() {_uniqueStorage()._customParams = nil}

  /// proposals that require and have passed cert votes.
  var certVotedProposalIds: [UInt64] {
    get {return _storage._certVotedProposalIds}
    set {_uniqueStorage()._certVotedProposalIds = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Shentu_Gov_V1alpha1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.gov.v1alpha1"

extension Shentu_Gov_V1alpha1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "starting_proposal_id"),
    2: .same(proto: "deposits"),
    3: .same(proto: "votes"),
    4: .same(proto: "proposals"),
    5: .standard(proto: "deposit_params"),
    6: .standard(proto: "voting_params"),
    7: .standard(proto: "tally_params"),
    8: .standard(proto: "custom_params"),
    9: .standard(proto: "cert_voted_proposal_ids"),
  ]

  fileprivate class _StorageClass {
    var _startingProposalID: UInt64 = 0
    var _deposits: [Cosmos_Gov_V1beta1_Deposit] = []
    var _votes: [Cosmos_Gov_V1beta1_Vote] = []
    var _proposals: [Cosmos_Gov_V1beta1_Proposal] = []
    var _depositParams: Cosmos_Gov_V1beta1_DepositParams? = nil
    var _votingParams: Cosmos_Gov_V1beta1_VotingParams? = nil
    var _tallyParams: Cosmos_Gov_V1beta1_TallyParams? = nil
    var _customParams: Shentu_Gov_V1alpha1_CustomParams? = nil
    var _certVotedProposalIds: [UInt64] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _startingProposalID = source._startingProposalID
      _deposits = source._deposits
      _votes = source._votes
      _proposals = source._proposals
      _depositParams = source._depositParams
      _votingParams = source._votingParams
      _tallyParams = source._tallyParams
      _customParams = source._customParams
      _certVotedProposalIds = source._certVotedProposalIds
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
        case 1: try { try decoder.decodeSingularUInt64Field(value: &_storage._startingProposalID) }()
        case 2: try { try decoder.decodeRepeatedMessageField(value: &_storage._deposits) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._votes) }()
        case 4: try { try decoder.decodeRepeatedMessageField(value: &_storage._proposals) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._depositParams) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._votingParams) }()
        case 7: try { try decoder.decodeSingularMessageField(value: &_storage._tallyParams) }()
        case 8: try { try decoder.decodeSingularMessageField(value: &_storage._customParams) }()
        case 9: try { try decoder.decodeRepeatedUInt64Field(value: &_storage._certVotedProposalIds) }()
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
      if _storage._startingProposalID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._startingProposalID, fieldNumber: 1)
      }
      if !_storage._deposits.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._deposits, fieldNumber: 2)
      }
      if !_storage._votes.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._votes, fieldNumber: 3)
      }
      if !_storage._proposals.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._proposals, fieldNumber: 4)
      }
      try { if let v = _storage._depositParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._votingParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      try { if let v = _storage._tallyParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      } }()
      try { if let v = _storage._customParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
      } }()
      if !_storage._certVotedProposalIds.isEmpty {
        try visitor.visitPackedUInt64Field(value: _storage._certVotedProposalIds, fieldNumber: 9)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Gov_V1alpha1_GenesisState, rhs: Shentu_Gov_V1alpha1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._startingProposalID != rhs_storage._startingProposalID {return false}
        if _storage._deposits != rhs_storage._deposits {return false}
        if _storage._votes != rhs_storage._votes {return false}
        if _storage._proposals != rhs_storage._proposals {return false}
        if _storage._depositParams != rhs_storage._depositParams {return false}
        if _storage._votingParams != rhs_storage._votingParams {return false}
        if _storage._tallyParams != rhs_storage._tallyParams {return false}
        if _storage._customParams != rhs_storage._customParams {return false}
        if _storage._certVotedProposalIds != rhs_storage._certVotedProposalIds {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
