// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ixo/token/v1beta1/token.proto
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

struct Ixo_Token_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ixo1155ContractCode: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_Token {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of minter
  var minter: String = String()

  /// generated on token intiation through MsgSetupMinter
  var contractAddress: String = String()

  /// class is the token protocol entity DID (validated)
  var `class`: String = String()

  /// name is the token name, which must be unique (namespace)
  var name: String = String()

  /// description is any arbitrary description
  var description_p: String = String()

  /// image is the image url for the token
  var image: String = String()

  /// type is the token type (eg ixo1155)
  var type: String = String()

  /// cap is the maximum number of tokens with this name that can be minted, 0 is
  /// unlimited
  var cap: String = String()

  /// how much has already been minted for this Token type, aka the supply
  var supply: String = String()

  /// stop allowance of token minter temporarily
  var paused: Bool = false

  /// stop allowance of token minter permanently
  var stopped: Bool = false

  /// tokens that has been retired for this Token with specific name and contract
  /// address
  var retired: [Ixo_Token_V1beta1_TokensRetired] = []

  /// tokens that has been cancelled for this Token with specific name and
  /// contract address
  var cancelled: [Ixo_Token_V1beta1_TokensCancelled] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_TokensRetired {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var reason: String = String()

  var jurisdiction: String = String()

  var amount: String = String()

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_TokensCancelled {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var reason: String = String()

  var amount: String = String()

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_TokenProperties {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  /// index is the unique identifier hexstring that identifies the token
  var index: String = String()

  /// name is the token name, which is same as Token name
  var name: String = String()

  /// did of collection (eg Supamoto Malawi)
  var collection: String = String()

  /// tokenData is the linkedResources added to tokenMetadata when queried eg
  /// (credential link ***.ipfs)
  var tokenData: [Ixo_Token_V1beta1_TokenData] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_TokenData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// media type value should always be "application/json"
  var uri: String = String()

  var encrypted: Bool = false

  var proof: String = String()

  var type: String = String()

  /// did of entity to map token to
  var id: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ixo_Token_V1beta1_Params: @unchecked Sendable {}
extension Ixo_Token_V1beta1_Token: @unchecked Sendable {}
extension Ixo_Token_V1beta1_TokensRetired: @unchecked Sendable {}
extension Ixo_Token_V1beta1_TokensCancelled: @unchecked Sendable {}
extension Ixo_Token_V1beta1_TokenProperties: @unchecked Sendable {}
extension Ixo_Token_V1beta1_TokenData: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ixo.token.v1beta1"

extension Ixo_Token_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "ixo1155_contract_code"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.ixo1155ContractCode) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.ixo1155ContractCode != 0 {
      try visitor.visitSingularUInt64Field(value: self.ixo1155ContractCode, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_Params, rhs: Ixo_Token_V1beta1_Params) -> Bool {
    if lhs.ixo1155ContractCode != rhs.ixo1155ContractCode {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_Token: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Token"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .standard(proto: "contract_address"),
    3: .same(proto: "class"),
    4: .same(proto: "name"),
    5: .same(proto: "description"),
    6: .same(proto: "image"),
    7: .same(proto: "type"),
    8: .same(proto: "cap"),
    9: .same(proto: "supply"),
    10: .same(proto: "paused"),
    11: .same(proto: "stopped"),
    12: .same(proto: "retired"),
    13: .same(proto: "cancelled"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.`class`) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.image) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.type) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.cap) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.supply) }()
      case 10: try { try decoder.decodeSingularBoolField(value: &self.paused) }()
      case 11: try { try decoder.decodeSingularBoolField(value: &self.stopped) }()
      case 12: try { try decoder.decodeRepeatedMessageField(value: &self.retired) }()
      case 13: try { try decoder.decodeRepeatedMessageField(value: &self.cancelled) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.minter.isEmpty {
      try visitor.visitSingularStringField(value: self.minter, fieldNumber: 1)
    }
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 2)
    }
    if !self.`class`.isEmpty {
      try visitor.visitSingularStringField(value: self.`class`, fieldNumber: 3)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 4)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 5)
    }
    if !self.image.isEmpty {
      try visitor.visitSingularStringField(value: self.image, fieldNumber: 6)
    }
    if !self.type.isEmpty {
      try visitor.visitSingularStringField(value: self.type, fieldNumber: 7)
    }
    if !self.cap.isEmpty {
      try visitor.visitSingularStringField(value: self.cap, fieldNumber: 8)
    }
    if !self.supply.isEmpty {
      try visitor.visitSingularStringField(value: self.supply, fieldNumber: 9)
    }
    if self.paused != false {
      try visitor.visitSingularBoolField(value: self.paused, fieldNumber: 10)
    }
    if self.stopped != false {
      try visitor.visitSingularBoolField(value: self.stopped, fieldNumber: 11)
    }
    if !self.retired.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.retired, fieldNumber: 12)
    }
    if !self.cancelled.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.cancelled, fieldNumber: 13)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_Token, rhs: Ixo_Token_V1beta1_Token) -> Bool {
    if lhs.minter != rhs.minter {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.`class` != rhs.`class` {return false}
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.image != rhs.image {return false}
    if lhs.type != rhs.type {return false}
    if lhs.cap != rhs.cap {return false}
    if lhs.supply != rhs.supply {return false}
    if lhs.paused != rhs.paused {return false}
    if lhs.stopped != rhs.stopped {return false}
    if lhs.retired != rhs.retired {return false}
    if lhs.cancelled != rhs.cancelled {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_TokensRetired: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokensRetired"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "reason"),
    3: .same(proto: "jurisdiction"),
    4: .same(proto: "amount"),
    5: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.reason) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.jurisdiction) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.reason.isEmpty {
      try visitor.visitSingularStringField(value: self.reason, fieldNumber: 2)
    }
    if !self.jurisdiction.isEmpty {
      try visitor.visitSingularStringField(value: self.jurisdiction, fieldNumber: 3)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 4)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_TokensRetired, rhs: Ixo_Token_V1beta1_TokensRetired) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.reason != rhs.reason {return false}
    if lhs.jurisdiction != rhs.jurisdiction {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_TokensCancelled: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokensCancelled"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "reason"),
    3: .same(proto: "amount"),
    4: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.reason) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.reason.isEmpty {
      try visitor.visitSingularStringField(value: self.reason, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_TokensCancelled, rhs: Ixo_Token_V1beta1_TokensCancelled) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.reason != rhs.reason {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_TokenProperties: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenProperties"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "index"),
    3: .same(proto: "name"),
    4: .same(proto: "collection"),
    5: .same(proto: "tokenData"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.index) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.collection) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.tokenData) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.index.isEmpty {
      try visitor.visitSingularStringField(value: self.index, fieldNumber: 2)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 3)
    }
    if !self.collection.isEmpty {
      try visitor.visitSingularStringField(value: self.collection, fieldNumber: 4)
    }
    if !self.tokenData.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenData, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_TokenProperties, rhs: Ixo_Token_V1beta1_TokenProperties) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.index != rhs.index {return false}
    if lhs.name != rhs.name {return false}
    if lhs.collection != rhs.collection {return false}
    if lhs.tokenData != rhs.tokenData {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_TokenData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uri"),
    2: .same(proto: "encrypted"),
    3: .same(proto: "proof"),
    4: .same(proto: "type"),
    5: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.uri) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.encrypted) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.proof) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.type) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.uri.isEmpty {
      try visitor.visitSingularStringField(value: self.uri, fieldNumber: 1)
    }
    if self.encrypted != false {
      try visitor.visitSingularBoolField(value: self.encrypted, fieldNumber: 2)
    }
    if !self.proof.isEmpty {
      try visitor.visitSingularStringField(value: self.proof, fieldNumber: 3)
    }
    if !self.type.isEmpty {
      try visitor.visitSingularStringField(value: self.type, fieldNumber: 4)
    }
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_TokenData, rhs: Ixo_Token_V1beta1_TokenData) -> Bool {
    if lhs.uri != rhs.uri {return false}
    if lhs.encrypted != rhs.encrypted {return false}
    if lhs.proof != rhs.proof {return false}
    if lhs.type != rhs.type {return false}
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
