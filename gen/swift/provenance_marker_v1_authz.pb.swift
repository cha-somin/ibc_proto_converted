// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: provenance/marker/v1/authz.proto
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

/// MarkerTransferAuthorization gives the grantee permissions to execute
/// a marker transfer on behalf of the granter's account.
struct Provenance_Marker_V1_MarkerTransferAuthorization {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// transfer_limit is the total amount the grantee can transfer
  var transferLimit: [Cosmos_Base_V1beta1_Coin] = []

  /// allow_list specifies an optional list of addresses to whom the grantee can send restricted coins on behalf of the
  /// granter. If omitted, any recipient is allowed.
  var allowList: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Provenance_Marker_V1_MarkerTransferAuthorization: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "provenance.marker.v1"

extension Provenance_Marker_V1_MarkerTransferAuthorization: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MarkerTransferAuthorization"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "transfer_limit"),
    2: .standard(proto: "allow_list"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.transferLimit) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.allowList) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.transferLimit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.transferLimit, fieldNumber: 1)
    }
    if !self.allowList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.allowList, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Marker_V1_MarkerTransferAuthorization, rhs: Provenance_Marker_V1_MarkerTransferAuthorization) -> Bool {
    if lhs.transferLimit != rhs.transferLimit {return false}
    if lhs.allowList != rhs.allowList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
