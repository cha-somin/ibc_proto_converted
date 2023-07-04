// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/provider/v1beta3/genesis.proto
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

/// GenesisState defines the basic genesis state used by provider module
struct Akash_Provider_V1beta3_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var providers: [Akash_Provider_V1beta3_Provider] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Provider_V1beta3_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.provider.v1beta3"

extension Akash_Provider_V1beta3_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "providers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.providers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.providers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.providers, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Provider_V1beta3_GenesisState, rhs: Akash_Provider_V1beta3_GenesisState) -> Bool {
    if lhs.providers != rhs.providers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}