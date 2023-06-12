// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/bundles/v1beta1/params.proto
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

/// Params defines the bundles module parameters.
struct Kyve_Bundles_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// upload_timeout ...
  var uploadTimeout: UInt64 = 0

  /// storage_cost ...
  var storageCost: String = String()

  /// network_fee ...
  var networkFee: String = String()

  /// max_points ...
  var maxPoints: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Bundles_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.bundles.v1beta1"

extension Kyve_Bundles_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "upload_timeout"),
    2: .standard(proto: "storage_cost"),
    3: .standard(proto: "network_fee"),
    4: .standard(proto: "max_points"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.uploadTimeout) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.storageCost) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.networkFee) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.maxPoints) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.uploadTimeout != 0 {
      try visitor.visitSingularUInt64Field(value: self.uploadTimeout, fieldNumber: 1)
    }
    if !self.storageCost.isEmpty {
      try visitor.visitSingularStringField(value: self.storageCost, fieldNumber: 2)
    }
    if !self.networkFee.isEmpty {
      try visitor.visitSingularStringField(value: self.networkFee, fieldNumber: 3)
    }
    if self.maxPoints != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxPoints, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Bundles_V1beta1_Params, rhs: Kyve_Bundles_V1beta1_Params) -> Bool {
    if lhs.uploadTimeout != rhs.uploadTimeout {return false}
    if lhs.storageCost != rhs.storageCost {return false}
    if lhs.networkFee != rhs.networkFee {return false}
    if lhs.maxPoints != rhs.maxPoints {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
