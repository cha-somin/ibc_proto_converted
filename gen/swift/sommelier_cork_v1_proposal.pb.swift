// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sommelier/cork/v1/proposal.proto
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

struct Cork_V1_AddManagedCellarIDsProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var cellarIds: Cork_V1_CellarIDSet {
    get {return _cellarIds ?? Cork_V1_CellarIDSet()}
    set {_cellarIds = newValue}
  }
  /// Returns true if `cellarIds` has been explicitly set.
  var hasCellarIds: Bool {return self._cellarIds != nil}
  /// Clears the value of `cellarIds`. Subsequent reads from it will return its default value.
  mutating func clearCellarIds() {self._cellarIds = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cellarIds: Cork_V1_CellarIDSet? = nil
}

/// AddManagedCellarIDsProposalWithDeposit is a specific definition for CLI commands
struct Cork_V1_AddManagedCellarIDsProposalWithDeposit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var cellarIds: [String] = []

  var deposit: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Cork_V1_RemoveManagedCellarIDsProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var cellarIds: Cork_V1_CellarIDSet {
    get {return _cellarIds ?? Cork_V1_CellarIDSet()}
    set {_cellarIds = newValue}
  }
  /// Returns true if `cellarIds` has been explicitly set.
  var hasCellarIds: Bool {return self._cellarIds != nil}
  /// Clears the value of `cellarIds`. Subsequent reads from it will return its default value.
  mutating func clearCellarIds() {self._cellarIds = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cellarIds: Cork_V1_CellarIDSet? = nil
}

/// RemoveManagedCellarIDsProposalWithDeposit is a specific definition for CLI commands
struct Cork_V1_RemoveManagedCellarIDsProposalWithDeposit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var cellarIds: [String] = []

  var deposit: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cork_V1_AddManagedCellarIDsProposal: @unchecked Sendable {}
extension Cork_V1_AddManagedCellarIDsProposalWithDeposit: @unchecked Sendable {}
extension Cork_V1_RemoveManagedCellarIDsProposal: @unchecked Sendable {}
extension Cork_V1_RemoveManagedCellarIDsProposalWithDeposit: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cork.v1"

extension Cork_V1_AddManagedCellarIDsProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AddManagedCellarIDsProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "cellar_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._cellarIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try { if let v = self._cellarIds {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V1_AddManagedCellarIDsProposal, rhs: Cork_V1_AddManagedCellarIDsProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._cellarIds != rhs._cellarIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cork_V1_AddManagedCellarIDsProposalWithDeposit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AddManagedCellarIDsProposalWithDeposit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "cellar_ids"),
    4: .same(proto: "deposit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.cellarIds) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.deposit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.cellarIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.cellarIds, fieldNumber: 3)
    }
    if !self.deposit.isEmpty {
      try visitor.visitSingularStringField(value: self.deposit, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V1_AddManagedCellarIDsProposalWithDeposit, rhs: Cork_V1_AddManagedCellarIDsProposalWithDeposit) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.cellarIds != rhs.cellarIds {return false}
    if lhs.deposit != rhs.deposit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cork_V1_RemoveManagedCellarIDsProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RemoveManagedCellarIDsProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "cellar_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._cellarIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try { if let v = self._cellarIds {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V1_RemoveManagedCellarIDsProposal, rhs: Cork_V1_RemoveManagedCellarIDsProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._cellarIds != rhs._cellarIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cork_V1_RemoveManagedCellarIDsProposalWithDeposit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RemoveManagedCellarIDsProposalWithDeposit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "cellar_ids"),
    4: .same(proto: "deposit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.cellarIds) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.deposit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.cellarIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.cellarIds, fieldNumber: 3)
    }
    if !self.deposit.isEmpty {
      try visitor.visitSingularStringField(value: self.deposit, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V1_RemoveManagedCellarIDsProposalWithDeposit, rhs: Cork_V1_RemoveManagedCellarIDsProposalWithDeposit) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.cellarIds != rhs.cellarIds {return false}
    if lhs.deposit != rhs.deposit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
