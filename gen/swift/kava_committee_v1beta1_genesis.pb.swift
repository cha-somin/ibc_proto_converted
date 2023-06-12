// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/committee/v1beta1/genesis.proto
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

/// VoteType enumerates the valid types of a vote.
enum Kava_Committee_V1beta1_VoteType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// VOTE_TYPE_UNSPECIFIED defines a no-op vote option.
  case unspecified // = 0

  /// VOTE_TYPE_YES defines a yes vote option.
  case yes // = 1

  /// VOTE_TYPE_NO defines a no vote option.
  case no // = 2

  /// VOTE_TYPE_ABSTAIN defines an abstain vote option.
  case abstain // = 3
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .yes
    case 2: self = .no
    case 3: self = .abstain
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .yes: return 1
    case .no: return 2
    case .abstain: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Kava_Committee_V1beta1_VoteType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Kava_Committee_V1beta1_VoteType] = [
    .unspecified,
    .yes,
    .no,
    .abstain,
  ]
}

#endif  // swift(>=4.2)

/// GenesisState defines the committee module's genesis state.
struct Kava_Committee_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var nextProposalID: UInt64 = 0

  var committees: [SwiftProtobuf.Google_Protobuf_Any] = []

  var proposals: [Kava_Committee_V1beta1_Proposal] = []

  var votes: [Kava_Committee_V1beta1_Vote] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Proposal is an internal record of a governance proposal submitted to a committee.
struct Kava_Committee_V1beta1_Proposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: SwiftProtobuf.Google_Protobuf_Any {
    get {return _content ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_content = newValue}
  }
  /// Returns true if `content` has been explicitly set.
  var hasContent: Bool {return self._content != nil}
  /// Clears the value of `content`. Subsequent reads from it will return its default value.
  mutating func clearContent() {self._content = nil}

  var id: UInt64 = 0

  var committeeID: UInt64 = 0

  var deadline: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _deadline ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_deadline = newValue}
  }
  /// Returns true if `deadline` has been explicitly set.
  var hasDeadline: Bool {return self._deadline != nil}
  /// Clears the value of `deadline`. Subsequent reads from it will return its default value.
  mutating func clearDeadline() {self._deadline = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _content: SwiftProtobuf.Google_Protobuf_Any? = nil
  fileprivate var _deadline: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// Vote is an internal record of a single governance vote.
struct Kava_Committee_V1beta1_Vote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var voter: Data = Data()

  var voteType: Kava_Committee_V1beta1_VoteType = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kava_Committee_V1beta1_VoteType: @unchecked Sendable {}
extension Kava_Committee_V1beta1_GenesisState: @unchecked Sendable {}
extension Kava_Committee_V1beta1_Proposal: @unchecked Sendable {}
extension Kava_Committee_V1beta1_Vote: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.committee.v1beta1"

extension Kava_Committee_V1beta1_VoteType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "VOTE_TYPE_UNSPECIFIED"),
    1: .same(proto: "VOTE_TYPE_YES"),
    2: .same(proto: "VOTE_TYPE_NO"),
    3: .same(proto: "VOTE_TYPE_ABSTAIN"),
  ]
}

extension Kava_Committee_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "next_proposal_id"),
    2: .same(proto: "committees"),
    3: .same(proto: "proposals"),
    4: .same(proto: "votes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.nextProposalID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.committees) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.proposals) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.votes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.nextProposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextProposalID, fieldNumber: 1)
    }
    if !self.committees.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.committees, fieldNumber: 2)
    }
    if !self.proposals.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.proposals, fieldNumber: 3)
    }
    if !self.votes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.votes, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_GenesisState, rhs: Kava_Committee_V1beta1_GenesisState) -> Bool {
    if lhs.nextProposalID != rhs.nextProposalID {return false}
    if lhs.committees != rhs.committees {return false}
    if lhs.proposals != rhs.proposals {return false}
    if lhs.votes != rhs.votes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Committee_V1beta1_Proposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Proposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
    2: .same(proto: "id"),
    3: .standard(proto: "committee_id"),
    4: .same(proto: "deadline"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._content) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.committeeID) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._deadline) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._content {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if self.committeeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.committeeID, fieldNumber: 3)
    }
    try { if let v = self._deadline {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_Proposal, rhs: Kava_Committee_V1beta1_Proposal) -> Bool {
    if lhs._content != rhs._content {return false}
    if lhs.id != rhs.id {return false}
    if lhs.committeeID != rhs.committeeID {return false}
    if lhs._deadline != rhs._deadline {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Committee_V1beta1_Vote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Vote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .same(proto: "voter"),
    3: .standard(proto: "vote_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.voter) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.voteType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if !self.voter.isEmpty {
      try visitor.visitSingularBytesField(value: self.voter, fieldNumber: 2)
    }
    if self.voteType != .unspecified {
      try visitor.visitSingularEnumField(value: self.voteType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Committee_V1beta1_Vote, rhs: Kava_Committee_V1beta1_Vote) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.voter != rhs.voter {return false}
    if lhs.voteType != rhs.voteType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
