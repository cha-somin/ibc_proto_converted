// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/utils/v1beta1/threshold.proto
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

struct Axelar_Utils_V1beta1_Threshold {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// split threshold into Numerator and denominator to avoid floating point
  /// errors down the line
  var numerator: Int64 = 0

  var denominator: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Utils_V1beta1_Threshold: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.utils.v1beta1"

extension Axelar_Utils_V1beta1_Threshold: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Threshold"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "numerator"),
    2: .same(proto: "denominator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.numerator) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.denominator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.numerator != 0 {
      try visitor.visitSingularInt64Field(value: self.numerator, fieldNumber: 1)
    }
    if self.denominator != 0 {
      try visitor.visitSingularInt64Field(value: self.denominator, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Utils_V1beta1_Threshold, rhs: Axelar_Utils_V1beta1_Threshold) -> Bool {
    if lhs.numerator != rhs.numerator {return false}
    if lhs.denominator != rhs.denominator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
