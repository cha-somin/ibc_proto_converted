// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ixo/token/v1beta1/tx.proto
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

struct Ixo_Token_V1beta1_MsgCreateToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of minter
  var minter: String = String()

  /// class is the token protocol entity DID (validated)
  var `class`: String = String()

  /// name is the token name, which must be unique (namespace)
  var name: String = String()

  /// description is any arbitrary description
  var description_p: String = String()

  /// image is the image url for the token
  var image: String = String()

  /// type is the token type (eg ixo1155)
  var tokenType: String = String()

  /// cap is the maximum number of tokens with this name that can be minted, 0 is
  /// unlimited
  var cap: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgCreateTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgMintToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of minter
  var minter: String = String()

  var contractAddress: String = String()

  /// address of owner to mint for
  var owner: String = String()

  var mintBatch: [Ixo_Token_V1beta1_MintBatch] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MintBatch {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// name is the token name, which must be unique (namespace), will be verified
  /// against Token name provided on msgCreateToken
  var name: String = String()

  /// index is the unique identifier hexstring that identifies the token
  var index: String = String()

  /// amount is the number of tokens to mint
  var amount: String = String()

  /// did of collection (eg Supamoto Malawi)
  var collection: String = String()

  /// tokenData is the linkedResources added to tokenMetadata when queried eg
  /// (credential link ***.ipfs)
  var tokenData: [Ixo_Token_V1beta1_TokenData] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgMintTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgTransferToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of owner
  var owner: String = String()

  /// address of receiver
  var recipient: String = String()

  /// all tokens must be in same smart contract
  var tokens: [Ixo_Token_V1beta1_TokenBatch] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgTransferTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_TokenBatch {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// id that identifies the token
  var id: String = String()

  /// amount is the number of tokens to transfer
  var amount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgRetireToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of owner
  var owner: String = String()

  /// tokens to retire, all tokens must be in same smart contract
  var tokens: [Ixo_Token_V1beta1_TokenBatch] = []

  /// jurisdiction is the jurisdiction of the token owner. A jurisdiction has
  /// the format: <country-code>[-<sub-national-code>[ <postal-code>]]
  /// The country-code must be 2 alphabetic characters, the sub-national-code
  /// can be 1-3 alphanumeric characters, and the postal-code can be up to 64
  /// alphanumeric characters. Only the country-code is required, while the
  /// sub-national-code and postal-code are optional and can be added for
  /// increased precision. See the valid format for this below.
  var jurisdiction: String = String()

  /// reason is any arbitrary string that specifies the reason for retiring
  /// tokens.
  var reason: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgRetireTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgCancelToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of owner
  var owner: String = String()

  /// tokens to retire, all tokens must be in same smart contract
  var tokens: [Ixo_Token_V1beta1_TokenBatch] = []

  /// reason is any arbitrary string that specifies the reason for retiring
  /// tokens.
  var reason: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgCancelTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgPauseToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of minter
  var minter: String = String()

  var contractAddress: String = String()

  /// pause or unpause Token Minting allowance
  var paused: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgPauseTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgStopToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address of minter
  var minter: String = String()

  var contractAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Ixo_Token_V1beta1_MsgStopTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ixo_Token_V1beta1_MsgCreateToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgCreateTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgMintToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MintBatch: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgMintTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgTransferToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgTransferTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_TokenBatch: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgRetireToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgRetireTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgCancelToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgCancelTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgPauseToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgPauseTokenResponse: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgStopToken: @unchecked Sendable {}
extension Ixo_Token_V1beta1_MsgStopTokenResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ixo.token.v1beta1"

extension Ixo_Token_V1beta1_MsgCreateToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .same(proto: "class"),
    3: .same(proto: "name"),
    4: .same(proto: "description"),
    5: .same(proto: "image"),
    6: .standard(proto: "token_type"),
    7: .same(proto: "cap"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.`class`) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.image) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.tokenType) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.cap) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.minter.isEmpty {
      try visitor.visitSingularStringField(value: self.minter, fieldNumber: 1)
    }
    if !self.`class`.isEmpty {
      try visitor.visitSingularStringField(value: self.`class`, fieldNumber: 2)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.image.isEmpty {
      try visitor.visitSingularStringField(value: self.image, fieldNumber: 5)
    }
    if !self.tokenType.isEmpty {
      try visitor.visitSingularStringField(value: self.tokenType, fieldNumber: 6)
    }
    if !self.cap.isEmpty {
      try visitor.visitSingularStringField(value: self.cap, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgCreateToken, rhs: Ixo_Token_V1beta1_MsgCreateToken) -> Bool {
    if lhs.minter != rhs.minter {return false}
    if lhs.`class` != rhs.`class` {return false}
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.image != rhs.image {return false}
    if lhs.tokenType != rhs.tokenType {return false}
    if lhs.cap != rhs.cap {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgCreateTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgCreateTokenResponse, rhs: Ixo_Token_V1beta1_MsgCreateTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgMintToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMintToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .standard(proto: "contract_address"),
    3: .same(proto: "owner"),
    4: .standard(proto: "mint_batch"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.mintBatch) }()
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
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 3)
    }
    if !self.mintBatch.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.mintBatch, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgMintToken, rhs: Ixo_Token_V1beta1_MsgMintToken) -> Bool {
    if lhs.minter != rhs.minter {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.mintBatch != rhs.mintBatch {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MintBatch: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MintBatch"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "index"),
    3: .same(proto: "amount"),
    4: .same(proto: "collection"),
    5: .standard(proto: "token_data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.index) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.collection) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.tokenData) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.index.isEmpty {
      try visitor.visitSingularStringField(value: self.index, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if !self.collection.isEmpty {
      try visitor.visitSingularStringField(value: self.collection, fieldNumber: 4)
    }
    if !self.tokenData.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokenData, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MintBatch, rhs: Ixo_Token_V1beta1_MintBatch) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.index != rhs.index {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.collection != rhs.collection {return false}
    if lhs.tokenData != rhs.tokenData {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgMintTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMintTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgMintTokenResponse, rhs: Ixo_Token_V1beta1_MsgMintTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgTransferToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTransferToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "recipient"),
    3: .same(proto: "tokens"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.tokens) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 2)
    }
    if !self.tokens.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokens, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgTransferToken, rhs: Ixo_Token_V1beta1_MsgTransferToken) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.tokens != rhs.tokens {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgTransferTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTransferTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgTransferTokenResponse, rhs: Ixo_Token_V1beta1_MsgTransferTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_TokenBatch: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenBatch"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_TokenBatch, rhs: Ixo_Token_V1beta1_TokenBatch) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgRetireToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRetireToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "tokens"),
    3: .same(proto: "jurisdiction"),
    4: .same(proto: "reason"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.tokens) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.jurisdiction) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.reason) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.tokens.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokens, fieldNumber: 2)
    }
    if !self.jurisdiction.isEmpty {
      try visitor.visitSingularStringField(value: self.jurisdiction, fieldNumber: 3)
    }
    if !self.reason.isEmpty {
      try visitor.visitSingularStringField(value: self.reason, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgRetireToken, rhs: Ixo_Token_V1beta1_MsgRetireToken) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.tokens != rhs.tokens {return false}
    if lhs.jurisdiction != rhs.jurisdiction {return false}
    if lhs.reason != rhs.reason {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgRetireTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRetireTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgRetireTokenResponse, rhs: Ixo_Token_V1beta1_MsgRetireTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgCancelToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "tokens"),
    3: .same(proto: "reason"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.tokens) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.reason) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.tokens.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tokens, fieldNumber: 2)
    }
    if !self.reason.isEmpty {
      try visitor.visitSingularStringField(value: self.reason, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgCancelToken, rhs: Ixo_Token_V1beta1_MsgCancelToken) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.tokens != rhs.tokens {return false}
    if lhs.reason != rhs.reason {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgCancelTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgCancelTokenResponse, rhs: Ixo_Token_V1beta1_MsgCancelTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgPauseToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPauseToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .standard(proto: "contract_address"),
    3: .same(proto: "paused"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.paused) }()
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
    if self.paused != false {
      try visitor.visitSingularBoolField(value: self.paused, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgPauseToken, rhs: Ixo_Token_V1beta1_MsgPauseToken) -> Bool {
    if lhs.minter != rhs.minter {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.paused != rhs.paused {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgPauseTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPauseTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgPauseTokenResponse, rhs: Ixo_Token_V1beta1_MsgPauseTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgStopToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgStopToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "minter"),
    2: .standard(proto: "contract_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
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
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgStopToken, rhs: Ixo_Token_V1beta1_MsgStopToken) -> Bool {
    if lhs.minter != rhs.minter {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ixo_Token_V1beta1_MsgStopTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgStopTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ixo_Token_V1beta1_MsgStopTokenResponse, rhs: Ixo_Token_V1beta1_MsgStopTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
