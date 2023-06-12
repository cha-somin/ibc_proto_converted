// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: assetmantle/identities/transactions/issue/message.proto
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

struct Assetmantle_Modules_Identities_Transactions_Issue_Message {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var from: String = String()

  var fromID: Assetmantle_Schema_Ids_Base_IdentityID {
    get {return _fromID ?? Assetmantle_Schema_Ids_Base_IdentityID()}
    set {_fromID = newValue}
  }
  /// Returns true if `fromID` has been explicitly set.
  var hasFromID: Bool {return self._fromID != nil}
  /// Clears the value of `fromID`. Subsequent reads from it will return its default value.
  mutating func clearFromID() {self._fromID = nil}

  var to: String = String()

  var classificationID: Assetmantle_Schema_Ids_Base_ClassificationID {
    get {return _classificationID ?? Assetmantle_Schema_Ids_Base_ClassificationID()}
    set {_classificationID = newValue}
  }
  /// Returns true if `classificationID` has been explicitly set.
  var hasClassificationID: Bool {return self._classificationID != nil}
  /// Clears the value of `classificationID`. Subsequent reads from it will return its default value.
  mutating func clearClassificationID() {self._classificationID = nil}

  var immutableMetaProperties: Assetmantle_Schema_Lists_Base_PropertyList {
    get {return _immutableMetaProperties ?? Assetmantle_Schema_Lists_Base_PropertyList()}
    set {_immutableMetaProperties = newValue}
  }
  /// Returns true if `immutableMetaProperties` has been explicitly set.
  var hasImmutableMetaProperties: Bool {return self._immutableMetaProperties != nil}
  /// Clears the value of `immutableMetaProperties`. Subsequent reads from it will return its default value.
  mutating func clearImmutableMetaProperties() {self._immutableMetaProperties = nil}

  var immutableProperties: Assetmantle_Schema_Lists_Base_PropertyList {
    get {return _immutableProperties ?? Assetmantle_Schema_Lists_Base_PropertyList()}
    set {_immutableProperties = newValue}
  }
  /// Returns true if `immutableProperties` has been explicitly set.
  var hasImmutableProperties: Bool {return self._immutableProperties != nil}
  /// Clears the value of `immutableProperties`. Subsequent reads from it will return its default value.
  mutating func clearImmutableProperties() {self._immutableProperties = nil}

  var mutableMetaProperties: Assetmantle_Schema_Lists_Base_PropertyList {
    get {return _mutableMetaProperties ?? Assetmantle_Schema_Lists_Base_PropertyList()}
    set {_mutableMetaProperties = newValue}
  }
  /// Returns true if `mutableMetaProperties` has been explicitly set.
  var hasMutableMetaProperties: Bool {return self._mutableMetaProperties != nil}
  /// Clears the value of `mutableMetaProperties`. Subsequent reads from it will return its default value.
  mutating func clearMutableMetaProperties() {self._mutableMetaProperties = nil}

  var mutableProperties: Assetmantle_Schema_Lists_Base_PropertyList {
    get {return _mutableProperties ?? Assetmantle_Schema_Lists_Base_PropertyList()}
    set {_mutableProperties = newValue}
  }
  /// Returns true if `mutableProperties` has been explicitly set.
  var hasMutableProperties: Bool {return self._mutableProperties != nil}
  /// Clears the value of `mutableProperties`. Subsequent reads from it will return its default value.
  mutating func clearMutableProperties() {self._mutableProperties = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fromID: Assetmantle_Schema_Ids_Base_IdentityID? = nil
  fileprivate var _classificationID: Assetmantle_Schema_Ids_Base_ClassificationID? = nil
  fileprivate var _immutableMetaProperties: Assetmantle_Schema_Lists_Base_PropertyList? = nil
  fileprivate var _immutableProperties: Assetmantle_Schema_Lists_Base_PropertyList? = nil
  fileprivate var _mutableMetaProperties: Assetmantle_Schema_Lists_Base_PropertyList? = nil
  fileprivate var _mutableProperties: Assetmantle_Schema_Lists_Base_PropertyList? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Assetmantle_Modules_Identities_Transactions_Issue_Message: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "assetmantle.modules.identities.transactions.issue"

extension Assetmantle_Modules_Identities_Transactions_Issue_Message: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Message"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "from"),
    2: .standard(proto: "from_i_d"),
    3: .same(proto: "to"),
    4: .standard(proto: "classification_i_d"),
    5: .standard(proto: "immutable_meta_properties"),
    6: .standard(proto: "immutable_properties"),
    7: .standard(proto: "mutable_meta_properties"),
    8: .standard(proto: "mutable_properties"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.from) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._fromID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.to) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._classificationID) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._immutableMetaProperties) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._immutableProperties) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._mutableMetaProperties) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._mutableProperties) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.from.isEmpty {
      try visitor.visitSingularStringField(value: self.from, fieldNumber: 1)
    }
    try { if let v = self._fromID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.to.isEmpty {
      try visitor.visitSingularStringField(value: self.to, fieldNumber: 3)
    }
    try { if let v = self._classificationID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._immutableMetaProperties {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._immutableProperties {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try { if let v = self._mutableMetaProperties {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try { if let v = self._mutableProperties {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Assetmantle_Modules_Identities_Transactions_Issue_Message, rhs: Assetmantle_Modules_Identities_Transactions_Issue_Message) -> Bool {
    if lhs.from != rhs.from {return false}
    if lhs._fromID != rhs._fromID {return false}
    if lhs.to != rhs.to {return false}
    if lhs._classificationID != rhs._classificationID {return false}
    if lhs._immutableMetaProperties != rhs._immutableMetaProperties {return false}
    if lhs._immutableProperties != rhs._immutableProperties {return false}
    if lhs._mutableMetaProperties != rhs._mutableMetaProperties {return false}
    if lhs._mutableProperties != rhs._mutableProperties {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
