// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/bundles/v1beta1/bundles.proto
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

/// BundleStatus represents the status of an evaluated bundle
/// proposal.
enum Kyve_Bundles_V1beta1_BundleStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// BUNDLE_STATUS_UNSPECIFIED ...
  case unspecified // = 0

  /// BUNDLE_STATUS_VALID ...
  case valid // = 1

  /// BUNDLE_STATUS_INVALID ...
  case invalid // = 2

  /// BUNDLE_STATUS_NO_FUNDS ...
  case noFunds // = 3

  /// BUNDLE_STATUS_NO_QUORUM ...
  case noQuorum // = 4

  /// BUNDLE_STATUS_DISABLED  ...
  case disabled // = 5
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .valid
    case 2: self = .invalid
    case 3: self = .noFunds
    case 4: self = .noQuorum
    case 5: self = .disabled
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .valid: return 1
    case .invalid: return 2
    case .noFunds: return 3
    case .noQuorum: return 4
    case .disabled: return 5
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Kyve_Bundles_V1beta1_BundleStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Kyve_Bundles_V1beta1_BundleStatus] = [
    .unspecified,
    .valid,
    .invalid,
    .noFunds,
    .noQuorum,
    .disabled,
  ]
}

#endif  // swift(>=4.2)

/// BundleProposal represents the current bundle proposal
/// of a storage pool
struct Kyve_Bundles_V1beta1_BundleProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pool_id is the id of the pool for which this proposal is for
  var poolID: UInt64 = 0

  /// storage_id is the id with which the data can be retrieved from
  var storageID: String = String()

  /// uploader is the address of the staker who submitted the current proposal
  var uploader: String = String()

  /// next_uploader is the address of the staker who should upload the next proposal
  var nextUploader: String = String()

  /// data_size the size of the data in bytes
  var dataSize: UInt64 = 0

  /// bundle_size the size of the bundle (amount of data items)
  var bundleSize: UInt64 = 0

  /// to_key the key of the last data item in the bundle proposal
  var toKey: String = String()

  /// bundle_summary a string summary of the current proposal
  var bundleSummary: String = String()

  /// data_hash a sha256 hash of the raw compressed data
  var dataHash: String = String()

  /// updated_at the last time this proposal was edited
  var updatedAt: UInt64 = 0

  /// voters_valid list of all stakers who voted in favor for current proposal
  var votersValid: [String] = []

  /// voters_invalid list of all stakers who voted against for current proposal
  var votersInvalid: [String] = []

  /// voters_abstain list of all stakers who voted abstain for current proposal
  var votersAbstain: [String] = []

  /// from_key the key of the first data item in the bundle proposal
  var fromKey: String = String()

  /// storage_provider_id the id of the storage provider where the bundle is stored
  var storageProviderID: UInt32 = 0

  /// compression_id the id of the compression type with which the data was compressed
  var compressionID: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// FinalizedBundle represents a bundle proposal where the majority
/// agreed on its validity
struct Kyve_Bundles_V1beta1_FinalizedBundle {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pool_id is the id of the pool for which this proposal is for
  var poolID: UInt64 = 0

  /// id is a unique identifier for each finalized bundle in a pool
  var id: UInt64 = 0

  /// storage_id is the id with which the data can be retrieved from
  var storageID: String = String()

  /// uploader is the address of the staker who submitted this bundle
  var uploader: String = String()

  /// from_index is the index from where the bundle starts (inclusive)
  var fromIndex: UInt64 = 0

  /// to_index is the index to which the bundle goes (exclusive)
  var toIndex: UInt64 = 0

  /// to_key the key of the last data item in the bundle proposal
  var toKey: String = String()

  /// bundle_summary a string summary of the current proposal
  var bundleSummary: String = String()

  /// data_hash a sha256 hash of the raw compressed data
  var dataHash: String = String()

  /// finalized_at contains details of the block that finalized this bundle.
  var finalizedAt: Kyve_Bundles_V1beta1_FinalizedAt {
    get {return _finalizedAt ?? Kyve_Bundles_V1beta1_FinalizedAt()}
    set {_finalizedAt = newValue}
  }
  /// Returns true if `finalizedAt` has been explicitly set.
  var hasFinalizedAt: Bool {return self._finalizedAt != nil}
  /// Clears the value of `finalizedAt`. Subsequent reads from it will return its default value.
  mutating func clearFinalizedAt() {self._finalizedAt = nil}

  /// from_key the key of the first data item in the bundle proposal
  var fromKey: String = String()

  /// storage_provider_id the id of the storage provider where the bundle is stored
  var storageProviderID: UInt32 = 0

  /// compression_id the id of the compression type with which the data was compressed
  var compressionID: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _finalizedAt: Kyve_Bundles_V1beta1_FinalizedAt? = nil
}

