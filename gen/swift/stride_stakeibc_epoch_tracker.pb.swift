// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stride/stakeibc/epoch_tracker.proto
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

struct Stride_Stakeibc_EpochTracker {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var epochIdentifier: String = String()

  var epochNumber: UInt64 = 0

  var nextEpochStartTime: UInt64 = 0

  var duration: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stride_Stakeibc_EpochTracker: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stride.stakeibc"

extension Stride_Stakeibc_EpochTracker: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EpochTracker"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_identifier"),
    2: .standard(proto: "epoch_number"),
    3: .standard(proto: "next_epoch_start_time"),
    4: .same(proto: "duration"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.epochIdentifier) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.epochNumber) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.nextEpochStartTime) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.duration) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.epochIdentifier.isEmpty {
      try visitor.visitSingularStringField(value: self.epochIdentifier, fieldNumber: 1)
    }
    if self.epochNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNumber, fieldNumber: 2)
    }
    if self.nextEpochStartTime != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextEpochStartTime, fieldNumber: 3)
    }
    if self.duration != 0 {
      try visitor.visitSingularUInt64Field(value: self.duration, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stride_Stakeibc_EpochTracker, rhs: Stride_Stakeibc_EpochTracker) -> Bool {
    if lhs.epochIdentifier != rhs.epochIdentifier {return false}
    if lhs.epochNumber != rhs.epochNumber {return false}
    if lhs.nextEpochStartTime != rhs.nextEpochStartTime {return false}
    if lhs.duration != rhs.duration {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
