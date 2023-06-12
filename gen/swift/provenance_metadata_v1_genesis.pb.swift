// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: provenance/metadata/v1/genesis.proto
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

/// GenesisState defines the account module's genesis state.
struct Provenance_Metadata_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the parameters of the module.
  var params: Provenance_Metadata_V1_Params {
    get {return _params ?? Provenance_Metadata_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// A collection of metadata scopes and specs to create on start
  var scopes: [Provenance_Metadata_V1_Scope] = []

  var sessions: [Provenance_Metadata_V1_Session] = []

  var records: [Provenance_Metadata_V1_Record] = []

  var scopeSpecifications: [Provenance_Metadata_V1_ScopeSpecification] = []

  var contractSpecifications: [Provenance_Metadata_V1_ContractSpecification] = []

  var recordSpecifications: [Provenance_Metadata_V1_RecordSpecification] = []

  var oSLocatorParams: Provenance_Metadata_V1_OSLocatorParams {
    get {return _oSLocatorParams ?? Provenance_Metadata_V1_OSLocatorParams()}
    set {_oSLocatorParams = newValue}
  }
  /// Returns true if `oSLocatorParams` has been explicitly set.
  var hasOSLocatorParams: Bool {return self._oSLocatorParams != nil}
  /// Clears the value of `oSLocatorParams`. Subsequent reads from it will return its default value.
  mutating func clearOSLocatorParams() {self._oSLocatorParams = nil}

  var objectStoreLocators: [Provenance_Metadata_V1_ObjectStoreLocator] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Provenance_Metadata_V1_Params? = nil
  fileprivate var _oSLocatorParams: Provenance_Metadata_V1_OSLocatorParams? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Provenance_Metadata_V1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "provenance.metadata.v1"

extension Provenance_Metadata_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "scopes"),
    3: .same(proto: "sessions"),
    4: .same(proto: "records"),
    5: .standard(proto: "scope_specifications"),
    6: .standard(proto: "contract_specifications"),
    7: .standard(proto: "record_specifications"),
    8: .standard(proto: "o_s_locator_params"),
    9: .standard(proto: "object_store_locators"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.scopes) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.sessions) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.records) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.scopeSpecifications) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.contractSpecifications) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.recordSpecifications) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._oSLocatorParams) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.objectStoreLocators) }()
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
    if !self.scopes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.scopes, fieldNumber: 2)
    }
    if !self.sessions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.sessions, fieldNumber: 3)
    }
    if !self.records.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.records, fieldNumber: 4)
    }
    if !self.scopeSpecifications.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.scopeSpecifications, fieldNumber: 5)
    }
    if !self.contractSpecifications.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contractSpecifications, fieldNumber: 6)
    }
    if !self.recordSpecifications.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.recordSpecifications, fieldNumber: 7)
    }
    try { if let v = self._oSLocatorParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    if !self.objectStoreLocators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.objectStoreLocators, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_GenesisState, rhs: Provenance_Metadata_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.scopes != rhs.scopes {return false}
    if lhs.sessions != rhs.sessions {return false}
    if lhs.records != rhs.records {return false}
    if lhs.scopeSpecifications != rhs.scopeSpecifications {return false}
    if lhs.contractSpecifications != rhs.contractSpecifications {return false}
    if lhs.recordSpecifications != rhs.recordSpecifications {return false}
    if lhs._oSLocatorParams != rhs._oSLocatorParams {return false}
    if lhs.objectStoreLocators != rhs.objectStoreLocators {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