/// FinalizedAt ...
struct Kyve_Bundles_V1beta1_FinalizedAt {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// height ...
  var height: UInt64 = 0

  /// timestamp ...
  var timestamp: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Bundles_V1beta1_BundleStatus: @unchecked Sendable {}
extension Kyve_Bundles_V1beta1_BundleProposal: @unchecked Sendable {}
extension Kyve_Bundles_V1beta1_FinalizedBundle: @unchecked Sendable {}
extension Kyve_Bundles_V1beta1_FinalizedAt: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.bundles.v1beta1"

extension Kyve_Bundles_V1beta1_BundleStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "BUNDLE_STATUS_UNSPECIFIED"),
    1: .same(proto: "BUNDLE_STATUS_VALID"),
    2: .same(proto: "BUNDLE_STATUS_INVALID"),
    3: .same(proto: "BUNDLE_STATUS_NO_FUNDS"),
    4: .same(proto: "BUNDLE_STATUS_NO_QUORUM"),
    5: .same(proto: "BUNDLE_STATUS_DISABLED"),
  ]
}

extension Kyve_Bundles_V1beta1_BundleProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BundleProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .standard(proto: "storage_id"),
    3: .same(proto: "uploader"),
    4: .standard(proto: "next_uploader"),
    5: .standard(proto: "data_size"),
    6: .standard(proto: "bundle_size"),
    7: .standard(proto: "to_key"),
    8: .standard(proto: "bundle_summary"),
    9: .standard(proto: "data_hash"),
    10: .standard(proto: "updated_at"),
    11: .standard(proto: "voters_valid"),
    12: .standard(proto: "voters_invalid"),
    13: .standard(proto: "voters_abstain"),
    14: .standard(proto: "from_key"),
    15: .standard(proto: "storage_provider_id"),
    16: .standard(proto: "compression_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.storageID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.uploader) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.nextUploader) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.dataSize) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.bundleSize) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.toKey) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.bundleSummary) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.dataHash) }()
      case 10: try { try decoder.decodeSingularUInt64Field(value: &self.updatedAt) }()
      case 11: try { try decoder.decodeRepeatedStringField(value: &self.votersValid) }()
      case 12: try { try decoder.decodeRepeatedStringField(value: &self.votersInvalid) }()
      case 13: try { try decoder.decodeRepeatedStringField(value: &self.votersAbstain) }()
      case 14: try { try decoder.decodeSingularStringField(value: &self.fromKey) }()
      case 15: try { try decoder.decodeSingularUInt32Field(value: &self.storageProviderID) }()
      case 16: try { try decoder.decodeSingularUInt32Field(value: &self.compressionID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.storageID.isEmpty {
      try visitor.visitSingularStringField(value: self.storageID, fieldNumber: 2)
    }
    if !self.uploader.isEmpty {
      try visitor.visitSingularStringField(value: self.uploader, fieldNumber: 3)
    }
    if !self.nextUploader.isEmpty {
      try visitor.visitSingularStringField(value: self.nextUploader, fieldNumber: 4)
    }
    if self.dataSize != 0 {
      try visitor.visitSingularUInt64Field(value: self.dataSize, fieldNumber: 5)
    }
    if self.bundleSize != 0 {
      try visitor.visitSingularUInt64Field(value: self.bundleSize, fieldNumber: 6)
    }
    if !self.toKey.isEmpty {
      try visitor.visitSingularStringField(value: self.toKey, fieldNumber: 7)
    }
    if !self.bundleSummary.isEmpty {
      try visitor.visitSingularStringField(value: self.bundleSummary, fieldNumber: 8)
    }
    if !self.dataHash.isEmpty {
      try visitor.visitSingularStringField(value: self.dataHash, fieldNumber: 9)
    }
    if self.updatedAt != 0 {
      try visitor.visitSingularUInt64Field(value: self.updatedAt, fieldNumber: 10)
    }
    if !self.votersValid.isEmpty {
      try visitor.visitRepeatedStringField(value: self.votersValid, fieldNumber: 11)
    }
    if !self.votersInvalid.isEmpty {
      try visitor.visitRepeatedStringField(value: self.votersInvalid, fieldNumber: 12)
    }
    if !self.votersAbstain.isEmpty {
      try visitor.visitRepeatedStringField(value: self.votersAbstain, fieldNumber: 13)
    }
    if !self.fromKey.isEmpty {
      try visitor.visitSingularStringField(value: self.fromKey, fieldNumber: 14)
    }
    if self.storageProviderID != 0 {
      try visitor.visitSingularUInt32Field(value: self.storageProviderID, fieldNumber: 15)
    }
    if self.compressionID != 0 {
      try visitor.visitSingularUInt32Field(value: self.compressionID, fieldNumber: 16)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Bundles_V1beta1_BundleProposal, rhs: Kyve_Bundles_V1beta1_BundleProposal) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.storageID != rhs.storageID {return false}
    if lhs.uploader != rhs.uploader {return false}
    if lhs.nextUploader != rhs.nextUploader {return false}
    if lhs.dataSize != rhs.dataSize {return false}
    if lhs.bundleSize != rhs.bundleSize {return false}
    if lhs.toKey != rhs.toKey {return false}
    if lhs.bundleSummary != rhs.bundleSummary {return false}
    if lhs.dataHash != rhs.dataHash {return false}
    if lhs.updatedAt != rhs.updatedAt {return false}
    if lhs.votersValid != rhs.votersValid {return false}
    if lhs.votersInvalid != rhs.votersInvalid {return false}
    if lhs.votersAbstain != rhs.votersAbstain {return false}
    if lhs.fromKey != rhs.fromKey {return false}
    if lhs.storageProviderID != rhs.storageProviderID {return false}
    if lhs.compressionID != rhs.compressionID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Bundles_V1beta1_FinalizedBundle: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FinalizedBundle"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "id"),
    3: .standard(proto: "storage_id"),
    4: .same(proto: "uploader"),
    5: .standard(proto: "from_index"),
    6: .standard(proto: "to_index"),
    7: .standard(proto: "to_key"),
    8: .standard(proto: "bundle_summary"),
    9: .standard(proto: "data_hash"),
    10: .standard(proto: "finalized_at"),
    11: .standard(proto: "from_key"),
    12: .standard(proto: "storage_provider_id"),
    13: .standard(proto: "compression_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.storageID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.uploader) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.fromIndex) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.toIndex) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.toKey) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.bundleSummary) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.dataHash) }()
      case 10: try { try decoder.decodeSingularMessageField(value: &self._finalizedAt) }()
      case 11: try { try decoder.decodeSingularStringField(value: &self.fromKey) }()
      case 12: try { try decoder.decodeSingularUInt32Field(value: &self.storageProviderID) }()
      case 13: try { try decoder.decodeSingularUInt32Field(value: &self.compressionID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if !self.storageID.isEmpty {
      try visitor.visitSingularStringField(value: self.storageID, fieldNumber: 3)
    }
    if !self.uploader.isEmpty {
      try visitor.visitSingularStringField(value: self.uploader, fieldNumber: 4)
    }
    if self.fromIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.fromIndex, fieldNumber: 5)
    }
    if self.toIndex != 0 {
      try visitor.visitSingularUInt64Field(value: self.toIndex, fieldNumber: 6)
    }
    if !self.toKey.isEmpty {
      try visitor.visitSingularStringField(value: self.toKey, fieldNumber: 7)
    }
    if !self.bundleSummary.isEmpty {
      try visitor.visitSingularStringField(value: self.bundleSummary, fieldNumber: 8)
    }
    if !self.dataHash.isEmpty {
      try visitor.visitSingularStringField(value: self.dataHash, fieldNumber: 9)
    }
    try { if let v = self._finalizedAt {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
    } }()
    if !self.fromKey.isEmpty {
      try visitor.visitSingularStringField(value: self.fromKey, fieldNumber: 11)
    }
    if self.storageProviderID != 0 {
      try visitor.visitSingularUInt32Field(value: self.storageProviderID, fieldNumber: 12)
    }
    if self.compressionID != 0 {
      try visitor.visitSingularUInt32Field(value: self.compressionID, fieldNumber: 13)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Bundles_V1beta1_FinalizedBundle, rhs: Kyve_Bundles_V1beta1_FinalizedBundle) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.id != rhs.id {return false}
    if lhs.storageID != rhs.storageID {return false}
    if lhs.uploader != rhs.uploader {return false}
    if lhs.fromIndex != rhs.fromIndex {return false}
    if lhs.toIndex != rhs.toIndex {return false}
    if lhs.toKey != rhs.toKey {return false}
    if lhs.bundleSummary != rhs.bundleSummary {return false}
    if lhs.dataHash != rhs.dataHash {return false}
    if lhs._finalizedAt != rhs._finalizedAt {return false}
    if lhs.fromKey != rhs.fromKey {return false}
    if lhs.storageProviderID != rhs.storageProviderID {return false}
    if lhs.compressionID != rhs.compressionID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Bundles_V1beta1_FinalizedAt: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FinalizedAt"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "height"),
    2: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 1)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Bundles_V1beta1_FinalizedAt, rhs: Kyve_Bundles_V1beta1_FinalizedAt) -> Bool {
    if lhs.height != rhs.height {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}