// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: tendermint/crypto/proof.proto
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

struct Tendermint_Crypto_Proof {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var total: Int64 = 0

  var index: Int64 = 0

  var leafHash: Data = Data()

  var aunts: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Tendermint_Crypto_ValueOp {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Encoded in ProofOp.Key.
  var key: Data = Data()

  /// To encode in ProofOp.Data
  var proof: Tendermint_Crypto_Proof {
    get {return _proof ?? Tendermint_Crypto_Proof()}
    set {_proof = newValue}
  }
  /// Returns true if `proof` has been explicitly set.
  var hasProof: Bool {return self._proof != nil}
  /// Clears the value of `proof`. Subsequent reads from it will return its default value.
  mutating func clearProof() {self._proof = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _proof: Tendermint_Crypto_Proof? = nil
}

struct Tendermint_Crypto_DominoOp {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: String = String()

  var input: String = String()

  var output: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ProofOp defines an operation used for calculating Merkle root
/// The data could be arbitrary format, providing nessecary data
/// for example neighbouring node hash
struct Tendermint_Crypto_ProofOp {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var type: String = String()

  var key: Data = Data()

  var data: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ProofOps is Merkle proof defined by the list of ProofOps
struct Tendermint_Crypto_ProofOps {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ops: [Tendermint_Crypto_ProofOp] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Tendermint_Crypto_Proof: @unchecked Sendable {}
extension Tendermint_Crypto_ValueOp: @unchecked Sendable {}
extension Tendermint_Crypto_DominoOp: @unchecked Sendable {}
extension Tendermint_Crypto_ProofOp: @unchecked Sendable {}
extension Tendermint_Crypto_ProofOps: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "tendermint.crypto"

extension Tendermint_Crypto_Proof: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Proof"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "total"),
    2: .same(proto: "index"),
    3: .standard(proto: "leaf_hash"),
    4: .same(proto: "aunts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.total) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.index) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.leafHash) }()
      case 4: try { try decoder.decodeRepeatedBytesField(value: &self.aunts) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.total != 0 {
      try visitor.visitSingularInt64Field(value: self.total, fieldNumber: 1)
    }
    if self.index != 0 {
      try visitor.visitSingularInt64Field(value: self.index, fieldNumber: 2)
    }
    if !self.leafHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.leafHash, fieldNumber: 3)
    }
    if !self.aunts.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.aunts, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Crypto_Proof, rhs: Tendermint_Crypto_Proof) -> Bool {
    if lhs.total != rhs.total {return false}
    if lhs.index != rhs.index {return false}
    if lhs.leafHash != rhs.leafHash {return false}
    if lhs.aunts != rhs.aunts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Crypto_ValueOp: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValueOp"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "proof"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._proof) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    try { if let v = self._proof {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Crypto_ValueOp, rhs: Tendermint_Crypto_ValueOp) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs._proof != rhs._proof {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Crypto_DominoOp: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DominoOp"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "input"),
    3: .same(proto: "output"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.input) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.output) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularStringField(value: self.key, fieldNumber: 1)
    }
    if !self.input.isEmpty {
      try visitor.visitSingularStringField(value: self.input, fieldNumber: 2)
    }
    if !self.output.isEmpty {
      try visitor.visitSingularStringField(value: self.output, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Crypto_DominoOp, rhs: Tendermint_Crypto_DominoOp) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.input != rhs.input {return false}
    if lhs.output != rhs.output {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Crypto_ProofOp: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ProofOp"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "type"),
    2: .same(proto: "key"),
    3: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.type) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.type.isEmpty {
      try visitor.visitSingularStringField(value: self.type, fieldNumber: 1)
    }
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 2)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Crypto_ProofOp, rhs: Tendermint_Crypto_ProofOp) -> Bool {
    if lhs.type != rhs.type {return false}
    if lhs.key != rhs.key {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Crypto_ProofOps: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ProofOps"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "ops"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.ops) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ops.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.ops, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Crypto_ProofOps, rhs: Tendermint_Crypto_ProofOps) -> Bool {
    if lhs.ops != rhs.ops {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
