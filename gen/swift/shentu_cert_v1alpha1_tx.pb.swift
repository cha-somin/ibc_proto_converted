// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/cert/v1alpha1/tx.proto
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

/// MsgProposeCertifier is the message for proposing new certifier.
struct Shentu_Cert_V1alpha1_MsgProposeCertifier {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposer: String = String()

  var alias: String = String()

  var certifier: String = String()

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_MsgProposeCertifierResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCertifyGeneral is the message for issuing a general certificate.
struct Shentu_Cert_V1alpha1_MsgIssueCertificate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: SwiftProtobuf.Google_Protobuf_Any {
    get {return _content ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_content = newValue}
  }
  /// Returns true if `content` has been explicitly set.
  var hasContent: Bool {return self._content != nil}
  /// Clears the value of `content`. Subsequent reads from it will return its default value.
  mutating func clearContent() {self._content = nil}

  var compiler: String = String()

  var bytecodeHash: String = String()

  var description_p: String = String()

  var certifier: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _content: SwiftProtobuf.Google_Protobuf_Any? = nil
}

struct Shentu_Cert_V1alpha1_MsgIssueCertificateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRevokeCertificate returns a certificate revoking operation.
struct Shentu_Cert_V1alpha1_MsgRevokeCertificate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var revoker: String = String()

  var id: UInt64 = 0

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_MsgRevokeCertificateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCertifyPlatform is the message for certifying a validator's host platform.
struct Shentu_Cert_V1alpha1_MsgCertifyPlatform {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var certifier: String = String()

  var validatorPubkey: SwiftProtobuf.Google_Protobuf_Any {
    get {return _validatorPubkey ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_validatorPubkey = newValue}
  }
  /// Returns true if `validatorPubkey` has been explicitly set.
  var hasValidatorPubkey: Bool {return self._validatorPubkey != nil}
  /// Clears the value of `validatorPubkey`. Subsequent reads from it will return its default value.
  mutating func clearValidatorPubkey() {self._validatorPubkey = nil}

  var platform: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _validatorPubkey: SwiftProtobuf.Google_Protobuf_Any? = nil
}

struct Shentu_Cert_V1alpha1_MsgCertifyPlatformResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Shentu_Cert_V1alpha1_MsgProposeCertifier: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgProposeCertifierResponse: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgIssueCertificate: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgIssueCertificateResponse: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgRevokeCertificate: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgRevokeCertificateResponse: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgCertifyPlatform: @unchecked Sendable {}
extension Shentu_Cert_V1alpha1_MsgCertifyPlatformResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.cert.v1alpha1"

extension Shentu_Cert_V1alpha1_MsgProposeCertifier: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgProposeCertifier"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "proposer"),
    2: .same(proto: "alias"),
    3: .same(proto: "certifier"),
    4: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.alias) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.certifier) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 1)
    }
    if !self.alias.isEmpty {
      try visitor.visitSingularStringField(value: self.alias, fieldNumber: 2)
    }
    if !self.certifier.isEmpty {
      try visitor.visitSingularStringField(value: self.certifier, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgProposeCertifier, rhs: Shentu_Cert_V1alpha1_MsgProposeCertifier) -> Bool {
    if lhs.proposer != rhs.proposer {return false}
    if lhs.alias != rhs.alias {return false}
    if lhs.certifier != rhs.certifier {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgProposeCertifierResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgProposeCertifierResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgProposeCertifierResponse, rhs: Shentu_Cert_V1alpha1_MsgProposeCertifierResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgIssueCertificate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssueCertificate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
    2: .same(proto: "compiler"),
    3: .standard(proto: "bytecode_hash"),
    4: .same(proto: "description"),
    5: .same(proto: "certifier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._content) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.compiler) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bytecodeHash) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.certifier) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._content {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.compiler.isEmpty {
      try visitor.visitSingularStringField(value: self.compiler, fieldNumber: 2)
    }
    if !self.bytecodeHash.isEmpty {
      try visitor.visitSingularStringField(value: self.bytecodeHash, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.certifier.isEmpty {
      try visitor.visitSingularStringField(value: self.certifier, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgIssueCertificate, rhs: Shentu_Cert_V1alpha1_MsgIssueCertificate) -> Bool {
    if lhs._content != rhs._content {return false}
    if lhs.compiler != rhs.compiler {return false}
    if lhs.bytecodeHash != rhs.bytecodeHash {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.certifier != rhs.certifier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgIssueCertificateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssueCertificateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgIssueCertificateResponse, rhs: Shentu_Cert_V1alpha1_MsgIssueCertificateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgRevokeCertificate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRevokeCertificate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "revoker"),
    2: .same(proto: "id"),
    3: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.revoker) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.revoker.isEmpty {
      try visitor.visitSingularStringField(value: self.revoker, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgRevokeCertificate, rhs: Shentu_Cert_V1alpha1_MsgRevokeCertificate) -> Bool {
    if lhs.revoker != rhs.revoker {return false}
    if lhs.id != rhs.id {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgRevokeCertificateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRevokeCertificateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgRevokeCertificateResponse, rhs: Shentu_Cert_V1alpha1_MsgRevokeCertificateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgCertifyPlatform: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCertifyPlatform"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "certifier"),
    2: .standard(proto: "validator_pubkey"),
    3: .same(proto: "platform"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.certifier) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._validatorPubkey) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.platform) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.certifier.isEmpty {
      try visitor.visitSingularStringField(value: self.certifier, fieldNumber: 1)
    }
    try { if let v = self._validatorPubkey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.platform.isEmpty {
      try visitor.visitSingularStringField(value: self.platform, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgCertifyPlatform, rhs: Shentu_Cert_V1alpha1_MsgCertifyPlatform) -> Bool {
    if lhs.certifier != rhs.certifier {return false}
    if lhs._validatorPubkey != rhs._validatorPubkey {return false}
    if lhs.platform != rhs.platform {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_MsgCertifyPlatformResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCertifyPlatformResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_MsgCertifyPlatformResponse, rhs: Shentu_Cert_V1alpha1_MsgCertifyPlatformResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
