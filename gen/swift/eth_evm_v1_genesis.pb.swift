// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: eth/evm/v1/genesis.proto
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

/// GenesisState defines the evm module's genesis state.
struct Eth_Evm_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// accounts is an array containing the ethereum genesis accounts.
  var accounts: [Eth_Evm_V1_GenesisAccount] = []

  /// params defines all the parameters of the module.
  var params: Eth_Evm_V1_Params {
    get {return _params ?? Eth_Evm_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// Fungible token mappings corresponding to ERC-20 smart contract tokens.
  var funtokenMappings: [Eth_Evm_V1_FunToken] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Eth_Evm_V1_Params? = nil
}

/// GenesisAccount defines an account to be initialized in the genesis state.
/// Its main difference between with Geth's GenesisAccount is that it uses a
/// custom storage type and that it doesn't contain the private key field.
struct Eth_Evm_V1_GenesisAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address defines an ethereum hex formated address of an account
  var address: String = String()

  /// code defines the hex bytes of the account code.
  var code: String = String()

  /// storage defines the set of state key values for the account.
  var storage: [Eth_Evm_V1_State] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Eth_Evm_V1_GenesisState: @unchecked Sendable {}
extension Eth_Evm_V1_GenesisAccount: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "eth.evm.v1"

extension Eth_Evm_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "accounts"),
    2: .same(proto: "params"),
    3: .standard(proto: "funtoken_mappings"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.accounts) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.funtokenMappings) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.accounts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.accounts, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.funtokenMappings.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.funtokenMappings, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Eth_Evm_V1_GenesisState, rhs: Eth_Evm_V1_GenesisState) -> Bool {
    if lhs.accounts != rhs.accounts {return false}
    if lhs._params != rhs._params {return false}
    if lhs.funtokenMappings != rhs.funtokenMappings {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Eth_Evm_V1_GenesisAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "code"),
    3: .same(proto: "storage"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.code) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.storage) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.code.isEmpty {
      try visitor.visitSingularStringField(value: self.code, fieldNumber: 2)
    }
    if !self.storage.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.storage, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Eth_Evm_V1_GenesisAccount, rhs: Eth_Evm_V1_GenesisAccount) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.code != rhs.code {return false}
    if lhs.storage != rhs.storage {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
