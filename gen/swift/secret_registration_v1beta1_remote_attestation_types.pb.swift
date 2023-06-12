// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: secret/registration/v1beta1/remote_attestation/types.proto
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

struct Secret_Registration_RemoteAttestation_V1beta1_QuoteReport {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var timestamp: String = String()

  var version: UInt64 = 0

  var isvEnclaveQuoteStatus: String = String()

  var platformInfoBlob: String = String()

  var isvEnclaveQuoteBody: String = String()

  var advisoryIds: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var mrEnclave: String = String()

  var mrSigner: String = String()

  var reportData: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Secret_Registration_RemoteAttestation_V1beta1_QuoteReportData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var version: UInt64 = 0

  var signType: UInt64 = 0

  var reportBody: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody {
    get {return _reportBody ?? Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody()}
    set {_reportBody = newValue}
  }
  /// Returns true if `reportBody` has been explicitly set.
  var hasReportBody: Bool {return self._reportBody != nil}
  /// Clears the value of `reportBody`. Subsequent reads from it will return its default value.
  mutating func clearReportBody() {self._reportBody = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _reportBody: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody? = nil
}

struct Secret_Registration_RemoteAttestation_V1beta1_EndorsedAttestationReport {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var report: Data = Data()

  var signature: Data = Data()

  var signingCert: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var gx: String = String()

