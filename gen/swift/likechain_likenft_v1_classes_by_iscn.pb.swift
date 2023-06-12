// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: likechain/likenft/v1/classes_by_iscn.proto
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

struct Likechain_Likenft_V1_ClassesByISCN {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var iscnIDPrefix: String = String()

  var classIds: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Likechain_Likenft_V1_ClassesByISCN: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "likechain.likenft.v1"

extension Likechain_Likenft_V1_ClassesByISCN: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClassesByISCN"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "iscn_id_prefix"),
    2: .standard(proto: "class_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.iscnIDPrefix) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.classIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.iscnIDPrefix.isEmpty {
      try visitor.visitSingularStringField(value: self.iscnIDPrefix, fieldNumber: 1)
    }
    if !self.classIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.classIds, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Likechain_Likenft_V1_ClassesByISCN, rhs: Likechain_Likenft_V1_ClassesByISCN) -> Bool {
    if lhs.iscnIDPrefix != rhs.iscnIDPrefix {return false}
    if lhs.classIds != rhs.classIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
