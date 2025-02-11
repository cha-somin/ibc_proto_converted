// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: eth/types/v1/account.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

/// Copyright (c) 2023-2024 Nibi, Inc.

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

/// EthAccount implements the authtypes.AccountI interface and embeds an
/// authtypes.BaseAccount type. It is compatible with the auth AccountKeeper.
struct Eth_Types_V1_EthAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// base_account is an authtypes.BaseAccount
  var baseAccount: Cosmos_Auth_V1beta1_BaseAccount {
    get {return _baseAccount ?? Cosmos_Auth_V1beta1_BaseAccount()}
    set {_baseAccount = newValue}
  }
  /// Returns true if `baseAccount` has been explicitly set.
  var hasBaseAccount: Bool {return self._baseAccount != nil}
  /// Clears the value of `baseAccount`. Subsequent reads from it will return its default value.
  mutating func clearBaseAccount() {self._baseAccount = nil}

  /// code_hash is the hash calculated from the code contents
  var codeHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _baseAccount: Cosmos_Auth_V1beta1_BaseAccount? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Eth_Types_V1_EthAccount: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "eth.types.v1"

extension Eth_Types_V1_EthAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EthAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "base_account"),
    2: .standard(proto: "code_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._baseAccount) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.codeHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._baseAccount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.codeHash.isEmpty {
      try visitor.visitSingularStringField(value: self.codeHash, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Eth_Types_V1_EthAccount, rhs: Eth_Types_V1_EthAccount) -> Bool {
    if lhs._baseAccount != rhs._baseAccount {return false}
    if lhs.codeHash != rhs.codeHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
