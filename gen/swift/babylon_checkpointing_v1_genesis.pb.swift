// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/checkpointing/v1/genesis.proto
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

/// GenesisState defines the checkpointing module's genesis state.
struct Babylon_Checkpointing_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// genesis_keys defines the public keys for the genesis validators
  var genesisKeys: [Babylon_Checkpointing_V1_GenesisKey] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GenesisKey defines public key information about the genesis validators
struct Babylon_Checkpointing_V1_GenesisKey {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address is the address corresponding to a validator
  var validatorAddress: String = String()

  /// bls_key defines the BLS key of the validator at genesis
  var blsKey: Babylon_Checkpointing_V1_BlsKey {
    get {return _blsKey ?? Babylon_Checkpointing_V1_BlsKey()}
    set {_blsKey = newValue}
  }
  /// Returns true if `blsKey` has been explicitly set.
  var hasBlsKey: Bool {return self._blsKey != nil}
  /// Clears the value of `blsKey`. Subsequent reads from it will return its default value.
  mutating func clearBlsKey() {self._blsKey = nil}

  /// val_pubkey defines the ed25519 public key of the validator at genesis
  var valPubkey: Cosmos_Crypto_Ed25519_PubKey {
    get {return _valPubkey ?? Cosmos_Crypto_Ed25519_PubKey()}
    set {_valPubkey = newValue}
  }
  /// Returns true if `valPubkey` has been explicitly set.
  var hasValPubkey: Bool {return self._valPubkey != nil}
  /// Clears the value of `valPubkey`. Subsequent reads from it will return its default value.
  mutating func clearValPubkey() {self._valPubkey = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _blsKey: Babylon_Checkpointing_V1_BlsKey? = nil
  fileprivate var _valPubkey: Cosmos_Crypto_Ed25519_PubKey? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Checkpointing_V1_GenesisState: @unchecked Sendable {}
extension Babylon_Checkpointing_V1_GenesisKey: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.checkpointing.v1"

extension Babylon_Checkpointing_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "genesis_keys"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.genesisKeys) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.genesisKeys.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.genesisKeys, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Checkpointing_V1_GenesisState, rhs: Babylon_Checkpointing_V1_GenesisState) -> Bool {
    if lhs.genesisKeys != rhs.genesisKeys {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Checkpointing_V1_GenesisKey: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisKey"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .standard(proto: "bls_key"),
    3: .standard(proto: "val_pubkey"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._blsKey) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._valPubkey) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    try { if let v = self._blsKey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._valPubkey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Checkpointing_V1_GenesisKey, rhs: Babylon_Checkpointing_V1_GenesisKey) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs._blsKey != rhs._blsKey {return false}
    if lhs._valPubkey != rhs._valPubkey {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