  var gy: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Secret_Registration_RemoteAttestation_V1beta1_PlatformInfoBlob {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sgxEpidGroupFlags: UInt32 = 0

  var sgxTcbEvaluationFlags: UInt32 = 0

  var pseEvaluationFlags: UInt32 = 0

  var latestEquivalentTcbPsvn: String = String()

  var latestPseIsvsvn: String = String()

  var latestPsdaSvn: String = String()

  var xeid: UInt32 = 0

  var gid: UInt32 = 0

  var sgxEc256SignatureT: Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature {
    get {return _sgxEc256SignatureT ?? Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature()}
    set {_sgxEc256SignatureT = newValue}
  }
  /// Returns true if `sgxEc256SignatureT` has been explicitly set.
  var hasSgxEc256SignatureT: Bool {return self._sgxEc256SignatureT != nil}
  /// Clears the value of `sgxEc256SignatureT`. Subsequent reads from it will return its default value.
  mutating func clearSgxEc256SignatureT() {self._sgxEc256SignatureT = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _sgxEc256SignatureT: Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReport: @unchecked Sendable {}
extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody: @unchecked Sendable {}
extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReportData: @unchecked Sendable {}
extension Secret_Registration_RemoteAttestation_V1beta1_EndorsedAttestationReport: @unchecked Sendable {}
extension Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature: @unchecked Sendable {}
extension Secret_Registration_RemoteAttestation_V1beta1_PlatformInfoBlob: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "secret.registration.remote_attestation.v1beta1"

extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReport: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuoteReport"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "timestamp"),
    3: .same(proto: "version"),
    4: .standard(proto: "isv_enclave_quote_status"),
    5: .standard(proto: "platform_info_blob"),
    6: .standard(proto: "isv_enclave_quote_body"),
    7: .standard(proto: "advisory_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.timestamp) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.isvEnclaveQuoteStatus) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.platformInfoBlob) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.isvEnclaveQuoteBody) }()
      case 7: try { try decoder.decodeRepeatedStringField(value: &self.advisoryIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.timestamp.isEmpty {
      try visitor.visitSingularStringField(value: self.timestamp, fieldNumber: 2)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 3)
    }
    if !self.isvEnclaveQuoteStatus.isEmpty {
      try visitor.visitSingularStringField(value: self.isvEnclaveQuoteStatus, fieldNumber: 4)
    }
    if !self.platformInfoBlob.isEmpty {
      try visitor.visitSingularStringField(value: self.platformInfoBlob, fieldNumber: 5)
    }
    if !self.isvEnclaveQuoteBody.isEmpty {
      try visitor.visitSingularStringField(value: self.isvEnclaveQuoteBody, fieldNumber: 6)
    }
    if !self.advisoryIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.advisoryIds, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReport, rhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReport) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.version != rhs.version {return false}
    if lhs.isvEnclaveQuoteStatus != rhs.isvEnclaveQuoteStatus {return false}
    if lhs.platformInfoBlob != rhs.platformInfoBlob {return false}
    if lhs.isvEnclaveQuoteBody != rhs.isvEnclaveQuoteBody {return false}
    if lhs.advisoryIds != rhs.advisoryIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuoteReportBody"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "mr_enclave"),
    2: .standard(proto: "mr_signer"),
    3: .standard(proto: "report_data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.mrEnclave) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.mrSigner) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.reportData) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.mrEnclave.isEmpty {
      try visitor.visitSingularStringField(value: self.mrEnclave, fieldNumber: 1)
    }
    if !self.mrSigner.isEmpty {
      try visitor.visitSingularStringField(value: self.mrSigner, fieldNumber: 2)
    }
    if !self.reportData.isEmpty {
      try visitor.visitSingularStringField(value: self.reportData, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody, rhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportBody) -> Bool {
    if lhs.mrEnclave != rhs.mrEnclave {return false}
    if lhs.mrSigner != rhs.mrSigner {return false}
    if lhs.reportData != rhs.reportData {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Secret_Registration_RemoteAttestation_V1beta1_QuoteReportData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuoteReportData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "version"),
    2: .standard(proto: "sign_type"),
    3: .standard(proto: "report_body"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.version) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.signType) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._reportBody) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.version != 0 {
      try visitor.visitSingularUInt64Field(value: self.version, fieldNumber: 1)
    }
    if self.signType != 0 {
      try visitor.visitSingularUInt64Field(value: self.signType, fieldNumber: 2)
    }
    try { if let v = self._reportBody {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportData, rhs: Secret_Registration_RemoteAttestation_V1beta1_QuoteReportData) -> Bool {
    if lhs.version != rhs.version {return false}
    if lhs.signType != rhs.signType {return false}
    if lhs._reportBody != rhs._reportBody {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Secret_Registration_RemoteAttestation_V1beta1_EndorsedAttestationReport: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EndorsedAttestationReport"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "report"),
    2: .same(proto: "signature"),
    3: .standard(proto: "signing_cert"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.report) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.signature) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.signingCert) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.report.isEmpty {
      try visitor.visitSingularBytesField(value: self.report, fieldNumber: 1)
    }
    if !self.signature.isEmpty {
      try visitor.visitSingularBytesField(value: self.signature, fieldNumber: 2)
    }
    if !self.signingCert.isEmpty {
      try visitor.visitSingularBytesField(value: self.signingCert, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_EndorsedAttestationReport, rhs: Secret_Registration_RemoteAttestation_V1beta1_EndorsedAttestationReport) -> Bool {
    if lhs.report != rhs.report {return false}
    if lhs.signature != rhs.signature {return false}
    if lhs.signingCert != rhs.signingCert {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SGXEC256Signature"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "gx"),
    2: .same(proto: "gy"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.gx) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.gy) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.gx.isEmpty {
      try visitor.visitSingularStringField(value: self.gx, fieldNumber: 1)
    }
    if !self.gy.isEmpty {
      try visitor.visitSingularStringField(value: self.gy, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature, rhs: Secret_Registration_RemoteAttestation_V1beta1_SGXEC256Signature) -> Bool {
    if lhs.gx != rhs.gx {return false}
    if lhs.gy != rhs.gy {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Secret_Registration_RemoteAttestation_V1beta1_PlatformInfoBlob: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PlatformInfoBlob"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "sgx_epid_group_flags"),
    2: .standard(proto: "sgx_tcb_evaluation_flags"),
    3: .standard(proto: "pse_evaluation_flags"),
    4: .standard(proto: "latest_equivalent_tcb_psvn"),
    5: .standard(proto: "latest_pse_isvsvn"),
    6: .standard(proto: "latest_psda_svn"),
    7: .same(proto: "xeid"),
    8: .same(proto: "gid"),
    9: .standard(proto: "sgx_ec256_signature_t"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.sgxEpidGroupFlags) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.sgxTcbEvaluationFlags) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.pseEvaluationFlags) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.latestEquivalentTcbPsvn) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.latestPseIsvsvn) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.latestPsdaSvn) }()
      case 7: try { try decoder.decodeSingularUInt32Field(value: &self.xeid) }()
      case 8: try { try decoder.decodeSingularUInt32Field(value: &self.gid) }()
      case 9: try { try decoder.decodeSingularMessageField(value: &self._sgxEc256SignatureT) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.sgxEpidGroupFlags != 0 {
      try visitor.visitSingularUInt32Field(value: self.sgxEpidGroupFlags, fieldNumber: 1)
    }
    if self.sgxTcbEvaluationFlags != 0 {
      try visitor.visitSingularUInt32Field(value: self.sgxTcbEvaluationFlags, fieldNumber: 2)
    }
    if self.pseEvaluationFlags != 0 {
      try visitor.visitSingularUInt32Field(value: self.pseEvaluationFlags, fieldNumber: 3)
    }
    if !self.latestEquivalentTcbPsvn.isEmpty {
      try visitor.visitSingularStringField(value: self.latestEquivalentTcbPsvn, fieldNumber: 4)
    }
    if !self.latestPseIsvsvn.isEmpty {
      try visitor.visitSingularStringField(value: self.latestPseIsvsvn, fieldNumber: 5)
    }
    if !self.latestPsdaSvn.isEmpty {
      try visitor.visitSingularStringField(value: self.latestPsdaSvn, fieldNumber: 6)
    }
    if self.xeid != 0 {
      try visitor.visitSingularUInt32Field(value: self.xeid, fieldNumber: 7)
    }
    if self.gid != 0 {
      try visitor.visitSingularUInt32Field(value: self.gid, fieldNumber: 8)
    }
    try { if let v = self._sgxEc256SignatureT {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Secret_Registration_RemoteAttestation_V1beta1_PlatformInfoBlob, rhs: Secret_Registration_RemoteAttestation_V1beta1_PlatformInfoBlob) -> Bool {
    if lhs.sgxEpidGroupFlags != rhs.sgxEpidGroupFlags {return false}
    if lhs.sgxTcbEvaluationFlags != rhs.sgxTcbEvaluationFlags {return false}
    if lhs.pseEvaluationFlags != rhs.pseEvaluationFlags {return false}
    if lhs.latestEquivalentTcbPsvn != rhs.latestEquivalentTcbPsvn {return false}
    if lhs.latestPseIsvsvn != rhs.latestPseIsvsvn {return false}
    if lhs.latestPsdaSvn != rhs.latestPsdaSvn {return false}
    if lhs.xeid != rhs.xeid {return false}
    if lhs.gid != rhs.gid {return false}
    if lhs._sgxEc256SignatureT != rhs._sgxEc256SignatureT {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
