// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: assetmantle/documents/base/document.proto
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

struct Assetmantle_Schema_Documents_Base_Document {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var classificationID: Assetmantle_Schema_Ids_Base_ClassificationID {
    get {return _classificationID ?? Assetmantle_Schema_Ids_Base_ClassificationID()}
    set {_classificationID = newValue}
  }
  /// Returns true if `classificationID` has been explicitly set.
  var hasClassificationID: Bool {return self._classificationID != nil}
  /// Clears the value of `classificationID`. Subsequent reads from it will return its default value.
  mutating func clearClassificationID() {self._classificationID = nil}

  var immutables: Assetmantle_Schema_Qualified_Base_Immutables {
    get {return _immutables ?? Assetmantle_Schema_Qualified_Base_Immutables()}
    set {_immutables = newValue}
  }
  /// Returns true if `immutables` has been explicitly set.
  var hasImmutables: Bool {return self._immutables != nil}
  /// Clears the value of `immutables`. Subsequent reads from it will return its default value.
  mutating func clearImmutables() {self._immutables = nil}

  var mutables: Assetmantle_Schema_Qualified_Base_Mutables {
    get {return _mutables ?? Assetmantle_Schema_Qualified_Base_Mutables()}
    set {_mutables = newValue}
  }
  /// Returns true if `mutables` has been explicitly set.
  var hasMutables: Bool {return self._mutables != nil}
  /// Clears the value of `mutables`. Subsequent reads from it will return its default value.
  mutating func clearMutables() {self._mutables = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _classificationID: Assetmantle_Schema_Ids_Base_ClassificationID? = nil
  fileprivate var _immutables: Assetmantle_Schema_Qualified_Base_Immutables? = nil
  fileprivate var _mutables: Assetmantle_Schema_Qualified_Base_Mutables? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Assetmantle_Schema_Documents_Base_Document: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "assetmantle.schema.documents.base"

extension Assetmantle_Schema_Documents_Base_Document: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Document"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "classification_i_d"),
    2: .same(proto: "immutables"),
    3: .same(proto: "mutables"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._classificationID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._immutables) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._mutables) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._classificationID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._immutables {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._mutables {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Assetmantle_Schema_Documents_Base_Document, rhs: Assetmantle_Schema_Documents_Base_Document) -> Bool {
    if lhs._classificationID != rhs._classificationID {return false}
    if lhs._immutables != rhs._immutables {return false}
    if lhs._mutables != rhs._mutables {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}