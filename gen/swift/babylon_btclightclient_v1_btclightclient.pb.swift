// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/btclightclient/v1/btclightclient.proto
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

/// BTCHeaderInfo is a structure that contains all relevant information about a
/// BTC header
///  - Full header bytes
///  - Header hash for easy retrieval
///  - Height of the header in the BTC chain
///  - Total work spent on the header. This is the sum of the work corresponding
///  to the header Bits field
///    and the total work of the header.
struct Babylon_Btclightclient_V1_BTCHeaderInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var header: Data = Data()

  var hash: Data = Data()

  var height: UInt64 = 0

  var work: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Btclightclient_V1_BTCHeaderInfo: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.btclightclient.v1"

extension Babylon_Btclightclient_V1_BTCHeaderInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BTCHeaderInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "header"),
    2: .same(proto: "hash"),
    3: .same(proto: "height"),
    4: .same(proto: "work"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.header) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.work) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.header.isEmpty {
      try visitor.visitSingularBytesField(value: self.header, fieldNumber: 1)
    }
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 2)
    }
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 3)
    }
    if !self.work.isEmpty {
      try visitor.visitSingularBytesField(value: self.work, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btclightclient_V1_BTCHeaderInfo, rhs: Babylon_Btclightclient_V1_BTCHeaderInfo) -> Bool {
    if lhs.header != rhs.header {return false}
    if lhs.hash != rhs.hash {return false}
    if lhs.height != rhs.height {return false}
    if lhs.work != rhs.work {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}