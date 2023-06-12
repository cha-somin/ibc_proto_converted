// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: regen/data/v1alpha2/types.proto
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

/// MediaType defines MIME media types to be used with a ContentHash.Raw hash.
enum Regen_Data_V1alpha2_MediaType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// MEDIA_TYPE_UNSPECIFIED can be used for raw binary data
  case unspecified // = 0

  /// plain text
  case textPlain // = 1

  /// JSON
  case json // = 2

  /// CSV
  case csv // = 3

  /// XML
  case xml // = 4

  /// PDF
  case pdf // = 5

  /// TIIF
  case tiff // = 16

  /// JPG
  case jpg // = 17

  /// PNG
  case png // = 18

  /// SVG
  case svg // = 19

  /// WEBP
  case webp // = 20

  /// AVIF
  case avif // = 21

  /// GIF
  case gif // = 22

  /// APNG
  case apng // = 23

  /// MPEG
  case mpeg // = 32

  /// MP4
  case mp4 // = 33

  /// WEBM
  case webm // = 34

  /// OGG
  case ogg // = 35
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .textPlain
    case 2: self = .json
    case 3: self = .csv
    case 4: self = .xml
    case 5: self = .pdf
    case 16: self = .tiff
    case 17: self = .jpg
    case 18: self = .png
    case 19: self = .svg
    case 20: self = .webp
    case 21: self = .avif
    case 22: self = .gif
    case 23: self = .apng
    case 32: self = .mpeg
    case 33: self = .mp4
    case 34: self = .webm
    case 35: self = .ogg
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .textPlain: return 1
    case .json: return 2
    case .csv: return 3
    case .xml: return 4
    case .pdf: return 5
    case .tiff: return 16
    case .jpg: return 17
    case .png: return 18
    case .svg: return 19
    case .webp: return 20
    case .avif: return 21
    case .gif: return 22
    case .apng: return 23
    case .mpeg: return 32
    case .mp4: return 33
    case .webm: return 34
    case .ogg: return 35
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Regen_Data_V1alpha2_MediaType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Regen_Data_V1alpha2_MediaType] = [
    .unspecified,
    .textPlain,
    .json,
    .csv,
    .xml,
    .pdf,
    .tiff,
    .jpg,
    .png,
    .svg,
    .webp,
    .avif,
    .gif,
    .apng,
    .mpeg,
    .mp4,
    .webm,
    .ogg,
  ]
}

#endif  // swift(>=4.2)

/// GraphCanonicalizationAlgorithm is the graph canonicalization algorithm
enum Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// unspecified and invalid
  case unspecified // = 0

  /// URDNA2015 graph hashing
  case urdna2015 // = 1
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .urdna2015
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .urdna2015: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm] = [
    .unspecified,
    .urdna2015,
  ]
}

#endif  // swift(>=4.2)

/// GraphMerkleTree is the graph merkle tree type used for hashing, if any
enum Regen_Data_V1alpha2_GraphMerkleTree: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// no merkle tree
  case noneUnspecified // = 0
  case UNRECOGNIZED(Int)

  init() {
    self = .noneUnspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .noneUnspecified
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .noneUnspecified: return 0
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Regen_Data_V1alpha2_GraphMerkleTree: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Regen_Data_V1alpha2_GraphMerkleTree] = [
    .noneUnspecified,
  ]
}

#endif  // swift(>=4.2)

/// DigestAlgorithm is the hash digest algorithm
enum Regen_Data_V1alpha2_DigestAlgorithm: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// unspecified and invalid
  case unspecified // = 0

  /// BLAKE2b-256
  case blake2B256 // = 1
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .blake2B256
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .blake2B256: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Regen_Data_V1alpha2_DigestAlgorithm: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Regen_Data_V1alpha2_DigestAlgorithm] = [
    .unspecified,
    .blake2B256,
  ]
}

#endif  // swift(>=4.2)

/// ContentHash specifies a hash based content identifier for a piece of data
struct Regen_Data_V1alpha2_ContentHash {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// sum selects the type of content hash
  var sum: Regen_Data_V1alpha2_ContentHash.OneOf_Sum? = nil

  /// Raw specifies "raw" data which does not specify a deterministic, canonical encoding.
  /// Users of these hashes MUST maintain a copy of the hashed data which is preserved bit by bit.
  /// All other content encodings specify a deterministic, canonical encoding allowing implementations to
  /// choose from a variety of alternative formats for transport and encoding while maintaining the guarantee
  /// that the canonical hash will not change. The media type for "raw" data is defined by the MediaType enum.
  var raw: Regen_Data_V1alpha2_ContentHash.Raw {
    get {
      if case .raw(let v)? = sum {return v}
      return Regen_Data_V1alpha2_ContentHash.Raw()
    }
    set {sum = .raw(newValue)}
  }

