// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/cvm/v1alpha1/genesis.proto
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

/// GenesisState defines the gov module's genesis state.
struct Shentu_Cvm_V1alpha1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var gasRate: UInt64 = 0

  var contracts: [Shentu_Cvm_V1alpha1_Contract] = []

  var metadatas: [Shentu_Cvm_V1alpha1_Metadata] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cvm_V1alpha1_Contract {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: Data = Data()

  var code: Shentu_Cvm_V1alpha1_CVMCode {
    get {return _code ?? Shentu_Cvm_V1alpha1_CVMCode()}
    set {_code = newValue}
  }
  /// Returns true if `code` has been explicitly set.
  var hasCode: Bool {return self._code != nil}
  /// Clears the value of `code`. Subsequent reads from it will return its default value.
  mutating func clearCode() {self._code = nil}

  var storage: [Shentu_Cvm_V1alpha1_Storage] = []

  var abi: Data = Data()

  var meta: [Shentu_Cvm_V1alpha1_ContractMeta] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _code: Shentu_Cvm_V1alpha1_CVMCode? = nil
}

struct Shentu_Cvm_V1alpha1_CVMCode {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var codeType: Int64 = 0

  var code: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cvm_V1alpha1_Storage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: Data = Data()

  var value: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cvm_V1alpha1_ContractMeta {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var codeHash: Data = Data()

  var metadataHash: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cvm_V1alpha1_ContractMetas {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var metas: [Acm_ContractMeta] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cvm_V1alpha1_Metadata {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var hash: Data = Data()

  var metadata: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Shentu_Cvm_V1alpha1_GenesisState: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_Contract: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_CVMCode: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_Storage: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_ContractMeta: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_ContractMetas: @unchecked Sendable {}
extension Shentu_Cvm_V1alpha1_Metadata: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.cvm.v1alpha1"

extension Shentu_Cvm_V1alpha1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "gas_rate"),
    2: .same(proto: "contracts"),
    3: .same(proto: "metadatas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.gasRate) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.contracts) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.metadatas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.gasRate != 0 {
      try visitor.visitSingularUInt64Field(value: self.gasRate, fieldNumber: 1)
    }
    if !self.contracts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contracts, fieldNumber: 2)
    }
    if !self.metadatas.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.metadatas, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_GenesisState, rhs: Shentu_Cvm_V1alpha1_GenesisState) -> Bool {
    if lhs.gasRate != rhs.gasRate {return false}
    if lhs.contracts != rhs.contracts {return false}
    if lhs.metadatas != rhs.metadatas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_Contract: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Contract"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Address"),
    2: .same(proto: "code"),
    3: .same(proto: "storage"),
    4: .same(proto: "abi"),
    5: .same(proto: "meta"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._code) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.storage) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.abi) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.meta) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.address.isEmpty {
      try visitor.visitSingularBytesField(value: self.address, fieldNumber: 1)
    }
    try { if let v = self._code {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.storage.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.storage, fieldNumber: 3)
    }
    if !self.abi.isEmpty {
      try visitor.visitSingularBytesField(value: self.abi, fieldNumber: 4)
    }
    if !self.meta.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.meta, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_Contract, rhs: Shentu_Cvm_V1alpha1_Contract) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs._code != rhs._code {return false}
    if lhs.storage != rhs.storage {return false}
    if lhs.abi != rhs.abi {return false}
    if lhs.meta != rhs.meta {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_CVMCode: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CVMCode"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "code_type"),
    2: .same(proto: "code"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.codeType) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.code) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.codeType != 0 {
      try visitor.visitSingularInt64Field(value: self.codeType, fieldNumber: 1)
    }
    if !self.code.isEmpty {
      try visitor.visitSingularBytesField(value: self.code, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_CVMCode, rhs: Shentu_Cvm_V1alpha1_CVMCode) -> Bool {
    if lhs.codeType != rhs.codeType {return false}
    if lhs.code != rhs.code {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_Storage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Storage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_Storage, rhs: Shentu_Cvm_V1alpha1_Storage) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_ContractMeta: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractMeta"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "code_hash"),
    2: .standard(proto: "metadata_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.codeHash) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.metadataHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.codeHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.codeHash, fieldNumber: 1)
    }
    if !self.metadataHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.metadataHash, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_ContractMeta, rhs: Shentu_Cvm_V1alpha1_ContractMeta) -> Bool {
    if lhs.codeHash != rhs.codeHash {return false}
    if lhs.metadataHash != rhs.metadataHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_ContractMetas: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractMetas"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "metas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.metas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.metas.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.metas, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_ContractMetas, rhs: Shentu_Cvm_V1alpha1_ContractMetas) -> Bool {
    if lhs.metas != rhs.metas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cvm_V1alpha1_Metadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Metadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "hash"),
    2: .same(proto: "metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.metadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 1)
    }
    if !self.metadata.isEmpty {
      try visitor.visitSingularStringField(value: self.metadata, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cvm_V1alpha1_Metadata, rhs: Shentu_Cvm_V1alpha1_Metadata) -> Bool {
    if lhs.hash != rhs.hash {return false}
    if lhs.metadata != rhs.metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
