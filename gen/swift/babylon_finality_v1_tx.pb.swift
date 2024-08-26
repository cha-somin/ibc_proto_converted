// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/finality/v1/tx.proto
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

/// MsgCommitPubRandList defines a message for committing a list of public randomness for EOTS
struct Babylon_Finality_V1_MsgCommitPubRandList {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var signer: String = String()

  /// fp_btc_pk is the BTC PK of the finality provider that commits the public randomness
  var fpBtcPk: Data = Data()

  /// start_height is the start block height of the list of public randomness
  var startHeight: UInt64 = 0

  /// num_pub_rand is the number of public randomness committed
  var numPubRand: UInt64 = 0

  /// commitment is the commitment of these public randomness
  /// currently it's the root of the Merkle tree that includes these public randomness
  var commitment: Data = Data()

  /// sig is the signature on (start_height || num_pub_rand || commitment) signed by 
  /// SK corresponding to fp_btc_pk. This prevents others to commit public
  /// randomness on behalf of fp_btc_pk
  /// TODO: another option is to restrict signer to correspond to fp_btc_pk. This restricts
  /// the tx submitter to be the holder of fp_btc_pk. Decide this later
  var sig: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCommitPubRandListResponse is the response to the MsgCommitPubRandList message
struct Babylon_Finality_V1_MsgCommitPubRandListResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddFinalitySig defines a message for adding a finality vote
struct Babylon_Finality_V1_MsgAddFinalitySig {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var signer: String = String()

  /// fp_btc_pk is the BTC PK of the finality provider that casts this vote
  var fpBtcPk: Data = Data()

  /// block_height is the height of the voted block
  var blockHeight: UInt64 = 0

  /// pub_rand is the public randomness committed at this height
  var pubRand: Data = Data()

  /// proof is the proof that the given public randomness is committed under the commitment
  var proof: Tendermint_Crypto_Proof {
    get {return _proof ?? Tendermint_Crypto_Proof()}
    set {_proof = newValue}
  }
  /// Returns true if `proof` has been explicitly set.
  var hasProof: Bool {return self._proof != nil}
  /// Clears the value of `proof`. Subsequent reads from it will return its default value.
  mutating func clearProof() {self._proof = nil}

  /// block_app_hash is the AppHash of the voted block
  var blockAppHash: Data = Data()

  /// finality_sig is the finality signature to this block
  /// where finality signature is an EOTS signature, i.e.,
  /// the `s` in a Schnorr signature `(r, s)`
  /// `r` is the public randomness that is already committed by the finality provider
  var finalitySig: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _proof: Tendermint_Crypto_Proof? = nil
}

/// MsgAddFinalitySigResponse is the response to the MsgAddFinalitySig message
struct Babylon_Finality_V1_MsgAddFinalitySigResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParams defines a message for updating finality module parameters.
struct Babylon_Finality_V1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  /// just FYI: cosmos.AddressString marks that this field should use type alias
  /// for AddressString instead of string, but the functionality is not yet implemented
  /// in cosmos-proto
  var authority: String = String()

  /// params defines the finality parameters to update.
  ///
  /// NOTE: All parameters must be supplied.
  var params: Babylon_Finality_V1_Params {
    get {return _params ?? Babylon_Finality_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Babylon_Finality_V1_Params? = nil
}

/// MsgUpdateParamsResponse is the response to the MsgUpdateParams message.
struct Babylon_Finality_V1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Finality_V1_MsgCommitPubRandList: @unchecked Sendable {}
extension Babylon_Finality_V1_MsgCommitPubRandListResponse: @unchecked Sendable {}
extension Babylon_Finality_V1_MsgAddFinalitySig: @unchecked Sendable {}
extension Babylon_Finality_V1_MsgAddFinalitySigResponse: @unchecked Sendable {}
extension Babylon_Finality_V1_MsgUpdateParams: @unchecked Sendable {}
extension Babylon_Finality_V1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.finality.v1"

extension Babylon_Finality_V1_MsgCommitPubRandList: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCommitPubRandList"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signer"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "start_height"),
    4: .standard(proto: "num_pub_rand"),
    5: .same(proto: "commitment"),
    6: .same(proto: "sig"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.startHeight) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.numPubRand) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.commitment) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.sig) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 1)
    }
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if self.startHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.startHeight, fieldNumber: 3)
    }
    if self.numPubRand != 0 {
      try visitor.visitSingularUInt64Field(value: self.numPubRand, fieldNumber: 4)
    }
    if !self.commitment.isEmpty {
      try visitor.visitSingularBytesField(value: self.commitment, fieldNumber: 5)
    }
    if !self.sig.isEmpty {
      try visitor.visitSingularBytesField(value: self.sig, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgCommitPubRandList, rhs: Babylon_Finality_V1_MsgCommitPubRandList) -> Bool {
    if lhs.signer != rhs.signer {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.startHeight != rhs.startHeight {return false}
    if lhs.numPubRand != rhs.numPubRand {return false}
    if lhs.commitment != rhs.commitment {return false}
    if lhs.sig != rhs.sig {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MsgCommitPubRandListResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCommitPubRandListResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgCommitPubRandListResponse, rhs: Babylon_Finality_V1_MsgCommitPubRandListResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MsgAddFinalitySig: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddFinalitySig"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signer"),
    2: .standard(proto: "fp_btc_pk"),
    3: .standard(proto: "block_height"),
    4: .standard(proto: "pub_rand"),
    5: .same(proto: "proof"),
    6: .standard(proto: "block_app_hash"),
    7: .standard(proto: "finality_sig"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.fpBtcPk) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.pubRand) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._proof) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.blockAppHash) }()
      case 7: try { try decoder.decodeSingularBytesField(value: &self.finalitySig) }()
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
    if !self.fpBtcPk.isEmpty {
      try visitor.visitSingularBytesField(value: self.fpBtcPk, fieldNumber: 2)
    }
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 3)
    }
    if !self.pubRand.isEmpty {
      try visitor.visitSingularBytesField(value: self.pubRand, fieldNumber: 4)
    }
    try { if let v = self._proof {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if !self.blockAppHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.blockAppHash, fieldNumber: 6)
    }
    if !self.finalitySig.isEmpty {
      try visitor.visitSingularBytesField(value: self.finalitySig, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgAddFinalitySig, rhs: Babylon_Finality_V1_MsgAddFinalitySig) -> Bool {
    if lhs.signer != rhs.signer {return false}
    if lhs.fpBtcPk != rhs.fpBtcPk {return false}
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.pubRand != rhs.pubRand {return false}
    if lhs._proof != rhs._proof {return false}
    if lhs.blockAppHash != rhs.blockAppHash {return false}
    if lhs.finalitySig != rhs.finalitySig {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MsgAddFinalitySigResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddFinalitySigResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgAddFinalitySigResponse, rhs: Babylon_Finality_V1_MsgAddFinalitySigResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgUpdateParams, rhs: Babylon_Finality_V1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Finality_V1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Finality_V1_MsgUpdateParamsResponse, rhs: Babylon_Finality_V1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