  /// Graph specifies graph data that conforms to the RDF data model.
  /// The canonicalization algorithm used for an RDF graph is specified by GraphCanonicalizationAlgorithm.
  var graph: Regen_Data_V1alpha2_ContentHash.Graph {
    get {
      if case .graph(let v)? = sum {return v}
      return Regen_Data_V1alpha2_ContentHash.Graph()
    }
    set {sum = .graph(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// sum selects the type of content hash
  enum OneOf_Sum: Equatable {
    /// Raw specifies "raw" data which does not specify a deterministic, canonical encoding.
    /// Users of these hashes MUST maintain a copy of the hashed data which is preserved bit by bit.
    /// All other content encodings specify a deterministic, canonical encoding allowing implementations to
    /// choose from a variety of alternative formats for transport and encoding while maintaining the guarantee
    /// that the canonical hash will not change. The media type for "raw" data is defined by the MediaType enum.
    case raw(Regen_Data_V1alpha2_ContentHash.Raw)
    /// Graph specifies graph data that conforms to the RDF data model.
    /// The canonicalization algorithm used for an RDF graph is specified by GraphCanonicalizationAlgorithm.
    case graph(Regen_Data_V1alpha2_ContentHash.Graph)

  #if !swift(>=4.1)
    static func ==(lhs: Regen_Data_V1alpha2_ContentHash.OneOf_Sum, rhs: Regen_Data_V1alpha2_ContentHash.OneOf_Sum) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.raw, .raw): return {
        guard case .raw(let l) = lhs, case .raw(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.graph, .graph): return {
        guard case .graph(let l) = lhs, case .graph(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  /// Raw is the content hash type used for raw data
  struct Raw {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    /// hash represents the hash of the data based on the specified digest_algorithm
    var hash: Data = Data()

    /// digest_algorithm represents the hash digest algorithm.
    var digestAlgorithm: Regen_Data_V1alpha2_DigestAlgorithm = .unspecified

    /// media_type represents the MediaType for raw data.
    var mediaType: Regen_Data_V1alpha2_MediaType = .unspecified

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  /// Graph is the content hash type used for RDF graph data
  struct Graph {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    /// hash represents the hash of the data based on the specified digest_algorithm
    var hash: Data = Data()

    /// digest_algorithm represents the hash digest algorithm.
    var digestAlgorithm: Regen_Data_V1alpha2_DigestAlgorithm = .unspecified

    /// graph_canonicalization_algorithm represents the RDF graph canonicalization algorithm.
    var canonicalizationAlgorithm: Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm = .unspecified

    /// merkle_tree is the merkle tree type used for the graph hash, if any
    var merkleTree: Regen_Data_V1alpha2_GraphMerkleTree = .noneUnspecified

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}
  }

  init() {}
}

/// SignerEntry is a signer entry wrapping a signer address and timestamp
struct Regen_Data_V1alpha2_SignerEntry {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// signer is the address of the signer
  var signer: String = String()

  /// timestamp is the time at which the data was signed
  var timestamp: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _timestamp ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_timestamp = newValue}
  }
  /// Returns true if `timestamp` has been explicitly set.
  var hasTimestamp: Bool {return self._timestamp != nil}
  /// Clears the value of `timestamp`. Subsequent reads from it will return its default value.
  mutating func clearTimestamp() {self._timestamp = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timestamp: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Regen_Data_V1alpha2_MediaType: @unchecked Sendable {}
extension Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm: @unchecked Sendable {}
extension Regen_Data_V1alpha2_GraphMerkleTree: @unchecked Sendable {}
extension Regen_Data_V1alpha2_DigestAlgorithm: @unchecked Sendable {}
extension Regen_Data_V1alpha2_ContentHash: @unchecked Sendable {}
extension Regen_Data_V1alpha2_ContentHash.OneOf_Sum: @unchecked Sendable {}
extension Regen_Data_V1alpha2_ContentHash.Raw: @unchecked Sendable {}
extension Regen_Data_V1alpha2_ContentHash.Graph: @unchecked Sendable {}
extension Regen_Data_V1alpha2_SignerEntry: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "regen.data.v1alpha2"

extension Regen_Data_V1alpha2_MediaType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "MEDIA_TYPE_UNSPECIFIED"),
    1: .same(proto: "MEDIA_TYPE_TEXT_PLAIN"),
    2: .same(proto: "MEDIA_TYPE_JSON"),
    3: .same(proto: "MEDIA_TYPE_CSV"),
    4: .same(proto: "MEDIA_TYPE_XML"),
    5: .same(proto: "MEDIA_TYPE_PDF"),
    16: .same(proto: "MEDIA_TYPE_TIFF"),
    17: .same(proto: "MEDIA_TYPE_JPG"),
    18: .same(proto: "MEDIA_TYPE_PNG"),
    19: .same(proto: "MEDIA_TYPE_SVG"),
    20: .same(proto: "MEDIA_TYPE_WEBP"),
    21: .same(proto: "MEDIA_TYPE_AVIF"),
    22: .same(proto: "MEDIA_TYPE_GIF"),
    23: .same(proto: "MEDIA_TYPE_APNG"),
    32: .same(proto: "MEDIA_TYPE_MPEG"),
    33: .same(proto: "MEDIA_TYPE_MP4"),
    34: .same(proto: "MEDIA_TYPE_WEBM"),
    35: .same(proto: "MEDIA_TYPE_OGG"),
  ]
}

extension Regen_Data_V1alpha2_GraphCanonicalizationAlgorithm: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "GRAPH_CANONICALIZATION_ALGORITHM_UNSPECIFIED"),
    1: .same(proto: "GRAPH_CANONICALIZATION_ALGORITHM_URDNA2015"),
  ]
}

