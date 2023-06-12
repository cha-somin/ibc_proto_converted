// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: bcna/bcna/supplychain.proto
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

struct Bitcannaglobal_Bcna_Bcna_Supplychain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var product: String = String()

  var info: String = String()

  var supplyinfo: String = String()

  var supplyextra: String = String()

  var creator: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Bitcannaglobal_Bcna_Bcna_Supplychain: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "bitcannaglobal.bcna.bcna"

extension Bitcannaglobal_Bcna_Bcna_Supplychain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Supplychain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "product"),
    3: .same(proto: "info"),
    4: .same(proto: "supplyinfo"),
    5: .same(proto: "supplyextra"),
    6: .same(proto: "creator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.product) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.info) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.supplyinfo) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.supplyextra) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
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
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_Supplychain, rhs: Bitcannaglobal_Bcna_Bcna_Supplychain) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.product != rhs.product {return false}
    if lhs.info != rhs.info {return false}
    if lhs.supplyinfo != rhs.supplyinfo {return false}
    if lhs.supplyextra != rhs.supplyextra {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
