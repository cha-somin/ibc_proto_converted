// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/lightclients/localhost/v2/localhost.proto
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

/// ClientState defines the 09-localhost client state
struct Ibc_Lightclients_Localhost_V2_ClientState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the latest block height
  var latestHeight: Ibc_Core_Client_V1_Height {
    get {return _latestHeight ?? Ibc_Core_Client_V1_Height()}
    set {_latestHeight = newValue}
  }
  /// Returns true if `latestHeight` has been explicitly set.
  var hasLatestHeight: Bool {return self._latestHeight != nil}
  /// Clears the value of `latestHeight`. Subsequent reads from it will return its default value.
  mutating func clearLatestHeight() {self._latestHeight = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _latestHeight: Ibc_Core_Client_V1_Height? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ibc_Lightclients_Localhost_V2_ClientState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.lightclients.localhost.v2"

extension Ibc_Lightclients_Localhost_V2_ClientState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClientState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "latest_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._latestHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._latestHeight {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Localhost_V2_ClientState, rhs: Ibc_Lightclients_Localhost_V2_ClientState) -> Bool {
    if lhs._latestHeight != rhs._latestHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