extension Regen_Data_V1alpha2_GraphMerkleTree: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "GRAPH_MERKLE_TREE_NONE_UNSPECIFIED"),
  ]
}

extension Regen_Data_V1alpha2_DigestAlgorithm: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DIGEST_ALGORITHM_UNSPECIFIED"),
    1: .same(proto: "DIGEST_ALGORITHM_BLAKE2B_256"),
  ]
}

extension Regen_Data_V1alpha2_ContentHash: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContentHash"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "raw"),
    2: .same(proto: "graph"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try {
        var v: Regen_Data_V1alpha2_ContentHash.Raw?
        var hadOneofValue = false
        if let current = self.sum {
          hadOneofValue = true
          if case .raw(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.sum = .raw(v)
        }
      }()
      case 2: try {
        var v: Regen_Data_V1alpha2_ContentHash.Graph?
        var hadOneofValue = false
        if let current = self.sum {
          hadOneofValue = true
          if case .graph(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.sum = .graph(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    switch self.sum {
    case .raw?: try {
      guard case .raw(let v)? = self.sum else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }()
    case .graph?: try {
      guard case .graph(let v)? = self.sum else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Regen_Data_V1alpha2_ContentHash, rhs: Regen_Data_V1alpha2_ContentHash) -> Bool {
    if lhs.sum != rhs.sum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Regen_Data_V1alpha2_ContentHash.Raw: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Regen_Data_V1alpha2_ContentHash.protoMessageName + ".Raw"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "hash"),
    2: .standard(proto: "digest_algorithm"),
    3: .standard(proto: "media_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.digestAlgorithm) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.mediaType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 1)
    }
    if self.digestAlgorithm != .unspecified {
      try visitor.visitSingularEnumField(value: self.digestAlgorithm, fieldNumber: 2)
    }
    if self.mediaType != .unspecified {
      try visitor.visitSingularEnumField(value: self.mediaType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Regen_Data_V1alpha2_ContentHash.Raw, rhs: Regen_Data_V1alpha2_ContentHash.Raw) -> Bool {
    if lhs.hash != rhs.hash {return false}
    if lhs.digestAlgorithm != rhs.digestAlgorithm {return false}
    if lhs.mediaType != rhs.mediaType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Regen_Data_V1alpha2_ContentHash.Graph: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Regen_Data_V1alpha2_ContentHash.protoMessageName + ".Graph"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "hash"),
    2: .standard(proto: "digest_algorithm"),
    3: .standard(proto: "canonicalization_algorithm"),
    4: .standard(proto: "merkle_tree"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.digestAlgorithm) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.canonicalizationAlgorithm) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.merkleTree) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 1)
    }
    if self.digestAlgorithm != .unspecified {
      try visitor.visitSingularEnumField(value: self.digestAlgorithm, fieldNumber: 2)
    }
    if self.canonicalizationAlgorithm != .unspecified {
      try visitor.visitSingularEnumField(value: self.canonicalizationAlgorithm, fieldNumber: 3)
    }
    if self.merkleTree != .noneUnspecified {
      try visitor.visitSingularEnumField(value: self.merkleTree, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Regen_Data_V1alpha2_ContentHash.Graph, rhs: Regen_Data_V1alpha2_ContentHash.Graph) -> Bool {
    if lhs.hash != rhs.hash {return false}
    if lhs.digestAlgorithm != rhs.digestAlgorithm {return false}
    if lhs.canonicalizationAlgorithm != rhs.canonicalizationAlgorithm {return false}
    if lhs.merkleTree != rhs.merkleTree {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Regen_Data_V1alpha2_SignerEntry: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SignerEntry"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signer"),
    2: .same(proto: "timestamp"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._timestamp) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 1)
    }
    try { if let v = self._timestamp {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Regen_Data_V1alpha2_SignerEntry, rhs: Regen_Data_V1alpha2_SignerEntry) -> Bool {
    if lhs.signer != rhs.signer {return false}
    if lhs._timestamp != rhs._timestamp {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
