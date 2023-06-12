// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: bcna/bcna/tx.proto
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

struct Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var bcnaid: String = String()

  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var id: UInt64 = 0

  var bcnaid: String = String()

  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var product: String = String()

  var info: String = String()

  var supplyinfo: String = String()

  var supplyextra: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var id: UInt64 = 0

  var product: String = String()

  var info: String = String()

  var supplyinfo: String = String()

  var supplyextra: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaid: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaid: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaid: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychain: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychainResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychain: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychainResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychain: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychainResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "bitcannaglobal.bcna.bcna"

extension Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateBitcannaid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "bcnaid"),
    3: .same(proto: "address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.bcnaid) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.address) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.bcnaid.isEmpty {
      try visitor.visitSingularStringField(value: self.bcnaid, fieldNumber: 2)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaid, rhs: Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaid) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.bcnaid != rhs.bcnaid {return false}
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateBitcannaidResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgCreateBitcannaidResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateBitcannaid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "id"),
    3: .same(proto: "bcnaid"),
    4: .same(proto: "address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bcnaid) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.address) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if !self.bcnaid.isEmpty {
      try visitor.visitSingularStringField(value: self.bcnaid, fieldNumber: 3)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaid, rhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaid) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.id != rhs.id {return false}
    if lhs.bcnaid != rhs.bcnaid {return false}
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateBitcannaidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateBitcannaidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteBitcannaid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaid, rhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaid) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteBitcannaidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteBitcannaidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateSupplychain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "product"),
    3: .same(proto: "info"),
    4: .same(proto: "supplyinfo"),
    5: .same(proto: "supplyextra"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.product) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.info) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.supplyinfo) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.supplyextra) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.product.isEmpty {
      try visitor.visitSingularStringField(value: self.product, fieldNumber: 2)
    }
    if !self.info.isEmpty {
      try visitor.visitSingularStringField(value: self.info, fieldNumber: 3)
    }
    if !self.supplyinfo.isEmpty {
      try visitor.visitSingularStringField(value: self.supplyinfo, fieldNumber: 4)
    }
    if !self.supplyextra.isEmpty {
      try visitor.visitSingularStringField(value: self.supplyextra, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychain, rhs: Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychain) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.product != rhs.product {return false}
    if lhs.info != rhs.info {return false}
    if lhs.supplyinfo != rhs.supplyinfo {return false}
    if lhs.supplyextra != rhs.supplyextra {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateSupplychainResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychainResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgCreateSupplychainResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateSupplychain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "id"),
    3: .same(proto: "product"),
    4: .same(proto: "info"),
    5: .same(proto: "supplyinfo"),
    6: .same(proto: "supplyextra"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.product) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.info) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.supplyinfo) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.supplyextra) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if !self.product.isEmpty {
      try visitor.visitSingularStringField(value: self.product, fieldNumber: 3)
    }
    if !self.info.isEmpty {
      try visitor.visitSingularStringField(value: self.info, fieldNumber: 4)
    }
    if !self.supplyinfo.isEmpty {
      try visitor.visitSingularStringField(value: self.supplyinfo, fieldNumber: 5)
    }
    if !self.supplyextra.isEmpty {
      try visitor.visitSingularStringField(value: self.supplyextra, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychain, rhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychain) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.id != rhs.id {return false}
    if lhs.product != rhs.product {return false}
    if lhs.info != rhs.info {return false}
    if lhs.supplyinfo != rhs.supplyinfo {return false}
    if lhs.supplyextra != rhs.supplyextra {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateSupplychainResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychainResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgUpdateSupplychainResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteSupplychain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychain, rhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychain) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteSupplychainResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychainResponse, rhs: Bitcannaglobal_Bcna_Bcna_MsgDeleteSupplychainResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
