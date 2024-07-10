// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: dymension/rollapp/tx.proto
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

/// ===================== MsgCreateRollapp
struct Dymensionxyz_Dymension_Rollapp_MsgCreateRollapp {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator is the bech32-encoded address of the rollapp creator
  var creator: String = String()

  /// rollappId is the unique identifier of the rollapp chain.
  /// The rollappId follows the same standard as cosmos chain_id
  var rollappID: String = String()

  /// codeStamp is the description of the genesis file location on the DA
  var codeStamp: String = String()

  /// genesisPath is the description of the genesis file location on the DA
  var genesisPath: String = String()

  /// maxWithholdingBlocks is the maximum number of blocks for
  /// an active sequencer to send a state update (MsgUpdateState)
  var maxWithholdingBlocks: UInt64 = 0

  /// maxSequencers is the maximum number of sequencers
  var maxSequencers: UInt64 = 0

  /// permissionedAddresses is a bech32-encoded address list of the 
  /// sequencers that are allowed to serve this rollappId.
  /// In the case of an empty list, the rollapp is considered permissionless
  var permissionedAddresses: [String] = []

  /// metadata provides the client information for all the registered tokens.
  var metadatas: [Dymensionxyz_Dymension_Rollapp_TokenMetadata] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Dymensionxyz_Dymension_Rollapp_MsgCreateRollappResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ===================== MsgUpdateState
/// Updating a rollapp state with a block batch
/// a block batch is a list of ordered blocks (by height)
struct Dymensionxyz_Dymension_Rollapp_MsgUpdateState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// creator is the bech32-encoded address of the sequencer sending the update
  var creator: String = String()

  /// rollappId is the rollapp that the sequencer belongs to and asking to update
  /// The rollappId follows the same standard as cosmos chain_id
  var rollappID: String = String()

  /// startHeight is the block height of the first block in the batch
  var startHeight: UInt64 = 0

  /// numBlocks is the number of blocks included in this batch update
  var numBlocks: UInt64 = 0

  /// DAPath is the description of the location on the DA layer
  var dapath: String = String()

  /// version is the version of the rollapp
  var version: UInt64 = 0

  /// BDs is a list of block description objects (one per block)
  /// the list must be ordered by height, starting from startHeight to startHeight+numBlocks-1
  var bds: Dymensionxyz_Dymension_Rollapp_BlockDescriptors {
    get {return _bds ?? Dymensionxyz_Dymension_Rollapp_BlockDescriptors()}
    set {_bds = newValue}
  }
  /// Returns true if `bds` has been explicitly set.
  var hasBds: Bool {return self._bds != nil}
  /// Clears the value of `bds`. Subsequent reads from it will return its default value.
  mutating func clearBds() {self._bds = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bds: Dymensionxyz_Dymension_Rollapp_BlockDescriptors? = nil
}

struct Dymensionxyz_Dymension_Rollapp_MsgUpdateStateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Dymensionxyz_Dymension_Rollapp_MsgCreateRollapp: @unchecked Sendable {}
extension Dymensionxyz_Dymension_Rollapp_MsgCreateRollappResponse: @unchecked Sendable {}
extension Dymensionxyz_Dymension_Rollapp_MsgUpdateState: @unchecked Sendable {}
extension Dymensionxyz_Dymension_Rollapp_MsgUpdateStateResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "dymensionxyz.dymension.rollapp"

extension Dymensionxyz_Dymension_Rollapp_MsgCreateRollapp: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateRollapp"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "rollappId"),
    3: .same(proto: "codeStamp"),
    4: .same(proto: "genesisPath"),
    5: .same(proto: "maxWithholdingBlocks"),
    6: .same(proto: "maxSequencers"),
    7: .same(proto: "permissionedAddresses"),
    8: .same(proto: "metadatas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rollappID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.codeStamp) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.genesisPath) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.maxWithholdingBlocks) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.maxSequencers) }()
      case 7: try { try decoder.decodeRepeatedStringField(value: &self.permissionedAddresses) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.metadatas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.rollappID.isEmpty {
      try visitor.visitSingularStringField(value: self.rollappID, fieldNumber: 2)
    }
    if !self.codeStamp.isEmpty {
      try visitor.visitSingularStringField(value: self.codeStamp, fieldNumber: 3)
    }
    if !self.genesisPath.isEmpty {
      try visitor.visitSingularStringField(value: self.genesisPath, fieldNumber: 4)
    }
    if self.maxWithholdingBlocks != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxWithholdingBlocks, fieldNumber: 5)
    }
    if self.maxSequencers != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxSequencers, fieldNumber: 6)
    }
    if !self.permissionedAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.permissionedAddresses, fieldNumber: 7)
    }
    if !self.metadatas.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.metadatas, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Rollapp_MsgCreateRollapp, rhs: Dymensionxyz_Dymension_Rollapp_MsgCreateRollapp) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.rollappID != rhs.rollappID {return false}
    if lhs.codeStamp != rhs.codeStamp {return false}
    if lhs.genesisPath != rhs.genesisPath {return false}
    if lhs.maxWithholdingBlocks != rhs.maxWithholdingBlocks {return false}
    if lhs.maxSequencers != rhs.maxSequencers {return false}
    if lhs.permissionedAddresses != rhs.permissionedAddresses {return false}
    if lhs.metadatas != rhs.metadatas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dymensionxyz_Dymension_Rollapp_MsgCreateRollappResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateRollappResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Rollapp_MsgCreateRollappResponse, rhs: Dymensionxyz_Dymension_Rollapp_MsgCreateRollappResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dymensionxyz_Dymension_Rollapp_MsgUpdateState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "rollappId"),
    3: .same(proto: "startHeight"),
    4: .same(proto: "numBlocks"),
    5: .same(proto: "DAPath"),
    6: .same(proto: "version"),
    7: .same(proto: "BDs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.rollappID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.startHeight) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.numBlocks) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.dapath) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._bds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.rollappID.isEmpty {
      try visitor.visitSingularStringField(value: self.rollappID, fieldNumber: 2)
    }
    if self.startHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.startHeight, fieldNumber: 3)
    }
    if self.numBlocks != 0 {
      try visitor.visitSingularUInt64Field(value: self.numBlocks, fieldNumber: 4)
    }
    if !self.dapath.isEmpty {
      try visitor.visitSingularStringField(value: self.dapath, fieldNumber: 5)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 6)
    }
    try { if let v = self._bds {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Rollapp_MsgUpdateState, rhs: Dymensionxyz_Dymension_Rollapp_MsgUpdateState) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.rollappID != rhs.rollappID {return false}
    if lhs.startHeight != rhs.startHeight {return false}
    if lhs.numBlocks != rhs.numBlocks {return false}
    if lhs.dapath != rhs.dapath {return false}
    if lhs.version != rhs.version {return false}
    if lhs._bds != rhs._bds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dymensionxyz_Dymension_Rollapp_MsgUpdateStateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateStateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Rollapp_MsgUpdateStateResponse, rhs: Dymensionxyz_Dymension_Rollapp_MsgUpdateStateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}