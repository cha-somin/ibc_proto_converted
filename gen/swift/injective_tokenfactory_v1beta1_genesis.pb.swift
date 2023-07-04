// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: injective/tokenfactory/v1beta1/genesis.proto
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

/// GenesisState defines the tokenfactory module's genesis state.
struct Injective_Tokenfactory_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines the parameters of the module.
  var params: Injective_Tokenfactory_V1beta1_Params {
    get {return _params ?? Injective_Tokenfactory_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var factoryDenoms: [Injective_Tokenfactory_V1beta1_GenesisDenom] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Injective_Tokenfactory_V1beta1_Params? = nil
}

/// GenesisDenom defines a tokenfactory denom that is defined within genesis
/// state. The structure contains DenomAuthorityMetadata which defines the
/// denom's admin.
struct Injective_Tokenfactory_V1beta1_GenesisDenom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var authorityMetadata: Injective_Tokenfactory_V1beta1_DenomAuthorityMetadata {
    get {return _authorityMetadata ?? Injective_Tokenfactory_V1beta1_DenomAuthorityMetadata()}
    set {_authorityMetadata = newValue}
  }
  /// Returns true if `authorityMetadata` has been explicitly set.
  var hasAuthorityMetadata: Bool {return self._authorityMetadata != nil}
  /// Clears the value of `authorityMetadata`. Subsequent reads from it will return its default value.
  mutating func clearAuthorityMetadata() {self._authorityMetadata = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _authorityMetadata: Injective_Tokenfactory_V1beta1_DenomAuthorityMetadata? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Injective_Tokenfactory_V1beta1_GenesisState: @unchecked Sendable {}
extension Injective_Tokenfactory_V1beta1_GenesisDenom: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "injective.tokenfactory.v1beta1"

extension Injective_Tokenfactory_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "factory_denoms"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.factoryDenoms) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.factoryDenoms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.factoryDenoms, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Tokenfactory_V1beta1_GenesisState, rhs: Injective_Tokenfactory_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.factoryDenoms != rhs.factoryDenoms {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Tokenfactory_V1beta1_GenesisDenom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisDenom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "authority_metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._authorityMetadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    try { if let v = self._authorityMetadata {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Tokenfactory_V1beta1_GenesisDenom, rhs: Injective_Tokenfactory_V1beta1_GenesisDenom) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs._authorityMetadata != rhs._authorityMetadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}